package com.example.utsshofi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Listchatting extends AppCompatActivity {
    private RecyclerView recyclerView;
    private adapterlist Adapterlist;
    private List<itemlist>ItemList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listchatting);
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));

        List<itemlist> itemList = new ArrayList<>();

        adapterlist myAdapter = new adapterlist(itemList);

        recyclerView.setAdapter((RecyclerView.Adapter) myAdapter);


        itemList.add(new itemlist( "sshofisf", "lgi dmna?", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.merdeka.com%2Fjabar%2Fras-kucing-lucu-sedunia-yang-imut-dan-menggemaskan-kln.html&psig=AOvVaw1GOaWTZL6chM3lYa2ccFc3&ust=1683884694024000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCICb1Lr97P4CFQAAAAAdAAAAABAE"));
        itemList.add(new itemlist("sshofisf","lgi dmna?","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.merdeka.com%2Fjabar%2Fras-kucing-lucu-sedunia-yang-imut-dan-menggemaskan-kln.html&psig=AOvVaw1GOaWTZL6chM3lYa2ccFc3&ust=1683884694024000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCICb1Lr97P4CFQAAAAAdAAAAABAE"));
        itemList.add(new itemlist("sshofisf", "lgi dmna?", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.merdeka.com%2Fjabar%2Fras-kucing-lucu-sedunia-yang-imut-dan-menggemaskan-kln.html&psig=AOvVaw1GOaWTZL6chM3lYa2ccFc3&ust=1683884694024000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCICb1Lr97P4CFQAAAAAdAAAAABAE"));

    }
}