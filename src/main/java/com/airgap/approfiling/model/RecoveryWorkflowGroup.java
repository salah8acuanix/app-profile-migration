package com.airgap.approfiling.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "recovery_workflow_groups")
public class RecoveryWorkflowGroup {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;


    @Column(name="order_no")
    private Integer orderNo;

    @Column(name="run_groups_in_parallel")
    private Integer runGroupsInParallel;


    //bi-directional many-to-one association to WorkflowsDtl
    @OneToMany(mappedBy="recoveryWorkflowGroup", cascade = CascadeType.ALL)
    private List<RecoveryWorkflowDetails>recoveryWorkflowDetails;

    //bi-directional many-to-one association to Workflow
    @ManyToOne
    private RecoveryWorkflow recoveryWorkflow;

    public RecoveryWorkflowGroup() {
    }

    public RecoveryWorkflowGroup(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getRunGroupsInParallel() {
        return runGroupsInParallel;
    }

    public void setRunGroupsInParallel(Integer runGroupsInParallel) {
        this.runGroupsInParallel = runGroupsInParallel;
    }

    public List<RecoveryWorkflowDetails> getRecoveryWorkflowDetails() {
        return recoveryWorkflowDetails;
    }

    public void setRecoveryWorkflowDetails(List<RecoveryWorkflowDetails> recoveryWorkflowDetails) {
        this.recoveryWorkflowDetails = recoveryWorkflowDetails;
    }

    public RecoveryWorkflow getRecoveryWorkflow() {
        return recoveryWorkflow;
    }

    public void setRecoveryWorkflow(RecoveryWorkflow recoveryWorkflow) {
        this.recoveryWorkflow = recoveryWorkflow;
    }

}
