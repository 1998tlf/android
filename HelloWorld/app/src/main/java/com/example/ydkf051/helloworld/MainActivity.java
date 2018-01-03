package com.example.ydkf051.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ydkf051.helloworld.R;

import static android.content.Context.MODE_PRIVATE;

public class MainActivity extends Activity {

    public static int MODE = MODE_PRIVATE;
    public static final String PREFERENCE_NAME = "SaveSetting";
    SharedPreferences sharedPreferences;
    TextView tv;
    private int contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE);

        tv= (TextView) findViewById(R.id.textView);
        Intent intent = new Intent(MainActivity.this, denglu.class);
        startActivity(intent);
    }

    public void read(View v){
        String name=sharedPreferences.getString("Name","");
        int age=sharedPreferences.getInt("Age",0);
        float height=sharedPreferences.getFloat("Height",0);


        tv.setText("name="+name+",age="+age+",height="+height);
    }
    public void write(View v){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Name", "Tom");
        editor.putInt("Age", 20);
        editor.putFloat("Height", 1.78f);

        editor.commit();
    }
    public void delete(View v){
        sharedPreferences.edit().clear().commit();

    }

    public void setContentView(int contentView) {
        this.contentView = contentView;
    }
}
