package com.example.uberv.a9_patchpaddingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private boolean mIsPadding = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.imageView);
    }

    public void onChangeBackground(View view) {
        if (mIsPadding) {
//            mImageView.setBackgroundResource(R.drawable.lenna);
//            mImageView.setPadding(0, 0, 0, 0);

            // TODO it seems that there is a bug that 9 patch with no padding wont reset
            // TODO view's padding, try resetting manually, or use another file with at least 1 pixel paddings

            //TODO 2 - or set background to any nine-patch (or other image, even not 9 patch, background just maust be reset
            // TODO before setting it to original 9 patch ), and then manually set padding to 2

            // approach 1"
//            mImageView.setBackgroundResource(R.drawable.padding); // see drawables/padding.9.png for paddings
//
//            // approach 2
//            mImageView.setBackgroundResource(R.drawable.something);
//            mImageView.setPadding(0,0,0,0);

            // TODO BEST APPROACH
            // approach 3: BEST!!!
            mImageView.setBackground(null);
            mImageView.setPadding(0, 0, 0, 0);

        } else {
            // add padding
            mImageView.setBackgroundResource(R.drawable.padding);
        }
        mIsPadding = !mIsPadding;
    }
}
