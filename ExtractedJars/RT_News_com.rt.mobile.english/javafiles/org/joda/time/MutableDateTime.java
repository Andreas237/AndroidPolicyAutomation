// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadWritableDateTime, Chronology, DateTimeUtils, DateTime, 
//			DurationFieldType, DurationField, ReadableDuration, DateTimeFieldType, 
//			DateTimeField, ReadableDateTime, DateTimeZone, ReadablePeriod, 
//			ReadableInstant

public class MutableDateTime extends BaseDateTime
	implements ReadWritableDateTime, Cloneable, Serializable
{

	public MutableDateTime()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void BaseDateTime()>
	//    2    4:return          
	}

	public MutableDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
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
	//    8   12:invokespecial   #40  <Method void BaseDateTime(int, int, int, int, int, int, int)>
	//    9   15:return          
	}

	public MutableDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
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
	//    9   14:invokespecial   #43  <Method void BaseDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   17:return          
	}

	public MutableDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
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
	//    9   14:invokespecial   #46  <Method void BaseDateTime(int, int, int, int, int, int, int, DateTimeZone)>
	//   10   17:return          
	}

	public MutableDateTime(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #49  <Method void BaseDateTime(long)>
	//    3    5:return          
	}

	public MutableDateTime(long l, Chronology chronology)
	{
		super(l, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #52  <Method void BaseDateTime(long, Chronology)>
	//    4    6:return          
	}

	public MutableDateTime(long l, DateTimeZone datetimezone)
	{
		super(l, datetimezone);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #55  <Method void BaseDateTime(long, DateTimeZone)>
	//    4    6:return          
	}

	public MutableDateTime(Object obj)
	{
		super(obj, (Chronology)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #58  <Class Chronology>
	//    4    6:invokespecial   #61  <Method void BaseDateTime(Object, Chronology)>
	//    5    9:return          
	}

	public MutableDateTime(Object obj, Chronology chronology)
	{
		super(obj, DateTimeUtils.getChronology(chronology));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #67  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    6:invokespecial   #61  <Method void BaseDateTime(Object, Chronology)>
	//    5    9:return          
	}

	public MutableDateTime(Object obj, DateTimeZone datetimezone)
	{
		super(obj, datetimezone);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #70  <Method void BaseDateTime(Object, DateTimeZone)>
	//    4    6:return          
	}

	public MutableDateTime(Chronology chronology)
	{
		super(chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void BaseDateTime(Chronology)>
	//    3    5:return          
	}

	public MutableDateTime(DateTimeZone datetimezone)
	{
		super(datetimezone);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void BaseDateTime(DateTimeZone)>
	//    3    5:return          
	}

	public static MutableDateTime now()
	{
		return new MutableDateTime();
	//    0    0:new             #2   <Class MutableDateTime>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void MutableDateTime()>
	//    3    7:areturn         
	}

	public static MutableDateTime now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #82  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #84  <String "Chronology must not be null">
	//    5   10:invokespecial   #87  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new MutableDateTime(chronology);
	//    7   14:new             #2   <Class MutableDateTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #88  <Method void MutableDateTime(Chronology)>
	//   11   22:areturn         
	}

	public static MutableDateTime now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #82  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #91  <String "Zone must not be null">
	//    5   10:invokespecial   #87  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new MutableDateTime(datetimezone);
	//    7   14:new             #2   <Class MutableDateTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #92  <Method void MutableDateTime(DateTimeZone)>
	//   11   22:areturn         
	}

	public static MutableDateTime parse(String s)
	{
		return parse(s, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
	//    0    0:aload_0         
	//    1    1:invokestatic    #101 <Method DateTimeFormatter ISODateTimeFormat.dateTimeParser()>
	//    2    4:invokevirtual   #106 <Method DateTimeFormatter DateTimeFormatter.withOffsetParsed()>
	//    3    7:invokestatic    #109 <Method MutableDateTime parse(String, DateTimeFormatter)>
	//    4   10:areturn         
	}

	public static MutableDateTime parse(String s, DateTimeFormatter datetimeformatter)
	{
		return datetimeformatter.parseDateTime(s).toMutableDateTime();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #114 <Method DateTime DateTimeFormatter.parseDateTime(String)>
	//    3    5:invokevirtual   #119 <Method MutableDateTime DateTime.toMutableDateTime()>
	//    4    8:areturn         
	}

	public void add(long l)
	{
		setMillis(FieldUtils.safeAdd(getMillis(), l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #124 <Method long getMillis()>
	//    3    5:lload_1         
	//    4    6:invokestatic    #130 <Method long FieldUtils.safeAdd(long, long)>
	//    5    9:invokevirtual   #133 <Method void setMillis(long)>
	//    6   12:return          
	}

	public void add(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #136 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #138 <String "Field must not be null">
	//    5   10:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(i != 0)
	//*   7   14:iload_2         
	//*   8   15:ifeq            38
			setMillis(durationfieldtype.getField(getChronology()).add(getMillis(), i));
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #142 <Method Chronology getChronology()>
	//   13   24:invokevirtual   #148 <Method DurationField DurationFieldType.getField(Chronology)>
	//   14   27:aload_0         
	//   15   28:invokevirtual   #124 <Method long getMillis()>
	//   16   31:iload_2         
	//   17   32:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   18   35:invokevirtual   #133 <Method void setMillis(long)>
	//   19   38:return          
	}

	public void add(ReadableDuration readableduration)
	{
		add(readableduration, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #157 <Method void add(ReadableDuration, int)>
	//    4    6:return          
	}

	public void add(ReadableDuration readableduration, int i)
	{
		if(readableduration != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			add(FieldUtils.safeMultiply(readableduration.getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #160 <Method long ReadableDuration.getMillis()>
	//    5   11:iload_2         
	//    6   12:invokestatic    #163 <Method long FieldUtils.safeMultiply(long, int)>
	//    7   15:invokevirtual   #165 <Method void add(long)>
	//    8   18:return          
	}

	public void add(ReadablePeriod readableperiod)
	{
		add(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #169 <Method void add(ReadablePeriod, int)>
	//    4    6:return          
	}

	public void add(ReadablePeriod readableperiod, int i)
	{
		if(readableperiod != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
			setMillis(getChronology().add(readableperiod, getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #124 <Method long getMillis()>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #172 <Method long Chronology.add(ReadablePeriod, long, int)>
	//   10   18:invokevirtual   #133 <Method void setMillis(long)>
	//   11   21:return          
	}

	public void addDays(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().days().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #178 <Method DurationField Chronology.days()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addHours(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().hours().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #182 <Method DurationField Chronology.hours()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addMillis(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().millis().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #186 <Method DurationField Chronology.millis()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addMinutes(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().minutes().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #190 <Method DurationField Chronology.minutes()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addMonths(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().months().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #194 <Method DurationField Chronology.months()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addSeconds(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().seconds().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #198 <Method DurationField Chronology.seconds()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addWeeks(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().weeks().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #202 <Method DurationField Chronology.weeks()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addWeekyears(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().weekyears().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #206 <Method DurationField Chronology.weekyears()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public void addYears(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			setMillis(getChronology().years().add(getMillis(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #210 <Method DurationField Chronology.years()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method long getMillis()>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #153 <Method long DurationField.add(long, int)>
	//   10   20:invokevirtual   #133 <Method void setMillis(long)>
	//   11   23:return          
	}

	public Property centuryOfEra()
	{
	/* block-local class not found */
	class Property {}

		return new Property(getChronology().centuryOfEra());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #215 <Method DateTimeField Chronology.centuryOfEra()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Object clone()
	{
		CloneNotSupportedException clonenotsupportedexception;
		Object obj;
		try
		{
			obj = ((Object)this).clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:new             #228 <Class InternalError>
	//*   6   10:dup             
	//*   7   11:ldc1            #230 <String "Clone error">
	//*   8   13:invokespecial   #231 <Method void InternalError(String)>
	//*   9   16:athrow          
		// Misplaced declaration of an exception variable
		catch(CloneNotSupportedException clonenotsupportedexception)
		{
			throw new InternalError("Clone error");
		}
		return obj;
	//*  10   17:astore_1        
	//*  11   18:goto            7
	}

	public MutableDateTime copy()
	{
		return (MutableDateTime)clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method Object clone()>
	//    2    4:checkcast       #2   <Class MutableDateTime>
	//    3    7:areturn         
	}

	public Property dayOfMonth()
	{
		return new Property(getChronology().dayOfMonth());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #236 <Method DateTimeField Chronology.dayOfMonth()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfWeek()
	{
		return new Property(getChronology().dayOfWeek());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #239 <Method DateTimeField Chronology.dayOfWeek()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfYear()
	{
		return new Property(getChronology().dayOfYear());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #242 <Method DateTimeField Chronology.dayOfYear()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property era()
	{
		return new Property(getChronology().era());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #245 <Method DateTimeField Chronology.era()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public DateTimeField getRoundingField()
	{
		return iRoundingField;
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field DateTimeField iRoundingField>
	//    2    4:areturn         
	}

	public int getRoundingMode()
	{
		return iRoundingMode;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field int iRoundingMode>
	//    2    4:ireturn         
	}

	public Property hourOfDay()
	{
		return new Property(getChronology().hourOfDay());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #255 <Method DateTimeField Chronology.hourOfDay()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property millisOfDay()
	{
		return new Property(getChronology().millisOfDay());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #258 <Method DateTimeField Chronology.millisOfDay()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property millisOfSecond()
	{
		return new Property(getChronology().millisOfSecond());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #261 <Method DateTimeField Chronology.millisOfSecond()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property minuteOfDay()
	{
		return new Property(getChronology().minuteOfDay());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #264 <Method DateTimeField Chronology.minuteOfDay()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property minuteOfHour()
	{
		return new Property(getChronology().minuteOfHour());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #267 <Method DateTimeField Chronology.minuteOfHour()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property monthOfYear()
	{
		return new Property(getChronology().monthOfYear());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #270 <Method DateTimeField Chronology.monthOfYear()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property property(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #136 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #274 <String "The DateTimeFieldType must not be null">
	//    5   11:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		Object obj = ((Object) (datetimefieldtype.getField(getChronology())));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #142 <Method Chronology getChronology()>
	//   10   20:invokevirtual   #279 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   11   23:astore_2        
		if(!((DateTimeField) (obj)).isSupported())
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #285 <Method boolean DateTimeField.isSupported()>
	//*  14   28:ifne            73
		{
			obj = ((Object) (new StringBuilder()));
	//   15   31:new             #287 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #288 <Method void StringBuilder()>
	//   18   38:astore_2        
			((StringBuilder) (obj)).append("Field '");
	//   19   39:aload_2         
	//   20   40:ldc2            #290 <String "Field '">
	//   21   43:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			((StringBuilder) (obj)).append(((Object) (datetimefieldtype)));
	//   23   47:aload_2         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   26   52:pop             
			((StringBuilder) (obj)).append("' is not supported");
	//   27   53:aload_2         
	//   28   54:ldc2            #299 <String "' is not supported">
	//   29   57:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   31   61:new             #136 <Class IllegalArgumentException>
	//   32   64:dup             
	//   33   65:aload_2         
	//   34   66:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//   36   72:athrow          
		} else
		{
			return new Property(((DateTimeField) (obj)));
	//   37   73:new             #12  <Class MutableDateTime$Property>
	//   38   76:dup             
	//   39   77:aload_0         
	//   40   78:aload_2         
	//   41   79:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//   42   82:areturn         
		}
	}

	public Property secondOfDay()
	{
		return new Property(getChronology().secondOfDay());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #306 <Method DateTimeField Chronology.secondOfDay()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property secondOfMinute()
	{
		return new Property(getChronology().secondOfMinute());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #309 <Method DateTimeField Chronology.secondOfMinute()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public void set(DateTimeFieldType datetimefieldtype, int i)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #136 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #138 <String "Field must not be null">
	//    5   10:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			setMillis(datetimefieldtype.getField(getChronology()).set(getMillis(), i));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #142 <Method Chronology getChronology()>
	//   11   20:invokevirtual   #279 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #124 <Method long getMillis()>
	//   14   27:iload_2         
	//   15   28:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//   16   31:invokevirtual   #133 <Method void setMillis(long)>
			return;
	//   17   34:return          
		}
	}

	public void setChronology(Chronology chronology)
	{
		super.setChronology(chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #316 <Method void BaseDateTime.setChronology(Chronology)>
	//    3    5:return          
	}

	public void setDate(int i, int j, int k)
	{
		setDate(getChronology().getDateTimeMillis(i, j, k, 0));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #322 <Method long Chronology.getDateTimeMillis(int, int, int, int)>
	//    8   12:invokevirtual   #324 <Method void setDate(long)>
	//    9   15:return          
	}

	public void setDate(long l)
	{
		setMillis(getChronology().millisOfDay().set(l, getMillisOfDay()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #258 <Method DateTimeField Chronology.millisOfDay()>
	//    4    8:lload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #327 <Method int getMillisOfDay()>
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setDate(ReadableInstant readableinstant)
	{
		long l1 = DateTimeUtils.getInstantMillis(readableinstant);
	//    0    0:aload_1         
	//    1    1:invokestatic    #332 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    2    4:lstore          4
		long l = l1;
	//    3    6:lload           4
	//    4    8:lstore_2        
		if(readableinstant instanceof ReadableDateTime)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #334 <Class ReadableDateTime>
	//*   7   13:ifeq            50
		{
			readableinstant = ((ReadableInstant) (DateTimeUtils.getChronology(((ReadableDateTime)readableinstant).getChronology()).getZone()));
	//    8   16:aload_1         
	//    9   17:checkcast       #334 <Class ReadableDateTime>
	//   10   20:invokeinterface #335 <Method Chronology ReadableDateTime.getChronology()>
	//   11   25:invokestatic    #67  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   12   28:invokevirtual   #339 <Method DateTimeZone Chronology.getZone()>
	//   13   31:astore_1        
			l = l1;
	//   14   32:lload           4
	//   15   34:lstore_2        
			if(readableinstant != null)
	//*  16   35:aload_1         
	//*  17   36:ifnull          50
				l = ((DateTimeZone) (readableinstant)).getMillisKeepLocal(getZone(), l1);
	//   18   39:aload_1         
	//   19   40:aload_0         
	//   20   41:invokevirtual   #340 <Method DateTimeZone getZone()>
	//   21   44:lload           4
	//   22   46:invokevirtual   #346 <Method long DateTimeZone.getMillisKeepLocal(DateTimeZone, long)>
	//   23   49:lstore_2        
		}
		setDate(l);
	//   24   50:aload_0         
	//   25   51:lload_2         
	//   26   52:invokevirtual   #324 <Method void setDate(long)>
	//   27   55:return          
	}

	public void setDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
	{
		setMillis(getChronology().getDateTimeMillis(i, j, k, l, i1, j1, k1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:iload           5
	//    8   12:iload           6
	//    9   14:iload           7
	//   10   16:invokevirtual   #350 <Method long Chronology.getDateTimeMillis(int, int, int, int, int, int, int)>
	//   11   19:invokevirtual   #133 <Method void setMillis(long)>
	//   12   22:return          
	}

	public void setDayOfMonth(int i)
	{
		setMillis(getChronology().dayOfMonth().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #236 <Method DateTimeField Chronology.dayOfMonth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setDayOfWeek(int i)
	{
		setMillis(getChronology().dayOfWeek().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #239 <Method DateTimeField Chronology.dayOfWeek()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setDayOfYear(int i)
	{
		setMillis(getChronology().dayOfYear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #242 <Method DateTimeField Chronology.dayOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setHourOfDay(int i)
	{
		setMillis(getChronology().hourOfDay().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #255 <Method DateTimeField Chronology.hourOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setMillis(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		switch(iRoundingMode)
	//*   2    2:aload_0         
	//*   3    3:getfield        #252 <Field int iRoundingMode>
		{
	//*   4    6:tableswitch     0 5: default 44
	//	               0 106
	//	               1 97
	//	               2 85
	//	               3 73
	//	               4 61
	//	               5 49
		default:
			l1 = l;
	//    5   44:lload_1         
	//    6   45:lstore_3        
			break;

	//*   7   46:goto            106
		case 5: // '\005'
			l1 = iRoundingField.roundHalfEven(l);
	//    8   49:aload_0         
	//    9   50:getfield        #248 <Field DateTimeField iRoundingField>
	//   10   53:lload_1         
	//   11   54:invokevirtual   #358 <Method long DateTimeField.roundHalfEven(long)>
	//   12   57:lstore_3        
			break;

	//*  13   58:goto            106
		case 4: // '\004'
			l1 = iRoundingField.roundHalfCeiling(l);
	//   14   61:aload_0         
	//   15   62:getfield        #248 <Field DateTimeField iRoundingField>
	//   16   65:lload_1         
	//   17   66:invokevirtual   #361 <Method long DateTimeField.roundHalfCeiling(long)>
	//   18   69:lstore_3        
			break;

	//*  19   70:goto            106
		case 3: // '\003'
			l1 = iRoundingField.roundHalfFloor(l);
	//   20   73:aload_0         
	//   21   74:getfield        #248 <Field DateTimeField iRoundingField>
	//   22   77:lload_1         
	//   23   78:invokevirtual   #364 <Method long DateTimeField.roundHalfFloor(long)>
	//   24   81:lstore_3        
			break;

	//*  25   82:goto            106
		case 2: // '\002'
			l1 = iRoundingField.roundCeiling(l);
	//   26   85:aload_0         
	//   27   86:getfield        #248 <Field DateTimeField iRoundingField>
	//   28   89:lload_1         
	//   29   90:invokevirtual   #367 <Method long DateTimeField.roundCeiling(long)>
	//   30   93:lstore_3        
			break;

	//*  31   94:goto            106
		case 1: // '\001'
			l1 = iRoundingField.roundFloor(l);
	//   32   97:aload_0         
	//   33   98:getfield        #248 <Field DateTimeField iRoundingField>
	//   34  101:lload_1         
	//   35  102:invokevirtual   #370 <Method long DateTimeField.roundFloor(long)>
	//   36  105:lstore_3        
			break;

		case 0: // '\0'
			break;
		}
		super.setMillis(l1);
	//   37  106:aload_0         
	//   38  107:lload_3         
	//   39  108:invokespecial   #371 <Method void BaseDateTime.setMillis(long)>
	//   40  111:return          
	}

	public void setMillis(ReadableInstant readableinstant)
	{
		setMillis(DateTimeUtils.getInstantMillis(readableinstant));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #332 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    3    5:invokevirtual   #133 <Method void setMillis(long)>
	//    4    8:return          
	}

	public void setMillisOfDay(int i)
	{
		setMillis(getChronology().millisOfDay().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #258 <Method DateTimeField Chronology.millisOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setMillisOfSecond(int i)
	{
		setMillis(getChronology().millisOfSecond().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #261 <Method DateTimeField Chronology.millisOfSecond()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setMinuteOfDay(int i)
	{
		setMillis(getChronology().minuteOfDay().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #264 <Method DateTimeField Chronology.minuteOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setMinuteOfHour(int i)
	{
		setMillis(getChronology().minuteOfHour().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #267 <Method DateTimeField Chronology.minuteOfHour()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setMonthOfYear(int i)
	{
		setMillis(getChronology().monthOfYear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #270 <Method DateTimeField Chronology.monthOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setRounding(DateTimeField datetimefield)
	{
		setRounding(datetimefield, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #381 <Method void setRounding(DateTimeField, int)>
	//    4    6:return          
	}

	public void setRounding(DateTimeField datetimefield, int i)
	{
		if(datetimefield != null && (i < 0 || i > 5))
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
	//*   2    4:iload_2         
	//*   3    5:iflt            13
	//*   4    8:iload_2         
	//*   5    9:iconst_5        
	//*   6   10:icmple          47
		{
			datetimefield = ((DateTimeField) (new StringBuilder()));
	//    7   13:new             #287 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #288 <Method void StringBuilder()>
	//   10   20:astore_1        
			((StringBuilder) (datetimefield)).append("Illegal rounding mode: ");
	//   11   21:aload_1         
	//   12   22:ldc2            #383 <String "Illegal rounding mode: ">
	//   13   25:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			((StringBuilder) (datetimefield)).append(i);
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:invokevirtual   #386 <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			throw new IllegalArgumentException(((StringBuilder) (datetimefield)).toString());
	//   19   35:new             #136 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		}
		DateTimeField datetimefield1;
		if(i == 0)
	//*  25   47:iload_2         
	//*  26   48:ifne            56
			datetimefield1 = null;
	//   27   51:aconst_null     
	//   28   52:astore_3        
		else
	//*  29   53:goto            58
			datetimefield1 = datetimefield;
	//   30   56:aload_1         
	//   31   57:astore_3        
		iRoundingField = datetimefield1;
	//   32   58:aload_0         
	//   33   59:aload_3         
	//   34   60:putfield        #248 <Field DateTimeField iRoundingField>
		if(datetimefield == null)
	//*  35   63:aload_1         
	//*  36   64:ifnonnull       69
			i = 0;
	//   37   67:iconst_0        
	//   38   68:istore_2        
		iRoundingMode = i;
	//   39   69:aload_0         
	//   40   70:iload_2         
	//   41   71:putfield        #252 <Field int iRoundingMode>
		setMillis(getMillis());
	//   42   74:aload_0         
	//   43   75:aload_0         
	//   44   76:invokevirtual   #124 <Method long getMillis()>
	//   45   79:invokevirtual   #133 <Method void setMillis(long)>
	//   46   82:return          
	}

	public void setSecondOfDay(int i)
	{
		setMillis(getChronology().secondOfDay().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #306 <Method DateTimeField Chronology.secondOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setSecondOfMinute(int i)
	{
		setMillis(getChronology().secondOfMinute().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #309 <Method DateTimeField Chronology.secondOfMinute()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setTime(int i, int j, int k, int l)
	{
		setMillis(getChronology().getDateTimeMillis(getMillis(), i, j, k, l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #124 <Method long getMillis()>
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokevirtual   #393 <Method long Chronology.getDateTimeMillis(long, int, int, int, int)>
	//   10   17:invokevirtual   #133 <Method void setMillis(long)>
	//   11   20:return          
	}

	public void setTime(long l)
	{
		int i = ISOChronology.getInstanceUTC().millisOfDay().get(l);
	//    0    0:invokestatic    #399 <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    1    3:invokevirtual   #400 <Method DateTimeField ISOChronology.millisOfDay()>
	//    2    6:lload_1         
	//    3    7:invokevirtual   #404 <Method int DateTimeField.get(long)>
	//    4   10:istore_3        
		setMillis(getChronology().millisOfDay().set(getMillis(), i));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #142 <Method Chronology getChronology()>
	//    8   16:invokevirtual   #258 <Method DateTimeField Chronology.millisOfDay()>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #124 <Method long getMillis()>
	//   11   23:iload_3         
	//   12   24:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//   13   27:invokevirtual   #133 <Method void setMillis(long)>
	//   14   30:return          
	}

	public void setTime(ReadableInstant readableinstant)
	{
		long l1 = DateTimeUtils.getInstantMillis(readableinstant);
	//    0    0:aload_1         
	//    1    1:invokestatic    #332 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    2    4:lstore          4
		readableinstant = ((ReadableInstant) (DateTimeUtils.getInstantChronology(readableinstant).getZone()));
	//    3    6:aload_1         
	//    4    7:invokestatic    #408 <Method Chronology DateTimeUtils.getInstantChronology(ReadableInstant)>
	//    5   10:invokevirtual   #339 <Method DateTimeZone Chronology.getZone()>
	//    6   13:astore_1        
		long l = l1;
	//    7   14:lload           4
	//    8   16:lstore_2        
		if(readableinstant != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          31
			l = ((DateTimeZone) (readableinstant)).getMillisKeepLocal(DateTimeZone.UTC, l1);
	//   11   21:aload_1         
	//   12   22:getstatic       #412 <Field DateTimeZone DateTimeZone.UTC>
	//   13   25:lload           4
	//   14   27:invokevirtual   #346 <Method long DateTimeZone.getMillisKeepLocal(DateTimeZone, long)>
	//   15   30:lstore_2        
		setTime(l);
	//   16   31:aload_0         
	//   17   32:lload_2         
	//   18   33:invokevirtual   #414 <Method void setTime(long)>
	//   19   36:return          
	}

	public void setWeekOfWeekyear(int i)
	{
		setMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #418 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setWeekyear(int i)
	{
		setMillis(getChronology().weekyear().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #422 <Method DateTimeField Chronology.weekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setYear(int i)
	{
		setMillis(getChronology().year().set(getMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #142 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #426 <Method DateTimeField Chronology.year()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method long getMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #313 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #133 <Method void setMillis(long)>
	//    9   19:return          
	}

	public void setZone(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #430 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		Chronology chronology = getChronology();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:astore_2        
		if(chronology.getZone() != datetimezone)
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #339 <Method DateTimeZone Chronology.getZone()>
	//*   8   14:aload_1         
	//*   9   15:if_acmpeq       27
			setChronology(chronology.withZone(datetimezone));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #434 <Method Chronology Chronology.withZone(DateTimeZone)>
	//   14   24:invokevirtual   #435 <Method void setChronology(Chronology)>
	//   15   27:return          
	}

	public void setZoneRetainFields(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #430 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		DateTimeZone datetimezone1 = DateTimeUtils.getZone(getZone());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #340 <Method DateTimeZone getZone()>
	//    5    9:invokestatic    #430 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    6   12:astore          4
		if(datetimezone == datetimezone1)
	//*   7   14:aload_1         
	//*   8   15:aload           4
	//*   9   17:if_acmpne       21
		{
			return;
	//   10   20:return          
		} else
		{
			long l = datetimezone1.getMillisKeepLocal(datetimezone, getMillis());
	//   11   21:aload           4
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #124 <Method long getMillis()>
	//   15   28:invokevirtual   #346 <Method long DateTimeZone.getMillisKeepLocal(DateTimeZone, long)>
	//   16   31:lstore_2        
			setChronology(getChronology().withZone(datetimezone));
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #142 <Method Chronology getChronology()>
	//   20   37:aload_1         
	//   21   38:invokevirtual   #434 <Method Chronology Chronology.withZone(DateTimeZone)>
	//   22   41:invokevirtual   #435 <Method void setChronology(Chronology)>
			setMillis(l);
	//   23   44:aload_0         
	//   24   45:lload_2         
	//   25   46:invokevirtual   #133 <Method void setMillis(long)>
			return;
	//   26   49:return          
		}
	}

	public Property weekOfWeekyear()
	{
		return new Property(getChronology().weekOfWeekyear());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #418 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property weekyear()
	{
		return new Property(getChronology().weekyear());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #422 <Method DateTimeField Chronology.weekyear()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property year()
	{
		return new Property(getChronology().year());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #426 <Method DateTimeField Chronology.year()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfCentury()
	{
		return new Property(getChronology().yearOfCentury());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #439 <Method DateTimeField Chronology.yearOfCentury()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfEra()
	{
		return new Property(getChronology().yearOfEra());
	//    0    0:new             #12  <Class MutableDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #442 <Method DateTimeField Chronology.yearOfEra()>
	//    6   12:invokespecial   #218 <Method void MutableDateTime$Property(MutableDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public static final int ROUND_CEILING = 2;
	public static final int ROUND_FLOOR = 1;
	public static final int ROUND_HALF_CEILING = 4;
	public static final int ROUND_HALF_EVEN = 5;
	public static final int ROUND_HALF_FLOOR = 3;
	public static final int ROUND_NONE = 0;
	private static final long serialVersionUID = 0xf37e0267L;
	private DateTimeField iRoundingField;
	private int iRoundingMode;
}
