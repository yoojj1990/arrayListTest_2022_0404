package arrayListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> strArray = new ArrayList<String>();
		
		String str1 = "Korea";
		String str2 = "Japan";
		String str3 = "France";
		String str4 = "USA";
		
		strArray.add(str1);
		strArray.add(str2);
		strArray.add(str3);
		strArray.add(str4);
		
//		String str00 = strArray.get(0);
//		String str01 = strArray.get(0);
//		String str02 = strArray.get(0);
//		String str03 = strArray.get(0);
//		System.out.println(str00);
		
		Iterator<String> it = strArray.iterator(); // ¹Ýº¹ÀÚ
		
		while (it.hasNext()) {
			
			String str000 = it.next();
			System.out.println(str000);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
