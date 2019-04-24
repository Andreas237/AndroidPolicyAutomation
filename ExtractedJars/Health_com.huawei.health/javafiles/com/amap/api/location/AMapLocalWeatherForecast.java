// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import com.amap.api.location.core.AMapLocException;
import java.util.List;

public class AMapLocalWeatherForecast
{

	public AMapLocalWeatherForecast()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	void a(AMapLocException amaplocexception)
	{
		c = amaplocexception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AMapLocException c>
	//    3    5:return          
	}

	void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String a>
	//    3    5:return          
	}

	void a(List list)
	{
		b = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field List b>
	//    3    5:return          
	}

	public AMapLocException getAMapException()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AMapLocException c>
	//    2    4:areturn         
	}

	public String getReportTime()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String a>
	//    2    4:areturn         
	}

	public List getWeatherForecast()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List b>
	//    2    4:areturn         
	}

	private String a;
	private List b;
	private AMapLocException c;
}
