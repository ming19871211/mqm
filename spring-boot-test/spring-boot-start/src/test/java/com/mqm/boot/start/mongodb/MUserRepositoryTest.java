/*package com.mqm.boot.start.mongodb;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MUserRepositoryTest {
	
	
	@Autowired
	private MUserRepository muserRepository;

	@Before
	public void setUp() throws Exception {
		muserRepository.deleteAll();
	}

	@Test
	public void test() {
		// 创建三个User，并验证User总数
		muserRepository.save(new MUser(1L, "didi", 30));
		muserRepository.save(new MUser(2L, "mama", 40));
		muserRepository.save(new MUser(3L, "kaka", 50));
		Assert.assertEquals(3, muserRepository.findAll().size());
		// 删除一个User，再验证User总数
		MUser u = muserRepository.findOne(1L);
		muserRepository.delete(u);
		Assert.assertEquals(2, muserRepository.findAll().size());
		// 删除一个User，再验证User总数
		u = muserRepository.findByUsername("mama");
		muserRepository.delete(u);
		Assert.assertEquals(1, muserRepository.findAll().size());
	}

}
*/