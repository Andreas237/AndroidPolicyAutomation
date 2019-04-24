// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.filter;

import ch.qos.logback.core.spi.FilterReply;

// Referenced classes of package ch.qos.logback.core.filter:
//			Filter

public abstract class AbstractMatcherFilter extends Filter
{

	public AbstractMatcherFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Filter()>
		onMatch = FilterReply.NEUTRAL;
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field FilterReply FilterReply.NEUTRAL>
	//    4    8:putfield        #19  <Field FilterReply onMatch>
		onMismatch = FilterReply.NEUTRAL;
	//    5   11:aload_0         
	//    6   12:getstatic       #17  <Field FilterReply FilterReply.NEUTRAL>
	//    7   15:putfield        #21  <Field FilterReply onMismatch>
	//    8   18:return          
	}

	public final FilterReply getOnMatch()
	{
		return onMatch;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FilterReply onMatch>
	//    2    4:areturn         
	}

	public final FilterReply getOnMismatch()
	{
		return onMismatch;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FilterReply onMismatch>
	//    2    4:areturn         
	}

	public final void setOnMatch(FilterReply filterreply)
	{
		onMatch = filterreply;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FilterReply onMatch>
	//    3    5:return          
	}

	public final void setOnMismatch(FilterReply filterreply)
	{
		onMismatch = filterreply;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field FilterReply onMismatch>
	//    3    5:return          
	}

	protected FilterReply onMatch;
	protected FilterReply onMismatch;
}
