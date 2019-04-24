// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.view.View;

public class InfoWindowParams
{

	public InfoWindowParams()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #20  <Field int a>
	//    5    9:return          
	}

	public View getInfoContents()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field View d>
	//    2    4:areturn         
	}

	public View getInfoWindow()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field View c>
	//    2    4:areturn         
	}

	public int getInfoWindowType()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int a>
	//    2    4:ireturn         
	}

	public long getInfoWindowUpdateTime()
	{
		return (long)b;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int b>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public void setInfoContent(View view)
	{
		d = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field View d>
	//    3    5:return          
	}

	public void setInfoWindow(View view)
	{
		c = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field View c>
	//    3    5:return          
	}

	public void setInfoWindowType(int i)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int a>
	//    3    5:return          
	}

	public void setInfoWindowUpdateTime(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int b>
	//    3    5:return          
	}

	public static final int INFOWINDOW_TYPE_IMAGE = 1;
	public static final int INFOWINDOW_TYPE_VIEW = 2;
	private int a;
	private int b;
	private View c;
	private View d;
}
