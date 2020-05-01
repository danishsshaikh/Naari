package com.dan.naari;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class HowToSwipe extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_how_to_swipe);

        addFragment(new Step.Builder()
        .setTitle("About Naari Rakshak")
        .setContent("In order to ask for help, you need to add your family and friends mobile number.").setSummary("Step 1")
        .setBackgroundColor(Color.parseColor("#CC0059"))
        .setDrawable(R.drawable.s1).build());

        addFragment(new Step.Builder()
                .setTitle("How to use in trouble?")
                .setContent("Just press the volume up/down button for 5 seconds.")
                .setSummary("Step 2")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.s2).build());

        addFragment(new Step.Builder()
                .setTitle("What happens after 5 seconds?")
                .setContent("SOS will be triggered resulting in sending a call, message and location to the registered mobile numbers.")
                .setSummary("Step 3")
                .setSummary("This is summary")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.s3).build());
    }

    @Override
    public void currentFragmentPosition(int position) {

    }
}
