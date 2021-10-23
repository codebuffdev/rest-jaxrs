package ss.ch.jsonparsing.streaming.parser.jsongenerator.test;

import java.io.FileNotFoundException;

import ss.ch.jsonparsing.streaming.parser.jsongenerator.BillJsonGenerator;
import ss.ch.jsonparsing.streaming.parser.jsongenerator.bean.Bill;

public class SendBill {
	public static void main(String[] args) throws FileNotFoundException {
		new BillJsonGenerator().sendBill(
				"D:\\codingzone\\rest-api\\javaxjson-jsonstreaming\\src\\main\\resources\\bill.json",
				new Bill("techMahindra", 32412, "business", 32443434));
	}
}
