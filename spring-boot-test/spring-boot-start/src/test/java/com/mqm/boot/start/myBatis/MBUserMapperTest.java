package com.mqm.boot.start.myBatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MBUserMapperTest {

	@Autowired
	private MBUserMapper mBUserMapper;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Rollback
	public void testFindByName() {
		// insert一条数据，并select出来验证
		mBUserMapper.insert("AAA", 20);
		MBUser u = mBUserMapper.findByName("AAA");
		Assert.assertEquals(20, u.getAge().intValue());
		// update一条数据，并select出来验证
		u.setAge(30);
		mBUserMapper.update(u);
		u = mBUserMapper.findByName("AAA");
		Assert.assertEquals(30, u.getAge().intValue());
		// 删除这条数据，并select验证
		mBUserMapper.delete(u.getId());
		u = mBUserMapper.findByName("AAA");
		Assert.assertEquals(null, u);
		//Map传入参数
		Map<String, Object> map = new HashMap<>();
		map.put("name", "CCC");
		map.put("age", 40);
		mBUserMapper.insertByMap(map);
		u = mBUserMapper.findByName("CCC");
		Assert.assertEquals(40, u.getAge().intValue());
		//查询结果绑定
		List<MBUser> userList = mBUserMapper.findAll();
		for(MBUser mBUser : userList) {
			Assert.assertEquals(null, mBUser.getId());
			Assert.assertNotEquals(null, mBUser.getName());
		}
	}

}
