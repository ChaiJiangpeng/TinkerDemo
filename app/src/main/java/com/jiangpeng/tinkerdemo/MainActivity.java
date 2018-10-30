package com.jiangpeng.tinkerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.lib.tinker.TinkerInstaller;

/**
 * Created by ChaiJiangPeng on 2018/10/24.
 */
public class MainActivity extends AppCompatActivity {
    private TextView mTvHello;
    private Button loadPatch, clearPatch, toNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvHello = findViewById(R.id.tv_hello);
        loadPatch = findViewById(R.id.loadPatch);
        clearPatch = findViewById(R.id.clearPatch);
        toNext = findViewById(R.id.toNext);
//        mTvHello.setText("Hello Tinker!");
        loadPatch.setOnClickListener(v -> {
            TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk");
        });
        clearPatch.setOnClickListener(v -> {
            Tinker.with(getApplicationContext()).cleanPatch();
        });
        toNext.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, NextActivity.class));
        });
    }
}
