package com.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {

    private EditText etreverse;
    private Button btnRev;
    private TextView tres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        //bindings
        etreverse=findViewById(R.id.etreverse);
        btnRev=findViewById(R.id.btnRev);
        tres=findViewById(R.id.tres);
        btnRev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etreverse.getText()))
                {
                    etreverse.setError("enter number");
                    etreverse.requestFocus();
                    return;
                }

                int x, res;

                x = Integer.parseInt(etreverse.getText().toString());

                Reverse_class r = new Reverse_class();

                res = r.reverse(x);

                tres.setText("Reverse number is " + Integer.toString(res));


            }
        });
    }
}
