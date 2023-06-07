package com.soldesk.c.board;

import com.soldesk.c.data.Data;
import com.soldesk.c.data.Post;
import com.soldesk.util.Ci;
import com.soldesk.util.Cw;

public class ProcMenuUpdate {
	static void run(String menuid) {
		Cw.wn("업뎃임");
		String cmd = Ci.r("수정할 글 번호");
		//수정 할 글 찾기
		for(Post p:Data.posts) {
			if(cmd.equals(p.instanceNo+"")) {
				if(menuid.equals(p.writer)) {
					String content=Ci.rl("수정 할 글내용");
					p.content = content;
					Cw.wn("글 수정 됨");
				}
			}
		}		
	}
}
