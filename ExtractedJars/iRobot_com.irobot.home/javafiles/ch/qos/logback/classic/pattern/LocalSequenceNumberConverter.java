// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class LocalSequenceNumberConverter extends ClassicConverter
{

	public LocalSequenceNumberConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ClassicConverter()>
		sequenceNumber = new AtomicLong(System.currentTimeMillis());
	//    2    4:aload_0         
	//    3    5:new             #12  <Class AtomicLong>
	//    4    8:dup             
	//    5    9:invokestatic    #18  <Method long System.currentTimeMillis()>
	//    6   12:invokespecial   #21  <Method void AtomicLong(long)>
	//    7   15:putfield        #23  <Field AtomicLong sequenceNumber>
	//    8   18:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		return Long.toString(sequenceNumber.getAndIncrement());
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AtomicLong sequenceNumber>
	//    2    4:invokevirtual   #29  <Method long AtomicLong.getAndIncrement()>
	//    3    7:invokestatic    #35  <Method String Long.toString(long)>
	//    4   10:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class ILoggingEvent>
	//    3    5:invokevirtual   #40  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	AtomicLong sequenceNumber;
}
