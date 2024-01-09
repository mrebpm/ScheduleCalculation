package com.dev.schedulecalculation;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ProcessInputData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PROCESSINPUTDATA_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "PROCESSINPUTDATA_ID_GENERATOR", sequenceName = "PROCESSINPUTDATA_ID_SEQ")
	private java.lang.Long id;
	@org.kie.api.definition.type.Label(value = "Completed Gate No")
	private java.lang.Integer gateCompleted;
	@org.kie.api.definition.type.Label(value = "Percentage Completion")
	private java.lang.Integer percentageCompleted;
	@org.kie.api.definition.type.Label(value = "User")
	private java.lang.String user;

	public ProcessInputData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Integer getGateCompleted() {
		return this.gateCompleted;
	}

	public void setGateCompleted(java.lang.Integer gateCompleted) {
		this.gateCompleted = gateCompleted;
	}

	public java.lang.Integer getPercentageCompleted() {
		return this.percentageCompleted;
	}

	public void setPercentageCompleted(java.lang.Integer percentageCompleted) {
		this.percentageCompleted = percentageCompleted;
	}

	public java.lang.String getUser() {
		return this.user;
	}

	public void setUser(java.lang.String user) {
		this.user = user;
	}

	public ProcessInputData(java.lang.Long id, java.lang.Integer gateCompleted,
			java.lang.Integer percentageCompleted, java.lang.String user) {
		this.id = id;
		this.gateCompleted = gateCompleted;
		this.percentageCompleted = percentageCompleted;
		this.user = user;
	}

}