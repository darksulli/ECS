package com.beta.ecs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElectriqueActivity extends Activity {
	 
	Button button_retour;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.electrique_activity);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		button_retour = (Button) findViewById(R.id.btRetour);
 
		button_retour.setOnClickListener(new View.OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SecondActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
 
}
