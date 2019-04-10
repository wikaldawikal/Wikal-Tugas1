package com.latihan.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity implements View.OnClickListener {
    //NIM : 10116082
    //NAMA : Wikal Pratama
    // KELAS : IFK14
    // TANGGAL : 10 April 2019
    private Button btn_mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btn_mulai = (Button) findViewById(R.id.btn_mulai_welcome);
        btn_mulai.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_mulai_welcome:
                Intent intent = new Intent(Welcome.this, Login.class);
                startActivity(intent);
        }
    }
}
