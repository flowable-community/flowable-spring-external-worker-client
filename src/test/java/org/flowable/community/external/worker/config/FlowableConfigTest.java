package org.flowable.community.external.worker.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.flowable.community.external.worker.test.TestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = TestApplication.class)
@TestPropertySource(
  locations = "classpath:application-configtest.properties")
public class FlowableConfigTest {
	
	@Autowired
	FlowableConfig flowableConfig;
	
	@Test
	void testConfigLoading ( ) {
		assertEquals("http://mydns:8080/external-job-api/acquire/jobs", flowableConfig.getUrl());
		assertEquals("unitTestWorkerId", flowableConfig.getWorkerId());
		assertEquals("adminusr", flowableConfig.getUsername());
		assertEquals("adminpwd", flowableConfig.getPassword());
	}

}
