package com.astro.ledmagic;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {
 

 
	private EditText mMessage;
	private Spinner mSpinnerFront;
	private Spinner mSpinnerBack;
	private int led_selected_front = 0;
	private int led_selected_back = 0;
	
	private int[] leds_front = {R.drawable.led_orange, R.drawable.led_lightblue, R.drawable.led_red, R.drawable.led_purple, 
			                    R.drawable.led_yellow, R.drawable.led_gray, R.drawable.led_black, R.drawable.led_heart};
	
	private int[] leds_back = {R.drawable.led_black, R.drawable.led_gray, R.drawable.led_lightblue, R.drawable.led_orange, 
			                   R.drawable.led_red, R.drawable.led_purple, R.drawable.led_yellow, R.drawable.led_heart};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
		setContentView(R.layout.activity_main);
		
		mMessage = (EditText) findViewById(R.id.editText);
	
		
		List<ItemSpinner> items_back = new ArrayList<ItemSpinner>();
		items_back.add(new ItemSpinner(getString(R.string.led_black),     leds_back[0]));
		items_back.add(new ItemSpinner(getString(R.string.led_gray),      leds_back[1]));
		items_back.add(new ItemSpinner(getString(R.string.led_lightblue), leds_back[2]));
		items_back.add(new ItemSpinner(getString(R.string.led_orange),    leds_back[3]));
		items_back.add(new ItemSpinner(getString(R.string.led_red),       leds_back[4]));
		items_back.add(new ItemSpinner(getString(R.string.led_purple), 	  leds_back[5]));
		items_back.add(new ItemSpinner(getString(R.string.led_yellow),    leds_back[6]));
		items_back.add(new ItemSpinner(getString(R.string.led_heart), 	  leds_back[7])); 
		
		List<ItemSpinner> items_front = new ArrayList<ItemSpinner>();
		items_front.add(new ItemSpinner(getString(R.string.led_orange),    leds_front[0]));
		items_front.add(new ItemSpinner(getString(R.string.led_lightblue), leds_front[1]));
		items_front.add(new ItemSpinner(getString(R.string.led_red), 	   leds_front[2]));
		items_front.add(new ItemSpinner(getString(R.string.led_purple),    leds_front[3]));
		items_front.add(new ItemSpinner(getString(R.string.led_yellow),    leds_front[4]));
		items_front.add(new ItemSpinner(getString(R.string.led_gray),      leds_front[5]));
		items_front.add(new ItemSpinner(getString(R.string.led_black),     leds_front[6]));
		items_front.add(new ItemSpinner(getString(R.string.led_heart), 	   leds_front[7]));
		
		
		
		mSpinnerFront = (Spinner) findViewById(R.id.spinner_front);
		mSpinnerFront.setAdapter(new SpinnerAdapter(this,items_front));
		mSpinnerFront.setOnItemSelectedListener(new OnItemSelectedListener() 
		{
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
			{
  			  //Toast.makeText(adapterView.getContext(), ((SocialNetwork) adapterView.getItemAtPosition(position)).getName(), Toast.LENGTH_SHORT).show();
  			  led_selected_front=position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> adapterView)
			{
				//nothing				
			}
		});	
		
		
		mSpinnerBack = (Spinner) findViewById(R.id.spinner_back);
		mSpinnerBack.setAdapter(new SpinnerAdapter(this,items_back));
		mSpinnerBack.setOnItemSelectedListener(new OnItemSelectedListener() 
		{
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
			{
  			  led_selected_back=position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> adapterView)
			{
				//nothing				
			}
		});		
		
		Button boton = (Button)findViewById(R.id.button);
		boton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
                 
				Intent myIntent = new Intent(getApplicationContext(), FullScreenActivity.class);
				Bundle b = new Bundle();
				b.putString("mensaje", " "+mMessage.getText().toString());
				b.putInt("tipo_led_front", leds_front[led_selected_front]);
				b.putInt("tipo_led_back", leds_back[led_selected_back]);
				myIntent.putExtras(b); 
				
				startActivity(myIntent);
				
			}
			
		});

    

	}
   
 
 
	
}
