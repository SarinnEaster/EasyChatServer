package com.easychat.serializer;

import com.alibaba.fastjson.JSON;

/**
 * @author: Ann
 * date: 2024/12/22.
 */
public class JsonSerializer implements Serializer {
    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public <T> byte[] serializer(T t) {
        return JSON.toJSONBytes(t);
    }

    @Override
    public <T> T deSerializer(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }

}