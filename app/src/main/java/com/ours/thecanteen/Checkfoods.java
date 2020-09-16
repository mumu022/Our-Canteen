package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checkfoods extends AppCompatActivity {

        Button checkbreakfast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkfoods);

        checkbreakfast = (Button)findViewById(R.id.checkbreakfast);

    }

    public void checkbreakfast(View view) {
        startActivity(new Intent(Checkfoods.this,Admin_Breakfast.class));
    }

}

