package ss.ch.jsonparsing.streaming.parser.jsongenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jakarta.json.Json;
import jakarta.json.stream.JsonGenerator;
import ss.ch.jsonparsing.streaming.parser.jsongenerator.bean.Bill;

public class BillJsonGenerator {
	public void sendBill(String location,Bill bill) throws FileNotFoundException {
		JsonGenerator jsonGenerator = Json.createGenerator(new FileOutputStream(new File(location)));
		jsonGenerator.writeStartObject();
		jsonGenerator.write("consumer",bill.getConsumer());
		jsonGenerator.writeStartObject("electricServiceTypes");
		jsonGenerator.write("service",bill.getCategory());
		jsonGenerator.writeEnd();
		jsonGenerator.writeEnd();
		jsonGenerator.close();
		System.out.println("send");
	}
}
