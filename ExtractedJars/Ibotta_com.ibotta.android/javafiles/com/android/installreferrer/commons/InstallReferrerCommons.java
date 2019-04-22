// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.installreferrer.commons;

import android.util.Log;

public final class InstallReferrerCommons
{

	public static void logVerbose(String s, String s1)
	{
		if(Log.isLoggable(s, 2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokestatic    #12  <Method boolean Log.isLoggable(String, int)>
	//*   3    5:ifeq            14
			Log.v(s, s1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #16  <Method int Log.v(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static void logWarn(String s, String s1)
	{
		if(Log.isLoggable(s, 5))
	//*   0    0:aload_0         
	//*   1    1:iconst_5        
	//*   2    2:invokestatic    #12  <Method boolean Log.isLoggable(String, int)>
	//*   3    5:ifeq            14
			Log.w(s, s1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #21  <Method int Log.w(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}
}
