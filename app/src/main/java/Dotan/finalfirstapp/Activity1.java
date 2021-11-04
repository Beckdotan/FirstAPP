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
        String[] lst =  {"a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",
                "a","b","c","d",};


        //Somthing in those things make the app collaps when i press button 1

       // RecyclerView mlist = (RecyclerView) findViewById(R.id.RecyclerView);
      //  mlist.setAdapter(new ListAdapter(lst));

       // RecyclerView lst1 = (RecyclerView) findViewById(R.id.RecyclerView);
       // ListAdapter list = new ListAdapter(lst);
      //  RecyclerView view = (RecyclerView) findViewById(R.id.RecyclerView);
      //  view.setAdapter(list);

    }
}