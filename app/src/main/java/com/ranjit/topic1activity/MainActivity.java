package com.ranjit.topic1activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstno, etSecondno;
    private RadioButton rdoAdd, rdoSubtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstno=findViewById(R.id.etFirstno);
        etSecondno=findViewById(R.id.etSecondno);

        rdoAdd=findViewById(R.id.rdoAdd);
        rdoSubtract=findViewById(R.id.rdoSubtract);

        rdoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (rdoAdd.isChecked()) {
                    Toast.makeText(MainActivity.this,"Add radio button clicked",Toast.LENGTH_SHORT).show();
                }



            }

        });


    }
}
