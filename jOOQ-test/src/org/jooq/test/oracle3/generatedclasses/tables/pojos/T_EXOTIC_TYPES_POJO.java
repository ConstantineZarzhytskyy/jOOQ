/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_EXOTIC_TYPES")
public class T_EXOTIC_TYPES_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_EXOTIC_TYPES_INTERFACE {

	private static final long serialVersionUID = -986896903;

	private java.lang.Integer ID;
	private java.lang.String  UU;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "UU", length = 36)
	@Override
	public java.lang.String getUU() {
		return this.UU;
	}

	@Override
	public void setUU(java.lang.String UU) {
		this.UU = UU;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_EXOTIC_TYPES_INTERFACE from) {
		setID(from.getID());
		setUU(from.getUU());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_EXOTIC_TYPES_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
