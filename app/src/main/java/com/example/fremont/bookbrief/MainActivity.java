package com.example.fremont.bookbrief;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView ;

    Integer[] imgid={
            R.drawable.conan,
            R.drawable.conan2
    };

    String bookinfo1="Author: Fremont.\n This is book Conan.";
    String bookinfo2="Author: CrazyGear.\n This is also book Conan.";
    String [] bookTitle={bookinfo1,bookinfo2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the image view to which the image is stored
        // Forth - the book titles
        CustomListAdapter adapter=new CustomListAdapter(this, R.layout.image_view, imgid, bookTitle);
        listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  book    = bookTitle[position];

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Book Name: " +  book, Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}