package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=1;

        while(sc.hasNext());
        {
            System.out.println(++n +" "+sc.nextLine());
        }
        sc.close();
    }
}