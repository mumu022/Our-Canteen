package com.ours.thecanteen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class Admin_Breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__breakfast);




            RecyclerView recyclerView;
            TextView cost;

            ArrayList<ModelFood> foodsList;


                cost=(TextView) findViewById(R.id.cost_show);
                recyclerView = findViewById(R.id.recycler_view);

                foodsList = new ArrayList<>();
               // final DatabaseHelper db= new DatabaseHelper(this);
               // final String datbasename="food";
                // ArrayList<food_info> myContactList = db.getAllContact(datbasename);

                foodsList.add(new ModelFood(R.drawable.dal_vaji,"Dal Vaji","The Canteen","50"));
                foodsList.add(new ModelFood(R.drawable.paratha,"Paratha","The Canteen","50"));
                foodsList.add(new ModelFood(R.drawable.egg_rool,"Egg Roll","The Canteen","30"));
                foodsList.add(new ModelFood(R.drawable.egg,"Egg","The Canteen","20"));
                foodsList.add(new ModelFood(R.drawable.egg_chop,"Egg Chop","The Canteen","50"));
        foodsList.add(new ModelFood(R.drawable.dew,"Mountain Dew","The Canteen","30"));
        foodsList.add(new ModelFood(R.drawable.pepsi,"Pepsi","The Canteen","30"));
        foodsList.add(new ModelFood(R.drawable.seven_up,"7 UP","The Canteen","30"));
        foodsList.add(new ModelFood(R.drawable.mum_water,"Mum Water","The Canteen","20"));
        foodsList.add(new ModelFood(R.drawable.pran_juice,"Pran Juice","The Canteen","50"));
        foodsList.add(new ModelFood(R.drawable.mutton,"Mutton","The Canteen","100"));
        foodsList.add(new ModelFood(R.drawable.beef,"Beef","The Canteen","80"));
        foodsList.add(new ModelFood(R.drawable.chicken,"Chicken","The Canteen","70"));
        foodsList.add(new ModelFood(R.drawable.fish,"Fish","The Canteen","50"));
        foodsList.add(new ModelFood(R.drawable.fried_rice,"Fried Rice","The Canteen","80"));
        foodsList.add(new ModelFood(R.drawable.burger,"Burger","the Canteen","100"));
        foodsList.add(new ModelFood(R.drawable.sandwich,"Sandwich","The Canteen","80"));
        foodsList.add(new ModelFood(R.drawable.pizza,"Pizza","The Canteen","120"));
        foodsList.add(new ModelFood(R.drawable.singra,"Singra","The Canteen","20"));
        foodsList.add(new ModelFood(R.drawable.sub_sandwich,"Sub Sandwich","The Canteen","50"));
        /*for(food_info myContact : myContactList)
        {
            int image=myContact.item_image;
            foodsList.add(new ModelFood(R.drawable.image,myContact.getName(),myContact.getPlace(),myContact.getPrice()));
        }*/


                LinearLayoutManager layoutManager = new LinearLayoutManager(this);

                RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

                recyclerView.setLayoutManager(rvLiLayoutManager);

                CreditAdapter adapter = new CreditAdapter(this,foodsList);

                recyclerView.setAdapter(adapter);

            }
        }



