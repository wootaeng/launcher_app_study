package com.peng.plant.wattstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.peng.plant.wattstore.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private String text = "Hello Data Binding";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //DataBinding 사용
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setText(text);
    }
}