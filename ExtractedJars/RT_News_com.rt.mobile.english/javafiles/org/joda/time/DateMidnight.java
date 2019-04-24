// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadableDateTime, Chronology, DateTimeUtils, DateTime, 
//			DateTimeField, DurationField, DateTimeFieldType, Interval, 
//			DurationFieldType, LocalDate, YearMonthDay, ReadableDuration, 
//			DateTimeZone, ReadablePeriod, ReadablePartial

public final class DateMidnight extends BaseDateTime
	implements ReadableDateTime, Serializable
{

	public DateMidnight()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BaseDateTime()>
	//    2    4:return          
	}

	public DateMidnight(int i, int j, int k)
	{
		super(i, j, k, 0, 0, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:iconst_0        
	//    7    7:iconst_0        
	//    8    8:invokespecial   #24  <Method void BaseDateTime(int, int, int, int, int, int, int)>
	//    9   11:return          
	}

	public DateMidnight(int i, int j, int k, Chronology chronology)
	{
		super(i, j, k, 0, 0, 0, 0, chronology);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:iconst_0        
	//    7    7:iconst_0        
	//    8    8:aload           4
	//    9   10:invokespecial   #28  <Method void BaseDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   13:return          
	}

	public DateMidnight(int i, int j, int k, DateTimeZone datetimezone)
	{
		super(i, j, k, 0, 0, 0, 0, datetimezone);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:iconst_0        
	//    7    7:iconst_0        
	//    8    8:aload           4
	//    9   10:invokespecial   #32  <Method void BaseDateTime(int, int, int, int, int, int, int, DateTimeZone)>
	//   10   13:return          
	}

	public DateMidnight(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #35  <Method void BaseDateTime(long)>
	//    3    5:return          
	}

	public DateMidnight(long l, Chronology chronology)
	{
		super(l, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #38  <Method void BaseDateTime(long, Chronology)>
	//    4    6:return          
	}

	public DateMidnight(long l, DateTimeZone datetimezone)
	{
		super(l, datetimezone);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #41  <Method void BaseDateTime(long, DateTimeZone)>
	//    4    6:return          
	}

	public DateMidnight(Object obj)
	{
		super(obj, (Chronology)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #44  <Class Chronology>
	//    4    6:invokespecial   #47  <Method void BaseDateTime(Object, Chronology)>
	//    5    9:return          
	}

	public DateMidnight(Object obj, Chronology chronology)
	{
		super(obj, DateTimeUtils.getChronology(chronology));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #53  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    6:invokespecial   #47  <Method void BaseDateTime(Object, Chronology)>
	//    5    9:return          
	}

	public DateMidnight(Object obj, DateTimeZone datetimezone)
	{
		super(obj, datetimezone);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #56  <Method void BaseDateTime(Object, DateTimeZone)>
	//    4    6:return          
	}

	public DateMidnight(Chronology chronology)
	{
		super(chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void BaseDateTime(Chronology)>
	//    3    5:return          
	}

	public DateMidnight(DateTimeZone datetimezone)
	{
		super(datetimezone);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void BaseDateTime(DateTimeZone)>
	//    3    5:return          
	}

	public static DateMidnight now()
	{
		return new DateMidnight();
	//    0    0:new             #2   <Class DateMidnight>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void DateMidnight()>
	//    3    7:areturn         
	}

	public static DateMidnight now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #68  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #70  <String "Chronology must not be null">
	//    5   10:invokespecial   #73  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new DateMidnight(chronology);
	//    7   14:new             #2   <Class DateMidnight>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #74  <Method void DateMidnight(Chronology)>
	//   11   22:areturn         
	}

	public static DateMidnight now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #68  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #77  <String "Zone must not be null">
	//    5   10:invokespecial   #73  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new DateMidnight(datetimezone);
	//    7   14:new             #2   <Class DateMidnight>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #78  <Method void DateMidnight(DateTimeZone)>
	//   11   22:areturn         
	}

	public static DateMidnight parse(String s)
	{
		return parse(s, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
	//    0    0:aload_0         
	//    1    1:invokestatic    #87  <Method DateTimeFormatter ISODateTimeFormat.dateTimeParser()>
	//    2    4:invokevirtual   #92  <Method DateTimeFormatter DateTimeFormatter.withOffsetParsed()>
	//    3    7:invokestatic    #95  <Method DateMidnight parse(String, DateTimeFormatter)>
	//    4   10:areturn         
	}

	public static DateMidnight parse(String s, DateTimeFormatter datetimeformatter)
	{
		return datetimeformatter.parseDateTime(s).toDateMidnight();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #100 <Method DateTime DateTimeFormatter.parseDateTime(String)>
	//    3    5:invokevirtual   #105 <Method DateMidnight DateTime.toDateMidnight()>
	//    4    8:areturn         
	}

	public Property centuryOfEra()
	{
	/* block-local class not found */
	class Property {}

		return new Property(getChronology().centuryOfEra());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #113 <Method DateTimeField Chronology.centuryOfEra()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	protected long checkInstant(long l, Chronology chronology)
	{
		return chronology.dayOfMonth().roundFloor(l);
	//    0    0:aload_3         
	//    1    1:invokevirtual   #121 <Method DateTimeField Chronology.dayOfMonth()>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #127 <Method long DateTimeField.roundFloor(long)>
	//    4    8:lreturn         
	}

	public Property dayOfMonth()
	{
		return new Property(getChronology().dayOfMonth());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #121 <Method DateTimeField Chronology.dayOfMonth()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfWeek()
	{
		return new Property(getChronology().dayOfWeek());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #130 <Method DateTimeField Chronology.dayOfWeek()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfYear()
	{
		return new Property(getChronology().dayOfYear());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #133 <Method DateTimeField Chronology.dayOfYear()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public Property era()
	{
		return new Property(getChronology().era());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #136 <Method DateTimeField Chronology.era()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public DateMidnight minus(long l)
	{
		return withDurationAdded(l, -1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #142 <Method DateMidnight withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public DateMidnight minus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #146 <Method DateMidnight withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public DateMidnight minus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #151 <Method DateMidnight withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public DateMidnight minusDays(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().days().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #157 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #167 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public DateMidnight minusMonths(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().months().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #174 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #167 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public DateMidnight minusWeeks(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().weeks().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #178 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #167 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public DateMidnight minusYears(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().years().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #182 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #167 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public Property monthOfYear()
	{
		return new Property(getChronology().monthOfYear());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #185 <Method DateTimeField Chronology.monthOfYear()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public DateMidnight plus(long l)
	{
		return withDurationAdded(l, 1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #142 <Method DateMidnight withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public DateMidnight plus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #146 <Method DateMidnight withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public DateMidnight plus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #151 <Method DateMidnight withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public DateMidnight plusDays(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().days().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #157 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #190 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public DateMidnight plusMonths(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().months().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #174 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #190 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public DateMidnight plusWeeks(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().weeks().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #178 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #190 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public DateMidnight plusYears(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().years().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #182 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #190 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   13   25:areturn         
	}

	public Property property(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #197 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #199 <String "The DateTimeFieldType must not be null">
	//    5   10:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		Object obj = ((Object) (datetimefieldtype.getField(getChronology())));
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #110 <Method Chronology getChronology()>
	//   10   19:invokevirtual   #206 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   11   22:astore_2        
		if(!((DateTimeField) (obj)).isSupported())
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #210 <Method boolean DateTimeField.isSupported()>
	//*  14   27:ifne            70
		{
			obj = ((Object) (new StringBuilder()));
	//   15   30:new             #212 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #213 <Method void StringBuilder()>
	//   18   37:astore_2        
			((StringBuilder) (obj)).append("Field '");
	//   19   38:aload_2         
	//   20   39:ldc1            #215 <String "Field '">
	//   21   41:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			((StringBuilder) (obj)).append(((Object) (datetimefieldtype)));
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #222 <Method StringBuilder StringBuilder.append(Object)>
	//   26   50:pop             
			((StringBuilder) (obj)).append("' is not supported");
	//   27   51:aload_2         
	//   28   52:ldc1            #224 <String "' is not supported">
	//   29   54:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   31   58:new             #197 <Class IllegalArgumentException>
	//   32   61:dup             
	//   33   62:aload_2         
	//   34   63:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   35   66:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   36   69:athrow          
		} else
		{
			return new Property(((DateTimeField) (obj)));
	//   37   70:new             #10  <Class DateMidnight$Property>
	//   38   73:dup             
	//   39   74:aload_0         
	//   40   75:aload_2         
	//   41   76:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//   42   79:areturn         
		}
	}

	public Interval toInterval()
	{
		Chronology chronology = getChronology();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method Chronology getChronology()>
	//    2    4:astore_3        
		long l = getMillis();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #161 <Method long getMillis()>
	//    5    9:lstore_1        
		return new Interval(l, DurationFieldType.days().getField(chronology).add(l, 1), chronology);
	//    6   10:new             #232 <Class Interval>
	//    7   13:dup             
	//    8   14:lload_1         
	//    9   15:invokestatic    #237 <Method DurationFieldType DurationFieldType.days()>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #240 <Method DurationField DurationFieldType.getField(Chronology)>
	//   12   22:lload_1         
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #190 <Method long DurationField.add(long, int)>
	//   15   27:aload_3         
	//   16   28:invokespecial   #243 <Method void Interval(long, long, Chronology)>
	//   17   31:areturn         
	}

	public LocalDate toLocalDate()
	{
		return new LocalDate(getMillis(), getChronology());
	//    0    0:new             #247 <Class LocalDate>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #161 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #110 <Method Chronology getChronology()>
	//    6   12:invokespecial   #248 <Method void LocalDate(long, Chronology)>
	//    7   15:areturn         
	}

	public YearMonthDay toYearMonthDay()
	{
		return new YearMonthDay(getMillis(), getChronology());
	//    0    0:new             #252 <Class YearMonthDay>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #161 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #110 <Method Chronology getChronology()>
	//    6   12:invokespecial   #253 <Method void YearMonthDay(long, Chronology)>
	//    7   15:areturn         
	}

	public Property weekOfWeekyear()
	{
		return new Property(getChronology().weekOfWeekyear());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #256 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public Property weekyear()
	{
		return new Property(getChronology().weekyear());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #259 <Method DateTimeField Chronology.weekyear()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public DateMidnight withCenturyOfEra(int i)
	{
		return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #113 <Method DateTimeField Chronology.centuryOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withChronology(Chronology chronology)
	{
		if(chronology == getChronology())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DateMidnight(getMillis(), chronology);
	//    6   10:new             #2   <Class DateMidnight>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method long getMillis()>
	//   10   18:aload_1         
	//   11   19:invokespecial   #265 <Method void DateMidnight(long, Chronology)>
	//   12   22:areturn         
	}

	public DateMidnight withDayOfMonth(int i)
	{
		return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #121 <Method DateTimeField Chronology.dayOfMonth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withDayOfWeek(int i)
	{
		return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #130 <Method DateTimeField Chronology.dayOfWeek()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withDayOfYear(int i)
	{
		return withMillis(getChronology().dayOfYear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #133 <Method DateTimeField Chronology.dayOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withDurationAdded(long l, int i)
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
	//   10   14:invokevirtual   #110 <Method Chronology getChronology()>
	//   11   17:aload_0         
	//   12   18:invokevirtual   #161 <Method long getMillis()>
	//   13   21:lload_1         
	//   14   22:iload_3         
	//   15   23:invokevirtual   #271 <Method long Chronology.add(long, long, int)>
	//   16   26:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   17   29:areturn         
		} else
		{
			return this;
	//   18   30:aload_0         
	//   19   31:areturn         
		}
	}

	public DateMidnight withDurationAdded(ReadableDuration readableduration, int i)
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
	//    8   12:invokeinterface #274 <Method long ReadableDuration.getMillis()>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #142 <Method DateMidnight withDurationAdded(long, int)>
	//   11   21:areturn         
		} else
		{
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public DateMidnight withEra(int i)
	{
		return withMillis(getChronology().era().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #136 <Method DateTimeField Chronology.era()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withField(DateTimeFieldType datetimefieldtype, int i)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #197 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #279 <String "Field must not be null">
	//    5   11:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return withMillis(datetimefieldtype.getField(getChronology()).set(getMillis(), i));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #110 <Method Chronology getChronology()>
	//   11   21:invokevirtual   #206 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #161 <Method long getMillis()>
	//   14   28:iload_2         
	//   15   29:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//   16   32:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   17   35:areturn         
	}

	public DateMidnight withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #197 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #279 <String "Field must not be null">
	//    5   11:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(i == 0)
	//*   7   15:iload_2         
	//*   8   16:ifne            21
			return this;
	//    9   19:aload_0         
	//   10   20:areturn         
		else
			return withMillis(durationfieldtype.getField(getChronology()).add(getMillis(), i));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #110 <Method Chronology getChronology()>
	//   15   27:invokevirtual   #240 <Method DurationField DurationFieldType.getField(Chronology)>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #161 <Method long getMillis()>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #190 <Method long DurationField.add(long, int)>
	//   20   38:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   21   41:areturn         
	}

	public DateMidnight withFields(ReadablePartial readablepartial)
	{
		if(readablepartial == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().set(readablepartial, getMillis()));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method Chronology getChronology()>
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #161 <Method long getMillis()>
	//   10   16:invokevirtual   #286 <Method long Chronology.set(ReadablePartial, long)>
	//   11   19:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   12   22:areturn         
	}

	public DateMidnight withMillis(long l)
	{
		Chronology chronology = getChronology();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method Chronology getChronology()>
	//    2    4:astore_3        
		l = checkInstant(l, chronology);
	//    3    5:aload_0         
	//    4    6:lload_1         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #288 <Method long checkInstant(long, Chronology)>
	//    7   11:lstore_1        
		if(l == getMillis())
	//*   8   12:lload_1         
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #161 <Method long getMillis()>
	//*  11   17:lcmp            
	//*  12   18:ifne            23
			return this;
	//   13   21:aload_0         
	//   14   22:areturn         
		else
			return new DateMidnight(l, chronology);
	//   15   23:new             #2   <Class DateMidnight>
	//   16   26:dup             
	//   17   27:lload_1         
	//   18   28:aload_3         
	//   19   29:invokespecial   #265 <Method void DateMidnight(long, Chronology)>
	//   20   32:areturn         
	}

	public DateMidnight withMonthOfYear(int i)
	{
		return withMillis(getChronology().monthOfYear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #185 <Method DateTimeField Chronology.monthOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withPeriodAdded(ReadablePeriod readableperiod, int i)
	{
		if(readableperiod != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			if(i == 0)
	//*   2    4:iload_2         
	//*   3    5:ifne            10
				return this;
	//    4    8:aload_0         
	//    5    9:areturn         
			else
				return withMillis(getChronology().add(readableperiod, getMillis(), i));
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #110 <Method Chronology getChronology()>
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #161 <Method long getMillis()>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #292 <Method long Chronology.add(ReadablePeriod, long, int)>
	//   14   24:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//   15   27:areturn         
		} else
		{
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		}
	}

	public DateMidnight withWeekOfWeekyear(int i)
	{
		return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #256 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withWeekyear(int i)
	{
		return withMillis(getChronology().weekyear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #259 <Method DateTimeField Chronology.weekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withYear(int i)
	{
		return withMillis(getChronology().year().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #298 <Method DateTimeField Chronology.year()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withYearOfCentury(int i)
	{
		return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #302 <Method DateTimeField Chronology.yearOfCentury()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withYearOfEra(int i)
	{
		return withMillis(getChronology().yearOfEra().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #110 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #306 <Method DateTimeField Chronology.yearOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #161 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #263 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #170 <Method DateMidnight withMillis(long)>
	//    9   19:areturn         
	}

	public DateMidnight withZoneRetainFields(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #311 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		DateTimeZone datetimezone1 = DateTimeUtils.getZone(getZone());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #314 <Method DateTimeZone getZone()>
	//    5    9:invokestatic    #311 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    6   12:astore_2        
		if(datetimezone == datetimezone1)
	//*   7   13:aload_1         
	//*   8   14:aload_2         
	//*   9   15:if_acmpne       20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return new DateMidnight(datetimezone1.getMillisKeepLocal(datetimezone, getMillis()), getChronology().withZone(datetimezone));
	//   12   20:new             #2   <Class DateMidnight>
	//   13   23:dup             
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:aload_0         
	//   17   27:invokevirtual   #161 <Method long getMillis()>
	//   18   30:invokevirtual   #320 <Method long DateTimeZone.getMillisKeepLocal(DateTimeZone, long)>
	//   19   33:aload_0         
	//   20   34:invokevirtual   #110 <Method Chronology getChronology()>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #324 <Method Chronology Chronology.withZone(DateTimeZone)>
	//   23   41:invokespecial   #265 <Method void DateMidnight(long, Chronology)>
	//   24   44:areturn         
	}

	public Property year()
	{
		return new Property(getChronology().year());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #298 <Method DateTimeField Chronology.year()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfCentury()
	{
		return new Property(getChronology().yearOfCentury());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #302 <Method DateTimeField Chronology.yearOfCentury()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfEra()
	{
		return new Property(getChronology().yearOfEra());
	//    0    0:new             #10  <Class DateMidnight$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #306 <Method DateTimeField Chronology.yearOfEra()>
	//    6   12:invokespecial   #116 <Method void DateMidnight$Property(DateMidnight, DateTimeField)>
	//    7   15:areturn         
	}

	private static final long serialVersionUID = 0x2f5e4032L;
}
