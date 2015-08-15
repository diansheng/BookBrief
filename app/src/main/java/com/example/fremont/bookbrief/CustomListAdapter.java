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

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final Integer[] imgid;
    private int image_layout;

    public CustomListAdapter(Activity context, int layoutId, Integer[] imgid, String[] bookTitile) {
        super(context, layoutId, bookTitile);
        // TODO Auto-generated constructor stub
        image_layout=layoutId;

        this.context=context;
        this.imgid=imgid;
    }

    @Override
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(image_layout, null,true);

//        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
//        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

//        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
//        extratxt.setText("Description "+itemname[position]);
        return rowView;

    };
}