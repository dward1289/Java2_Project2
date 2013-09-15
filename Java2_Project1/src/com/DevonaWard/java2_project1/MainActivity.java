package com.DevonaWard.java2_project1;

import org.json.JSONArray;
import org.json.JSONException;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;



public class MainActivity extends Activity {
	Context context = this;
	JSONArray theSavedObject;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	//On click for the "Go" button
	@SuppressLint("HandlerLeak")
	public void startService(View view) {
		
		//HANDLER GOES HERE
		Handler theHandler = new Handler(){
			public void handleMessage(Message msg){
				super.handleMessage(msg);
			}
			
		};
		
		Messenger dataMessenger = new Messenger(theHandler);
		Intent intent = new Intent(this, theService.class);
		intent.putExtra("messenger", dataMessenger);
		startService(intent);
		showData();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	private void showData(){
		//Display pulled here
		String savedData = writeRead.readStringFile(context, "teamsJSONString", false);

			try {
				theSavedObject = new JSONArray (savedData);
				Log.i("GREAT", theSavedObject.toString());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
