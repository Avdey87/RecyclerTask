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

public class RecyclerFragment extends Fragment {

    private RecyclerView recycler;
    private final AdapterMocks adapterMocks = new AdapterMocks();

    public static RecyclerFragment newInstance() {
        return new RecyclerFragment();
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
        recycler.setAdapter(adapterMocks);

    }

}
