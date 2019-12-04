package com.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {
    private EditText etnumber;
    private Button btnP;
    private TextView tresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        //bindings
        etnumber=findViewById(R.id.etnumber);
        btnP=findViewById(R.id.btnP);
        tresult=findViewById(R.id.tresult);
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etnumber.getText()))
                {
                 etnumber.setError("enter number");
                 etnumber.requestFocus();
                 return;
                }

                int x , res;
                x=Integer.parseInt(etnumber.getText().toString());

                Panlindrome_Class panlindrome_class = new Panlindrome_Class();

                res =panlindrome_class.reverse(x);

                if(res == x)
                {
                    tresult.setText("it is palindrome" + Integer.toString(x));


                }
                else
                {
                    tresult.setText("it is not palindrome" +Integer.toString(x));
                }



            }
        });

    }
}
