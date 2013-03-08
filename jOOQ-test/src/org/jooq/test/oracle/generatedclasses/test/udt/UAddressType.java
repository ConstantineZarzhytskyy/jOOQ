/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class UAddressType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = -1722316104;

	/**
	 * The singleton instance of <code>TEST.U_ADDRESS_TYPE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.udt.UAddressType U_ADDRESS_TYPE = new org.jooq.test.oracle.generatedclasses.test.udt.UAddressType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord.class;
	}

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.STREET</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord> STREET = createField("STREET", org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.U_STREET_TYPE.getDataType(), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.ZIP</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.String> ZIP = createField("ZIP", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.CITY</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.String> CITY = createField("CITY", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.COUNTRY</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.SINCE</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.sql.Date> SINCE = createField("SINCE", org.jooq.impl.SQLDataType.DATE, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.CODE</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.Integer> CODE = createField("CODE", org.jooq.impl.SQLDataType.INTEGER, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.F_1323</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, byte[]> F_1323 = createField("F_1323", org.jooq.impl.SQLDataType.BLOB, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>TEST.U_ADDRESS_TYPE.F_1326</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.String> F_1326 = createField("F_1326", org.jooq.impl.SQLDataType.CLOB, U_ADDRESS_TYPE);

	/**
	 * No further instances allowed
	 */
	private UAddressType() {
		super("U_ADDRESS_TYPE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		// Initialise data type
		getDataType();
	}
}
