package com.ChatsApp.chatsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.ChatsApp.chatsapp.databinding.ActivityOptactivityBinding;

public class OPTActivity extends AppCompatActivity {

    ActivityOptactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOptactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String phoneNumber = getIntent().getStringExtra("phoneNumber");

        binding.phoneLbl.setText("verify" + phoneNumber);



    }
}