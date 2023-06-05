package com.stray.kiosk;

import com.stray.util.Cw;

public class Kiosk {
	public static final String VERSION = "0.0.12";
	void run() {
		KioskObj.productLoad();
		Disp.title();
		xx:while(true) {
			Cw.wn("명령 입력[1.음료 / 2.고양이 간식 / 3.고양이장난감 대여 / e.프로그램종료]:");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				ProcDrink.run();
				break;
			case "2":
				ProcCatfood.run();
				break;
			case "3":
				ProcCattoy.run();
				break;
			case "e":
				CalcBasket.run();
				break xx;
			}
		}		
	}
	
}
