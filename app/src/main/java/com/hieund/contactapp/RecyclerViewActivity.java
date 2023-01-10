package com.hieund.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RecyclerViewActivity extends AppCompatActivity implements ItemClickListener {

    List<ItemModel> items;

    Faker faker = new Faker(new Locale("vi"));
//    static String fullName = faker.name().fullName();
//    static String phone = faker.phoneNumber().phoneNumber();
//    static String mail = faker.phoneNumber().cellPhone() + "@temp-mail.origin";
//    static String address = faker.address().fullAddress();

    private String getFullName() {
        return faker.name().fullName();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        items = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
//            items.add(new ItemModel(
//                    getResources().getIdentifier("thumb" + i, "drawable", getPackageName()),
//                    "Title " + i
//            ));
            items.add(new ItemModel("", faker.name().fullName(), faker.phoneNumber().phoneNumber(), faker.superhero().name().replaceAll("\\s+","").toLowerCase() + "@temp-mail.origin", faker.address().fullAddress()));
        }
        ItemAdapter adapter = new ItemAdapter(items, this);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void OnItemClick(int pos) {
        Log.v("TAG", items.get(pos).getTextTitle() + " is clicked.");

    }
}