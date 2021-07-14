package com.example.androidwork1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainPressure extends AppCompatActivity {


    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pressure1);
    }
    public void onClickSaveButton(View view ){
        EditText TopText = findViewById(R.id.TopText);
        String TopTextvalue = TopText.getText().toString();
        EditText BottomText = findViewById(R.id.BottomText);
        String BottomTextvalue = BottomText.getText().toString();
        EditText PulseText = findViewById(R.id.PulseText);
        String PulseTextvalue = PulseText.getText().toString();
        Log.i(TAG,"Вы сохранили ваши данные");
        try{
         Pressure value = new Pressure(Integer.parseInt(TopTextvalue), 1,1);
            Pressure value2 = new Pressure(Integer.parseInt(BottomTextvalue), 2,2);
            Pressure value3 = new Pressure(Integer.parseInt(PulseTextvalue), 3,2);
        }catch (Exception ex){
            Toast.makeText(MainPressure.this,"Ошибка",Toast.LENGTH_LONG).show();
        }
    }
}