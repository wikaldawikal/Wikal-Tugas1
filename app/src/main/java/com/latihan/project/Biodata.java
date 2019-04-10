package com.latihan.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity implements View.OnClickListener {
    //NIM : 10116082
    //NAMA : Wikal Pratama
    // KELAS : IFK14
    // TANGGAL : 10 April 2019
    EditText etNama,etUmur;
    Button btnSelanjutnya;
    TextView tvKeluarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        etNama = (EditText) findViewById(R.id.et_nama_biodata);
        etUmur = (EditText) findViewById(R.id.et_umur_biodata);
        btnSelanjutnya = (Button)findViewById(R.id.btn_selanjutnya_biodata);
        tvKeluarga = (TextView) findViewById(R.id.tv_kode_keluarga);

        btnSelanjutnya.setOnClickListener(this);
        tvKeluarga.setText("Kode Keluarga : "+getIntent().getStringExtra("keluarga"));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_selanjutnya_biodata :
                String Nama = etNama.getText().toString();
                String Umur = etUmur.getText().toString();

                Intent intent= new Intent(Biodata.this,Finish.class);
                intent.putExtra("nama",Nama);
                intent.putExtra("umur",Umur);

                startActivity(intent);
        }
    }
}
