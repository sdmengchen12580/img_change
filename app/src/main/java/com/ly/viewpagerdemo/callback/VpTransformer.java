package com.ly.viewpagerdemo.callback;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by 孟晨 on 2018/9/17.
 */

public class VpTransformer implements ViewPager.PageTransformer{

    //控制左右img大小的
    private float scale = 0.9f;

    @Override
    public void transformPage(View page, float position) {
        if (position >= 0 && position <= 1) {
            page.setScaleY(scale + (1 - scale) * (1 - position));
        } else if (position > -1 && position < 0) {
            page.setScaleY(1 + (1 - scale) * position);
        } else {
            page.setScaleY(scale);
        }
    }
}
