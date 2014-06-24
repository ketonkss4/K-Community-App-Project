package org.churchapp.community;

public class ListItem {
	private String event_name;
	private int event_pic_id;
	private String event_desc;
	private String date;
	
	
	public ListItem(String event_name, int event_pic_id, String event_desc,
			String date) {
		super();
		this.event_name = event_name;
		this.event_pic_id = event_pic_id;
		this.event_desc = event_desc;
		this.date = date;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public int getEvent_pic_id() {
		return event_pic_id;
	}
	public void setEvent_pic_id(int event_pic_id) {
		this.event_pic_id = event_pic_id;
	}
	public String getEvent_desc() {
		return event_desc;
	}
	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
