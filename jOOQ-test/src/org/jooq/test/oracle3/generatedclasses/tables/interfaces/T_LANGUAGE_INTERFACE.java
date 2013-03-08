/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_LANGUAGE")
public interface T_LANGUAGE_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>T_LANGUAGE.CD</code>. The language ISO code
	 */
	public void setCD(java.lang.String value);

	/**
	 * Getter for <code>T_LANGUAGE.CD</code>. The language ISO code
	 */
	@javax.persistence.Column(name = "CD", nullable = false, length = 2)
	public java.lang.String getCD();

	/**
	 * Setter for <code>T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	public void setDESCRIPTION(java.lang.String value);

	/**
	 * Getter for <code>T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	@javax.persistence.Column(name = "DESCRIPTION", length = 50)
	public java.lang.String getDESCRIPTION();

	/**
	 * Setter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public void setDESCRIPTION_ENGLISH(java.lang.String value);

	/**
	 * Getter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	@javax.persistence.Column(name = "DESCRIPTION_ENGLISH", length = 50)
	public java.lang.String getDESCRIPTION_ENGLISH();

	/**
	 * Setter for <code>T_LANGUAGE.ID</code>. The language ID
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>T_LANGUAGE.ID</code>. The language ID
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_LANGUAGE_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_LANGUAGE_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE> E into(E into);
}
