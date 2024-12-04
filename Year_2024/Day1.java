package Year_2024;

import Core.Advent_Of_Code_Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Day1 extends Advent_Of_Code_Core {
    public Day1(int year, int day){
        super(year,day);
    }
    @Override
    public void solve(List<String> lines){
        System.out.print("2024 Day 1-Part 1:\n  ");
        String[] inputs = convertToStringArray(lines);
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        String[] temp;
        for(String line : lines){
            temp = line.split(" {3}");
            leftList.add(Integer.parseInt(temp[0]));
            rightList.add(Integer.parseInt(temp[1]));
        }
        Collections.sort(leftList);
        Collections.sort(rightList);
        int sum = 0;
        for(int i = 0; i<lines.size();i++){
            sum += Math.abs(leftList.get(i)-rightList.get(i));
        }
        System.out.println(sum);

        System.out.print("2024 Day 1-Part 2:\n  ");
        int numOfAc = 0;
        sum = 0;
        for(int i = 0; i<leftList.size(); i++){
            for(int j = 0; j<leftList.size(); j++){
                if(Objects.equals(rightList.get(j), leftList.get(i))){
                    numOfAc++;
                }
            }
            sum += leftList.get(i)*numOfAc;
            numOfAc = 0;
        }
        System.out.println(sum);
    }
}
