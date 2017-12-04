package com.dcw.tool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dcw.tool.utils.LogUtil;
import com.dcw.tool.utils.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.d("akjkfsjkoflnask");
        LogUtil.w("asfjhnaikjso");

        ToastUtil.warning("jkjafjasl");
    }
}
