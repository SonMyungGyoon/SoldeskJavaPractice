package com.stray.kiosk;

import com.stray.data.Product;

public class Main {
	public static void main(String args[]) {
		Product p = new Product("test", 1234);
		p.info();
		Kiosk k = new Kiosk();
		k.run();
	}
}
