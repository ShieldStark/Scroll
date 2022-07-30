package com.example.cardscroll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardscroll.model.Card;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView card;
    private List<Card> appList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appList=new ArrayList<>();

            appList.add(new Card("1","A","AA"));
            appList.add(new Card("2","B","BB"));
            appList.add(new Card("3","C","CC"));
            appList.add(new Card("4","D","DD"));
            appList.add(new Card("1","A","AA"));
            appList.add(new Card("2","B","BB"));
            appList.add(new Card("3","C","CC"));
            appList.add(new Card("4","D","DD"));
        //app details
        card=findViewById(R.id.appDetails);
        card.setHasFixedSize(true);
        addDataToRecyclerView(appList);
        card.setNestedScrollingEnabled(false);
        card.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));




        /*card.setHasFixedSize(true);
        card.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
*/
    }
    private void addDataToRecyclerView(List<Card> appList){
        AppAdapter appAdapter=new AppAdapter(this,appList);
        card.setLayoutManager(new LinearLayoutManager(this));
        card.setAdapter(appAdapter);
    }
}