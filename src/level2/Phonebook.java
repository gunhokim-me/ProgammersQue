package level2;

import java.util.Arrays;

public class Phonebook {

	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "5521194421"};
		String[] phone_book = {"123", "456", "111"};
		boolean answer = true;
		boolean temp = true;
		int count =0;
		
		Arrays.sort(phone_book);
		for(int i = 0; i < phone_book.length; i++){
			for(int j = i+1; j < phone_book.length; j++ ){
				temp = phone_book[i].contains(phone_book[j]);
				System.out.println(temp);
				if(phone_book[j].contains(phone_book[i])){
					count++;
					answer = false;
				}else{
					answer = true;
				}
			}
		}
		if(count == 0){
			answer = true;
		}else{
			answer = false;
		}
		System.out.println();
		System.out.println(answer);
//		System.out.println(phone_book[0].contains(phone_book[2]));
		
	}

}
