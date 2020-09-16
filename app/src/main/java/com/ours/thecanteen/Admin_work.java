package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_work extends AppCompatActivity {

    Button logout,addfood,checkorder,checkfood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_work);
        logout = (Button)findViewById(R.id.logout);
        addfood = (Button)findViewById(R.id.addfood);
        checkorder= (Button)findViewById(R.id.checkorder);
        checkfood = (Button)findViewById(R.id.checkfood);
    }

    public void logout(View view) {
        startActivity(new Intent(Admin_work.this,StartActivity.class));
    }

    public void addfood(View view) {
        startActivity(new Intent(Admin_work.this,Addfoods.class));
    }

    public void checkorder(View view) {
        startActivity(new Intent(Admin_work.this,CheckOrders.class));
    }

    public void checkfood(View view) {
        startActivity(new Intent(Admin_work.this,Checkfoods.class));
    }


}
