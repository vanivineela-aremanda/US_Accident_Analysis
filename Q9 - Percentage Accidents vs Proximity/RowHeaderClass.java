package com.hadoop.finalProject.Q9;

import java.util.HashMap;
import java.util.Map;

public class RowHeaderClass {

    Map<Integer, String> rowNames = new HashMap<>();
    String []headerNames = {"Amenity","Bump","Crossing","Give_Way","Junction","No_Exit","Railway","Roundabout","Station","Stop","Traffic_Calming","Traffic_Signal","Turning_Loop"};

    public RowHeaderClass() {

        for(int i = 29; i < 42; i++) {
            rowNames.put(i, headerNames[i-29]);
        }

    }

    public String getRowName(int rowNumber) {
        return rowNames.get(rowNumber);
    }
}
