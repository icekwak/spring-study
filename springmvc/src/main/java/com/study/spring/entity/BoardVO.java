package com.study.spring.entity;

public class BoardVO {
	private int board_id;
	private String board_writer;
	private String board_title;
	private String board_content;
	private String board_date;
	private String file;
	
	public BoardVO() {
	}
	
	public BoardVO(String board_writer, String board_title, String board_content) {
		this.board_writer = board_writer;
		this.board_title = board_title;
		this.board_content = board_content;
	}
	
	public BoardVO(int board_id, String board_writer, String board_title, String board_content, String board_date, String file) {
		this.board_id = board_id;
		this.board_writer = board_writer;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_date = board_date;
		this.file = file;
	}

	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}

}
