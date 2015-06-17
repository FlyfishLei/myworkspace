package com.example.test;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MyListViewFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.mylistviewfragment, container, false);
		ListView listView = (ListView)view.findViewById(R.id.myLstView);
		final EditText editText = (EditText) view.findViewById(R.id.myEditText);

		final ArrayList<String> toDoItems = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			toDoItems.add("lemon" + i);
		}
		final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_list_item_1, toDoItems);
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
		return view;
	}
}