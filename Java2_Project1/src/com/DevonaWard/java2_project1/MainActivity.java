package com.DevonaWard.java2_project1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	//On click for the "Go" button
	public void startService(View view) {
		
		//GET TEXT FROM EDIT TEXT USING TOSTRING
		
		//HANDLER GOES HERE
		
		Intent intent = new Intent(this, theService.class);
		startService(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
