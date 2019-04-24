// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import java.util.*;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadablePartial, DateTimeFieldType, DateTimeUtils, LocalDate, 
//			DateTimeZone, Chronology, DurationFieldType, Interval, 
//			DateTimeField, ReadablePeriod

public final class YearMonth extends BasePartial
	implements ReadablePartial, Serializable
{

	public YearMonth()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void BasePartial()>
	//    2    4:return          
	}

	public YearMonth(int i, int j)
	{
		this(i, j, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #42  <Method void YearMonth(int, int, Chronology)>
	//    5    7:return          
	}

	public YearMonth(int i, int j, Chronology chronology)
	{
		super(new int[] {
			i, j
		}, chronology);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:newarray        int[]
	//    3    4:dup             
	//    4    5:iconst_0        
	//    5    6:iload_1         
	//    6    7:iastore         
	//    7    8:dup             
	//    8    9:iconst_1        
	//    9   10:iload_2         
	//   10   11:iastore         
	//   11   12:aload_3         
	//   12   13:invokespecial   #45  <Method void BasePartial(int[], Chronology)>
	//   13   16:return          
	}

	public YearMonth(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #48  <Method void BasePartial(long)>
	//    3    5:return          
	}

	public YearMonth(long l, Chronology chronology)
	{
		super(l, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #51  <Method void BasePartial(long, Chronology)>
	//    4    6:return          
	}

	public YearMonth(Object obj)
	{
		super(obj, ((Chronology) (null)), ISODateTimeFormat.localDateParser());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #58  <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//    4    6:invokespecial   #61  <Method void BasePartial(Object, Chronology, DateTimeFormatter)>
	//    5    9:return          
	}

	public YearMonth(Object obj, Chronology chronology)
	{
		super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #68  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    6:invokestatic    #58  <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//    5    9:invokespecial   #61  <Method void BasePartial(Object, Chronology, DateTimeFormatter)>
	//    6   12:return          
	}

	public YearMonth(Chronology chronology)
	{
		super(chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method void BasePartial(Chronology)>
	//    3    5:return          
	}

	public YearMonth(DateTimeZone datetimezone)
	{
		super(((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #78  <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    3    5:invokespecial   #71  <Method void BasePartial(Chronology)>
	//    4    8:return          
	}

	YearMonth(YearMonth yearmonth, Chronology chronology)
	{
		super(((BasePartial) (yearmonth)), chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #82  <Method void BasePartial(BasePartial, Chronology)>
	//    4    6:return          
	}

	YearMonth(YearMonth yearmonth, int ai[])
	{
		super(((BasePartial) (yearmonth)), ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #86  <Method void BasePartial(BasePartial, int[])>
	//    4    6:return          
	}

	public static YearMonth fromCalendarFields(Calendar calendar)
	{
		if(calendar == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The calendar must not be null");
	//    2    4:new             #90  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #92  <String "The calendar must not be null">
	//    5   10:invokespecial   #95  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new YearMonth(calendar.get(1), calendar.get(2) + 1);
	//    7   14:new             #2   <Class YearMonth>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #101 <Method int Calendar.get(int)>
	//   12   23:aload_0         
	//   13   24:iconst_2        
	//   14   25:invokevirtual   #101 <Method int Calendar.get(int)>
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:invokespecial   #103 <Method void YearMonth(int, int)>
	//   18   33:areturn         
	}

	public static YearMonth fromDateFields(Date date)
	{
		if(date == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The date must not be null");
	//    2    4:new             #90  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #107 <String "The date must not be null">
	//    5   10:invokespecial   #95  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
	//    7   14:new             #2   <Class YearMonth>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokevirtual   #113 <Method int Date.getYear()>
	//   11   22:sipush          1900
	//   12   25:iadd            
	//   13   26:aload_0         
	//   14   27:invokevirtual   #116 <Method int Date.getMonth()>
	//   15   30:iconst_1        
	//   16   31:iadd            
	//   17   32:invokespecial   #103 <Method void YearMonth(int, int)>
	//   18   35:areturn         
	}

	public static YearMonth now()
	{
		return new YearMonth();
	//    0    0:new             #2   <Class YearMonth>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void YearMonth()>
	//    3    7:areturn         
	}

	public static YearMonth now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #122 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #124 <String "Chronology must not be null">
	//    5   10:invokespecial   #125 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new YearMonth(chronology);
	//    7   14:new             #2   <Class YearMonth>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #126 <Method void YearMonth(Chronology)>
	//   11   22:areturn         
	}

	public static YearMonth now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #122 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #129 <String "Zone must not be null">
	//    5   10:invokespecial   #125 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new YearMonth(datetimezone);
	//    7   14:new             #2   <Class YearMonth>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #131 <Method void YearMonth(DateTimeZone)>
	//   11   22:areturn         
	}

	public static YearMonth parse(String s)
	{
		return parse(s, ISODateTimeFormat.localDateParser());
	//    0    0:aload_0         
	//    1    1:invokestatic    #58  <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//    2    4:invokestatic    #137 <Method YearMonth parse(String, DateTimeFormatter)>
	//    3    7:areturn         
	}

	public static YearMonth parse(String s, DateTimeFormatter datetimeformatter)
	{
		s = ((String) (datetimeformatter.parseLocalDate(s)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #144 <Method LocalDate DateTimeFormatter.parseLocalDate(String)>
	//    3    5:astore_0        
		return new YearMonth(((LocalDate) (s)).getYear(), ((LocalDate) (s)).getMonthOfYear());
	//    4    6:new             #2   <Class YearMonth>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #147 <Method int LocalDate.getYear()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #150 <Method int LocalDate.getMonthOfYear()>
	//   10   18:invokespecial   #103 <Method void YearMonth(int, int)>
	//   11   21:areturn         
	}

	private Object readResolve()
	{
		if(!DateTimeZone.UTC.equals(((Object) (getChronology().getZone()))))
	//*   0    0:getstatic       #158 <Field DateTimeZone DateTimeZone.UTC>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #161 <Method Chronology getChronology()>
	//*   3    7:invokevirtual   #167 <Method DateTimeZone Chronology.getZone()>
	//*   4   10:invokevirtual   #171 <Method boolean DateTimeZone.equals(Object)>
	//*   5   13:ifne            32
			return ((Object) (new YearMonth(this, getChronology().withUTC())));
	//    6   16:new             #2   <Class YearMonth>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:invokevirtual   #161 <Method Chronology getChronology()>
	//   11   25:invokevirtual   #174 <Method Chronology Chronology.withUTC()>
	//   12   28:invokespecial   #176 <Method void YearMonth(YearMonth, Chronology)>
	//   13   31:areturn         
		else
			return ((Object) (this));
	//   14   32:aload_0         
	//   15   33:areturn         
	}

	protected DateTimeField getField(int i, Chronology chronology)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 62
	//	               1 57
		default:
			chronology = ((Chronology) (new StringBuilder()));
	//    2   24:new             #180 <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #181 <Method void StringBuilder()>
	//    5   31:astore_2        
			((StringBuilder) (chronology)).append("Invalid index: ");
	//    6   32:aload_2         
	//    7   33:ldc1            #183 <String "Invalid index: ">
	//    8   35:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			((StringBuilder) (chronology)).append(i);
	//   10   39:aload_2         
	//   11   40:iload_1         
	//   12   41:invokevirtual   #190 <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (chronology)).toString());
	//   14   45:new             #192 <Class IndexOutOfBoundsException>
	//   15   48:dup             
	//   16   49:aload_2         
	//   17   50:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   18   53:invokespecial   #197 <Method void IndexOutOfBoundsException(String)>
	//   19   56:athrow          

		case 1: // '\001'
			return chronology.monthOfYear();
	//   20   57:aload_2         
	//   21   58:invokevirtual   #200 <Method DateTimeField Chronology.monthOfYear()>
	//   22   61:areturn         

		case 0: // '\0'
			return chronology.year();
	//   23   62:aload_2         
	//   24   63:invokevirtual   #202 <Method DateTimeField Chronology.year()>
	//   25   66:areturn         
		}
	}

	public DateTimeFieldType getFieldType(int i)
	{
		return FIELD_TYPES[i];
	//    0    0:getstatic       #34  <Field DateTimeFieldType[] FIELD_TYPES>
	//    1    3:iload_1         
	//    2    4:aaload          
	//    3    5:areturn         
	}

	public DateTimeFieldType[] getFieldTypes()
	{
		return (DateTimeFieldType[])((DateTimeFieldType []) (FIELD_TYPES)).clone();
	//    0    0:getstatic       #34  <Field DateTimeFieldType[] FIELD_TYPES>
	//    1    3:invokevirtual   #210 <Method Object _5B_Lorg.joda.time.DateTimeFieldType_3B_.clone()>
	//    2    6:checkcast       #207 <Class DateTimeFieldType[]>
	//    3    9:areturn         
	}

	public int getMonthOfYear()
	{
		return getValue(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #213 <Method int getValue(int)>
	//    3    5:ireturn         
	}

	public int getYear()
	{
		return getValue(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #213 <Method int getValue(int)>
	//    3    5:ireturn         
	}

	public YearMonth minus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #219 <Method YearMonth withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public YearMonth minusMonths(int i)
	{
		return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:invokestatic    #227 <Method DurationFieldType DurationFieldType.months()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #232 <Method int FieldUtils.safeNegate(int)>
	//    4    8:invokevirtual   #236 <Method YearMonth withFieldAdded(DurationFieldType, int)>
	//    5   11:areturn         
	}

	public YearMonth minusYears(int i)
	{
		return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:invokestatic    #240 <Method DurationFieldType DurationFieldType.years()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #232 <Method int FieldUtils.safeNegate(int)>
	//    4    8:invokevirtual   #236 <Method YearMonth withFieldAdded(DurationFieldType, int)>
	//    5   11:areturn         
	}

	public Property monthOfYear()
	{
	/* block-local class not found */
	class Property {}

		return new Property(1);
	//    0    0:new             #10  <Class YearMonth$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #244 <Method void YearMonth$Property(YearMonth, int)>
	//    5    9:areturn         
	}

	public YearMonth plus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #219 <Method YearMonth withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public YearMonth plusMonths(int i)
	{
		return withFieldAdded(DurationFieldType.months(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #227 <Method DurationFieldType DurationFieldType.months()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #236 <Method YearMonth withFieldAdded(DurationFieldType, int)>
	//    4    8:areturn         
	}

	public YearMonth plusYears(int i)
	{
		return withFieldAdded(DurationFieldType.years(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #240 <Method DurationFieldType DurationFieldType.years()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #236 <Method YearMonth withFieldAdded(DurationFieldType, int)>
	//    4    8:areturn         
	}

	public Property property(DateTimeFieldType datetimefieldtype)
	{
		return new Property(indexOfSupported(datetimefieldtype));
	//    0    0:new             #10  <Class YearMonth$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #253 <Method int indexOfSupported(DateTimeFieldType)>
	//    6   10:invokespecial   #244 <Method void YearMonth$Property(YearMonth, int)>
	//    7   13:areturn         
	}

	public int size()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public Interval toInterval()
	{
		return toInterval(((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #259 <Method Interval toInterval(DateTimeZone)>
	//    3    5:areturn         
	}

	public Interval toInterval(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #262 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		return new Interval(((ReadableInstant) (toLocalDate(1).toDateTimeAtStartOfDay(datetimezone))), ((ReadableInstant) (plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(datetimezone))));
	//    3    5:new             #264 <Class Interval>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #268 <Method LocalDate toLocalDate(int)>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #272 <Method DateTime LocalDate.toDateTimeAtStartOfDay(DateTimeZone)>
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #274 <Method YearMonth plusMonths(int)>
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #268 <Method LocalDate toLocalDate(int)>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #272 <Method DateTime LocalDate.toDateTimeAtStartOfDay(DateTimeZone)>
	//   17   31:invokespecial   #277 <Method void Interval(ReadableInstant, ReadableInstant)>
	//   18   34:areturn         
	}

	public LocalDate toLocalDate(int i)
	{
		return new LocalDate(getYear(), getMonthOfYear(), i, getChronology());
	//    0    0:new             #146 <Class LocalDate>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #278 <Method int getYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #279 <Method int getMonthOfYear()>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #161 <Method Chronology getChronology()>
	//    9   17:invokespecial   #282 <Method void LocalDate(int, int, int, Chronology)>
	//   10   20:areturn         
	}

	public String toString()
	{
		return ISODateTimeFormat.yearMonth().print(((ReadablePartial) (this)));
	//    0    0:invokestatic    #286 <Method DateTimeFormatter ISODateTimeFormat.yearMonth()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #290 <Method String DateTimeFormatter.print(ReadablePartial)>
	//    3    7:areturn         
	}

	public String toString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #292 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #298 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #290 <Method String DateTimeFormatter.print(ReadablePartial)>
	//    9   17:areturn         
	}

	public String toString(String s, Locale locale)
		throws IllegalArgumentException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #292 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).withLocale(locale).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #298 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #303 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #290 <Method String DateTimeFormatter.print(ReadablePartial)>
	//   11   21:areturn         
	}

	public YearMonth withChronologyRetainFields(Chronology chronology)
	{
		chronology = DateTimeUtils.getChronology(chronology).withUTC();
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    2    4:invokevirtual   #174 <Method Chronology Chronology.withUTC()>
	//    3    7:astore_1        
		if(chronology == getChronology())
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #161 <Method Chronology getChronology()>
	//*   7   13:if_acmpne       18
		{
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			YearMonth yearmonth = new YearMonth(this, chronology);
	//   10   18:new             #2   <Class YearMonth>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #176 <Method void YearMonth(YearMonth, Chronology)>
	//   15   27:astore_2        
			chronology.validate(((ReadablePartial) (yearmonth)), getValues());
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #309 <Method int[] getValues()>
	//   20   34:invokevirtual   #313 <Method void Chronology.validate(ReadablePartial, int[])>
			return yearmonth;
	//   21   37:aload_2         
	//   22   38:areturn         
		}
	}

	public YearMonth withField(DateTimeFieldType datetimefieldtype, int i)
	{
		int j = indexOfSupported(datetimefieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #253 <Method int indexOfSupported(DateTimeFieldType)>
	//    3    5:istore_3        
		if(i == getValue(j))
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:iload_3         
	//*   7    9:invokevirtual   #213 <Method int getValue(int)>
	//*   8   12:icmpne          17
		{
			return this;
	//    9   15:aload_0         
	//   10   16:areturn         
		} else
		{
			datetimefieldtype = ((DateTimeFieldType) (getValues()));
	//   11   17:aload_0         
	//   12   18:invokevirtual   #309 <Method int[] getValues()>
	//   13   21:astore_1        
			return new YearMonth(this, getField(j).set(((ReadablePartial) (this)), j, ((int []) (datetimefieldtype)), i));
	//   14   22:new             #2   <Class YearMonth>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:iload_3         
	//   19   29:invokevirtual   #318 <Method DateTimeField getField(int)>
	//   20   32:aload_0         
	//   21   33:iload_3         
	//   22   34:aload_1         
	//   23   35:iload_2         
	//   24   36:invokevirtual   #324 <Method int[] DateTimeField.set(ReadablePartial, int, int[], int)>
	//   25   39:invokespecial   #326 <Method void YearMonth(YearMonth, int[])>
	//   26   42:areturn         
		}
	}

	public YearMonth withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		int j = indexOfSupported(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #329 <Method int indexOfSupported(DurationFieldType)>
	//    3    5:istore_3        
		if(i == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            12
		{
			return this;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			durationfieldtype = ((DurationFieldType) (getValues()));
	//    8   12:aload_0         
	//    9   13:invokevirtual   #309 <Method int[] getValues()>
	//   10   16:astore_1        
			return new YearMonth(this, getField(j).add(((ReadablePartial) (this)), j, ((int []) (durationfieldtype)), i));
	//   11   17:new             #2   <Class YearMonth>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:iload_3         
	//   16   24:invokevirtual   #318 <Method DateTimeField getField(int)>
	//   17   27:aload_0         
	//   18   28:iload_3         
	//   19   29:aload_1         
	//   20   30:iload_2         
	//   21   31:invokevirtual   #332 <Method int[] DateTimeField.add(ReadablePartial, int, int[], int)>
	//   22   34:invokespecial   #326 <Method void YearMonth(YearMonth, int[])>
	//   23   37:areturn         
		}
	}

	public YearMonth withMonthOfYear(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method int[] getValues()>
	//    2    4:astore_2        
		return new YearMonth(this, getChronology().monthOfYear().set(((ReadablePartial) (this)), 1, ai, i));
	//    3    5:new             #2   <Class YearMonth>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #161 <Method Chronology getChronology()>
	//    8   14:invokevirtual   #200 <Method DateTimeField Chronology.monthOfYear()>
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #324 <Method int[] DateTimeField.set(ReadablePartial, int, int[], int)>
	//   14   24:invokespecial   #326 <Method void YearMonth(YearMonth, int[])>
	//   15   27:areturn         
	}

	public YearMonth withPeriodAdded(ReadablePeriod readableperiod, int i)
	{
		if(readableperiod != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          99
		{
			if(i == 0)
	//*   2    4:iload_2         
	//*   3    5:ifne            10
				return this;
	//    4    8:aload_0         
	//    5    9:areturn         
			int ai[] = getValues();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #309 <Method int[] getValues()>
	//    8   14:astore          5
			for(int j = 0; j < readableperiod.size();)
	//*   9   16:iconst_0        
	//*  10   17:istore_3        
	//*  11   18:iload_3         
	//*  12   19:aload_1         
	//*  13   20:invokeinterface #337 <Method int ReadablePeriod.size()>
	//*  14   25:icmpge          88
			{
				int k = indexOf(readableperiod.getFieldType(j));
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:iload_3         
	//   18   31:invokeinterface #340 <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//   19   36:invokevirtual   #343 <Method int indexOf(DurationFieldType)>
	//   20   39:istore          4
				int ai1[] = ai;
	//   21   41:aload           5
	//   22   43:astore          6
				if(k >= 0)
	//*  23   45:iload           4
	//*  24   47:iflt            77
					ai1 = getField(k).add(((ReadablePartial) (this)), k, ai, FieldUtils.safeMultiply(readableperiod.getValue(j), i));
	//   25   50:aload_0         
	//   26   51:iload           4
	//   27   53:invokevirtual   #318 <Method DateTimeField getField(int)>
	//   28   56:aload_0         
	//   29   57:iload           4
	//   30   59:aload           5
	//   31   61:aload_1         
	//   32   62:iload_3         
	//   33   63:invokeinterface #344 <Method int ReadablePeriod.getValue(int)>
	//   34   68:iload_2         
	//   35   69:invokestatic    #348 <Method int FieldUtils.safeMultiply(int, int)>
	//   36   72:invokevirtual   #332 <Method int[] DateTimeField.add(ReadablePartial, int, int[], int)>
	//   37   75:astore          6
				j++;
	//   38   77:iload_3         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:istore_3        
				ai = ai1;
	//   42   81:aload           6
	//   43   83:astore          5
			}

	//*  44   85:goto            18
			return new YearMonth(this, ai);
	//   45   88:new             #2   <Class YearMonth>
	//   46   91:dup             
	//   47   92:aload_0         
	//   48   93:aload           5
	//   49   95:invokespecial   #326 <Method void YearMonth(YearMonth, int[])>
	//   50   98:areturn         
		} else
		{
			return this;
	//   51   99:aload_0         
	//   52  100:areturn         
		}
	}

	public YearMonth withYear(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method int[] getValues()>
	//    2    4:astore_2        
		return new YearMonth(this, getChronology().year().set(((ReadablePartial) (this)), 0, ai, i));
	//    3    5:new             #2   <Class YearMonth>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #161 <Method Chronology getChronology()>
	//    8   14:invokevirtual   #202 <Method DateTimeField Chronology.year()>
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #324 <Method int[] DateTimeField.set(ReadablePartial, int, int[], int)>
	//   14   24:invokespecial   #326 <Method void YearMonth(YearMonth, int[])>
	//   15   27:areturn         
	}

	public Property year()
	{
		return new Property(0);
	//    0    0:new             #10  <Class YearMonth$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #244 <Method void YearMonth$Property(YearMonth, int)>
	//    5    9:areturn         
	}

	private static final DateTimeFieldType FIELD_TYPES[] = {
		DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()
	};
	public static final int MONTH_OF_YEAR = 1;
	public static final int YEAR = 0;
	private static final long serialVersionUID = 0xdd7a1c33L;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       DateTimeFieldType[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:invokestatic    #29  <Method DateTimeFieldType DateTimeFieldType.year()>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:invokestatic    #32  <Method DateTimeFieldType DateTimeFieldType.monthOfYear()>
	//    9   15:aastore         
	//   10   16:putstatic       #34  <Field DateTimeFieldType[] FIELD_TYPES>
	//*  11   19:return          
	}
}
