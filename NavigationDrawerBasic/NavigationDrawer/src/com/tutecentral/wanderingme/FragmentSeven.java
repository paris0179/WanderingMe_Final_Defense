package com.tutecentral.wanderingme;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutecentral.navigationdrawer.R;

/**
 * Created by Angela on 2/18/2015.
 */
public class FragmentSeven extends Fragment {
    ImageView ivIcon;
    TextView tvItemName;

    public static final String IMAGE_RESOURCE_ID = "iconResourceID";
    public static final String ITEM_NAME = "itemName";

    public FragmentSeven(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_seven, container,
                false);//root of your fragment's layout//
        //false is for not attaching as root//


        return view;//always return a view object//
    }

}



