package GeneExample;

import java.io.FileReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FirstCSVExample {

	public void readfood() {
	    try {
	        Reader reader = new FileReader("src/GeneExample/food.csv");

	        CSVParser parser = CSVFormat.DEFAULT.builder()
	                .setHeader()
	                .setSkipHeaderRecord(true)
	                .get()
	                .parse(reader);
	        
	        /*  For reading Case-Sensitive you can use below code    */
	        /*
	         CSVFormat format = CSVFormat.DEFAULT.builder()
                     .setHeader()
                     .setSkipHeaderRecord(true)
                     .setIgnoreHeaderCase(true)
                     .setTrim(true)
                     .get();
	        */
	
	        for (CSVRecord record : parser) {
	            String name = record.get("Name");
	            String favoriteColor = record.get("Favorite Color");
	            String favoriteFood = record.get("Favorite Food");

	            System.out.println("Name: " + name);
	            System.out.println("Favorite Color: " + favoriteColor);
	            System.out.println("Favorite Food: " + favoriteFood);
	            System.out.println("----------------------------");
	        }

	        parser.close();
	        reader.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

    public static void main(String[] args) {
        FirstCSVExample obj = new FirstCSVExample();
        obj.readfood();
    }
}