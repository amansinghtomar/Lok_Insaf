package com.example.lokinsafparty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class surveyAdapter  extends RecyclerView.Adapter<surveyAdapter.MyViewHolder> {

    private Context mContext ;
    private List<survey> mData ;

    public surveyAdapter(Context mContext, List<survey> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.survey,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.topic.setText(mData.get(position).getTopic());
        holder.agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Agreed", Toast.LENGTH_SHORT).show();
            }
        });

        holder.disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "disagreed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView topic;
        Button agree, disagree;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            topic = (TextView) itemView.findViewById(R.id.topic) ;
            agree = itemView.findViewById(R.id.agree);
            disagree = itemView.findViewById(R.id.disagree);
            cardView = (CardView) itemView.findViewById(R.id.survey);


        }
    }
}
