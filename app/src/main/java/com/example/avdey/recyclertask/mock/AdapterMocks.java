package com.example.avdey.recyclertask.mock;


import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avdey.recyclertask.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdapterMocks extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Object> items;

    private final int NUMBER = 0;
    private final int IMAGE = 1;

    public AdapterMocks(List<Object> items) {
        this.items = items;
    }


    @Override
    public int getItemCount() {
        return this.items.size();
    }


    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Mock) {
            return NUMBER;
        } else if (items.get(position) instanceof Integer) {
            return IMAGE;
        }

        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case NUMBER:
                View number = inflater.inflate(R.layout.layout_mock_holder, parent, false);
                viewHolder = new MockHolder(number);
                break;
            case IMAGE:
                View image = inflater.inflate(R.layout.layout_image_mock, parent, false);
                viewHolder = new ImageMockHolder(image);
                break;
           /* default:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
                break;*/
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case NUMBER:
                MockHolder mockHolder = (MockHolder) holder;
                configureMockHolder(mockHolder, position);
                break;
            case IMAGE:
                ImageMockHolder imageMockHolder = (ImageMockHolder) holder;
                configureImageMockHolder(imageMockHolder, position);
                break;
            default:
                break;

        }

    }

    private void configureMockHolder(MockHolder mockHolder, int position) {
        Mock mock = (Mock) items.get(position);
        if (mock != null) {
            mockHolder.getValue().setText("Number: " + mock.getName());
        }
    }


    private void configureImageMockHolder(ImageMockHolder imageMockHolder, int position) {
              imageMockHolder.getImageView().setImageResource(R.drawable.first);

    }




}
