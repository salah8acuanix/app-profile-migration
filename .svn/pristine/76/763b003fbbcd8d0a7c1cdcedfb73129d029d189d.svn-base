package com.airgap.approfiling.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ad_schduled_tasks_run database table.
 * 
 */
@Entity
@Table(name="ad_scheduled_tasks_run")
public class AdScheduledTasksRun implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="run_at")
	private Date runAt;

	@Column(name="run_by")
	private String runBy;

	//bi-directional many-to-one association to AdScheduledTask
	@ManyToOne
	@JoinColumn(name="task", referencedColumnName="id")
	private AdScheduledTask adScheduledTask;

	//bi-directional many-to-one association to AdScheduledTasksRunResult
	@OneToMany(mappedBy="adSchduledTasksRun")
	private List<AdScheduledTasksRunResult> adScheduledTasksRunResults;

	public AdScheduledTasksRun() {
	}

	public Date getRunAt() {
		return this.runAt;
	}

	public void setRunAt(Date runAt) {
		this.runAt = runAt;
	}

	public String getRunBy() {
		return this.runBy;
	}

	public void setRunBy(String runBy) {
		this.runBy = runBy;
	}

	public AdScheduledTask getAdScheduledTask() {
		return this.adScheduledTask;
	}

	public void setAdScheduledTask(AdScheduledTask adScheduledTask) {
		this.adScheduledTask = adScheduledTask;
	}

	public List<AdScheduledTasksRunResult> getAdScheduledTasksRunResults() {
		return this.adScheduledTasksRunResults;
	}

	public void setAdScheduledTasksRunResults(List<AdScheduledTasksRunResult> adScheduledTasksRunResults) {
		this.adScheduledTasksRunResults = adScheduledTasksRunResults;
	}

	public AdScheduledTasksRunResult addAdScheduledTasksRunResult(AdScheduledTasksRunResult adScheduledTasksRunResult) {
		getAdScheduledTasksRunResults().add(adScheduledTasksRunResult);
		adScheduledTasksRunResult.setAdSchduledTasksRun(this);

		return adScheduledTasksRunResult;
	}

	public AdScheduledTasksRunResult removeAdScheduledTasksRunResult(AdScheduledTasksRunResult adScheduledTasksRunResult) {
		getAdScheduledTasksRunResults().remove(adScheduledTasksRunResult);
		adScheduledTasksRunResult.setAdSchduledTasksRun(null);

		return adScheduledTasksRunResult;
	}

}