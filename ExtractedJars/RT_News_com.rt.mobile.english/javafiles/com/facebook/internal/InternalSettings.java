// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


public class InternalSettings
{

	public InternalSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static String getCustomUserAgent()
	{
		return mCustomUserAgent;
	//    0    0:getstatic       #15  <Field String mCustomUserAgent>
	//    1    3:areturn         
	}

	public static void setCustomUserAgent(String s)
	{
		mCustomUserAgent = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #15  <Field String mCustomUserAgent>
	//    2    4:return          
	}

	private static volatile String mCustomUserAgent;
}
