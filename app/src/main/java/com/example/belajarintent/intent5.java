package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intent5 extends AppCompatActivity implements View.OnClickListener {

    Button tombol_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent5);
        tombol_back = (Button)findViewById(R.id.tombol_back);
        tombol_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tombol_back:
                Intent explicit = new Intent(intent5.this, intent6.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
