// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import com.firebase.client.Logger;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LogWrapper
{

	public LogWrapper(Logger logger1, String s)
	{
		this(logger1, s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #20  <Method void LogWrapper(Logger, String, String)>
	//    5    7:return          
	}

	public LogWrapper(Logger logger1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		logger = logger1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Logger logger>
		component = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String component>
		prefix = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field String prefix>
	//   11   19:return          
	}

	private static String exceptionStacktrace(Throwable throwable)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #32  <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringWriter()>
	//    3    7:astore_1        
		throwable.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter))));
	//    4    8:aload_0         
	//    5    9:new             #35  <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #38  <Method void PrintWriter(java.io.Writer)>
	//    9   17:invokevirtual   #44  <Method void Throwable.printStackTrace(PrintWriter)>
		return stringwriter.toString();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #48  <Method String StringWriter.toString()>
	//   12   24:areturn         
	}

	private long now()
	{
		return System.currentTimeMillis();
	//    0    0:invokestatic    #55  <Method long System.currentTimeMillis()>
	//    1    3:lreturn         
	}

	private String toLog(String s)
	{
		if(prefix == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field String prefix>
	//*   2    4:ifnonnull       9
		{
			return s;
	//    3    7:aload_1         
	//    4    8:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #59  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #60  <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append(prefix);
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #28  <Field String prefix>
	//   12   22:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			stringbuilder.append(" - ");
	//   14   26:aload_2         
	//   15   27:ldc1            #66  <String " - ">
	//   16   29:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			stringbuilder.append(s);
	//   18   33:aload_2         
	//   19   34:aload_1         
	//   20   35:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			return stringbuilder.toString();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   24   43:areturn         
		}
	}

	public void debug(String s)
	{
		debug(s, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #72  <Method void debug(String, Throwable)>
	//    4    6:return          
	}

	public void debug(String s, Throwable throwable)
	{
		s = toLog(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method String toLog(String)>
	//    3    5:astore_1        
		if(throwable != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          48
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #59  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #60  <Method void StringBuilder()>
	//    9   17:astore_3        
			stringbuilder.append(s);
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
			stringbuilder.append("\n");
	//   14   24:aload_3         
	//   15   25:ldc1            #76  <String "\n">
	//   16   27:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			stringbuilder.append(exceptionStacktrace(throwable));
	//   18   31:aload_3         
	//   19   32:aload_2         
	//   20   33:invokestatic    #78  <Method String exceptionStacktrace(Throwable)>
	//   21   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
			s = stringbuilder.toString();
	//   23   40:aload_3         
	//   24   41:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   25   44:astore_1        
		}
	//*  26   45:goto            48
		logger.onLogMessage(com.firebase.client.Logger.Level.DEBUG, component, s, now());
	//   27   48:aload_0         
	//   28   49:getfield        #24  <Field Logger logger>
	//   29   52:getstatic       #84  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.DEBUG>
	//   30   55:aload_0         
	//   31   56:getfield        #26  <Field String component>
	//   32   59:aload_1         
	//   33   60:aload_0         
	//   34   61:invokespecial   #86  <Method long now()>
	//   35   64:invokeinterface #92  <Method void Logger.onLogMessage(com.firebase.client.Logger$Level, String, String, long)>
	//   36   69:return          
	}

	public void error(String s, Throwable throwable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(toLog(s));
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #74  <Method String toLog(String)>
	//    8   14:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    9   17:pop             
		stringbuilder.append("\n");
	//   10   18:aload_3         
	//   11   19:ldc1            #76  <String "\n">
	//   12   21:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(exceptionStacktrace(throwable));
	//   14   25:aload_3         
	//   15   26:aload_2         
	//   16   27:invokestatic    #78  <Method String exceptionStacktrace(Throwable)>
	//   17   30:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		s = stringbuilder.toString();
	//   19   34:aload_3         
	//   20   35:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   21   38:astore_1        
		logger.onLogMessage(com.firebase.client.Logger.Level.ERROR, component, s, now());
	//   22   39:aload_0         
	//   23   40:getfield        #24  <Field Logger logger>
	//   24   43:getstatic       #96  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.ERROR>
	//   25   46:aload_0         
	//   26   47:getfield        #26  <Field String component>
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:invokespecial   #86  <Method long now()>
	//   30   55:invokeinterface #92  <Method void Logger.onLogMessage(com.firebase.client.Logger$Level, String, String, long)>
	//   31   60:return          
	}

	public void info(String s)
	{
		logger.onLogMessage(com.firebase.client.Logger.Level.INFO, component, toLog(s), now());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Logger logger>
	//    2    4:getstatic       #100 <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.INFO>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field String component>
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #74  <Method String toLog(String)>
	//    8   16:aload_0         
	//    9   17:invokespecial   #86  <Method long now()>
	//   10   20:invokeinterface #92  <Method void Logger.onLogMessage(com.firebase.client.Logger$Level, String, String, long)>
	//   11   25:return          
	}

	public boolean logsDebug()
	{
		return logger.getLogLevel().ordinal() <= com.firebase.client.Logger.Level.DEBUG.ordinal();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Logger logger>
	//    2    4:invokeinterface #106 <Method com.firebase.client.Logger$Level Logger.getLogLevel()>
	//    3    9:invokevirtual   #110 <Method int com.firebase.client.Logger$Level.ordinal()>
	//    4   12:getstatic       #84  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.DEBUG>
	//    5   15:invokevirtual   #110 <Method int com.firebase.client.Logger$Level.ordinal()>
	//    6   18:icmpgt          23
	//    7   21:iconst_1        
	//    8   22:ireturn         
	//    9   23:iconst_0        
	//   10   24:ireturn         
	}

	public void warn(String s)
	{
		warn(s, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #113 <Method void warn(String, Throwable)>
	//    4    6:return          
	}

	public void warn(String s, Throwable throwable)
	{
		s = toLog(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method String toLog(String)>
	//    3    5:astore_1        
		if(throwable != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          48
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #59  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #60  <Method void StringBuilder()>
	//    9   17:astore_3        
			stringbuilder.append(s);
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
			stringbuilder.append("\n");
	//   14   24:aload_3         
	//   15   25:ldc1            #76  <String "\n">
	//   16   27:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			stringbuilder.append(exceptionStacktrace(throwable));
	//   18   31:aload_3         
	//   19   32:aload_2         
	//   20   33:invokestatic    #78  <Method String exceptionStacktrace(Throwable)>
	//   21   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
			s = stringbuilder.toString();
	//   23   40:aload_3         
	//   24   41:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   25   44:astore_1        
		}
	//*  26   45:goto            48
		logger.onLogMessage(com.firebase.client.Logger.Level.WARN, component, s, now());
	//   27   48:aload_0         
	//   28   49:getfield        #24  <Field Logger logger>
	//   29   52:getstatic       #116 <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.WARN>
	//   30   55:aload_0         
	//   31   56:getfield        #26  <Field String component>
	//   32   59:aload_1         
	//   33   60:aload_0         
	//   34   61:invokespecial   #86  <Method long now()>
	//   35   64:invokeinterface #92  <Method void Logger.onLogMessage(com.firebase.client.Logger$Level, String, String, long)>
	//   36   69:return          
	}

	static final boolean $assertionsDisabled = false;
	private final String component;
	private final Logger logger;
	private final String prefix;

	static 
	{
	//    0    0:return          
	}
}
