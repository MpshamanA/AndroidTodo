package org.pshaman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //onCteateはアクティビティを初期化
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViewByIdはidからViewを見つけるためのメソッド
        TextView textView = findViewById(R.id.testView);
        textView.setText("test");

        TextView textView2 = findViewById(R.id.testView2);
        textView2.setText("test2");
    }
}