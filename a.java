package com.example.a19_nihar_pr3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6;

    //private static final String NIHAR="life"
    String NIHAR="lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView)findViewById(R.id.textView2);
        text2=(TextView)findViewById(R.id.textView3);
        text3=(TextView)findViewById(R.id.textView4);
        text4=(TextView)findViewById(R.id.textView5);
        text5=(TextView)findViewById(R.id.textView10);
        text6=(TextView)findViewById(R.id.textView7);
        Toast.makeText(this, "On Create", Toast.LENGTH_SHORT).show();
    }

    @Override
        public void onRestart()
        {
            super.onRestart();
            Log.d(NIHAR, "onRestart");
            text1.setText("onRestart activity");
        }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(NIHAR, "onStart");
        text2.setText("onStart activity");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(NIHAR, "onPause");
        text3.setText("onPause activity");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(NIHAR, "onStop");
        text4.setText("onStop activity");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(NIHAR, "onDestroy");
        text5.setText("onDestroy activity");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(NIHAR, "onResume");
        text6.setText("onResume activity");
    }
}
