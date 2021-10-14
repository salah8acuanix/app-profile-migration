package com.airgap.approfiling.model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the recovery_infrastructure_clients database table.
 * 
 */
@Entity
@Table(name="recovery_infrastructure_clients")
public class RecoveryInfrastructureClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="anomaly_status")
	private int anomalyStatus;

	private String backup;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="backup_date")
	private Date backupDate;

	private String client;

	@Column(name="client_name")
	private String clientName;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="`modified-on`")
	private Date modified_on;

	//bi-directional many-to-one association to RecoveryInfrastructure
	@ManyToOne
	@JoinColumn(name="infrastructure", referencedColumnName="id")
	private RecoveryInfrastructure recoveryInfrastructure;

	public RecoveryInfrastructureClient() {
	}
	public RecoveryInfrastructureClient(Integer id) {
		this.id = id;
	}
	public int getAnomalyStatus() {
		return this.anomalyStatus;
	}

	public void setAnomalyStatus(int anomalyStatus) {
		this.anomalyStatus = anomalyStatus;
	}

	public String getBackup() {
		return this.backup;
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	public Date getBackupDate() {
		return this.backupDate;
	}

	public void setBackupDate(Date backupDate) {
		this.backupDate = backupDate;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModified_on() {
		return this.modified_on;
	}

	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}

	public RecoveryInfrastructure getRecoveryInfrastructure() {
		return this.recoveryInfrastructure;
	}

	public void setRecoveryInfrastructure(RecoveryInfrastructure recoveryInfrastructure) {
		this.recoveryInfrastructure = recoveryInfrastructure;
	}

}