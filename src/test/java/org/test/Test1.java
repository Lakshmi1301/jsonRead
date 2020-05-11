package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.pojo.Product;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Test1 {
@Test
public void validation() throws IOException, ParseException
{
	FileReader r = new FileReader(
			"C:\\Users\\Vimal\\eclipse-workspace\\JsonRead\\src\\test\\resources\\json\\sample.json");
	JSONParser parser = new JSONParser();
	Object o = parser.parse(r);
	JSONObject j = (JSONObject) o;

	Object From = j.get("From");
	System.out.println(From);

	Object To = j.get("To");
	System.out.println(To);
	Object TripType = j.get("TripType");
	System.out.println(TripType);
	Object FromDate = j.get("FromDate");
	System.out.println(FromDate);
	Object ReturnDate = j.get("ReturnDate");
	System.out.println(ReturnDate);
	Object FlightNo = j.get("FlightNo");
	System.out.println(FlightNo);
	Object PassergerName = j.get("PassergerName");
	System.out.println(PassergerName);
	Object PassergeDOB = j.get("PassergeDOB");
	System.out.println(PassergeDOB);
	Object StreetName = j.get("StreetName");
	System.out.println(StreetName);
	Object CityName = j.get("CityName");
	System.out.println(CityName);
	Object DistrictName = j.get("DistrictName");
	System.out.println(DistrictName);
	Object StateName = j.get("StateName");
	System.out.println(StateName);
	Object Country = j.get("Country");
	System.out.println(Country);
	Object PassergerMobileNumber = j.get("PassergerMobileNumber");
	System.out.println(PassergerMobileNumber);
	Object PassergerLandLineNumber = j.get("PassergerLandLineNumber");
	System.out.println(PassergerLandLineNumber);
	Object PersonalEmail = j.get("PersonalEmail");
	System.out.println(PersonalEmail);
	Object OfficialEmail = j.get("OfficialEmail");
	System.out.println(OfficialEmail);
	Object PassergerCardName = j.get("PassergerCardName");
	System.out.println(PassergerCardName);
	Object cardHolderName = j.get("cardHolderName");
	System.out.println(cardHolderName);
	Object CardNumber = j.get("CardNumber");
	System.out.println(CardNumber);
	Object CVVNumber = j.get("CVVNumber");
	System.out.println(CVVNumber);
	
//
	Product p = new Product();
	p.setFrom(From.toString());
	p.setTo(To.toString());
	p.setTripType(TripType.toString());
	p.setFromDate(FromDate.toString());
	p.setReturnDate(ReturnDate.toString());
	p.setFlightNo(FlightNo.toString());
	p.setPassergerName(PassergerName.toString());
	p.setPassergeDOB(PassergeDOB.toString());
	p.setStreetName(StreetName.toString());
	p.setCityName(CityName.toString());
	p.setDistrictName(DistrictName.toString());
	p.setStateName(StateName.toString());
	p.setCountry(Country.toString());
	String s1 = PassergerMobileNumber.toString();
	Long valueOf = Long.valueOf(s1);
	p.setPassergerMobileNumber(valueOf);
	p.setPassergerLandLineNumber(PassergerLandLineNumber.toString());
	p.setOfficialEmail(PersonalEmail.toString());
	p.setPersonalEmail(OfficialEmail.toString());
	p.setPassergerCardName(PassergerCardName.toString());
	p.setCardHolderName(cardHolderName.toString());
	String s2 = CardNumber.toString();
	Long valueOf1 = Long.valueOf(s2);
	p.setCardNumber(valueOf1);
	String s3 = CVVNumber.toString();
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

	Assert.assertEquals( "Delhi",p.getFrom());
	Assert.assertEquals( "chennai",p.getTo());
	Assert.assertEquals( "oneway",p.getTripType());
	Assert.assertEquals( "08-05-2020",p.getFromDate());
	Assert.assertEquals("09-05-2020",p.getReturnDate());
	Assert.assertEquals( "FN01",p.getFlightNo());
	Assert.assertEquals( "C.vimala",p.getPassergerName());
	Assert.assertEquals("13.01.94",p.getPassergeDOB());
	Assert.assertEquals("Thalai street",p.getStreetName());
	Assert.assertEquals( "chennai",p.getCityName());
	Assert.assertEquals( "chennai",p.getDistrictName());
	Assert.assertEquals( "TamilNadu",p.getStateName());
	Assert.assertEquals( "India",p.getCountry());
	Assert.assertEquals( "0452-5678652",p.getPassergerLandLineNumber());
	Assert.assertEquals( "vimala@gmail.com",p.getPersonalEmail());
	Assert.assertEquals( "hcl_vimala@hcl.com",p.getOfficialEmail());
	Assert.assertEquals("IOB",p.getPassergerCardName());
	Assert.assertEquals( "vimala",p.getCardHolderName());
    Assert.assertEquals(12345678912345l,p.getCardNumber());
Assert.assertEquals( 7890l,p.getCVVNumber());
//Assert.assertEquals(12345678912345l,p.getCardNumber(), "verified");
	
	
	
}
}
