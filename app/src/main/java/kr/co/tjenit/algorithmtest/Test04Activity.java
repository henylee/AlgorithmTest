package kr.co.tjenit.algorithmtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.Locale;

public class Test04Activity extends AppCompatActivity {

    private android.widget.Button allBtn;
    private android.widget.Button crossBtn;
    private android.widget.Button roundBtn;
    private android.widget.Button cleanBtn;
    private android.widget.CheckBox checkbox01;
    private android.widget.CheckBox checkbox02;
    private android.widget.CheckBox checkbox03;
    private android.widget.CheckBox checkbox04;
    private android.widget.CheckBox checkbox05;
    private android.widget.CheckBox checkbox06;
    private android.widget.CheckBox checkbox07;
    private android.widget.CheckBox checkbox08;
    private android.widget.CheckBox checkbox09;
    private android.widget.CheckBox checkbox10;
    private android.widget.CheckBox checkbox11;
    private android.widget.CheckBox checkbox12;
    private android.widget.CheckBox checkbox13;
    private android.widget.CheckBox checkbox14;
    private android.widget.CheckBox checkbox15;
    private android.widget.CheckBox checkbox16;
    private android.widget.CheckBox checkbox17;
    private android.widget.CheckBox checkbox18;
    private android.widget.CheckBox checkbox19;
    private android.widget.CheckBox checkbox20;
    private android.widget.CheckBox checkbox21;
    private android.widget.CheckBox checkbox22;
    private android.widget.CheckBox checkbox23;
    private android.widget.CheckBox checkbox24;
    private android.widget.CheckBox checkbox25;
    private android.widget.TextView bingoCountTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test04);

        bindViews();
        setupEvents();
        setValues();

    }

    private void setValues() {

    }

    private void setupEvents() {

        final CheckBox[][] boxes =
                {
                        {checkbox01, checkbox02, checkbox03, checkbox04, checkbox05}, {checkbox06, checkbox07, checkbox08, checkbox09, checkbox10},
                        {checkbox11, checkbox12, checkbox13, checkbox14, checkbox15}, {checkbox16, checkbox17, checkbox18, checkbox19, checkbox20},
                        {checkbox21, checkbox22, checkbox23, checkbox24, checkbox25}
                };

        allBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i=0; i<5; i++) {
                    for (int j=0; j<5; j++) {
                        boxes[i][j].setChecked(true);
                    }
                }
            }
        });

        crossBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i=0; i<5; i++) {
                    for (int j=0; j<5; j++) {
                        if (i==j || i+j==4) {
                            boxes[i][j].setChecked(true);
                        }
                        else {
                            boxes[i][j].setChecked(false);
                        }
                    }
                }
            }
        });

        roundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i=0; i<5; i++) {
                    for (int j=0; j<5; j++) {
                        if (i==0 || j==4 || i==4 || j==0) {
                            boxes[i][j].setChecked(true);
                        }
                        else {
                            boxes[i][j].setChecked(false);
                        }
                    }
                }
            }
        });

        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i<5; i++) {
                    for (int j=0; j<5; j++) {
                        boxes[i][j].setChecked(false);
                    }
                }
            }
        });

        CompoundButton.OnCheckedChangeListener checkListner = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int bingoCount=0;

                for (int i=0; i<5; i++) {
                    boolean isBingo = true;

                    for (int j=0; j<5; j++) {
                        if (!boxes[i][j].isChecked()) {
                            isBingo=false;
                        }
                    }

                    if (isBingo) {
                        bingoCount++;
                    }
                }

                for (int i=0; i<5; i++) {
                    boolean isBingo = true;

                    for (int j=0; j<5; j++) {
                        if (!boxes[j][i].isChecked()) {
                            isBingo=false;
                        }
                    }
                    if (isBingo) {
                        bingoCount++;
                    }
                }

                boolean isBingo01=true;
                for (int i=0; i<5; i++) {
                    if (!boxes[i][i].isChecked()) {
                        isBingo01=false;
                    }
                }
                if (isBingo01) {
                    bingoCount++;
                }

                boolean isBingo02=true;
                for (int i=0; i<5; i++) {
                    if (!boxes[i][4-i].isChecked()) {
                        isBingo02=false;
                    }
                }
                if (isBingo02) {
                    bingoCount++;
                }

                String resultStr = String.format(Locale.KOREA, "빙고 줄 수는 %d개 입니다.", bingoCount);
                bingoCountTxt.setText(resultStr);

            }
        };

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                boxes[i][j].setOnCheckedChangeListener(checkListner);
            }
        }

    }

    private void bindViews() {
        this.bingoCountTxt = (TextView) findViewById(R.id.bingoCountTxt);
        this.checkbox25 = (CheckBox) findViewById(R.id.checkbox25);
        this.checkbox24 = (CheckBox) findViewById(R.id.checkbox24);
        this.checkbox23 = (CheckBox) findViewById(R.id.checkbox23);
        this.checkbox22 = (CheckBox) findViewById(R.id.checkbox22);
        this.checkbox21 = (CheckBox) findViewById(R.id.checkbox21);
        this.checkbox20 = (CheckBox) findViewById(R.id.checkbox20);
        this.checkbox19 = (CheckBox) findViewById(R.id.checkbox19);
        this.checkbox18 = (CheckBox) findViewById(R.id.checkbox18);
        this.checkbox17 = (CheckBox) findViewById(R.id.checkbox17);
        this.checkbox16 = (CheckBox) findViewById(R.id.checkbox16);
        this.checkbox15 = (CheckBox) findViewById(R.id.checkbox15);
        this.checkbox14 = (CheckBox) findViewById(R.id.checkbox14);
        this.checkbox13 = (CheckBox) findViewById(R.id.checkbox13);
        this.checkbox12 = (CheckBox) findViewById(R.id.checkbox12);
        this.checkbox11 = (CheckBox) findViewById(R.id.checkbox11);
        this.checkbox10 = (CheckBox) findViewById(R.id.checkbox10);
        this.checkbox09 = (CheckBox) findViewById(R.id.checkbox09);
        this.checkbox08 = (CheckBox) findViewById(R.id.checkbox08);
        this.checkbox07 = (CheckBox) findViewById(R.id.checkbox07);
        this.checkbox06 = (CheckBox) findViewById(R.id.checkbox06);
        this.checkbox05 = (CheckBox) findViewById(R.id.checkbox05);
        this.checkbox04 = (CheckBox) findViewById(R.id.checkbox04);
        this.checkbox03 = (CheckBox) findViewById(R.id.checkbox03);
        this.checkbox02 = (CheckBox) findViewById(R.id.checkbox02);
        this.checkbox01 = (CheckBox) findViewById(R.id.checkbox01);
        this.cleanBtn = (Button) findViewById(R.id.cleanBtn);
        this.roundBtn = (Button) findViewById(R.id.roundBtn);
        this.crossBtn = (Button) findViewById(R.id.crossBtn);
        this.allBtn = (Button) findViewById(R.id.allBtn);
    }
}
