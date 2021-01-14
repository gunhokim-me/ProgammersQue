import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String s, int n) {
        		int[] by = new int [s.length()];
        String answer = "";
        		for(int i =0; i < s.length(); i++){
			by[i] = s.charAt(i);
		}
int temp = 0;
		for(int i = 0; i < by.length; i++){	
			if(by[i] != 32 ){
				if(by[i] >= 65 && by[i] <= 90){
					if(by[i]+n > 90){
						by[i] = (by[i]+n);
						temp = (by[i] - 91);
						by[i] = 65 + temp;
					}else{
						by[i] = (by[i]+n);
					}
				}else if(by[i] >= 97 && by[i] <= 122){
					if(by[i]+n > 122){
						by[i] = (by[i]+n);
						temp = (by[i] - 123);
						by[i] = 97+temp;
					}else{
						by[i] = (by[i]+n);
					}
				}
				
			}
		}

		for(int i = 0; i < by.length; i++){
			answer += Character.toString((char)by[i]);
		}
        return answer;
    }
}
