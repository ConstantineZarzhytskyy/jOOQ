/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class UNumberLongTableRecord extends org.jooq.impl.ArrayRecordImpl<java.lang.Long> {

	private static final long serialVersionUID = -179441813;

	/**
	 * Create a new <code>TEST.U_NUMBER_LONG_TABLE</code> record
	 */
	public UNumberLongTableRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.test.Test.TEST, "U_NUMBER_LONG_TABLE", org.jooq.impl.SQLDataType.BIGINT, configuration);
	}

	/**
	 * Create a new <code>TEST.U_NUMBER_LONG_TABLE</code> record
	 */
	public UNumberLongTableRecord(org.jooq.Configuration configuration, java.lang.Long... array) {
		this(configuration);
		set(array);
	}

	/**
	 * Create a new <code>TEST.U_NUMBER_LONG_TABLE</code> record
	 */
	public UNumberLongTableRecord(org.jooq.Configuration configuration, java.util.List<? extends java.lang.Long> list) {
		this(configuration);
		setList(list);
	}
}
