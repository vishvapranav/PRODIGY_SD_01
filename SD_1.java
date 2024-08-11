package PRODIGY;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SD_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Get input from user
        System.out.println("Enter the temperature:");
        float input=sc.nextInt();

        //Temperature to fahrenheit
        float fahrenheit=(input*9/5)+32;

        //Temperature to kelvin
        float kelvin=input-273.15f;

        //Outputs
        System.out.println(input+" Degree Celsius is converted into Fahrenheit of "+fahrenheit);
        System.out.println(input+" Degree Celsius is converted into Kelvin of "+kelvin);
    }
}
