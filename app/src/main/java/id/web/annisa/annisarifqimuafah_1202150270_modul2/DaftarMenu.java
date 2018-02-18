package id.web.annisa.annisarifqimuafah_1202150270_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;

import java.util.LinkedList;

import static android.os.Build.VERSION_CODES.M;

public class DaftarMenu extends AppCompatActivity {
    // untuk deklarasi objek
    private final LinkedList<String> menu = new LinkedList<>();
    private final LinkedList<Integer> harga = new LinkedList<>();
    private final LinkedList<Integer> pict = new LinkedList<>();
    private int mCount = 0;


    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        dummiesData();
        // Get a handle ke RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this,"menu", "harga", "pict");
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            menu.add("Sphagetti");
            menu.add("Steak");
            menu.add("Juice");
            menu.add("Cake");
            menu.add("Coffe");

            // mamanggil harga
            harga.add(50000);
            harga.add(50000);
            harga.add(20000);
            harga.add(30000);
            harga.add(25000);

            // memanggil foto yang ada di drawable
            pict.add(R.drawable.spaghetti);
            pict.add(R.drawable.steak);
            pict.add(R.drawable.juice);
            pict.add(R.drawable.icecreamcake);
            pict.add(R.drawable.americano);
        }

    }

}

