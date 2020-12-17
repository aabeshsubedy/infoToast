package com.infodev.infotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.widget.Toast;

import com.infodev.toastinfo.Toast.InfoToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //toast dekhauna ko lagi aeti garne hai guys
        new InfoToast(this).sucess("sucess message");
        new InfoToast(this).error("sucess message");
        new InfoToast(this).info("sucess message");

        //customized toast
        new InfoToast(this)
                .setTextSize(16)
                .setToastColor(R.color.design_default_color_background)
                .setDuration(Toast.LENGTH_LONG)
                .hideImage()
                .sucess("this is sucess customized toast");

    }

}