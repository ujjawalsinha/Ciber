package com.caderon.ciber.service;

import com.caderon.ciber.domain.Admin1;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/Ciber-security-context.xml",
		"file:./src/main/resources/Ciber-service-context.xml",
		"file:./src/main/resources/Ciber-dao-context.xml",
		"file:./src/main/resources/Ciber-web-context.xml" })
@Transactional
public class Admin1ServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected Admin1Service service;

	/**
	 * Instantiates a new Admin1ServiceTest.
	 *
	 */
	public Admin1ServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Admin1 entity
	 * 
	 */
	@Test
	public void loadAdmin1s() {
		Set<Admin1> response = null;
		response = service.loadAdmin1s();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAdmin1s
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Admin1 entity
	 * 
	 */
	@Test
	public void deleteAdmin1() {
		// TODO: JUnit - Populate test inputs for operation: deleteAdmin1 
		Admin1 admin1 = new com.caderon.ciber.domain.Admin1();
		service.deleteAdmin1(admin1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Admin1 entity
	 * 
	 */
	@Test
	public void countAdmin1s() {
		Integer response = null;
		response = service.countAdmin1s();
		// TODO: JUnit - Add assertions to test outputs of operation: countAdmin1s
	}

	/**
	 * Operation Unit Test
	 * Save an existing Admin1 entity
	 * 
	 */
	@Test
	public void saveAdmin1() {
		// TODO: JUnit - Populate test inputs for operation: saveAdmin1 
		Admin1 admin1_1 = new com.caderon.ciber.domain.Admin1();
		service.saveAdmin1(admin1_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAdmin1ByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAdmin1ByPrimaryKey 
		Integer id = 0;
		Admin1 response = null;
		response = service.findAdmin1ByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findAdmin1ByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Admin1 entity
	 * 
	 */
	@Test
	public void findAllAdmin1s() {
		// TODO: JUnit - Populate test inputs for operation: findAllAdmin1s 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Admin1> response = null;
		response = service.findAllAdmin1s(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAdmin1s
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
