package com.soldesk.c.board;

import com.soldesk.c.display.Disp;
import com.soldesk.util.Ci;
import com.soldesk.util.Cw;

public class ProcMenu {
	static void run(String id) {
		String menuid = id;
		Cw.wn(menuid + " 로그인 성공!");
		loop:
		while(true) {
			Disp.menuMain();
			String cmd = Ci.r("명령");
			switch(cmd) {
			case "1":
				ProcMenuList.run();
				//리스트
				break;
			case "2":
				//읽기
				ProcMenuRead.run(menuid);
				break;
			case "3":
				//쓰기
				ProcMenuWrite.run(menuid);
				break;
			case "4":
				//삭제
				ProcMenuDel.run(menuid);
				break;
			case "5":
				//수정
				ProcMenuUpdate.run(menuid);
				break;
			case "e":
				System.out.println("프로그램 종료");
				break loop;
			default:
				Cw.wn("장난x");
				break;
			}
		}
	}

}
