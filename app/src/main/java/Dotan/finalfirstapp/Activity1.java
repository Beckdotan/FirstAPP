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


        setContentView(R.layout.activity_1);
        String[] lst =  {"Israel","China","England","Romania"};


        int[] images = {R.drawable.israel, R.drawable.chaina, R.drawable.england, R.drawable.romania};
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ListAdapter listAdapter = new ListAdapter(this, lst, images);
        recyclerView.setAdapter(listAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //Somthing in those things make the app collaps when i press button 1

       // RecyclerView mlist = (RecyclerView) findViewById(R.id.RecyclerView);
      //  mlist.setAdapter(new ListAdapter(lst));

       // RecyclerView lst1 = (RecyclerView) findViewById(R.id.RecyclerView);
       // ListAdapter list = new ListAdapter(lst);
      //  RecyclerView view = (RecyclerView) findViewById(R.id.RecyclerView);
      //  view.setAdapter(list);

    }
}