package com.caderon.ciber.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAdmin1ById", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.id = ?1"),
		@NamedQuery(name = "findAdmin1ByLocation", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.location = ?1"),
		@NamedQuery(name = "findAdmin1ByLocationContaining", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.location like ?1"),
		@NamedQuery(name = "findAdmin1ByPassword", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.password = ?1"),
		@NamedQuery(name = "findAdmin1ByPasswordContaining", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.password like ?1"),
		@NamedQuery(name = "findAdmin1ByPrimaryKey", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.id = ?1"),
		@NamedQuery(name = "findAdmin1ByRole", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.role = ?1"),
		@NamedQuery(name = "findAdmin1ByRoleContaining", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.role like ?1"),
		@NamedQuery(name = "findAdmin1ByUsername", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.username = ?1"),
		@NamedQuery(name = "findAdmin1ByUsernameContaining", query = "select myAdmin1 from Admin1 myAdmin1 where myAdmin1.username like ?1"),
		@NamedQuery(name = "findAllAdmin1s", query = "select myAdmin1 from Admin1 myAdmin1") })
@Table(catalog = "sakila", name = "admin1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Ciber/com/caderon/ciber/domain", name = "Admin1")
public class Admin1 implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "username", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String username;
	/**
	 */

	@Column(name = "password", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 */

	@Column(name = "role", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String role;
	/**
	 */

	@Column(name = "location", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String location;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 */
	public String getRole() {
		return this.role;
	}

	/**
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 */
	public Admin1() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Admin1 that) {
		setId(that.getId());
		setUsername(that.getUsername());
		setPassword(that.getPassword());
		setRole(that.getRole());
		setLocation(that.getLocation());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("username=[").append(username).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("role=[").append(role).append("] ");
		buffer.append("location=[").append(location).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Admin1))
			return false;
		Admin1 equalCheck = (Admin1) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
