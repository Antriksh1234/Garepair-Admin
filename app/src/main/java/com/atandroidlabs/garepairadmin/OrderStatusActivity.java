package com.atandroidlabs.garepairadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderStatusActivity extends AppCompatActivity {

    private TextView carName, ownerName, orderId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status);

        setUpTextView();
    }

    private void setUpTextView() {
        carName = findViewById(R.id.name_of_car);
        ownerName = findViewById(R.id.name_of_owner);
        orderId = findViewById(R.id.id_of_order);

        String nameOfCar = getIntent().getStringExtra("carName");
        String idOfOrder = getIntent().getStringExtra("orderId");
        String nameOfOwner = getIntent().getStringExtra("owner");

        carName.setText(nameOfCar);
        ownerName.setText(nameOfOwner);
        orderId.setText(idOfOrder);
    }
}