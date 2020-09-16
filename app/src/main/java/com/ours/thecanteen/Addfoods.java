package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Addfoods extends AppCompatActivity {
    private Button addfoodlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfoods);




        addfoodlist = (Button)findViewById(R.id.addfoodlist);
        addfoodlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Addfoods.this,"Successfully Added", Toast.LENGTH_SHORT).show();
            }
        });

        }


    public void addfoodlist(View view) {

            boolean flag=true;
        ArrayList<ModelFood> foodsList;
            EditText newfood = (EditText) findViewById(R.id.addnewfood);
            String Name3 = newfood.getText().toString();
            if (TextUtils.isEmpty(Name3)) {
                newfood.setError("Food can't be empty");
                flag=false;

            }


            EditText foodprice = (EditText) findViewById(R.id.addfoodprice);
            String Pass4 = foodprice.getText().toString();
            if (TextUtils.isEmpty(Pass4)) {
                foodprice.setError("Price can't be empty");
                flag=false;

            }

            if (flag) {
                foodsList = new ArrayList<>();



                foodsList.add(new ModelFood(R.drawable.dal_vaji,Name3,"The Canteen",Pass4));
                CreditAdapter adapter = new CreditAdapter(this,foodsList);
                //startActivity(new Intent(Admin_login.this, Admin_work.class));
                Toast.makeText(Addfoods.this,"Successfully Added", Toast.LENGTH_SHORT).show();
            }

            else

            {

                Toast.makeText(this, "INVALID ID and Password Combination ", Toast.LENGTH_SHORT).show();

            }

        }


    }

