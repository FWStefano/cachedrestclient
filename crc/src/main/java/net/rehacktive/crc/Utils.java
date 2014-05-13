package net.rehacktive.crc;

import android.util.Log;


public class Utils {
	
	private static boolean isLogEnabled = false;
	
	public static void log(String tag, String content) {
		if(isLogEnabled) Log.d(tag,content);
	}

}
