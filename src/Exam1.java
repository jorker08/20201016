import java.util.Scanner;

/*��ɾ �м��ؼ� ����� �ݺ� �����ϴ� ��ɾ� ���α׷��� ������ּ���.
��ɾ� �Է� �䱸 ������
���1 : ����
��ɾ� : exit
���� : ���� ����.

���2 : ���
��ɾ� : add
���� : �Խù��� ����, �������� �̷���� �ֽ��ϴ�. ����� ������ �Է¹޾� ����
�Է� ����
�Խù� ������ �Է����ּ��� : ���� �Է�
�Խù� ������ �Է����ּ��� : ���� �Է�
��� ����
�Խù��� ��ϵǾ����ϴ�.

���3 : �Խù� ��ȸ
��ɾ� : list
���� : add�� ����� �Խù��� ����� ���´�.
��� ����
���� : ����1
���� : ����1
���� : ����2
���� : ����2
*/

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.next();
			String title = "";
			String body = "";
			if (str.equals("exit")) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}
			if (str.equals("add")) {
				System.out.print("�Խù� ������ �Է��� �ּ��� : ");
				title = sc.next();
				System.out.print("�Խù� ������ �Է��� �ּ��� : ");
				body = sc.next();
			}
			if (str.equals("list")) {
				System.out.println("���� : " + title);
				System.out.println("���� : " + body);
				
			}
			
		}

	}

}
