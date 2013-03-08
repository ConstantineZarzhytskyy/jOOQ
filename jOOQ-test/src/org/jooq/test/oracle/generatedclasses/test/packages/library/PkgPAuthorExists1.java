/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.packages.library;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class PkgPAuthorExists1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1522960752;

	/**
	 * The parameter <code>TEST.LIBRARY.PKG_P_AUTHOR_EXISTS.AUTHOR_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>TEST.LIBRARY.PKG_P_AUTHOR_EXISTS.RESULT</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RESULT = createParameter("RESULT", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PkgPAuthorExists1() {
		super("PKG_P_AUTHOR_EXISTS", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.packages.Library.LIBRARY);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
		setOverloaded(true);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter IN value to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.packages.library.PkgPAuthorExists1.AUTHOR_NAME, value);
	}

	/**
	 * Get the <code>RESULT</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getResult() {
		return getValue(RESULT);
	}
}
