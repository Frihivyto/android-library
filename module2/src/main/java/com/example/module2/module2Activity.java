package com.example.module2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class module2Activity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        String res = hola2();

        TextView t = (TextView) findViewById(R.id.holadenuevo);
        t.setText(""+res);

    }

    public native String hola2();

}
