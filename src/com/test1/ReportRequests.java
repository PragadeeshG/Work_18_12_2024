package com.test1;

public class ReportRequests {
	private long requestCount;
	private long correlationId;
	private String additionalReportCharges;
	private String officeManagerEmail;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ReportRequests() {

	}

	public ReportRequests(long requestCount, long correlationId, String additionalReportCharges,
			String officeManagerEmail, String creationDate, String modifiedDate, String entityState) {
		super();
		this.requestCount = requestCount;
		this.correlationId = correlationId;
		this.additionalReportCharges = additionalReportCharges;
		this.officeManagerEmail = officeManagerEmail;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getRequestCount() {
		return requestCount;
	}

	public void setRequestCount(long requestCount) {
		this.requestCount = requestCount;
	}

	public long getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(long correlationId) {
		this.correlationId = correlationId;
	}

	public String getAdditionalReportCharges() {
		return additionalReportCharges;
	}

	public void setAdditionalReportCharges(String additionalReportCharges) {
		this.additionalReportCharges = additionalReportCharges;
	}

	public String getOfficeManagerEmail() {
		return officeManagerEmail;
	}

	public void setOfficeManagerEmail(String officeManagerEmail) {
		this.officeManagerEmail = officeManagerEmail;
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
