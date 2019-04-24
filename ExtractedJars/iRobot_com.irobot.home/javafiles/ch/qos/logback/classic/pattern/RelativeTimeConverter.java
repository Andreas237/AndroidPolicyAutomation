// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerContextVO;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class RelativeTimeConverter extends ClassicConverter
{

	public RelativeTimeConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ClassicConverter()>
		lastTimestamp = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #13  <Long -1L>
	//    4    8:putfield        #16  <Field long lastTimestamp>
		timesmapCache = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #18  <Field String timesmapCache>
	//    8   16:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		long l = iloggingevent.getTimeStamp();
	//    0    0:aload_1         
	//    1    1:invokeinterface #27  <Method long ILoggingEvent.getTimeStamp()>
	//    2    6:lstore_2        
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(l != lastTimestamp)
	//*   5    9:lload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #16  <Field long lastTimestamp>
	//*   8   14:lcmp            
	//*   9   15:ifeq            41
		{
			lastTimestamp = l;
	//   10   18:aload_0         
	//   11   19:lload_2         
	//   12   20:putfield        #16  <Field long lastTimestamp>
			timesmapCache = Long.toString(l - iloggingevent.getLoggerContextVO().getBirthTime());
	//   13   23:aload_0         
	//   14   24:lload_2         
	//   15   25:aload_1         
	//   16   26:invokeinterface #31  <Method LoggerContextVO ILoggingEvent.getLoggerContextVO()>
	//   17   31:invokevirtual   #36  <Method long LoggerContextVO.getBirthTime()>
	//   18   34:lsub            
	//   19   35:invokestatic    #42  <Method String Long.toString(long)>
	//   20   38:putfield        #18  <Field String timesmapCache>
		}
		iloggingevent = ((ILoggingEvent) (timesmapCache));
	//   21   41:aload_0         
	//   22   42:getfield        #18  <Field String timesmapCache>
	//   23   45:astore_1        
		this;
	//   24   46:aload_0         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		return ((String) (iloggingevent));
	//   26   48:aload_1         
	//   27   49:areturn         
		iloggingevent;
	//   28   50:astore_1        
		this;
	//   29   51:aload_0         
		JVM INSTR monitorexit ;
	//   30   52:monitorexit     
		throw iloggingevent;
	//   31   53:aload_1         
	//   32   54:athrow          
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ILoggingEvent>
	//    3    5:invokevirtual   #45  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	long lastTimestamp;
	String timesmapCache;
}
