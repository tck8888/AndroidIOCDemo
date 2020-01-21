package com.tck.androidiocdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tck.libannotation.butterknife.BindView;
import com.tck.libannotation.butterknife.OnClick;
import com.tck.mybutterknife.MyButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_article)
    public Button ibArticle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyButterKnife.bind(this);
    }

    @OnClick(R.id.btn_article)
    public void onClick(View view) {
        Toast.makeText(this, "文章", Toast.LENGTH_SHORT).show();
    }
}
