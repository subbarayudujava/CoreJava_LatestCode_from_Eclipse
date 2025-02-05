package com.nt;
public class secoundHightCharactor {

	public static void main(String[] args) {
		String str="Subbarayudu";
		/*char ch=str.charAt(3);
		System.out.println(ch);*/
	
		if(str.length()>=0) {
			System.out.println("secondcharactor");
			char ch2=str.charAt(2);
			System.out.println(ch2);
			char ch=str.charAt(str.length()-3);//lastthird charactor in thr string
			System.out.println(ch);
		}else {
			System.out.println("charactor not there");
		}

	}

}
