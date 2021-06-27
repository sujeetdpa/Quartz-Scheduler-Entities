package com.learning.learningquartzscheduler.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the qrtz_scheduler_state database table.
 * 
 */
@Entity
@Table(name="qrtz_scheduler_state")
@NamedQuery(name="QrtzSchedulerState.findAll", query="SELECT q FROM QrtzSchedulerState q")
public class QrtzSchedulerState implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QrtzSchedulerStatePK id;

	@Column(name="CHECKIN_INTERVAL")
	private BigInteger checkinInterval;

//	@Column(name="INSTANCE_NAME")
//	private String instanceName;

	@Column(name="LAST_CHECKIN_TIME")
	private BigInteger lastCheckinTime;

//	@Column(name="SCHED_NAME")
//	private String schedName;

	public QrtzSchedulerState() {
	}

	public QrtzSchedulerStatePK getId() {
		return this.id;
	}

	public void setId(QrtzSchedulerStatePK id) {
		this.id = id;
	}

	public BigInteger getCheckinInterval() {
		return this.checkinInterval;
	}

	public void setCheckinInterval(BigInteger checkinInterval) {
		this.checkinInterval = checkinInterval;
	}


	public BigInteger getLastCheckinTime() {
		return this.lastCheckinTime;
	}

	public void setLastCheckinTime(BigInteger lastCheckinTime) {
		this.lastCheckinTime = lastCheckinTime;
	}

}