package com.oop.Lab3;

public class Main {
    public static void main(String[] args) {
        TextManager paragraph = new TextManager();
        paragraph.text = "Oceans and lakes have much in common, but they are also quite different. Both are bodies of water, but oceans are very large bodies of salt water, while lakes are much smaller bodies of fresh water. Lakes are usually surrounded by land, while oceans are what surround continents. Both have plants and animals living in them. The ocean is home to the largest animals on the planet, whereas lakes support much smaller forms of life. When it is time for a vacation, both will make a great place to visit and enjoy.";
        System.out.println("Number of words: " + paragraph.NumWords());
        System.out.println("Number of sentences: " + paragraph.NumSentences());
        paragraph.VowConsLet();
        System.out.print("The most often words in the text (top 5): ");
        paragraph.Top5();
        System.out.println();
        System.out.println("Longest word is '" + paragraph.Longest() + "'");

    }
}
