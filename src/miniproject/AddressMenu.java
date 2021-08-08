package miniproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddressMenu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		Scanner scan= new Scanner(System.in);
		
		System.out.println("***************************");
		System.out.println("     전화번호 관리 프로그램       ");
		System.out.println("***************************");
		
		while(true) {
			
			System.out.println("1.리스트, 2.등록, 3.삭제, 4.검색,  5.종료");
			System.out.println("----------------------------------");
		    int s= scan.nextInt();
		    
		    
			if (s==1) {
				
				
			}
			if(s==2) {
				new AddressData();
			}
			if(s==3) {
				
			}
			if(s==4) {
				
			}
			if(s==5) {
				
			}
			else {
				
			}
		}
		
		
		

}
}
