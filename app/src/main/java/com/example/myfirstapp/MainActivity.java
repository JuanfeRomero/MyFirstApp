package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe(View view){
        //getting view of the edit text
        TextView showEditTextView = findViewById(R.id.editText);
        //getting text and putting it on a variable for the toast button.
        String editTextContent = showEditTextView.getText().toString();
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, editTextContent,
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void countMe(View view){
        //Get the text view
        TextView showCountTextView = findViewById(R.id.counterView);

        //Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        //Convert value to a number and increment it.
        Integer count = Integer.parseInt(countString);
        count++;

        //Display new value in the text view.
        showCountTextView.setText(count.toString());
    }
    public void randomMe(View view){
        //Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, Main2Activity.class);
        //getting the counter value like the countMe method
        //1.getting the text view
        TextView showCountTextView = findViewById(R.id.counterView);
        //2.getting the value of the text view
        String countString = showCountTextView.getText().toString();
        //3.converting the text view value to an int
        Integer count = Integer.parseInt(countString);
        //4.Adding the count to the extras for the intent
        randomIntent.putExtra(TOTAL_COUNT, count);

        //Start the new activity
        startActivity(randomIntent);
    }

    private static final String TOTAL_COUNT = "total_count";
}
