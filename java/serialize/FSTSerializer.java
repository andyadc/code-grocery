package com.idea.cache.serialize;

import org.nustaq.serialization.FSTObjectInput;
import org.nustaq.serialization.FSTObjectOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * <pre>
 *     <fst.version>2.45</fst.version>
 * </pre>
 * @author andaicheng
 */
public class FSTSerializer implements Serializer {

    @Override
    public String getName() {
        return "fst";
    }

    @Override
    public byte[] serialize(Object o) throws IOException {
        ByteArrayOutputStream outputStream = null;
        FSTObjectOutput fout = null;
        try {
            outputStream = new ByteArrayOutputStream(512);
            fout = new FSTObjectOutput(outputStream);
            fout.writeObject(o);
            fout.flush();
            return outputStream.toByteArray();
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                //ignore this
            }
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws IOException {
        if (bytes == null || bytes.length == 0)
            return null;
        ByteArrayInputStream inputStream = null;
        FSTObjectInput fin = null;
        try {
            inputStream = new ByteArrayInputStream(bytes);
            fin = new FSTObjectInput(inputStream);
            return fin.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                //ignore this
            }
        }

    }
}
