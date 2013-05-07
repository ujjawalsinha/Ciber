package com.caderon.ciber.service;

import com.caderon.ciber.domain.Admin1;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Admin1 entities
 * 
 */
public interface Admin1Service {

	/**
		 * Load an existing Admin1 entity
		 * 
		 */
		public Set<Admin1> loadAdmin1s();

	/**
	 * Delete an existing Admin1 entity
	 * 
	 */
	public void deleteAdmin1(Admin1 admin1);

	/**
	 * Return a count of all Admin1 entity
	 * 
	 */
	public Integer countAdmin1s();

	/**
	 * Save an existing Admin1 entity
	 * 
	 */
	public void saveAdmin1(Admin1 admin1_1);

	/**
	 */
	public Admin1 findAdmin1ByPrimaryKey(Integer id);

	/**
	 * Return all Admin1 entity
	 * 
	 */
	public List<Admin1> findAllAdmin1s(Integer startResult, Integer maxRows);
}