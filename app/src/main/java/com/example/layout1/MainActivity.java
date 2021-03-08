package com.example.layout1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    public boolean ConfirmData(){
        String EmailKey = "ndh1994@gmail.com";
        String PwKey = "2001";
        if (EmailKey.equals(edemail.getText().toString()) && PwKey.equals(edpassword.getText().toString()))
        {
            return true;
        }
        return false;
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.LoginBtn);
        edemail = findViewById(R.id.IdEmail);
        edpassword = findViewById(R.id.IdPw);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                if(ConfirmData() == true){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Anda : " +nama+ " dan Password Anda : "+password+ "", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email / Password Salah !!", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}