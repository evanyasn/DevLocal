package com.uangteman;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.uangteman.services.HitungServices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJenkinsApplicationTests {

	@Autowired
	private HitungServices hitungService;
	
	@Test
	public void contextLoads() {
		Assert.assertEquals(20, hitungService.add(10, 10));
	}
	
}
