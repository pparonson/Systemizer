package com.teamtreehouse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("EEE, yyyy/MM/dd");
        Date date = new Date();
                
        System.out.println("I am determined to learn how to code.");
        System.out.println("Today's date is: " + df.format(date));
	}
}
