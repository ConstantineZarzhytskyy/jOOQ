/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBookDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook, java.lang.Integer> {

	/**
	 * Create a new TBookDao without any factory
	 */
	public TBookDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook.class);
	}

	/**
	 * Create a new TBookDao with an attached factory
	 */
	public TBookDao(org.jooq.impl.Executor factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook.class, factory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * Fetch records that have <code>AUTHOR_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByAuthorId(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>CO_AUTHOR_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByCoAuthorId(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>DETAILS_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByDetailsId(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.DETAILS_ID, values);
	}

	/**
	 * Fetch records that have <code>TITLE IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByTitle(java.lang.String... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.TITLE, values);
	}

	/**
	 * Fetch records that have <code>PUBLISHED_IN IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByPublishedIn(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.PUBLISHED_IN, values);
	}

	/**
	 * Fetch records that have <code>LANGUAGE_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByLanguageId(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_TEXT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByContentText(java.lang.String... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_TEXT, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_PDF IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBook> fetchByContentPdf(byte[]... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_PDF, values);
	}
}
