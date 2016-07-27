package com.test.hsx;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

/**
 * Created by Dudaizhong on 2016/7/28.
 */
public class PicassoActivity extends Activity {

    private String url = "http://s0.hao123img.com/res/img/logo/logonew1.png";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_main);
        imageView = (ImageView) findViewById(R.id.image);
        loadImage();
    }

    private void loadImage() {
        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.girl)
                .error(R.drawable.ic_launcher)
                .transform(new CircleTransform())
                .into(imageView);
        Toast.makeText(PicassoActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
    }
}
