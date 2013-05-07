package com.caderon.ciber.dao;

import com.caderon.ciber.domain.Admin1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Admin1 entities.
 * 
 */
@Repository("Admin1DAO")
@Transactional
public class Admin1DAOImpl extends AbstractJpaDao<Admin1> implements Admin1DAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Admin1.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new Admin1DAOImpl
	 *
	 */
	public Admin1DAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findAdmin1ByLocation
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByLocation(String location) throws DataAccessException {

		return findAdmin1ByLocation(location, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByLocation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByLocation(String location, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByLocation", startResult, maxRows, location);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAdmin1ByRoleContaining
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByRoleContaining(String role) throws DataAccessException {

		return findAdmin1ByRoleContaining(role, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByRoleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByRoleContaining(String role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByRoleContaining", startResult, maxRows, role);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAdmin1ByUsername
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByUsername(String username) throws DataAccessException {

		return findAdmin1ByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByUsername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByUsername", startResult, maxRows, username);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAdmin1s
	 *
	 */
	@Transactional
	public Set<Admin1> findAllAdmin1s() throws DataAccessException {

		return findAllAdmin1s(-1, -1);
	}

	/**
	 * JPQL Query - findAllAdmin1s
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAllAdmin1s(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAdmin1s", startResult, maxRows);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAdmin1ByPrimaryKey
	 *
	 */
	@Transactional
	public Admin1 findAdmin1ByPrimaryKey(Integer id) throws DataAccessException {

		return findAdmin1ByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByPrimaryKey
	 *
	 */

	@Transactional
	public Admin1 findAdmin1ByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAdmin1ByPrimaryKey", startResult, maxRows, id);
			return (com.caderon.ciber.domain.Admin1) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAdmin1ById
	 *
	 */
	@Transactional
	public Admin1 findAdmin1ById(Integer id) throws DataAccessException {

		return findAdmin1ById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ById
	 *
	 */

	@Transactional
	public Admin1 findAdmin1ById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAdmin1ById", startResult, maxRows, id);
			return (com.caderon.ciber.domain.Admin1) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAdmin1ByUsernameContaining
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByUsernameContaining(String username) throws DataAccessException {

		return findAdmin1ByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByUsernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAdmin1ByLocationContaining
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByLocationContaining(String location) throws DataAccessException {

		return findAdmin1ByLocationContaining(location, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByLocationContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByLocationContaining(String location, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByLocationContaining", startResult, maxRows, location);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAdmin1ByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByPasswordContaining(String password) throws DataAccessException {

		return findAdmin1ByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAdmin1ByPassword
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByPassword(String password) throws DataAccessException {

		return findAdmin1ByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * JPQL Query - findAdmin1ByRole
	 *
	 */
	@Transactional
	public Set<Admin1> findAdmin1ByRole(String role) throws DataAccessException {

		return findAdmin1ByRole(role, -1, -1);
	}

	/**
	 * JPQL Query - findAdmin1ByRole
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Admin1> findAdmin1ByRole(String role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAdmin1ByRole", startResult, maxRows, role);
		return new LinkedHashSet<Admin1>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Admin1 entity) {
		return true;
	}
}
