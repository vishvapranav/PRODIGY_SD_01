package PRODIGY;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SD_5 {

    public static void main(String[] args) {
        String url = "http://quotes.toscrape.com";

        try {
            Document document = Jsoup.connect(url).get();
            Elements quotes = document.select(".quote"); // Adjust the selector based on the HTML structure

            // Specify the CSV file path
            String csvFilePath = "quotes_data.csv";

            // Write the CSV header
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath))) {
                writer.write("Quote,Author\n");

                // Extract and write quote information to CSV
                for (Element quote : quotes) {
                    String text = quote.select(".text").text();
                    String author = quote.select(".author").text();

                    // Write the data to CSV
                    writer.write("\"" + text + "\"" + "," + author + "\n");
                }

                System.out.println("Data has been successfully scraped and saved to " + csvFilePath);
            } catch (IOException e) {
                System.err.println("Error writing to CSV file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error connecting to the website: " + e.getMessage());
        }
    }
}

