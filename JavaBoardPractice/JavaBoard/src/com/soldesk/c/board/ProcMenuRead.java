package com.soldesk.c.board;

import com.soldesk.c.data.Data;
import com.soldesk.c.data.Post;
import com.soldesk.util.Ci;
import com.soldesk.util.Cw;

public class ProcMenuRead {
	static void run(String menuid) {
		Cw.wn("읽기임");
		String cmd = Ci.r("읽을 글 번호");
		for(Post p:Data.posts) {
			if(cmd.equals(p.instanceNo+"")) {
				p.hit++;
				p.infoForRead();
				onread:while(true) {
					cmd = Ci.r("[1.붐업 / x.이전메뉴로]");
					switch(cmd) {
					case "1":
						//붐업
						ProcReadBoomup.run(p, menuid);
						break;
					case "x":
						Cw.wn("이전 메뉴 이동");
						break onread;
					}
				}
			}
		}	
		
	}

}
