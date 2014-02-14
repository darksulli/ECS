package com.beta.ecs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SanitaireActivity extends Activity {
	 
	Button button_retour;
	Button button_sanitaire_robinet;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sanitaire_activity);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		button_retour = (Button) findViewById(R.id.btRetour);
		button_sanitaire_robinet = (Button) findViewById(R.id.btSanitaireRobinet);
 
		button_retour.setOnClickListener(new View.OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SecondActivity.class);
                            startActivity(intent);   
 
			}
 
		});
		
		button_sanitaire_robinet.setOnClickListener(new View.OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SanitaireRobinetActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
 
}
