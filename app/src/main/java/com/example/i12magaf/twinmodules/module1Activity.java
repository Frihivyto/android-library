package com.example.i12magaf.twinmodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class module1Activity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        String res = hola();

        TextView t = (TextView) findViewById(R.id.hello);
        t.setText(""+res);

    }

    public void buttonpress(View v){

        Intent it = new Intent(this, com.example.mylibrary.libActivity.class);
        startActivity(it);
//        try {
//            Intent i = new Intent(this,
//                    Class.forName("com.example.module2.module2Activity"));
//            startActivity(i);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

    }

    public native String hola();

}

