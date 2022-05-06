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
		
		System.out.println("1.설문 조사  2.보기");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			System.out.print("이름 입력 : ");
			String name = scan.next();
			System.out.println("보직 설정");
			System.out.println("1.보병  2.운전병  3.행정병  4.통신병  5.의무병  0.기타");
			long sel = scan.nextInt();
			if (sel == 0) {
				System.out.print("보직 이름 입력 : ");
				String p_name = scan.next();
				pv = new PositionVO (0L, p_name);
				pdao.insertPosition(pv);
				sel = sdao.selectNum(p_name);
			}
			System.out.print("입대일 입력 : ");
			String inDay = scan.next();
			System.out.print("전역일 입력 : ");
			String outDay = scan.next();
			System.out.print("예비군 기간 : ");
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