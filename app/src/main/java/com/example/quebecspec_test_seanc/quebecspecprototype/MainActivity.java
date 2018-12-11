package com.example.quebecspec_test_seanc.quebecspecprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IndustrialInspectionConfig();
    }

    public void IndustrialInspectionConfig(){
        ImageButton ib = (ImageButton) findViewById(R.id.imageButton);
        ib.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.industrial_inspection);
            }
        });
    }
}
