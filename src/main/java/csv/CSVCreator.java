package main.java.csv;

import java.io.FileWriter;
import java.io.IOException;

public class CSVCreator {
    public static void main(String[] args) {
        String[][] data = {
            {"30-01-2017", "-100", "Target"},
            {"30-01-2017", "-50", "HEB"},
            {"30-01-2017", "-1500", "Rent"}
        };

        String filePath = "/Users/natalielopez/Desktop/projects/data.csv";

    // Generate csv file 
        try (FileWriter writer = new FileWriter((filePath))) {
            for (int rowData1 = 0; rowData1 < data.length; rowData1++) {
                for (int rowData2 = 0; rowData2 < data[rowData1].length; rowData2++) {
                    writer.append(data[rowData1][rowData2]);
                    if (rowData2 < data[rowData1].length -1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e){
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}   
