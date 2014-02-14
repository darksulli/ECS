package com.beta.ecs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SanitaireRobinetActivity extends Activity {
	 
	Button button_retour;
	Button button_sanitaire_robinet_remplacer;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sanitaire_robinet_activity);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		button_retour = (Button) findViewById(R.id.btRetour);
		button_sanitaire_robinet_remplacer = (Button) findViewById(R.id.btSanitaireRobinetRemplacer);
		
		button_retour.setOnClickListener(new View.OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SanitaireActivity.class);
                            startActivity(intent);   
 
			}
 
		});
				
		button_sanitaire_robinet_remplacer.setOnClickListener(new View.OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SanitaireRobinetRemplacerActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
 
}
