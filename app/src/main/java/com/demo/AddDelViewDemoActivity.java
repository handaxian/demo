package com.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.mcxtzhang.lib.AnimShopButton;
import com.mcxtzhang.lib.IOnAddDelListener;

import java.util.ArrayList;
import java.util.List;


public class AddDelViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_del_view_demo);
        final RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        findViewById(R.id.btnChange).setOnClickListener(new View.OnClickListener() {
            int i = 0;

            @Override
            public void onClick(View v) {
                if ((i++ & 1) == 1) {
                    rv.setLayoutManager(new LinearLayoutManager(AddDelViewDemoActivity.this));
                } else {
                    rv.setLayoutManager(new GridLayoutManager(AddDelViewDemoActivity.this, 2));
                }

            }
        });
        MyAdapter myAdapter = new MyAdapter(R.layout.item_add_del, getDatas());

        rv.setAdapter(myAdapter);
    }

    public List<AddDelBean> getDatas() {
        List<AddDelBean> result = new ArrayList<>();
        result.add(new AddDelBean(5, 1));
        result.add(new AddDelBean(10, 1));
        result.add(new AddDelBean(1, 1));
        result.add(new AddDelBean(0, 0));
        result.add(new AddDelBean(4, 2));
        for (int i = 0; i < 10; i++) {
            result.add(new AddDelBean(10, i));
        }

        return result;
    }

    public class MyAdapter extends BaseQuickAdapter<AddDelBean> {
        public MyAdapter(int layoutResId, List<AddDelBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder baseViewHolder, final AddDelBean addDelBean) {
            AnimShopButton animShopButton = baseViewHolder.getView(R.id.addDelView);
            animShopButton.setCount(addDelBean.getCount());
            animShopButton.setMaxCount(addDelBean.getMaxCount());
            animShopButton.setOnAddDelListener(new IOnAddDelListener() {
                @Override
                public void onAddSuccess(int count) {
                    addDelBean.setCount(count);
                }

                @Override
                public void onAddFailed(int count, FailType failType) {

                }

                @Override
                public void onDelSuccess(int count) {
                    addDelBean.setCount(count);
                }

                @Override
                public void onDelFaild(int count, FailType failType) {

                }
            });
        }
    }
}
