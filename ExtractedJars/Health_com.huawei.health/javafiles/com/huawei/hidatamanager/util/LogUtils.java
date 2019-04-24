// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager.util;

import android.util.Log;

public final class LogUtils
{

	public LogUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static final void d(String s, String s1)
	{
		if(mSystemDebugOn)
	//*   0    0:getstatic       #13  <Field boolean mSystemDebugOn>
	//*   1    3:ifeq            12
			Log.d(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #24  <Method int Log.d(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static final void e(String s, String s1)
	{
		Log.e(replaceBlank(s), s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method String replaceBlank(String)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #31  <Method int Log.e(String, String)>
	//    4    8:pop             
	//    5    9:return          
	}

	public static final void e(String s, String s1, Throwable throwable)
	{
		Log.e(replaceBlank(s), s1, throwable);
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method String replaceBlank(String)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #35  <Method int Log.e(String, String, Throwable)>
	//    5    9:pop             
	//    6   10:return          
	}

	public static boolean getSystemDebugOn()
	{
		return mSystemDebugOn;
	//    0    0:getstatic       #13  <Field boolean mSystemDebugOn>
	//    1    3:ireturn         
	}

	public static final void i(String s, String s1)
	{
		if(mIsILogCanPrint)
	//*   0    0:getstatic       #11  <Field boolean mIsILogCanPrint>
	//*   1    3:ifeq            12
			Log.i(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #40  <Method int Log.i(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static String replaceBlank(String s)
	{
		return s.replaceAll("\t|\r|\n", "");
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "\t|\r|\n">
	//    2    3:ldc1            #44  <String "">
	//    3    5:invokevirtual   #50  <Method String String.replaceAll(String, String)>
	//    4    8:areturn         
	}

	public static void setSystemDebugOn(boolean flag)
	{
		mSystemDebugOn = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #13  <Field boolean mSystemDebugOn>
	//    2    4:return          
	}

	public static final void v(String s, String s1)
	{
		if(mSystemDebugOn)
	//*   0    0:getstatic       #13  <Field boolean mSystemDebugOn>
	//*   1    3:ifeq            12
			Log.v(s, s1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #55  <Method int Log.v(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static final void w(String s, String s1)
	{
		Log.w(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #58  <Method int Log.w(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	private static boolean mIsILogCanPrint = true;
	private static boolean mSystemDebugOn = true;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:putstatic       #11  <Field boolean mIsILogCanPrint>
	//    2    4:iconst_1        
	//    3    5:putstatic       #13  <Field boolean mSystemDebugOn>
	//*   4    8:return          
	}
}
