package Year_2024;

import Year_2020.Day10;
import Year_2020.Day11;
import Year_2020.Day12;
import Year_2020.Day13;
import Year_2020.Day14;
import Year_2020.Day15;
import Year_2020.Day16;
import Year_2020.Day17;
import Year_2020.Day18;
import Year_2020.Day19;
import Year_2020.Day20;
import Year_2020.Day21;
import Year_2020.Day22;
import Year_2020.Day23;
import Year_2020.Day24;
import Year_2020.Day25;
import Year_2020.Day3;
import Year_2020.Day4;
import Year_2020.Day5;
import Year_2020.Day6;
import Year_2020.Day7;
import Year_2020.Day8;
import Year_2020.Day9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day_Runner_2024 {
    public Day_Runner_2024(){
        choseDay();
    }
    public Day_Runner_2024(int day){
        runDay(day);
    }

    void runDay(int day){
        int year = 2024;
        switch (day){
            case 1:
                new Year_2024.Day1(year,day);
                break;
            case 2:
                new Year_2024.Day2(year,day);
                break;
            case 3:
                new Year_2024.Day3(year,day);
                break;
            case 4:
                new Year_2024.Day4(year,day);
                break;
            case 5:
                new Year_2024.Day5(year,day);
                break;
            case 6:
                new Year_2024.Day6(year,day);
                break;
            case 7:
                new Year_2024.Day7(year,day);
                break;
            case 8:
                new Year_2024.Day8(year,day);
                break;
            case 9:
                new Year_2024.Day9(year,day);
                break;
            case 10:
                new Year_2024.Day10(year,day);
                break;
            case 11:
                new Year_2024.Day11(year,day);
                break;
            case 12:
                new Year_2024.Day12(year,day);
                break;
            case 13:
                new Year_2024.Day13(year,day);
                break;
            case 14:
                new Year_2024.Day14(year,day);
                break;
            case 15:
                new Year_2024.Day15(year,day);
                break;
            case 16:
                new Year_2024.Day16(year,day);
                break;
            case 17:
                new Year_2024.Day17(year,day);
                break;
            case 18:
                new Year_2024.Day18(year,day);
                break;
            case 19:
                new Year_2024.Day19(year,day);
                break;
            case 20:
                new Year_2024.Day20(year,day);
                break;
            case 21:
                new Year_2024.Day21(year,day);
                break;
            case 22:
                new Year_2024.Day22(year,day);
                break;
            case 23:
                new Year_2024.Day23(year,day);
                break;
            case 24:
                new Year_2024.Day24(year,day);
                break;
            case 25:
                new Year_2024.Day25(year,day);
                break;
            default:
                System.err.println("Enter a valid day, 1-25");
                break;
        }
    }
    void choseDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose a day from the 2020 challenge!");
        byte readDay = 0;
        try {
            readDay = scanner.nextByte();
        }catch (InputMismatchException e){
            System.err.println("Please input a number");
            choseDay();
        }
        runDay(readDay);
    }
}
