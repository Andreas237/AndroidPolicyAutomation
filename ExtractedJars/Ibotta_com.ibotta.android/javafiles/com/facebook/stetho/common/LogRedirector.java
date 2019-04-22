// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package com.facebook.stetho.common:
//			Util

public class LogRedirector
{
	public static interface Logger
	{

		public abstract boolean isLoggable(String s, int j);

		public abstract void log(int j, String s, String s1);
	}


	public LogRedirector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static void d(String s, String s1)
	{
		log(3, s, s1);
	//    0    0:iconst_3        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #20  <Method void log(int, String, String)>
	//    4    6:return          
	}

	public static void d(String s, String s1, Throwable throwable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s1);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\n");
	//    8   14:aload_3         
	//    9   15:ldc1            #30  <String "\n">
	//   10   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(formatThrowable(throwable));
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #34  <Method String formatThrowable(Throwable)>
	//   15   26:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		d(s, stringbuilder.toString());
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   20   35:invokestatic    #40  <Method void d(String, String)>
	//   21   38:return          
	}

	public static void e(String s, String s1)
	{
		log(6, s, s1);
	//    0    0:bipush          6
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #20  <Method void log(int, String, String)>
	//    4    7:return          
	}

	public static void e(String s, String s1, Throwable throwable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s1);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\n");
	//    8   14:aload_3         
	//    9   15:ldc1            #30  <String "\n">
	//   10   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(formatThrowable(throwable));
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #34  <Method String formatThrowable(Throwable)>
	//   15   26:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		e(s, stringbuilder.toString());
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   20   35:invokestatic    #43  <Method void e(String, String)>
	//   21   38:return          
	}

	private static String formatThrowable(Throwable throwable)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #45  <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringWriter()>
	//    3    7:astore_1        
		PrintWriter printwriter = new PrintWriter(((java.io.Writer) (stringwriter)));
	//    4    8:new             #48  <Class PrintWriter>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #51  <Method void PrintWriter(java.io.Writer)>
	//    8   16:astore_2        
		throwable.printStackTrace();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #56  <Method void Throwable.printStackTrace()>
		printwriter.flush();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #59  <Method void PrintWriter.flush()>
		return stringwriter.toString();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #60  <Method String StringWriter.toString()>
	//   15   29:areturn         
	}

	public static void i(String s, String s1)
	{
		log(4, s, s1);
	//    0    0:iconst_4        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #20  <Method void log(int, String, String)>
	//    4    6:return          
	}

	public static void i(String s, String s1, Throwable throwable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s1);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\n");
	//    8   14:aload_3         
	//    9   15:ldc1            #30  <String "\n">
	//   10   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(formatThrowable(throwable));
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #34  <Method String formatThrowable(Throwable)>
	//   15   26:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		i(s, stringbuilder.toString());
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   20   35:invokestatic    #63  <Method void i(String, String)>
	//   21   38:return          
	}

	public static boolean isLoggable(String s, int j)
	{
		Logger logger = sLogger;
	//    0    0:getstatic       #67  <Field LogRedirector$Logger sLogger>
	//    1    3:astore_2        
		if(logger != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          17
			return logger.isLoggable(s, j);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokeinterface #69  <Method boolean LogRedirector$Logger.isLoggable(String, int)>
	//    8   16:ireturn         
		else
			return Log.isLoggable(s, j);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokestatic    #72  <Method boolean Log.isLoggable(String, int)>
	//   12   22:ireturn         
	}

	private static void log(int j, String s, String s1)
	{
		Logger logger = sLogger;
	//    0    0:getstatic       #67  <Field LogRedirector$Logger sLogger>
	//    1    3:astore_3        
		if(logger != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          18
		{
			logger.log(j, s, s1);
	//    4    8:aload_3         
	//    5    9:iload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #73  <Method void LogRedirector$Logger.log(int, String, String)>
			return;
	//    9   17:return          
		} else
		{
			Log.println(j, s, s1);
	//   10   18:iload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokestatic    #77  <Method int Log.println(int, String, String)>
	//   14   24:pop             
			return;
	//   15   25:return          
		}
	}

	public static void setLogger(Logger logger)
	{
		Util.throwIfNull(((Object) (logger)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #85  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNotNull(((Object) (sLogger)));
	//    3    5:getstatic       #67  <Field LogRedirector$Logger sLogger>
	//    4    8:invokestatic    #89  <Method void Util.throwIfNotNull(Object)>
		sLogger = logger;
	//    5   11:aload_0         
	//    6   12:putstatic       #67  <Field LogRedirector$Logger sLogger>
	//    7   15:return          
	}

	public static void v(String s, String s1)
	{
		log(2, s, s1);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #20  <Method void log(int, String, String)>
	//    4    6:return          
	}

	public static void v(String s, String s1, Throwable throwable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s1);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\n");
	//    8   14:aload_3         
	//    9   15:ldc1            #30  <String "\n">
	//   10   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(formatThrowable(throwable));
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #34  <Method String formatThrowable(Throwable)>
	//   15   26:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		v(s, stringbuilder.toString());
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   20   35:invokestatic    #92  <Method void v(String, String)>
	//   21   38:return          
	}

	public static void w(String s, String s1)
	{
		log(5, s, s1);
	//    0    0:iconst_5        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #20  <Method void log(int, String, String)>
	//    4    6:return          
	}

	public static void w(String s, String s1, Throwable throwable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s1);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\n");
	//    8   14:aload_3         
	//    9   15:ldc1            #30  <String "\n">
	//   10   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(formatThrowable(throwable));
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #34  <Method String formatThrowable(Throwable)>
	//   15   26:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		w(s, stringbuilder.toString());
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   20   35:invokestatic    #95  <Method void w(String, String)>
	//   21   38:return          
	}

	private static volatile Logger sLogger;
}
