package com.peisia.service;

import java.util.ArrayList;

import com.peisia.domain.GuestVO;

public interface GuestService {
	public ArrayList<GuestVO> getList(int currentPage);
	public GuestVO read(long bno);
	public void del(long bno);

	public void write(GuestVO gvo);
	public void modify(GuestVO gvo);
}