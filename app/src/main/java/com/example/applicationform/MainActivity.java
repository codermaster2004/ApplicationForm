package com.example.applicationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etname;

    EditText etemail;

    EditText phone;

    EditText etcc;

    EditText etcountry;

    RadioGroup radiogroup;

    Button btnproceed;

    TextView tvcheck;

    TextView tvcheck1;

    TextView tvcheck2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.etname);
        etemail = findViewById(R.id.etemail);
        phone = findViewById(R.id.phone);
        etcc=findViewById(R.id.etcc);
        etcountry=findViewById(R.id.etcountry);
        radiogroup = findViewById(R.id.radiogroup);
        btnproceed = findViewById(R.id.btnproceed);
        tvcheck = findViewById(R.id.tvcheck);
        tvcheck1=findViewById(R.id.tvcheck1);
        tvcheck2 = findViewById(R.id.tvcheck2);

        btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strname = etname.getText().toString();
                tvcheck.setText(strname);

                String stremail = etemail.getText().toString();
                tvcheck1.setText(stremail);

                String strphone = phone.getText().toString();
                tvcheck2.setText(strphone);

                String strcountrycode = etcc.getText().toString();
                String strcountry     = etcountry.getText().toString();


                if (strname.isEmpty()) {
                    etname.setError("Please enter name");
                } else if (stremail.isEmpty()) {
                    etemail.setError("please enter your mail");
                } else if (strphone.isEmpty()) {
                    phone.setError("please enter phone");
                } else if (strcountrycode.isEmpty())
                {
                    etcc.setError("please enter country code");
                }
                else if(strcountry.isEmpty())
                {
                    etcountry.setError("please enter country");
                }
                else {
                }

                int selectedradiobtn = radiogroup.getCheckedRadioButtonId();

                if (selectedradiobtn == -1) {
                    Toast.makeText(MainActivity.this, "Please check one option", Toast.LENGTH_SHORT).show();
                } else {
                    RadioButton radioButton = findViewById(selectedradiobtn);

                    String gender = radioButton.getText().toString();
                    Toast.makeText(MainActivity.this, gender, Toast.LENGTH_SHORT).show();
                }

                if (selectedradiobtn!=-1) {
                    Toast.makeText(MainActivity.this, "proceed", Toast.LENGTH_SHORT).show();
                }
                else {}

                }
        });

    }
}