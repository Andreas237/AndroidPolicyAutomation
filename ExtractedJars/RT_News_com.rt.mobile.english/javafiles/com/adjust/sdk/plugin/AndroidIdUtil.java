// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk.plugin;

import android.content.Context;

public class AndroidIdUtil
{

	public AndroidIdUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getAndroidId(Context context)
	{
		return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:ldc1            #19  <String "android_id">
	//    3    6:invokestatic    #25  <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    4    9:areturn         
	}
}
