package org.json.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MergerServiceImpl implements Merger {

	@Override
	public FileOutputStream merger(FileInputStream destination, FileInputStream source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File merger(File json1, File json2, File destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void merger(String json1, String json2, String destination) throws JsonProcessingException, IOException {
		ObjectMapper om = new ObjectMapper();
		JsonNode jsonNode1 = om.readTree(new File(json1));
		JsonNode jsonNode2 = om.readTree(new File(json2));
		//JsonNode jsonNode1 = om.readerForUpdating(new File(json1)).createObjectNode();

		om.readerForUpdating(jsonNode1);
	}

}
