package com.javaweb.utils;

public class StringUtitls {
	public static boolean checkString(String data) {
		if(!data.equals("") && data != null) {
			return true;
		}
		return false;
	}
}
