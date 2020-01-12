package ua.tarastom.jackson.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Student theStudent = null;
        try {
            theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("theStudent id: " + theStudent.getId());
        System.out.println("theStudent FirstName: " + theStudent.getFirstName());
        System.out.println("theStudent LastName: " + theStudent.getLastName());
        System.out.println("theStudent Active: " + theStudent.getActive());
        System.out.println("theStudent Address: " + theStudent.getAddress());
        System.out.println("theStudent Languages: " + Arrays.toString(theStudent.getLanguages()));
    }
}
