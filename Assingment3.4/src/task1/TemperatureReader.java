package task1;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.IOException;

public class TemperatureReader {

    public static void main(String[] args) {

        String urlAddress = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        double totalTemperature = 0;
        int count = 0;

        try {
            URL url = new URL(urlAddress);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            String line = reader.readLine();

            String[] headers = line.split(";");

            int temperatureColumn = -1;

            for (int i = 0; i < headers.length; i++) {
                if (headers[i].trim().equals("UlkoTalo")) {
                    temperatureColumn = i;
                    break;
                }
            }

            while ((line = reader.readLine()) != null) {

                String[] columns = line.split(";");

                if (columns.length > temperatureColumn && temperatureColumn >= 0) {

                    if (columns[0].startsWith("01.01.2023")) {

                        String temperature = columns[temperatureColumn];

                        double value = Double.parseDouble(
                                temperature.replace(",", ".")
                        );

                        totalTemperature += value;
                        count++;}
                }
            }

            reader.close();

            if (count > 0) {
                double average = totalTemperature / count;
                System.out.println("Total readings: " + count);

                System.out.println("Average temperature: " + average);}
            else {System.out.println("No temperature data found.");}

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());}
    }
}
