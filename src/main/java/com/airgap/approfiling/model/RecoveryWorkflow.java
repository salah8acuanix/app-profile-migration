package com.airgap.approfiling.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "recovery_workflow")
public class RecoveryWorkflow implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull(message = "Recovery workFlow name is mandatory")
    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Integer status;
    //    @NotBlank(message = "backup Server is mandatory")
    @Column(name = "backup_server")
    private Integer backupServer;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;


    @Column(name = "last_modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;


    @OneToMany(mappedBy = "recoveryWorkflow", cascade = CascadeType.ALL)
    private List<RecoveryWorkflowDetails> recoveryWorkflowDetailsList;

    //    @NotBlank(message = "Recovery Profile is mandatory")
    @JoinColumn(name = "recovery_profile", referencedColumnName = "id")
    @ManyToOne
    private RecoveryProfile recoveryProfile;



    //bi-directional many-to-one association to WorkflowsDtl
    @OneToMany(mappedBy="recoveryWorkflow", cascade = CascadeType.ALL)
    private List<RecoveryWorkflowGroup> recoveryWorkflowGroups;


    public RecoveryWorkflow() {
    }

    public RecoveryWorkflow(Integer id) {
        this.id = id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBackupServer() {
        return backupServer;
    }

    public void setBackupServer(Integer backupServer) {
        this.backupServer = backupServer;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List<RecoveryWorkflowDetails> getRecoveryWorkflowDetailsList() {
        return recoveryWorkflowDetailsList;
    }

    public void setRecoveryWorkflowDetailsList(List<RecoveryWorkflowDetails> recoveryWorkflowDetailsList) {
        this.recoveryWorkflowDetailsList = recoveryWorkflowDetailsList;
    }


    public List<RecoveryWorkflowDetails> getRecoveryWorkflowDetails() {
        return recoveryWorkflowDetailsList;
    }

    public void setRecoveryWorkflowDetails(List<RecoveryWorkflowDetails> recoveryWorkflowDetails) {
        this.recoveryWorkflowDetailsList = recoveryWorkflowDetails;
    }

    public List<RecoveryWorkflowGroup> getRecoveryWorkflowGroups() {
        return recoveryWorkflowGroups;
    }

    public void setRecoveryWorkflowGroups(List<RecoveryWorkflowGroup> recoveryWorkflowGroups) {
        this.recoveryWorkflowGroups = recoveryWorkflowGroups;
    }

    public RecoveryProfile getRecoveryProfile() {
        return recoveryProfile;
    }

    public void setRecoveryProfile(RecoveryProfile recoveryProfile) {
        this.recoveryProfile = recoveryProfile;
    }


}




