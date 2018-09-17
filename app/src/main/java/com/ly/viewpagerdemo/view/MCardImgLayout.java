package com.ly.viewpagerdemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ly.viewpagerdemo.R;
import com.ly.viewpagerdemo.utils.GlideUtils;

/**
 * Created by 孟晨 on 2018/9/17.
 */

public class MCardImgLayout extends LinearLayout{

    private View view;
    private Context context;

    public MCardImgLayout(Context context) {
        super(context);
    }

    public MCardImgLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        view=LayoutInflater.from(context).inflate(R.layout.cardiew_img_layout, this, true);
    }

    public void loadImg(String imgUrl){
        GlideUtils.glideLoadImg(context,imgUrl, (ImageView) view.findViewById(R.id.img));
    }
}
