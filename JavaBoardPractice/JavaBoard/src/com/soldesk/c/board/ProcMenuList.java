package com.soldesk.c.board;

import com.soldesk.c.data.Data;
import com.soldesk.c.data.Post;
import com.soldesk.util.Cw;

public class ProcMenuList {
	static void run() {
		Cw.wn("리스트임");
		for(Post p:Data.posts) {
			p.infoForList();
		}
	}

}
