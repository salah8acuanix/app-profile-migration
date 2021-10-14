package com.airgap.approfiling.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the recovery_api_response_params database table.
 */
@Entity
@Table(name = "recovery_api_response_params")
public class RecoveryApiResponseParam implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "created_by")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on")
    @JsonFormat(pattern = "dd/MM/YY")
    private Date createdOn;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_on")
    @JsonFormat(pattern = "dd/MM/YY")
    private Date modifiedOn;

    @Column(name = "param_name")
    private String paramName;

//    @Column(name = "param_value")
//    private String paramValue;

    @OneToMany(mappedBy = "responseParam")
    private Collection<RecoveryApiResponseParamsValues> recoveryApiResponseParamsValuesList;


//    @Column(name = "param_value", length = 128)
//    private String paramValue;

    //bi-directional many-to-one association to RecoveryApiCall
    @ManyToOne
    @JoinColumn(name = "api_call", referencedColumnName = "id")
    private RecoveryApiCall recoveryApiCall;

    public RecoveryApiResponseParam() {
    }

    public RecoveryApiResponseParam(Integer id) {
        this.id = id;
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

    public Integer getId() {
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

    public Date getModifiedOn() {
        return this.modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getParamName() {
        return this.paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public RecoveryApiCall getRecoveryApiCall() {
        return this.recoveryApiCall;
    }

    public void setRecoveryApiCall(RecoveryApiCall recoveryApiCall) {
        this.recoveryApiCall = recoveryApiCall;
    }

    public Collection<RecoveryApiResponseParamsValues> getRecoveryApiResponseParamsValuesList() {
        return recoveryApiResponseParamsValuesList;
    }

    public void setRecoveryApiResponseParamsValuesList(Collection<RecoveryApiResponseParamsValues> recoveryApiResponseParamsValues) {
        this.recoveryApiResponseParamsValuesList = recoveryApiResponseParamsValues;
    }


}