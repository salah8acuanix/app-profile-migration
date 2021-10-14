package com.airgap.approfiling.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "recovery_api_response_params_values")
public class RecoveryApiResponseParamsValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "value")
    private String value;

    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)

    private Date modifiedOn;
    @OneToMany(mappedBy = "responseParameterValue")
    private Collection<RecoveryWorkflowDetails> recoveryWorkflowDetailsList;

    @JoinColumn(name = "response_param", referencedColumnName = "id")
    @ManyToOne
    private RecoveryApiResponseParam responseParam;

    public RecoveryApiResponseParamsValues() {
    }


    public RecoveryApiResponseParamsValues(Integer id) {
        this.id = id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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


    public Collection<RecoveryWorkflowDetails> getRecoveryWorkflowDetailsList() {
        return recoveryWorkflowDetailsList;
    }

    public void setRecoveryWorkflowDetailsList(Collection<RecoveryWorkflowDetails> recoveryWorkflowDetails) {
        this.recoveryWorkflowDetailsList = recoveryWorkflowDetails;
    }

    public RecoveryApiResponseParam getResponseParam() {
        return responseParam;
    }

    public void setResponseParam(RecoveryApiResponseParam responseParam) {
        this.responseParam = responseParam;
    }

}
