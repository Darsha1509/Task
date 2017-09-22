package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TextRepeatUtils {
    private static ArrayList<String> unaccoutedWords; // object field, that contains unions, pronouns and prepositions

    /*Getter method for unccountedWords that fill up this ArrayList with words, that we must not to count when count repeat words */
    private static ArrayList<String> getUnaccoutedWords(){

        ArrayList<String> unaccoutedWords = new ArrayList<>();

        unaccoutedWords.add("а");
        unaccoutedWords.add("вдобавок");
        unaccoutedWords.add("именно");
        unaccoutedWords.add("также");
        unaccoutedWords.add("то");
        unaccoutedWords.add("благодаря");
        unaccoutedWords.add("тому");
        unaccoutedWords.add("что");
        unaccoutedWords.add("в");
        unaccoutedWords.add("чего");
        unaccoutedWords.add("того");
        unaccoutedWords.add("тем");
        unaccoutedWords.add("если");
        unaccoutedWords.add("как");
        unaccoutedWords.add("ввиду");
        unaccoutedWords.add("вопреки");
        unaccoutedWords.add("вроде");
        unaccoutedWords.add("вследствие");
        unaccoutedWords.add("да");
        unaccoutedWords.add("еще");
        unaccoutedWords.add("и");
        unaccoutedWords.add("но");
        unaccoutedWords.add("то");
        unaccoutedWords.add("дабы");
        unaccoutedWords.add("даже");
        unaccoutedWords.add("для");
        unaccoutedWords.add("чтобы");
        unaccoutedWords.add("же");
        unaccoutedWords.add("едва");
        unaccoutedWords.add("затем");
        unaccoutedWords.add("зачем");
        unaccoutedWords.add("следовательно");
        unaccoutedWords.add("тогда");
        unaccoutedWords.add("ибо");
        unaccoutedWords.add("из");
        unaccoutedWords.add("за");
        unaccoutedWords.add("или");
        unaccoutedWords.add("кабы");
        unaccoutedWords.add("будто");
        unaccoutedWords.add("бы");
        unaccoutedWords.add("словно");
        unaccoutedWords.add("значит");
        unaccoutedWords.add("зато");
        unaccoutedWords.add("притом");
        unaccoutedWords.add("таки");
        unaccoutedWords.add("только");
        unaccoutedWords.add("так");
        unaccoutedWords.add("то");
        unaccoutedWords.add("коли");
        unaccoutedWords.add("кроме");
        unaccoutedWords.add("ли");
        unaccoutedWords.add("либо");
        unaccoutedWords.add("лишь");
        unaccoutedWords.add("между");
        unaccoutedWords.add("нежели");
        unaccoutedWords.add("не");
        unaccoutedWords.add("столько");
        unaccoutedWords.add("сколько");
        unaccoutedWords.add("даже");
        unaccoutedWords.add("ни");
        unaccoutedWords.add("однако");
        unaccoutedWords.add("особенно");
        unaccoutedWords.add("оттого");
        unaccoutedWords.add("отчего");
        unaccoutedWords.add("перед");
        unaccoutedWords.add("мере");
        unaccoutedWords.add("подобно");
        unaccoutedWords.add("пока");
        unaccoutedWords.add("покамест");
        unaccoutedWords.add("покуда");
        unaccoutedWords.add("после");
        unaccoutedWords.add("поскольку");
        unaccoutedWords.add("почему");
        unaccoutedWords.add("прежде");
        unaccoutedWords.add("притом");
        unaccoutedWords.add("причем");
        unaccoutedWords.add("пускай");
        unaccoutedWords.add("пусть");
        unaccoutedWords.add("ради");
        unaccoutedWords.add("словно");
        unaccoutedWords.add("чуть");
        unaccoutedWords.add("точно");
        unaccoutedWords.add("хотя");
        unaccoutedWords.add("чем");
        unaccoutedWords.add("чтоб");

        unaccoutedWords.add("а");
        unaccoutedWords.add("ля");
        unaccoutedWords.add("без");
        unaccoutedWords.add("безо");
        unaccoutedWords.add("близ");
        unaccoutedWords.add("от");
        unaccoutedWords.add("в");
        unaccoutedWords.add("с");
        unaccoutedWords.add("ввиду");
        unaccoutedWords.add("вдогон");
        unaccoutedWords.add("вдоль");
        unaccoutedWords.add("вместо");
        unaccoutedWords.add("вне");
        unaccoutedWords.add("во");
        unaccoutedWords.add("возле");
        unaccoutedWords.add("до");
        unaccoutedWords.add("вроде");
        unaccoutedWords.add("для");
        unaccoutedWords.add("заместо");
        unaccoutedWords.add("под");
        unaccoutedWords.add("изо");
        unaccoutedWords.add("к");
        unaccoutedWords.add("ко");
        unaccoutedWords.add("меж");
        unaccoutedWords.add("между");
        unaccoutedWords.add("мимо");
        unaccoutedWords.add("на");
        unaccoutedWords.add("над");
        unaccoutedWords.add("насчет");
        unaccoutedWords.add("о");
        unaccoutedWords.add("об");
        unaccoutedWords.add("обо");
        unaccoutedWords.add("обок");
        unaccoutedWords.add("около");
        unaccoutedWords.add("от");
        unaccoutedWords.add("перед");
        unaccoutedWords.add("передо");
        unaccoutedWords.add("по");
        unaccoutedWords.add("под");
        unaccoutedWords.add("подле");
        unaccoutedWords.add("подо");
        unaccoutedWords.add("пред");
        unaccoutedWords.add("предо");
        unaccoutedWords.add("при");
        unaccoutedWords.add("про");
        unaccoutedWords.add("рядом");
        unaccoutedWords.add("сверх");
        unaccoutedWords.add("среди");
        unaccoutedWords.add("со");
        unaccoutedWords.add("среди");
        unaccoutedWords.add("средь");
        unaccoutedWords.add("у");
        unaccoutedWords.add("через");
        unaccoutedWords.add("черезо");
        unaccoutedWords.add("чрез");

        unaccoutedWords.add("я");
        unaccoutedWords.add("ты");
        unaccoutedWords.add("он");
        unaccoutedWords.add("она");
        unaccoutedWords.add("оно");
        unaccoutedWords.add("мы");
        unaccoutedWords.add("вы");
        unaccoutedWords.add("они");
        unaccoutedWords.add("себя");
        unaccoutedWords.add("мой");
        unaccoutedWords.add("твой");
        unaccoutedWords.add("свой");
        unaccoutedWords.add("ваш");
        unaccoutedWords.add("наш");
        unaccoutedWords.add("его");
        unaccoutedWords.add("её");
        unaccoutedWords.add("их");
        unaccoutedWords.add("кто");
        unaccoutedWords.add("какой");
        unaccoutedWords.add("чей");
        unaccoutedWords.add("где");
        unaccoutedWords.add("который");
        unaccoutedWords.add("сколько");
        unaccoutedWords.add("каковой");
        unaccoutedWords.add("каков");
        unaccoutedWords.add("зачем");
        unaccoutedWords.add("когда");
        unaccoutedWords.add("тот");
        unaccoutedWords.add("этот");
        unaccoutedWords.add("столько");
        unaccoutedWords.add("такой");
        unaccoutedWords.add("таков");
        unaccoutedWords.add("сей");
        unaccoutedWords.add("всякий");
        unaccoutedWords.add("каждый");
        unaccoutedWords.add("сам");
        unaccoutedWords.add("самый");
        unaccoutedWords.add("любой");
        unaccoutedWords.add("иной");
        unaccoutedWords.add("другой");
        unaccoutedWords.add("весь");
        unaccoutedWords.add("никто");
        unaccoutedWords.add("ничто");
        unaccoutedWords.add("никакой");
        unaccoutedWords.add("ничей");
        unaccoutedWords.add("некого");
        unaccoutedWords.add("нечего");
        unaccoutedWords.add("незачем");
        unaccoutedWords.add("некто");
        unaccoutedWords.add("весь");
        unaccoutedWords.add("нечто");
        unaccoutedWords.add("некоторый");
        unaccoutedWords.add("несколько");
        unaccoutedWords.add("нибудь");



        return unaccoutedWords;
    }

    /*Method for extracting text from file and transfer it to String type*/
    public static String exstractStringFromFile(File f){


        FileInputStream fis = null;

        try {
            fis = new FileInputStream(f);
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }

        StringBuilder output = new StringBuilder();
        String line="";

        try {

            while ((line = br.readLine()) != null) {
                output.append(line);
            }
            br.close();

        }catch(IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    /*Method to display top 10 repeat words*/
    public static void topTenRepeatWords(String result){
        result = result.toLowerCase(); //make text from file (further text) to lowercase

        /*excluding some symbols from text (exchange it to space " ") to get only words*/
        result = result.replaceAll("[.]", " ");
        result = result.replaceAll("[,]", " ");
        result = result.replaceAll("[-]", " ");
        result = result.replaceAll("\\(", " ");
        result = result.replaceAll("\\)", " ");
        result = result.replaceAll("\\[", " ");
        result = result.replaceAll("[]]", " ");
        result = result.replaceAll("\\{", " ");
        result = result.replaceAll("[}]", " ");

        String[] words = result.split(" "); //transferring text to array of words (some words is " " - space, because of exchanging in last steps)

        /*Getting ArrayList myWords only of words (without spaces)*/
        ArrayList<String> myWords = new ArrayList<>();

        for (int j = 0; j < words.length; j++) {
            if (!words[j].equals("") && !words[j].equals(" ") && !TextRepeatUtils.getUnaccoutedWords().contains(words[j])) {
                myWords.add(words[j]);
            }

        }

        /*Creating and filling HashMap allWords: key - word, value-number of repetition in the text*/
        Map<String, Integer> allWords = new HashMap<String, Integer>();

        for (String s : myWords) {
            if (!allWords.containsKey(s)) {
                allWords.put(s, 1);
            } else {
                for (Map.Entry<String, Integer> pair : allWords.entrySet()) {
                    if (s.equals(pair.getKey())) {
                        int value = pair.getValue();
                        value++;
                        pair.setValue(value);
                    }
                }
            }
        }

        /*Creating array of all values in the HashMap allWords and sort it descending*/
        int[] values = new int[allWords.size()];

        int i = 0;
        for (int value : allWords.values()) {
            values[i] = value;
            i++;
        }


        for (int j = 0; j < values.length; j++) {
            for (int k = j + 1; k < values.length; k++) {
                if (values[j] < values[k]) {
                    int a = values[j];
                    values[j] = values[k];
                    values[k] = a;
                }
            }
        }

        /*Creating ArrayList finalWords (size = 10) take words from keys of HashMap allWords(by corresponding values)
        in order that correspond to order of String array values*/
        ArrayList<String> finalWords = new ArrayList<>();

        for(int j=0; j< 10; j++){
            for(Map.Entry<String, Integer> pair : allWords.entrySet()){
                if(pair.getValue() == values[j] && !finalWords.contains(pair.getKey())){
                    finalWords.add(pair.getKey());
                    break;
                }
            }
        }

        /*Display values of ArrayList finalWords = Top 10 REpet Words*/
        System.out.println("Топ 10 наиболее часто встречающихся слов");
        System.out.println("-----");

        for (String s : finalWords) {
            System.out.println(s);
        }

    }
}
