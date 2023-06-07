package com.soldesk.c.board;

import com.soldesk.c.data.Post;
import com.soldesk.util.Cw;

public class ProcReadBoomup {
	static void run(Post p, String menuid) {
		if(p.boomuplist.contains(menuid)) {
			Cw.wn("이미 붐업한 글입니다!");
		}
		else {
			p.boomuplist.add(menuid);
			p.boomup++;
		}
	}
}
