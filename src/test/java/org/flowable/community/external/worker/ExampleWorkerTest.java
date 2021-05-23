package org.flowable.community.external.worker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleWorkerTest {
	
	@Autowired
	FlowableHandler flowableHandler;

	@Test
	void testWorkerMethodsFound ( ) {
		Map<Method,Object> wms = flowableHandler.getWorkerMethods();
		assertNotNull(wms);
		assertEquals(2,wms.size());
		
		boolean executeFound = false;
		boolean executeAnotherFound = false;
		
		for ( Method m: wms.keySet() ) {
			switch(m.getName()) {
				case "execute":
					executeFound = true;
					break;
				case "executeAnother":
					executeAnotherFound = true;
					break;
				default:
					fail(String.format("unexpected method found: %s", m));
					break;
			}
		}
		
		assertTrue(executeFound, "'execute' method not found");
		assertTrue(executeAnotherFound, "'executeAnother' method not found");
	}
	
}
