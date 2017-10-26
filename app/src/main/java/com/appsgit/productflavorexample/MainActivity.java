package com.appsgit.productflavorexample;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/CevicheOne-Regular.ttf");
        textView.setTypeface(typeface);

        if (BuildConfig.IS_PAID) {
            //code willbe he for paid apps.
        } else {
          //logic for free apps...
        }

    }
}
