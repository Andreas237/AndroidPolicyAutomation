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
	//    1    1:invokespecial   #68  <Method void Object()>
	//    2    4:return          
	}

	public static final String ALARM_LOG_FILE_NAME = ".alarms";
	public static final String CONNECTION_LOG_FILE_NAME = ".service_connections";
	public static final String EXTRA_LOG_EVENT = "com.google.android.gms.common.stats.EXTRA_LOG_EVENT";
	public static final String EXTRA_WAKE_LOCK_KEY = "WAKE_LOCK_KEY";
	public static int IGNORE_INTRA_PROCESS = 0;
	public static int LOG_CLOSE_EVENTS = 0;
	public static final String LOG_FILE_PREFIX = "stats";
	public static int LOG_LEVEL_OFF = 0;
	public static int LOG_MEM_INFO = 0;
	public static int LOG_OPEN_EVENTS = 0;
	public static int LOG_TOO_LONG_EVENTS = 0;
	public static int LOG_VERBOSE = 0;
	public static int LOG_WAKEFUL_ALARMS = 0;
	public static final ComponentName STATS_SERVICE_COMPONENT_NAME = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
	public static final String WAKE_LOCK_LOG_FILE_NAME = ".wakelocks";

	static 
	{
	//    0    0:new             #39  <Class ComponentName>
	//    1    3:dup             
	//    2    4:ldc1            #41  <String "com.google.android.gms">
	//    3    6:ldc1            #43  <String "com.google.android.gms.common.stats.GmsCoreStatsService">
	//    4    8:invokespecial   #47  <Method void ComponentName(String, String)>
	//    5   11:putstatic       #49  <Field ComponentName STATS_SERVICE_COMPONENT_NAME>
		LOG_LEVEL_OFF = 0;
	//    6   14:iconst_0        
	//    7   15:putstatic       #51  <Field int LOG_LEVEL_OFF>
		LOG_TOO_LONG_EVENTS = 1;
	//    8   18:iconst_1        
	//    9   19:putstatic       #53  <Field int LOG_TOO_LONG_EVENTS>
		LOG_OPEN_EVENTS = 2;
	//   10   22:iconst_2        
	//   11   23:putstatic       #55  <Field int LOG_OPEN_EVENTS>
		LOG_CLOSE_EVENTS = 4;
	//   12   26:iconst_4        
	//   13   27:putstatic       #57  <Field int LOG_CLOSE_EVENTS>
		LOG_VERBOSE = 8;
	//   14   30:bipush          8
	//   15   32:putstatic       #59  <Field int LOG_VERBOSE>
		IGNORE_INTRA_PROCESS = 16;
	//   16   35:bipush          16
	//   17   37:putstatic       #61  <Field int IGNORE_INTRA_PROCESS>
		LOG_MEM_INFO = 32;
	//   18   40:bipush          32
	//   19   42:putstatic       #63  <Field int LOG_MEM_INFO>
		LOG_WAKEFUL_ALARMS = 1;
	//   20   45:iconst_1        
	//   21   46:putstatic       #65  <Field int LOG_WAKEFUL_ALARMS>
	//*  22   49:return          
	}
}
