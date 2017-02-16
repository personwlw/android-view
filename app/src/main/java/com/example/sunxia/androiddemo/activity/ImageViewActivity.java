package com.example.sunxia.androiddemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sunxia.androiddemo.R;
import com.example.sunxia.androiddemo.weight.MyImageView;

/**
 * Created by sunxia on 2016/12/9.
 */

public class ImageViewActivity  extends AppCompatActivity{
    private MyImageView myImageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        myImageView=(MyImageView)findViewById(R.id.imageView);
        myImageView.setRatio(3f);
    }
}
