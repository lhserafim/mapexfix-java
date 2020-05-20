package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String args[]) {
        String path = "/Users/lhserafim/IdeaProjects/MapExFix-java/in.txt";
        Map<String,Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                System.out.println(fields[0] + fields[1]);
                map.put(fields[0], String.  [1]);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
