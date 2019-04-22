// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;


public class AFVersionDeclaration
{

	public static void init()
	{
		googleSdkIdentifier = "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:4.8.9";
	//    0    0:ldc1            #10  <String "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:4.8.9">
	//    1    2:putstatic       #12  <Field String googleSdkIdentifier>
	//    2    5:return          
	}

	private static String googleSdkIdentifier;
}
