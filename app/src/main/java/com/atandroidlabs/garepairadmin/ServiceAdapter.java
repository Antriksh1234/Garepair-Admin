package com.atandroidlabs.garepairadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder> {

    Context context;
    ArrayList<Service> services;

    ServiceAdapter(Context context, ArrayList<Service> services) {
        this.services = services;
        this.context = context;
    }
    @NonNull
    @Override
    public ServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.service_item_layout, parent, false);
        return new ServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceViewHolder holder, int position) {
        //Yet to be implemented completely
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    class ServiceViewHolder extends RecyclerView.ViewHolder {

        Button doneButton;
        TextView nameOfServiceTextView, priceTextView;
        ImageView serviceImageView;
        ServiceViewHolder (View itemView) {
            super(itemView);
            serviceImageView = itemView.findViewById(R.id.service_imageView);
            nameOfServiceTextView = itemView.findViewById(R.id.service_name);
            priceTextView = itemView.findViewById(R.id.price_textView);
            doneButton = itemView.findViewById(R.id.status_of_service);
        }
    }
}
