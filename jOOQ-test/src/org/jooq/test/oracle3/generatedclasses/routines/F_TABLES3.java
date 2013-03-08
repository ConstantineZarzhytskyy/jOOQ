/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class F_TABLES3 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1504903872;

	/**
	 * The parameter <code>F_TABLES3.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE.class));

	/**
	 * The parameter <code>F_TABLES3.IN_TABLE</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public F_TABLES3() {
		super("F_TABLES3", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter IN value to the routine
	 */
	public void setIN_TABLE(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.F_TABLES3.IN_TABLE, value);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setIN_TABLE(org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> field) {
		setField(IN_TABLE, field);
	}
}
