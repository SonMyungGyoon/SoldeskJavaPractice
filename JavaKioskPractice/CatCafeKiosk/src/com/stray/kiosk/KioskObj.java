package com.stray.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

import com.stray.data.Catfood;
import com.stray.data.Cattoy;
import com.stray.data.Drink;
import com.stray.data.Product;

public class KioskObj {
	public static ArrayList<Order> basket = new ArrayList<>();
	public static int basketcnt[]= new int[10];
	public static ArrayList<Product> products = new ArrayList<>();	
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void productLoad() {
		products.add(new Drink("아메리카노",2000));
		products.add(new Drink("아샷추",2500));
		products.add(new Drink("아이스티",2500));
		products.add(new Catfood("츄르", 3000));
		products.add(new Catfood("닭가슴살", 3500));
		products.add(new Catfood("캣닢", 4000));
		products.add(new Cattoy("낚시대", 1000));
		products.add(new Cattoy("소리나는 장난감", 1000));
		for(int i = 0; i < basketcnt.length; i++) {
			basketcnt[i] = 0;
		}
	}
}
