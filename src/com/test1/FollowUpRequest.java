package com.test1;

public class FollowUpRequest {
	private long correlationId;
	private String paymentId;
	private String initialEvaluationCompletedDate;
	private String paymentStatus;
	private String followUpAppointmentDate;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FollowUpRequest() {

	}

	public FollowUpRequest(long correlationId, String paymentId, String initialEvaluationCompletedDate,
			String paymentStatus, String followUpAppointmentDate, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.correlationId = correlationId;
		this.paymentId = paymentId;
		this.initialEvaluationCompletedDate = initialEvaluationCompletedDate;
		this.paymentStatus = paymentStatus;
		this.followUpAppointmentDate = followUpAppointmentDate;
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

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getInitialEvaluationCompletedDate() {
		return initialEvaluationCompletedDate;
	}

	public void setInitialEvaluationCompletedDate(String initialEvaluationCompletedDate) {
		this.initialEvaluationCompletedDate = initialEvaluationCompletedDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getFollowUpAppointmentDate() {
		return followUpAppointmentDate;
	}

	public void setFollowUpAppointmentDate(String followUpAppointmentDate) {
		this.followUpAppointmentDate = followUpAppointmentDate;
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
