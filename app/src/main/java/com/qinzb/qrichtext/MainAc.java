package com.qinzb.qrichtext;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zhihu.matisse.Matisse;

import cn.qzb.richeditor.RichEditor;

/**
 * Created by cheng on 2018/9/19.
 */

public class MainAc extends AppCompatActivity {
    private RichEditor editor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        editor=findViewById(R.id.editor);
        editor.setInputEnabled(false);

        String s="<img style=\"width:100px;\" src=\"https://xiangxue-topic.oss-cn-hangzhou.aliyuncs.com/3425/1544690581.JPG\">";
        editor.setHtml("<img src=\"https://xiangxue-topic.oss-cn-hangzhou.aliyuncs.com/3425/1544690581.JPG\" width=\"100%\" alt=\"(null)\">");
    }
}
