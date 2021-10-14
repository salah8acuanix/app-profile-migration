package com.airgap.approfiling.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;


/**
 * The persistent class for the recovery_template_params database table.
 *
 */
@Data
@Entity
@Table(name="recovery_template_params")
@NamedQuery(name="RecoveryTemplateParam.findAll", query="SELECT r FROM RecoveryTemplateParam r")
public class RecoveryTemplateParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_on")
	private Date modifiedOn;

	@Column(name="mosified_by")
	private String modifiedBy;

	@Column(name="selected")
	private Integer selected;

	@Column(name="multivalued")
	private Integer multivalued;

	@Column(name="param_name")
	private String paramName;

	@Column(name="value_type")
	private String valueType;

	@Column(name="data_type")
	private Integer dataType;

	//bi-directional many-to-one association to RecoveryTemplate
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="template", referencedColumnName="id")
	private RecoveryTemplate recoveryTemplate;
	
	// bi-directional many-to-one association to RecoveryApiOption
	@OneToMany(mappedBy = "recoveryTemplateParam", cascade = CascadeType.ALL)
	private List<RecoveryApiOption> recoveryApiOptions;

	public RecoveryTemplateParam() {}

	public RecoveryTemplateParam(Integer id) {
		this.id = id;
	}


}