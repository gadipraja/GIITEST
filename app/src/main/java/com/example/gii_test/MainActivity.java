package com.example.gii_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rv;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DBHelper(this);

        db.insertMovies("movie title 1","description 1","director 1","https://st.depositphotos.com/1000992/3947/i/950/depositphotos_39476899-stock-photo-clapper-board-and-popcorn-box.jpg");
        db.insertMovies("movie title 2","description 2","director 2","https://st.depositphotos.com/1000992/3947/i/950/depositphotos_39476899-stock-photo-clapper-board-and-popcorn-box.jpg");
        db.insertMovies("movie title 3","description 3","director 3","https://st.depositphotos.com/1000992/3947/i/950/depositphotos_39476899-stock-photo-clapper-board-and-popcorn-box.jpg");
        db.insertMovies("movie title 4","description 4","director 4","https://st.depositphotos.com/1000992/3947/i/950/depositphotos_39476899-stock-photo-clapper-board-and-popcorn-box.jpg");
        db.insertMovies("movie title 5","description 5","director 5","https://st.depositphotos.com/1000992/3947/i/950/depositphotos_39476899-stock-photo-clapper-board-and-popcorn-box.jpg");

        rv = (RecyclerView)findViewById(R.id.list);

        viewadapter va = new viewadapter(db);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(va);

        db.deleteMovies();
    }
}