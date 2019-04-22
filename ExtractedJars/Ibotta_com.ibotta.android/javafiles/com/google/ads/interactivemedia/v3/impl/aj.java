// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import java.util.Map;

public class aj
	implements StreamRequest
{

	public aj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public void a(StreamDisplayContainer streamdisplaycontainer)
	{
		a = streamdisplaycontainer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field StreamDisplayContainer a>
	//    3    5:return          
	}

	public void a(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String b>
	//    3    5:return          
	}

	public void b(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String d>
	//    3    5:return          
	}

	public void c(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String e>
	//    3    5:return          
	}

	public void d(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String c>
	//    3    5:return          
	}

	public Map getAdTagParameters()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map g>
	//    2    4:areturn         
	}

	public String getApiKey()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String c>
	//    2    4:areturn         
	}

	public String getAssetKey()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String b>
	//    2    4:areturn         
	}

	public String getContentSourceId()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String d>
	//    2    4:areturn         
	}

	public String getManifestSuffix()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String h>
	//    2    4:areturn         
	}

	public StreamDisplayContainer getStreamDisplayContainer()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field StreamDisplayContainer a>
	//    2    4:areturn         
	}

	public Object getUserRequestContext()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object i>
	//    2    4:areturn         
	}

	public String getVideoId()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String e>
	//    2    4:areturn         
	}

	public boolean isPrerollRequested()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean f>
	//    2    4:ireturn         
	}

	public void setAdTagParameters(Map map)
	{
		g = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field Map g>
	//    3    5:return          
	}

	public void setManifestSuffix(String s)
	{
		h = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String h>
	//    3    5:return          
	}

	public void setPrerollRequested(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean f>
	//    3    5:return          
	}

	public void setUserRequestContext(Object obj)
	{
		i = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Object i>
	//    3    5:return          
	}

	private StreamDisplayContainer a;
	private String b;
	private String c;
	private String d;
	private String e;
	private boolean f;
	private Map g;
	private String h;
	private transient Object i;
}
