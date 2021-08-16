package miniproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhoneBook {

	public static void main(String[] args) {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("1.리스트, 2.등록, 3.삭제, 4.검색, 5.종료");
			int s= Integer.parseInt(in.readLine());
			if(s==1) {
				new Phone();
			}
		}

	}

}
