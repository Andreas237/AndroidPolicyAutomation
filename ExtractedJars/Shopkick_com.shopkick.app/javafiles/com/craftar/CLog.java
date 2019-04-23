// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.util.Log;

public class CLog
{

	public CLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static void d(String s)
	{
		d(TAG, s);
	//    0    0:getstatic       #27  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:invokestatic    #30  <Method void d(String, String)>
	//    3    7:return          
	}

	public static void d(String s, String s1)
	{
		if(showDebugLogs)
	//*   0    0:getstatic       #32  <Field boolean showDebugLogs>
	//*   1    3:ifeq            12
			Log.d(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #37  <Method int Log.d(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static void e(String s)
	{
		e(TAG, s);
	//    0    0:getstatic       #27  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:invokestatic    #40  <Method void e(String, String)>
	//    3    7:return          
	}

	public static void e(String s, String s1)
	{
		if(showErrorLogs)
	//*   0    0:getstatic       #42  <Field boolean showErrorLogs>
	//*   1    3:ifeq            12
			Log.e(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #44  <Method int Log.e(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static void i(String s)
	{
		i(TAG, s);
	//    0    0:getstatic       #27  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:invokestatic    #47  <Method void i(String, String)>
	//    3    7:return          
	}

	public static void i(String s, String s1)
	{
		if(showInfoLogs)
	//*   0    0:getstatic       #49  <Field boolean showInfoLogs>
	//*   1    3:ifeq            12
			Log.i(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #51  <Method int Log.i(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static void v(String s)
	{
		v(TAG, s);
	//    0    0:getstatic       #27  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:invokestatic    #54  <Method void v(String, String)>
	//    3    7:return          
	}

	public static void v(String s, String s1)
	{
		if(showVerboseLogs)
	//*   0    0:getstatic       #56  <Field boolean showVerboseLogs>
	//*   1    3:ifeq            12
			Log.v(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #58  <Method int Log.v(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static void w(String s)
	{
		w(TAG, s);
	//    0    0:getstatic       #27  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:invokestatic    #61  <Method void w(String, String)>
	//    3    7:return          
	}

	public static void w(String s, String s1)
	{
		if(showWarningLogs)
	//*   0    0:getstatic       #63  <Field boolean showWarningLogs>
	//*   1    3:ifeq            12
			Log.w(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #65  <Method int Log.w(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static void wtf(String s)
	{
		wtf(TAG, s);
	//    0    0:getstatic       #27  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:invokestatic    #68  <Method void wtf(String, String)>
	//    3    7:return          
	}

	public static void wtf(String s, String s1)
	{
		if(showWTFLogs)
	//*   0    0:getstatic       #70  <Field boolean showWTFLogs>
	//*   1    3:ifeq            12
			Log.wtf(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #72  <Method int Log.wtf(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	static String TAG = "CraftARSDK";
	public static boolean showDebugLogs = false;
	public static boolean showErrorLogs = true;
	public static boolean showInfoLogs = true;
	public static boolean showVerboseLogs = false;
	public static boolean showWTFLogs = true;
	public static boolean showWarningLogs = true;

	static 
	{
	//    0    0:return          
	}
}
