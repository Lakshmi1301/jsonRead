package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.pojo.Product;

public class TestSampleClass {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader r = new FileReader(
				"C:\\Users\\Vimal\\eclipse-workspace\\JsonRead\\src\\test\\resources\\json\\sample.json");
		JSONParser parser = new JSONParser();
		Object o = parser.parse(r);
		JSONObject jo = (JSONObject) o;

		Object object1 = jo.get("From");
		System.out.println(object1);

		Object object2 = jo.get("To");
		System.out.println(object2);
		Object object3 = jo.get("TripType");
		System.out.println(object3);
		Object object4 = jo.get("FromDate");
		System.out.println(object4);
		Object object5 = jo.get("ReturnDate");
		System.out.println(object5);
		Object object6 = jo.get("FlightNo");
		System.out.println(object6);
		Object object7 = jo.get("PassergerName");
		System.out.println(object7);
		Object object8 = jo.get("PassergeDOB");
		System.out.println(object8);
		Object object9 = jo.get("StreetName");
		System.out.println(object9);
		Object object10 = jo.get("CityName");
		System.out.println(object10);
		Object object11 = jo.get("DistrictName");
		System.out.println(object11);
		Object object12 = jo.get("StateName");
		System.out.println(object12);
		Object object13 = jo.get("Country");
		System.out.println(object13);
		Object object14 = jo.get("PassergerMobileNumber");
		System.out.println(object14);
		Object object15 = jo.get("PassergerLandLineNumber");
		System.out.println(object15);
		Object object16 = jo.get("PersonalEmail");
		System.out.println(object16);
		Object object17 = jo.get("OfficialEmail");
		System.out.println(object17);
		Object object18 = jo.get("PassergerCardName");
		System.out.println(object18);
		Object object19 = jo.get("cardHolderName");
		System.out.println(object19);
		Object object20 = jo.get("CardNumber");
		System.out.println(object20);
		Object object21 = jo.get("CVVNumber");
		System.out.println(object21);
		Object object22 = jo.get("PassergeDOB");
		System.out.println(object22);

		Product p = new Product();
		p.setFrom(object1.toString());
		p.setTo(object2.toString());
		p.setTripType(object3.toString());
		p.setFromDate(object4.toString());
		p.setReturnDate(object5.toString());
		p.setFlightNo(object6.toString());
		p.setPassergerName(object7.toString());
		p.setPassergeDOB(object22.toString());
		p.setStreetName(object9.toString());
		p.setCityName(object10.toString());
		p.setDistrictName(object11.toString());
		p.setStateName(object12.toString());
		p.setCountry(object13.toString());
		String s1 = object14.toString();
		Long valueOf = Long.valueOf(s1);
		p.setPassergerMobileNumber(valueOf);
		p.setPassergerLandLineNumber(object14.toString());
		p.setOfficialEmail(object16.toString());
		p.setPersonalEmail(object17.toString());
		p.setPassergerCardName(object18.toString());
		p.setCardHolderName(object19.toString());
		String s2 = object20.toString();
		Long valueOf1 = Long.valueOf(s2);
		p.setCardNumber(valueOf1);
		String s3 = object21.toString();
		Long valueOf3 = Long.valueOf(s3);
		p.setCardNumber(valueOf3);

		// getter
		System.out.println(p.getFrom());
		System.out.println(p.getTo());
		System.out.println(p.getTripType());
		System.out.println(p.getFromDate());
		System.out.println(p.getReturnDate());

		System.out.println(p.getFlightNo());
		System.out.println(p.getPassergerName());
		System.out.println(p.getPassergeDOB());

		System.out.println(p.getStreetName());
		System.out.println(p.getCityName());
		System.out.println(p.getDistrictName());
		System.out.println(p.getStateName());

		System.out.println(p.getCountry());
		System.out.println(p.getPassergerMobileNumber());
		System.out.println(p.getPassergerLandLineNumber());
		System.out.println(p.getPersonalEmail());
		System.out.println(p.getOfficialEmail());
		System.out.println(p.getPassergerCardName());
		System.out.println(p.getCardHolderName());
		System.out.println(p.getCardNumber());
		System.out.println(p.getCVVNumber());

	}
}
