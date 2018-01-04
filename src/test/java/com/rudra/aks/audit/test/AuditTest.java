/**
 * 
 */
package com.rudra.aks.audit.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.rudra.aks.AuditMainApp;
import com.rudra.aks.audit.controller.TestController;

/**
 * @author ankush
 *
 */
public class AuditTest {

	private static String URL = "";
	
	@Before
	public void init() {
		URL = "http://localhost:8088/test/1/demo";
	}
	
	/**
	 * To run below test case
	 * Run {@link AuditMainApp} as Java Application
	 * @see AuditMainApp 
	 */
	@Test
	public void checkAuditUsingRestCall() {
		
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(URL, String.class);
		
		Assert.assertEquals("Auditing failed", "auditing done", response);

	}
	
	@Test
	public void checkAudit() {
		TestController test = new TestController();
		String res = test.test(1, "demo");
		
		Assert.assertEquals("Auditing Failed", "auditing done", res);
	}
}
