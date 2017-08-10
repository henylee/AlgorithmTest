package kr.co.tjenit.algorithmtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Test02Activity extends AppCompatActivity {

    private android.widget.EditText starLineEdt;
    private android.widget.Button forwardLeftBtn;
    private android.widget.Button forwarLightBtn;
    private android.widget.Button reverseLeftBtn;
    private android.widget.Button reverseRightBtn;
    private android.widget.TextView printTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test02);

        bindViews();
        setupEvents();
        setValues();

    }

    private void setValues() {

    }

    private void setupEvents() {

        forwardLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printStar01();
            }
        });

        forwarLightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printStar02();
            }
        });

        reverseLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printStar03();
            }
        });

        reverseRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printStar04();
            }
        });

    }

    private void printStar04() {

        String resultStr = "";
        int forSize = Integer.parseInt(starLineEdt.getText().toString());

        for (int i=forSize; i>0; i--) {

            for (int j=0; j<i; j++) {
                resultStr += "*";
            }

            resultStr+="\n";
        }

        printTxt.setText(resultStr);
        printTxt.setGravity(Gravity.RIGHT);
    }

    private void printStar03() {
        String resultStr = "";
        int forSize = Integer.parseInt(starLineEdt.getText().toString());

        for (int i=forSize; i>0; i--) {

            for (int j=0; j<i; j++) {
                resultStr += "*";
            }

            resultStr+="\n";
        }

        printTxt.setText(resultStr);
        printTxt.setGravity(Gravity.LEFT);
    }

    private void printStar02() {

        String resultStr = "";
        int forSize = Integer.parseInt(starLineEdt.getText().toString());

        for (int i=0; i<forSize; i++) {

            for (int j=0; j<=i; j++) {
                resultStr += "*";
            }

            resultStr+="\n";
        }

        printTxt.setText(resultStr);
        printTxt.setGravity(Gravity.RIGHT);
    }

    private void printStar01() {
        String resultStr = "";
        int forSize = Integer.parseInt(starLineEdt.getText().toString());

        for (int i=0; i<forSize; i++) {

            for (int j=0; j<=i; j++) {
                resultStr += "*";
            }

            resultStr+="\n";
        }

        printTxt.setText(resultStr);
        printTxt.setGravity(Gravity.LEFT);
    }

    private void bindViews() {
        this.printTxt = (TextView) findViewById(R.id.printTxt);
        this.reverseRightBtn = (Button) findViewById(R.id.reverseRightBtn);
        this.reverseLeftBtn = (Button) findViewById(R.id.reverseLeftBtn);
        this.forwarLightBtn = (Button) findViewById(R.id.forwarLightBtn);
        this.forwardLeftBtn = (Button) findViewById(R.id.forwardLeftBtn);
        this.starLineEdt = (EditText) findViewById(R.id.starLineEdt);
    }
}
