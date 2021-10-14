package com.airgap.approfiling.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the recovery_profile database table.
 *
 */
@Entity
@Table(name="recovery_profile")
public class RecoveryProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="backup_server")
	private int backupServer;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_on")
	private Date modifiedOn;

	private String description;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String owner;

	@OneToMany(mappedBy = "recoveryProfile", cascade = CascadeType.ALL)
	private List<RecoveryWorkflow> recoveryWorkflows;

	public List<RecoveryWorkflow> getRecoveryWorkflows() {
		return recoveryWorkflows;
	}

	public void setRecoveryWorkflows(List<RecoveryWorkflow> recoveryWorkflow) {
		this.recoveryWorkflows = recoveryWorkflow;
	}

	public RecoveryProfile(int id) {
		this.id = id;
	}

	//bi-directional many-to-one association to RecoveryProfileClientsBackups
	@OneToMany(mappedBy="profile", cascade = CascadeType.ALL)
	private List<RecoveryProfileClientsBackups> recoveryProfileClientsBackups;


	public List<RecoveryProfileClientsBackups> getRecoveryProfileClientsBackups() {
		return recoveryProfileClientsBackups;
	}

	public void setRecoveryProfileClientsBackups(List<RecoveryProfileClientsBackups> recoveryProfileClientsBackups) {
		this.recoveryProfileClientsBackups = recoveryProfileClientsBackups;
	}

	public RecoveryProfile() {
	}

	public RecoveryProfile(Integer id) {
		this.id = id;
	}


	public int getBackupServer() {
		return this.backupServer;
	}

	public void setBackupServer(int backupServer) {
		this.backupServer = backupServer;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}