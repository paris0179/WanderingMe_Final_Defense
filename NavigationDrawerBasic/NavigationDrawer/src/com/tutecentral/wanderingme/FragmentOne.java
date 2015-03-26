package com.tutecentral.wanderingme;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.tutecentral.navigationdrawer.R;

import java.util.ArrayList;

/**
 * Created by Aimee on 2/18/2015.
 */




public class FragmentOne extends Fragment {

    final String[] items = new String[]{"Living the Suite Life", "Taking Every Step Seriously", "Wherever you will go, I will follow",
            "Making Every Moment Worth Remembering", "Travel 'till You Wobble","Living the Suite Life", "Taking Every Step Seriously", "Wherever you will go, I will follow",
            "Making Every Moment Worth Remembering", "Travel 'till You Wobble","Living the Suite Life", "Taking Every Step Seriously", "Wherever you will go, I will follow",
            "Making Every Moment Worth Remembering", "Travel 'till You Wobble","Living the Suite Life", "Taking Every Step Seriously", "Wherever you will go, I will follow",
            "Making Every Moment Worth Remembering", "Travel 'till You Wobble","Living the Suite Life", "Taking Every Step Seriously", "Wherever you will go, I will follow",
            "Making Every Moment Worth Remembering", "Travel 'till You Wobble","Living the Suite Life", "Taking Every Step Seriously", "Wherever you will go, I will follow",
            "Making Every Moment Worth Remembering", "Travel 'till You Wobble"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listview1, container, false);

        ListView list = (ListView) view.findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                //Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
            }
        });

        return view;

    }



}


