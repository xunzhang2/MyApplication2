package com.example.anna.myapplication2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment extends Fragment {

    protected RecyclerView rv;
    protected CellData[] data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if(bundle!=null){
            data = new CellData[]{new CellData("Weather", bundle.getString("weather")), new CellData("Temperature (Fahrenheit)", bundle.getString("temperature"))};

        }
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        rv = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        rv.setAdapter(new MyAdapter(data));
        return rootView;

    }

    ;
}
