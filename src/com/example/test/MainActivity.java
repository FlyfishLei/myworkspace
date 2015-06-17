package com.example.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
//import android.view.View;
//import android.widget.Button;
import android.widget.Toast;

//import android.view.View.OnClickListener; 

public class MainActivity extends Activity {
	// Button myButton1;
   //主页面  安卓listview绑定 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ListView listView = (ListView) findViewById(R.id.myLstView);
		final EditText editText = (EditText) findViewById(R.id.myEditText);

		final ArrayList<String> toDoItems = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			toDoItems.add("lemon" + i);
		}
		final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				this,android.R.layout.simple_list_item_1, toDoItems);
		listView.setAdapter(arrayAdapter);
		
		
		editText.setOnKeyListener(new View.OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				
				if (event.getAction()==KeyEvent.ACTION_DOWN) {
					if (keyCode==KeyEvent.KEYCODE_ENTER) {
						toDoItems.add(0,editText.getText().toString());
						arrayAdapter.notifyDataSetChanged();
						editText.setText("");
						return true;
					}
				} 
				return false;
			}
		});
		// myButton1=(Button)findViewById(R.id.button1);
		// //使用匿名类注册Button事件
		// myButton1.setOnClickListener(new OnClickListener()
		// {
		// public void onClick(View v)
		// {
		// Toast.makeText(MainActivity.this,
		// "Hello,Wolrd!",Toast.LENGTH_LONG).show();
		// }
		// });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast.makeText(getApplicationContext(), R.string.hello_world,
					Toast.LENGTH_LONG).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
