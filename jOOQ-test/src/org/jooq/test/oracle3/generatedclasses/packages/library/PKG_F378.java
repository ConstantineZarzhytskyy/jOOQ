/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.library;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class PKG_F378 extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = -994850051;

	/**
	 * The parameter <code>LIBRARY.PKG_F378.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>LIBRARY.PKG_F378.I</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I = createParameter("I", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>LIBRARY.PKG_F378.IO</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO = createParameter("IO", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>LIBRARY.PKG_F378.O</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O = createParameter("O", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PKG_F378() {
		super("PKG_F378", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.packages.LIBRARY.LIBRARY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(I);
		addInOutParameter(IO);
		addOutParameter(O);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378.I, value);
	}

	/**
	 * Set the <code>IO</code> parameter IN value to the routine
	 */
	public void setIO(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378.IO, value);
	}

	/**
	 * Get the <code>IO</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getIO() {
		return getValue(IO);
	}

	/**
	 * Get the <code>O</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getO() {
		return getValue(O);
	}
}
