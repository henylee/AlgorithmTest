package kr.co.tjenit.algorithmtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button sumBtn;
    private Button Test02Btn;
    private Button Test03Btn;
    private Button Test04Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    private void setValues() {

    }

    private void setupEvents() {

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test01Activity.class);
                startActivity(intent);
            }
        });

        Test02Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test02Activity.class);
                startActivity(intent);
            }
        });

        Test03Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test03Activity.class);
                startActivity(intent);
            }
        });

        Test04Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test04Activity.class);
                startActivity(intent);
            }
        });

    }

    private void bindViews() {
        this.Test04Btn = (Button) findViewById(R.id.Test04Btn);
        this.Test03Btn = (Button) findViewById(R.id.Test03Btn);
        this.Test02Btn = (Button) findViewById(R.id.Test02Btn);
        this.sumBtn = (Button) findViewById(R.id.sumBtn);
    }
}
