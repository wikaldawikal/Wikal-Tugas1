package com.latihan.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Finish extends AppCompatActivity {
    //NIM : 10116082
    //NAMA : Wikal Pratama
    // KELAS : IFK14
    // TANGGAL : 10 April 2019
    TextView tv_finish,tv_nama,tv_umur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        tv_finish = (TextView) findViewById(R.id.tv_finish);
        tv_nama = (TextView) findViewById(R.id.tv_nama_finish);
        tv_umur = (TextView) findViewById(R.id.tv_umur_finish);

        tv_finish.setText("Beres! Sekarang "+getIntent().getStringExtra("nama")+"\nsudah bisa ngecek\npenggunaan HP mu\ntiap hari buat bantu "+getIntent().getStringExtra("nama")+"\nngatur waktu :)");

        tv_nama.setText("Nama : "+getIntent().getStringExtra("nama"));
        tv_umur.setText("Umur : "+getIntent().getStringExtra("umur")+" Tahun");

    }
}
