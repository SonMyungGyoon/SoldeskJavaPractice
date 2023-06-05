package com.stray.kiosk;

import com.stray.util.Cw;

public class Disp {
	final static String DOT = "◇";	
	final static int DOT_COUNT = 50;	
	public static void line() {		//static 함수:Disp.line() 식으로 객체 생성없이 아무데서 사용 가능.
//		Cw.w(x);	// 일반 멤버 변수는 못씀.
		for(int i=0;i<DOT_COUNT;i=i+1) {
			Cw.w(DOT);	// static 멤버 변수는 사용 가능.
		}
		Cw.wn();
	}
	
	public static void title() {
		line();
		dot(14);
		Cw.w(" 고양이 카페 (v."+ Kiosk.VERSION +" by SMG) ");
		dot(14);
		Cw.wn();
		line();
	}
	
	public static void dot(int n) {
		for(int i=0;i<n;i++) {
			Cw.w(DOT);
		}
	}
}
