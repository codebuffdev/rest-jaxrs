package ss.ch.jsonparsing.parsing.reader.practiceagain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class JsonFileReader {
	public static void main(String[] args) throws FileNotFoundException{
		//JsonFile
		//JsonFileReader
		JsonReader reader = Json.createReader(new FileInputStream(new File("D:\\codingzone\\rest-api\\javaxjson-jsonprocessing\\src\\main\\resources\\read.json")));
		JsonObject readObject = reader.readObject();
		Set<String> keySet = readObject.keySet();
		for (String key: keySet) {
		
		}	

	}
}
