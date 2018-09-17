package com.ly.viewpagerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ly.viewpagerdemo.adapter.MyAdapter;
import com.ly.viewpagerdemo.callback.VpTransformer;
import com.ly.viewpagerdemo.view.LoopViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LoopViewPager looviewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        looviewpager = (LoopViewPager) findViewById(R.id.looviewpager);


        //数据
        List<String> list = new ArrayList<>();
        list.add("http://www-dev.lcsyjt.com/oss/syjt/20180917/d723a8f71003316b9d62a2b5605ab6b6.jpg");
        list.add("http://www-dev.lcsyjt.com/oss/syjt/20180917/d723a8f71003316b9d62a2b5605ab6b6.jpg");
        list.add("http://www-dev.lcsyjt.com/oss/syjt/20180917/d723a8f71003316b9d62a2b5605ab6b6.jpg");
        list.add("http://www-dev.lcsyjt.com/oss/syjt/20180917/d723a8f71003316b9d62a2b5605ab6b6.jpg");
        list.add("http://www-dev.lcsyjt.com/oss/syjt/20180917/d723a8f71003316b9d62a2b5605ab6b6.jpg");
        looviewpager.setAdapter(new MyAdapter(list));
        //如果网络加载图片，会提前加载下一个，否则不显示
        looviewpager.setOffscreenPageLimit(3);
        looviewpager.setPageTransformer(true, new VpTransformer());
        looviewpager.autoLoop(true);
    }

}
