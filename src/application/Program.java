package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String args[]) {
        String path = "/Users/lhserafim/IdeaProjects/MapExFix-java/in.txt";
        Map<String,Integer> map = new HashMap<>();

        /* Minha versão
        int alexBlue = 0;
        int bobBrown = 0;
        int mariaGreen = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                System.out.println(fields[0] + fields[1]);
                // Contagem dos votos
                if (fields[0].equals("Alex Blue") ) {
                    alexBlue += Integer.parseInt(fields[1]);
                }
                else if (fields[0].equals("Bob Brown")) {
                    bobBrown += Integer.parseInt(fields[1]);
                }
                else if (fields[0].equals("Maria Green")) {
                    mariaGreen += Integer.parseInt(fields[1]);
                }
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        map.put("Alex Blue", alexBlue);
        map.put("Bob Brown", bobBrown);
        map.put("Maria Green", mariaGreen);

        System.out.println("RESULT");
        System.out.println("Alex Blue: " + alexBlue);
        System.out.println("Bob Brown: " + bobBrown);
        System.out.println("Maria Green: " + mariaGreen);
         */

        // Versão professor
        Map<String,Integer> votes = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                }
                else {
                    votes.put(name, count);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
