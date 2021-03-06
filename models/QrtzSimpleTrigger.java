package com.learning.learningquartzscheduler.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the qrtz_simple_triggers database table.
 * 
 */
@Entity
@Table(name="qrtz_simple_triggers")
@NamedQuery(name="QrtzSimpleTrigger.findAll", query="SELECT q FROM QrtzSimpleTrigger q")
public class QrtzSimpleTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QrtzSimpleTriggerPK id;

	@Column(name="REPEAT_COUNT")
	private BigInteger repeatCount;


	@Column(name="REPEAT_INTERVAL")
	private BigInteger repeatInterval;


	@Column(name="TIMES_TRIGGERED")
	private BigInteger timesTriggered;

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

	public QrtzSimpleTrigger() {
	}

	public QrtzSimpleTriggerPK getId() {
		return this.id;
	}

	public void setId(QrtzSimpleTriggerPK id) {
		this.id = id;
	}

	public BigInteger getRepeatCount() {
		return this.repeatCount;
	}

	public void setRepeatCount(BigInteger repeatCount) {
		this.repeatCount = repeatCount;
	}


	public BigInteger getRepeatInterval() {
		return this.repeatInterval;
	}

	public void setRepeatInterval(BigInteger repeatInterval) {
		this.repeatInterval = repeatInterval;
	}


	public BigInteger getTimesTriggered() {
		return this.timesTriggered;
	}

	public void setTimesTriggered(BigInteger timesTriggered) {
		this.timesTriggered = timesTriggered;
	}

	public QrtzTrigger getQrtzTrigger() {
		return this.qrtzTrigger;
	}

	public void setQrtzTrigger(QrtzTrigger qrtzTrigger) {
		this.qrtzTrigger = qrtzTrigger;
	}

}