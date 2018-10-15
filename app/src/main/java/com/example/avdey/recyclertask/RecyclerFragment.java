package com.example.avdey.recyclertask;

import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avdey.recyclertask.mock.AdapterMocks;
import com.example.avdey.recyclertask.mock.GeneratorImage;
import com.example.avdey.recyclertask.mock.GeneratorNumber;
import com.example.avdey.recyclertask.mock.Mock;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    private RecyclerView recycler;


    public static RecyclerFragment newInstance() {
        return new RecyclerFragment();
    }


    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new Mock("One", 1));
        items.add(R.drawable.first);


        return items;
    }


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        return inflater.inflate(R.layout.recicler_fragment, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        recycler = view.findViewById(R.id.recycler);
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(new AdapterMocks(getSampleArrayList()));

    }



}
