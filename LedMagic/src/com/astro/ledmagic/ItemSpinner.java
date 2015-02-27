package com.astro.ledmagic;

/**
 * Elemento de la lista del spinner.
 *
 */
public class ItemSpinner 
{
	private String name;
	
	private int icon;	

	public ItemSpinner(String nombre, int icono) 
	{
		super();
		this.name = nombre;
		this.icon = icono;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getIcon() 
	{
		return icon;
	}

	public void setIcon(int icon) 
	{
		this.icon = icon;
	}	

}