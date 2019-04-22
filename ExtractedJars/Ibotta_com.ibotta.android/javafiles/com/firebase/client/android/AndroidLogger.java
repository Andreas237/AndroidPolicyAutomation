// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.util.Log;
import com.firebase.client.utilities.DefaultLogger;
import java.util.List;

public class AndroidLogger extends DefaultLogger
{

	public AndroidLogger(com.firebase.client.Logger.Level level, List list)
	{
		super(level, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void DefaultLogger(com.firebase.client.Logger$Level, List)>
	//    4    6:return          
	}

	protected String buildLogMessage(com.firebase.client.Logger.Level level, String s, String s1, long l)
	{
		return s1;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	protected void debug(String s, String s1)
	{
		Log.d(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #21  <Method int Log.d(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	protected void error(String s, String s1)
	{
		Log.e(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method int Log.e(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	protected void info(String s, String s1)
	{
		Log.i(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #29  <Method int Log.i(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	protected void warn(String s, String s1)
	{
		Log.w(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #33  <Method int Log.w(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}
}
