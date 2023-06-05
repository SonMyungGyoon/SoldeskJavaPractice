package com.stray.kiosk;

import com.stray.data.Cattoy;
import com.stray.data.Product;
import com.stray.util.Cw;

public class ProcCattoy {
public static void run() {
		
		for(Product p:KioskObj.products) {	//메뉴출력. v.0.0.11
			if(p instanceof Cattoy) {	//메뉴 출력을 이쪽 계열 상품만 출력 처리
				Cw.wn(p.name+" "+p.price +"원");
			}
		}
		yy:while(true) {
			Cw.wn("[ 1.낚시대 / 2.소리나는 장난감 /x.이전메뉴로 ]");
			KioskObj.cmd = KioskObj.sc.next();
			Order n;
			switch(KioskObj.cmd) {
			case "1":
				Cw.wn(KioskObj.products.get(6).name+" 선택됨");
				n = new Order(KioskObj.products.get(6));
				KioskObj.basket.add(n);
				KioskObj.basketcnt[6] += 1;
				break;
			case "2":
				Cw.wn(KioskObj.products.get(7).name+" 선택됨");
				n = new Order(KioskObj.products.get(7));
				KioskObj.basket.add(n);
				KioskObj.basketcnt[7] += 1;
				break;
			case "x":
				Cw.wn("이전 메뉴 이동");
				break yy;
			}
		}
	}
}
