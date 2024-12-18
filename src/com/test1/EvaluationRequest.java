package com.test1;

public class EvaluationRequest {
	private long correlationId;
	private String orderId;
	private String paymentLink;
	private String paymentType;
	private String officeDerEmail;
	private String emailToClient;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public EvaluationRequest() {

	}

	public EvaluationRequest(long correlationId, String orderId, String paymentLink, String paymentType,
			String officeDerEmail, String emailToClient, String creationDate, String modifiedDate, String entityState) {
		super();
		this.correlationId = correlationId;
		this.orderId = orderId;
		this.paymentLink = paymentLink;
		this.paymentType = paymentType;
		this.officeDerEmail = officeDerEmail;
		this.emailToClient = emailToClient;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(long correlationId) {
		this.correlationId = correlationId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPaymentLink() {
		return paymentLink;
	}

	public void setPaymentLink(String paymentLink) {
		this.paymentLink = paymentLink;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getOfficeDerEmail() {
		return officeDerEmail;
	}

	public void setOfficeDerEmail(String officeDerEmail) {
		this.officeDerEmail = officeDerEmail;
	}

	public String getEmailToClient() {
		return emailToClient;
	}

	public void setEmailToClient(String emailToClient) {
		this.emailToClient = emailToClient;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
