package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.common.collect.Multiset.Entry;

public class TestClass {
public static void main(String[] args) throws IOException, ParseException {
	
	FileReader r= new FileReader("C:\\Users\\Vimal\\eclipse-workspace\\JsonRead\\src\\test\\resources\\json\\sample.json");
	JSONParser parser=new JSONParser();
	Object o = parser.parse(r);
	JSONObject jo=(JSONObject)o;
	Set entrySet = jo.entrySet();
	for (Object x : entrySet) {
		Map.Entry entry=(java.util.Map.Entry)x;
		System.out.println(entry.getKey()+":"+entry.getValue());
		
	}
	Object object1 = jo.get("CardNumber");
	System.out.println(object1);
	boolean containsKey = jo.containsKey("CVVNumber");	
	System.out.println(containsKey);
}
}
