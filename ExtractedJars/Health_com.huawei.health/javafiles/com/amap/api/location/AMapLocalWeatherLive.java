// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import com.amap.api.location.core.AMapLocException;

public class AMapLocalWeatherLive
{

	public AMapLocalWeatherLive()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	void a(AMapLocException amaplocexception)
	{
		g = amaplocexception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field AMapLocException g>
	//    3    5:return          
	}

	void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String a>
	//    3    5:return          
	}

	void b(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String b>
	//    3    5:return          
	}

	void c(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String c>
	//    3    5:return          
	}

	void d(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String d>
	//    3    5:return          
	}

	void e(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String e>
	//    3    5:return          
	}

	void f(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String f>
	//    3    5:return          
	}

	public AMapLocException getAMapException()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AMapLocException g>
	//    2    4:areturn         
	}

	public String getCity()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String h>
	//    2    4:areturn         
	}

	public String getCityCode()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String j>
	//    2    4:areturn         
	}

	public String getHumidity()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String e>
	//    2    4:areturn         
	}

	public String getProvince()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String i>
	//    2    4:areturn         
	}

	public String getReportTime()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String f>
	//    2    4:areturn         
	}

	public String getTemperature()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String b>
	//    2    4:areturn         
	}

	public String getWeather()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String a>
	//    2    4:areturn         
	}

	public String getWindDir()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String c>
	//    2    4:areturn         
	}

	public String getWindPower()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String d>
	//    2    4:areturn         
	}

	public void setCity(String s)
	{
		h = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String h>
	//    3    5:return          
	}

	public void setCityCode(String s)
	{
		j = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String j>
	//    3    5:return          
	}

	public void setProvince(String s)
	{
		i = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String i>
	//    3    5:return          
	}

	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private AMapLocException g;
	private String h;
	private String i;
	private String j;
}
