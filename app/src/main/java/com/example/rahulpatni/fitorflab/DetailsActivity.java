package com.example.rahulpatni.fitorflab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView txtDetailsTitle = (TextView)findViewById(R.id.txtDetailsTitle);
        ImageView imgDetailsExcercise = (ImageView)findViewById(R.id.imgDetailsExercise);

        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);

        String exerciseTile = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);

        txtDetailsTitle.setText(exerciseTile);

        if (exerciseTile.equalsIgnoreCase(MainActivity.WEIGHT)) {
            imgDetailsExcercise.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseTile.equalsIgnoreCase(MainActivity.YOGA)) {
            imgDetailsExcercise.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            imgDetailsExcercise.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }


}
