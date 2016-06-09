package com.tmryan.measurefriend;

/////////////////////////////////
// Author: Thomas M. Ryan
// Last Update: 6/8/2016
//////////////////////////////

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickerActivity extends Activity {

	private boolean destination;
	
    	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_picker);
		
		destination = getIntent().getBooleanExtra("dest", true);

        //Note: Not functioning currently
//	TextView originText = (TextView)findViewById(R.id.txtPickerOrigin);
		
//	if (destination) {
//		originText.setText("Pick type to convert from:");
//	} else {
//		originText.setText("Pick type to convert to:");
//	}

        //So many buttons
	Button gallonBtn = (Button)findViewById(R.id.btnGallon);
        Button quartBtn = (Button)findViewById(R.id.btnQuart);
        Button pintBtn = (Button)findViewById(R.id.btnPint);
        Button cupBtn = (Button)findViewById(R.id.btnCups);
        Button tbspBtn = (Button)findViewById(R.id.btnTbspn);
        Button tspBtn = (Button)findViewById(R.id.btnTspn);
        Button literBtn = (Button)findViewById(R.id.btnLiter);
        Button mlBtn = (Button)findViewById(R.id.btnMililiter);
        Button flOzBtn = (Button)findViewById(R.id.btnFlOz);

		gallonBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "Gallons");
				
				if (destination) {
					bundle.putString("meth", GallonConverter.class.getCanonicalName());
				} else {
					bundle.putString("meth", "toGallon");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		quartBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "Quarts");
				
				if (destination) {
					bundle.putString("meth", QuartConverter.class.getCanonicalName());			
				} else {
					bundle.putString("meth", "toQuart");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		pintBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "Pints");
				
				if (destination) {
					bundle.putString("meth", PintConverter.class.getCanonicalName());			
				} else {
					bundle.putString("meth", "toPint");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		cupBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "Cups");
				
				if (destination) {
					bundle.putString("meth", CupConverter.class.getCanonicalName());			
				} else {
					bundle.putString("meth", "toCup");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		tbspBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "Tbsp");
				
				if (destination) {
					bundle.putString("meth", TbspConverter.class.getCanonicalName());				
				} else {
					bundle.putString("meth", "toTbsp");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		tspBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "Tsp");

				if (destination) {
					bundle.putString("meth", TspConverter.class.getCanonicalName());				
				} else {
					bundle.putString("meth", "toTsp");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		literBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "Liter");
				
				if (destination) {
					bundle.putString("meth", LiterConverter.class.getCanonicalName());
				} else {
					bundle.putString("meth", "toLiter");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		mlBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "mililiter");
				
				if (destination) {
					bundle.putString("meth", MililiterConverter.class.getCanonicalName());
				} else {
					bundle.putString("meth", "toMililiter");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});

		flOzBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putBoolean("dest", destination);
				bundle.putString("name", "fl oz");
				
				if (destination) {
					bundle.putString("meth", FluidOunceConverter.class.getCanonicalName());
				} else {
					bundle.putString("meth", "toFluidOunce");
				}
				
				Intent pickedType = new Intent();
				pickedType.putExtras(bundle);
				setResult(RESULT_OK, pickedType);
				finish();
			}
		});
	}
    
    	// Avoiding a crash caused by the hardware back button
	@Override
	public void onBackPressed() {
		super.onBackPressed();
        finish();
	}
}
