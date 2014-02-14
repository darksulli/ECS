package com.beta.ecs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
	 
	Button button_sanitaire;
	Button button_electrique;
	Button button_ecs;
	Button button_chauffage;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		button_sanitaire = (Button) findViewById(R.id.btSanitaire);
		button_electrique = (Button) findViewById(R.id.btElectrique);
		button_ecs = (Button) findViewById(R.id.btECS);
		button_chauffage = (Button) findViewById(R.id.btChauffage);
 
		button_sanitaire.setOnClickListener(new View.OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SanitaireActivity.class);
                            startActivity(intent);   
 
			}
 
		});
		
		button_electrique.setOnClickListener(new View.OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, ElectriqueActivity.class);
                            startActivity(intent);   
 
			}
 
		});
		
		button_ecs.setOnClickListener(new View.OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, EcsActivity.class);
                            startActivity(intent);   
 
			}
 
		});
		
		button_chauffage.setOnClickListener(new View.OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, ChauffageActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
 
}