package com.hieund.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_contact);

        Intent intent = getIntent();
        String fullName = String.valueOf(intent.getStringExtra("fullName"));
        String phoneNum = String.valueOf(intent.getStringExtra("phoneNum"));
        String mailS = String.valueOf(intent.getStringExtra("mail"));
        String addressS = String.valueOf(intent.getStringExtra("address"));

        TextView textThumb = findViewById(R.id.text_thumb);
        TextView textTitle = findViewById(R.id.text_title);
        TextView phone = findViewById(R.id.phone);
        TextView mail = findViewById(R.id.mail);
        TextView address = findViewById(R.id.address);

        textThumb.setText(fullName.substring(0,1));
        textTitle.setText(fullName);
        phone.setText(phoneNum);
        mail.setText(mailS);
        address.setText(addressS);

    }
}