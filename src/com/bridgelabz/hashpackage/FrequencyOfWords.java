package com.bridgelabz.hashpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 *Frequency Of Words Program
 */
public class FrequencyOfWords {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<>();
	ArrayList<Integer> list = new ArrayList<>();

	// Method for split string
	public void stringSplitAndCount() {

		System.out.println("Enter the sentence ");
		String sentence = sc.nextLine();
		String[] tokens = sentence.split(" ");

		// for each loop use
		for (String token : tokens) {
			String word = token.toLowerCase();
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}
		// display
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			String result = en.getKey() + ":" + en.getValue();
			System.out.println(result);
		}
	}

	// main
	public static void main(String[] args) {
		FrequencyOfWords obj = new FrequencyOfWords();
		obj.stringSplitAndCount();
	}
}