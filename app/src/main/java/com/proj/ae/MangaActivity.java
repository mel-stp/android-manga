package com.proj.ae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.proj.ae.databinding.ActivityMangaBinding;

public class MangaActivity extends AppCompatActivity {

    private ActivityMangaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMangaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}