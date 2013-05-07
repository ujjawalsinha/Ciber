package com.caderon.ciber.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>Admin1RestController</code> controller.
 *
 * @see com.caderon.ciber.web.rest.Admin1RestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Ciber-security-context.xml",
		"file:./src/main/resources/Ciber-service-context.xml",
		"file:./src/main/resources/Ciber-dao-context.xml",
		"file:./src/main/resources/Ciber-web-context.xml" })
public class Admin1RestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Admin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Admin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1RestController controller = (Admin1RestController) context.getBean("Admin1RestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Admin1admin1_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAdmin1admin1_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Admin1/{admin1_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1RestController controller = (Admin1RestController) context.getBean("Admin1RestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Admin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Admin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1RestController controller = (Admin1RestController) context.getBean("Admin1RestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Admin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Admin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1RestController controller = (Admin1RestController) context.getBean("Admin1RestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Admin1admin1_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAdmin1admin1_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Admin1/{admin1_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1RestController controller = (Admin1RestController) context.getBean("Admin1RestController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}