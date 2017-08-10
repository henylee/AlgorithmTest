package kr.co.tjenit.algorithmtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjenit.algorithmtest.adapter.GuGuAdapter;
import kr.co.tjenit.algorithmtest.data.GuGuData;

public class Test03Activity extends AppCompatActivity {

    private android.widget.Button gugutwo;
    private android.widget.Button guguthree;
    private android.widget.Button guguFour;
    private android.widget.Button guguFive;
    private android.widget.Button guguSix;
    private android.widget.Button guguSeven;
    private android.widget.Button guguEight;
    private android.widget.Button guguNine;
    private android.widget.Button guguAll;

    private android.widget.ListView guguList;
    List<GuGuData> guGuDatas = new ArrayList<>();
    GuGuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test03);

        bindView();
        setupEvents();
        setValues();
    }

    private void setValues() {

        mAdapter = new GuGuAdapter(Test03Activity.this, guGuDatas);
        guguList.setAdapter(mAdapter);
    }

    private void setupEvents() {

        View.OnClickListener guguListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int dan = Integer.parseInt(v.getTag().toString());

                printGuguDan(dan);
            }
        };

        gugutwo.setOnClickListener(guguListener);
        guguthree.setOnClickListener(guguListener);
        guguFour.setOnClickListener(guguListener);
        guguFive.setOnClickListener(guguListener);
        guguSix.setOnClickListener(guguListener);
        guguSeven.setOnClickListener(guguListener);
        guguEight.setOnClickListener(guguListener);
        guguNine.setOnClickListener(guguListener);
        guguAll.setOnClickListener(guguListener);

    }

    private void printGuguDan(int dansu) {

        guGuDatas.clear();
        
        if (dansu==0) {
            for (int i=2; i<=9; i++) {
                for (int j=1; j<=9; j++) {
                    guGuDatas.add(new GuGuData(i, j));
                }
            }
        }
        else {
            for (int i = 1 ; i <= 9 ; i++) {
                guGuDatas.add(new GuGuData(dansu,i));
            }
        }


        mAdapter.notifyDataSetChanged();

    }

    private void bindView() {
        this.guguList = (ListView) findViewById(R.id.guguList);
        this.guguAll = (Button) findViewById(R.id.guguAll);
        this.guguNine = (Button) findViewById(R.id.guguNine);
        this.guguEight = (Button) findViewById(R.id.guguEight);
        this.guguSeven = (Button) findViewById(R.id.guguSeven);
        this.guguSix = (Button) findViewById(R.id.guguSix);
        this.guguFive = (Button) findViewById(R.id.guguFive);
        this.guguFour = (Button) findViewById(R.id.guguFour);
        this.guguthree = (Button) findViewById(R.id.guguthree);
        this.gugutwo = (Button) findViewById(R.id.gugutwo);
    }
}
