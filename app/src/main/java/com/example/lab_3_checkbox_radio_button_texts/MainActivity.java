package com.example.lab_3_checkbox_radio_button_texts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt;
        EditText et;
        Button btn;
        CheckBox c1,c2,c3,c4;
        RadioButton r1,r2;

        txt=findViewById(R.id.textView);

        btn=findViewById(R.id.button);

        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);

        et=findViewById(R.id.name);
        r1=findViewById(R.id.radioButton);//female
        r2=findViewById(R.id.radioButton2);//male

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m="",n="";
                if(r1.isSelected()){
                    m+="female";
                }else{
                    m+="male";
                }
                if(c1.isSelected()){
                    n+="CS";
                }else
                if(c2.isSelected()){
                    n+="SS";
                }else
                if(c3.isSelected()){
                    n+="SE";
                }else
                    if(c4.isSelected()){
                    n+="MM";
                }

                txt.setText("Your name is:"+et.getText()+"\nYour gender "+m+"\nYour class id:"+n);
            }
        });
    }
}