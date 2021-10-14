package com.airgap.approfiling.model;


import lombok.Data;


import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the recovery_template database table.
 * 
 */
@Data
@Entity
@Table(name="recovery_template")
@NamedQuery(name="RecoveryTemplate.findAll", query="SELECT r FROM RecoveryTemplate r")
public class RecoveryTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	private String json;

	@Column(name="modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_on")
	private Date modifiedOn;

	private String name;

	@Column(name="server_type")
	private Integer serverType;

	@Column(name="server_vendor")
	private Integer serverVendor;

	@Column(name="server_version")
	private Integer serverVersion;

	private Integer workload;

	//bi-directional many-to-one association to RecoveryTemplateParam
	@OneToMany(mappedBy="recoveryTemplate", cascade = CascadeType.ALL)
	private List<RecoveryTemplateParam> recoveryTemplateParams;

	public RecoveryTemplate() {}

	public RecoveryTemplate(Integer id) {
		this.id = id;
	}

	public RecoveryTemplateParam addRecoveryTemplateParam(RecoveryTemplateParam recoveryTemplateParam) {
		getRecoveryTemplateParams().add(recoveryTemplateParam);
		recoveryTemplateParam.setRecoveryTemplate(this);

		return recoveryTemplateParam;
	}

	public RecoveryTemplateParam removeRecoveryTemplateParam(RecoveryTemplateParam recoveryTemplateParam) {
		getRecoveryTemplateParams().remove(recoveryTemplateParam);
		recoveryTemplateParam.setRecoveryTemplate(null);

		return recoveryTemplateParam;
	}



}