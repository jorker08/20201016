package java201019;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam1 {
	/*
	 * 명령어를 분석해서 기능을 반복 수행하는 명령어 프로그램을 만들어주세요. 명령어 입력 요구 무한히 기능1 : 종료 명령어 : exit 설명
	 * : 루프 종료. 기능2 : 게시물 추가 명령어 : add
	 * 
	 * 설명 : 게시물은 제목, 내용으로 이루어져 있습니다. 제목과 내용을 입력받아 저장
	 * 
	 * 입력 예시
	 * 
	 * 게시물 제목을 입력해주세요 : 제목 입력 게시물 내용을 입력해주세요 : 내용 입력 출력 예시
	 * 
	 * 게시물이 등록되었습니다. 기능3 : 게시물 조회 명령어 : list
	 * 
	 * 설명 : add로 저장된 게시물의 목록이 나온다.
	 * 
	 * 출력 예시
	 * 
	 * 제목 : 제목1 내용 : 내용1 제목 : 제목2 내용 : 내용2
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		

		while (true) {
			System.out.print("명령어 입력 : ");
			String cmd = sc.next();
			if (cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (cmd.equals("add")) {

				System.out.println("게시물 제목을 입력해주세요 :");
				titles.add(sc.next());
				System.out.println("게시물 내용을 입력해주세요 :");
				bodies.add(sc.next());
				System.out.println("게시물이 등록되었습니다.");

			}
			if (cmd.equals("list")) {
				for (int i = 0; i < titles.size(); i++) {
					System.out.println("제목 : " + titles.get(i));
					System.out.println("내용 : " + bodies.get(i));
					System.out.println("======================");

				}
			}
			if(cmd.equals("update")) {
				
				System.out.println("수정할 게시물 선택");
				String targerTitle = sc.next();
				
				for(int i = 0; i < titles.size(); i++) {
					if(titles.get(i).equals(targerTitle)) {
						System.out.println("게시물 제목을 입력해주세요 :");
						titles.add(sc.next());
						System.out.println("게시물 내용을 입력해주세요 :");
						bodies.add(sc.next());
						System.out.println("게시물이 등록되었습니다.");
						
					}
				}
				

			}
			

		}
	}
}
