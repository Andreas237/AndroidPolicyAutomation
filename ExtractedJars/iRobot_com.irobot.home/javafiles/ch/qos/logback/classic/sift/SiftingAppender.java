// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.sift.SiftingAppenderBase;
import org.slf4j.Marker;

public class SiftingAppender extends SiftingAppenderBase
{

	public SiftingAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void SiftingAppenderBase()>
	//    2    4:return          
	}

	protected boolean eventMarksEndOfLife(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getMarker()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #18  <Method Marker ILoggingEvent.getMarker()>
	//    2    6:astore_1        
		if(iloggingevent == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return ((Marker) (iloggingevent)).contains(ClassicConstants.FINALIZE_SESSION_MARKER);
	//    7   13:aload_1         
	//    8   14:getstatic       #24  <Field Marker ClassicConstants.FINALIZE_SESSION_MARKER>
	//    9   17:invokeinterface #30  <Method boolean Marker.contains(Marker)>
	//   10   22:ireturn         
	}

	protected volatile boolean eventMarksEndOfLife(Object obj)
	{
		return eventMarksEndOfLife((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class ILoggingEvent>
	//    3    5:invokevirtual   #33  <Method boolean eventMarksEndOfLife(ILoggingEvent)>
	//    4    8:ireturn         
	}

	protected long getTimestamp(ILoggingEvent iloggingevent)
	{
		return iloggingevent.getTimeStamp();
	//    0    0:aload_1         
	//    1    1:invokeinterface #39  <Method long ILoggingEvent.getTimeStamp()>
	//    2    6:lreturn         
	}

	protected volatile long getTimestamp(Object obj)
	{
		return getTimestamp((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class ILoggingEvent>
	//    3    5:invokevirtual   #42  <Method long getTimestamp(ILoggingEvent)>
	//    4    8:lreturn         
	}

	public void setDiscriminator(Discriminator discriminator)
	{
		super.setDiscriminator(discriminator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void SiftingAppenderBase.setDiscriminator(Discriminator)>
	//    3    5:return          
	}
}
