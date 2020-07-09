package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<Buuton> extends AppCompatActivity {
    private EditText enterMeters;
    private Button convertBuuton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters=(EditText)findViewById(R.id.metersid);
        convertBuuton=(Button)findViewById(R.id.convertid);
        resultTextView=(TextView)findViewById(R.id.resultid);
        convertBuuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multipliyer=39.37;
                double result=00.0;
                double metervalue=Double.parseDouble(enterMeters.getText().toString());
                result=metervalue*multipliyer;
                resultTextView.setText(Double.toString(result)+"inches");
            }
        });

    }
}