package com.oop.Lab3;

public class TextManager {

    public String text;
    public int vowels = 0, consonants = 0, letters = 0;

    public int NumWords()
    {
        int wordCount = 0;
        String[] words = text.split("\\s+");
        wordCount += words.length;
        return wordCount;
    }

    public int NumSentences()
    {
        int sentenceCount = 0;
        String[] sentenceList = text.split("[!?.:]+");
        sentenceCount += sentenceList.length;
        return sentenceCount;
    }

    public void VowConsLet()
    {
        String[] sentenceList = text.split("[!?.:]+");
        for (String s : sentenceList)
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else if ((ch >= 'a' && ch <= 'z')) {
                    consonants++;
                }
            }
        letters = consonants + vowels;
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of letters: " + letters);
    }

    public String OftenWord(String[] words)
    {
        String word = null;
        int count, maxCount = 0;
        for(int i = 0; i < words.length; i++){
            count = 1;
            for(int j = i+1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                word = words[i];
            }
        }
        return word;
    }

    public void Top5()
    {
        String copy = text.toLowerCase();
        String[] words = copy.split("\\s+");
        for (int j = 0; j<5; j++)
        {
            System.out.print(OftenWord(words) + " ");
            String target = String.copyValueOf(OftenWord(words).toCharArray());
            copy = copy.replace(target, "");
            words = copy.split("\\s+");
        }
    }

    public String Longest()
    {
        String[] words = text.split("\\s+");
        String l =words[0];
        for (String word : words)
        {
            if (word.length() >= l.length())
            {
                l = word;
            }
        }
        return l;
    }
}