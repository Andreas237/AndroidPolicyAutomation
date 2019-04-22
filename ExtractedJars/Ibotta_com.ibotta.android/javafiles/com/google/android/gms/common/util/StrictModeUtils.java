// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.StrictMode;

public class StrictModeUtils
{

	public StrictModeUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static android.os.StrictMode.ThreadPolicy setDynamiteThreadPolicy()
	{
		StrictMode.noteSlowCall("gcore.dynamite");
	//    0    0:ldc1            #13  <String "gcore.dynamite">
	//    1    2:invokestatic    #19  <Method void StrictMode.noteSlowCall(String)>
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.getThreadPolicy();
	//    2    5:invokestatic    #22  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    3    8:astore_0        
		StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
	//    4    9:getstatic       #28  <Field android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy.LAX>
	//    5   12:invokestatic    #32  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return threadpolicy;
	//    6   15:aload_0         
	//    7   16:areturn         
	}
}
