package com.example.keith.session3assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        final TextView text = (TextView)findViewById(R.id.textImage);       //obj for image text view
        final Button btnState = (Button)findViewById(R.id.btnHide);         //obj for button
        btnState.setOnClickListener(new View.OnClickListener() {            //listener for button
            @Override
            public void onClick(View v) {
                String buttonText = btnState.getText().toString();           //object for text in button(Hide/Show)

                if (buttonText== "Hide") {                                  //Hide image if button is clicked==HIDE
                    text.setVisibility(View.GONE);
                    btnState.setText("Show");
                    Log.d("Message", "Your Image is Hiding");
                }
                else{
                text.setVisibility(View.VISIBLE);                            //Show image for buttonclick= SHOW
                btnState.setText("Hide");}
            }
        });


    }

}
