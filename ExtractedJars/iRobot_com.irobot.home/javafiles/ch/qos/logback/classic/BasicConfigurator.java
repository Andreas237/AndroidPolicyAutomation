// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import org.slf4j.LoggerFactory;

// Referenced classes of package ch.qos.logback.classic:
//			LoggerContext, Logger

public class BasicConfigurator
{

	private BasicConfigurator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static void configure(LoggerContext loggercontext)
	{
		Object obj = ((Object) (loggercontext.getStatusManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method StatusManager LoggerContext.getStatusManager()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
			((StatusManager) (obj)).add(((ch.qos.logback.core.status.Status) (new InfoStatus("Setting up default configuration.", ((Object) (loggercontext))))));
	//    5    9:aload_1         
	//    6   10:new             #26  <Class InfoStatus>
	//    7   13:dup             
	//    8   14:ldc1            #28  <String "Setting up default configuration.">
	//    9   16:aload_0         
	//   10   17:invokespecial   #31  <Method void InfoStatus(String, Object)>
	//   11   20:invokeinterface #37  <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
		obj = ((Object) (new ConsoleAppender()));
	//   12   25:new             #39  <Class ConsoleAppender>
	//   13   28:dup             
	//   14   29:invokespecial   #40  <Method void ConsoleAppender()>
	//   15   32:astore_1        
		((ConsoleAppender) (obj)).setContext(((ch.qos.logback.core.Context) (loggercontext)));
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:invokevirtual   #44  <Method void ConsoleAppender.setContext(ch.qos.logback.core.Context)>
		((ConsoleAppender) (obj)).setName("console");
	//   19   38:aload_1         
	//   20   39:ldc1            #46  <String "console">
	//   21   41:invokevirtual   #50  <Method void ConsoleAppender.setName(String)>
		PatternLayoutEncoder patternlayoutencoder = new PatternLayoutEncoder();
	//   22   44:new             #52  <Class PatternLayoutEncoder>
	//   23   47:dup             
	//   24   48:invokespecial   #53  <Method void PatternLayoutEncoder()>
	//   25   51:astore_2        
		patternlayoutencoder.setContext(((ch.qos.logback.core.Context) (loggercontext)));
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:invokevirtual   #54  <Method void PatternLayoutEncoder.setContext(ch.qos.logback.core.Context)>
		patternlayoutencoder.setPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
	//   29   57:aload_2         
	//   30   58:ldc1            #56  <String "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n">
	//   31   60:invokevirtual   #59  <Method void PatternLayoutEncoder.setPattern(String)>
		patternlayoutencoder.start();
	//   32   63:aload_2         
	//   33   64:invokevirtual   #62  <Method void PatternLayoutEncoder.start()>
		((ConsoleAppender) (obj)).setEncoder(((ch.qos.logback.core.encoder.Encoder) (patternlayoutencoder)));
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:invokevirtual   #66  <Method void ConsoleAppender.setEncoder(ch.qos.logback.core.encoder.Encoder)>
		((ConsoleAppender) (obj)).start();
	//   37   72:aload_1         
	//   38   73:invokevirtual   #67  <Method void ConsoleAppender.start()>
		loggercontext.getLogger("ROOT").addAppender(((ch.qos.logback.core.Appender) (obj)));
	//   39   76:aload_0         
	//   40   77:ldc1            #69  <String "ROOT">
	//   41   79:invokevirtual   #73  <Method Logger LoggerContext.getLogger(String)>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #79  <Method void Logger.addAppender(ch.qos.logback.core.Appender)>
	//   44   86:return          
	}

	public static void configureDefaultContext()
	{
		configure((LoggerContext)LoggerFactory.getILoggerFactory());
	//    0    0:invokestatic    #86  <Method org.slf4j.ILoggerFactory LoggerFactory.getILoggerFactory()>
	//    1    3:checkcast       #20  <Class LoggerContext>
	//    2    6:invokestatic    #88  <Method void configure(LoggerContext)>
	//    3    9:return          
	}

	static final BasicConfigurator hiddenSingleton = new BasicConfigurator();

	static 
	{
	//    0    0:new             #2   <Class BasicConfigurator>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void BasicConfigurator()>
	//    3    7:putstatic       #14  <Field BasicConfigurator hiddenSingleton>
	//*   4   10:return          
	}
}
