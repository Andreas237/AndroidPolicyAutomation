// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.filter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class ThresholdFilter extends Filter
{

	public ThresholdFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Filter()>
	//    2    4:return          
	}

	public FilterReply decide(ILoggingEvent iloggingevent)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #18  <Method boolean isStarted()>
	//*   2    4:ifne            11
			return FilterReply.NEUTRAL;
	//    3    7:getstatic       #24  <Field FilterReply FilterReply.NEUTRAL>
	//    4   10:areturn         
		if(iloggingevent.getLevel().isGreaterOrEqual(level))
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #30  <Method Level ILoggingEvent.getLevel()>
	//*   7   17:aload_0         
	//*   8   18:getfield        #32  <Field Level level>
	//*   9   21:invokevirtual   #38  <Method boolean Level.isGreaterOrEqual(Level)>
	//*  10   24:ifeq            31
			return FilterReply.NEUTRAL;
	//   11   27:getstatic       #24  <Field FilterReply FilterReply.NEUTRAL>
	//   12   30:areturn         
		else
			return FilterReply.DENY;
	//   13   31:getstatic       #41  <Field FilterReply FilterReply.DENY>
	//   14   34:areturn         
	}

	public volatile FilterReply decide(Object obj)
	{
		return decide((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class ILoggingEvent>
	//    3    5:invokevirtual   #44  <Method FilterReply decide(ILoggingEvent)>
	//    4    8:areturn         
	}

	public void setLevel(String s)
	{
		level = Level.toLevel(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #50  <Method Level Level.toLevel(String)>
	//    3    5:putfield        #32  <Field Level level>
	//    4    8:return          
	}

	public void start()
	{
		if(level != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Level level>
	//*   2    4:ifnull          11
			super.start();
	//    3    7:aload_0         
	//    4    8:invokespecial   #53  <Method void Filter.start()>
	//    5   11:return          
	}

	Level level;
}
