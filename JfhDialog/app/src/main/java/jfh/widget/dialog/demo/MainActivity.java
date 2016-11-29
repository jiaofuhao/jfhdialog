package jfh.widget.dialog.demo;

import android.app.Activity;
import android.os.Bundle;

import jfh.widget.dialog.CustomDialog;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomDialog.Builder builder = new CustomDialog.Builder(this, "提示", "确定");
        builder.content("您确定要退出吗？");
        builder.negativeText("取消");
        builder.darkTheme(false);
        builder.build().show();
    }
}
