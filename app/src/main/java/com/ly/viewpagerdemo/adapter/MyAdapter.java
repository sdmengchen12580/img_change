package com.ly.viewpagerdemo.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.ly.viewpagerdemo.R;
import com.ly.viewpagerdemo.view.MCardImgLayout;

import java.util.List;

/**
 * Created by 孟晨 on 2018/9/17.
 */

public class MyAdapter extends PagerAdapter {

    private List<String> resIds;

    public MyAdapter(List<String> resIds) {
        this.resIds = resIds;
    }

    @Override
    public int getCount() {
        return resIds.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = View.inflate(container.getContext(), R.layout.item_viewpager, null);
        MCardImgLayout mCardImgLayout = view.findViewById(R.id.item_image);
        mCardImgLayout.loadImg(resIds.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
