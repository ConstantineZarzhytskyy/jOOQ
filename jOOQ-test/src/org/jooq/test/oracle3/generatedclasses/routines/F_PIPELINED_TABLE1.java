/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class F_PIPELINED_TABLE1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -89447328;

	/**
	 * The parameter <code>F_PIPELINED_TABLE1.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public F_PIPELINED_TABLE1() {
		super("F_PIPELINED_TABLE1", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE.class));

		setReturnParameter(RETURN_VALUE);
	}
}
