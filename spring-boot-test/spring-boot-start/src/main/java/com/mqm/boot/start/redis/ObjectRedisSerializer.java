/*package com.mqm.boot.start.redis;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class ObjectRedisSerializer implements RedisSerializer<Object> {
	
	private Converter<Object, byte[]> serializer = new SerializingConverter();
	
	private Converter<byte[], Object> deserializer = new DeserializingConverter();

	@Override
	public byte[] serialize(Object t) throws SerializationException {
		
		return (t == null ? null : serializer.convert(t));
	}

	@Override
	public Object deserialize(byte[] bytes) throws SerializationException {
		return (bytes == null ? null : deserializer.convert(bytes));
	}

}*/
