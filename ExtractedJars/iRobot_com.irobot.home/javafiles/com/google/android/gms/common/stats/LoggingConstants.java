// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.content.ComponentName;

public final class LoggingConstants
{

	private LoggingConstants()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static final String EXTRA_WAKE_LOCK_KEY = "WAKE_LOCK_KEY";
	private static int LOG_LEVEL_OFF = 0;
	public static final ComponentName zzfg = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
	private static int zzfh = 1;
	private static int zzfi = 2;
	private static int zzfj = 4;
	private static int zzfk = 8;
	private static int zzfl = 16;
	private static int zzfm = 32;
	private static int zzfn = 1;

	static 
	{
	//    0    0:new             #31  <Class ComponentName>
	//    1    3:dup             
	//    2    4:ldc1            #33  <String "com.google.android.gms">
	//    3    6:ldc1            #35  <String "com.google.android.gms.common.stats.GmsCoreStatsService">
	//    4    8:invokespecial   #39  <Method void ComponentName(String, String)>
	//    5   11:putstatic       #41  <Field ComponentName zzfg>
	//*   6   14:return          
	}
}
