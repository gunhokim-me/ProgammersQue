class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] temp = new String [s.length()];
        
        for(int i = 0; i < s.length(); i++){
			temp[i] = s.substring(i, i+1).toLowerCase();
		}
		int p = 0;
		int y = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals("p")) {
				p++;
			} else if(temp[i].equals("y")) {
				y++;
			}
		}
		
		if(p == y){
			answer = true;
		}else if(p != y){
			answer = false;
		}

        return answer;
    }
}
