package com.oop.Lab4.Task2;


import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Expressions {
    public static void ReadFromFile(File myObj, String [] a)
    {
        String data;
        int n = 0;
        try
        {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                data = data.replaceAll("\\s+", ""); // eliminates blank spaces
                a[n] = data;
                n++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int state = 0;
        URL url = Expressions.class.getResource("three_expressions.txt");
        File myObj = new File(url.getPath());
        String [] s = new String[3];
        ReadFromFile(myObj,s);
        Queue1 q = new Queue1();
        for (int i = 1; i<=3; i++) {
            System.out.println("Expression " + i);
            for (char c : s[i].toCharArray()) {
                if (c == '(') q.push(c);
                else if (c == ')')
                    if (!q.isEmpty()) q.pop();
                    else
                    {
                        System.out.println("Parentheses are put incorrect");
                        state =1;
                    }
            }
            if (q.isEmpty() && (state == 0)) System.out.println("Parentheses are put correct");
            else if (!q.isEmpty()) System.out.println("Parentheses are put incorrect");
            q = new Queue1();
        }
    }
}
