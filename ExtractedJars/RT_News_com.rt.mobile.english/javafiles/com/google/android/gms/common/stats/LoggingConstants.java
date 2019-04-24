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
	//    1    1:invokespecial   #58  <Method void Object()>
	//    2    4:return          
	}

	public static final String ALARM_LOG_FILE_NAME = ".alarms";
	public static final String CONNECTION_LOG_FILE_NAME = ".service_connections";
	public static final String EXTRA_LOG_EVENT = "com.google.android.gms.common.stats.EXTRA_LOG_EVENT";
	public static final String EXTRA_WAKE_LOCK_KEY = "WAKE_LOCK_KEY";
	public static int IGNORE_INTRA_PROCESS = 16;
	public static int LOG_CLOSE_EVENTS = 4;
	public static final String LOG_FILE_PREFIX = "stats";
	public static int LOG_LEVEL_OFF = 0;
	public static int LOG_MEM_INFO = 32;
	public static int LOG_OPEN_EVENTS = 2;
	public static int LOG_TOO_LONG_EVENTS = 1;
	public static int LOG_VERBOSE = 8;
	public static int LOG_WAKEFUL_ALARMS = 1;
	public static final ComponentName STATS_SERVICE_COMPONENT_NAME = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
	public static final String WAKE_LOCK_LOG_FILE_NAME = ".wakelocks";

	static 
	{
	//    0    0:new             #45  <Class ComponentName>
	//    1    3:dup             
	//    2    4:ldc1            #47  <String "com.google.android.gms">
	//    3    6:ldc1            #49  <String "com.google.android.gms.common.stats.GmsCoreStatsService">
	//    4    8:invokespecial   #53  <Method void ComponentName(String, String)>
	//    5   11:putstatic       #55  <Field ComponentName STATS_SERVICE_COMPONENT_NAME>
	//*   6   14:return          
	}
}
