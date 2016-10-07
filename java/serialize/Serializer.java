package com.idea.cache.serialize;

import java.io.IOException;

/**
 * @author andaicheng
 */
public interface Serializer {

    String getName();

    byte[] serialize(Object o) throws IOException;

    Object deserialize(byte[] bytes) throws IOException;
}
