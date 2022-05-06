package boot_project;

import java.time.LocalDate;
import java.util.Scanner;

public class SoldierManager {
	public static void main(String[] args) {
		PositionDAO pdao = new PositionDAO();
		SoldierDAO sdao = new SoldierDAO();
		Scanner scan = new Scanner(System.in);
		PositionVO pv;
		SoldierVO sv;
		
		System.out.println("1.���� ����  2.����");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			System.out.print("�̸� �Է� : ");
			String name = scan.next();
			System.out.println("���� ����");
			System.out.println("1.����  2.������  3.������  4.��ź�  5.�ǹ���  0.��Ÿ");
			long sel = scan.nextInt();
			if (sel == 0) {
				System.out.print("���� �̸� �Է� : ");
				String p_name = scan.next();
				pv = new PositionVO (0L, p_name);
				pdao.insertPosition(pv);
				sel = sdao.selectNum(p_name);
			}
			System.out.print("�Դ��� �Է� : ");
			String inDay = scan.next();
			System.out.print("������ �Է� : ");
			String outDay = scan.next();
			System.out.print("���� �Ⱓ : ");
			long year = scan.nextLong();
			sv = new SoldierVO(0L, name , sel, LocalDate.parse(inDay), LocalDate.parse(outDay), year);
			sdao.insertPosition(sv);
			break;
		case 2:
			break;
			default :
				break;
		}	
	}
}