package miniproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressList {
	public static void main(String[] args) {
		ArrayList<AddressData> tel= new ArrayList<AddressData>();
        AddressTool t= new AddressTool();
        File f= new File("C:\\\\Users\\\\BIT\\\\Desktop\\\\PhoneDb.txt");
        if(f.exists()) {
        	tel.clear();
        FileReader fr= new FileReader("C:\\\\Users\\\\BIT\\\\Desktop\\\\PhoneDb.txt");
        	BufferedReader reader= new BufferedReader(fr);
        	String line;
        	String[] splitLine1= null;
        	while((line=reader.readLine())!=null){
        		splitLine1= line.split("|t|t");
        		tel.add(new AddressData(splitLine1[0]. splitLine1[1],splitLine1[2] ));
        	}
        	
        }
        while(true) {
        	
        }
		Scanner scr= new Scanner(System.in);
		
		FileWriter fw;
		  System.out.println("*****************************");
		  System.out.println("*    전화번호 관리 프로그램    *");
		  System.out.println("-----------------------------");
		  System.out.println("1.리스트,2.등록,3.삭제,4.검색,5.종료");
		  System.out.println("------------------------------");
		  System.out.println("메뉴번호:");
		  int menuNo=  scr.nextInt();
		  if (t.tel.size()==0) {
			  fw=new FileWriter("C:\\\\Users\\\\BIT\\\\Desktop\\\\PhoneDb.txt",false);
			 
		  }
		  else {
			  fw= new FileWriter("C:\\\\Users\\\\BIT\\\\Desktop\\\\PhoneDb.txt",true);
			 
		  }
		  switch(menuNo) {
		  case 1:
			  t.output(fr);
			  break;
		  case 2:
			  t.input(fw);
			  break;
		  case 3:
			  FileWriter fw1= new FileWriter("C:\\Users\\BIT\\Desktop\\PhoneDb.txt",false);
			  t.delete(fw1);
			  break;
		  case 4:
			  t.search();
			  break;
		  case 5:
			  System.out.println("프로그램을 종료합니다.감사합니다");
			  break;
		  default:
			   System.out.println("다시 입력해주세요.");
			   break;
		  }
		  if (menuNo==5) {
			  break;
		  }
		
		
	}


}
