package com.example.avdey.recyclertask.mock;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.avdey.recyclertask.R;

public class ImageMockHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;

    public ImageMockHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.ivImage);
    }

    public void bind(ImageMock imageMock) {
        imageView.setImageBitmap(imageMock.getImage());

    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
