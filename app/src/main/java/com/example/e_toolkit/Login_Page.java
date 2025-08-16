package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Page extends AppCompatActivity {
     TextView register;
     EditText edtlemail,edtlpassword;
     Button signin;
     ProgressBar lprogressbar;
     String uemail,upassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        register=(TextView)findViewById(R.id.register);
        edtlemail=(EditText)findViewById(R.id.edtlemail);
        edtlpassword=(EditText)findViewById(R.id.edtlpassword);
        signin=(Button)findViewById(R.id.signin);
        lprogressbar=(ProgressBar)findViewById(R.id.lprogressBar);

        Intent i = getIntent();
        uemail=i.getStringExtra("uemail");
        upassword=i.getStringExtra("upassword");

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtlemail.getText().toString().equals("")){

                    edtlemail.setError("Cant leave blank!");
                    edtlemail.requestFocus();
                }
                else if(edtlpassword.getText().toString().equals("")){
                    edtlpassword.setError("Cant leave blank");
                    edtlpassword.requestFocus();
                }
                else {
                    if (edtlemail.getText().toString().equals(uemail) && edtlpassword.getText().toString().equals(upassword)||edtlemail.getText().toString().equals("rahilsaiyed00@gmail.com") && edtlpassword.getText().toString().equals("12345678")) {
                        Toast.makeText(Login_Page.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Login_Page.this,HomeActivity.class);
                        startActivity(i);

                    } else {
                        Toast.makeText(Login_Page.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(Login_Page.this, "Please Enter password and email correctly", Toast.LENGTH_SHORT).show();


                    }
                }

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_Page.this,RegisterUser.class);
                startActivity(i);

            }
        });
    }
}