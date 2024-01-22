package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    CheckBox check1=(CheckBox)findViewById(R.id.check1);
    CheckBox check2=(CheckBox)findViewById(R.id.check2);
    CheckBox check3=(CheckBox)findViewById(R.id.check3);
    Button btn=(Button)findViewById(R.id.btn);
    btn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {


              String result="Selected Cource";

            if(check1.isChecked()) {
                result += "python";
            }

            if(check2.isChecked()) {
                result += "php";
            }

            if(check3.isChecked()) {
                result += "MAD";
            }
            Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();

        }
    });

    }
}
