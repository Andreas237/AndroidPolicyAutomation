// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


public class InternalSettings
{

	public static String getCustomUserAgent()
	{
		return mCustomUserAgent;
	//    0    0:getstatic       #10  <Field String mCustomUserAgent>
	//    1    3:areturn         
	}

	private static volatile String mCustomUserAgent;
}
