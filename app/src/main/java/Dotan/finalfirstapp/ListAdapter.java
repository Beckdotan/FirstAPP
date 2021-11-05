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


    public ListAdapter(Context ct, String[] tx, int[] img ) {
        context = ct;
        text = tx;
        imgs= img;

    }
/*
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;

        public MyViewHolder(TextView view) {
            super(view);
            mTextView = view;
        }
    }
*/
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((context));
        View view = inflater.inflate(R.layout.holder_layout, parent, false);
        return new MyViewHolder(view);


        /*
        TextView textView = new TextView(parent.getContext());
        MyViewHolder holder = new MyViewHolder(textView);

        return holder;
         */

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText.setText(text[position]);
        holder.myImg.setImageResource(imgs[position]);
    }
/*
    //@Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String textForDisplay = text[position];
        ((MyViewHolder)holder).mTextView.setText(textForDisplay);
    }
*/
    @Override
    public int getItemCount() {
        return text.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myText;
        ImageView myImg;

        public  MyViewHolder(@NonNull View itemView){
            super(itemView);
            myText = itemView.findViewById(R.id.text);
            myImg = itemView.findViewById(R.id.img);

        }
    }
}
