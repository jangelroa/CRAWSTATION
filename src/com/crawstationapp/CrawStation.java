package com.crawstationapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;

public class CrawStation extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash);
		
		
		Thread timer = new Thread(){
			public void run(){
				try{
					
					
					sleep(3000);
					Intent benefits = new Intent("com.crawstationapp.BENEFITS");
					startActivity(benefits);
					
					sleep(3000);
					Intent checkin = new Intent("com.crawstationapp.CHECK_IN");
					startActivity(checkin);
					
					sleep(3000);
					Intent viewCoupons = new Intent("com.crawstationapp.VIEW_COUPONS");
					startActivity(viewCoupons);
					
					sleep(3000);
					Intent useCoupon = new Intent("com.crawstationapp.USE_COUPON");
					startActivity(useCoupon);
					
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{}
			}
		};
		timer.start();
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.craw_station, menu);
		return true;
	}

}
