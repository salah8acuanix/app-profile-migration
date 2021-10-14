package com.airgap.approfiling.model;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name="test_client_import")
public class TestClientImport {


    private static final long serialVersionUID = 1L;

    @Id
    private Integer backupServer;

    @Column(name="airgap_workflow")
    private Integer airgapWorkflow;

    @Column(name="created_by")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on")
    private Date createdOn;

    @Column(name="import_location")
    private String importLocation;

    @Column(name="modified_by")
    private String modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modified_on")
    private Date modifiedOn;

    @Column(name="password")
    private String password;

    @Column(name="schedule_type")
    private Integer scheduleType;

    @Column(name="site")
    private Integer site;

    @Column(name="active")
    private Integer active;

    @Column(name="status")
    private Integer status;

    @Column(name="user_name")
    private String username;

    @Column(name="import_status")
    private String importStatus;

    @Column(name="sent_at")
    private Integer sentAt;

    @Column(name="run_day")
    private Integer runDay;

    @Column(name="runtime")
    private LocalTime runtime;

    @Column(name="scheduled_task")
    private Integer scheduledTask;

    @Column(name="import_metadata")
    private Integer importMetadata;

    @Column(name="trained")
    private Integer trained;

    @Column(name = "test_path")
    private String testPath;

    @Column(name="test")
    private Integer test;

    @Column(name="port")
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public TestClientImport() {
    }




    public Integer getBackupServer() {
        return backupServer;
    }

    public void setBackupServer(Integer backupServer) {
        this.backupServer = backupServer;
    }

    public Integer getAirgapWorkflow() {
        return airgapWorkflow;
    }

    public void setAirgapWorkflow(Integer airgapWorkflow) {
        this.airgapWorkflow = airgapWorkflow;
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

    public String getImportLocation() {
        return importLocation;
    }

    public void setImportLocation(String importLocation) {
        this.importLocation = importLocation;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
    }

    public Integer getSite() {
        return site;
    }

    public void setSite(Integer site) {
        this.site = site;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public Integer getSentAt() {
        return sentAt;
    }

    public void setSentAt(Integer sentAt) {
        this.sentAt = sentAt;
    }

    public Integer getRunDay() {
        return runDay;
    }

    public void setRunDay(Integer runDay) {
        this.runDay = runDay;
    }

    public LocalTime getRuntime() {
        return runtime;
    }

    public void setRuntime(LocalTime runtime) {
        this.runtime = runtime;
    }

    public Integer getScheduledTask() {
        return scheduledTask;
    }

    public void setScheduledTask(Integer scheduledTask) {
        this.scheduledTask = scheduledTask;
    }

    public Integer getImportMetadata() {
        return importMetadata;
    }

    public void setImportMetadata(Integer importMetadata) {
        this.importMetadata = importMetadata;
    }

    public Integer getTrained() {
        return trained;
    }

    public void setTrained(Integer trained) {
        this.trained = trained;
    }

    public String getTestPath() {
        return testPath;
    }

    public void setTestPath(String testPath) {
        this.testPath = testPath;
    }

    public Integer getTest() {
        return test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }


}
