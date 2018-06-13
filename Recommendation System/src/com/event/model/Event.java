package com.event.model;

public class Event {
	private int id;
	private int userId;
	private String eventName;
	private String proposedDate;	
	private String proposedTime;
	private String eventdate;
	private String eventTime;
	private String eventAddress;
	private String eventNotice;
	private int status;
	public Event() {

	}
	public Event(int id,int userId, String eventName, String proposedDate, String proposedTime,String eventdate, String eventTime, String eventAddress, String eventNotice,
			int status) {

		this.id = id;
		this.userId=userId;
		this.eventName = eventName;
		this.proposedDate=proposedDate;
		this.proposedTime=proposedTime;
		this.eventdate = eventdate;
		this.eventTime = eventTime;
		this.eventAddress = eventAddress;
		this.eventNotice = eventNotice;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ",userId=\" + userId + \", eventName=" + eventName + ", proposedDate=" + proposedDate + ", proposedTime="+ proposedTime +" eventdate=" + eventdate + ", eventTime=" + eventTime
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
	public void setEventdate(String string) {
		this.eventdate = string;
	}
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String time) {
		this.eventTime = time;
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
	public String getProposedDate() {
		return proposedDate;
	}
	public void setProposedDate(String proposedDate) {
		this.proposedDate = proposedDate;
	}
	public String getProposedTime() {
		return proposedTime;
	}
	public void setProposedTime(String proposedTime) {
		this.proposedTime = proposedTime;
	}
	

}
