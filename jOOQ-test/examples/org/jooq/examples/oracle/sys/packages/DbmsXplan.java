/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in DBMS_XPLAN
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class DbmsXplan extends org.jooq.impl.PackageImpl {

	private static final long serialVersionUID = 1339251334;

	/**
	 * The singleton instance of <code>SYS.DBMS_XPLAN</code>
	 */
	public static final org.jooq.examples.oracle.sys.packages.DbmsXplan DBMS_XPLAN = new org.jooq.examples.oracle.sys.packages.DbmsXplan();

	/**
	 * Call <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML</code>
	 */
	public static java.lang.Object buildPlanXml(org.jooq.Configuration configuration, java.lang.String tableName, java.lang.String statementId, java.lang.Number planId, java.lang.String format, java.lang.String filterPreds, java.lang.String planTag, java.lang.String reportRef) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setPlanId(planId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);
		f.setPlanTag(planTag);
		f.setReportRef(reportRef);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> buildPlanXml(java.lang.String tableName, java.lang.String statementId, java.lang.Number planId, java.lang.String format, java.lang.String filterPreds, java.lang.String planTag, java.lang.String reportRef) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setPlanId(planId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);
		f.setPlanTag(planTag);
		f.setReportRef(reportRef);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> buildPlanXml(org.jooq.Field<java.lang.String> tableName, org.jooq.Field<java.lang.String> statementId, org.jooq.Field<? extends java.lang.Number> planId, org.jooq.Field<java.lang.String> format, org.jooq.Field<java.lang.String> filterPreds, org.jooq.Field<java.lang.String> planTag, org.jooq.Field<java.lang.String> reportRef) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setPlanId(planId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);
		f.setPlanTag(planTag);
		f.setReportRef(reportRef);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DIFF_PLAN</code>
	 */
	public static java.lang.String diffPlan(org.jooq.Configuration configuration, java.lang.String sqlText, java.lang.String outline, java.lang.String userName) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan();
		f.setSqlText(sqlText);
		f.setOutline(outline);
		f.setUserName(userName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlan(java.lang.String sqlText, java.lang.String outline, java.lang.String userName) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan();
		f.setSqlText(sqlText);
		f.setOutline(outline);
		f.setUserName(userName);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlan(org.jooq.Field<java.lang.String> sqlText, org.jooq.Field<java.lang.String> outline, org.jooq.Field<java.lang.String> userName) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan();
		f.setSqlText(sqlText);
		f.setOutline(outline);
		f.setUserName(userName);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DIFF_PLAN_AWR</code>
	 */
	public static java.lang.String diffPlanAwr(org.jooq.Configuration configuration, java.lang.String sqlId, java.lang.Number planHashValue1, java.lang.Number planHashValue2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanAwr f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanAwr();
		f.setSqlId(sqlId);
		f.setPlanHashValue1(planHashValue1);
		f.setPlanHashValue2(planHashValue2);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_AWR</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanAwr(java.lang.String sqlId, java.lang.Number planHashValue1, java.lang.Number planHashValue2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanAwr f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanAwr();
		f.setSqlId(sqlId);
		f.setPlanHashValue1(planHashValue1);
		f.setPlanHashValue2(planHashValue2);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_AWR</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanAwr(org.jooq.Field<java.lang.String> sqlId, org.jooq.Field<? extends java.lang.Number> planHashValue1, org.jooq.Field<? extends java.lang.Number> planHashValue2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanAwr f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanAwr();
		f.setSqlId(sqlId);
		f.setPlanHashValue1(planHashValue1);
		f.setPlanHashValue2(planHashValue2);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DIFF_PLAN_CURSOR</code>
	 */
	public static java.lang.String diffPlanCursor(org.jooq.Configuration configuration, java.lang.String sqlId, java.lang.Number cursorChildNum1, java.lang.Number cursorChildNum2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor();
		f.setSqlId(sqlId);
		f.setCursorChildNum1(cursorChildNum1);
		f.setCursorChildNum2(cursorChildNum2);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_CURSOR</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanCursor(java.lang.String sqlId, java.lang.Number cursorChildNum1, java.lang.Number cursorChildNum2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor();
		f.setSqlId(sqlId);
		f.setCursorChildNum1(cursorChildNum1);
		f.setCursorChildNum2(cursorChildNum2);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_CURSOR</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanCursor(org.jooq.Field<java.lang.String> sqlId, org.jooq.Field<? extends java.lang.Number> cursorChildNum1, org.jooq.Field<? extends java.lang.Number> cursorChildNum2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor();
		f.setSqlId(sqlId);
		f.setCursorChildNum1(cursorChildNum1);
		f.setCursorChildNum2(cursorChildNum2);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DIFF_PLAN_OUTLINE</code>
	 */
	public static java.lang.String diffPlanOutline(org.jooq.Configuration configuration, java.lang.String sqlText, java.lang.String outline1, java.lang.String outline2, java.lang.String userName) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanOutline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanOutline();
		f.setSqlText(sqlText);
		f.setOutline1(outline1);
		f.setOutline2(outline2);
		f.setUserName(userName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_OUTLINE</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanOutline(java.lang.String sqlText, java.lang.String outline1, java.lang.String outline2, java.lang.String userName) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanOutline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanOutline();
		f.setSqlText(sqlText);
		f.setOutline1(outline1);
		f.setOutline2(outline2);
		f.setUserName(userName);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_OUTLINE</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanOutline(org.jooq.Field<java.lang.String> sqlText, org.jooq.Field<java.lang.String> outline1, org.jooq.Field<java.lang.String> outline2, org.jooq.Field<java.lang.String> userName) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanOutline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanOutline();
		f.setSqlText(sqlText);
		f.setOutline1(outline1);
		f.setOutline2(outline2);
		f.setUserName(userName);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DIFF_PLAN_SQL_BASELINE</code>
	 */
	public static java.lang.String diffPlanSqlBaseline(org.jooq.Configuration configuration, java.lang.String baselinePlanName1, java.lang.String baselinePlanName2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanSqlBaseline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanSqlBaseline();
		f.setBaselinePlanName1(baselinePlanName1);
		f.setBaselinePlanName2(baselinePlanName2);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_SQL_BASELINE</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanSqlBaseline(java.lang.String baselinePlanName1, java.lang.String baselinePlanName2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanSqlBaseline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanSqlBaseline();
		f.setBaselinePlanName1(baselinePlanName1);
		f.setBaselinePlanName2(baselinePlanName2);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DIFF_PLAN_SQL_BASELINE</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> diffPlanSqlBaseline(org.jooq.Field<java.lang.String> baselinePlanName1, org.jooq.Field<java.lang.String> baselinePlanName2) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanSqlBaseline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanSqlBaseline();
		f.setBaselinePlanName1(baselinePlanName1);
		f.setBaselinePlanName2(baselinePlanName2);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DISPLAY</code>
	 */
	public static org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord display(org.jooq.Configuration configuration, java.lang.String tableName, java.lang.String statementId, java.lang.String format, java.lang.String filterPreds) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.Display f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.Display();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> display(java.lang.String tableName, java.lang.String statementId, java.lang.String format, java.lang.String filterPreds) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.Display f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.Display();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> display(org.jooq.Field<java.lang.String> tableName, org.jooq.Field<java.lang.String> statementId, org.jooq.Field<java.lang.String> format, org.jooq.Field<java.lang.String> filterPreds) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.Display f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.Display();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DISPLAY_AWR</code>
	 */
	public static org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord displayAwr(org.jooq.Configuration configuration, java.lang.String sqlId, java.math.BigInteger planHashValue, java.math.BigInteger dbId, java.lang.String format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayAwr f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayAwr();
		f.setSqlId(sqlId);
		f.setPlanHashValue(planHashValue);
		f.setDbId(dbId);
		f.setFormat(format);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_AWR</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displayAwr(java.lang.String sqlId, java.math.BigInteger planHashValue, java.math.BigInteger dbId, java.lang.String format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayAwr f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayAwr();
		f.setSqlId(sqlId);
		f.setPlanHashValue(planHashValue);
		f.setDbId(dbId);
		f.setFormat(format);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_AWR</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displayAwr(org.jooq.Field<java.lang.String> sqlId, org.jooq.Field<java.math.BigInteger> planHashValue, org.jooq.Field<java.math.BigInteger> dbId, org.jooq.Field<java.lang.String> format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayAwr f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayAwr();
		f.setSqlId(sqlId);
		f.setPlanHashValue(planHashValue);
		f.setDbId(dbId);
		f.setFormat(format);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DISPLAY_CURSOR</code>
	 */
	public static org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord displayCursor(org.jooq.Configuration configuration, java.lang.String sqlId, java.math.BigInteger cursorChildNo, java.lang.String format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayCursor f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayCursor();
		f.setSqlId(sqlId);
		f.setCursorChildNo(cursorChildNo);
		f.setFormat(format);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_CURSOR</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displayCursor(java.lang.String sqlId, java.math.BigInteger cursorChildNo, java.lang.String format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayCursor f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayCursor();
		f.setSqlId(sqlId);
		f.setCursorChildNo(cursorChildNo);
		f.setFormat(format);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_CURSOR</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displayCursor(org.jooq.Field<java.lang.String> sqlId, org.jooq.Field<java.math.BigInteger> cursorChildNo, org.jooq.Field<java.lang.String> format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayCursor f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayCursor();
		f.setSqlId(sqlId);
		f.setCursorChildNo(cursorChildNo);
		f.setFormat(format);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DISPLAY_PLAN</code>
	 */
	public static java.lang.String displayPlan(org.jooq.Configuration configuration, java.lang.String tableName, java.lang.String statementId, java.lang.String format, java.lang.String filterPreds, java.lang.String type) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayPlan f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayPlan();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);
		f.setType(type);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_PLAN</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> displayPlan(java.lang.String tableName, java.lang.String statementId, java.lang.String format, java.lang.String filterPreds, java.lang.String type) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayPlan f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayPlan();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);
		f.setType(type);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_PLAN</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> displayPlan(org.jooq.Field<java.lang.String> tableName, org.jooq.Field<java.lang.String> statementId, org.jooq.Field<java.lang.String> format, org.jooq.Field<java.lang.String> filterPreds, org.jooq.Field<java.lang.String> type) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayPlan f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplayPlan();
		f.setTableName(tableName);
		f.setStatementId(statementId);
		f.setFormat(format);
		f.setFilterPreds(filterPreds);
		f.setType(type);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DISPLAY_SQL_PLAN_BASELINE</code>
	 */
	public static org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord displaySqlPlanBaseline(org.jooq.Configuration configuration, java.lang.String sqlHandle, java.lang.String planName, java.lang.String format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlPlanBaseline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlPlanBaseline();
		f.setSqlHandle(sqlHandle);
		f.setPlanName(planName);
		f.setFormat(format);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_SQL_PLAN_BASELINE</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displaySqlPlanBaseline(java.lang.String sqlHandle, java.lang.String planName, java.lang.String format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlPlanBaseline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlPlanBaseline();
		f.setSqlHandle(sqlHandle);
		f.setPlanName(planName);
		f.setFormat(format);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_SQL_PLAN_BASELINE</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displaySqlPlanBaseline(org.jooq.Field<java.lang.String> sqlHandle, org.jooq.Field<java.lang.String> planName, org.jooq.Field<java.lang.String> format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlPlanBaseline f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlPlanBaseline();
		f.setSqlHandle(sqlHandle);
		f.setPlanName(planName);
		f.setFormat(format);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET</code>
	 */
	public static org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord displaySqlset(org.jooq.Configuration configuration, java.lang.String sqlsetName, java.lang.String sqlId, java.math.BigInteger planHashValue, java.lang.String format, java.lang.String sqlsetOwner) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset();
		f.setSqlsetName(sqlsetName);
		f.setSqlId(sqlId);
		f.setPlanHashValue(planHashValue);
		f.setFormat(format);
		f.setSqlsetOwner(sqlsetOwner);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displaySqlset(java.lang.String sqlsetName, java.lang.String sqlId, java.math.BigInteger planHashValue, java.lang.String format, java.lang.String sqlsetOwner) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset();
		f.setSqlsetName(sqlsetName);
		f.setSqlId(sqlId);
		f.setPlanHashValue(planHashValue);
		f.setFormat(format);
		f.setSqlsetOwner(sqlsetOwner);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> displaySqlset(org.jooq.Field<java.lang.String> sqlsetName, org.jooq.Field<java.lang.String> sqlId, org.jooq.Field<java.math.BigInteger> planHashValue, org.jooq.Field<java.lang.String> format, org.jooq.Field<java.lang.String> sqlsetOwner) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset();
		f.setSqlsetName(sqlsetName);
		f.setSqlId(sqlId);
		f.setPlanHashValue(planHashValue);
		f.setFormat(format);
		f.setSqlsetOwner(sqlsetOwner);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.FORMAT_NUMBER</code>
	 */
	public static java.lang.String formatNumber(org.jooq.Configuration configuration, java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber();
		f.setNum(num);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_NUMBER</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatNumber(java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_NUMBER</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatNumber(org.jooq.Field<? extends java.lang.Number> num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.FORMAT_NUMBER2</code>
	 */
	public static java.lang.String formatNumber2(org.jooq.Configuration configuration, java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber2 f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber2();
		f.setNum(num);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_NUMBER2</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatNumber2(java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber2 f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber2();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_NUMBER2</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatNumber2(org.jooq.Field<? extends java.lang.Number> num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber2 f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber2();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.FORMAT_SIZE</code>
	 */
	public static java.lang.String formatSize(org.jooq.Configuration configuration, java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize();
		f.setNum(num);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_SIZE</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatSize(java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_SIZE</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatSize(org.jooq.Field<? extends java.lang.Number> num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.FORMAT_SIZE2</code>
	 */
	public static java.lang.String formatSize2(org.jooq.Configuration configuration, java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize2 f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize2();
		f.setNum(num);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_SIZE2</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatSize2(java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize2 f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize2();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_SIZE2</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatSize2(org.jooq.Field<? extends java.lang.Number> num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize2 f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatSize2();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.FORMAT_TIME_S</code>
	 */
	public static java.lang.String formatTimeS(org.jooq.Configuration configuration, java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatTimeS f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatTimeS();
		f.setNum(num);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_TIME_S</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatTimeS(java.lang.Number num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatTimeS f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatTimeS();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.FORMAT_TIME_S</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> formatTimeS(org.jooq.Field<? extends java.lang.Number> num) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatTimeS f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatTimeS();
		f.setNum(num);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.GET_PLANDIFF_REPORT_XML</code>
	 */
	public static java.lang.Object getPlandiffReportXml(org.jooq.Configuration configuration, java.lang.String reportRef, java.lang.Number tid, java.lang.String method) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml();
		f.setReportRef(reportRef);
		f.setTid(tid);
		f.setMethod(method);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.GET_PLANDIFF_REPORT_XML</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> getPlandiffReportXml(java.lang.String reportRef, java.lang.Number tid, java.lang.String method) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml();
		f.setReportRef(reportRef);
		f.setTid(tid);
		f.setMethod(method);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.GET_PLANDIFF_REPORT_XML</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> getPlandiffReportXml(org.jooq.Field<java.lang.String> reportRef, org.jooq.Field<? extends java.lang.Number> tid, org.jooq.Field<java.lang.String> method) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml();
		f.setReportRef(reportRef);
		f.setTid(tid);
		f.setMethod(method);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.PREPARE_PLAN_XML_QUERY</code>
	 */
	public static java.lang.String preparePlanXmlQuery(org.jooq.Configuration configuration, java.lang.String planQuery) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.PreparePlanXmlQuery f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.PreparePlanXmlQuery();
		f.setPlanQuery(planQuery);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.PREPARE_PLAN_XML_QUERY</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> preparePlanXmlQuery(java.lang.String planQuery) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.PreparePlanXmlQuery f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.PreparePlanXmlQuery();
		f.setPlanQuery(planQuery);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.PREPARE_PLAN_XML_QUERY</code> as a field
	 */
	public static org.jooq.Field<java.lang.String> preparePlanXmlQuery(org.jooq.Field<java.lang.String> planQuery) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.PreparePlanXmlQuery f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.PreparePlanXmlQuery();
		f.setPlanQuery(planQuery);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.PREPARE_RECORDS</code>
	 */
	public static org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord prepareRecords(org.jooq.Configuration configuration, org.jooq.Result<org.jooq.Record> planCur, java.lang.Integer iFormatFlags) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.PrepareRecords f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.PrepareRecords();
		f.setPlanCur(planCur);
		f.setIFormatFlags(iFormatFlags);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.PREPARE_RECORDS</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> prepareRecords(org.jooq.Result<org.jooq.Record> planCur, java.lang.Integer iFormatFlags) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.PrepareRecords f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.PrepareRecords();
		f.setPlanCur(planCur);
		f.setIFormatFlags(iFormatFlags);

		return f.asField();
	}

	/**
	 * Get <code>SYS.DBMS_XPLAN.PREPARE_RECORDS</code> as a field
	 */
	public static org.jooq.Field<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> prepareRecords(org.jooq.Field<org.jooq.Result<org.jooq.Record>> planCur, org.jooq.Field<java.lang.Integer> iFormatFlags) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.PrepareRecords f = new org.jooq.examples.oracle.sys.packages.dbms_xplan.PrepareRecords();
		f.setPlanCur(planCur);
		f.setIFormatFlags(iFormatFlags);

		return f.asField();
	}

	/**
	 * Call <code>SYS.DBMS_XPLAN.VALIDATE_FORMAT</code>
	 */
	public static java.lang.Integer validateFormat(org.jooq.Configuration configuration, java.lang.Object hasplanstats, java.lang.String format) {
		org.jooq.examples.oracle.sys.packages.dbms_xplan.ValidateFormat p = new org.jooq.examples.oracle.sys.packages.dbms_xplan.ValidateFormat();
		p.setHasplanstats(hasplanstats);
		p.setFormat(format);

		p.execute(configuration);
		return p.getFormatFlags();
	}

	/**
	 * No further instances allowed
	 */
	private DbmsXplan() {
		super("DBMS_XPLAN", org.jooq.examples.oracle.sys.Sys.SYS);
	}
}
