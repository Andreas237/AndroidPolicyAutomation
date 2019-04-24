// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.MDC;
import org.slf4j.Marker;

// Referenced classes of package ch.qos.logback.classic.turbo:
//			MatchingFilter

public class MDCFilter extends MatchingFilter
{

	public MDCFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void MatchingFilter()>
	//    2    4:return          
	}

	public FilterReply decide(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
	{
		if(MDCKey == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field String MDCKey>
	//*   2    4:ifnonnull       11
			return FilterReply.NEUTRAL;
	//    3    7:getstatic       #22  <Field FilterReply FilterReply.NEUTRAL>
	//    4   10:areturn         
		marker = ((Marker) (MDC.get(MDCKey)));
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field String MDCKey>
	//    7   15:invokestatic    #28  <Method String MDC.get(String)>
	//    8   18:astore_1        
		if(value.equals(((Object) (marker))))
	//*   9   19:aload_0         
	//*  10   20:getfield        #30  <Field String value>
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  13   27:ifeq            35
			return onMatch;
	//   14   30:aload_0         
	//   15   31:getfield        #39  <Field FilterReply onMatch>
	//   16   34:areturn         
		else
			return onMismatch;
	//   17   35:aload_0         
	//   18   36:getfield        #42  <Field FilterReply onMismatch>
	//   19   39:areturn         
	}

	public void setMDCKey(String s)
	{
		MDCKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String MDCKey>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String value>
	//    3    5:return          
	}

	String MDCKey;
	String value;
}
