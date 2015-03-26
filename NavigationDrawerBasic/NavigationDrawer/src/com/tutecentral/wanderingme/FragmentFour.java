package com.tutecentral.wanderingme;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tutecentral.navigationdrawer.R;

import java.util.ArrayList;

/**
 * Created by Aimee on 2/18/2015.
 */
public class FragmentFour extends ListFragment {

    String[] people = new String[] {
            "Alona Fernandez",
            "Catherine Torres",
            "Shanice Yap",
            "Cody Peterson",
            "Kevin Armstrong",
            "Matt Andrews",
            "Melissa Park",
            "Michael Stevenson",
            "Nelson Mandela",
            "Tim Duncan",
            "Alona Fernandez",
            "Catherine Torres",
            "Shanice Yap",
            "Cody Peterson",
            "Kevin Armstrong",
            "Matt Andrews",
            "Melissa Park",
            "Michael Stevenson",
            "Nelson Mandela",
            "Tim Duncan","Alona Fernandez",
            "Catherine Torres",
            "Shanice Yap",
            "Cody Peterson",
            "Kevin Armstrong",
            "Matt Andrews",
            "Melissa Park",
            "Michael Stevenson",
            "Nelson Mandela",
            "Tim Duncan"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        /** Creating an array adapter to store the list of countries **/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),R.layout.list_layout_four,people);

        /** Setting the list adapter for the ListFragment */
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }


}

