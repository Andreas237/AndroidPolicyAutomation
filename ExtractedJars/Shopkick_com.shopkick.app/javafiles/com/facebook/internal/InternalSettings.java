// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


public class InternalSettings
{

	public InternalSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static String getCustomUserAgent()
	{
		return mCustomUserAgent;
	//    0    0:getstatic       #18  <Field String mCustomUserAgent>
	//    1    3:areturn         
	}

	public static boolean isUnityApp()
	{
		return mCustomUserAgent != null && mCustomUserAgent.startsWith("Unity.");
	//    0    0:getstatic       #18  <Field String mCustomUserAgent>
	//    1    3:ifnull          19
	//    2    6:getstatic       #18  <Field String mCustomUserAgent>
	//    3    9:ldc1            #8   <String "Unity.">
	//    4   11:invokevirtual   #26  <Method boolean String.startsWith(String)>
	//    5   14:ifeq            19
	//    6   17:iconst_1        
	//    7   18:ireturn         
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public static void setCustomUserAgent(String s)
	{
		mCustomUserAgent = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #18  <Field String mCustomUserAgent>
	//    2    4:return          
	}

	private static final String UNITY_PREFIX = "Unity.";
	private static volatile String mCustomUserAgent;
}
