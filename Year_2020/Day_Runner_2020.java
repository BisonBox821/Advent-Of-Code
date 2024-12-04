package Year_2020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day_Runner_2020 {
    public Day_Runner_2020(){
        choseDay();
    }
    public Day_Runner_2020(int day){
        runDay(day);
    }

    void runDay(int day){
        int year = 2020;
        switch (day){
            case 1:
                new Day1(year,day);
                break;
            case 2:
                new Day2(year,day);
                break;
            case 3:
                new Day3(year,day);
                break;
            case 4:
                new Day4(year,day);
                break;
            case 5:
                new Day5(year,day);
                break;
            case 6:
                new Day6(year,day);
                break;
            case 7:
                new Day7(year,day);
                break;
            case 8:
                new Day8(year,day);
                break;
            case 9:
                new Day9(year,day);
                break;
            case 10:
                new Day10(year,day);
                break;
            case 11:
                new Day11(year,day);
                break;
            case 12:
                new Day12(year,day);
                break;
            case 13:
                new Day13(year,day);
                break;
            case 14:
                new Day14(year,day);
                break;
            case 15:
                new Day15(year,day);
                break;
            case 16:
                new Day16(year,day);
                break;
            case 17:
                new Day17(year,day);
                break;
            case 18:
                new Day18(year,day);
                break;
            case 19:
                new Day19(year,day);
                break;
            case 20:
                new Day20(year,day);
                break;
            case 21:
                new Day21(year,day);
                break;
            case 22:
                new Day22(year,day);
                break;
            case 23:
                new Day23(year,day);
                break;
            case 24:
                new Day24(year,day);
                break;
            case 25:
                new Day25(year,day);
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
