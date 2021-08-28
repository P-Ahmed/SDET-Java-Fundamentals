package class05_21_08_2021;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JSONList {
    public static void main(String[] args) throws IOException, ParseException {
        char ch;
        String fileName="json\\student.json";
        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject studentObj = new JSONObject();

            Scanner input = new Scanner(System.in);
            System.out.println("Input student name: ");
            studentObj.put("name", input.next());
            System.out.println("Input class: ");
            studentObj.put("class", input.next());
            System.out.println("Input section: ");
            studentObj.put("section", input.next());
            System.out.println("Input roll: ");
            studentObj.put("roll", input.next());

            JSONArray jsonArray = (JSONArray) obj;
            //System.out.print(jsonArray);
            jsonArray.add(studentObj);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved!");
            System.out.print(jsonArray);
            System.out.println("\nDo you want to add more?[y/n]");
            ch=input.next().charAt(0);

        }
        while(ch!='n');

    }
}
