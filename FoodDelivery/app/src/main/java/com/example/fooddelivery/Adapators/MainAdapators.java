package com.example.fooddelivery.Adapators;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.DetailActivity;
import com.example.fooddelivery.Models.MainModel;
import com.example.fooddelivery.R;

import java.util.ArrayList;

public class MainAdapators extends RecyclerView.Adapter<MainAdapators.viewholder> {

    ArrayList<MainModel> list;
    Context context;

    public MainAdapators(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_activity,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final MainModel model = list.get(position);

        holder.mainFoodImage.setImageResource(model.getMainImage());
        holder.mainNamed.setText(model.getMainNamed());
        holder.mainDescripatione.setText(model.getMainDescription());
        holder.mainPriced.setText(model.getMainPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("image",model.getMainImage());
                intent.putExtra("price",model.getMainPrice());
                intent.putExtra("desc",model.getMainDescription());
                intent.putExtra("name",model.getMainNamed());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        ImageView mainFoodImage;
        TextView mainPriced,mainDescripatione,mainNamed;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            mainFoodImage=itemView.findViewById(R.id.mainImage);
            mainPriced=itemView.findViewById(R.id.orderPrice);
            mainDescripatione = itemView.findViewById(R.id.mainDescripation);
            mainNamed=itemView.findViewById(R.id.mainName);
        }
    }
}
