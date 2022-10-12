package com.rahul.poc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahul.poc.binding.BulkData;


public class XmlMapperTest 
{
	public static void main( String[] args ) throws JsonMappingException, JsonProcessingException
	{
		String xmlTagString = "<BulkData error=\"0\" type=\"tdrdata\" path=\"data/trdata/tar.gz\"/>";
		XmlMapper mapper = new XmlMapper();
		BulkData data = mapper.readValue(xmlTagString, BulkData.class);
		System.out.println(data);
	}
}
