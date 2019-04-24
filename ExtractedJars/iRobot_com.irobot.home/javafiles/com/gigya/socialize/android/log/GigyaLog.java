// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.log;


// Referenced classes of package com.gigya.socialize.android.log:
//			AndroidLogger, ILogger

public class GigyaLog
{

	public GigyaLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private static String buildMessage(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("<<<");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "<<<">
	//    6   11:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(" *** ");
	//   12   21:aload_2         
	//   13   22:ldc1            #37  <String " *** ">
	//   14   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(s1);
	//   16   28:aload_2         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		stringbuilder.append(">>>");
	//   20   34:aload_2         
	//   21   35:ldc1            #39  <String ">>>">
	//   22   37:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_2         
	//   25   42:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	public static void d(String s, String s1)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            21
			mLogger.d("GigyaSDK", buildMessage(s, s1));
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:invokeinterface #53  <Method void ILogger.d(String, String)>
	//    8   21:return          
	}

	public static void d(String s, String s1, Throwable throwable)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            22
			mLogger.d("GigyaSDK", buildMessage(s, s1), throwable);
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:aload_2         
	//    8   17:invokeinterface #56  <Method void ILogger.d(String, String, Throwable)>
	//    9   22:return          
	}

	public static void e(String s, String s1)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            21
			mLogger.e("GigyaSDK", buildMessage(s, s1));
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:invokeinterface #59  <Method void ILogger.e(String, String)>
	//    8   21:return          
	}

	public static void e(String s, String s1, Throwable throwable)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            22
			mLogger.e("GigyaSDK", buildMessage(s, s1), throwable);
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:aload_2         
	//    8   17:invokeinterface #61  <Method void ILogger.e(String, String, Throwable)>
	//    9   22:return          
	}

	public static boolean getDebugMode()
	{
		return DEBUG_MODE_ENABLED;
	//    0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//    1    3:ireturn         
	}

	public static void i(String s, String s1)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            21
			mLogger.i("GigyaSDK", buildMessage(s, s1));
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:invokeinterface #66  <Method void ILogger.i(String, String)>
	//    8   21:return          
	}

	public static void i(String s, String s1, Throwable throwable)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            22
			mLogger.i("GigyaSDK", buildMessage(s, s1), throwable);
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:aload_2         
	//    8   17:invokeinterface #68  <Method void ILogger.i(String, String, Throwable)>
	//    9   22:return          
	}

	public static void setDebugMode(boolean flag)
	{
		DEBUG_MODE_ENABLED = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//    2    4:return          
	}

	public static void setLogger(ILogger ilogger)
	{
		mLogger = ilogger;
	//    0    0:aload_0         
	//    1    1:putstatic       #22  <Field ILogger mLogger>
	//    2    4:return          
	}

	public static void v(String s, String s1)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            21
			mLogger.v("GigyaSDK", buildMessage(s, s1));
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:invokeinterface #75  <Method void ILogger.v(String, String)>
	//    8   21:return          
	}

	public static void v(String s, String s1, Throwable throwable)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            22
			mLogger.v("GigyaSDK", buildMessage(s, s1), throwable);
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:aload_2         
	//    8   17:invokeinterface #77  <Method void ILogger.v(String, String, Throwable)>
	//    9   22:return          
	}

	public static void w(String s, String s1)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            21
			mLogger.w("GigyaSDK", buildMessage(s, s1));
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:invokeinterface #80  <Method void ILogger.w(String, String)>
	//    8   21:return          
	}

	public static void w(String s, String s1, Throwable throwable)
	{
		if(DEBUG_MODE_ENABLED)
	//*   0    0:getstatic       #47  <Field boolean DEBUG_MODE_ENABLED>
	//*   1    3:ifeq            22
			mLogger.w("GigyaSDK", buildMessage(s, s1), throwable);
	//    2    6:getstatic       #22  <Field ILogger mLogger>
	//    3    9:ldc1            #11  <String "GigyaSDK">
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokestatic    #49  <Method String buildMessage(String, String)>
	//    7   16:aload_2         
	//    8   17:invokeinterface #82  <Method void ILogger.w(String, String, Throwable)>
	//    9   22:return          
	}

	private static boolean DEBUG_MODE_ENABLED = false;
	private static final String TAG = "GigyaSDK";
	private static ILogger mLogger = new AndroidLogger();

	static 
	{
	//    0    0:new             #17  <Class AndroidLogger>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void AndroidLogger()>
	//    3    7:putstatic       #22  <Field ILogger mLogger>
	//*   4   10:return          
	}
}
