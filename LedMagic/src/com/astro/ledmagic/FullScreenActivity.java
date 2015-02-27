package com.astro.ledmagic;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;


public class FullScreenActivity extends Activity {

	


    private Timer timer;
    private MyTimerTask myTimerTask;
    private int pos=0;


    private ArrayList<String[]> palabra;

    private int id_led_front;
    private int id_led_back;
    
    final Handler myHandler = new Handler();
    Timer myTimer = new Timer();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		Texto diccionario=new Texto();
		
		
		palabra =new ArrayList<String[]>();
		
		setContentView(R.layout.led_board);

        id_led_front = (Integer) getIntent().getExtras().getInt("tipo_led_front");
        id_led_back = (Integer) getIntent().getExtras().getInt("tipo_led_back");
		
		String mensaje = (String) getIntent().getExtras().getString("mensaje");
		mensaje=mensaje.toUpperCase();
		
		for (int index=0; index<mensaje.length(); index++) {
			
			String caracter=mensaje.substring(index, index+1);
			if (diccionario.estaDefindo(caracter))
				palabra.add(diccionario.getCodificacion(caracter));
		}
		
        timer = new Timer();
        myTimerTask = new MyTimerTask();
        pos=-1;

        timer.schedule(myTimerTask, 1000, 1000);

    }

    public void onDestroy() {
    	super.onStop();
    	timer.cancel();
    }
	
	//private void mostrarCaracter(String[] letra) {

	private void mostrarCaracter(String[] letra) {
		 
		int nroFila=1;
		String nroFilaStr="";
		for (String fila : letra) {
			
			if (nroFila<=9)
				nroFilaStr="0"+Integer.toString(nroFila);
			else
				nroFilaStr = Integer.toString(nroFila);
			
			for (int i=1; i<=fila.length();i++) {
			   
			
				
				String nroColStr="";
				if (i<=9)
					nroColStr="0"+Integer.toString(i);
				else
					nroColStr = Integer.toString(i);
				
				int resID = getResources().getIdentifier("ImageView"+nroFilaStr+nroColStr, "id", getPackageName());
				final ImageView field = (ImageView) findViewById(resID);

				String valor=fila.substring(i-1,i);
				
				if (field!=null) {
					if (valor.equalsIgnoreCase("0")){
						//field.setBackgroundColor(Color.BLACK);
						field.setImageDrawable((Drawable)getResources().getDrawable(id_led_back));
					}
					else{
						
				//		field.setBackgroundColor(Color.WHITE);
						field.setImageDrawable((Drawable)getResources().getDrawable(id_led_front));
					}
				}
			//	else 
			//		Log.i("", "Buscando ->ImageView"+nroFilaStr+nroColStr);
			}
			
			nroFila++;
		} 

	}
 


	   private class MyTimerTask extends TimerTask {

	        @Override
	        public void run() {


	            runOnUiThread(new Runnable(){

	                @Override
	                public void run() {
	                    Log.i("","  Pos: "+pos);
	                    pos++;
	                    if (pos>=palabra.size())
	                        pos=0;

	                    Log.i("","Mostrando Pos: "+pos);
	                    //mostrarCaracter(letras[pos]);
	                    mostrarCaracter((String[])palabra.get(pos));

	                }});
	        }

	    }

	
}
