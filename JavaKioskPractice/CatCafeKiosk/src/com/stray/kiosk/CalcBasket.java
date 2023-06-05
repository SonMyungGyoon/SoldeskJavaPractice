package com.stray.kiosk;

import com.stray.data.Product;
import com.stray.util.Cw;

public class CalcBasket {
	public static void run() {
		int i = 0;
		i = 0;
		Cw.wn("장바구니에 담긴 상품 갯수:"+KioskObj.basket.size());
		int sum = 0;
		for(Order o:KioskObj.basket) {	// 향상된for문(for-each)으로 적용
			sum = sum + o.selectedProduct.price;
		}
		Cw.wn("계산하실 금액은 :"+sum+"원 입니다.");
		
		Cw.wn("====================");
//		for(Order o:KioskObj.basket) {
//			Cw.wn(o.selectedProduct.name);
//		}
		for(Product p:KioskObj.products) {
			if(KioskObj.basketcnt[i] > 0) {
				p.info();
				Cw.wn( "( " +KioskObj.basketcnt[i]+" 개 선택됨 )");
			}
			i++;
		}
		Cw.wn("====================");
		Cw.wn("프로그램종료");
	}
}
