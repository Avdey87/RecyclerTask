package com.example.avdey.recyclertask.mock;

import android.graphics.Bitmap;

public class ImageMock {
    private Bitmap image;
    private int value;

    public ImageMock(Bitmap image, int value) {
        this.image = image;
        this.value = value;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
