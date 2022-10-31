package com.HashTable.BST;

import java.util.HashMap;
import java.util.Set;

public class HashTable {
	  static void sentence(String inputString){
	        HashMap<String,Integer> count = new HashMap<>();
	        count = new HashMap<>();
	        String [] words = inputString.split(" ");
	        for(String word: words){
	            if(count.containsKey(word)){
	                count.put(word, count.get(word)+1);
	            }else{
	                count.put(word,1);
	            }
	        }
	        Set<String> wordInString = count.keySet();
	        System.out.println("Frequency In word 'To Be Or Not To Be' is");
	        for (String word:wordInString){
	            if(count.get(word)>1){
	                System.out.println(word+ " :"+count.get(word));
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	System.out.println("Welcome To HashTable & Binary Search Tree Program");
	        sentence("To Be Or Not To Be");
	    }
	
}
