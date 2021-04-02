package com.example.android_class_2021.lession1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lession4_demo1 extends AppCompatActivity {

//    implements OnClickListener;
    private Spinner spOperator ;
    private EditText et1, et2;
    private Button btAdd;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lession2_login);
        initView();
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double num1 = Double.parseDouble(et1.getText().toString());
                    double num2 = Double.parseDouble(et2.getText().toString());
                    result.setText("Result: " + (num1+num2));
                }catch (NumberFormatException ex){

                }
            }
        });

        spOperator.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                try{
                    double num1 = Double.parseDouble(et1.getText().toString());
                    double num2 = Double.parseDouble(et2.getText().toString());
                    String op = spOperator.getSelectedItem().toString();
                    double res = cal(num1, num2, op);
                    result.setText(res + "");

                }catch (NumberFormatException ex){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private double cal(double n1, double n2, String op){
        switch (op){
            case "+": return n1+n2;
            case "-": return n1-n2;
            case "*": return n1*n2;
            case "/": return n1/n2;
        }
        return 0;
    }

    private void initView() {
        et1 = findViewById(R.id.n1);
        et2 = findViewById(R.id.n2);
        btAdd = findViewById(R.id.btn_add);
        spOperator = findViewById(R.id.sp_op);
        result = findViewById(R.id.res);
        String[] st = {"+", "-", "*", "/"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spiner, st);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spOperator.setAdapter(adapter);

    }
}
