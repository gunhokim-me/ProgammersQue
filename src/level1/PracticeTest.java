class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
       int[] one = new int [answers.length];
		int[] two = new int [answers.length];
		int[] three = new int [answers.length];
		int [] ans = {} ;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
        
        int input = 0;
		for(int i = 0; i < answers.length; i++){
			input++;
			one[i] = input;
			if(input >= 5){
				input = 0;
			}
		}
		input = 0;
		for(int i = 0; i < answers.length; i++){
			input++;
			if(input == 1){
				two[i] = 2;
			}
			if(input == 2){
				two[i] = 1;
			}
			if(input == 3){
				two[i] = 2;
			}
			if(input == 4){
				two[i] = 3;
			}
			if(input == 5){
				two[i] = 2;
			}
			if(input == 6){
				two[i] = 4;
			}
			if(input == 7){
				two[i] = 2;
			}
			if(input == 8){
				two[i] = 5;
				input = 0;
			}
		}
		input = 0;
		for(int i = 0; i < answers.length; i++){
			input++;
			if(input == 1){
				three[i] = 3;
			}
			if(input == 2){
				three[i] = 3;
			}
			if(input == 3){
				three[i] = 1;
			}
			if(input == 4){
				three[i] = 1;
			}
			if(input == 5){
				three[i] = 2;
			}
			if(input == 6){
				three[i] = 2;
			}
			if(input == 7){
				three[i] = 4;
			}
			if(input == 8){
				three[i] = 4;
			}
			if(input == 9){
				three[i] = 5;
			}
			if(input == 10){
				three[i] = 5;
				input=0;
			}
			
		}
        
        for (int i = 0; i < answers.length; i++) {
			if (answers[i] == one[i]) {
				count++;
			}
			if (answers[i] == two[i]) {
				count1++;
			}
			if (answers[i] == three[i]) {
				count2++;
			}
			
		}
        if (count > count1 && count > count2) {
				answer = new int [] {1};
				
			} else if (count1 > count && count1 > count2) {
				answer = new int [] {2};
				
			} else if (count2 > count && count2 > count1) {
				answer = new int [] {3};
				
			}else if (count == count1 && count == count2){
				answer = new int []{1,2,3};
			}else if (count == count1){
			answer = new int[] {1, 2};
		}else if (count == count2){
			answer = new int[] {1,3};
		}else if (count1 == count2){
			answer = new int[] {2,3};
		}
        
        
        return answer;
    }
}
