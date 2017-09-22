package main;
import java.io.*;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) throws IOException {

        /*Entering file path*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адрес файла:\n");
        String address = sc.nextLine();
        sc.close();

        /*Ceating object File to understanding for project*/
        File f = new File(address);

        /*Transferring file text to String result*/
        String result = TextRepeatUtils.exstractStringFromFile(f);

        /*Call topTenRepeatWords method to display Top 10 Repeat Words*/
        TextRepeatUtils.topTenRepeatWords(result);

        /*Creating Check object and calling makeCheck() method to check bracket alignment*/
        Check check = new Check(result);
        check.makeCheck();

    }

}
