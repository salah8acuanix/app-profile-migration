package com.airgap.approfiling.model;

/**
 * The persistent class for the recovery_api_options database table.
 * 
 */

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "recovery_api_options")
public class RecoveryApiOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on")
	private Date createdOn;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_on")
	@JsonFormat(pattern = "dd/MM/YY")
	private Date modifiedOn;

	private String value;

	// bi-directional many-to-one association to RecoveryApiCall
	@ManyToOne
	@JoinColumn(name = "api_call", referencedColumnName = "id")
	private RecoveryApiCall recoveryApiCall;

	// bi-directional many-to-one association to RecoveryApiCall
	@ManyToOne
	@JoinColumn(name = "param", referencedColumnName = "id")
	private RecoveryTemplateParam recoveryTemplateParam;

	public RecoveryApiOption() {}


}