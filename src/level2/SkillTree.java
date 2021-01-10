import java.util.ArrayList;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        ArrayList<String> test = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		int count = 0;
        int answer = 0;
        
        		for(int i = 0; i < skill.length(); i++){
			test.add(skill.substring(i, i+1));
		}
		for(int i = 0; i < skill_trees.length; i++){
			for(int j = 0; j < test.size(); j++){
				if(skill_trees[i].contains(test.get(j)) != false){
					temp.add(skill_trees[i].indexOf(test.get(j)));
				}else if(skill_trees[i].contains(test.get(j)) == false){
					temp.add(skill_trees.length);
				}
			}
			for(int j = 0; j < temp.size()-1; j++){
				if(temp.get(j) > temp.get(j+1)){
					count++;
					break;
				}
			}
			temp.clear();
		}
		count = skill_trees.length - count;
		answer += count;
        return answer;
    }
}
