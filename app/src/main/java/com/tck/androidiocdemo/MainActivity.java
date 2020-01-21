package com.tck.androidiocdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.tck.libannotation.butterknife.BindView;
import com.tck.libannotation.butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_article)
    private ImageButton ibArticle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.btn_article)
    public void onClick(View view) {

    }
}
