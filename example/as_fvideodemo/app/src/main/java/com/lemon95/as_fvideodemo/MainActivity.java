package com.lemon95.as_fvideodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button lemon_but_log = (Button) findViewById(R.id.lemon_but_log);
        lemon_but_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.lemon95.lemonvideolib.MainActivity.class);
                startActivity(intent);
            }
        });
        Button lemon_but_log2 = (Button) findViewById(R.id.lemon_but_log2);
        lemon_but_log2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.lemon95.lemonvideolib.MainActivity.class);
                intent.putExtra("Mobile", "18500232066");
                intent.putExtra("NickName", "maple");
                intent.putExtra("HeadImgUrl", "http://b.hiphotos.baidu.com/zhidao/pic/item/dc54564e9258d1092a3090eed158ccbf6d814d9e.jpg");
                startActivity(intent);
            }
        });
    }
}
