package leetcode_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TallCompare 
{
	public List<ArrayList<Integer>> reconstructQueue(int[][] people) {
		
		Arrays.sort(people, (a,b)->((b[0]-a[0])));
		List<ArrayList<Integer>> array=new ArrayList<>();
		ArrayList<Integer> first=new ArrayList<>();
		first.add(people[0][0]);
		first.add(people[0][1]);
		array.add(first);
		
		for(int i=1;i<people.length;i++){
			ArrayList<Integer> every=new ArrayList<>();
			every.add(people[i][0]);
			every.add(people[i][1]);
			if(people[i][1]>=array.size()){
				array.add(every);
			}else{
				array.add(people[i][1], every);
			}
			System.out.println(array);
		}
		
		System.out.println(array);
		return array;
        
    }
        

	
	public static void main(String[] args)
	{
		TallCompare test=new TallCompare();
		int[][] people={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		test.reconstructQueue(people);
		
		
	}
}
