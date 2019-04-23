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
	//    1    1:invokespecial   #53  <Method void Object()>
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
	//    0    0:new             #24  <Class ComponentName>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "com.google.android.gms">
	//    3    6:ldc1            #28  <String "com.google.android.gms.common.stats.GmsCoreStatsService">
	//    4    8:invokespecial   #32  <Method void ComponentName(String, String)>
	//    5   11:putstatic       #34  <Field ComponentName zzfg>
	//    6   14:iconst_0        
	//    7   15:putstatic       #36  <Field int LOG_LEVEL_OFF>
	//    8   18:iconst_1        
	//    9   19:putstatic       #38  <Field int zzfh>
	//   10   22:iconst_2        
	//   11   23:putstatic       #40  <Field int zzfi>
	//   12   26:iconst_4        
	//   13   27:putstatic       #42  <Field int zzfj>
	//   14   30:bipush          8
	//   15   32:putstatic       #44  <Field int zzfk>
	//   16   35:bipush          16
	//   17   37:putstatic       #46  <Field int zzfl>
	//   18   40:bipush          32
	//   19   42:putstatic       #48  <Field int zzfm>
	//   20   45:iconst_1        
	//   21   46:putstatic       #50  <Field int zzfn>
	//*  22   49:return          
	}
}
