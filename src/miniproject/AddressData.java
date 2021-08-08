package miniproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddressData {
	public String name;
	public String hp;
	public String tel;
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
   public AddressData() throws IOException{
	   System.out.print("이름:");
	   name=in.readLine();
	   System.out.print("핸드폰번호:");
	   hp=in.readLine();
	   System.out.print("전화번호:");
	   tel=in.readLine();
	   
   }
   
   
}
