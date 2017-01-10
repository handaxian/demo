package com.demo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import net.lemonsoft.lemonbubble.LemonBubble;
import net.lemonsoft.lemonbubble.LemonBubbleInfo;
import net.lemonsoft.lemonbubble.LemonBubbleView;
import net.lemonsoft.lemonbubble.enums.LemonBubbleLayoutStyle;
import net.lemonsoft.lemonbubble.enums.LemonBubbleLocationStyle;
import net.lemonsoft.lemonbubble.interfaces.LemonBubbleMaskOnTouchContext;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
    @BindView(R.id.btn4)
    Button btn4;
    @BindView(R.id.btn5)
    Button btn5;
    @BindView(R.id.btn6)
    Button btn6;
    @BindView(R.id.btn7)
    Button btn7;
    @BindView(R.id.btn8)
    Button btn8;
    @BindView(R.id.btn9)
    Button btn9;
    @BindView(R.id.btn10)
    Button btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id
            .btn10})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                LemonBubble.getRightBubbleInfo()// 增加无限点语法修改bubbleInfo的特性
                        .setTitle("这是一个成功的提示")
                        .setTitleFontSize(12)
                        .show(MainActivity.this, 2000);
                break;
            case R.id.btn2:
//                LemonBubble.showError(MainActivity.this, "这是一个失败的提示", 2000);
                LemonBubble.getErrorBubbleInfo()
                        .setTitle("这是一个失败的提示")
                        .setTitleFontSize(15)
                        .show(MainActivity.this, 2000);
                break;
            case R.id.btn3:
//                LemonBubble.showRoundProgress(MainActivity.this, "请求中...");
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        LemonBubble.showRight(MainActivity.this, "请求成功", 2000);
//                    }
//                }, 2000);

                LemonBubble.getRoundProgressBubbleInfo()
                        .setTitle("无限请求中...")
                        .setTitleFontSize(19)
                        .setOnMaskTouchContext(new LemonBubbleMaskOnTouchContext() {
                            @Override
                            public void onTouch(LemonBubbleInfo bubbleInfo, LemonBubbleView bubbleView) {
                                bubbleView.hide();
                                Toast.makeText(getApplicationContext(), "您终止圆形了等待框~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show(MainActivity.this);

                break;
            case R.id.btn4:
                LemonBubbleInfo myInfo = LemonBubble.getRoundProgressBubbleInfo();
                myInfo.setLocationStyle(LemonBubbleLocationStyle.BOTTOM);
                myInfo.setLayoutStyle(LemonBubbleLayoutStyle.ICON_LEFT_TITLE_RIGHT);
                myInfo.setTitle("正在删除");
                myInfo.setTitleFontSize(20);
                myInfo.setBubbleSize(200, 50);
                myInfo.setProportionOfDeviation(0.1f);
                LemonBubble.showBubbleInfo(MainActivity.this, myInfo);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        LemonBubble.showRight(MainActivity.this, "删除成功", 2000);
                    }
                }, 2000);
                break;
            case R.id.btn5:
                LemonBubbleInfo frameInfo = new LemonBubbleInfo();
                List<Bitmap> icons = new ArrayList<Bitmap>();
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble1));
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble2));
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble3));
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble4));
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble5));
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble6));
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble7));
                icons.add(BitmapFactory.decodeResource(getResources(), R.mipmap.lkbubble8));
                frameInfo.setIconArray(icons);
                frameInfo.setFrameAnimationTime(150);
                frameInfo.setTitle("正在加载中...");
                frameInfo.setTitleColor(Color.DKGRAY);
                LemonBubble.showBubbleInfo(MainActivity.this, frameInfo);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        LemonBubble.showError(MainActivity.this, "加载失败", 2000);
                    }
                }, 2000);
                break;
            case R.id.btn6:
                LemonBubbleInfo iconInfo = new LemonBubbleInfo();
                List<Bitmap> icon = new ArrayList<Bitmap>();
                icon.add(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                iconInfo.setIconArray(icon);
                iconInfo.setLocationStyle(LemonBubbleLocationStyle.TOP);
                iconInfo.setLayoutStyle(LemonBubbleLayoutStyle.ICON_LEFT_TITLE_RIGHT);
                iconInfo.setTitle("飞行模式已开启");
                iconInfo.setProportionOfDeviation(0.05f);
                iconInfo.setBubbleSize(300, 60);
                LemonBubble.showBubbleInfo(MainActivity.this, iconInfo, 2000);
                break;
            case R.id.btn7:
                Intent intent1 = new Intent(MainActivity.this, Demo_Activity.class);
                startActivity(intent1);
                break;
            case R.id.btn8:
                Intent intent2 = new Intent(MainActivity.this, AddDelViewDemoActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn9:
                Intent intent3 = new Intent(MainActivity.this, Demo_AlertView.class);
                startActivity(intent3);
                break;
            case R.id.btn10:
                break;
        }
    }


}
