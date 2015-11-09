package com.example.bourymbodj.hideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton t1;
    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (ToggleButton) findViewById(R.id.toggleButton);
        i1= ( ImageView) findViewById(R.id.image);
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    // The toggle is enabled
                    i1.setVisibility(View.INVISIBLE);
                } else {
                    i1.setVisibility(View.VISIBLE);
                }
            }


     });
    }
}

