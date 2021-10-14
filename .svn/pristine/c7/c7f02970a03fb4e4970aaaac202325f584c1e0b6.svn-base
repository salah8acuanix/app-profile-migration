package com.airgap.approfiling.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ad_scheduled_tasks_run_result database table.
 * 
 */
@Entity
@Table(name="ad_scheduled_tasks_run_result")
public class AdScheduledTasksRunResult implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String result;

	//bi-directional many-to-one association to AdSchduledTasksRun
	@ManyToOne
	@JoinColumn(name="run", referencedColumnName="id")
	private AdScheduledTasksRun adSchduledTasksRun;

	public AdScheduledTasksRunResult() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public AdScheduledTasksRun getAdSchduledTasksRun() {
		return this.adSchduledTasksRun;
	}

	public void setAdSchduledTasksRun(AdScheduledTasksRun adSchduledTasksRun) {
		this.adSchduledTasksRun = adSchduledTasksRun;
	}

}