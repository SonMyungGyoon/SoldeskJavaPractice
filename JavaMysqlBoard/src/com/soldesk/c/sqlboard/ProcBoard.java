package com.soldesk.c.sqlboard;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.soldesk.c.display.Disp;
import com.soldesk.c.util.Ci;

public class ProcBoard {
	static Connection con = null;
	static Statement st = null;
	static ResultSet result = null;
	void run() {
		Disp.showTitle();
		Disp.showMainMenu();
		Scanner sc=new Scanner(System.in);
		
		loop:
			while(true) {
				dbInit();
				dbPostCount();
				Disp.showMainMenu();
				String cmd=Ci.r("명령입력");
				switch(cmd) {
				case "1":	//글리스트
					System.out.println("==========================================");
					System.out.println("================= 글리스트 =================");
					System.out.println("==========================================");
					System.out.println("[글번호]\t[        글제목        ] \t[ 작성자id ] \t[      작성시간       ]");
					try {
						result = st.executeQuery("select * from board");
						while(result.next()) {
							String no = result.getString("b_no");
							String title = result.getString("b_title");
							String id = result.getString("b_id");
							String datetime = result.getString("b_datetime");
							System.out.println(String.format("[%4s]\t[%-20s]\t[%8s]\t[%s]", no, title, id, datetime));
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case "2":	//글읽기
					String readNo = Ci.r("읽을 글 번호를 입력해주세요");
					try {
						result = st.executeQuery("select * from board where b_no ="+readNo);
						result.next();
						String title = result.getString("b_title");	
						String content = result.getString("b_text");
						System.out.println("글제목: "+title);
						System.out.println("글내용: "+content);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case "3":	//글쓰기
					sc.nextLine();
					String title = Ci.rl("글제목을 입력해주세요");
					String text = Ci.rl("글내용을 입력해주세요");
					String id = Ci.rl("작성자id를 입력해주세요");
					try {
						st.executeUpdate("insert into board (b_title,b_id,b_datetime,b_text,b_hit)"
								+" values ('"+title+"','"+id+"',now(),'"+text+"',0)");
						System.out.println("글등록 완료");
					} catch (SQLException e) {
						e.printStackTrace();
					}				
					break;
				case "4":	//글삭제
					System.out.println("삭제할 글번호를 입력해주세요:");
					String delNo = sc.next();
					dbExecuteUpdate("delete from board where b_no="+delNo);
					break;
				case "5":	//글수정
					String editNo = Ci.r("수정할 글번호를 입력해주세요");
					String edTitle = Ci.rl("제목을 입력해주세요");
					String edId = Ci.rl("작성자id를 입력해주세요");
					String edContent = Ci.rl("글내용을 입력해주세요");
					
					dbExecuteUpdate("update board set b_title='"+edTitle+"',b_id='"+edId+"',b_datetime=now(),b_text='"+edContent+"' where b_no="+editNo);
					break;
				case "0":	//관리자
					break;
				case "e":	//프로그램 종료
					System.out.println("프로그램종료");
					break loop;
				}
			}
		
	}
	
	private void dbInit() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_board", "root", "3586");
			st = con.createStatement();	
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}
	
	private void dbExecuteQuery(String query) {
		try {
			result = st.executeQuery(query);
			while (result.next()) {	
				String name = result.getString("p_name");
				System.out.println(name);
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}	
	private void dbExecuteUpdate(String query) {
		try {
			int resultCount = st.executeUpdate(query);
			System.out.println("처리된 행 수:"+resultCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	private void dbPostCount() {	
		try {
			result = st.executeQuery("select count(*) from board");
			result.next();
			String count = result.getString("count(*)");
			System.out.println("글 수:"+count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


