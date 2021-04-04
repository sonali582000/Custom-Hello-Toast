package com.example.myapplab2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.textView);
    }

    public void toastData(View view) {

        //Toast toast1=Toast.makeText(MainActivity.this,"TOAST",Toast.LENGTH_SHORT);
        Toast toast1=new Toast(MainActivity.this);
        TextView tv=new TextView(MainActivity.this);
        tv.setBackgroundColor(Color.GREEN);
        tv.setTextColor(Color.WHITE);
        Typeface t=Typeface.create("serif",Typeface.BOLD);
        tv.setTextSize(25);
        tv.setText("TOAST..!!");
        toast1.setView(tv);
        toast1.show();

    }

    public void countData(View view) {

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showData(View view) {
        LayoutInflater inflater=getLayoutInflater();
        View appearance = inflater.inflate(R.layout.custom_layout,findViewById(R.id.toast_layout_root));
        Toast toast=new Toast(MainActivity.this);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(appearance);
        toast.show();
    }

    public void showCustoast(View view) {

        LayoutInflater inflater=getLayoutInflater();
        View appearance = inflater.inflate(R.layout.custom_layout2,findViewById(R.id.toast_layout_root2));
        Toast toast=new Toast(MainActivity.this);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(appearance);
        toast.show();


    }

}