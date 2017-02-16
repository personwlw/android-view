package com.example.sunxia.androiddemo.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.sunxia.androiddemo.R;
import com.example.sunxia.androiddemo.weight.loading.MonIndicator;

public class MainActivity extends Activity {
    private MonIndicator monIndicator;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);
		
		monIndicator = (MonIndicator)this.findViewById(R.id.monIndicator);
		monIndicator.setColors(new int[]{0xFF942909, 0xFF577B8C, 0xFF201289});
	}

}
