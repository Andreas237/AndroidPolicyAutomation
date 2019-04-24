// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import java.io.*;
import java.util.Map;
import org.slf4j.Marker;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

// Referenced classes of package ch.qos.logback.classic.spi:
//			ILoggingEvent, ThrowableProxyVO, LoggerContextVO, IThrowableProxy

public class LoggingEventVO
	implements ILoggingEvent, Serializable
{

	public LoggingEventVO()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	public static LoggingEventVO build(ILoggingEvent iloggingevent)
	{
		LoggingEventVO loggingeventvo = new LoggingEventVO();
	//    0    0:new             #2   <Class LoggingEventVO>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void LoggingEventVO()>
	//    3    7:astore_1        
		loggingeventvo.loggerName = iloggingevent.getLoggerName();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #50  <Method String ILoggingEvent.getLoggerName()>
	//    7   15:putfield        #52  <Field String loggerName>
		loggingeventvo.loggerContextVO = iloggingevent.getLoggerContextVO();
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:invokeinterface #56  <Method LoggerContextVO ILoggingEvent.getLoggerContextVO()>
	//   11   25:putfield        #58  <Field LoggerContextVO loggerContextVO>
		loggingeventvo.threadName = iloggingevent.getThreadName();
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:invokeinterface #61  <Method String ILoggingEvent.getThreadName()>
	//   15   35:putfield        #63  <Field String threadName>
		loggingeventvo.level = iloggingevent.getLevel();
	//   16   38:aload_1         
	//   17   39:aload_0         
	//   18   40:invokeinterface #67  <Method Level ILoggingEvent.getLevel()>
	//   19   45:putfield        #69  <Field Level level>
		loggingeventvo.message = iloggingevent.getMessage();
	//   20   48:aload_1         
	//   21   49:aload_0         
	//   22   50:invokeinterface #72  <Method String ILoggingEvent.getMessage()>
	//   23   55:putfield        #74  <Field String message>
		loggingeventvo.argumentArray = iloggingevent.getArgumentArray();
	//   24   58:aload_1         
	//   25   59:aload_0         
	//   26   60:invokeinterface #78  <Method Object[] ILoggingEvent.getArgumentArray()>
	//   27   65:putfield        #80  <Field Object[] argumentArray>
		loggingeventvo.marker = iloggingevent.getMarker();
	//   28   68:aload_1         
	//   29   69:aload_0         
	//   30   70:invokeinterface #84  <Method Marker ILoggingEvent.getMarker()>
	//   31   75:putfield        #86  <Field Marker marker>
		loggingeventvo.mdcPropertyMap = iloggingevent.getMDCPropertyMap();
	//   32   78:aload_1         
	//   33   79:aload_0         
	//   34   80:invokeinterface #90  <Method Map ILoggingEvent.getMDCPropertyMap()>
	//   35   85:putfield        #92  <Field Map mdcPropertyMap>
		loggingeventvo.timeStamp = iloggingevent.getTimeStamp();
	//   36   88:aload_1         
	//   37   89:aload_0         
	//   38   90:invokeinterface #96  <Method long ILoggingEvent.getTimeStamp()>
	//   39   95:putfield        #98  <Field long timeStamp>
		loggingeventvo.throwableProxy = ThrowableProxyVO.build(iloggingevent.getThrowableProxy());
	//   40   98:aload_1         
	//   41   99:aload_0         
	//   42  100:invokeinterface #102 <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//   43  105:invokestatic    #107 <Method ThrowableProxyVO ThrowableProxyVO.build(IThrowableProxy)>
	//   44  108:putfield        #109 <Field ThrowableProxyVO throwableProxy>
		if(iloggingevent.hasCallerData())
	//*  45  111:aload_0         
	//*  46  112:invokeinterface #113 <Method boolean ILoggingEvent.hasCallerData()>
	//*  47  117:ifeq            130
			loggingeventvo.callerDataArray = iloggingevent.getCallerData();
	//   48  120:aload_1         
	//   49  121:aload_0         
	//   50  122:invokeinterface #117 <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//   51  127:putfield        #119 <Field StackTraceElement[] callerDataArray>
		return loggingeventvo;
	//   52  130:aload_1         
	//   53  131:areturn         
	}

	private void readObject(ObjectInputStream objectinputstream)
	{
		objectinputstream.defaultReadObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #126 <Method void ObjectInputStream.defaultReadObject()>
		level = Level.toLevel(objectinputstream.readInt());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #130 <Method int ObjectInputStream.readInt()>
	//    5    9:invokestatic    #136 <Method Level Level.toLevel(int)>
	//    6   12:putfield        #69  <Field Level level>
		int j = objectinputstream.readInt();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #130 <Method int ObjectInputStream.readInt()>
	//    9   19:istore_3        
		if(j != -1)
	//*  10   20:iload_3         
	//*  11   21:iconst_m1       
	//*  12   22:icmpeq          71
		{
			argumentArray = ((Object []) (new String[j]));
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:anewarray       String[]
	//   16   30:putfield        #80  <Field Object[] argumentArray>
			for(int i = 0; i < j; i++)
	//*  17   33:iconst_0        
	//*  18   34:istore_2        
	//*  19   35:iload_2         
	//*  20   36:iload_3         
	//*  21   37:icmpge          71
			{
				Object obj = objectinputstream.readObject();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #141 <Method Object ObjectInputStream.readObject()>
	//   24   44:astore          4
				if(!"NULL_ARGUMENT_ARRAY_ELEMENT".equals(obj))
	//*  25   46:ldc1            #14  <String "NULL_ARGUMENT_ARRAY_ELEMENT">
	//*  26   48:aload           4
	//*  27   50:invokevirtual   #145 <Method boolean String.equals(Object)>
	//*  28   53:ifne            64
					argumentArray[i] = obj;
	//   29   56:aload_0         
	//   30   57:getfield        #80  <Field Object[] argumentArray>
	//   31   60:iload_2         
	//   32   61:aload           4
	//   33   63:aastore         
			}

	//   34   64:iload_2         
	//   35   65:iconst_1        
	//   36   66:iadd            
	//   37   67:istore_2        
		}
	//*  38   68:goto            35
	//   39   71:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
	{
		objectoutputstream.defaultWriteObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #152 <Method void ObjectOutputStream.defaultWriteObject()>
		objectoutputstream.writeInt(level.levelInt);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field Level level>
	//    5    9:getfield        #155 <Field int Level.levelInt>
	//    6   12:invokevirtual   #159 <Method void ObjectOutputStream.writeInt(int)>
		if(argumentArray != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #80  <Field Object[] argumentArray>
	//*   9   19:ifnull          82
		{
			objectoutputstream.writeInt(argumentArray.length);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #80  <Field Object[] argumentArray>
	//   13   27:arraylength     
	//   14   28:invokevirtual   #159 <Method void ObjectOutputStream.writeInt(int)>
			String s;
			for(int i = 0; i < argumentArray.length; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_2        
	//*  17   33:iload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #80  <Field Object[] argumentArray>
	//*  20   38:arraylength     
	//*  21   39:icmpge          87
			{
				if(argumentArray[i] != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #80  <Field Object[] argumentArray>
	//*  24   46:iload_2         
	//*  25   47:aaload          
	//*  26   48:ifnull          69
					s = argumentArray[i].toString();
	//   27   51:aload_0         
	//   28   52:getfield        #80  <Field Object[] argumentArray>
	//   29   55:iload_2         
	//   30   56:aaload          
	//   31   57:invokevirtual   #162 <Method String Object.toString()>
	//   32   60:astore_3        
				else
	//*  33   61:aload_1         
	//*  34   62:aload_3         
	//*  35   63:invokevirtual   #165 <Method void ObjectOutputStream.writeObject(Object)>
	//*  36   66:goto            75
					s = "NULL_ARGUMENT_ARRAY_ELEMENT";
	//   37   69:ldc1            #14  <String "NULL_ARGUMENT_ARRAY_ELEMENT">
	//   38   71:astore_3        
				objectoutputstream.writeObject(((Object) (s)));
			}

	//   39   72:goto            61
	//   40   75:iload_2         
	//   41   76:iconst_1        
	//   42   77:iadd            
	//   43   78:istore_2        
		} else
	//*  44   79:goto            33
		{
			objectoutputstream.writeInt(-1);
	//   45   82:aload_1         
	//   46   83:iconst_m1       
	//   47   84:invokevirtual   #159 <Method void ObjectOutputStream.writeInt(int)>
		}
	//   48   87:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #169 <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #169 <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((LoggingEventVO)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class LoggingEventVO>
	//   18   30:astore_1        
		if(message == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #74  <Field String message>
	//*  21   35:ifnonnull       47
		{
			if(((LoggingEventVO) (obj)).message != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #74  <Field String message>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!message.equals(((Object) (((LoggingEventVO) (obj)).message))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #74  <Field String message>
	//*  29   51:aload_1         
	//*  30   52:getfield        #74  <Field String message>
	//*  31   55:invokevirtual   #145 <Method boolean String.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(loggerName == null)
	//*  35   63:aload_0         
	//*  36   64:getfield        #52  <Field String loggerName>
	//*  37   67:ifnonnull       79
		{
			if(((LoggingEventVO) (obj)).loggerName != null)
	//*  38   70:aload_1         
	//*  39   71:getfield        #52  <Field String loggerName>
	//*  40   74:ifnull          95
				return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		} else
		if(!loggerName.equals(((Object) (((LoggingEventVO) (obj)).loggerName))))
	//*  43   79:aload_0         
	//*  44   80:getfield        #52  <Field String loggerName>
	//*  45   83:aload_1         
	//*  46   84:getfield        #52  <Field String loggerName>
	//*  47   87:invokevirtual   #145 <Method boolean String.equals(Object)>
	//*  48   90:ifne            95
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		if(threadName == null)
	//*  51   95:aload_0         
	//*  52   96:getfield        #63  <Field String threadName>
	//*  53   99:ifnonnull       111
		{
			if(((LoggingEventVO) (obj)).threadName != null)
	//*  54  102:aload_1         
	//*  55  103:getfield        #63  <Field String threadName>
	//*  56  106:ifnull          127
				return false;
	//   57  109:iconst_0        
	//   58  110:ireturn         
		} else
		if(!threadName.equals(((Object) (((LoggingEventVO) (obj)).threadName))))
	//*  59  111:aload_0         
	//*  60  112:getfield        #63  <Field String threadName>
	//*  61  115:aload_1         
	//*  62  116:getfield        #63  <Field String threadName>
	//*  63  119:invokevirtual   #145 <Method boolean String.equals(Object)>
	//*  64  122:ifne            127
			return false;
	//   65  125:iconst_0        
	//   66  126:ireturn         
		if(timeStamp != ((LoggingEventVO) (obj)).timeStamp)
	//*  67  127:aload_0         
	//*  68  128:getfield        #98  <Field long timeStamp>
	//*  69  131:aload_1         
	//*  70  132:getfield        #98  <Field long timeStamp>
	//*  71  135:lcmp            
	//*  72  136:ifeq            141
			return false;
	//   73  139:iconst_0        
	//   74  140:ireturn         
		if(marker == null)
	//*  75  141:aload_0         
	//*  76  142:getfield        #86  <Field Marker marker>
	//*  77  145:ifnonnull       157
		{
			if(((LoggingEventVO) (obj)).marker != null)
	//*  78  148:aload_1         
	//*  79  149:getfield        #86  <Field Marker marker>
	//*  80  152:ifnull          175
				return false;
	//   81  155:iconst_0        
	//   82  156:ireturn         
		} else
		if(!marker.equals(((Object) (((LoggingEventVO) (obj)).marker))))
	//*  83  157:aload_0         
	//*  84  158:getfield        #86  <Field Marker marker>
	//*  85  161:aload_1         
	//*  86  162:getfield        #86  <Field Marker marker>
	//*  87  165:invokeinterface #172 <Method boolean Marker.equals(Object)>
	//*  88  170:ifne            175
			return false;
	//   89  173:iconst_0        
	//   90  174:ireturn         
		if(mdcPropertyMap == null)
	//*  91  175:aload_0         
	//*  92  176:getfield        #92  <Field Map mdcPropertyMap>
	//*  93  179:ifnonnull       191
		{
			if(((LoggingEventVO) (obj)).mdcPropertyMap != null)
	//*  94  182:aload_1         
	//*  95  183:getfield        #92  <Field Map mdcPropertyMap>
	//*  96  186:ifnull          209
				return false;
	//   97  189:iconst_0        
	//   98  190:ireturn         
		} else
		if(!mdcPropertyMap.equals(((Object) (((LoggingEventVO) (obj)).mdcPropertyMap))))
	//*  99  191:aload_0         
	//* 100  192:getfield        #92  <Field Map mdcPropertyMap>
	//* 101  195:aload_1         
	//* 102  196:getfield        #92  <Field Map mdcPropertyMap>
	//* 103  199:invokeinterface #175 <Method boolean Map.equals(Object)>
	//* 104  204:ifne            209
			return false;
	//  105  207:iconst_0        
	//  106  208:ireturn         
		return true;
	//  107  209:iconst_1        
	//  108  210:ireturn         
	}

	public Object[] getArgumentArray()
	{
		return argumentArray;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Object[] argumentArray>
	//    2    4:areturn         
	}

	public StackTraceElement[] getCallerData()
	{
		return callerDataArray;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field StackTraceElement[] callerDataArray>
	//    2    4:areturn         
	}

	public long getContextBirthTime()
	{
		return loggerContextVO.getBirthTime();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field LoggerContextVO loggerContextVO>
	//    2    4:invokevirtual   #181 <Method long LoggerContextVO.getBirthTime()>
	//    3    7:lreturn         
	}

	public LoggerContextVO getContextLoggerRemoteView()
	{
		return loggerContextVO;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field LoggerContextVO loggerContextVO>
	//    2    4:areturn         
	}

	public String getFormattedMessage()
	{
		if(formattedMessage != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field String formattedMessage>
	//*   2    4:ifnull          12
			return formattedMessage;
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field String formattedMessage>
	//    5   11:areturn         
		String s;
		if(argumentArray != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #80  <Field Object[] argumentArray>
	//*   8   16:ifnull          42
			s = MessageFormatter.arrayFormat(message, argumentArray).getMessage();
	//    9   19:aload_0         
	//   10   20:getfield        #74  <Field String message>
	//   11   23:aload_0         
	//   12   24:getfield        #80  <Field Object[] argumentArray>
	//   13   27:invokestatic    #191 <Method FormattingTuple MessageFormatter.arrayFormat(String, Object[])>
	//   14   30:invokevirtual   #194 <Method String FormattingTuple.getMessage()>
	//   15   33:astore_1        
		else
	//*  16   34:aload_0         
	//*  17   35:aload_1         
	//*  18   36:putfield        #185 <Field String formattedMessage>
	//*  19   39:goto            50
			s = message;
	//   20   42:aload_0         
	//   21   43:getfield        #74  <Field String message>
	//   22   46:astore_1        
		formattedMessage = s;
	//*  23   47:goto            34
		return formattedMessage;
	//   24   50:aload_0         
	//   25   51:getfield        #185 <Field String formattedMessage>
	//   26   54:areturn         
	}

	public Level getLevel()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Level level>
	//    2    4:areturn         
	}

	public LoggerContextVO getLoggerContextVO()
	{
		return loggerContextVO;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field LoggerContextVO loggerContextVO>
	//    2    4:areturn         
	}

	public String getLoggerName()
	{
		return loggerName;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String loggerName>
	//    2    4:areturn         
	}

	public Map getMDCPropertyMap()
	{
		return mdcPropertyMap;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Map mdcPropertyMap>
	//    2    4:areturn         
	}

	public Marker getMarker()
	{
		return marker;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Marker marker>
	//    2    4:areturn         
	}

	public Map getMdc()
	{
		return mdcPropertyMap;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Map mdcPropertyMap>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String message>
	//    2    4:areturn         
	}

	public String getThreadName()
	{
		return threadName;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String threadName>
	//    2    4:areturn         
	}

	public IThrowableProxy getThrowableProxy()
	{
		return ((IThrowableProxy) (throwableProxy));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field ThrowableProxyVO throwableProxy>
	//    2    4:areturn         
	}

	public long getTimeStamp()
	{
		return timeStamp;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field long timeStamp>
	//    2    4:lreturn         
	}

	public boolean hasCallerData()
	{
		return callerDataArray != null;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field StackTraceElement[] callerDataArray>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		String s = message;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String message>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(s == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       16
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		else
	//*   9   13:goto            24
			i = message.hashCode();
	//   10   16:aload_0         
	//   11   17:getfield        #74  <Field String message>
	//   12   20:invokevirtual   #200 <Method int String.hashCode()>
	//   13   23:istore_1        
		if(threadName != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #63  <Field String threadName>
	//*  16   28:ifnonnull       34
	//*  17   31:goto            42
			j = threadName.hashCode();
	//   18   34:aload_0         
	//   19   35:getfield        #63  <Field String threadName>
	//   20   38:invokevirtual   #200 <Method int String.hashCode()>
	//   21   41:istore_2        
		return ((i + 31) * 31 + j) * 31 + (int)(timeStamp ^ timeStamp >>> 32);
	//   22   42:iload_1         
	//   23   43:bipush          31
	//   24   45:iadd            
	//   25   46:bipush          31
	//   26   48:imul            
	//   27   49:iload_2         
	//   28   50:iadd            
	//   29   51:bipush          31
	//   30   53:imul            
	//   31   54:aload_0         
	//   32   55:getfield        #98  <Field long timeStamp>
	//   33   58:aload_0         
	//   34   59:getfield        #98  <Field long timeStamp>
	//   35   62:bipush          32
	//   36   64:lushr           
	//   37   65:lxor            
	//   38   66:l2i             
	//   39   67:iadd            
	//   40   68:ireturn         
	}

	public void prepareForDeferredProcessing()
	{
	//    0    0:return          
	}

	private static final int NULL_ARGUMENT_ARRAY = -1;
	private static final String NULL_ARGUMENT_ARRAY_ELEMENT = "NULL_ARGUMENT_ARRAY_ELEMENT";
	private static final long serialVersionUID = 0xfcec0a48L;
	private transient Object argumentArray[];
	private StackTraceElement callerDataArray[];
	private transient String formattedMessage;
	private transient Level level;
	private LoggerContextVO loggerContextVO;
	private String loggerName;
	private Marker marker;
	private Map mdcPropertyMap;
	private String message;
	private String threadName;
	private ThrowableProxyVO throwableProxy;
	private long timeStamp;
}
