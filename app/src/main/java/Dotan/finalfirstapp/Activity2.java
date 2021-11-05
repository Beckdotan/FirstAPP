package Dotan.finalfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String[] mtext = {"USA","Egypt","Italy","Netherlands","Spain"};
        int[] imgs = {R.drawable.usa, R.drawable.egypt , R.drawable.italy, R.drawable.netherlands, R.drawable.spain};

        RecyclerView recyclerView = findViewById(R.id.recyclerView2);
        ListAdapter listAdapter = new ListAdapter(this, mtext, imgs);
        recyclerView.setAdapter(listAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}