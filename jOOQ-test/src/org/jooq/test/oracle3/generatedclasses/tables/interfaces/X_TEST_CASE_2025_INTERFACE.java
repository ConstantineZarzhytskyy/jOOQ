/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_2025")
public interface X_TEST_CASE_2025_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>X_TEST_CASE_2025.REF_ID</code>. 
	 */
	public void setREF_ID(java.lang.Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_2025.REF_ID</code>. 
	 */
	@javax.persistence.Column(name = "REF_ID", nullable = false, precision = 7)
	public java.lang.Integer getREF_ID();

	/**
	 * Setter for <code>X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	public void setREF_NAME(java.lang.String value);

	/**
	 * Getter for <code>X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	@javax.persistence.Column(name = "REF_NAME", nullable = false, length = 10)
	public java.lang.String getREF_NAME();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface X_TEST_CASE_2025_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_2025_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface X_TEST_CASE_2025_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_2025_INTERFACE> E into(E into);
}
