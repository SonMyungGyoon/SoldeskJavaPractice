package com.stray.kiosk;

import com.stray.data.Drink;
import com.stray.data.Product;
import com.stray.util.Cw;

public class ProcDrink {
public static void run() {
		
		for(Product p:KioskObj.products) {	
			if(p instanceof Drink) {	
				Cw.wn(p.name+" "+p.price +"원");
			}
		}
		yy:while(true) {
			
			Cw.wn("[ 1.아메리카노 / 2.아샷추 / 3.아이스티 / x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				ProcHotCold.run();
				break;
			case "2":
				Cw.wn(KioskObj.products.get(1).name+" 선택됨");
				KioskObj.basket.add(new Order(KioskObj.products.get(1)));
				KioskObj.basketcnt[1] += 1;
				break;
			case "3":
				Cw.wn(KioskObj.products.get(2).name+" 선택됨");
				KioskObj.basket.add(new Order(KioskObj.products.get(2)));
				KioskObj.basketcnt[2] += 1;
				break;
			case "x":
				Cw.wn("이전 메뉴 이동");
				break yy;
			}
		}
	}
}
