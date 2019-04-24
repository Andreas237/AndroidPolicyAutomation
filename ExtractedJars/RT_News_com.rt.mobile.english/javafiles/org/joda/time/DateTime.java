// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadableDateTime, Chronology, DateTimeUtils, DurationField, 
//			DateTimeFieldType, DateTimeField, DateMidnight, LocalDate, 
//			LocalDateTime, LocalTime, TimeOfDay, YearMonthDay, 
//			ReadableDuration, DateTimeZone, DurationFieldType, ReadablePeriod, 
//			ReadablePartial

public final class DateTime extends BaseDateTime
	implements ReadableDateTime, Serializable
{

	public DateTime()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void BaseDateTime()>
	//    2    4:return          
	}

	public DateTime(int i, int j, int k, int l, int i1)
	{
		super(i, j, k, l, i1, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokespecial   #23  <Method void BaseDateTime(int, int, int, int, int, int, int)>
	//    9   13:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, int j1)
	{
		super(i, j, k, l, i1, j1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iconst_0        
	//    8   11:invokespecial   #23  <Method void BaseDateTime(int, int, int, int, int, int, int)>
	//    9   14:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, int j1, int k1)
	{
		super(i, j, k, l, i1, j1, k1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:invokespecial   #23  <Method void BaseDateTime(int, int, int, int, int, int, int)>
	//    9   15:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
			Chronology chronology)
	{
		super(i, j, k, l, i1, j1, k1, chronology);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:aload           8
	//    9   14:invokespecial   #27  <Method void BaseDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   17:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
			DateTimeZone datetimezone)
	{
		super(i, j, k, l, i1, j1, k1, datetimezone);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:aload           8
	//    9   14:invokespecial   #30  <Method void BaseDateTime(int, int, int, int, int, int, int, DateTimeZone)>
	//   10   17:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, int j1, Chronology chronology)
	{
		super(i, j, k, l, i1, j1, 0, chronology);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iconst_0        
	//    8   11:aload           7
	//    9   13:invokespecial   #27  <Method void BaseDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   16:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, int j1, DateTimeZone datetimezone)
	{
		super(i, j, k, l, i1, j1, 0, datetimezone);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iconst_0        
	//    8   11:aload           7
	//    9   13:invokespecial   #30  <Method void BaseDateTime(int, int, int, int, int, int, int, DateTimeZone)>
	//   10   16:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, Chronology chronology)
	{
		super(i, j, k, l, i1, 0, 0, chronology);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:aload           6
	//    9   12:invokespecial   #27  <Method void BaseDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   15:return          
	}

	public DateTime(int i, int j, int k, int l, int i1, DateTimeZone datetimezone)
	{
		super(i, j, k, l, i1, 0, 0, datetimezone);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:aload           6
	//    9   12:invokespecial   #30  <Method void BaseDateTime(int, int, int, int, int, int, int, DateTimeZone)>
	//   10   15:return          
	}

	public DateTime(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #37  <Method void BaseDateTime(long)>
	//    3    5:return          
	}

	public DateTime(long l, Chronology chronology)
	{
		super(l, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #40  <Method void BaseDateTime(long, Chronology)>
	//    4    6:return          
	}

	public DateTime(long l, DateTimeZone datetimezone)
	{
		super(l, datetimezone);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #43  <Method void BaseDateTime(long, DateTimeZone)>
	//    4    6:return          
	}

	public DateTime(Object obj)
	{
		super(obj, (Chronology)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #46  <Class Chronology>
	//    4    6:invokespecial   #49  <Method void BaseDateTime(Object, Chronology)>
	//    5    9:return          
	}

	public DateTime(Object obj, Chronology chronology)
	{
		super(obj, DateTimeUtils.getChronology(chronology));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #55  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    6:invokespecial   #49  <Method void BaseDateTime(Object, Chronology)>
	//    5    9:return          
	}

	public DateTime(Object obj, DateTimeZone datetimezone)
	{
		super(obj, datetimezone);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void BaseDateTime(Object, DateTimeZone)>
	//    4    6:return          
	}

	public DateTime(Chronology chronology)
	{
		super(chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void BaseDateTime(Chronology)>
	//    3    5:return          
	}

	public DateTime(DateTimeZone datetimezone)
	{
		super(datetimezone);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void BaseDateTime(DateTimeZone)>
	//    3    5:return          
	}

	public static DateTime now()
	{
		return new DateTime();
	//    0    0:new             #2   <Class DateTime>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void DateTime()>
	//    3    7:areturn         
	}

	public static DateTime now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #70  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #72  <String "Chronology must not be null">
	//    5   10:invokespecial   #75  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new DateTime(chronology);
	//    7   14:new             #2   <Class DateTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #76  <Method void DateTime(Chronology)>
	//   11   22:areturn         
	}

	public static DateTime now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #70  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #79  <String "Zone must not be null">
	//    5   10:invokespecial   #75  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new DateTime(datetimezone);
	//    7   14:new             #2   <Class DateTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #80  <Method void DateTime(DateTimeZone)>
	//   11   22:areturn         
	}

	public static DateTime parse(String s)
	{
		return parse(s, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
	//    0    0:aload_0         
	//    1    1:invokestatic    #89  <Method DateTimeFormatter ISODateTimeFormat.dateTimeParser()>
	//    2    4:invokevirtual   #94  <Method DateTimeFormatter DateTimeFormatter.withOffsetParsed()>
	//    3    7:invokestatic    #97  <Method DateTime parse(String, DateTimeFormatter)>
	//    4   10:areturn         
	}

	public static DateTime parse(String s, DateTimeFormatter datetimeformatter)
	{
		return datetimeformatter.parseDateTime(s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #101 <Method DateTime DateTimeFormatter.parseDateTime(String)>
	//    3    5:areturn         
	}

	public Property centuryOfEra()
	{
	/* block-local class not found */
	class Property {}

		return new Property(getChronology().centuryOfEra());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #109 <Method DateTimeField Chronology.centuryOfEra()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfMonth()
	{
		return new Property(getChronology().dayOfMonth());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #115 <Method DateTimeField Chronology.dayOfMonth()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfWeek()
	{
		return new Property(getChronology().dayOfWeek());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #118 <Method DateTimeField Chronology.dayOfWeek()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfYear()
	{
		return new Property(getChronology().dayOfYear());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #121 <Method DateTimeField Chronology.dayOfYear()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property era()
	{
		return new Property(getChronology().era());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #124 <Method DateTimeField Chronology.era()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property hourOfDay()
	{
		return new Property(getChronology().hourOfDay());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #127 <Method DateTimeField Chronology.hourOfDay()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property millisOfDay()
	{
		return new Property(getChronology().millisOfDay());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #130 <Method DateTimeField Chronology.millisOfDay()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property millisOfSecond()
	{
		return new Property(getChronology().millisOfSecond());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #133 <Method DateTimeField Chronology.millisOfSecond()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public DateTime minus(long l)
	{
		return withDurationAdded(l, -1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #139 <Method DateTime withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public DateTime minus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #143 <Method DateTime withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public DateTime minus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #148 <Method DateTime withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public DateTime minusDays(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #154 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime minusHours(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().hours().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #171 <Method DurationField Chronology.hours()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime minusMillis(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().millis().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #175 <Method DurationField Chronology.millis()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime minusMinutes(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().minutes().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #179 <Method DurationField Chronology.minutes()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime minusMonths(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #183 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime minusSeconds(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().seconds().subtract(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #187 <Method DurationField Chronology.seconds()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime minusWeeks(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #191 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime minusYears(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #195 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #164 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public Property minuteOfDay()
	{
		return new Property(getChronology().minuteOfDay());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #198 <Method DateTimeField Chronology.minuteOfDay()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property minuteOfHour()
	{
		return new Property(getChronology().minuteOfHour());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #201 <Method DateTimeField Chronology.minuteOfHour()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property monthOfYear()
	{
		return new Property(getChronology().monthOfYear());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #204 <Method DateTimeField Chronology.monthOfYear()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public DateTime plus(long l)
	{
		return withDurationAdded(l, 1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #139 <Method DateTime withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public DateTime plus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #143 <Method DateTime withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public DateTime plus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #148 <Method DateTime withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public DateTime plusDays(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #154 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime plusHours(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().hours().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #171 <Method DurationField Chronology.hours()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime plusMillis(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().millis().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #175 <Method DurationField Chronology.millis()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime plusMinutes(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().minutes().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #179 <Method DurationField Chronology.minutes()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime plusMonths(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #183 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime plusSeconds(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withMillis(getChronology().seconds().add(getMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #187 <Method DurationField Chronology.seconds()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime plusWeeks(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #191 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public DateTime plusYears(int i)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #195 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #158 <Method long getMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   13   25:areturn         
	}

	public Property property(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #220 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #222 <String "The DateTimeFieldType must not be null">
	//    5   10:invokespecial   #223 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		Object obj = ((Object) (datetimefieldtype.getField(getChronology())));
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #106 <Method Chronology getChronology()>
	//   10   19:invokevirtual   #229 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   11   22:astore_2        
		if(!((DateTimeField) (obj)).isSupported())
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #235 <Method boolean DateTimeField.isSupported()>
	//*  14   27:ifne            70
		{
			obj = ((Object) (new StringBuilder()));
	//   15   30:new             #237 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #238 <Method void StringBuilder()>
	//   18   37:astore_2        
			((StringBuilder) (obj)).append("Field '");
	//   19   38:aload_2         
	//   20   39:ldc1            #240 <String "Field '">
	//   21   41:invokevirtual   #244 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			((StringBuilder) (obj)).append(((Object) (datetimefieldtype)));
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #247 <Method StringBuilder StringBuilder.append(Object)>
	//   26   50:pop             
			((StringBuilder) (obj)).append("' is not supported");
	//   27   51:aload_2         
	//   28   52:ldc1            #249 <String "' is not supported">
	//   29   54:invokevirtual   #244 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   31   58:new             #220 <Class IllegalArgumentException>
	//   32   61:dup             
	//   33   62:aload_2         
	//   34   63:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   35   66:invokespecial   #223 <Method void IllegalArgumentException(String)>
	//   36   69:athrow          
		} else
		{
			return new Property(((DateTimeField) (obj)));
	//   37   70:new             #10  <Class DateTime$Property>
	//   38   73:dup             
	//   39   74:aload_0         
	//   40   75:aload_2         
	//   41   76:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//   42   79:areturn         
		}
	}

	public Property secondOfDay()
	{
		return new Property(getChronology().secondOfDay());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #256 <Method DateTimeField Chronology.secondOfDay()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property secondOfMinute()
	{
		return new Property(getChronology().secondOfMinute());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #259 <Method DateTimeField Chronology.secondOfMinute()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public DateMidnight toDateMidnight()
	{
		return new DateMidnight(getMillis(), getChronology());
	//    0    0:new             #264 <Class DateMidnight>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method Chronology getChronology()>
	//    6   12:invokespecial   #265 <Method void DateMidnight(long, Chronology)>
	//    7   15:areturn         
	}

	public DateTime toDateTime()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public DateTime toDateTime(Chronology chronology)
	{
		chronology = DateTimeUtils.getChronology(chronology);
	//    0    0:aload_1         
	//    1    1:invokestatic    #55  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    2    4:astore_1        
		if(getChronology() == chronology)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//*   5    9:aload_1         
	//*   6   10:if_acmpne       15
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		else
			return super.toDateTime(chronology);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #268 <Method DateTime BaseDateTime.toDateTime(Chronology)>
	//   12   20:areturn         
	}

	public DateTime toDateTime(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #272 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		if(getZone() == datetimezone)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #275 <Method DateTimeZone getZone()>
	//*   5    9:aload_1         
	//*   6   10:if_acmpne       15
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		else
			return super.toDateTime(datetimezone);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #277 <Method DateTime BaseDateTime.toDateTime(DateTimeZone)>
	//   12   20:areturn         
	}

	public DateTime toDateTimeISO()
	{
		if(getChronology() == ISOChronology.getInstance())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #106 <Method Chronology getChronology()>
	//*   2    4:invokestatic    #284 <Method ISOChronology ISOChronology.getInstance()>
	//*   3    7:if_acmpne       12
			return this;
	//    4   10:aload_0         
	//    5   11:areturn         
		else
			return super.toDateTimeISO();
	//    6   12:aload_0         
	//    7   13:invokespecial   #286 <Method DateTime BaseDateTime.toDateTimeISO()>
	//    8   16:areturn         
	}

	public LocalDate toLocalDate()
	{
		return new LocalDate(getMillis(), getChronology());
	//    0    0:new             #290 <Class LocalDate>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method Chronology getChronology()>
	//    6   12:invokespecial   #291 <Method void LocalDate(long, Chronology)>
	//    7   15:areturn         
	}

	public LocalDateTime toLocalDateTime()
	{
		return new LocalDateTime(getMillis(), getChronology());
	//    0    0:new             #295 <Class LocalDateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method Chronology getChronology()>
	//    6   12:invokespecial   #296 <Method void LocalDateTime(long, Chronology)>
	//    7   15:areturn         
	}

	public LocalTime toLocalTime()
	{
		return new LocalTime(getMillis(), getChronology());
	//    0    0:new             #300 <Class LocalTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method Chronology getChronology()>
	//    6   12:invokespecial   #301 <Method void LocalTime(long, Chronology)>
	//    7   15:areturn         
	}

	public TimeOfDay toTimeOfDay()
	{
		return new TimeOfDay(getMillis(), getChronology());
	//    0    0:new             #305 <Class TimeOfDay>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method Chronology getChronology()>
	//    6   12:invokespecial   #306 <Method void TimeOfDay(long, Chronology)>
	//    7   15:areturn         
	}

	public YearMonthDay toYearMonthDay()
	{
		return new YearMonthDay(getMillis(), getChronology());
	//    0    0:new             #310 <Class YearMonthDay>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method Chronology getChronology()>
	//    6   12:invokespecial   #311 <Method void YearMonthDay(long, Chronology)>
	//    7   15:areturn         
	}

	public Property weekOfWeekyear()
	{
		return new Property(getChronology().weekOfWeekyear());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #314 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property weekyear()
	{
		return new Property(getChronology().weekyear());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #317 <Method DateTimeField Chronology.weekyear()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public DateTime withCenturyOfEra(int i)
	{
		return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #109 <Method DateTimeField Chronology.centuryOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withChronology(Chronology chronology)
	{
		chronology = DateTimeUtils.getChronology(chronology);
	//    0    0:aload_1         
	//    1    1:invokestatic    #55  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    2    4:astore_1        
		if(chronology == getChronology())
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #106 <Method Chronology getChronology()>
	//*   6   10:if_acmpne       15
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		else
			return new DateTime(getMillis(), chronology);
	//    9   15:new             #2   <Class DateTime>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokevirtual   #158 <Method long getMillis()>
	//   13   23:aload_1         
	//   14   24:invokespecial   #323 <Method void DateTime(long, Chronology)>
	//   15   27:areturn         
	}

	public DateTime withDate(int i, int j, int k)
	{
		Chronology chronology = getChronology();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method Chronology getChronology()>
	//    2    4:astore          6
		long l = getMillis();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #158 <Method long getMillis()>
	//    5   10:lstore          4
		l = chronology.year().set(l, i);
	//    6   12:aload           6
	//    7   14:invokevirtual   #328 <Method DateTimeField Chronology.year()>
	//    8   17:lload           4
	//    9   19:iload_1         
	//   10   20:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   11   23:lstore          4
		l = chronology.monthOfYear().set(l, j);
	//   12   25:aload           6
	//   13   27:invokevirtual   #204 <Method DateTimeField Chronology.monthOfYear()>
	//   14   30:lload           4
	//   15   32:iload_2         
	//   16   33:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   17   36:lstore          4
		return withMillis(chronology.dayOfMonth().set(l, k));
	//   18   38:aload_0         
	//   19   39:aload           6
	//   20   41:invokevirtual   #115 <Method DateTimeField Chronology.dayOfMonth()>
	//   21   44:lload           4
	//   22   46:iload_3         
	//   23   47:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   24   50:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   25   53:areturn         
	}

	public DateTime withDayOfMonth(int i)
	{
		return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #115 <Method DateTimeField Chronology.dayOfMonth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withDayOfWeek(int i)
	{
		return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #118 <Method DateTimeField Chronology.dayOfWeek()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withDayOfYear(int i)
	{
		return withMillis(getChronology().dayOfYear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #121 <Method DateTimeField Chronology.dayOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withDurationAdded(long l, int i)
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
	//   10   14:invokevirtual   #106 <Method Chronology getChronology()>
	//   11   17:aload_0         
	//   12   18:invokevirtual   #158 <Method long getMillis()>
	//   13   21:lload_1         
	//   14   22:iload_3         
	//   15   23:invokevirtual   #334 <Method long Chronology.add(long, long, int)>
	//   16   26:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   17   29:areturn         
		} else
		{
			return this;
	//   18   30:aload_0         
	//   19   31:areturn         
		}
	}

	public DateTime withDurationAdded(ReadableDuration readableduration, int i)
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
	//    8   12:invokeinterface #337 <Method long ReadableDuration.getMillis()>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #139 <Method DateTime withDurationAdded(long, int)>
	//   11   21:areturn         
		} else
		{
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public DateTime withEarlierOffsetAtOverlap()
	{
		return withMillis(getZone().adjustOffset(getMillis(), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #275 <Method DateTimeZone getZone()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #158 <Method long getMillis()>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #344 <Method long DateTimeZone.adjustOffset(long, boolean)>
	//    7   13:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    8   16:areturn         
	}

	public DateTime withEra(int i)
	{
		return withMillis(getChronology().era().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #124 <Method DateTimeField Chronology.era()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withField(DateTimeFieldType datetimefieldtype, int i)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #220 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #349 <String "Field must not be null">
	//    5   11:invokespecial   #223 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return withMillis(datetimefieldtype.getField(getChronology()).set(getMillis(), i));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #106 <Method Chronology getChronology()>
	//   11   21:invokevirtual   #229 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #158 <Method long getMillis()>
	//   14   28:iload_2         
	//   15   29:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   16   32:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   17   35:areturn         
	}

	public DateTime withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #220 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #349 <String "Field must not be null">
	//    5   11:invokespecial   #223 <Method void IllegalArgumentException(String)>
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
	//   14   24:invokevirtual   #106 <Method Chronology getChronology()>
	//   15   27:invokevirtual   #356 <Method DurationField DurationFieldType.getField(Chronology)>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #158 <Method long getMillis()>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #209 <Method long DurationField.add(long, int)>
	//   20   38:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   21   41:areturn         
	}

	public DateTime withFields(ReadablePartial readablepartial)
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
	//    6    8:invokevirtual   #106 <Method Chronology getChronology()>
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #158 <Method long getMillis()>
	//   10   16:invokevirtual   #361 <Method long Chronology.set(ReadablePartial, long)>
	//   11   19:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   12   22:areturn         
	}

	public DateTime withHourOfDay(int i)
	{
		return withMillis(getChronology().hourOfDay().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #127 <Method DateTimeField Chronology.hourOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withLaterOffsetAtOverlap()
	{
		return withMillis(getZone().adjustOffset(getMillis(), true));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #275 <Method DateTimeZone getZone()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #158 <Method long getMillis()>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #344 <Method long DateTimeZone.adjustOffset(long, boolean)>
	//    7   13:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    8   16:areturn         
	}

	public DateTime withMillis(long l)
	{
		if(l == getMillis())
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #158 <Method long getMillis()>
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return new DateTime(l, getChronology());
	//    7   11:new             #2   <Class DateTime>
	//    8   14:dup             
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #106 <Method Chronology getChronology()>
	//   12   20:invokespecial   #323 <Method void DateTime(long, Chronology)>
	//   13   23:areturn         
	}

	public DateTime withMillisOfDay(int i)
	{
		return withMillis(getChronology().millisOfDay().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #130 <Method DateTimeField Chronology.millisOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withMillisOfSecond(int i)
	{
		return withMillis(getChronology().millisOfSecond().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #133 <Method DateTimeField Chronology.millisOfSecond()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withMinuteOfHour(int i)
	{
		return withMillis(getChronology().minuteOfHour().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #201 <Method DateTimeField Chronology.minuteOfHour()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withMonthOfYear(int i)
	{
		return withMillis(getChronology().monthOfYear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #204 <Method DateTimeField Chronology.monthOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withPeriodAdded(ReadablePeriod readableperiod, int i)
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
	//    8   12:invokevirtual   #106 <Method Chronology getChronology()>
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #158 <Method long getMillis()>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #370 <Method long Chronology.add(ReadablePeriod, long, int)>
	//   14   24:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   15   27:areturn         
		} else
		{
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		}
	}

	public DateTime withSecondOfMinute(int i)
	{
		return withMillis(getChronology().secondOfMinute().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #259 <Method DateTimeField Chronology.secondOfMinute()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withTime(int i, int j, int k, int l)
	{
		Chronology chronology = getChronology();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method Chronology getChronology()>
	//    2    4:astore          7
		long l1 = getMillis();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #158 <Method long getMillis()>
	//    5   10:lstore          5
		l1 = chronology.hourOfDay().set(l1, i);
	//    6   12:aload           7
	//    7   14:invokevirtual   #127 <Method DateTimeField Chronology.hourOfDay()>
	//    8   17:lload           5
	//    9   19:iload_1         
	//   10   20:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   11   23:lstore          5
		l1 = chronology.minuteOfHour().set(l1, j);
	//   12   25:aload           7
	//   13   27:invokevirtual   #201 <Method DateTimeField Chronology.minuteOfHour()>
	//   14   30:lload           5
	//   15   32:iload_2         
	//   16   33:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   17   36:lstore          5
		l1 = chronology.secondOfMinute().set(l1, k);
	//   18   38:aload           7
	//   19   40:invokevirtual   #259 <Method DateTimeField Chronology.secondOfMinute()>
	//   20   43:lload           5
	//   21   45:iload_3         
	//   22   46:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   23   49:lstore          5
		return withMillis(chronology.millisOfSecond().set(l1, l));
	//   24   51:aload_0         
	//   25   52:aload           7
	//   26   54:invokevirtual   #133 <Method DateTimeField Chronology.millisOfSecond()>
	//   27   57:lload           5
	//   28   59:iload           4
	//   29   61:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//   30   64:invokevirtual   #167 <Method DateTime withMillis(long)>
	//   31   67:areturn         
	}

	public DateTime withTimeAtStartOfDay()
	{
		return toLocalDate().toDateTimeAtStartOfDay(getZone());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method LocalDate toLocalDate()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #275 <Method DateTimeZone getZone()>
	//    4    8:invokevirtual   #379 <Method DateTime LocalDate.toDateTimeAtStartOfDay(DateTimeZone)>
	//    5   11:areturn         
	}

	public DateTime withWeekOfWeekyear(int i)
	{
		return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #314 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withWeekyear(int i)
	{
		return withMillis(getChronology().weekyear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #317 <Method DateTimeField Chronology.weekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withYear(int i)
	{
		return withMillis(getChronology().year().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #328 <Method DateTimeField Chronology.year()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withYearOfCentury(int i)
	{
		return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #386 <Method DateTimeField Chronology.yearOfCentury()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withYearOfEra(int i)
	{
		return withMillis(getChronology().yearOfEra().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #390 <Method DateTimeField Chronology.yearOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #158 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #321 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #167 <Method DateTime withMillis(long)>
	//    9   19:areturn         
	}

	public DateTime withZone(DateTimeZone datetimezone)
	{
		return withChronology(getChronology().withZone(datetimezone));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #106 <Method Chronology getChronology()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #394 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    5    9:invokevirtual   #396 <Method DateTime withChronology(Chronology)>
	//    6   12:areturn         
	}

	public DateTime withZoneRetainFields(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #272 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		DateTimeZone datetimezone1 = DateTimeUtils.getZone(getZone());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #275 <Method DateTimeZone getZone()>
	//    5    9:invokestatic    #272 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    6   12:astore_2        
		if(datetimezone == datetimezone1)
	//*   7   13:aload_1         
	//*   8   14:aload_2         
	//*   9   15:if_acmpne       20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return new DateTime(datetimezone1.getMillisKeepLocal(datetimezone, getMillis()), getChronology().withZone(datetimezone));
	//   12   20:new             #2   <Class DateTime>
	//   13   23:dup             
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:aload_0         
	//   17   27:invokevirtual   #158 <Method long getMillis()>
	//   18   30:invokevirtual   #401 <Method long DateTimeZone.getMillisKeepLocal(DateTimeZone, long)>
	//   19   33:aload_0         
	//   20   34:invokevirtual   #106 <Method Chronology getChronology()>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #394 <Method Chronology Chronology.withZone(DateTimeZone)>
	//   23   41:invokespecial   #323 <Method void DateTime(long, Chronology)>
	//   24   44:areturn         
	}

	public Property year()
	{
		return new Property(getChronology().year());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #328 <Method DateTimeField Chronology.year()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfCentury()
	{
		return new Property(getChronology().yearOfCentury());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #386 <Method DateTimeField Chronology.yearOfCentury()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfEra()
	{
		return new Property(getChronology().yearOfEra());
	//    0    0:new             #10  <Class DateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #106 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #390 <Method DateTimeField Chronology.yearOfEra()>
	//    6   12:invokespecial   #112 <Method void DateTime$Property(DateTime, DateTimeField)>
	//    7   15:areturn         
	}

	private static final long serialVersionUID = 0x6a5bddf9L;
}
