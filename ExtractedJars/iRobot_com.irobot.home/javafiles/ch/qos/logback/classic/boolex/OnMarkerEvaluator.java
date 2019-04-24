// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EventEvaluatorBase;
import java.util.*;
import org.slf4j.Marker;

public class OnMarkerEvaluator extends EventEvaluatorBase
{

	public OnMarkerEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void EventEvaluatorBase()>
		markerList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ArrayList()>
	//    6   12:putfield        #17  <Field List markerList>
	//    7   15:return          
	}

	public void addMarker(String s)
	{
		markerList.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List markerList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #26  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public boolean evaluate(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getMarker()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #34  <Method Marker ILoggingEvent.getMarker()>
	//    2    6:astore_1        
		if(iloggingevent == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		for(Iterator iterator = markerList.iterator(); iterator.hasNext();)
	//*   7   13:aload_0         
	//*   8   14:getfield        #17  <Field List markerList>
	//*   9   17:invokeinterface #38  <Method Iterator List.iterator()>
	//*  10   22:astore_2        
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            52
			if(((Marker) (iloggingevent)).contains((String)iterator.next()))
	//*  14   32:aload_1         
	//*  15   33:aload_2         
	//*  16   34:invokeinterface #48  <Method Object Iterator.next()>
	//*  17   39:checkcast       #50  <Class String>
	//*  18   42:invokeinterface #56  <Method boolean Marker.contains(String)>
	//*  19   47:ifeq            23
				return true;
	//   20   50:iconst_1        
	//   21   51:ireturn         

		return false;
	//   22   52:iconst_0        
	//   23   53:ireturn         
	}

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ILoggingEvent>
	//    3    5:invokevirtual   #58  <Method boolean evaluate(ILoggingEvent)>
	//    4    8:ireturn         
	}

	List markerList;
}
