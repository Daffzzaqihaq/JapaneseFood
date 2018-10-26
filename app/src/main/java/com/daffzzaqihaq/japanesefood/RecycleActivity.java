package com.daffzzaqihaq.japanesefood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaFood,detailFood;
    int[] gambarFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        namaFood = getResources().getStringArray(R.array.foods_name);
        detailFood = getResources().getStringArray(R.array.foods_detail);
        gambarFood = new int[]{R.drawable.sushi, R.drawable.misosoup, R.drawable.tempura, R.drawable.edamame, R.drawable.ramen, R.drawable.mochi};

        Adapter adapter = new Adapter(RecycleActivity.this, gambarFood,namaFood,detailFood);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}
