// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

// Referenced classes of package ch.qos.logback.classic.turbo:
//			MatchingFilter

public class MarkerFilter extends MatchingFilter
{

	public MarkerFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void MatchingFilter()>
	//    2    4:return          
	}

	public FilterReply decide(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #17  <Method boolean isStarted()>
	//*   2    4:ifne            11
			return FilterReply.NEUTRAL;
	//    3    7:getstatic       #23  <Field FilterReply FilterReply.NEUTRAL>
	//    4   10:areturn         
		if(marker == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       20
			return onMismatch;
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field FilterReply onMismatch>
	//    9   19:areturn         
		if(marker.contains(markerToMatch))
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #28  <Field Marker markerToMatch>
	//*  13   25:invokeinterface #34  <Method boolean Marker.contains(Marker)>
	//*  14   30:ifeq            38
			return onMatch;
	//   15   33:aload_0         
	//   16   34:getfield        #37  <Field FilterReply onMatch>
	//   17   37:areturn         
		else
			return onMismatch;
	//   18   38:aload_0         
	//   19   39:getfield        #26  <Field FilterReply onMismatch>
	//   20   42:areturn         
	}

	public void setMarker(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			markerToMatch = MarkerFactory.getMarker(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #45  <Method Marker MarkerFactory.getMarker(String)>
	//    5    9:putfield        #28  <Field Marker markerToMatch>
	//    6   12:return          
	}

	public void start()
	{
		if(markerToMatch != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Marker markerToMatch>
	//*   2    4:ifnull          12
		{
			super.start();
	//    3    7:aload_0         
	//    4    8:invokespecial   #48  <Method void MatchingFilter.start()>
			return;
	//    5   11:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #50  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #51  <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("The marker property must be set for [");
	//   10   20:aload_1         
	//   11   21:ldc1            #53  <String "The marker property must be set for [">
	//   12   23:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(getName());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #61  <Method String getName()>
	//   17   32:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append("]");
	//   19   36:aload_1         
	//   20   37:ldc1            #63  <String "]">
	//   21   39:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			addError(stringbuilder.toString());
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   26   48:invokevirtual   #69  <Method void addError(String)>
			return;
	//   27   51:return          
		}
	}

	Marker markerToMatch;
}
