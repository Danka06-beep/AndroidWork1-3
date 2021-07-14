package com.example.androidwork1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText TextName;
    EditText TextAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButtonSave(View view){
        Toast.makeText(MainActivity.this,"Вы сохранили ваши данные",Toast.LENGTH_LONG).show();
    }
    public void onClickButtonPressure(View view){
        Intent intent = new Intent(MainActivity.this, MainPressure.class);
        startActivity(intent);
    }
    public void onClickButtonLife(View view){
        Intent intent = new Intent(MainActivity.this, MainLife.class);
        startActivity(intent);
    }
}