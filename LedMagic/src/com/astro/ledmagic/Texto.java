package com.astro.ledmagic;

import java.util.HashMap;

public class Texto {

	public static HashMap<String, String[]> codificadorTexto;
	
	public Texto() {
		
		codificadorTexto = new HashMap<String, String[]>();
		
		codificadorTexto.put(" ", BLANCO);
		codificadorTexto.put("A", LETRA_A);
		codificadorTexto.put("B", LETRA_B);
		codificadorTexto.put("C", LETRA_C);
		codificadorTexto.put("D", LETRA_D);
		codificadorTexto.put("E", LETRA_E);
		codificadorTexto.put("F", LETRA_F);
		codificadorTexto.put("G", LETRA_G);
		codificadorTexto.put("H", LETRA_H);
		codificadorTexto.put("I", LETRA_I);
		codificadorTexto.put("J", LETRA_J);
		codificadorTexto.put("K", LETRA_K);
		codificadorTexto.put("L", LETRA_L);
		codificadorTexto.put("M", LETRA_M);
		codificadorTexto.put("N", LETRA_N);
		codificadorTexto.put("O", LETRA_O);
		codificadorTexto.put("P", LETRA_P);
		codificadorTexto.put("Q", LETRA_Q);
		codificadorTexto.put("R", LETRA_R);
		codificadorTexto.put("S", LETRA_S);
		codificadorTexto.put("T", LETRA_T);
		codificadorTexto.put("U", LETRA_U);
		codificadorTexto.put("V", LETRA_V);
		codificadorTexto.put("W", LETRA_W);
		codificadorTexto.put("X", LETRA_X);
		codificadorTexto.put("Y", LETRA_Y);
		codificadorTexto.put("Z", LETRA_Z);
		codificadorTexto.put("1", NUMERO_1);
		codificadorTexto.put("2", NUMERO_2);
		codificadorTexto.put("3", NUMERO_3);
		codificadorTexto.put("4", NUMERO_4);
		codificadorTexto.put("5", NUMERO_5);
		codificadorTexto.put("6", NUMERO_6);
		codificadorTexto.put("7", NUMERO_7);
		codificadorTexto.put("8", NUMERO_8);
		codificadorTexto.put("9", NUMERO_9);

	}
	
	public boolean estaDefindo(String key){
		return codificadorTexto.containsKey(key);
	}
	
	public  String[] getCodificacion(String letra){
		return codificadorTexto.get(letra);
	}
	
	public static final String[] BLANCO = 
		{	
		"0000000000000000", //           
		"0000000000000000", //          
		"0000000000000000", //       
		"0000000000000000", //        
		"0000000000000000", //          
		"0000000000000000", //          
		"0000000000000000", //         
		"0000000000000000", //         
		"0000000000000000", //           
		"0000000000000000", //          
		"0000000000000000", //        
		"0000000000000000", //  
		"0000000000000000"  // 
		};
	
	public static final String[] NUMERO_0 = 
		{ // (13 pixels wide)
		"0000111110000000", //     #####    
		"0000111110000000", //     #####    
		"0011000111100000", //   ##   ####  
		"0011000111100000", //   ##   ####  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011110001100000", //   ####   ##  
		"0011110001100000", //   ####   ##  
		"0000111110000000", //     #####    
		"0000111110000000"  //     #####    
		};
	
	public static final String[] NUMERO_1 = 
		{	
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0001111100000000", //    #####     
		"0001111100000000", //    #####     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0111111111110000", //  ########### 
		"0111111111110000"  //  ########### 
		};
	
	
	public static final String[] NUMERO_2 = 
		{ 
		"0011111111100000", //   #########  
		"0011111111100000", //   #########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000111111100000", //     #######  
		"0011111000000000", //   #####      
		"0011111000000000", //   #####      
		"1111110000000000", // ######       
		"1111110000000000", // ######       
		"1111111111111000", // #############
		"1111111111111000"  // #############
		};
	
	
	public static final String[] NUMERO_3 = 
		{	 
		"0011111111111000", //   ###########
		"0011111111111000", //   ###########
		"0000000111100000", //        ####  
		"0000000111100000", //        ####  
		"0000001110000000", //       ###    
		"0000001110000000", //       ###    
		"0000111111100000", //     #######  
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########  
		};
	
	
	public static final String[] NUMERO_4 = 
		{	
		"0000001111100000", //       #####  
		"0000001111100000", //       #####  
		"0000111111100000", //     #######  
		"0000111111100000", //     #######  
		"0011110111100000", //   #### ####  
		"0011110111100000", //   #### ####  
		"1111000111100000", // ####   ####  
		"1111111111111000", // #############
		"1111111111111000", // #############
		"0000000111100000", //        ####  
		"0000000111100000", //        ####  
		"0000000111100000", //        ####  
		"0000000111100000"  //        ####  
		};
	
	
	public static final String[] NUMERO_5 = 
		{ 
		"1111111111100000", // ###########  
		"1111111111100000", // ###########  
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111111111100000", // ###########  
		"1111111111100000", // ###########  
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########  
		};
	
	
	public static final String[] NUMERO_6 = 
		{	 
		"0000111111100000", //     #######  
		"0000111111100000", //     #######  
		"0011110000000000", //   ####       
		"0011110000000000", //   ####       
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111111111100000", // ###########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########  
		};
		
	public static final String[] NUMERO_7 = 
		{	
		"1111111111111000", // #############
		"1111111111111000", // #############
		"1100000001111000", // ##       ####
		"1100000001111000", // ##       ####
		"0000000111100000", //        ####  
		"0000000111100000", //        ####  
		"0000001110000000", //       ###    
		"0000111000000000", //     ###      
		"0000111000000000", //     ###      
		"0000111000000000", //     ###      
		"0000111000000000", //     ###      
		"0000111000000000", //     ###      
		"0000111000000000"  //     ###   
		};
	
	
	public static final String[] NUMERO_8 = 
		{ 
		"0011111110000000", //   #######    
		"0011111110000000", //   #######    
		"1111000001100000", // ####     ##  
		"1111000001100000", // ####     ##  
		"1111110001100000", // ######   ##  
		"1111110001100000", // ######   ##  
		"0011111110000000", //   #######    
		"1100001111111000", // ##    #######
		"1100001111111000", // ##    #######
		"1100000001111000", // ##       ####
		"1100000001111000", // ##       ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########  
		};
	
	
	public static final String[] NUMERO_9 = 
		{	 
		"0011111111100000", //   #########  
		"0011111111100000", //   #########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111111000", //   ###########
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000111100000", //        ####  
		"0000000111100000", //        ####  
		"0011111110000000", //   #######    
		"0011111110000000"  //   #######    
		};	
	
	public static final String[] LETRA_A = 
		{	
		"0000111110000000", //     #####    
		"0000111110000000", //     #####    
		"0011110111100000", //   #### ####  
		"0011110111100000", //   #### ####  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111111111111000", // #############
		"1111111111111000", // #############
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000"  // ####     ####
		};
	

	
	public static final String[] LETRA_B = 
		{	
		"1111111111100000", // ###########  
		"1111111111100000", // ###########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111111111100000", // ###########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111111111100000", // ###########  
		"1111111111100000"  // ###########  
		};
	
	
	
	public static final String[] LETRA_C = 
		{	
		"0000111111100000", //     #######  
		"0000111111100000", //     #######  
		"0011110001111000", //   ####   ####
		"0011110001111000", //   ####   ####
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"0011110001111000", //   ####   ####
		"0011110001111000", //   ####   ####
		"0000111111100000", //     #######  
		"0000111111100000"  //     #######  
		};
	
	
	public static final String[] LETRA_D = 
		{	
		"1111111110000000", // #########    
		"1111111110000000", // #########    
		"1111000111100000", // ####   ####  
		"1111000111100000", // ####   ####  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000111100000", // ####   ####  
		"1111000111100000", // ####   ####  
		"1111111110000000", // #########    
		"1111111110000000"  // #########    
	    };
	
	public static final String[] LETRA_E = 
		{	
		"0111111111110000", //  ########### 
		"0111111111110000", //  ########### 
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111111111110000", //  ########### 
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111111111110000", //  ########### 
		"0111111111110000"  //  ########### 
		};
	
	public static final String[] LETRA_F = 
		{	
		"0111111111110000", //  ########### 
		"0111111111110000", //  ########### 
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111111111110000", //  ########### 
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000"  //  ####       	
		};
	
	public static final String[] LETRA_G = 
		{	
		"0000111111111000", //     #########
		"0000111111111000", //     #########
		"0011110000000000", //   ####       
		"0011110000000000", //   ####       
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111000111111000", // ####   ######
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011110001111000", //   ####   ####
		"0011110001111000", //   ####   ####
		"0000111111111000", //     #########
		"0000111111111000"  //     #########
		};
	
	public static final String[] LETRA_H = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111111111111000", // #############
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000"  // ####     ####   	
		};
	
	public static final String[] LETRA_I = 
		{	
		"0111111111110000", //  ########### 
		"0111111111110000", //  ########### 
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0111111111110000", //  ########### 
		"0111111111110000"  //  ###########   	
		};
	
	public static final String[] LETRA_J = 
		{	
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########        	
		};
	
	public static final String[] LETRA_K = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000111100000", // ####   ####  
		"1111000111100000", // ####   ####  
		"1111001110000000", // ####  ###    
		"1111001110000000", // ####  ###    
		"1111111000000000", // #######      
		"1111111110000000", // #########    
		"1111111110000000", // #########    
		"1111001111100000", // ####  #####  
		"1111001111100000", // ####  #####  
		"1111000111111000", // ####   ######
		"1111000111111000"  // ####   ######  	
		};
	
	public static final String[] LETRA_L = 
		{	
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111100000000000", //  ####        
		"0111111111110000", //  ########### 
		"0111111111110000"  //  ########### 
		};
		
	
	public static final String[] LETRA_M = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111110111111000", // ###### ######
		"1111110111111000", // ###### ######
		"1111111111111000", // #############
		"1111111111111000", // #############
		"1111001001111000", // ####  #  ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000"  // ####     ####
		};
			
	public static final String[] LETRA_N = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111110001111000", // ######   ####
		"1111110001111000", // ######   ####
		"1111111001111000", // #######  ####
		"1111111001111000", // #######  ####
		"1111111111111000", // #############
		"1111001111111000", // ####  #######
		"1111001111111000", // ####  #######
		"1111000111111000", // ####   ######
		"1111000111111000", // ####   ######
		"1111000001111000", // ####     ####
		"1111000001111000"  // ####     ####
		};	
	
	public static final String[] LETRA_O = 
		{	
		"0011111111100000", //   #########  
		"0011111111100000", //   #########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########  
		};	
	
	public static final String[] LETRA_P = 
		{	
		"1111111111100000", // ###########  
		"1111111111100000", // ###########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111111111100000", // ###########  
		"1111111111100000", // ###########  
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"1111000000000000"  // ####       
		};	
		
	public static final String[] LETRA_Q = 
		{	
		"0011111111100000", //   #########  
		"0011111111100000", //   #########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111001111111000", // ####  #######
		"1111001111111000", // ####  #######
		"1111000111100000", // ####   ####  
		"1111000111100000", // ####   ####  
		"0011111110011000", //   #######  ##
		"0011111110011000"  //   #######  ##
		};		
  
	public static final String[] LETRA_R = 
		{	
		"1111111111100000", // ###########  
		"1111111111100000", // ###########  
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000111111000", // ####   ######
		"1111111110000000", // #########    
		"1111111110000000", // #########    
		"1111001111100000", // ####  #####  
		"1111001111100000", // ####  #####  
		"1111000111111000", // ####   ######
		"1111000111111000"  // ####   ######
		};		
  	
	public static final String[] LETRA_S = 
		{	
		"0011111110000000", //   #######    
		"0011111110000000", //   #######    
		"1111000111100000", // ####   ####  
		"1111000111100000", // ####   ####  
		"1111000000000000", // ####         
		"1111000000000000", // ####         
		"0011111111100000", //   #########  
		"0000000001111000", //          ####
		"0000000001111000", //          ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########  
		};		
  		
	public static final String[] LETRA_T = 
		{	
		"0111111111110000", //  ########### 
		"0111111111110000", //  ########### 
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000"  //      ###   
		};		
	
		
	public static final String[] LETRA_U = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"0011111111100000", //   #########  
		"0011111111100000"  //   #########  
		};		
	
	public static final String[] LETRA_V = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111110111111000", // ###### ######
		"0011111111100000", //   #########  
		"0011111111100000", //   #########  
		"0000111110000000", //     #####    
		"0000111110000000", //     #####    
		"0000001000000000", //       #      
		"0000001000000000"  //       #     
		};			

	
	public static final String[] LETRA_W = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111001001111000", // ####  #  ####
		"1111111111111000", // #############
		"1111111111111000", // #############
		"1111110111111000", // ###### ######
		"1111110111111000", // ###### ######
		"1111000001111000", // ####     ####
		"1111000001111000"  // ####     #### 
		};			
	
	public static final String[] LETRA_X = 
		{	
		"1111000001111000", // ####     ####
		"1111000001111000", // ####     ####
		"1111110111111000", // ###### ######
		"1111110111111000", // ###### ######
		"0011111111100000", //   #########  
		"0011111111100000", //   #########  
		"0000111110000000", //     #####    
		"0011111111100000", //   #########  
		"0011111111100000", //   #########  
		"1111110111111000", // ###### ######
		"1111110111111000", // ###### ######
		"1111000001111000", // ####     ####
		"1111000001111000"  // ####     ####
		};			
	
	
	public static final String[] LETRA_Y = 
		{	
		"0111100011110000", //  ####   #### 
		"0111100011110000", //  ####   #### 
		"0111100011110000", //  ####   #### 
		"0111100011110000", //  ####   #### 
		"0111100011110000", //  ####   #### 
		"0111100011110000", //  ####   #### 
		"0001111111000000", //    #######   
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000", //      ###     
		"0000011100000000"  //      ###     
		};	
	
	public static final String[] LETRA_Z = 
		{	
		"1111111111111000", // #############
		"1111111111111000", // #############
		"0000000111111000", //        ######
		"0000000111111000", //        ######
		"0000001111100000", //       #####  
		"0000001111100000", //       #####  
		"0000111110000000", //     #####    
		"0011111000000000", //   #####      
		"0011111000000000", //   #####      
		"1111110000000000", // ######       
		"1111110000000000", // ######       
		"1111111111111000", // #############
		"1111111111111000"  // ############# 
		};		
	
}
