package Year_2024;

import Core.Advent_Of_Code_Core;

import java.util.ArrayList;
import java.util.List;

public class Day2 extends Advent_Of_Code_Core {
    public Day2(int year, int day){
        super(year,day);
    }
    @Override
    public void solve(List<String> inputs){
        String[] lines = convertToStringArray(inputs);
        String[] temp;
        int tempNum = 0;
        boolean isNext = false;
        boolean isAdding = false;
        int count = 0;
        for (String line : lines) {
            temp = line.split(" ");
            isNext = false;
            for (int i = 0; i < temp.length; i++) {
                if (i == 0) {
                    tempNum = Integer.parseInt(temp[i]);
                } else if (i == 1) {
                    if ((tempNum == Integer.parseInt(temp[i]) + 1)) {
                        isAdding = true;
                    } else if ((tempNum == Integer.parseInt(temp[i]) + 2)) {
                        isAdding = true;
                    } else if ((tempNum == Integer.parseInt(temp[i]) + 3)) {
                        isAdding = true;
                    }
                    if ((tempNum == Integer.parseInt(temp[i]) - 1)) {
                        isAdding = false;
                    } else if ((tempNum == Integer.parseInt(temp[i]) - 2)) {
                        isAdding = false;
                    } else if ((tempNum == Integer.parseInt(temp[i]) - 3)) {
                        isAdding = false;
                    }
                } else {
                    if (isAdding) {
                        if ((tempNum == Integer.parseInt(temp[i]) + 1)) {
                            isNext = true;
                        } else if ((tempNum == Integer.parseInt(temp[i]) + 2)) {
                            isNext = true;
                        } else if ((tempNum == Integer.parseInt(temp[i]) + 3)) {
                            isNext = true;
                        } else {
                            isNext = false;
                            break;
                        }
                    } else {
                        if ((tempNum == Integer.parseInt(temp[i]) - 1)) {
                            isNext = true;
                        } else if ((tempNum == Integer.parseInt(temp[i]) - 2)) {
                            isNext = true;
                        } else if ((tempNum == Integer.parseInt(temp[i]) - 3)) {
                            isNext = true;
                        } else {
                            isNext = false;
                            break;
                        }
                    }
                }
                tempNum = Integer.parseInt(temp[i]);
            }
            if (isNext) {
                count++;
            }
        }
        System.out.println("2024 Day 2-Part 1: \n  " +count);

        /*
        1. Check First Digit
        2. Check Second Digit
        3. Check All Other Digits
         */

        //Part 2
        count = 0;
        int i;
        ArrayList<Integer> nums;
        int[] temps;
        ArrayList<Integer> newNums = new ArrayList<>();
        for(String line : lines){
            i = 0;
            temp = line.split(" ");
            isNext = false;
            nums = new ArrayList<>();
            for (String s : temp) {
                nums.add(Integer.parseInt(s));
            }
            while (i<temp.length){
                newNums.clear();
                newNums.addAll(nums);
                newNums.remove(i);
                temps = newNums.stream().mapToInt(Integer::intValue).toArray();
                for (int g = 0; g < temps.length; g++) {
                    if(g == 1){
                        if(temps[1]+1 == tempNum ||temps[1]+2 == tempNum || temps[1]+3== tempNum){
                            isAdding = false;
                        }
                        else if(temps[1]-1 == tempNum ||temps[1]-2 == tempNum || temps[1]-3== tempNum){
                            isAdding = true;
                        }
                        else{
                            break;
                        }
                    }
                    else if(g>1){
                        if(isAdding){
                            if(temps[g] == tempNum+1 || temps[g] == tempNum+2 || temps[g] == tempNum+3){
                                isNext = true;
                            }
                            else{
                                isNext = false;
                                break;
                            }
                        }else{
                            if(temps[g] == tempNum-1 || temps[g] == tempNum-2 || temps[g] == tempNum-3){
                                isNext = true;
                            }
                            else{
                                isNext = false;
                                break;
                            }
                        }
                    }
                    tempNum = temps[g];
                }
                if(isNext){
                    break;
                }
                i++;
            }
            if(isNext){
                count++;
            }
        }
        System.out.println("2024 Day 2-Part 2:\n  "+count);
    }
}
