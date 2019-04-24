// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.log;

import android.util.Log;

// Referenced classes of package com.birbit.android.jobqueue.log:
//			CustomLogger

public class JqLog
{
	public static class ErrorLogger
		implements CustomLogger
	{

		public transient void d(String s, Object aobj[])
		{
		//    0    0:return          
		}

		public transient void e(String s, Object aobj[])
		{
			Log.e("JobManager", String.format(s, aobj));
		//    0    0:ldc1            #13  <String "JobManager">
		//    1    2:aload_1         
		//    2    3:aload_2         
		//    3    4:invokestatic    #27  <Method String String.format(String, Object[])>
		//    4    7:invokestatic    #32  <Method int Log.e(String, String)>
		//    5   10:pop             
		//    6   11:return          
		}

		public transient void e(Throwable throwable, String s, Object aobj[])
		{
			Log.e("JobManager", String.format(s, aobj), throwable);
		//    0    0:ldc1            #13  <String "JobManager">
		//    1    2:aload_2         
		//    2    3:aload_3         
		//    3    4:invokestatic    #27  <Method String String.format(String, Object[])>
		//    4    7:aload_1         
		//    5    8:invokestatic    #36  <Method int Log.e(String, String, Throwable)>
		//    6   11:pop             
		//    7   12:return          
		}

		public boolean isDebugEnabled()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public transient void v(String s, Object aobj[])
		{
		//    0    0:return          
		}

		private static final String TAG = "JobManager";

		public ErrorLogger()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	public JqLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static void clearLogger()
	{
		setCustomLogger(new CustomLogger() {

			public transient void d(String s, Object aobj[])
			{
			//    0    0:return          
			}

			public transient void e(String s, Object aobj[])
			{
			//    0    0:return          
			}

			public transient void e(Throwable throwable, String s, Object aobj[])
			{
			//    0    0:return          
			}

			public boolean isDebugEnabled()
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public transient void v(String s, Object aobj[])
			{
			//    0    0:return          
			}

		}
);
	//    0    0:new             #6   <Class JqLog$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void JqLog$1()>
	//    3    7:invokestatic    #25  <Method void setCustomLogger(CustomLogger)>
	//    4   10:return          
	}

	public static transient void d(String s, Object aobj[])
	{
		customLogger.d(s, aobj);
	//    0    0:getstatic       #29  <Field CustomLogger customLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #33  <Method void CustomLogger.d(String, Object[])>
	//    4   10:return          
	}

	public static transient void e(String s, Object aobj[])
	{
		customLogger.e(s, aobj);
	//    0    0:getstatic       #29  <Field CustomLogger customLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method void CustomLogger.e(String, Object[])>
	//    4   10:return          
	}

	public static transient void e(Throwable throwable, String s, Object aobj[])
	{
		customLogger.e(throwable, s, aobj);
	//    0    0:getstatic       #29  <Field CustomLogger customLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #39  <Method void CustomLogger.e(Throwable, String, Object[])>
	//    5   11:return          
	}

	public static boolean isDebugEnabled()
	{
		return customLogger.isDebugEnabled();
	//    0    0:getstatic       #29  <Field CustomLogger customLogger>
	//    1    3:invokeinterface #43  <Method boolean CustomLogger.isDebugEnabled()>
	//    2    8:ireturn         
	}

	public static void setCustomLogger(CustomLogger customlogger)
	{
		customLogger = customlogger;
	//    0    0:aload_0         
	//    1    1:putstatic       #29  <Field CustomLogger customLogger>
	//    2    4:return          
	}

	public static transient void v(String s, Object aobj[])
	{
		customLogger.v(s, aobj);
	//    0    0:getstatic       #29  <Field CustomLogger customLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method void CustomLogger.v(String, Object[])>
	//    4   10:return          
	}

	private static CustomLogger customLogger;

	static 
	{
		clearLogger();
	//    0    0:invokestatic    #16  <Method void clearLogger()>
	//*   1    3:return          
	}
}
