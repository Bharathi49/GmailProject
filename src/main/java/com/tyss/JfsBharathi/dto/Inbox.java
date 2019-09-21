package com.tyss.JfsBharathi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="inbox")
public class Inbox {

	@Id
	@GeneratedValue
	@Column
	private int messageId;
	
	@Column
	private int userId;
	
	@Column
	private String message;
	
//	@OneToOne(mappedBy="inbox")
//	private Account acount;
//	
//
//	public Account getAcount() {
//		return acount;
//	}
//
//	public void setAcount(Account acount) {
//		this.acount = acount;
//	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
