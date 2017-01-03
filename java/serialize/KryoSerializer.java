package com.idea.cache.serialize;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * <pre>
 *     <kryo.version>3.0.3</kryo.version>
 * </pre>
 * @author andaicheng
 */
public class KryoSerializer implements Serializer {

    private final static Kryo KRYO = new Kryo();

    @Override
    public String getName() {
        return "kryo";
    }

    @Override
    public byte[] serialize(Object o) throws IOException {
        Output output = null;

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            output = new Output(outputStream);
            KRYO.writeClassAndObject(output, o);
            output.flush();
            return outputStream.toByteArray();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws IOException {
        if (bytes == null || bytes.length == 0)
            return null;

        Input input = null;
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            input = new Input(inputStream);
            return KRYO.readClassAndObject(input);
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
