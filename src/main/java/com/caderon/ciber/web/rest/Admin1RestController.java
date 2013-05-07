package com.caderon.ciber.web.rest;

import com.caderon.ciber.dao.Admin1DAO;

import com.caderon.ciber.domain.Admin1;

import com.caderon.ciber.service.Admin1Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Admin1 entities
 * 
 */

@Controller("Admin1RestController")
public class Admin1RestController {

	/**
	 * DAO injected by Spring that manages Admin1 entities
	 * 
	 */
	@Autowired
	private Admin1DAO admin1DAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Admin1 entities
	 * 
	 */
	@Autowired
	private Admin1Service admin1Service;

	/**
	 * Delete an existing Admin1 entity
	 * 
	 */
	@RequestMapping(value = "/Admin1/{admin1_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAdmin1(@PathVariable Integer admin1_id) {
		Admin1 admin1 = admin1DAO.findAdmin1ByPrimaryKey(admin1_id);
		admin1Service.deleteAdmin1(admin1);
	}

	/**
	 * Show all Admin1 entities
	 * 
	 */
	@RequestMapping(value = "/Admin1", method = RequestMethod.GET)
	@ResponseBody
	public List<Admin1> listAdmin1s() {
		return new java.util.ArrayList<Admin1>(admin1Service.loadAdmin1s());
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Save an existing Admin1 entity
	 * 
	 */
	@RequestMapping(value = "/Admin1", method = RequestMethod.PUT)
	@ResponseBody
	public Admin1 saveAdmin1(@RequestBody Admin1 admin1) {
		admin1Service.saveAdmin1(admin1);
		return admin1DAO.findAdmin1ByPrimaryKey(admin1.getId());
	}

	/**
	 * Create a new Admin1 entity
	 * 
	 */
	@RequestMapping(value = "/Admin1", method = RequestMethod.POST)
	@ResponseBody
	public Admin1 newAdmin1(@RequestBody Admin1 admin1) {
		admin1Service.saveAdmin1(admin1);
		return admin1DAO.findAdmin1ByPrimaryKey(admin1.getId());
	}

	/**
	 * Select an existing Admin1 entity
	 * 
	 */
	@RequestMapping(value = "/Admin1/{admin1_id}", method = RequestMethod.GET)
	@ResponseBody
	public Admin1 loadAdmin1(@PathVariable Integer admin1_id) {
		return admin1DAO.findAdmin1ByPrimaryKey(admin1_id);
	}
}