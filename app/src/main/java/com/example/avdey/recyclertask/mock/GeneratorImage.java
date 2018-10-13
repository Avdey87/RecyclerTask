package com.example.avdey.recyclertask.mock;

import android.graphics.Bitmap;

import com.example.avdey.recyclertask.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorImage {

    public static List generateImage(int count) {

        List<ImageMock> imageMock = new ArrayList<>(count);
        int[] imgsArray = new int[]{R.drawable.first, R.drawable.second, R.drawable.thrid};
        Random random = new Random();
        int index = random.nextInt(imgsArray.length);
        int randomIdImage = imgsArray[index];
        //imageMock.add(randomIdImage);

        return imageMock;
    }



}
