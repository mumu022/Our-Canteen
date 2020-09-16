package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin_login extends AppCompatActivity {
    Button admin_login_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        admin_login_button = (Button) findViewById(R.id.Admin_login_button);
    }

    public void Admin_login_button(View view) {

       String Name1 = "us";
        String Pass1 = "12345";



        EditText Name2 = (EditText) findViewById(R.id.editTextusername);
        String Name3 = Name2.getText().toString();
        if (TextUtils.isEmpty(Name3)) {
            Name2.setError("User name can't be empty");

        }


        EditText Pass3 = (EditText) findViewById(R.id.editTextpassword);
        String Pass4 = Pass3.getText().toString();
        if (TextUtils.isEmpty(Pass4)) {
            Pass3.setError("Password can't be empty");

        }

        if (Name3.equals(Name1) && Pass4.equals(Pass1)) {

        startActivity(new Intent(Admin_login.this, Admin_work.class));
       }

        else

            {

            Toast.makeText(this, "INVALID ID and Password Combination ", Toast.LENGTH_SHORT).show();

        }

    }
}


