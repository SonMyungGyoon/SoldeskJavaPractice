package com.soldesk.c.data;

import java.time.LocalDate;
import java.util.HashSet;

import com.soldesk.util.Cw;

public class Post {
	static public int no = 0;
	public int instanceNo = 0;
	public String title;
	public String content;
	public String writer;
	public int hit;
	public int boomup;
	public HashSet <String>boomuplist = new HashSet<>();
	public String date;
	public Post(String title, String content, String writer, int hit) {
		no = no + 1;
		instanceNo = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.boomup = 0;
		LocalDate now = LocalDate.now();
		date = now.toString();
	}
	public void infoForList() {
		Cw.w("글번호:"+instanceNo);
		Cw.w(" 글제목:"+title);
		Cw.w(" 작성자:"+writer);
		Cw.w(" 조회수:"+hit);
		Cw.w(" 추천수:"+boomup);
		Cw.wn(" 작성일:"+date);
	}
	public void infoForRead() {
		Cw.w("글제목:"+title);
		Cw.w(" 작성자:"+writer);
		Cw.w(" 조회수:"+hit);
		Cw.w(" 추천수:"+boomup);
		Cw.wn(" 작성일:"+date);
		Cw.wn("글내용:"+content);
	}
}
