package com.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfCircleActivity extends AppCompatActivity {

         EditText etradius;
         Button btnCircle;
         TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_circle);
        //binding
        etradius=findViewById(R.id.etradius);
        btnCircle=findViewById(R.id.btnCircle);
        tvresult=findViewById(R.id.tvresult);
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(etradius.getText())){
                    etradius.setError("Please provide radius");
                    etradius.requestFocus();
                    return;}

                    else
                        {
                    float radius = Float.parseFloat(etradius.getText().toString());

                    Cirlce cirlce = new Cirlce();
                    {
                        cirlce.radius = radius;
                    }


                    tvresult.setText("Area of circle is"+ Float.toString(cirlce.area()));

                }




            }
        });
    }
}
