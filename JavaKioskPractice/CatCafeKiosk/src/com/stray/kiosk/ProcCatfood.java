package com.stray.kiosk;

import com.stray.data.Catfood;
import com.stray.data.Product;
import com.stray.util.Cw;

public class ProcCatfood {
	public static void run() {
		
		for(Product p:KioskObj.products) {	//메뉴출력. v.0.0.11
			if(p instanceof Catfood) {	//메뉴 출력을 이쪽 계열 상품만 출력 처리
				Cw.wn(p.name+" "+p.price +"원");
			}
		}
		yy:while(true) {
			Cw.wn("[ 1.츄르 / 2.닭가슴살 / 3. 캣닢 /x.이전메뉴로 ]");
			KioskObj.cmd = KioskObj.sc.next();
			Order n;
			switch(KioskObj.cmd) {
			case "1":
				Cw.wn(KioskObj.products.get(3).name+" 선택됨");
				n = new Order(KioskObj.products.get(3));
				KioskObj.basket.add(n);
				KioskObj.basketcnt[3] += 1;
				break;
			case "2":
				Cw.wn(KioskObj.products.get(4).name+" 선택됨");
				n = new Order(KioskObj.products.get(4));
				KioskObj.basket.add(n);
				KioskObj.basketcnt[4] += 1;
				break;
			case "3":
				Cw.wn(KioskObj.products.get(5).name+" 선택됨");
				n = new Order(KioskObj.products.get(5));
				KioskObj.basket.add(n);
				KioskObj.basketcnt[5] += 1;
				break;
			case "x":
				Cw.wn("이전 메뉴 이동");
				break yy;
			}
		}
	}
}
