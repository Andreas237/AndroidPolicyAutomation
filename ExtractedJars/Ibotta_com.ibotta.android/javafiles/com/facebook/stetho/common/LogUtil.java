// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.Locale;

// Referenced classes of package com.facebook.stetho.common:
//			LogRedirector

public class LogUtil
{

	public LogUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void d(String s)
	{
		if(isLoggable(3))
	//*   0    0:iconst_3        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            13
			LogRedirector.d("stetho", s);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_0         
	//    5   10:invokestatic    #24  <Method void LogRedirector.d(String, String)>
	//    6   13:return          
	}

	public static transient void d(String s, Object aobj[])
	{
		d(format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method String format(String, Object[])>
	//    3    5:invokestatic    #31  <Method void d(String)>
	//    4    8:return          
	}

	public static void d(Throwable throwable, String s)
	{
		if(isLoggable(3))
	//*   0    0:iconst_3        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            14
			LogRedirector.d("stetho", s, throwable);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:invokestatic    #35  <Method void LogRedirector.d(String, String, Throwable)>
	//    7   14:return          
	}

	public static transient void d(Throwable throwable, String s, Object aobj[])
	{
		d(throwable, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #29  <Method String format(String, Object[])>
	//    4    6:invokestatic    #38  <Method void d(Throwable, String)>
	//    5    9:return          
	}

	public static void e(String s)
	{
		if(isLoggable(6))
	//*   0    0:bipush          6
	//*   1    2:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    5:ifeq            14
			LogRedirector.e("stetho", s);
	//    3    8:ldc1            #8   <String "stetho">
	//    4   10:aload_0         
	//    5   11:invokestatic    #41  <Method void LogRedirector.e(String, String)>
	//    6   14:return          
	}

	public static transient void e(String s, Object aobj[])
	{
		e(format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method String format(String, Object[])>
	//    3    5:invokestatic    #43  <Method void e(String)>
	//    4    8:return          
	}

	public static void e(Throwable throwable, String s)
	{
		if(isLoggable(6))
	//*   0    0:bipush          6
	//*   1    2:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    5:ifeq            15
			LogRedirector.e("stetho", s, throwable);
	//    3    8:ldc1            #8   <String "stetho">
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokestatic    #45  <Method void LogRedirector.e(String, String, Throwable)>
	//    7   15:return          
	}

	public static transient void e(Throwable throwable, String s, Object aobj[])
	{
		e(throwable, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #29  <Method String format(String, Object[])>
	//    4    6:invokestatic    #47  <Method void e(Throwable, String)>
	//    5    9:return          
	}

	private static transient String format(String s, Object aobj[])
	{
		return String.format(Locale.US, s, aobj);
	//    0    0:getstatic       #53  <Field Locale Locale.US>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #58  <Method String String.format(Locale, String, Object[])>
	//    4    8:areturn         
	}

	public static void i(String s)
	{
		if(isLoggable(4))
	//*   0    0:iconst_4        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            13
			LogRedirector.i("stetho", s);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_0         
	//    5   10:invokestatic    #61  <Method void LogRedirector.i(String, String)>
	//    6   13:return          
	}

	public static transient void i(String s, Object aobj[])
	{
		i(format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method String format(String, Object[])>
	//    3    5:invokestatic    #63  <Method void i(String)>
	//    4    8:return          
	}

	public static void i(Throwable throwable, String s)
	{
		if(isLoggable(4))
	//*   0    0:iconst_4        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            14
			LogRedirector.i("stetho", s, throwable);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:invokestatic    #65  <Method void LogRedirector.i(String, String, Throwable)>
	//    7   14:return          
	}

	public static transient void i(Throwable throwable, String s, Object aobj[])
	{
		i(throwable, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #29  <Method String format(String, Object[])>
	//    4    6:invokestatic    #67  <Method void i(Throwable, String)>
	//    5    9:return          
	}

	public static boolean isLoggable(int j)
	{
		switch(j)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     5 6: default 24
	//	               5 31
	//	               6 31
		default:
			return LogRedirector.isLoggable("stetho", j);
	//    2   24:ldc1            #8   <String "stetho">
	//    3   26:iload_0         
	//    4   27:invokestatic    #70  <Method boolean LogRedirector.isLoggable(String, int)>
	//    5   30:ireturn         

		case 5: // '\005'
		case 6: // '\006'
			return true;
	//    6   31:iconst_1        
	//    7   32:ireturn         
		}
	}

	public static void v(String s)
	{
		if(isLoggable(2))
	//*   0    0:iconst_2        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            13
			LogRedirector.v("stetho", s);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_0         
	//    5   10:invokestatic    #73  <Method void LogRedirector.v(String, String)>
	//    6   13:return          
	}

	public static transient void v(String s, Object aobj[])
	{
		v(format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method String format(String, Object[])>
	//    3    5:invokestatic    #75  <Method void v(String)>
	//    4    8:return          
	}

	public static void v(Throwable throwable, String s)
	{
		if(isLoggable(2))
	//*   0    0:iconst_2        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            14
			LogRedirector.v("stetho", s, throwable);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:invokestatic    #77  <Method void LogRedirector.v(String, String, Throwable)>
	//    7   14:return          
	}

	public static transient void v(Throwable throwable, String s, Object aobj[])
	{
		v(throwable, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #29  <Method String format(String, Object[])>
	//    4    6:invokestatic    #79  <Method void v(Throwable, String)>
	//    5    9:return          
	}

	public static void w(String s)
	{
		if(isLoggable(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            13
			LogRedirector.w("stetho", s);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_0         
	//    5   10:invokestatic    #82  <Method void LogRedirector.w(String, String)>
	//    6   13:return          
	}

	public static transient void w(String s, Object aobj[])
	{
		w(format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method String format(String, Object[])>
	//    3    5:invokestatic    #84  <Method void w(String)>
	//    4    8:return          
	}

	public static void w(Throwable throwable, String s)
	{
		if(isLoggable(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #19  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            14
			LogRedirector.w("stetho", s, throwable);
	//    3    7:ldc1            #8   <String "stetho">
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:invokestatic    #86  <Method void LogRedirector.w(String, String, Throwable)>
	//    7   14:return          
	}

	public static transient void w(Throwable throwable, String s, Object aobj[])
	{
		w(throwable, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #29  <Method String format(String, Object[])>
	//    4    6:invokestatic    #88  <Method void w(Throwable, String)>
	//    5    9:return          
	}

	private static final String TAG = "stetho";
}
