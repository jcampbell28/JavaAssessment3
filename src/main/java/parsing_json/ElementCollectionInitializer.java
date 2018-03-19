package parsing_json;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;

public class ElementCollectionInitializer {


    public static ElementCollection generate() throws FileNotFoundException {
        ElementCollection collectionOfElements = new ElementCollection();
        Gson gson = new Gson();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/jessicacampbell/Dev/JavaAssessment3/src/main/resources/periodic_table.json"));
        Element[] elements = gson.fromJson(bufferedReader, Element[].class);
        Collections.addAll(collectionOfElements, elements);
        return collectionOfElements;
    }
}
