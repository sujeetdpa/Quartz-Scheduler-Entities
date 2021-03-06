package com.learning.learningquartzscheduler.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_cron_triggers database table.
 * 
 */
@Entity
@Table(name="qrtz_cron_triggers")
@NamedQuery(name="QrtzCronTrigger.findAll", query="SELECT q FROM QrtzCronTrigger q")
public class QrtzCronTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QrtzCronTriggerPK id;

	@Column(name="CRON_EXPRESSION")
	private String cronExpression;


	@Column(name="TIME_ZONE_ID")
	private String timeZoneId;

	//bi-directional many-to-one association to QrtzTrigger
	@ManyToOne
//	@JoinTable(name = "qrtz_triggers",
//			joinColumns = {
//					@JoinColumn(name="SCHED_NAME", referencedColumnName="SCHED_NAME"),
//					@JoinColumn(name="TRIGGER_GROUP", referencedColumnName="TRIGGER_GROUP"),
//					@JoinColumn(name="TRIGGER_NAME", referencedColumnName="TRIGGER_NAME")
//			}
//	)
	private QrtzTrigger qrtzTrigger;

	public QrtzCronTrigger() {
	}

	public QrtzCronTriggerPK getId() {
		return this.id;
	}

	public void setId(QrtzCronTriggerPK id) {
		this.id = id;
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public QrtzTrigger getQrtzTrigger() {
		return this.qrtzTrigger;
	}

	public void setQrtzTrigger(QrtzTrigger qrtzTrigger) {
		this.qrtzTrigger = qrtzTrigger;
	}

}