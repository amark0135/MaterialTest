package com.example.amarguriya.materialtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AmaRguRiyA on 17-11-2016.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder>{

    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList)
    {
        this.movieList=movieList;
    }


    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MyViewHolder holder, int position) {
        Movie movie=movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.gen.setText(movie.getGen());
        holder.year.setText(movie.getYear());


    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title,gen,year;
        public MyViewHolder(View view) {
            super(view);
            title= (TextView) view.findViewById(R.id.title);
            gen= (TextView) view.findViewById(R.id.genre);
            year= (TextView) view.findViewById(R.id.year);





        }
    }
}
