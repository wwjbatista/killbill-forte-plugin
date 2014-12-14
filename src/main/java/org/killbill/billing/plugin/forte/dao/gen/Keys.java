/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.forte.dao.gen;

/**
 * A class modelling foreign key relationships between tables of the <code>killbill</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.killbill.billing.plugin.forte.dao.gen.tables.records.FortePaymentMethodsRecord, org.jooq.types.UInteger> IDENTITY_FORTE_PAYMENT_METHODS = Identities0.IDENTITY_FORTE_PAYMENT_METHODS;
	public static final org.jooq.Identity<org.killbill.billing.plugin.forte.dao.gen.tables.records.ForteResponsesRecord, org.jooq.types.UInteger> IDENTITY_FORTE_RESPONSES = Identities0.IDENTITY_FORTE_RESPONSES;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.forte.dao.gen.tables.records.FortePaymentMethodsRecord> KEY_FORTE_PAYMENT_METHODS_PRIMARY = UniqueKeys0.KEY_FORTE_PAYMENT_METHODS_PRIMARY;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.forte.dao.gen.tables.records.FortePaymentMethodsRecord> KEY_FORTE_PAYMENT_METHODS_FORTE_PAYMENT_METHODS_KB_PAYMENT_ID = UniqueKeys0.KEY_FORTE_PAYMENT_METHODS_FORTE_PAYMENT_METHODS_KB_PAYMENT_ID;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.forte.dao.gen.tables.records.ForteResponsesRecord> KEY_FORTE_RESPONSES_PRIMARY = UniqueKeys0.KEY_FORTE_RESPONSES_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.killbill.billing.plugin.forte.dao.gen.tables.records.FortePaymentMethodsRecord, org.jooq.types.UInteger> IDENTITY_FORTE_PAYMENT_METHODS = createIdentity(org.killbill.billing.plugin.forte.dao.gen.tables.FortePaymentMethods.FORTE_PAYMENT_METHODS, org.killbill.billing.plugin.forte.dao.gen.tables.FortePaymentMethods.FORTE_PAYMENT_METHODS.RECORD_ID);
		public static org.jooq.Identity<org.killbill.billing.plugin.forte.dao.gen.tables.records.ForteResponsesRecord, org.jooq.types.UInteger> IDENTITY_FORTE_RESPONSES = createIdentity(org.killbill.billing.plugin.forte.dao.gen.tables.ForteResponses.FORTE_RESPONSES, org.killbill.billing.plugin.forte.dao.gen.tables.ForteResponses.FORTE_RESPONSES.RECORD_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.forte.dao.gen.tables.records.FortePaymentMethodsRecord> KEY_FORTE_PAYMENT_METHODS_PRIMARY = createUniqueKey(org.killbill.billing.plugin.forte.dao.gen.tables.FortePaymentMethods.FORTE_PAYMENT_METHODS, org.killbill.billing.plugin.forte.dao.gen.tables.FortePaymentMethods.FORTE_PAYMENT_METHODS.RECORD_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.forte.dao.gen.tables.records.FortePaymentMethodsRecord> KEY_FORTE_PAYMENT_METHODS_FORTE_PAYMENT_METHODS_KB_PAYMENT_ID = createUniqueKey(org.killbill.billing.plugin.forte.dao.gen.tables.FortePaymentMethods.FORTE_PAYMENT_METHODS, org.killbill.billing.plugin.forte.dao.gen.tables.FortePaymentMethods.FORTE_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.forte.dao.gen.tables.records.ForteResponsesRecord> KEY_FORTE_RESPONSES_PRIMARY = createUniqueKey(org.killbill.billing.plugin.forte.dao.gen.tables.ForteResponses.FORTE_RESPONSES, org.killbill.billing.plugin.forte.dao.gen.tables.ForteResponses.FORTE_RESPONSES.RECORD_ID);
	}
}
