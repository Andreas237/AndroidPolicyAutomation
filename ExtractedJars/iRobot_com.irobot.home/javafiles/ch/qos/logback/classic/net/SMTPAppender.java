// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.boolex.OnErrorEvaluator;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.net.SMTPAppenderBase;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import org.slf4j.Marker;

public class SMTPAppender extends SMTPAppenderBase
{

	public SMTPAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void SMTPAppenderBase()>
		includeCallerData = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean includeCallerData>
	//    5    9:return          
	}

	public SMTPAppender(EventEvaluator eventevaluator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void SMTPAppenderBase()>
		includeCallerData = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean includeCallerData>
		eventEvaluator = eventevaluator;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field EventEvaluator eventEvaluator>
	//    8   14:return          
	}

	protected boolean eventMarksEndOfLife(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getMarker()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #33  <Method Marker ILoggingEvent.getMarker()>
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
	//    8   14:getstatic       #39  <Field Marker ClassicConstants.FINALIZE_SESSION_MARKER>
	//    9   17:invokeinterface #45  <Method boolean Marker.contains(Marker)>
	//   10   22:ireturn         
	}

	protected volatile boolean eventMarksEndOfLife(Object obj)
	{
		return eventMarksEndOfLife((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class ILoggingEvent>
	//    3    5:invokevirtual   #48  <Method boolean eventMarksEndOfLife(ILoggingEvent)>
	//    4    8:ireturn         
	}

	protected void fillBuffer(CyclicBuffer cyclicbuffer, StringBuffer stringbuffer)
	{
		int j = cyclicbuffer.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method int CyclicBuffer.length()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          46
		{
			ILoggingEvent iloggingevent = (ILoggingEvent)cyclicbuffer.get();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #60  <Method Object CyclicBuffer.get()>
	//   10   18:checkcast       #29  <Class ILoggingEvent>
	//   11   21:astore          5
			stringbuffer.append(layout.doLayout(((Object) (iloggingevent))));
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #64  <Field Layout layout>
	//   15   28:aload           5
	//   16   30:invokeinterface #70  <Method String Layout.doLayout(Object)>
	//   17   35:invokevirtual   #76  <Method StringBuffer StringBuffer.append(String)>
	//   18   38:pop             
		}

	//   19   39:iload_3         
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:istore_3        
	//*  23   43:goto            8
	//   24   46:return          
	}

	public boolean isIncludeCallerData()
	{
		return includeCallerData;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean includeCallerData>
	//    2    4:ireturn         
	}

	protected PatternLayout makeNewToPatternLayout(String s)
	{
		PatternLayout patternlayout = new PatternLayout();
	//    0    0:new             #83  <Class PatternLayout>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void PatternLayout()>
	//    3    7:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #86  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #87  <Method void StringBuilder()>
	//    7   15:astore_3        
		stringbuilder.append(s);
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("%nopex");
	//   12   22:aload_3         
	//   13   23:ldc1            #92  <String "%nopex">
	//   14   25:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		patternlayout.setPattern(stringbuilder.toString());
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   19   34:invokevirtual   #100 <Method void PatternLayout.setPattern(String)>
		return patternlayout;
	//   20   37:aload_2         
	//   21   38:areturn         
	}

	protected volatile PatternLayoutBase makeNewToPatternLayout(String s)
	{
		return ((PatternLayoutBase) (makeNewToPatternLayout(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method PatternLayout makeNewToPatternLayout(String)>
	//    3    5:areturn         
	}

	protected Layout makeSubjectLayout(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			s1 = "%logger{20} - %m";
	//    4    6:ldc1            #9   <String "%logger{20} - %m">
	//    5    8:astore_2        
		s = ((String) (new PatternLayout()));
	//    6    9:new             #83  <Class PatternLayout>
	//    7   12:dup             
	//    8   13:invokespecial   #84  <Method void PatternLayout()>
	//    9   16:astore_1        
		((PatternLayout) (s)).setContext(getContext());
	//   10   17:aload_1         
	//   11   18:aload_0         
	//   12   19:invokevirtual   #109 <Method ch.qos.logback.core.Context getContext()>
	//   13   22:invokevirtual   #113 <Method void PatternLayout.setContext(ch.qos.logback.core.Context)>
		((PatternLayout) (s)).setPattern(s1);
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #100 <Method void PatternLayout.setPattern(String)>
		((PatternLayout) (s)).setPostCompileProcessor(((ch.qos.logback.core.pattern.PostCompileProcessor) (null)));
	//   17   30:aload_1         
	//   18   31:aconst_null     
	//   19   32:invokevirtual   #117 <Method void PatternLayout.setPostCompileProcessor(ch.qos.logback.core.pattern.PostCompileProcessor)>
		((PatternLayout) (s)).start();
	//   20   35:aload_1         
	//   21   36:invokevirtual   #120 <Method void PatternLayout.start()>
		return ((Layout) (s));
	//   22   39:aload_1         
	//   23   40:areturn         
	}

	public void setIncludeCallerData(boolean flag)
	{
		includeCallerData = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean includeCallerData>
	//    3    5:return          
	}

	public void start()
	{
		if(eventEvaluator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field EventEvaluator eventEvaluator>
	//*   2    4:ifnonnull       38
		{
			OnErrorEvaluator onerrorevaluator = new OnErrorEvaluator();
	//    3    7:new             #125 <Class OnErrorEvaluator>
	//    4   10:dup             
	//    5   11:invokespecial   #126 <Method void OnErrorEvaluator()>
	//    6   14:astore_1        
			onerrorevaluator.setContext(getContext());
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #109 <Method ch.qos.logback.core.Context getContext()>
	//   10   20:invokevirtual   #127 <Method void OnErrorEvaluator.setContext(ch.qos.logback.core.Context)>
			onerrorevaluator.setName("onError");
	//   11   23:aload_1         
	//   12   24:ldc1            #129 <String "onError">
	//   13   26:invokevirtual   #132 <Method void OnErrorEvaluator.setName(String)>
			onerrorevaluator.start();
	//   14   29:aload_1         
	//   15   30:invokevirtual   #133 <Method void OnErrorEvaluator.start()>
			eventEvaluator = ((EventEvaluator) (onerrorevaluator));
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:putfield        #23  <Field EventEvaluator eventEvaluator>
		}
		super.start();
	//   19   38:aload_0         
	//   20   39:invokespecial   #134 <Method void SMTPAppenderBase.start()>
	//   21   42:return          
	}

	protected void subAppend(CyclicBuffer cyclicbuffer, ILoggingEvent iloggingevent)
	{
		if(includeCallerData)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean includeCallerData>
	//*   2    4:ifeq            14
			iloggingevent.getCallerData();
	//    3    7:aload_2         
	//    4    8:invokeinterface #140 <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//    5   13:pop             
		iloggingevent.prepareForDeferredProcessing();
	//    6   14:aload_2         
	//    7   15:invokeinterface #143 <Method void ILoggingEvent.prepareForDeferredProcessing()>
		cyclicbuffer.add(((Object) (iloggingevent)));
	//    8   20:aload_1         
	//    9   21:aload_2         
	//   10   22:invokevirtual   #147 <Method void CyclicBuffer.add(Object)>
	//   11   25:return          
	}

	protected volatile void subAppend(CyclicBuffer cyclicbuffer, Object obj)
	{
		subAppend(cyclicbuffer, (ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #29  <Class ILoggingEvent>
	//    4    6:invokevirtual   #151 <Method void subAppend(CyclicBuffer, ILoggingEvent)>
	//    5    9:return          
	}

	static final String DEFAULT_SUBJECT_PATTERN = "%logger{20} - %m";
	private boolean includeCallerData;
}
