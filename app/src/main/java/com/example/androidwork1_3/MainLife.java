package com.example.androidwork1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainLife extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_life);
    }
    public void onClickButtonSave(View view){
        EditText weightText = findViewById(R.id.TopText);
        String weightTextvalue = weightText.getText().toString();
        EditText StepsText = findViewById(R.id.BottomText);
        String StepsTextvalue = StepsText.getText().toString();
        Log.i(TAG,"Вы сохранили ваши данные");
        try{
            Life value = new Life(Integer.parseInt(weightTextvalue), 1);
            Life value2 = new Life(Integer.parseInt(StepsTextvalue), 2);
        }catch (Exception ex){
            Toast.makeText(MainLife.this,"Ошибка",Toast.LENGTH_LONG).show();
        }
    }
}