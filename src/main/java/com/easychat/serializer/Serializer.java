package com.easychat.serializer;

/**
 * @author: Ann
 * date: 2024/12/22.
 */
public interface Serializer {
    Serializer Default = new JsonSerializer();
    byte getSerializerAlgorithm();
    
    <T> byte [] serializer(T t);
    
    <T> T deSerializer(Class<T> clazz, byte[] bytes);
}
