/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class FormatSize extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = -2107210553;

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.FORMAT_SIZE.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.FORMAT_SIZE.NUM</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> NUM = createParameter("NUM", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public FormatSize() {
		super("FORMAT_SIZE", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(NUM);
	}

	/**
	 * Set the <code>NUM</code> parameter IN value to the routine
	 */
	public void setNum(java.lang.Number value) {
		setNumber(org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize.NUM, value);
	}

	/**
	 * Set the <code>NUM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setNum(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(NUM, field);
	}
}
