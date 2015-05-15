package com.colonbracket.android.studiodemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void goDemo(View v) {
		Class cls = null;
		switch (v.getId()) {
			case R.id.demo_swipe_view:
				cls = SwipeActivity.class;
				break;
			case R.id.demo_action_bar_tab:
				cls = TabActivity.class;
				break;
			case R.id.demo_action_bar_spinner:
				cls = SpinnerActivity.class;
				break;
		}
		if (cls != null) {
			Intent intent = new Intent(this, cls);
			startActivity(intent);
		}
	}
}
