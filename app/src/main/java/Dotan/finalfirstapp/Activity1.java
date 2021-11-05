package Dotan.finalfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //preparing
        setContentView(R.layout.activity_1);
        String[] lst =  {"Israel","China","England","Romania"};
        int[] images = {R.drawable.israel, R.drawable.chaina, R.drawable.england, R.drawable.romania};

        //connect recyclerview and set the adapter and the layout.
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ListAdapter listAdapter = new ListAdapter(this, lst, images);
        recyclerView.setAdapter(listAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}