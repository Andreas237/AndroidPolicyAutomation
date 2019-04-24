// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import android.location.Location;
import com.amap.api.location.core.AMapLocException;

public class AMapLocation extends Location
{

	public AMapLocation(Location location)
	{
		super(location);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void Location(Location)>
		m = new AMapLocException();
	//    3    5:aload_0         
	//    4    6:new             #25  <Class AMapLocException>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void AMapLocException()>
	//    7   13:putfield        #30  <Field AMapLocException m>
	//    8   16:return          
	}

	public AMapLocation(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void Location(String)>
		m = new AMapLocException();
	//    3    5:aload_0         
	//    4    6:new             #25  <Class AMapLocException>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void AMapLocException()>
	//    7   13:putfield        #30  <Field AMapLocException m>
	//    8   16:return          
	}

	void a(String s)
	{
		h = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String h>
	//    3    5:return          
	}

	public AMapLocException getAMapException()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AMapLocException m>
	//    2    4:areturn         
	}

	public String getAdCode()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String e>
	//    2    4:areturn         
	}

	public String getAddress()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String i>
	//    2    4:areturn         
	}

	public String getCity()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String b>
	//    2    4:areturn         
	}

	public String getCityCode()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String d>
	//    2    4:areturn         
	}

	public String getCountry()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String j>
	//    2    4:areturn         
	}

	public String getDistrict()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String c>
	//    2    4:areturn         
	}

	public String getFloor()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String g>
	//    2    4:areturn         
	}

	public String getPoiId()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String f>
	//    2    4:areturn         
	}

	public String getPoiName()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String l>
	//    2    4:areturn         
	}

	public String getProvince()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String a>
	//    2    4:areturn         
	}

	public String getRoad()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String k>
	//    2    4:areturn         
	}

	public String getStreet()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String h>
	//    2    4:areturn         
	}

	public void setAMapException(AMapLocException amaplocexception)
	{
		m = amaplocexception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field AMapLocException m>
	//    3    5:return          
	}

	public void setAdCode(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String e>
	//    3    5:return          
	}

	public void setAddress(String s)
	{
		i = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String i>
	//    3    5:return          
	}

	public void setCity(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String b>
	//    3    5:return          
	}

	public void setCityCode(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String d>
	//    3    5:return          
	}

	public void setCountry(String s)
	{
		j = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String j>
	//    3    5:return          
	}

	public void setDistrict(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String c>
	//    3    5:return          
	}

	public void setFloor(String s)
	{
		g = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field String g>
	//    3    5:return          
	}

	public void setPoiId(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field String f>
	//    3    5:return          
	}

	public void setPoiName(String s)
	{
		l = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field String l>
	//    3    5:return          
	}

	public void setProvince(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field String a>
	//    3    5:return          
	}

	public void setRoad(String s)
	{
		k = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field String k>
	//    3    5:return          
	}

	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;
	private String i;
	private String j;
	private String k;
	private String l;
	private AMapLocException m;
}
