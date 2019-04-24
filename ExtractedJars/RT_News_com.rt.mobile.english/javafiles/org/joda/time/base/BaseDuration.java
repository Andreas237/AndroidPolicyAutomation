// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.*;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.DurationConverter;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time.base:
//			AbstractDuration

public abstract class BaseDuration extends AbstractDuration
	implements ReadableDuration, Serializable
{

	protected BaseDuration(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AbstractDuration()>
		iMillis = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #20  <Field long iMillis>
	//    5    9:return          
	}

	protected BaseDuration(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AbstractDuration()>
		iMillis = FieldUtils.safeSubtract(l1, l);
	//    2    4:aload_0         
	//    3    5:lload_3         
	//    4    6:lload_1         
	//    5    7:invokestatic    #28  <Method long FieldUtils.safeSubtract(long, long)>
	//    6   10:putfield        #20  <Field long iMillis>
	//    7   13:return          
	}

	protected BaseDuration(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AbstractDuration()>
		iMillis = ConverterManager.getInstance().getDurationConverter(obj).getDurationMillis(obj);
	//    2    4:aload_0         
	//    3    5:invokestatic    #35  <Method ConverterManager ConverterManager.getInstance()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #39  <Method DurationConverter ConverterManager.getDurationConverter(Object)>
	//    6   12:aload_1         
	//    7   13:invokeinterface #45  <Method long DurationConverter.getDurationMillis(Object)>
	//    8   18:putfield        #20  <Field long iMillis>
	//    9   21:return          
	}

	protected BaseDuration(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AbstractDuration()>
		if(readableinstant == readableinstant1)
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:if_acmpne       15
		{
			iMillis = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #20  <Field long iMillis>
			return;
	//    8   14:return          
		} else
		{
			long l = DateTimeUtils.getInstantMillis(readableinstant);
	//    9   15:aload_1         
	//   10   16:invokestatic    #52  <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//   11   19:lstore_3        
			iMillis = FieldUtils.safeSubtract(DateTimeUtils.getInstantMillis(readableinstant1), l);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:invokestatic    #52  <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//   15   25:lload_3         
	//   16   26:invokestatic    #28  <Method long FieldUtils.safeSubtract(long, long)>
	//   17   29:putfield        #20  <Field long iMillis>
			return;
	//   18   32:return          
		}
	}

	public long getMillis()
	{
		return iMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long iMillis>
	//    2    4:lreturn         
	}

	protected void setMillis(long l)
	{
		iMillis = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #20  <Field long iMillis>
	//    3    5:return          
	}

	public Interval toIntervalFrom(ReadableInstant readableinstant)
	{
		return new Interval(readableinstant, ((ReadableDuration) (this)));
	//    0    0:new             #59  <Class Interval>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #62  <Method void Interval(ReadableInstant, ReadableDuration)>
	//    5    9:areturn         
	}

	public Interval toIntervalTo(ReadableInstant readableinstant)
	{
		return new Interval(((ReadableDuration) (this)), readableinstant);
	//    0    0:new             #59  <Class Interval>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #66  <Method void Interval(ReadableDuration, ReadableInstant)>
	//    5    9:areturn         
	}

	public Period toPeriod(Chronology chronology)
	{
		return new Period(getMillis(), chronology);
	//    0    0:new             #70  <Class Period>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #72  <Method long getMillis()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #75  <Method void Period(long, Chronology)>
	//    6   12:areturn         
	}

	public Period toPeriod(PeriodType periodtype)
	{
		return new Period(getMillis(), periodtype);
	//    0    0:new             #70  <Class Period>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #72  <Method long getMillis()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #79  <Method void Period(long, PeriodType)>
	//    6   12:areturn         
	}

	public Period toPeriod(PeriodType periodtype, Chronology chronology)
	{
		return new Period(getMillis(), periodtype, chronology);
	//    0    0:new             #70  <Class Period>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #72  <Method long getMillis()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #83  <Method void Period(long, PeriodType, Chronology)>
	//    7   13:areturn         
	}

	public Period toPeriodFrom(ReadableInstant readableinstant)
	{
		return new Period(readableinstant, ((ReadableDuration) (this)));
	//    0    0:new             #70  <Class Period>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #86  <Method void Period(ReadableInstant, ReadableDuration)>
	//    5    9:areturn         
	}

	public Period toPeriodFrom(ReadableInstant readableinstant, PeriodType periodtype)
	{
		return new Period(readableinstant, ((ReadableDuration) (this)), periodtype);
	//    0    0:new             #70  <Class Period>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #90  <Method void Period(ReadableInstant, ReadableDuration, PeriodType)>
	//    6   10:areturn         
	}

	public Period toPeriodTo(ReadableInstant readableinstant)
	{
		return new Period(((ReadableDuration) (this)), readableinstant);
	//    0    0:new             #70  <Class Period>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #92  <Method void Period(ReadableDuration, ReadableInstant)>
	//    5    9:areturn         
	}

	public Period toPeriodTo(ReadableInstant readableinstant, PeriodType periodtype)
	{
		return new Period(((ReadableDuration) (this)), readableinstant, periodtype);
	//    0    0:new             #70  <Class Period>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #95  <Method void Period(ReadableDuration, ReadableInstant, PeriodType)>
	//    6   10:areturn         
	}

	private static final long serialVersionUID = 0x193af48eL;
	private volatile long iMillis;
}
