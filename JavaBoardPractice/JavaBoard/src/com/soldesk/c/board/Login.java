package com.soldesk.c.board;

import com.soldesk.util.Ci;

public class Login {
	public void run() {
		final String id = Ci.r("ID를 입력해주세요");
		Board board = new Board();
		while(id != null) {
			board.run(id);
		}
	}
}
