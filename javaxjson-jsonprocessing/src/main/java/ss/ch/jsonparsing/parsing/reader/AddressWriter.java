package ss.ch.jsonparsing.parsing.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;

public class AddressWriter {
	public static void main(String[] args) throws FileNotFoundException {
		JsonWriter jsonWriter = Json.createWriter(new FileOutputStream
				(new File("D:\\codingzone\\rest-api\\javaxjson-jsonprocessing\\src\\main\\resources\\address.json"),true));

		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		arrayBuilder.add(101);
		arrayBuilder.add(true);
		arrayBuilder.add(0, "allow");
		
		JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
		objectBuilder.add("lane", "ptg");
		objectBuilder.add("pin", 767025);
		arrayBuilder.add(objectBuilder);
		objectBuilder.add("array",arrayBuilder);
		
		JsonArray jsonArray = arrayBuilder.build();		
		JsonObject jsonObject = objectBuilder.build();
				
		jsonWriter.write(jsonObject);
		System.out.println("array is written");
	}
}
