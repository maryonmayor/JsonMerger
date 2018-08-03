package org.json.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Merger {

	FileOutputStream merger(FileInputStream destination, FileInputStream source);
	
	File merger(File json1, File json2, File destination);

	void merger(String json1, String json2, String destination) throws JsonProcessingException, IOException;
}
