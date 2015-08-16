package com.example.fremont.bookbrief;

/**
 * Created by fremont on 5/8/15.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<BookBrief> {

    private final Activity context;
    private List<BookBrief> briefList;
    private int layoutResourceId;

    public CustomListAdapter(Activity context, int layoutId, List<BookBrief> bookBriefs) {
        super(context, layoutId, bookBriefs);
        // TODO Auto-generated constructor stub
        layoutResourceId =layoutId;

        this.context=context;
        this.briefList=bookBriefs;
    }

    @Override
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(layoutResourceId, null,true);

//        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView bookBrief = (TextView) rowView.findViewById(R.id.text);

//        txtTitle.setText(itemname[position]);
        imageView.setImageResource(briefList.get(position).imgid);
        bookBrief.setText("Description " + briefList.get(position).brief);
        return rowView;

    };
}