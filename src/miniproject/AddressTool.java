package miniproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressTool {

	public static void main(String[] args) {
		ArrayList<AddressData> tel1;
	     FileWriter fw;
	     Scanner sc;
	     FileReader fr;
		
	     public AddressTool() throws IOException {
	    	 tel1 = new ArrayList<AddressData>();
	    	 sc= new Scanner(System.in);
	    	
	     }
	    void input(FileWriter fw) throws IOException{
	    	if(tel1.size()==0) {
	    		String pif= "이름"+"|t|t"+"휴대폰번호"+"|t|t"+"집전화번호"+"|r|n";
	    		tel1.add(new AddressData("이름","휴대폰번호","집전화번호"));
	    		fw.write(pif);
	    	}
	       System.out.print("이름:");
	       String name=sc.next();
	       System.out.print("휴대폰번호:");
	       String hp=sc.next();
	       System.out.print("집전화번호");
	       String tel=sc.next();
	       tel1.add(new AddressData(name,hp,tel));
	       String tatal= name+"|t|t"+hp+"|t|t"+tel+"|t|t";
	       fw.write(tatal);
	       fw.close();
	    }
	    void search() {
	    	System.out.print("이름:");
	    	String search=sc.next();
	    	
	    	boolean check = false;
	    	int index=-1;
	    	
	    	for(int i = 0; i<tel1.size();i++) {
	    		if(tel1.get(i).name.equals(search)) {
	    			index=i;
	    			check=true;
	    		}
	    	}
	    	if(check== true) {
	    		System.out.println(tel1.get(index).name+","+tel1.get(index).hp+"."
	    	+tel1.get(index).tel);
	    	}
	    	else {
	    		System.out.println("검색결과가 없습니다.");
	    		}
	    	
	    }
	    void delete(FileWriter fw) throws IOException
	    {
	    	System.out.print("번호:");
	    	String search1=sc.next();
	    	for(int i=0; i<tel1.size(); i++)
	    	{
	    		if (tel1.get(i).name.equals(search1)) {
	    			System.out.println("삭제되었습니다.");
	    			tel1.remove(i);
	    			
	    		}
	    	}
	    	for(int i=0; i<tel1.size(); i++)
		// TODO Auto-generated method stub

	}

}
