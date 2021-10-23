package ss.ch.jsonparsing.streaming.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jakarta.json.Json;
import jakarta.json.stream.JsonGenerator;

public class AdressJsonWriter {
	public static void main(String[] args) throws FileNotFoundException {
		JsonGenerator jsonGenerator = Json.createGenerator(new FileOutputStream(new File("D:\\codingzone\\rest-api\\javaxjson-jsonstreaming\\src\\main\\resources\\address.json")));
		jsonGenerator.writeStartObject();
		jsonGenerator.write("addresslane1", "ptg");
		jsonGenerator.writeStartArray("applienece");
		jsonGenerator.write("laptop");
		jsonGenerator.write("tv");
		jsonGenerator.writeEnd();
		jsonGenerator.writeStartObject("review");
		jsonGenerator.write("good","bad");
		jsonGenerator.writeEnd();
		jsonGenerator.writeEnd();
		jsonGenerator.close();
		System.out.println("check");
	}
}
