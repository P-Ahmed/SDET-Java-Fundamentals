package assignment05_21_08_2021;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment05_02 {
    static Scanner scanner = new Scanner(System.in);

    public static void WriteJSONQues() throws IOException, ParseException {
        JSONObject quesObject = new JSONObject();
        FileWriter writer = new FileWriter("E:\\RoadToSDET\\Projects\\Java Fundamentals\\src\\main\\java\\assignment05_21_08_2021\\QuestionBank.json");

//        System.out.println("How many questions do you wish to enter?");
//        int quesCounter = scanner.nextInt();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter the question: ");
            String question = scanner.nextLine();
            quesObject.put("Question", question);

            System.out.println("Enter the option one: ");
            String option1 = scanner.nextLine();
            quesObject.put("Option-1", option1);

            System.out.println("Enter the option two: ");
            String option2 = scanner.nextLine();
            quesObject.put("Option-2", option2);

            System.out.println("What is the answer?: ");
            String answer = scanner.nextLine();
            quesObject.put("Answer", answer);

            writer.write(quesObject.toJSONString());
            writer.flush();
        }

//        FileWriter writer = new FileWriter("E:\\RoadToSDET\\Projects\\Java Fundamentals\\src\\main\\java\\assignment05_21_08_2021\\QuestionBank.json");
//        writer.write(quesObject.toJSONString());
//        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws IOException, ParseException {
        WriteJSONQues();
    }
}
