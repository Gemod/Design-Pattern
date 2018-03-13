package Builder;

import java.awt.Robot;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException 
	{
		
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		//Build Document
		Document document = null;
		try {
			document = builder.parse(new File("src/ProvaIngsw.xml"));
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		document.getDocumentElement().normalize();
		 
	
		Element root = document.getDocumentElement();
	
	
		NodeList nList = document.getElementsByTagName("ROBOT");
		
		RobotPlan rob=null;
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    if(node.getNodeType()==1)
		    	rob=new OldRobotBuilder();
		    else
		    	rob=new InformaticRobot();
		    

		    if(eElement.getElementsByTagName("HEAD").item(temp).getTextContent()!=null)
	    	{
	    		rob.setRobotHead(eElement.getElementsByTagName("HEAD").item(temp).getTextContent());
	    	}
	    	if(eElement.getElementsByTagName("TORSO").item(temp).getTextContent()!=null)
	    	{
	    		rob.setRobotTorso(eElement.getElementsByTagName("TORSO").item(temp).getTextContent());
	    	}
	    	if(eElement.getElementsByTagName("ARMS").item(0).getTextContent()!=null)
	    	{
	    		rob.setRobotArms(eElement.getElementsByTagName("ARMS").item(0).getTextContent());
	    	}
	    	if(eElement.getElementsByTagName("LEGS").item(0).getTextContent()!=null)
	    	{
	    		rob.setRobotLegs(eElement.getElementsByTagName("LEGS").item(0).getTextContent());
	    	}
		    
		   System.out.println(rob.toString());
		   
		 }
		}
		 
	}


	

}
