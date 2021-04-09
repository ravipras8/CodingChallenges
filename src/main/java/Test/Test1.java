package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,10); 
		List<Integer> list = Arrays.asList(1,2,3);
		int n[] = {4, 6, 3, 7};
		System.out.println(Arrays.toString(n).replaceAll("[\\[\\],\s]",""));
		// String st = String.join("", n);
		// printSubset(list);
		// printSubsetSum(list,10);
		
	}
	
	public static void printSubsetSum(List<Integer> list, Integer n) {
		List<List<Integer>> subsets = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int sum = list.get(i);
			if(sum==n) {
				subsets.add(Arrays.asList(list.get(i)));
			}
			for (int j = i+1; j < list.size(); j++) {
				List<Integer> sub2 = new ArrayList<>();
				sub2.add(list.get(i));
				sub2.add(list.get(j));
				sum = list.get(i) + list.get(j);
				if(sum==n) {
					subsets.add(new ArrayList<>(sub2));
				}
				for (int k = j+1; k < list.size(); k++) {
					sub2.add(list.get(k)); 
					sum += list.get(k);
					if(sum==n) {
						subsets.add(new ArrayList<>(sub2));
					}
				}
			}
		}
		System.out.println(subsets);
	}
	
	public static void printSubset(List<Integer> list) {
		List<List<Integer>> subsets = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			subsets.add(Arrays.asList(list.get(i)));
			for (int j = i+1; j < list.size(); j++) {
				List<Integer> sub2 = new ArrayList<>();
				sub2.add(list.get(i));
				sub2.add(list.get(j));
				subsets.add(new ArrayList<>(sub2)); 
				for (int k = j+1; k < list.size(); k++) {
					sub2.add(list.get(k)); 
					subsets.add(new ArrayList<>(sub2)); 
				}
			}
		}
		System.out.println(subsets);
	}

}
