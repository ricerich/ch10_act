package com.example.ch10_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);

        RadioButton rdo2 = (RadioButton) findViewById(R.id.rdo2);
        RadioButton rdo3 = (RadioButton) findViewById(R.id.rdo3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1=null;
                //1.인텐트를 만든다,왜? 다른 액티비티로 넘어가려고
                if(rdo2.isChecked()) {
                    intent1 = new Intent(MainActivity.this,
                            SecondActivity.class);
                    startActivity(intent1);
                }
                else if(rdo3.isChecked()) {
                    intent1 = new Intent(MainActivity.this,
                            ThirdActivity.class);
                    startActivity(intent1);
                }
                else
                    Toast.makeText(MainActivity.this, "선택이 없어요!", Toast.LENGTH_SHORT).show();


//                startActivity(intent1);
            }
        });
    }
}