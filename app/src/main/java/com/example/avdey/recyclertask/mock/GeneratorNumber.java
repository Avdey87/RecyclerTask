package com.example.avdey.recyclertask.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class GeneratorNumber {

    public static List generateNumber(int count) {

        List numberList = new ArrayList(count);

        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numberList.add(new Mock(UUID.randomUUID().toString(), random.nextInt(100)));
        }
        return numberList;
    }

}
