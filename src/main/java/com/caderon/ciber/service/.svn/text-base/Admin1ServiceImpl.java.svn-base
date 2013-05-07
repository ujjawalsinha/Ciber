package com.caderon.ciber.service;

import com.caderon.ciber.dao.Admin1DAO;

import com.caderon.ciber.domain.Admin1;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Admin1 entities
 * 
 */

@Service("Admin1Service")
@Transactional
public class Admin1ServiceImpl implements Admin1Service {

	/**
	 * DAO injected by Spring that manages Admin1 entities
	 * 
	 */
	@Autowired
	private Admin1DAO admin1DAO;

	/**
	 * Instantiates a new Admin1ServiceImpl.
	 *
	 */
	public Admin1ServiceImpl() {
	}

	/**
	 * Load an existing Admin1 entity
	 * 
	 */
	@Transactional
	public Set<Admin1> loadAdmin1s() {
		return admin1DAO.findAllAdmin1s();
	}

	/**
	 * Delete an existing Admin1 entity
	 * 
	 */
	@Transactional
	public void deleteAdmin1(Admin1 admin1) {
		admin1DAO.remove(admin1);
		admin1DAO.flush();
	}

	/**
	 * Return a count of all Admin1 entity
	 * 
	 */
	@Transactional
	public Integer countAdmin1s() {
		return ((Long) admin1DAO.createQuerySingleResult("select count(o) from Admin1 o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Admin1 entity
	 * 
	 */
	@Transactional
	public void saveAdmin1(Admin1 admin1) {
		Admin1 existingAdmin1 = admin1DAO.findAdmin1ByPrimaryKey(admin1.getId());

		if (existingAdmin1 != null) {
			if (existingAdmin1 != admin1) {
				existingAdmin1.setId(admin1.getId());
				existingAdmin1.setUsername(admin1.getUsername());
				existingAdmin1.setPassword(admin1.getPassword());
				existingAdmin1.setRole(admin1.getRole());
				existingAdmin1.setLocation(admin1.getLocation());
			}
			admin1 = admin1DAO.store(existingAdmin1);
		} else {
			admin1 = admin1DAO.store(admin1);
		}
		admin1DAO.flush();
	}

	/**
	 */
	@Transactional
	public Admin1 findAdmin1ByPrimaryKey(Integer id) {
		return admin1DAO.findAdmin1ByPrimaryKey(id);
	}

	/**
	 * Return all Admin1 entity
	 * 
	 */
	@Transactional
	public List<Admin1> findAllAdmin1s(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Admin1>(admin1DAO.findAllAdmin1s(startResult, maxRows));
	}
}
