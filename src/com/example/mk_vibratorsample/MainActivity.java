package com.example.mk_vibratorsample;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;

public class MainActivity extends Activity {

	//振動機能（Vibrator）のメンバ変数
	Vibrator vibrator = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//バイブレーション機能はAndroid端末の機能なので、
		//SystemServiceからオブジェクトを取得する
		vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
	}
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
        	
            //振動を発生するメソッド、引数はミリ秒
            vibrator.vibrate(100);
        }
        return super.onTouchEvent(event);
    }
}
