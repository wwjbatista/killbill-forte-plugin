/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.forte.dao.gen.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForteResponsesRecord extends org.jooq.impl.UpdatableRecordImpl<org.killbill.billing.plugin.forte.dao.gen.tables.records.ForteResponsesRecord> {

	private static final long serialVersionUID = 64314078;

	/**
	 * Setter for <code>killbill.forte_responses.record_id</code>.
	 */
	public void setRecordId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.record_id</code>.
	 */
	public org.jooq.types.UInteger getRecordId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>killbill.forte_responses.kb_account_id</code>.
	 */
	public void setKbAccountId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.kb_account_id</code>.
	 */
	public java.lang.String getKbAccountId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>killbill.forte_responses.kb_payment_id</code>.
	 */
	public void setKbPaymentId(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.kb_payment_id</code>.
	 */
	public java.lang.String getKbPaymentId() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>killbill.forte_responses.kb_payment_transaction_id</code>.
	 */
	public void setKbPaymentTransactionId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.kb_payment_transaction_id</code>.
	 */
	public java.lang.String getKbPaymentTransactionId() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>killbill.forte_responses.transaction_type</code>.
	 */
	public void setTransactionType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.transaction_type</code>.
	 */
	public java.lang.String getTransactionType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>killbill.forte_responses.amount</code>.
	 */
	public void setAmount(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.amount</code>.
	 */
	public java.math.BigDecimal getAmount() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>killbill.forte_responses.currency</code>.
	 */
	public void setCurrency(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.currency</code>.
	 */
	public java.lang.String getCurrency() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_id</code>.
	 */
	public void setPgMerchantId(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_id</code>.
	 */
	public java.lang.String getPgMerchantId() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_transaction_type</code>.
	 */
	public void setPgTransactionType(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_transaction_type</code>.
	 */
	public java.lang.String getPgTransactionType() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_1</code>.
	 */
	public void setPgMerchantData_1(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_1</code>.
	 */
	public java.lang.String getPgMerchantData_1() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_2</code>.
	 */
	public void setPgMerchantData_2(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_2</code>.
	 */
	public java.lang.String getPgMerchantData_2() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_3</code>.
	 */
	public void setPgMerchantData_3(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_3</code>.
	 */
	public java.lang.String getPgMerchantData_3() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_4</code>.
	 */
	public void setPgMerchantData_4(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_4</code>.
	 */
	public java.lang.String getPgMerchantData_4() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_5</code>.
	 */
	public void setPgMerchantData_5(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_5</code>.
	 */
	public java.lang.String getPgMerchantData_5() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_6</code>.
	 */
	public void setPgMerchantData_6(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_6</code>.
	 */
	public java.lang.String getPgMerchantData_6() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_7</code>.
	 */
	public void setPgMerchantData_7(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_7</code>.
	 */
	public java.lang.String getPgMerchantData_7() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_8</code>.
	 */
	public void setPgMerchantData_8(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_8</code>.
	 */
	public java.lang.String getPgMerchantData_8() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_merchant_data_9</code>.
	 */
	public void setPgMerchantData_9(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_merchant_data_9</code>.
	 */
	public java.lang.String getPgMerchantData_9() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_total_amount</code>.
	 */
	public void setPgTotalAmount(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_total_amount</code>.
	 */
	public java.lang.String getPgTotalAmount() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_sales_tax_amount</code>.
	 */
	public void setPgSalesTaxAmount(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_sales_tax_amount</code>.
	 */
	public java.lang.String getPgSalesTaxAmount() {
		return (java.lang.String) getValue(19);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_customer_token</code>.
	 */
	public void setPgCustomerToken(java.lang.String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_customer_token</code>.
	 */
	public java.lang.String getPgCustomerToken() {
		return (java.lang.String) getValue(20);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_client_id</code>.
	 */
	public void setPgClientId(java.lang.String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_client_id</code>.
	 */
	public java.lang.String getPgClientId() {
		return (java.lang.String) getValue(21);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_consumer_id</code>.
	 */
	public void setPgConsumerId(java.lang.String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_consumer_id</code>.
	 */
	public java.lang.String getPgConsumerId() {
		return (java.lang.String) getValue(22);
	}

	/**
	 * Setter for <code>killbill.forte_responses.ecom_consumerorderid</code>.
	 */
	public void setEcomConsumerorderid(java.lang.String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.ecom_consumerorderid</code>.
	 */
	public java.lang.String getEcomConsumerorderid() {
		return (java.lang.String) getValue(23);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_payment_token</code>.
	 */
	public void setPgPaymentToken(java.lang.String value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_payment_token</code>.
	 */
	public java.lang.String getPgPaymentToken() {
		return (java.lang.String) getValue(24);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_payment_method_id</code>.
	 */
	public void setPgPaymentMethodId(java.lang.String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_payment_method_id</code>.
	 */
	public java.lang.String getPgPaymentMethodId() {
		return (java.lang.String) getValue(25);
	}

	/**
	 * Setter for <code>killbill.forte_responses.ecom_walletid</code>.
	 */
	public void setEcomWalletid(java.lang.String value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.ecom_walletid</code>.
	 */
	public java.lang.String getEcomWalletid() {
		return (java.lang.String) getValue(26);
	}

	/**
	 * Setter for <code>killbill.forte_responses.ecom_billto_postal_name_first</code>.
	 */
	public void setEcomBilltoPostalNameFirst(java.lang.String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.ecom_billto_postal_name_first</code>.
	 */
	public java.lang.String getEcomBilltoPostalNameFirst() {
		return (java.lang.String) getValue(27);
	}

	/**
	 * Setter for <code>killbill.forte_responses.ecom_billto_postal_name_last</code>.
	 */
	public void setEcomBilltoPostalNameLast(java.lang.String value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.ecom_billto_postal_name_last</code>.
	 */
	public java.lang.String getEcomBilltoPostalNameLast() {
		return (java.lang.String) getValue(28);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_billto_postal_name_company</code>.
	 */
	public void setPgBilltoPostalNameCompany(java.lang.String value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_billto_postal_name_company</code>.
	 */
	public java.lang.String getPgBilltoPostalNameCompany() {
		return (java.lang.String) getValue(29);
	}

	/**
	 * Setter for <code>killbill.forte_responses.ecom_billto_online_email</code>.
	 */
	public void setEcomBilltoOnlineEmail(java.lang.String value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.ecom_billto_online_email</code>.
	 */
	public java.lang.String getEcomBilltoOnlineEmail() {
		return (java.lang.String) getValue(30);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_response_type</code>.
	 */
	public void setPgResponseType(java.lang.String value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_response_type</code>.
	 */
	public java.lang.String getPgResponseType() {
		return (java.lang.String) getValue(31);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_response_code</code>.
	 */
	public void setPgResponseCode(java.lang.String value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_response_code</code>.
	 */
	public java.lang.String getPgResponseCode() {
		return (java.lang.String) getValue(32);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_response_description</code>.
	 */
	public void setPgResponseDescription(java.lang.String value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_response_description</code>.
	 */
	public java.lang.String getPgResponseDescription() {
		return (java.lang.String) getValue(33);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_avs_result</code>.
	 */
	public void setPgAvsResult(java.lang.String value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_avs_result</code>.
	 */
	public java.lang.String getPgAvsResult() {
		return (java.lang.String) getValue(34);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_trace_number</code>.
	 */
	public void setPgTraceNumber(java.lang.String value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_trace_number</code>.
	 */
	public java.lang.String getPgTraceNumber() {
		return (java.lang.String) getValue(35);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_authorization_code</code>.
	 */
	public void setPgAuthorizationCode(java.lang.String value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_authorization_code</code>.
	 */
	public java.lang.String getPgAuthorizationCode() {
		return (java.lang.String) getValue(36);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_preauth_result</code>.
	 */
	public void setPgPreauthResult(java.lang.String value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_preauth_result</code>.
	 */
	public java.lang.String getPgPreauthResult() {
		return (java.lang.String) getValue(37);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_preauth_description</code>.
	 */
	public void setPgPreauthDescription(java.lang.String value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_preauth_description</code>.
	 */
	public java.lang.String getPgPreauthDescription() {
		return (java.lang.String) getValue(38);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_preauth_neg_report</code>.
	 */
	public void setPgPreauthNegReport(java.lang.String value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_preauth_neg_report</code>.
	 */
	public java.lang.String getPgPreauthNegReport() {
		return (java.lang.String) getValue(39);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_cvv2_result</code>.
	 */
	public void setPgCvv2Result(java.lang.String value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_cvv2_result</code>.
	 */
	public java.lang.String getPgCvv2Result() {
		return (java.lang.String) getValue(40);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_3d_secure_result</code>.
	 */
	public void setPg_3dSecureResult(java.lang.String value) {
		setValue(41, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_3d_secure_result</code>.
	 */
	public java.lang.String getPg_3dSecureResult() {
		return (java.lang.String) getValue(41);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_available_card_balance</code>.
	 */
	public void setPgAvailableCardBalance(java.lang.String value) {
		setValue(42, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_available_card_balance</code>.
	 */
	public java.lang.String getPgAvailableCardBalance() {
		return (java.lang.String) getValue(42);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_requested_amount</code>.
	 */
	public void setPgRequestedAmount(java.lang.String value) {
		setValue(43, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_requested_amount</code>.
	 */
	public java.lang.String getPgRequestedAmount() {
		return (java.lang.String) getValue(43);
	}

	/**
	 * Setter for <code>killbill.forte_responses.pg_convenience_fee</code>.
	 */
	public void setPgConvenienceFee(java.lang.String value) {
		setValue(44, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.pg_convenience_fee</code>.
	 */
	public java.lang.String getPgConvenienceFee() {
		return (java.lang.String) getValue(44);
	}

	/**
	 * Setter for <code>killbill.forte_responses.additional_data</code>.
	 */
	public void setAdditionalData(java.lang.String value) {
		setValue(45, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.additional_data</code>.
	 */
	public java.lang.String getAdditionalData() {
		return (java.lang.String) getValue(45);
	}

	/**
	 * Setter for <code>killbill.forte_responses.created_date</code>.
	 */
	public void setCreatedDate(java.sql.Timestamp value) {
		setValue(46, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.created_date</code>.
	 */
	public java.sql.Timestamp getCreatedDate() {
		return (java.sql.Timestamp) getValue(46);
	}

	/**
	 * Setter for <code>killbill.forte_responses.kb_tenant_id</code>.
	 */
	public void setKbTenantId(java.lang.String value) {
		setValue(47, value);
	}

	/**
	 * Getter for <code>killbill.forte_responses.kb_tenant_id</code>.
	 */
	public java.lang.String getKbTenantId() {
		return (java.lang.String) getValue(47);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ForteResponsesRecord
	 */
	public ForteResponsesRecord() {
		super(org.killbill.billing.plugin.forte.dao.gen.tables.ForteResponses.FORTE_RESPONSES);
	}

	/**
	 * Create a detached, initialised ForteResponsesRecord
	 */
	public ForteResponsesRecord(org.jooq.types.UInteger recordId, java.lang.String kbAccountId, java.lang.String kbPaymentId, java.lang.String kbPaymentTransactionId, java.lang.String transactionType, java.math.BigDecimal amount, java.lang.String currency, java.lang.String pgMerchantId, java.lang.String pgTransactionType, java.lang.String pgMerchantData_1, java.lang.String pgMerchantData_2, java.lang.String pgMerchantData_3, java.lang.String pgMerchantData_4, java.lang.String pgMerchantData_5, java.lang.String pgMerchantData_6, java.lang.String pgMerchantData_7, java.lang.String pgMerchantData_8, java.lang.String pgMerchantData_9, java.lang.String pgTotalAmount, java.lang.String pgSalesTaxAmount, java.lang.String pgCustomerToken, java.lang.String pgClientId, java.lang.String pgConsumerId, java.lang.String ecomConsumerorderid, java.lang.String pgPaymentToken, java.lang.String pgPaymentMethodId, java.lang.String ecomWalletid, java.lang.String ecomBilltoPostalNameFirst, java.lang.String ecomBilltoPostalNameLast, java.lang.String pgBilltoPostalNameCompany, java.lang.String ecomBilltoOnlineEmail, java.lang.String pgResponseType, java.lang.String pgResponseCode, java.lang.String pgResponseDescription, java.lang.String pgAvsResult, java.lang.String pgTraceNumber, java.lang.String pgAuthorizationCode, java.lang.String pgPreauthResult, java.lang.String pgPreauthDescription, java.lang.String pgPreauthNegReport, java.lang.String pgCvv2Result, java.lang.String pg_3dSecureResult, java.lang.String pgAvailableCardBalance, java.lang.String pgRequestedAmount, java.lang.String pgConvenienceFee, java.lang.String additionalData, java.sql.Timestamp createdDate, java.lang.String kbTenantId) {
		super(org.killbill.billing.plugin.forte.dao.gen.tables.ForteResponses.FORTE_RESPONSES);

		setValue(0, recordId);
		setValue(1, kbAccountId);
		setValue(2, kbPaymentId);
		setValue(3, kbPaymentTransactionId);
		setValue(4, transactionType);
		setValue(5, amount);
		setValue(6, currency);
		setValue(7, pgMerchantId);
		setValue(8, pgTransactionType);
		setValue(9, pgMerchantData_1);
		setValue(10, pgMerchantData_2);
		setValue(11, pgMerchantData_3);
		setValue(12, pgMerchantData_4);
		setValue(13, pgMerchantData_5);
		setValue(14, pgMerchantData_6);
		setValue(15, pgMerchantData_7);
		setValue(16, pgMerchantData_8);
		setValue(17, pgMerchantData_9);
		setValue(18, pgTotalAmount);
		setValue(19, pgSalesTaxAmount);
		setValue(20, pgCustomerToken);
		setValue(21, pgClientId);
		setValue(22, pgConsumerId);
		setValue(23, ecomConsumerorderid);
		setValue(24, pgPaymentToken);
		setValue(25, pgPaymentMethodId);
		setValue(26, ecomWalletid);
		setValue(27, ecomBilltoPostalNameFirst);
		setValue(28, ecomBilltoPostalNameLast);
		setValue(29, pgBilltoPostalNameCompany);
		setValue(30, ecomBilltoOnlineEmail);
		setValue(31, pgResponseType);
		setValue(32, pgResponseCode);
		setValue(33, pgResponseDescription);
		setValue(34, pgAvsResult);
		setValue(35, pgTraceNumber);
		setValue(36, pgAuthorizationCode);
		setValue(37, pgPreauthResult);
		setValue(38, pgPreauthDescription);
		setValue(39, pgPreauthNegReport);
		setValue(40, pgCvv2Result);
		setValue(41, pg_3dSecureResult);
		setValue(42, pgAvailableCardBalance);
		setValue(43, pgRequestedAmount);
		setValue(44, pgConvenienceFee);
		setValue(45, additionalData);
		setValue(46, createdDate);
		setValue(47, kbTenantId);
	}
}
