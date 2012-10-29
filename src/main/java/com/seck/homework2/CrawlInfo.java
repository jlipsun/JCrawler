package com.seck.homework2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class CrawlInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("Files/Sample.xml");
				
		try {
			
			Document document = (Document) builder.build(xmlFile);
			
			Element rootNode = document.getRootElement();

			List list = rootNode.getChildren("site");
			
			for( int i = 0; i < list.size(); i++ ) {
				
				Element node = (Element) list.get(i);
				
				System.out.println(node.getChildText("url"));
				
			}
		
		
		} catch (JDOMException jdomex) {
			
			System.out.println(jdomex.getMessage());
		
		} catch (IOException io) {
			
			System.out.println(io.getMessage());
		
		}
		
	}

}
