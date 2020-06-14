package com.example.giswisatagoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView dataNama,dataAlamat,dataKeterangan;
    ImageView dataGambar;

    public static String id,nama,alamat,keterangan,gambar;
    public static Double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dataNama = findViewById (R.id.data_nama);
        dataAlamat = findViewById (R.id.data_alamat);
        dataKeterangan = findViewById (R.id.data_keterangan);
        dataGambar = findViewById (R.id.data_gambar);

        Picasso.get().load(gambar).into(dataGambar);

        dataNama.setText (nama);
        dataAlamat.setText (alamat);
        dataKeterangan.setText (keterangan);

    }
}
