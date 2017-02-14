/*package com.mqm.boot.start.redis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConfigTest {

	@Autowired
	private RedisTemplate<String, RUser> redisTemplate;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
				
		// 保存对象
		RUser ruser = new RUser("超人", 20);
		redisTemplate.opsForValue().set(ruser.getUsername(), ruser);
		ruser = new RUser("蝙蝠侠", 30);
		redisTemplate.opsForValue().set(ruser.getUsername(), ruser);
		ruser = new RUser("蜘蛛侠", 40);
		redisTemplate.opsForValue().set(ruser.getUsername(), ruser);
		Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
		Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
		Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());
	}

}*/
