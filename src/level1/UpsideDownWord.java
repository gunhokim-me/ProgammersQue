import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> low = new ArrayList<>();
		ArrayList<String> up = new ArrayList<>();
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) > 90){
				low.add(s.substring(i, i+1));
			}else{
				up.add(s.substring(i, i+1));
			}
		}
		Collections.sort(low);
		Collections.sort(up);
		for(int i = low.size()-1; i >= 0; i--){
			answer += low.get(i); 
		}
		for(int i = up.size()-1; i >= 0; i--){
			answer += up.get(i);
		}
        return answer;
    }
}
