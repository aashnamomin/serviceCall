package com.example.serviceCall.Component;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

@Component
public class XmlConverter {

	
	public String generateXmlStringFromClass(Object type) throws JAXBException {  //pass IP object

		JAXBContext context = JAXBContext.newInstance(type.getClass());
		Marshaller marshaller = context.createMarshaller();
		StringWriter reqMsg = new StringWriter();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
		marshaller.marshal(type, reqMsg);
		return reqMsg.toString();

	}
	

	
	public Object generateClassFromXml(String xml, Object type) throws JAXBException {

		JAXBContext context1 = JAXBContext.newInstance(type.getClass());
		Unmarshaller unmarshaller = context1.createUnmarshaller();
		StringReader reader = new StringReader(xml);
		Object responseobject = (Object) unmarshaller.unmarshal(reader);
		return responseobject;

	}
}
