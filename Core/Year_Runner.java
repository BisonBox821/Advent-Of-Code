package Core;

import Year_2020.Day_Runner_2020;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Year_Runner {
    public Year_Runner(){
        choseYear();
    }
    public Year_Runner(int year, int day){
        runYear(year, day);
    }
    public void runYear(int year, int day) {
        if(day == -1) {
            switch (year) {
                case 2020:
                    Day_Runner_2020 Year_20 = new Day_Runner_2020();
                    break;
                default:
                    System.err.println("No code for year: " + year);
                    break;
            }
            choseYear();
        }
        else{
            switch (year){
                case 2020:
                    Day_Runner_2020 Year_XX = new Day_Runner_2020(day);
                    break;
                default:
                    System.err.println("No code for year: " + year);
                    break;
            }
        }
    }
    void choseYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose a year you would like to see!");
        int readYear = 0;
        try{
            readYear = scanner.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Please input a valid year");
            choseYear();
        }
        runYear(readYear, -1);
    }
}
