package com.example.ydkf051.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by ydkf051 on 2017/12/27.
 */

public class denglu extends Activity {

    Button button;
    CheckBox checkBox,checkBox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dengl);
        button = (Button) findViewById(R.id.button);
        checkBox= (CheckBox) findViewById(R.id.checkBox);
        checkBox1=(CheckBox) findViewById(R.id.checkBox3);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBox.isChecked())checkBox1.setChecked(false);
            }
        });
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked())checkBox.setChecked(true);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i=new Intent(denglu.this,jishuanji.class);
//                startActivity(i);

                Intent intent = new Intent(denglu.this, jishuanji.class);
                startActivity(intent);
            }
        });

    }

}
