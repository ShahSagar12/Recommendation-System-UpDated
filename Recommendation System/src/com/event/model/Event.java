package com.event.model;

public class Event {
	private int id;
	private int userId;
	private String eventName;
	private String eventdate;
	private int eventTime;
	private String eventAddress;
	private String eventNotice;
	private int status;
	public Event() {

	}
	public Event(int id,int userId, String eventName, String eventdate, int eventTime, String eventAddress, String eventNotice,
			int status) {

		this.id = id;
		this.userId=userId;
		this.eventName = eventName;
		this.eventdate = eventdate;
		this.eventTime = eventTime;
		this.eventAddress = eventAddress;
		this.eventNotice = eventNotice;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ",userId=\" + userId + \", eventName=" + eventName + ", eventdate=" + eventdate + ", eventTime=" + eventTime
				+ ", eventAddress=" + eventAddress + ", eventNotice=" + eventNotice + ", status=" + status + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int id) {
		this.userId = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	public int getEventTime() {
		return eventTime;
	}
	public void setEventTime(int eventTime) {
		this.eventTime = eventTime;
	}
	public String getEventAddress() {
		return eventAddress;
	}
	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}
	public String getEventNotice() {
		return eventNotice;
	}
	public void setEventNotice(String eventNotice) {
		this.eventNotice = eventNotice;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
