package com.latihan.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    //NIM : 10116082
    //NAMA : Wikal Pratama
    // KELAS : IFK14
    // TANGGAL : 10 April 2019
    EditText etKeluarga;
    Button btn_masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etKeluarga = (EditText) findViewById(R.id.et_keluarga);
        btn_masuk = (Button) findViewById(R.id.btn_masuk_keluarga);

        btn_masuk.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_masuk_keluarga :
                String Keluarga = etKeluarga.getText().toString();
                Intent intent= new Intent(Login.this, Biodata.class);
                intent.putExtra("keluarga",Keluarga);
                startActivity(intent);
        }
    }
}
