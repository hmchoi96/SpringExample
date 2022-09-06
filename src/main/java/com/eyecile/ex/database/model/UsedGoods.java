package com.eyecile.ex.database.model;

import java.util.Date;

// 데이터베이스를 조회한 결과를 전달해야함 - 하나의 행을 하나의 객체로 저장하는게 좋다
// 데이터를 저장하기 위한 클래스를 여기에 넣는다
// 따로 어노테이션 필요 없음


public class UsedGoods {

	// 여기에 저장 되어야 할것 - 테이블에 있는 각 행의 모든 정보를 저장해야함 - 테이블의 컬럼별로
	private int id;
	private String title;
	private int price;
	private String description;
	private String picture;
	private int sellerId;
	private Date createdAt;   //날짜 정보라 date 로 저장함
	private Date updatedAt;
	
	// 데이터 조회한 내용 저장하려고 게터세터 만듬
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
