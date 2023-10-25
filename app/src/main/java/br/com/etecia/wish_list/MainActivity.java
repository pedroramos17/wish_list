package br.com.etecia.wish_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView wishRV = findViewById(R.id.idRVWish);

        List<WishModal> wishModalList = new ArrayList<>();

        // we are initializing our adapter class and passing our arraylist to it.
        WishAdapter wishAdapter = new WishAdapter(this, wishModalList);
        wishModalList.add(new WishModal("DSA in Java", "anything", R.drawable.genielamp));
        wishModalList.add(new WishModal("Java Course", "anything", R.drawable.genielamp));
        wishModalList.add(new WishModal("C++ Course", "anything", R.drawable.genielamp));
        wishModalList.add(new WishModal("DSA in C++", "anything", R.drawable.genielamp));
        wishModalList.add(new WishModal("Kotlin for Android", "anything", R.drawable.genielamp));
        wishModalList.add(new WishModal("Java for Android", "anything", R.drawable.genielamp));
        wishModalList.add(new WishModal("HTML and CSS", "anything", R.drawable.genielamp));

        // in below line we are setting adapter to our recycler view.
        wishRV.setAdapter(wishAdapter);
    }
}