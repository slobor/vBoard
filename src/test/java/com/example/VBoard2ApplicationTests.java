package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.livingoncodes.vboard.VBoard2Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = VBoard2Application.class)
@WebAppConfiguration
public class VBoard2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
