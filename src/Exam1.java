import java.util.Scanner;

/*명령어를 분석해서 기능을 반복 수행하는 명령어 프로그램을 만들어주세요.
명령어 입력 요구 무한히
기능1 : 종료
명령어 : exit
설명 : 루프 종료.

기능2 : 등록
명령어 : add
설명 : 게시물은 제목, 내용으로 이루어져 있습니다. 제목과 내용을 입력받아 저장
입력 예시
게시물 제목을 입력해주세요 : 제목 입력
게시물 내용을 입력해주세요 : 내용 입력
출력 예시
게시물이 등록되었습니다.

기능3 : 게시물 조회
명령어 : list
설명 : add로 저장된 게시물의 목록이 나온다.
출력 예시
제목 : 제목1
내용 : 내용1
제목 : 제목2
내용 : 내용2
*/

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.next();
			String title = "";
			String body = "";
			if (str.equals("exit")) {
				System.out.println("종료되었습니다");
				break;
			}
			if (str.equals("add")) {
				System.out.print("게시물 제목을 입력해 주세요 : ");
				title = sc.next();
				System.out.print("게시물 내용을 입력해 주세요 : ");
				body = sc.next();
			}
			if (str.equals("list")) {
				System.out.println("제목 : " + title);
				System.out.println("내용 : " + body);
				
			}
			
		}

	}

}
