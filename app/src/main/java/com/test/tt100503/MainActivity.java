package com.test.tt100503;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView2);

        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("567567");
            }
        });

    }

    public void click1(View v)
    {
        tv.setText("123123");
    }
    public void click3(View v)
    {
        if (v.getId() == R.id.button3)
        {
            tv.setText("AAA");
        }
        if (v.getId() == R.id.button4)
        {
            tv.setText("BBB");
        }
    }
}
