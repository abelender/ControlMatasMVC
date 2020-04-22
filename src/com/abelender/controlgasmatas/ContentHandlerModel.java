package com.abelender.controlgasmatas;


import java.util.ArrayList;
import java.util.Iterator;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ContentHandlerModel  extends DefaultHandler {

       private Price acct;
       private String temp;
       private ArrayList<Price> accList = new ArrayList<Price>();
	   public Object drivers;
 
       /*
        * When the parser encounters plain text (not XML elements),
        * it calls(this method, which accumulates them in a string buffer
        */
       public void characters(char[] buffer, int start, int length) {
              temp = new String(buffer, start, length);
       }
      
       /*
        * Every time the parser encounters the beginning of a new element,
        * it calls this method, which resets the string buffer
        */ 
       public void startElement(String uri, String localName,
                     String qName, Attributes attributes) throws SAXException {
              temp = "";
              if (qName.equalsIgnoreCase("place")) {
                     acct = new Price();
                     acct.setPlace_id(attributes.getValue("place_id"));

              } else if (qName.equalsIgnoreCase("gas_price")) {
                  
                  acct.setType(attributes.getValue("type"));
                }
       }

       /*
        * When the parser encounters the end of an element, it calls this method
        */
       public void endElement(String uri, String localName, String qName)
                     throws SAXException {

              if (qName.equalsIgnoreCase("place")) {
                     // add it to the list
                     accList.add(acct);

              } else if (qName.equalsIgnoreCase("gas_price")) {
                     acct.setGas_price(temp);
              } 

       }

       void readList() {
              System.out.println("No of  the accounts in bank '" + accList.size()  + "'.");
              Iterator<Price> it = accList.iterator();
              while (it.hasNext()) {
                     System.out.println(it.next().toString());
              }
       }
      
}



