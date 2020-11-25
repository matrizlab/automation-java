package Automation;

import java.io.*;
import java.util.Properties;

public class JavaTest1 {
    public static void main(String[] args) throws IOException {

        int i=10;
        System.out.println("Hello"+"\n");
        System.out.println(i);
        System.out.println(i * 10);

        Properties props = new Properties();
        props.put("name", "Matrizlab");
        props.put("country", "Italy");

        System.out.println(props.get("country"));


        System.out.println("TEST READ FILE"+"\n");
        FileInputStream file = new FileInputStream(new File("D:\\Documenti\\Files\\sample-text-file.txt"));
        //System.out.println((char)file.read());

        int j = file.read();
        System.out.print(j+"\n");

        while(j != -1) {
            System.out.print((char)j);

            // Reads next byte from the file
            j = file.read();
        }
        file.close();

        System.out.println("\n"+"TEST READ LINE"+"\n");
        char[] output =new char[100];

        BufferedReader is = new BufferedReader(new FileReader("D:\\Documenti\\Files\\sample-text-file.txt"));

        //System.out.println("\n"+ (char)is.read());
        System.out.println(is.readLine());


    }
}
