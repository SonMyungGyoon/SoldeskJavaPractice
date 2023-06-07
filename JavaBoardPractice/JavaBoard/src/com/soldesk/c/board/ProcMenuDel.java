package com.soldesk.c.board;


import com.soldesk.c.data.Data;
import com.soldesk.util.Ci;
import com.soldesk.util.Cw;

public class ProcMenuDel {
	static void run(String menuid) {
		Cw.wn("삭제임");
		String cmd = Ci.r("삭제할 글 번호");
		int tempSearchIndex = 0;
		for(int i=0;i<Data.posts.size();i=i+1) {
			if(cmd.equals(Data.posts.get(i).instanceNo+"")) {
				if(menuid.equals(Data.posts.get(i).writer)) {
					tempSearchIndex = i;
				}
			}
		}
		Data.posts.remove(tempSearchIndex);
		Cw.wn("글 수:"+Data.posts.size());
	}
}
