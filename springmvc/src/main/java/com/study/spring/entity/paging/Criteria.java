package com.study.spring.entity.paging;

public class Criteria {
	
	private int page;		// 현재 페이지 번호
	private int perPageNum;	// 한 페이지에 보여줄 게시글 수
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 5;
	}
	
	public Criteria(int page, int perPageNum) {
		this.page = page;
		this.perPageNum = perPageNum;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page <= 0) // 현재 페이지가 1 이하인 경우 현재페이지 1로 고정
			this.page = 1;
		else
			this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		if(perPageNum <= 0 || perPageNum > 50) // 한 페이지에 보여줄 게시물 수를 1 ~ 50으로 제한
			this.perPageNum = 10;
		else
			this.perPageNum = perPageNum;
	}
	
	// 게시글 시작 위치 (limit의 pageStrat)
	public int getPageStart() {
		return (this.page - 1) * perPageNum;
	}
	
}
