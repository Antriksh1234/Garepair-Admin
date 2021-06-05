package com.atandroidlabs.garepairadmin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    Context context;
    ArrayList<Order> orders;
    OrderAdapter (Context context, ArrayList<Order> orders) {
        this.orders = orders;
        this.context = context;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.order_list_item, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        String id = orders.get(position).id;
        String ownerName = orders.get(position).nameOfOwner;
        String carName = orders.get(position).carName;
        String statusText;
        if (orders.get(position).status) {
            statusText = "Not Aborted";
        } else {
            statusText = "Pending";
        }
        holder.status.setText(statusText);

        holder.carOwner.setText(ownerName);
        holder.carModel.setText(carName);
        holder.orderId.setText(id);
        holder.carImage.setImageResource(R.drawable.car);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, OrderStatusActivity.class);
                context.startActivity(intent);
                intent.putExtra("orderId", id);
                intent.putExtra("owner", ownerName);
                intent.putExtra("carName", carName);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    class OrderViewHolder extends RecyclerView.ViewHolder {
        TextView carOwner, carModel, orderId, status;
        ImageView carImage;
        OrderViewHolder (View itemView) {
            super(itemView);
            carModel = itemView.findViewById(R.id.car_name);
            carOwner = itemView.findViewById(R.id.owner_name);
            orderId = itemView.findViewById(R.id.order_id);
            status = itemView.findViewById(R.id.status_of_order);
            carImage = itemView.findViewById(R.id.car_imageView);
        }
    }
}
