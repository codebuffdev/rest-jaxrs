package ss.ch.jsonparsing.streaming.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jakarta.json.Json;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

public class TotalQuantityParser {
	public static int totalQuantity(String file) throws FileNotFoundException{
		
		JsonParser jsonParser = Json.createParser(new FileInputStream(new File(file)));
		int totalQuantity = 0;
		
		while(jsonParser.hasNext()) {
			Event e = jsonParser.next();
			if(e == Event.KEY_NAME) {
				String jsonKey = jsonParser.getString();
				if(jsonKey.equals("quantity")) {
						jsonParser.next();
						int quantity = jsonParser.getInt();  
						totalQuantity += quantity;
				}else if(jsonKey.equals("shippingAddress")) {
					break;
				}
			}
		}
		return totalQuantity;
	}
}
