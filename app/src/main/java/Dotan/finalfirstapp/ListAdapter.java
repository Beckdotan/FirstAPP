package Dotan.finalfirstapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private String[] text;
    Context context;
    int[] imgs;

    //Adapter constructor
    public ListAdapter(Context ct, String[] tx, int[] img ) {
        context = ct;
        text = tx;
        imgs= img;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        //creating a new layout objects
        LayoutInflater inflater = LayoutInflater.from((context));
        //init it to holder layout.
        View view = inflater.inflate(R.layout.holder_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       //setting the text and picture for every raw
        holder.myText.setText(text[position]);
        holder.myImg.setImageResource(imgs[position]);
    }

    @Override
    public int getItemCount() {
        return text.length;
    }

    //Other Class for init the objects in the holder layout to the page itself
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myText;
        ImageView myImg;

        constructor
        public  MyViewHolder(@NonNull View itemView){
            super(itemView);
            myText = itemView.findViewById(R.id.text);
            myImg = itemView.findViewById(R.id.img);

        }
    }
}
