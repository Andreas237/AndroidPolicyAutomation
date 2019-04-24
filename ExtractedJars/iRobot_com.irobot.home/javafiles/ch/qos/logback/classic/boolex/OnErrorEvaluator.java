// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EventEvaluatorBase;

public class OnErrorEvaluator extends EventEvaluatorBase
{

	public OnErrorEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void EventEvaluatorBase()>
	//    2    4:return          
	}

	public boolean evaluate(ILoggingEvent iloggingevent)
	{
		return iloggingevent.getLevel().levelInt >= 40000;
	//    0    0:aload_1         
	//    1    1:invokeinterface #18  <Method Level ILoggingEvent.getLevel()>
	//    2    6:getfield        #24  <Field int Level.levelInt>
	//    3    9:ldc1            #25  <Int 40000>
	//    4   11:icmplt          16
	//    5   14:iconst_1        
	//    6   15:ireturn         
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class ILoggingEvent>
	//    3    5:invokevirtual   #28  <Method boolean evaluate(ILoggingEvent)>
	//    4    8:ireturn         
	}
}
