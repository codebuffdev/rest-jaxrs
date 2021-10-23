package ss.ch.jsonparsing.parsing.reader;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AccountReader {
    public static void main(String[] args) throws FileNotFoundException {
        JsonReader jsonReader = Json.createReader(new FileInputStream
                         (new File("D:\\codingzone\\rest-api\\javaxjson-jsonprocessing\\src\\main\\resources\\account.json")));
        JsonObject accJsonObject = jsonReader.readObject();
        System.out.println("accountNo = " + accJsonObject.getString("accountNo"));
        System.out.println("accountHolderName = " + accJsonObject.getString("accountHolderName"));
        System.out.println(accJsonObject.toString());
    }
}
