// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.*;
import ch.qos.logback.classic.util.LogbackMDCAdapter;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.spi.MDCAdapter;

// Referenced classes of package ch.qos.logback.classic.spi:
//			ILoggingEvent, ThrowableProxy, EventArgUtil, CallerData, 
//			LoggerContextVO, IThrowableProxy

public class LoggingEvent
	implements ILoggingEvent
{

	public LoggingEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public LoggingEvent(String s, Logger logger, Level level1, String s1, Throwable throwable, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		fqnOfLoggerClass = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field String fqnOfLoggerClass>
		loggerName = logger.getName();
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #52  <Method String Logger.getName()>
	//    8   14:putfield        #54  <Field String loggerName>
		loggerContext = logger.getLoggerContext();
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #58  <Method LoggerContext Logger.getLoggerContext()>
	//   12   22:putfield        #60  <Field LoggerContext loggerContext>
		loggerContextVO = loggerContext.getLoggerContextRemoteView();
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field LoggerContext loggerContext>
	//   16   30:invokevirtual   #66  <Method LoggerContextVO LoggerContext.getLoggerContextRemoteView()>
	//   17   33:putfield        #68  <Field LoggerContextVO loggerContextVO>
		level = level1;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #70  <Field Level level>
		message = s1;
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:putfield        #72  <Field String message>
		argumentArray = aobj;
	//   24   47:aload_0         
	//   25   48:aload           6
	//   26   50:putfield        #74  <Field Object[] argumentArray>
		s = ((String) (throwable));
	//   27   53:aload           5
	//   28   55:astore_1        
		if(throwable == null)
	//*  29   56:aload           5
	//*  30   58:ifnonnull       68
			s = ((String) (extractThrowableAnRearrangeArguments(aobj)));
	//   31   61:aload_0         
	//   32   62:aload           6
	//   33   64:invokespecial   #78  <Method Throwable extractThrowableAnRearrangeArguments(Object[])>
	//   34   67:astore_1        
		if(s != null)
	//*  35   68:aload_1         
	//*  36   69:ifnull          101
		{
			throwableProxy = new ThrowableProxy(((Throwable) (s)));
	//   37   72:aload_0         
	//   38   73:new             #80  <Class ThrowableProxy>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:invokespecial   #83  <Method void ThrowableProxy(Throwable)>
	//   42   81:putfield        #85  <Field ThrowableProxy throwableProxy>
			if(logger.getLoggerContext().isPackagingDataEnabled())
	//*  43   84:aload_2         
	//*  44   85:invokevirtual   #58  <Method LoggerContext Logger.getLoggerContext()>
	//*  45   88:invokevirtual   #89  <Method boolean LoggerContext.isPackagingDataEnabled()>
	//*  46   91:ifeq            101
				throwableProxy.calculatePackagingData();
	//   47   94:aload_0         
	//   48   95:getfield        #85  <Field ThrowableProxy throwableProxy>
	//   49   98:invokevirtual   #92  <Method void ThrowableProxy.calculatePackagingData()>
		}
		timeStamp = System.currentTimeMillis();
	//   50  101:aload_0         
	//   51  102:invokestatic    #98  <Method long System.currentTimeMillis()>
	//   52  105:putfield        #100 <Field long timeStamp>
	//   53  108:return          
	}

	private Throwable extractThrowableAnRearrangeArguments(Object aobj[])
	{
		Throwable throwable = EventArgUtil.extractThrowable(aobj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #105 <Method Throwable EventArgUtil.extractThrowable(Object[])>
	//    2    4:astore_2        
		if(EventArgUtil.successfulExtraction(throwable))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #109 <Method boolean EventArgUtil.successfulExtraction(Throwable)>
	//*   5    9:ifeq            20
			argumentArray = EventArgUtil.trimmedCopy(aobj);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #113 <Method Object[] EventArgUtil.trimmedCopy(Object[])>
	//    9   17:putfield        #74  <Field Object[] argumentArray>
		return throwable;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
	{
		objectoutputstream = ((ObjectOutputStream) (new StringBuilder()));
	//    0    0:new             #117 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #118 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (objectoutputstream)).append(((Object) (((Object)this).getClass())));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #122 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		((StringBuilder) (objectoutputstream)).append(" does not support serialization. ");
	//    9   17:aload_1         
	//   10   18:ldc1            #128 <String " does not support serialization. ">
	//   11   20:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		((StringBuilder) (objectoutputstream)).append("Use LoggerEventVO instance instead. See also LoggerEventVO.build method.");
	//   13   24:aload_1         
	//   14   25:ldc1            #133 <String "Use LoggerEventVO instance instead. See also LoggerEventVO.build method.">
	//   15   27:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		throw new UnsupportedOperationException(((StringBuilder) (objectoutputstream)).toString());
	//   17   31:new             #135 <Class UnsupportedOperationException>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #141 <Method void UnsupportedOperationException(String)>
	//   22   42:athrow          
	}

	public Object[] getArgumentArray()
	{
		return argumentArray;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Object[] argumentArray>
	//    2    4:areturn         
	}

	public StackTraceElement[] getCallerData()
	{
		if(callerDataArray == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field StackTraceElement[] callerDataArray>
	//*   2    4:ifnonnull       39
			callerDataArray = CallerData.extract(new Throwable(), fqnOfLoggerClass, loggerContext.getMaxCallerDataDepth(), loggerContext.getFrameworkPackages());
	//    3    7:aload_0         
	//    4    8:new             #149 <Class Throwable>
	//    5   11:dup             
	//    6   12:invokespecial   #150 <Method void Throwable()>
	//    7   15:aload_0         
	//    8   16:getfield        #46  <Field String fqnOfLoggerClass>
	//    9   19:aload_0         
	//   10   20:getfield        #60  <Field LoggerContext loggerContext>
	//   11   23:invokevirtual   #154 <Method int LoggerContext.getMaxCallerDataDepth()>
	//   12   26:aload_0         
	//   13   27:getfield        #60  <Field LoggerContext loggerContext>
	//   14   30:invokevirtual   #158 <Method java.util.List LoggerContext.getFrameworkPackages()>
	//   15   33:invokestatic    #164 <Method StackTraceElement[] CallerData.extract(Throwable, String, int, java.util.List)>
	//   16   36:putfield        #147 <Field StackTraceElement[] callerDataArray>
		return callerDataArray;
	//   17   39:aload_0         
	//   18   40:getfield        #147 <Field StackTraceElement[] callerDataArray>
	//   19   43:areturn         
	}

	public long getContextBirthTime()
	{
		return loggerContextVO.getBirthTime();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field LoggerContextVO loggerContextVO>
	//    2    4:invokevirtual   #170 <Method long LoggerContextVO.getBirthTime()>
	//    3    7:lreturn         
	}

	public String getFormattedMessage()
	{
		if(formattedMessage != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field String formattedMessage>
	//*   2    4:ifnull          12
			return formattedMessage;
	//    3    7:aload_0         
	//    4    8:getfield        #173 <Field String formattedMessage>
	//    5   11:areturn         
		String s;
		if(argumentArray != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #74  <Field Object[] argumentArray>
	//*   8   16:ifnull          42
			s = MessageFormatter.arrayFormat(message, argumentArray).getMessage();
	//    9   19:aload_0         
	//   10   20:getfield        #72  <Field String message>
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field Object[] argumentArray>
	//   13   27:invokestatic    #179 <Method FormattingTuple MessageFormatter.arrayFormat(String, Object[])>
	//   14   30:invokevirtual   #184 <Method String FormattingTuple.getMessage()>
	//   15   33:astore_1        
		else
	//*  16   34:aload_0         
	//*  17   35:aload_1         
	//*  18   36:putfield        #173 <Field String formattedMessage>
	//*  19   39:goto            50
			s = message;
	//   20   42:aload_0         
	//   21   43:getfield        #72  <Field String message>
	//   22   46:astore_1        
		formattedMessage = s;
	//*  23   47:goto            34
		return formattedMessage;
	//   24   50:aload_0         
	//   25   51:getfield        #173 <Field String formattedMessage>
	//   26   54:areturn         
	}

	public Level getLevel()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Level level>
	//    2    4:areturn         
	}

	public LoggerContextVO getLoggerContextVO()
	{
		return loggerContextVO;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field LoggerContextVO loggerContextVO>
	//    2    4:areturn         
	}

	public String getLoggerName()
	{
		return loggerName;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String loggerName>
	//    2    4:areturn         
	}

	public Map getMDCPropertyMap()
	{
		if(mdcPropertyMap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field Map mdcPropertyMap>
	//*   2    4:ifnonnull       44
		{
			Object obj = ((Object) (MDC.getMDCAdapter()));
	//    3    7:invokestatic    #198 <Method MDCAdapter MDC.getMDCAdapter()>
	//    4   10:astore_1        
			if(obj instanceof LogbackMDCAdapter)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #200 <Class LogbackMDCAdapter>
	//*   7   15:ifeq            34
				obj = ((Object) (((LogbackMDCAdapter)obj).getPropertyMap()));
	//    8   18:aload_1         
	//    9   19:checkcast       #200 <Class LogbackMDCAdapter>
	//   10   22:invokevirtual   #203 <Method Map LogbackMDCAdapter.getPropertyMap()>
	//   11   25:astore_1        
			else
	//*  12   26:aload_0         
	//*  13   27:aload_1         
	//*  14   28:putfield        #192 <Field Map mdcPropertyMap>
	//*  15   31:goto            44
				obj = ((Object) (((MDCAdapter) (obj)).getCopyOfContextMap()));
	//   16   34:aload_1         
	//   17   35:invokeinterface #208 <Method Map MDCAdapter.getCopyOfContextMap()>
	//   18   40:astore_1        
			mdcPropertyMap = ((Map) (obj));
		}
	//*  19   41:goto            26
		if(mdcPropertyMap == null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #192 <Field Map mdcPropertyMap>
	//*  22   48:ifnonnull       58
			mdcPropertyMap = CACHED_NULL_MAP;
	//   23   51:aload_0         
	//   24   52:getstatic       #41  <Field Map CACHED_NULL_MAP>
	//   25   55:putfield        #192 <Field Map mdcPropertyMap>
		return mdcPropertyMap;
	//   26   58:aload_0         
	//   27   59:getfield        #192 <Field Map mdcPropertyMap>
	//   28   62:areturn         
	}

	public Marker getMarker()
	{
		return marker;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field Marker marker>
	//    2    4:areturn         
	}

	public Map getMdc()
	{
		return getMDCPropertyMap();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method Map getMDCPropertyMap()>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String message>
	//    2    4:areturn         
	}

	public String getThreadName()
	{
		if(threadName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field String threadName>
	//*   2    4:ifnonnull       17
			threadName = Thread.currentThread().getName();
	//    3    7:aload_0         
	//    4    8:invokestatic    #226 <Method Thread Thread.currentThread()>
	//    5   11:invokevirtual   #227 <Method String Thread.getName()>
	//    6   14:putfield        #220 <Field String threadName>
		return threadName;
	//    7   17:aload_0         
	//    8   18:getfield        #220 <Field String threadName>
	//    9   21:areturn         
	}

	public IThrowableProxy getThrowableProxy()
	{
		return ((IThrowableProxy) (throwableProxy));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ThrowableProxy throwableProxy>
	//    2    4:areturn         
	}

	public long getTimeStamp()
	{
		return timeStamp;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field long timeStamp>
	//    2    4:lreturn         
	}

	public boolean hasCallerData()
	{
		return callerDataArray != null;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field StackTraceElement[] callerDataArray>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void prepareForDeferredProcessing()
	{
		getFormattedMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #234 <Method String getFormattedMessage()>
	//    2    4:pop             
		getThreadName();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #236 <Method String getThreadName()>
	//    5    9:pop             
		getMDCPropertyMap();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #217 <Method Map getMDCPropertyMap()>
	//    8   14:pop             
	//    9   15:return          
	}

	public void setArgumentArray(Object aobj[])
	{
		if(argumentArray != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Object[] argumentArray>
	//*   2    4:ifnull          17
		{
			throw new IllegalStateException("argArray has been already set");
	//    3    7:new             #240 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #242 <String "argArray has been already set">
	//    6   13:invokespecial   #243 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			argumentArray = aobj;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #74  <Field Object[] argumentArray>
			return;
	//   11   22:return          
		}
	}

	public void setCallerData(StackTraceElement astacktraceelement[])
	{
		callerDataArray = astacktraceelement;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field StackTraceElement[] callerDataArray>
	//    3    5:return          
	}

	public void setLevel(Level level1)
	{
		if(level != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Level level>
	//*   2    4:ifnull          17
		{
			throw new IllegalStateException("The level has been already set for this event.");
	//    3    7:new             #240 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #249 <String "The level has been already set for this event.">
	//    6   13:invokespecial   #243 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			level = level1;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #70  <Field Level level>
			return;
	//   11   22:return          
		}
	}

	public void setLoggerContextRemoteView(LoggerContextVO loggercontextvo)
	{
		loggerContextVO = loggercontextvo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field LoggerContextVO loggerContextVO>
	//    3    5:return          
	}

	public void setLoggerName(String s)
	{
		loggerName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String loggerName>
	//    3    5:return          
	}

	public void setMDCPropertyMap(Map map)
	{
		if(mdcPropertyMap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field Map mdcPropertyMap>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("The MDCPropertyMap has been already set for this event.");
	//    3    7:new             #240 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #256 <String "The MDCPropertyMap has been already set for this event.">
	//    6   14:invokespecial   #243 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mdcPropertyMap = map;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #192 <Field Map mdcPropertyMap>
			return;
	//   11   23:return          
		}
	}

	public void setMarker(Marker marker1)
	{
		if(marker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field Marker marker>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("The marker has been already set for this event.");
	//    3    7:new             #240 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #261 <String "The marker has been already set for this event.">
	//    6   14:invokespecial   #243 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			marker = marker1;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #214 <Field Marker marker>
			return;
	//   11   23:return          
		}
	}

	public void setMessage(String s)
	{
		if(message != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field String message>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("The message for this event has been set already.");
	//    3    7:new             #240 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #264 <String "The message for this event has been set already.">
	//    6   14:invokespecial   #243 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			message = s;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #72  <Field String message>
			return;
	//   11   23:return          
		}
	}

	public void setThreadName(String s)
	{
		if(threadName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field String threadName>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("threadName has been already set");
	//    3    7:new             #240 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #267 <String "threadName has been already set">
	//    6   14:invokespecial   #243 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			threadName = s;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #220 <Field String threadName>
			return;
	//   11   23:return          
		}
	}

	public void setThrowableProxy(ThrowableProxy throwableproxy)
	{
		if(throwableProxy != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field ThrowableProxy throwableProxy>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("ThrowableProxy has been already set.");
	//    3    7:new             #240 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #271 <String "ThrowableProxy has been already set.">
	//    6   14:invokespecial   #243 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			throwableProxy = throwableproxy;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #85  <Field ThrowableProxy throwableProxy>
			return;
	//   11   23:return          
		}
	}

	public void setTimeStamp(long l)
	{
		timeStamp = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #100 <Field long timeStamp>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #117 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #118 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append('[');
	//    4    8:aload_1         
	//    5    9:bipush          91
	//    6   11:invokevirtual   #276 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		stringbuilder.append(((Object) (level)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #70  <Field Level level>
	//   11   20:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append("] ");
	//   13   24:aload_1         
	//   14   25:ldc2            #278 <String "] ">
	//   15   28:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(getFormattedMessage());
	//   17   32:aload_1         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #234 <Method String getFormattedMessage()>
	//   20   37:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		return stringbuilder.toString();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   24   45:areturn         
	}

	private static final Map CACHED_NULL_MAP = new HashMap();
	private transient Object argumentArray[];
	private StackTraceElement callerDataArray[];
	transient String formattedMessage;
	transient String fqnOfLoggerClass;
	private transient Level level;
	private LoggerContext loggerContext;
	private LoggerContextVO loggerContextVO;
	private String loggerName;
	private Marker marker;
	private Map mdcPropertyMap;
	private String message;
	private String threadName;
	private ThrowableProxy throwableProxy;
	private long timeStamp;

	static 
	{
	//    0    0:new             #36  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void HashMap()>
	//    3    7:putstatic       #41  <Field Map CACHED_NULL_MAP>
	//*   4   10:return          
	}
}
