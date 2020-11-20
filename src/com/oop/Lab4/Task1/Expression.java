package com.oop.Lab4.Task1;


import java.io.File;
import java.net.URL;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Expression {
    public static String ReadFromFile(File myObj)
    {
        String data = null;
        try
        {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                data = data.replaceAll("\\s+", ""); // eliminates blank spaces
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        int state = 0;
        URL url = Expression.class.getResource("one_expression.txt");
        File myObj = new File(url.getPath());
        String s = ReadFromFile(myObj);
        Queue1 q = new Queue1();
        for (char c : s.toCharArray()) {
            if (c == '(') q.push(c);
            else
                if (c ==')')
                    if (!q.isEmpty()) q.pop();
                    else
                    {
                        System.out.println("Parentheses are put incorrect");
                        state = 1;
                    }
        }
        if (q.isEmpty() && (state == 0)) System.out.println("Parentheses are put correct");
        else System.out.println("Parentheses are put incorrect");

    }
}
