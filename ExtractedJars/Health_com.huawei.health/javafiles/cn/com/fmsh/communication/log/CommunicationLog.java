// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.log;

import android.util.Log;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.Level;

public class CommunicationLog
	implements FMLog
{

	public CommunicationLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		showLogFlag = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #16  <Field boolean showLogFlag>
	//    5    9:return          
	}

	public void debug(String s, String s1)
	{
		Log.d(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method int Log.d(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void error(String s, String s1)
	{
		Log.e(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #29  <Method int Log.e(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public boolean getShowLogFlag()
	{
		return showLogFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field boolean showLogFlag>
	//    2    4:ireturn         
	}

	public Level getShowLogLevel()
	{
		return showLogLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Level showLogLevel>
	//    2    4:areturn         
	}

	public void info(String s, String s1)
	{
		Log.i(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #39  <Method int Log.i(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void setShowLogFlag(boolean flag)
	{
		showLogFlag = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field boolean showLogFlag>
	//    3    5:return          
	}

	public void setShowLogLevel(Level level)
	{
		showLogLevel = level;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Level showLogLevel>
	//    3    5:return          
	}

	public void warn(String s, String s1)
	{
		Log.w(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #47  <Method int Log.w(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public boolean showLogFlag;
	private Level showLogLevel;
}
