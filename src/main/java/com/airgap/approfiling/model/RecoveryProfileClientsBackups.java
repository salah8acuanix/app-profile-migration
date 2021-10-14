package com.airgap.approfiling.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="recovery_profile_clients_backups")
public class RecoveryProfileClientsBackups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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


    //bi-directional many-to-one association to recoveryProfile
    @ManyToOne
    private RecoveryProfile profile;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "workload_type")
    private String workloadType;

    @Column(name = "client_backup_id")
    private String clientBackupId;

    @Column(name = "backup_id")
    private String backupId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="backup_time")
    private Date backupTime;

    public String getClientBackupId() {
        return clientBackupId;
    }

    public void setClientBackupId(String clientBackupId) {
        this.clientBackupId = clientBackupId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public RecoveryProfile getProfile() {
        return profile;
    }

    public void setProfile(RecoveryProfile profile) {
        this.profile = profile;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public Date getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(Date backupTime) {
        this.backupTime = backupTime;
    }


}
