package com.soldesk.c.board;

import com.soldesk.c.data.Data;
import com.soldesk.c.data.Post;
import com.soldesk.util.Ci;
import com.soldesk.util.Cw;

public class ProcMenuWrite {
	static void run(String menuid) {
		Cw.wn("쓰기임");
//		Cw.wn(menuid);
		String title;
		while(true) {
			title=Ci.rl("글제목");
			if(title.length()>0) {
				break;
			}else {
				Cw.wn("장난x");
			}
		}
		String content;
		while(true) {
			content=Ci.rl("글내용");
			if(content.length()>0) {
				break;
			}else {
				Cw.wn("장난x");
			}
		}
//		String writer = menuid;
		
		Post p = new Post(title, content, menuid, 0);
		Data.posts.add(p);
		Cw.wn("글 작성됨");
	}
}
