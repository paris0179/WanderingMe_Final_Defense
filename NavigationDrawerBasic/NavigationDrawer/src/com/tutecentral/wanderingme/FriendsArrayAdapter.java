package com.tutecentral.wanderingme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutecentral.navigationdrawer.R;

import java.util.List;

/**
 * Created by Aimee on 3/20/2015.
 */
public class FriendsArrayAdapter extends BaseAdapter{
    Context context;
    List<FriendsItems> items;


    public FriendsArrayAdapter(Context context, List<FriendsItems> items){
        this.context = context;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=null;

        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.details, parent, false);
        }else{
            v = convertView;
        }

        TextView uName = (TextView)v.findViewById(R.id.textView);
        TextView post = (TextView)v.findViewById(R.id.textView2);
        ImageView imgView = (ImageView)v.findViewById(R.id.imageView);

        uName.setText(items.get(position).getName());
        post.setText(items.get(position).getDescription());
        imgView.setImageResource(items.get(position).getImage_ref());


        return v;

    }


}
