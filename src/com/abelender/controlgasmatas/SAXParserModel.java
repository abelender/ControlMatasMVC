package com.abelender.controlgasmatas;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class SAXParserModel {
	
	SAXParserFactory factory;
	SAXParser saxParser;
	ContentHandlerModel handler;
	InputStream is;
	
	String url = "https://bit.ly/2JNcTha";
	
	public SAXParserModel() {
		
		try {
			
			is = new URL(url).openStream();
			factory = SAXParserFactory.newInstance();
			saxParser = factory.newSAXParser();
			handler = new ContentHandlerModel();
			saxParser.parse(is, handler);

			
		} catch (Throwable e) {
			e.printStackTrace();
		}		
	}
}
