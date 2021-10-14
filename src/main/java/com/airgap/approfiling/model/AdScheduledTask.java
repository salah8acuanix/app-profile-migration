package com.airgap.approfiling.model;



import java.io.Serializable;
import javax.persistence.*;
import javax.servlet.http.HttpSession;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ad_scheduled_tasks database table.
 * 
 */
@Entity
@Table(name="ad_scheduled_tasks")
public class AdScheduledTask  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_on")
	private Date modifiedOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_runtime")
	private Date lastRuntime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "next_runtime")
	private Date nextRuntime;

	private String name;

	@Column(name = "run_as")
	private Integer runAs;

	@Column(name = "airgap_workflow")
	private Integer airgapWorkflow;

	@Column(name = "run_bases")
	private Integer runBases;

	@Column(name = "run_day")
	private Integer runDay;

	@Column(name = "active")
	private Integer active;

	@Column(name = "run_time")
	private Time runTime;

	private Integer server;

	@Column(name = "ssh_script")
	private String sshScript;

	@Column(name = "ssh_script_file_path")
	private String sshScriptFilePath;

	//bi-directional many-to-one association to AdSchduledTasksRun
	@OneToMany(mappedBy = "adScheduledTask")
	private List<AdScheduledTasksRun> adSchduledTasksRuns;

	public AdScheduledTask() {
	}

	public Integer getAirgapWorkflow() {
		return airgapWorkflow;
	}

	public void setAirgapWorkflow(Integer airgapWorkflow) {
		this.airgapWorkflow = airgapWorkflow;
	}

	public Date getLastRuntime() {
		return lastRuntime;
	}

	public void setLastRuntime(Date lastRuntime) {
		this.lastRuntime = lastRuntime;
	}

	public Date getNextRuntime() {
		return nextRuntime;
	}

	public void setNextRuntime(Date nextRuntime) {
		this.nextRuntime = nextRuntime;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRunAs() {
		return this.runAs;
	}

	public void setRunAs(Integer runAs) {
		this.runAs = runAs;
	}

	public Integer getRunBases() {
		return this.runBases;
	}

	public void setRunBases(Integer runBases) {
		this.runBases = runBases;
	}

	public Integer getRunDay() {
		return this.runDay;
	}

	public void setRunDay(Integer runDay) {
		this.runDay = runDay;
	}

	public Time getRunTime() {
		return this.runTime;
	}

	public void setRunTime(Time runTime) {
		this.runTime = runTime;
	}

	public Integer getServer() {
		return this.server;
	}

	public void setServer(Integer server) {
		this.server = server;
	}

	public String getSshScript() {
		return this.sshScript;
	}

	public void setSshScript(String sshScript) {
		this.sshScript = sshScript;
	}

	public String getSshScriptFilePath() {
		return this.sshScriptFilePath;
	}

	public void setSshScriptFilePath(String sshScriptFilePath) {
		this.sshScriptFilePath = sshScriptFilePath;
	}

	public List<AdScheduledTasksRun> getAdSchduledTasksRuns() {
		return this.adSchduledTasksRuns;
	}

	public void setAdSchduledTasksRuns(List<AdScheduledTasksRun> adSchduledTasksRuns) {
		this.adSchduledTasksRuns = adSchduledTasksRuns;
	}

	public AdScheduledTasksRun addAdSchduledTasksRun(AdScheduledTasksRun adSchduledTasksRun) {
		getAdSchduledTasksRuns().add(adSchduledTasksRun);
		adSchduledTasksRun.setAdScheduledTask(this);

		return adSchduledTasksRun;
	}

	public AdScheduledTasksRun removeAdSchduledTasksRun(AdScheduledTasksRun adSchduledTasksRun) {
		getAdSchduledTasksRuns().remove(adSchduledTasksRun);
		adSchduledTasksRun.setAdScheduledTask(null);

		return adSchduledTasksRun;
	}


}