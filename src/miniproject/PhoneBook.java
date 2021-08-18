package miniproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("*********************************");
			System.out.println("*      전화번호 관리 프로그램         *");
			System.out.println("*********************************");
			System.out.println("1.리스트, 2.등록, 3.삭제, 4.검색, 5.종료");
			System.out.println("----------------------------------");
			System.out.println(">메뉴번호:");
		Scanner scan= new Scanner(System.in);
		int num=0;
		try {
			num= scan.nextInt();
			if(!(num>0&& num<6)) {
				throw new InputMismatchException();
				
			}
			
		}catch(InputMismatchException e) {
			System.out.println("입력된 값이 잘못되었습니다. [다시입력해주세요]");
		}
		switch(num) {
		case 1:
			vo.getList();
			break;
		case 2:
			vo.insert();
			break;
		case 3:
			vo.delete();
			break;
		case 4:
			vo.search();
			break;
		case 5:
			vo.exit();
			break;
		}
		}
		

	}

}
