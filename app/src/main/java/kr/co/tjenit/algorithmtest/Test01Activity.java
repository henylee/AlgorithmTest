package kr.co.tjenit.algorithmtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Test01Activity extends AppCompatActivity {

    private android.widget.EditText inputEdt;
    private android.widget.Button okBtn;
    private android.widget.TextView printTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test01);

        bindViews();
        setupEvents();
        setValues();
    }

    private void setValues() {

    }

    private void setupEvents() {
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculateSum();
            }
        });
    }

    private void caculateSum() {
        int result = 0;
        int forSize = Integer.parseInt(inputEdt.getText().toString());

        for (int i=1; i<=forSize; i++) {

            if (i%3==0 || i%5==0) {
                result += i;
            }

        }
        String resultStr = String.format(Locale.KOREA, "입력한 숫자까지의 3과5의 배수의 총 합은 %d 입니다", result);
        printTxt.setText(resultStr);

    }

    private void bindViews() {
        this.printTxt = (TextView) findViewById(R.id.printTxt);
        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.inputEdt = (EditText) findViewById(R.id.inputEdt);
    }
}
