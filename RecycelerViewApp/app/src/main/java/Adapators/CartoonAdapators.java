package Adapators;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycelerviewapp.R;

import java.util.ArrayList;

import CartoonModel.CartoonModels;

public class CartoonAdapators  extends RecyclerView.Adapter<CartoonAdapators.viewHolder>{

    ArrayList<CartoonModels> list;
    Context context;

    public CartoonAdapators(ArrayList<CartoonModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CartoonModels model = list.get(position);

      holder.imageView.setImageResource(model.getPic());
      holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById( R.id.image);
            textView   = itemView.findViewById( R.id.tvtext);
        }
    }
}
