package com.idea.cache.serialize;

import java.io.IOException;

/**
 * @author andaicheng
 */
public class JavaSerializer implements Serializer {

    @Override
    public String getName() {
        return "java";
    }

    @Override
    public byte[] serialize(Object o) throws IOException {
        return new byte[0];
    }

    @Override
    public Object deserialize(byte[] bytes) throws IOException {
        return null;
    }
}
