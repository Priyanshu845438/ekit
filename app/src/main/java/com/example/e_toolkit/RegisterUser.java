package com.example.e_toolkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterUser extends AppCompatActivity {
    FirebaseAuth mAuth;
    TextView banner;
    EditText edtfullName, edtage, edtemail, edtpassword;
    Button btnregisterUser;
    ProgressBar progressBar;
    String email,fullName,age,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
     banner=(TextView)findViewById(R.id.banner);
     edtfullName=(EditText) findViewById(R.id.edtfullName);
     edtage=(EditText) findViewById(R.id.edtage);
     edtemail=(EditText) findViewById(R.id.edtemail);
     edtpassword=(EditText) findViewById(R.id.edtpassword);
     progressBar=(ProgressBar)findViewById(R.id.progressBar);
     btnregisterUser=(Button)findViewById(R.id.btnregisterUser);

     banner.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startActivity(new Intent(RegisterUser.this,Login_Page.class));

         }
     });
     btnregisterUser.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             registerUser();
             Intent i = new Intent(RegisterUser.this,Login_Page.class);
             i.putExtra("uemail",edtemail.getText().toString());
             i.putExtra("upassword",edtpassword.getText().toString());
             startActivity(i);
             progressBar.setVisibility(View.VISIBLE);
             Toast.makeText(RegisterUser.this, "Registration Sucessfull", Toast.LENGTH_SHORT).show();

         }
     });

    }

    public void registerUser() {
        email = edtemail.getText().toString().trim();
        fullName = edtfullName.getText().toString().trim();
        age = edtage.getText().toString().trim();
        password = edtpassword.getText().toString().trim();

        if (fullName.isEmpty()) {
            edtfullName.setError("Full name is required");
            edtfullName.requestFocus();
            return;
        }
        if (age.isEmpty()) {
            edtage.setError("Age is required");
            edtage.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            edtpassword.setError("Password is required");
            edtpassword.requestFocus();
            return;
        }
        if (password.length() < 6) {
            edtpassword.setError("Min password length should be 6 characters!");
            edtpassword.requestFocus();
        }
        if (email.isEmpty()) {
            edtemail.setError("Email is required");
            edtemail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtemail.setError("Please provide valid email");
            edtemail.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
//        mAuth.createUserWithEmailAndPassword(email,password)
//                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            User user = new User(fullName, age, email);
//
//                            FirebaseDatabase.getInstance().getReference("Users")
//                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
//                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
//                                @Override
//                                public void onComplete(@NonNull  Task<Void> task) {
//                                    if(task.isSuccessful()){
//                                        Toast.makeText(RegisterUser.this, "User has been registered sucessfully", Toast.LENGTH_SHORT).show();
//                                        progressBar.setVisibility(View.GONE);
//                                    }else {
//                                        Toast.makeText(RegisterUser.this, "Failed to register try again", Toast.LENGTH_SHORT).show();
//                                        progressBar.setVisibility(View.GONE);
//                                    }
//                                }
//                            });
//                        }else{
//                            Toast.makeText(RegisterUser.this, "Failed to register try again", Toast.LENGTH_SHORT).show();
//                            progressBar.setVisibility(View.GONE);
//                        }
//
//
//                    }
//                });
           }

    }
