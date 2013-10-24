package com.crawstationapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class UseCoupon extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.use_coupon_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.use_coupon, menu);
		return true;
	}

}
