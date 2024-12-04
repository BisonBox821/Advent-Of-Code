package Core;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Advent_Of_Code_Core {
    public Advent_Of_Code_Core(int year, int day){
        BufferedReader reader;
        List<String> lines = new ArrayList<>();
        File file = new File("Year_"+year+"/inputs/Day"+day+".txt");
        try {
            reader = new BufferedReader(new FileReader(file));
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
            return;
        }
        try {
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
            reader.close();
        }
        catch (IOException e){
            System.err.println("IO Error");
            return;
        }
        solve(lines);
    }
    public abstract void solve(List<String> inputs);

    public String[] convertToStringArray(List<String> inputs){
        String[] arr = new String[inputs.size()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = inputs.get(i);
        }
        return arr;
    }
}