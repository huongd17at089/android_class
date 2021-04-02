package com.example.android_class_2021.lession1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class lession4_demo2 extends AppCompatActivity implements View.OnClickListener{

    private EditText txtDate, txtTime;
    private Button btnTime, btnDate;
    private int mYear, mMonth, mDay, mHour, mMinute;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lession2_login);
        initView();
        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);

    }

    private void initView() {
        txtDate = findViewById(R.id.txtDate);
        txtTime= findViewById(R.id.txtTime);
        btnTime = findViewById(R.id.btnTime);
        btnDate = findViewById(R.id.btnDate);
    }


    public void onClick(View v){
        if( v== btnDate){
            Calendar cal = Calendar.getInstance();
            mYear = cal.get(Calendar.YEAR);
            mMonth = cal.get(Calendar.MONTH);
            mDay = cal.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    txtDate.setText(dayOfMonth + "/"+(month+1)+"/"+year);
                }
            }, mYear, mMonth, mDay);

            dialog.show();
        }
        if ( v == btnTime){
            Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR);
            mMinute = c.get(Calendar.MINUTE);
            TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    txtTime.setText(hourOfDay + ":" + minute);
                }

            }, mHour, mMinute, false);
            dialog.show();;
        }
    }
}
