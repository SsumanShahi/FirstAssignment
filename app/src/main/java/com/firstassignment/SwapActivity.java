package com.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SwapActivity extends AppCompatActivity {

    private EditText etswap, etswap2;
    private Button btnswa;
    private TextView tvr, tvrs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        //bindings
        etswap=findViewById(R.id.etswap);
        etswap2=findViewById(R.id.etswap2);
        btnswa=findViewById(R.id.btnswa);
        tvr=findViewById(R.id.tvr);
        tvrs=findViewById(R.id.tvrs);
        btnswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(etswap.getText())){
                    etswap.setError("Enter number");
                    etswap.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(etswap2.getText()))
                {
                    etswap2.setError("Enter second number");
                    etswap2.requestFocus();
                    return;
                }

                swap_class swp = new swap_class();
                swp.setA(Integer.parseInt(etswap.getText().toString()));
                swp.setB((Integer.parseInt(etswap2.getText().toString())));
                tvr.setText("Before Swap:" + "A = " + Integer.parseInt(etswap.getText().toString()) +"B = "
                + Integer.parseInt(etswap2.getText().toString()));
                tvrs.setText(swp.swapnumber());
            }
        });
    }
}
