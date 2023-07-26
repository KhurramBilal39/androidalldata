package com.example.fooddelivery.Adapators;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.Models.OrderModels;
import com.example.fooddelivery.R;

import java.util.ArrayList;



public class OrderAdapators extends RecyclerView.Adapter<OrderAdapators.viewHolder> {

    ArrayList<OrderModels> list;
    Context context;

    public OrderAdapators(ArrayList<OrderModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sampleorder,parent,false);
        return  new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final OrderModels models = list.get(position);
       try {
           holder.Orderimage.setImageResource(models.getOrderimage());
       }
       catch (Exception e){

       }
        holder.OrderPrice.setText(models.getOrderPPrice());
        holder.OrderNumber.setText(models.getOrdernumber());
        holder.OrderName.setText(models.getOrdername());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView Orderimage;
        TextView OrderNumber,OrderPrice,OrderName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            Orderimage = itemView.findViewById(R.id.orderImage);
            OrderNumber = itemView.findViewById(R.id.order_Number);
            OrderPrice = itemView.findViewById(R.id.orderPrice);
            OrderName = itemView.findViewById(R.id.orderName);
        }
    }
}
