package com.airgap.approfiling.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the recovery_api_calls database table.
 */
@Entity
@Table(name = "recovery_api_calls")
public class RecoveryApiCall implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String backup;
    private String client;
    @Column(name = "created_by")
    private String createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd/MM/YY")
    @Column(name = "created_on")
    private Date createdOn;
    private String method;
    @Column(name = "modified_by")
    private String modifiedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_on")
    @JsonFormat(pattern = "dd/MM/YY")
    private Date modifiedOn;
    private String name;
    @Column(name = "notify_on_complete")
    private int notifyOnComplete;
    @Column(name = "notify_on_error")
    private int notifyOnError;
    @Column(name = "notify_on_start")
    private int notifyOnStart;
    private int server;
    private String ssh;
    @Column(name = "URI")
    private int uri;
    //bi-directional many-to-one association to RecoveryApiOption
    @OneToMany(mappedBy = "recoveryApiCall", cascade = CascadeType.ALL)
    private List<RecoveryApiOption> recoveryApiOptions;
    //bi-directional many-to-one association to RecoveryApiResponseParam
    @OneToMany(mappedBy = "recoveryApiCall", cascade = CascadeType.ALL)
    private List<RecoveryApiResponseParam> recoveryApiResponseParams;
    //bi-directional one-to-one association to RecoveryTemplateParam
    @OneToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "recovery_template", referencedColumnName = "id")
    private RecoveryTemplate recoveryTemplate;
    //bi-directional one-to-one association to RecoveryProfile
    @OneToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "recovery_profile", referencedColumnName = "id")
    private RecoveryProfile recoveryProfileBean;
    @Column(name = "recovery_option")
    private Integer option;

    public RecoveryApiCall() {
    }

    public RecoveryApiCall(Integer id) {
        this.id = id;
    }

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBackup() {
        return this.backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
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

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    public Integer getNotifyOnComplete() {
        return this.notifyOnComplete;
    }

    public void setNotifyOnComplete(int notifyOnComplete) {
        this.notifyOnComplete = notifyOnComplete;
    }

    public Integer getNotifyOnError() {
        return this.notifyOnError;
    }

    public void setNotifyOnError(int notifyOnError) {
        this.notifyOnError = notifyOnError;
    }

    public Integer getNotifyOnStart() {
        return this.notifyOnStart;
    }

    public void setNotifyOnStart(int notifyOnStart) {
        this.notifyOnStart = notifyOnStart;
    }

    public Integer getServer() {
        return this.server;
    }

    public void setServer(int server) {
        this.server = server;
    }

    public String getSsh() {
        return this.ssh;
    }

    public void setSsh(String ssh) {
        this.ssh = ssh;
    }

    public Integer getUri() {
        return this.uri;
    }

    public void setUri(int uri) {
        this.uri = uri;
    }

    public List<RecoveryApiOption> getRecoveryApiOptions() {
        return this.recoveryApiOptions;
    }

    public void setRecoveryApiOptions(List<RecoveryApiOption> recoveryApiOptions) {
        this.recoveryApiOptions = recoveryApiOptions;
    }

    public RecoveryApiOption addRecoveryApiOption(RecoveryApiOption recoveryApiOption) {
        getRecoveryApiOptions().add(recoveryApiOption);
        recoveryApiOption.setRecoveryApiCall(this);

        return recoveryApiOption;
    }

    public RecoveryApiOption removeRecoveryApiOption(RecoveryApiOption recoveryApiOption) {
        getRecoveryApiOptions().remove(recoveryApiOption);
        recoveryApiOption.setRecoveryApiCall(null);

        return recoveryApiOption;
    }

    public List<RecoveryApiResponseParam> getRecoveryApiResponseParams() {
        return this.recoveryApiResponseParams;
    }

    public void setRecoveryApiResponseParams(List<RecoveryApiResponseParam> recoveryApiResponseParams) {
        this.recoveryApiResponseParams = recoveryApiResponseParams;
    }

    public RecoveryApiResponseParam addRecoveryApiResponseParam(RecoveryApiResponseParam recoveryApiResponseParam) {
        getRecoveryApiResponseParams().add(recoveryApiResponseParam);
        recoveryApiResponseParam.setRecoveryApiCall(this);

        return recoveryApiResponseParam;
    }

    public RecoveryApiResponseParam removeRecoveryApiResponseParam(RecoveryApiResponseParam recoveryApiResponseParam) {
        getRecoveryApiResponseParams().remove(recoveryApiResponseParam);
        recoveryApiResponseParam.setRecoveryApiCall(null);

        return recoveryApiResponseParam;
    }


    public RecoveryProfile getRecoveryProfileBean() {
        return this.recoveryProfileBean;
    }

    public void setRecoveryProfileBean(RecoveryProfile recoveryProfileBean) {
        this.recoveryProfileBean = recoveryProfileBean;
    }


    public RecoveryTemplate getRecoveryTemplate() {
        return recoveryTemplate;
    }

    public void setRecoveryTemplate(RecoveryTemplate recoveryTemplate) {
        this.recoveryTemplate = recoveryTemplate;
    }


}