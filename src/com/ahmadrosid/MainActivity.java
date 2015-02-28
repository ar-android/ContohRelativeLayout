package com.ahmadrosid;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

	private LinearLayout layoutLin;
	private RelativeLayout layRelativ;
	private Button btnAdd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnAdd = (Button)findViewById(R.id.btnTambah);
		layoutLin= (LinearLayout)findViewById(R.id.layLin);
		
		btnAdd.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				LayoutInflater layoutInflater = 
						(LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				final View addView = layoutInflater.inflate(R.layout.add, null);
				
				RelativeLayout layRemove = (RelativeLayout)addView.findViewById(R.id.relativeLayout1);
				layRemove.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View v) {
						((LinearLayout)addView.getParent()).removeView(addView);
					}});
				
				layoutLin.addView(addView);
			}});
		
	}

}

