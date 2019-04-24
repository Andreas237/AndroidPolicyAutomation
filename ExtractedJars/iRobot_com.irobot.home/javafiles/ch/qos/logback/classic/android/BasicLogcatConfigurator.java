// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import org.slf4j.LoggerFactory;

// Referenced classes of package ch.qos.logback.classic.android:
//			LogcatAppender

public class BasicLogcatConfigurator
{

	private BasicLogcatConfigurator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void configure(LoggerContext loggercontext)
	{
		Object obj = ((Object) (loggercontext.getStatusManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method StatusManager LoggerContext.getStatusManager()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
			((StatusManager) (obj)).add(((ch.qos.logback.core.status.Status) (new InfoStatus("Setting up default configuration.", ((Object) (loggercontext))))));
	//    5    9:aload_1         
	//    6   10:new             #19  <Class InfoStatus>
	//    7   13:dup             
	//    8   14:ldc1            #21  <String "Setting up default configuration.">
	//    9   16:aload_0         
	//   10   17:invokespecial   #24  <Method void InfoStatus(String, Object)>
	//   11   20:invokeinterface #30  <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
		obj = ((Object) (new LogcatAppender()));
	//   12   25:new             #32  <Class LogcatAppender>
	//   13   28:dup             
	//   14   29:invokespecial   #33  <Method void LogcatAppender()>
	//   15   32:astore_1        
		((LogcatAppender) (obj)).setContext(((ch.qos.logback.core.Context) (loggercontext)));
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:invokevirtual   #37  <Method void LogcatAppender.setContext(ch.qos.logback.core.Context)>
		((LogcatAppender) (obj)).setName("logcat");
	//   19   38:aload_1         
	//   20   39:ldc1            #39  <String "logcat">
	//   21   41:invokevirtual   #43  <Method void LogcatAppender.setName(String)>
		PatternLayoutEncoder patternlayoutencoder = new PatternLayoutEncoder();
	//   22   44:new             #45  <Class PatternLayoutEncoder>
	//   23   47:dup             
	//   24   48:invokespecial   #46  <Method void PatternLayoutEncoder()>
	//   25   51:astore_2        
		patternlayoutencoder.setContext(((ch.qos.logback.core.Context) (loggercontext)));
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:invokevirtual   #47  <Method void PatternLayoutEncoder.setContext(ch.qos.logback.core.Context)>
		patternlayoutencoder.setPattern("%msg");
	//   29   57:aload_2         
	//   30   58:ldc1            #49  <String "%msg">
	//   31   60:invokevirtual   #52  <Method void PatternLayoutEncoder.setPattern(String)>
		patternlayoutencoder.start();
	//   32   63:aload_2         
	//   33   64:invokevirtual   #55  <Method void PatternLayoutEncoder.start()>
		((LogcatAppender) (obj)).setEncoder(patternlayoutencoder);
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:invokevirtual   #59  <Method void LogcatAppender.setEncoder(PatternLayoutEncoder)>
		((LogcatAppender) (obj)).start();
	//   37   72:aload_1         
	//   38   73:invokevirtual   #60  <Method void LogcatAppender.start()>
		loggercontext.getLogger("ROOT").addAppender(((ch.qos.logback.core.Appender) (obj)));
	//   39   76:aload_0         
	//   40   77:ldc1            #62  <String "ROOT">
	//   41   79:invokevirtual   #66  <Method Logger LoggerContext.getLogger(String)>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #72  <Method void Logger.addAppender(ch.qos.logback.core.Appender)>
	//   44   86:return          
	}

	public static void configureDefaultContext()
	{
		configure((LoggerContext)LoggerFactory.getILoggerFactory());
	//    0    0:invokestatic    #79  <Method org.slf4j.ILoggerFactory LoggerFactory.getILoggerFactory()>
	//    1    3:checkcast       #13  <Class LoggerContext>
	//    2    6:invokestatic    #81  <Method void configure(LoggerContext)>
	//    3    9:return          
	}
}
