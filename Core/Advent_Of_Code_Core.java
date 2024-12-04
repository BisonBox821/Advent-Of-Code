package Core;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Advent_Of_Code_Core {
    public Advent_Of_Code_Core(int year, String day){
        BufferedReader reader;
        List<String> lines = new ArrayList<>();
        File file = new File("inputs/"+year+"/day"+day+".txt");
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
}