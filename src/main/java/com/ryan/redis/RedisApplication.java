package com.ryan.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@SpringBootApplication
public class RedisApplication {

	public static void main(String[] args) {
		System.out.println("there");
		SpringApplication.run(RedisApplication.class, args);
	}
}
