package com.bptn.course_Week3_;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
        
        // Changed i <= friends.length to i < friends length because index length ends at -1
        for (int i = 0; i < friends.length; i++) {
            names.add(friends[i]);
        }
        System.out.println(names);
    }

	}


