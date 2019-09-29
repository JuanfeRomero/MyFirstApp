package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.textservice.TextInfo;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showRandomNumber();
    }
    private static final String TOTAL_COUNT = "total_count";
    public void showRandomNumber(){
        //Getting the view where the random number will be displayed
        TextView randomView = findViewById(R.id.textView_random);

        //Get the text view where the heading will be displayed
        TextView headingView = findViewById(R.id.numberHeading);

        //getting the intent and the extra
        /*it could be achieved like this
        Intent randomIntent = getIntent();
        //Getting the number value
        Integer maxCount = randomIntent.getIntExtra(TOTAL_COUNT, 0);
        */
        //but this is more efficient
        int maxCount = getIntent().getIntExtra(TOTAL_COUNT, 0);

        //generating the random number and replacing the values for their correct use;
        Random random = new Random();
        int randomCount = 0;
        if(maxCount>0){
            randomCount = random.nextInt(maxCount);
        }

        //Displaying the random value and the heading.
        randomView.setText(Integer.toString(randomCount));
        headingView.setText(getString(R.string.random_heading, maxCount));
    }

}
