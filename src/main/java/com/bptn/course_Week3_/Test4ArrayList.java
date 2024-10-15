package com.bptn.course_Week3_;

import java.util.List;
import java.util.ArrayList;

// import java listIterator
import java.util.ListIterator;

public class Test4ArrayList {
    public static void removeLongStrings(ArrayList<String> list) {
        //code here
        ArrayList<String> newList = new ArrayList<String>();

 for (String word : list) {
 newList.add(word);
 newList.removeIf( n -> n.length() > 4 );
 }
 ListIterator<String> red = list.listIterator();
 while(red.hasNext()){
 String str = red.next();
 if(str.length() > 4){
 red.remove();
 }
 
 }

        
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);
    }
}
