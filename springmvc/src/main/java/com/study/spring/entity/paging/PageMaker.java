package com.study.spring.entity.paging;

public class PageMaker {
	private int startPage;			// 페이징의 시작 번호
	private int endPage;			// 페이징의 끝 번호
	private int totalCount;			// 총 게시글 수
	private int displayPageNum = 5;	// 게시판 페이징 번호 [이전] [1] [2] [3] [4] [5] [다음]
	private boolean prev;			// 이전
	private boolean next;			// 다음
	private Criteria cri;			// 현재 페이지 번호, 한 페이지에 보여줄 게시글 수
	
	// 연산 데이터 (totalCount 설정 시 연산)
	private void calcData() {
		
		endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);
		
		startPage = (endPage - displayPageNum) + 1;
		
		// 게시판의 실제 페이징 끝 번호
		int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));
		
		// 실제 페이징 끝 번호가 기준인 endPage 보다 작으면 (endpage 값은 tempEndPage 값보다 클 수 없어야 한다.)
		if(endPage > tempEndPage)
			endPage = tempEndPage;
		
		prev = startPage == 1 ? false : true;
		
		next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
	}
	
	public int getStartPage() {
		return startPage;
	}
	
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}
	
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	
	public int getDisplayPageNum() {
		return displayPageNum;
	}
	
	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
	
	public boolean isPrev() {
		return prev;
	}
	
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	
	public boolean isNext() {
		return next;
	}
	
	public void setNext(boolean next) {
		this.next = next;
	}
	
	public Criteria getCri() {
		return cri;
	}
	
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	
}
