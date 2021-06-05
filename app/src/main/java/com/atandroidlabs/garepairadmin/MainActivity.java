package com.atandroidlabs.garepairadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    //Select only those orders which are not aborted
    private void getOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("1234ddsf", "Antriksh Telang", "Gaddi", false));
        orders.add(new Order("1234ddsf", "Antriksh Telang", "8 Series", false));
        orders.add(new Order("1234ddsf", "Antriksh Telang", "8 Series", false));
        orders.add(new Order("1234ddsf", "Antriksh Telang", "8 Series", false));
        orders.add(new Order("1234ddsf", "Antriksh Telang", "8 Series", false));
        orders.add(new Order("1234ddsf", "Antriksh Telang", "8 Series", false));

        OrderAdapter adapter = new OrderAdapter(this, orders);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.orders_rcv);
        getOrders();
    }
}