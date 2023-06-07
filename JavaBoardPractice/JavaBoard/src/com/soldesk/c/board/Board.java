package com.soldesk.c.board;

import com.soldesk.c.data.Data;
import com.soldesk.c.display.Disp;

public class Board {
	public static final String VERSION = "v0.0.6";
	public static final String TITLE = "고양이 게시판 (" + VERSION + ") feat. ";
	public void run(String id) {
		Disp.title();
		Data.loadData();
		ProcMenu.run(id);
	}
}
