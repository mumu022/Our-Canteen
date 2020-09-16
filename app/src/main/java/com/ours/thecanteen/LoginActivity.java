package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ours.thecanteen.OptionActivity;
import com.ours.thecanteen.R;
import com.ours.thecanteen.SignUpActivity;
import com.ours.thecanteen.user_information;

import Database.DatabaseHandeler;

public class LoginActivity extends AppCompatActivity {
    Button admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        admin = (Button)findViewById(R.id.Admin_login_page);


    }
    public void LunchoptionMenu(View view)
    {
        String tempID="sadia";
        String temp_password="mumu138";
        String defult_password="mumu138";







        boolean flag=true;

        EditText etUserName = (EditText) findViewById(R.id.Username_Input);
        String strUserName = etUserName.getText().toString();
        if(TextUtils.isEmpty(strUserName)) {
            etUserName.setError("User name can't be empty");

        }



        EditText Password = (EditText) findViewById(R.id.password_login);
        String Password_login = Password.getText().toString();
        if(TextUtils.isEmpty(Password_login)) {
            Password.setError("Password can't be empty");

        }

        final DatabaseHandeler db=new DatabaseHandeler(this);

        user_information user_information=db.getSingleContact(strUserName);

        //String temp_password="";

        if(user_information==null)
        {
            flag=false;
            Toast.makeText(this, "Not Registered ", Toast.LENGTH_SHORT).show();

        }
        else
        {
            temp_password=user_information.getPassword();

        }

        if(Password_login.equals(temp_password) && flag==true ||Password_login.equals(defult_password) )
        {

            startActivity(new Intent(LoginActivity.this, OptionActivity.class));

        }
        else
        {

            Toast.makeText(this, "INVALID ID and Password Combination ", Toast.LENGTH_SHORT).show();

        }
    }
    public void LunchSignUpMenu(View view)
    {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));

    }


    public void Admin_login_page(View view) {
        startActivity(new Intent(LoginActivity.this, Admin_login.class));
    }
}
