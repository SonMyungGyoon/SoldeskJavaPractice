package com.peisia.mapper;

import java.util.ArrayList;

import com.peisia.domain.GuestVO;

public interface GuestMapper {
	public ArrayList<GuestVO> getList(int limitindex);
	public GuestVO read(long bno);
	public void del(long bno);
	public void write(GuestVO gvo);
	public void modify(GuestVO gvo);
}