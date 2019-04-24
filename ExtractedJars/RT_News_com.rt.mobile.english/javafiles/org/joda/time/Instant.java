// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadableInstant, DateTimeUtils, DateTime, MutableDateTime, 
//			Chronology, ReadableDuration

public final class Instant extends AbstractInstant
	implements ReadableInstant, Serializable
{

	public Instant()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AbstractInstant()>
		iMillis = DateTimeUtils.currentTimeMillis();
	//    2    4:aload_0         
	//    3    5:invokestatic    #23  <Method long DateTimeUtils.currentTimeMillis()>
	//    4    8:putfield        #25  <Field long iMillis>
	//    5   11:return          
	}

	public Instant(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AbstractInstant()>
		iMillis = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #25  <Field long iMillis>
	//    5    9:return          
	}

	public Instant(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AbstractInstant()>
		iMillis = ConverterManager.getInstance().getInstantConverter(obj).getInstantMillis(obj, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    2    4:aload_0         
	//    3    5:invokestatic    #34  <Method ConverterManager ConverterManager.getInstance()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #38  <Method InstantConverter ConverterManager.getInstantConverter(Object)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #44  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    8   16:invokeinterface #50  <Method long InstantConverter.getInstantMillis(Object, Chronology)>
	//    9   21:putfield        #25  <Field long iMillis>
	//   10   24:return          
	}

	public static Instant now()
	{
		return new Instant();
	//    0    0:new             #2   <Class Instant>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void Instant()>
	//    3    7:areturn         
	}

	public static Instant parse(String s)
	{
		return parse(s, ISODateTimeFormat.dateTimeParser());
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method DateTimeFormatter ISODateTimeFormat.dateTimeParser()>
	//    2    4:invokestatic    #65  <Method Instant parse(String, DateTimeFormatter)>
	//    3    7:areturn         
	}

	public static Instant parse(String s, DateTimeFormatter datetimeformatter)
	{
		return datetimeformatter.parseDateTime(s).toInstant();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #72  <Method DateTime DateTimeFormatter.parseDateTime(String)>
	//    3    5:invokevirtual   #77  <Method Instant DateTime.toInstant()>
	//    4    8:areturn         
	}

	public Chronology getChronology()
	{
		return ((Chronology) (ISOChronology.getInstanceUTC()));
	//    0    0:invokestatic    #44  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    1    3:areturn         
	}

	public long getMillis()
	{
		return iMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long iMillis>
	//    2    4:lreturn         
	}

	public Instant minus(long l)
	{
		return withDurationAdded(l, -1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #86  <Method Instant withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public Instant minus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #90  <Method Instant withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public Instant plus(long l)
	{
		return withDurationAdded(l, 1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #86  <Method Instant withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public Instant plus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #90  <Method Instant withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public DateTime toDateTime()
	{
		return new DateTime(getMillis(), ((Chronology) (ISOChronology.getInstance())));
	//    0    0:new             #74  <Class DateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #95  <Method long getMillis()>
	//    4    8:invokestatic    #97  <Method ISOChronology ISOChronology.getInstance()>
	//    5   11:invokespecial   #100 <Method void DateTime(long, Chronology)>
	//    6   14:areturn         
	}

	public DateTime toDateTimeISO()
	{
		return toDateTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method DateTime toDateTime()>
	//    2    4:areturn         
	}

	public Instant toInstant()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public MutableDateTime toMutableDateTime()
	{
		return new MutableDateTime(getMillis(), ((Chronology) (ISOChronology.getInstance())));
	//    0    0:new             #108 <Class MutableDateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #95  <Method long getMillis()>
	//    4    8:invokestatic    #97  <Method ISOChronology ISOChronology.getInstance()>
	//    5   11:invokespecial   #109 <Method void MutableDateTime(long, Chronology)>
	//    6   14:areturn         
	}

	public MutableDateTime toMutableDateTimeISO()
	{
		return toMutableDateTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method MutableDateTime toMutableDateTime()>
	//    2    4:areturn         
	}

	public Instant withDurationAdded(long l, int i)
	{
		if(l != 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifeq            30
		{
			if(i == 0)
	//*   4    6:iload_3         
	//*   5    7:ifne            12
				return this;
	//    6   10:aload_0         
	//    7   11:areturn         
			else
				return withMillis(getChronology().add(getMillis(), l, i));
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:invokevirtual   #114 <Method Chronology getChronology()>
	//   11   17:aload_0         
	//   12   18:invokevirtual   #95  <Method long getMillis()>
	//   13   21:lload_1         
	//   14   22:iload_3         
	//   15   23:invokevirtual   #120 <Method long Chronology.add(long, long, int)>
	//   16   26:invokevirtual   #123 <Method Instant withMillis(long)>
	//   17   29:areturn         
		} else
		{
			return this;
	//   18   30:aload_0         
	//   19   31:areturn         
		}
	}

	public Instant withDurationAdded(ReadableDuration readableduration, int i)
	{
		if(readableduration != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
		{
			if(i == 0)
	//*   2    4:iload_2         
	//*   3    5:ifne            10
				return this;
	//    4    8:aload_0         
	//    5    9:areturn         
			else
				return withDurationAdded(readableduration.getMillis(), i);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #126 <Method long ReadableDuration.getMillis()>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #86  <Method Instant withDurationAdded(long, int)>
	//   11   21:areturn         
		} else
		{
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public Instant withMillis(long l)
	{
		if(l == iMillis)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #25  <Field long iMillis>
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return new Instant(l);
	//    7   11:new             #2   <Class Instant>
	//    8   14:dup             
	//    9   15:lload_1         
	//   10   16:invokespecial   #128 <Method void Instant(long)>
	//   11   19:areturn         
	}

	private static final long serialVersionUID = 0xc60e9ccdL;
	private final long iMillis;
}
