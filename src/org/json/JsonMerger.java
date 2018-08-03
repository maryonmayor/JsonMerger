package org.json;

import java.io.IOException;

import org.json.service.Merger;
import org.json.service.MergerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;

@Configuration
public class JsonMerger {

	Merger merge = new MergerServiceImpl();
	
	public static void main(String[] args) throws JsonProcessingException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-context.xml"});
		
		Merger merger = (Merger) context.getBean("merger");
		
		String json1 = args[0];
		String json2 = args[1];
		String destination = args[2];
		
		merger.merger(json1, json2, destination);
		
		System.out.println(json1 + " " + json2 + " " + destination );
		System.out.println( System.getProperty("user.dir"));
	}

}
