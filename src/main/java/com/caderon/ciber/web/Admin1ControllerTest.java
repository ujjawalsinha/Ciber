package com.caderon.ciber.web;

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
 * Unit test for the <code>Admin1Controller</code> controller.
 *
 * @see com.caderon.ciber.web.Admin1Controller
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Ciber-security-context.xml",
		"file:./src/main/resources/Ciber-service-context.xml",
		"file:./src/main/resources/Ciber-dao-context.xml",
		"file:./src/main/resources/Ciber-web-context.xml" })
public class Admin1ControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexAdmin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAdmin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAdmin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAdmin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAdmin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAdmin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAdmin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAdmin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAdmin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAdmin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAdmin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAdmin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAdmin1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAdmin1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAdmin1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>admin1Controllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void Getadmin1Controllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/admin1Controller/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		Admin1Controller controller = (Admin1Controller) context.getBean("Admin1Controller");

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