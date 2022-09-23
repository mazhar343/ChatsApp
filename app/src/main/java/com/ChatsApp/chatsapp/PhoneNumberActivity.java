package com.ChatsApp.chatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ChatsApp.chatsapp.databinding.ActivityPhoneNumberBinding;

public class PhoneNumberActivity extends AppCompatActivity {

    ActivityPhoneNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.continueBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(PhoneNumberActivity.this, OPTActivity.class);
                intent.putExtra("phoneNumber",binding.phoneBox.getText().toString());
                startActivity(intent);
            }
        });
    }
}