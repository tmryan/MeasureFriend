package com.tmryan.measurefriend;

/////////////////////////////////
// Author: Thomas M. Ryan
// Last Update: 6/7/2016
//////////////////////////////

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	//Request code for picker activity
	final int PICK_TYPE_REQUEST = 1;
	
	private String fromType;
	private String toType;
	   
    /////////////////////
    // Activity Methods
    /////////////////
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    	//Main screen buttons
        final Button convertBtn = (Button)findViewById(R.id.btnConvert);
        final Button fromBtn = (Button)findViewById(R.id.btnConvertFrom);
        final Button toBtn = (Button)findViewById(R.id.btnConvertTo);
		final Button swapBtn = (Button) findViewById(R.id.btnSwap);
        
        //Number to convert goes in this field
        final EditText entryField = (EditText)findViewById(R.id.numEntry);

        //Disable convert button until types picked
        convertBtn.setEnabled(false);
		swapBtn.setEnabled(false);
        
        //Click to convert
        convertBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Make sure a proper value has been entered
				if(MFriendUtils.isDouble(entryField.getText().toString())) {
                    stringToClass(entryField.getText().toString());
				} else {
                    entryField.setText("Please enter an amount");
                }
            }
		});
        
        //Click to select type to convert from
        fromBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {		       
				Intent pickerUI = new Intent(getApplicationContext(), PickerActivity.class);
			    pickerUI.putExtra("dest",true);
			    startActivityForResult(pickerUI, PICK_TYPE_REQUEST);
			}
		});
        
        //Click to select type to convert to
        toBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
		        Intent pickerUI = new Intent(getApplicationContext(), PickerActivity.class);
		        pickerUI.putExtra("dest",false);
		        startActivityForResult(pickerUI, PICK_TYPE_REQUEST);
			}
		});

        //Select all text if entry field is clicked
        //Note: only works when clicking left side of entry field
        entryField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.selectAll();
            }
        });

		// Swap from and to types and button text
		swapBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Swapping button text
				String temp = fromBtn.getText().toString();
				fromBtn.setText(toBtn.getText().toString());
				toBtn.setText(temp);

				// Swapping conversion types
				// Feels pretty hacky right now, better way?
				temp = fromType;
				fromType = "com.tmryan.measurefriend." + toType.substring(2) + "Converter";
				toType = "to" + temp.substring(25, temp.length()-9);
			}
		});

    }

    @Override
    //Handles data returned from picker activity, if RESULT_OK then update the UI
    protected void onActivityResult(int requestCode, int resultCode, Intent resultData) {
        if (requestCode == PICK_TYPE_REQUEST && resultCode == RESULT_OK) {
            //On picker success, un-bundle data and update main activity
            Bundle bundle = resultData.getExtras();
            storeBundledData(bundle);
            updateMainActivityUI(bundle.getBoolean("dest"), bundle.getString("name"));
        } else if(resultCode == RESULT_CANCELED) {
            //User backed out, do nothing
        } else {
            TextView resultTxt = (TextView)findViewById(R.id.numResult);
            resultTxt.setText("Picker error!");
        }
    }

    //////////////////
    // Other Methods
    //////////////
    
    // Use reflection to call conversion method based on picked types
    private void stringToClass(String amount) {
    	TextView resultTxt = (TextView)findViewById(R.id.numResult);
    	DecimalFormat dFormat = new DecimalFormat("##########.##");
    	String output = "";
    	
    	Class<?> converter;
    	java.lang.reflect.Method m;
    	
		try {
			converter = Class.forName(fromType);
			m = converter.getMethod(toType, String.class);
			output = (String) m.invoke(converter, amount);
		} catch (ClassNotFoundException e) {
			resultTxt.setText("Class not found");
		} catch (InvocationTargetException e) {
			resultTxt.setText("Invocation target");
		} catch (IllegalAccessException e) {
			resultTxt.setText("Illegal access");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			resultTxt.setText("Illegal args");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			resultTxt.setText("No such method");
			e.printStackTrace();
		}
		
        resultTxt.setText(dFormat.format(Double.valueOf(output)).toString());
    }

    // Storing data returned from picker activity
    private void storeBundledData(Bundle bundle){
    	if (bundle.getBoolean("dest")){
    		fromType = bundle.getString("meth");
    	} else {
    		toType = bundle.getString("meth");
    	}
    }

    // Updates btn text with data from picker activity
    private void updateMainActivityUI(boolean isFrom, String typeName) {
		Button fromBtn = (Button) findViewById(R.id.btnConvertFrom);
		Button toBtn = (Button) findViewById(R.id.btnConvertTo);
		Button convertBtn = (Button) findViewById(R.id.btnConvert);
		Button swapBtn = (Button) findViewById(R.id.btnSwap);

		// Set 'from' and 'to' button text to picked type
		if (isFrom) {
			fromBtn.setText(typeName);
		} else {
			toBtn.setText(typeName);
		}

		// Enable convert button if both types are picked
		if (!fromBtn.getText().equals("From") && !toBtn.getText().equals("To")) {
			convertBtn.setEnabled(true);
			swapBtn.setEnabled(true);
		} else {
			convertBtn.setEnabled(false);
			swapBtn.setEnabled(false);
		}
	}

    /////////////////
    // OPTIONS MENU
    /////////////
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}