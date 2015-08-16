package com.example.fremont.bookbrief;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView ;

    String bookinfo1="Author: Fremont.\n This is book Conan.";
    String bookinfo2="Author: CrazyGear.\n This is also book Conan.";
    String [] bookTitle={bookinfo1,bookinfo2};

    ArrayList<BookBrief> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList=new ArrayList<BookBrief>();
        bookList.add(new BookBrief(R.drawable.conan, bookinfo1));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));
        bookList.add(new BookBrief(R.drawable.conan2, bookinfo2));

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the image view to which the image is stored
        // Forth - the book titles
        CustomListAdapter adapter=new CustomListAdapter(this, R.layout.combined_view, bookList);
        listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view,
                                    int position, long id) {

                TextView tv=(TextView)view.findViewById(R.id.text);
                tv.setVisibility(tv.getVisibility()==View.GONE? View.VISIBLE : View.GONE);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Show brief introduction a book", Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}