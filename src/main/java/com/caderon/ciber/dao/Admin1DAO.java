package com.caderon.ciber.dao;

import com.caderon.ciber.domain.Admin1;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Admin1 entities.
 * 
 */
public interface Admin1DAO extends JpaDao<Admin1> {

	/**
	 * JPQL Query - findAdmin1ByLocation
	 *
	 */
	
	
	
	public Set<Admin1> findAdmin1ByLocation(String location) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByLocation
	 *
	 */
	public Set<Admin1> findAdmin1ByLocation(String location, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByRoleContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByRoleContaining(String role) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByRoleContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByRoleContaining(String role, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByUsername
	 *
	 */
	public Set<Admin1> findAdmin1ByUsername(String username) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByUsername
	 *
	 */
	public Set<Admin1> findAdmin1ByUsername(String username, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAdmin1s
	 *
	 */
	public Set<Admin1> findAllAdmin1s() throws DataAccessException;

	/**
	 * JPQL Query - findAllAdmin1s
	 *
	 */
	public Set<Admin1> findAllAdmin1s(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByPrimaryKey
	 *
	 */
	public Admin1 findAdmin1ByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByPrimaryKey
	 *
	 */
	public Admin1 findAdmin1ByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ById
	 *
	 */
	public Admin1 findAdmin1ById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ById
	 *
	 */
	public Admin1 findAdmin1ById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByUsernameContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByUsernameContaining(String username_1) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByUsernameContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByUsernameContaining(String username_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByLocationContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByLocationContaining(String location_1) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByLocationContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByLocationContaining(String location_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByPasswordContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByPasswordContaining
	 *
	 */
	public Set<Admin1> findAdmin1ByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByPassword
	 *
	 */
	public Set<Admin1> findAdmin1ByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByPassword
	 *
	 */
	public Set<Admin1> findAdmin1ByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByRole
	 *
	 */
	public Set<Admin1> findAdmin1ByRole(String role_1) throws DataAccessException;

	/**
	 * JPQL Query - findAdmin1ByRole
	 *
	 */
	public Set<Admin1> findAdmin1ByRole(String role_1, int startResult, int maxRows) throws DataAccessException;

}