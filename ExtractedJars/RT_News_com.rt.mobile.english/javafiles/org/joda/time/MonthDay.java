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
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadablePartial, DateTimeFieldType, DateTimeUtils, LocalDate, 
//			DateTimeZone, Chronology, DurationFieldType, DateTimeField, 
//			ReadablePeriod

public final class MonthDay extends BasePartial
	implements ReadablePartial, Serializable
{

	public MonthDay()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void BasePartial()>
	//    2    4:return          
	}

	public MonthDay(int i, int j)
	{
		this(i, j, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #76  <Method void MonthDay(int, int, Chronology)>
	//    5    7:return          
	}

	public MonthDay(int i, int j, Chronology chronology)
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
	//   12   13:invokespecial   #79  <Method void BasePartial(int[], Chronology)>
	//   13   16:return          
	}

	public MonthDay(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #82  <Method void BasePartial(long)>
	//    3    5:return          
	}

	public MonthDay(long l, Chronology chronology)
	{
		super(l, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #85  <Method void BasePartial(long, Chronology)>
	//    4    6:return          
	}

	public MonthDay(Object obj)
	{
		super(obj, ((Chronology) (null)), ISODateTimeFormat.localDateParser());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #47  <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//    4    6:invokespecial   #89  <Method void BasePartial(Object, Chronology, DateTimeFormatter)>
	//    5    9:return          
	}

	public MonthDay(Object obj, Chronology chronology)
	{
		super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #96  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    6:invokestatic    #47  <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//    5    9:invokespecial   #89  <Method void BasePartial(Object, Chronology, DateTimeFormatter)>
	//    6   12:return          
	}

	public MonthDay(Chronology chronology)
	{
		super(chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method void BasePartial(Chronology)>
	//    3    5:return          
	}

	public MonthDay(DateTimeZone datetimezone)
	{
		super(((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #106 <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    3    5:invokespecial   #99  <Method void BasePartial(Chronology)>
	//    4    8:return          
	}

	MonthDay(MonthDay monthday, Chronology chronology)
	{
		super(((BasePartial) (monthday)), chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #110 <Method void BasePartial(BasePartial, Chronology)>
	//    4    6:return          
	}

	MonthDay(MonthDay monthday, int ai[])
	{
		super(((BasePartial) (monthday)), ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #114 <Method void BasePartial(BasePartial, int[])>
	//    4    6:return          
	}

	public static MonthDay fromCalendarFields(Calendar calendar)
	{
		if(calendar == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The calendar must not be null");
	//    2    4:new             #118 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #120 <String "The calendar must not be null">
	//    5   10:invokespecial   #123 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new MonthDay(calendar.get(2) + 1, calendar.get(5));
	//    7   14:new             #2   <Class MonthDay>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:iconst_2        
	//   11   20:invokevirtual   #129 <Method int Calendar.get(int)>
	//   12   23:iconst_1        
	//   13   24:iadd            
	//   14   25:aload_0         
	//   15   26:iconst_5        
	//   16   27:invokevirtual   #129 <Method int Calendar.get(int)>
	//   17   30:invokespecial   #131 <Method void MonthDay(int, int)>
	//   18   33:areturn         
	}

	public static MonthDay fromDateFields(Date date)
	{
		if(date == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The date must not be null");
	//    2    4:new             #118 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #135 <String "The date must not be null">
	//    5   10:invokespecial   #123 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new MonthDay(date.getMonth() + 1, date.getDate());
	//    7   14:new             #2   <Class MonthDay>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokevirtual   #141 <Method int Date.getMonth()>
	//   11   22:iconst_1        
	//   12   23:iadd            
	//   13   24:aload_0         
	//   14   25:invokevirtual   #144 <Method int Date.getDate()>
	//   15   28:invokespecial   #131 <Method void MonthDay(int, int)>
	//   16   31:areturn         
	}

	public static MonthDay now()
	{
		return new MonthDay();
	//    0    0:new             #2   <Class MonthDay>
	//    1    3:dup             
	//    2    4:invokespecial   #147 <Method void MonthDay()>
	//    3    7:areturn         
	}

	public static MonthDay now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #150 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #152 <String "Chronology must not be null">
	//    5   10:invokespecial   #153 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new MonthDay(chronology);
	//    7   14:new             #2   <Class MonthDay>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #154 <Method void MonthDay(Chronology)>
	//   11   22:areturn         
	}

	public static MonthDay now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #150 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #157 <String "Zone must not be null">
	//    5   10:invokespecial   #153 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new MonthDay(datetimezone);
	//    7   14:new             #2   <Class MonthDay>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #159 <Method void MonthDay(DateTimeZone)>
	//   11   22:areturn         
	}

	public static MonthDay parse(String s)
	{
		return parse(s, PARSER);
	//    0    0:aload_0         
	//    1    1:getstatic       #70  <Field DateTimeFormatter PARSER>
	//    2    4:invokestatic    #165 <Method MonthDay parse(String, DateTimeFormatter)>
	//    3    7:areturn         
	}

	public static MonthDay parse(String s, DateTimeFormatter datetimeformatter)
	{
		s = ((String) (datetimeformatter.parseLocalDate(s)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #170 <Method LocalDate DateTimeFormatter.parseLocalDate(String)>
	//    3    5:astore_0        
		return new MonthDay(((LocalDate) (s)).getMonthOfYear(), ((LocalDate) (s)).getDayOfMonth());
	//    4    6:new             #2   <Class MonthDay>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #175 <Method int LocalDate.getMonthOfYear()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #178 <Method int LocalDate.getDayOfMonth()>
	//   10   18:invokespecial   #131 <Method void MonthDay(int, int)>
	//   11   21:areturn         
	}

	private Object readResolve()
	{
		if(!DateTimeZone.UTC.equals(((Object) (getChronology().getZone()))))
	//*   0    0:getstatic       #186 <Field DateTimeZone DateTimeZone.UTC>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #189 <Method Chronology getChronology()>
	//*   3    7:invokevirtual   #195 <Method DateTimeZone Chronology.getZone()>
	//*   4   10:invokevirtual   #199 <Method boolean DateTimeZone.equals(Object)>
	//*   5   13:ifne            32
			return ((Object) (new MonthDay(this, getChronology().withUTC())));
	//    6   16:new             #2   <Class MonthDay>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:invokevirtual   #189 <Method Chronology getChronology()>
	//   11   25:invokevirtual   #202 <Method Chronology Chronology.withUTC()>
	//   12   28:invokespecial   #204 <Method void MonthDay(MonthDay, Chronology)>
	//   13   31:areturn         
		else
			return ((Object) (this));
	//   14   32:aload_0         
	//   15   33:areturn         
	}

	public Property dayOfMonth()
	{
	/* block-local class not found */
	class Property {}

		return new Property(1);
	//    0    0:new             #10  <Class MonthDay$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #208 <Method void MonthDay$Property(MonthDay, int)>
	//    5    9:areturn         
	}

	public int getDayOfMonth()
	{
		return getValue(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #211 <Method int getValue(int)>
	//    3    5:ireturn         
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
	//    2   24:new             #215 <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #216 <Method void StringBuilder()>
	//    5   31:astore_2        
			((StringBuilder) (chronology)).append("Invalid index: ");
	//    6   32:aload_2         
	//    7   33:ldc1            #218 <String "Invalid index: ">
	//    8   35:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			((StringBuilder) (chronology)).append(i);
	//   10   39:aload_2         
	//   11   40:iload_1         
	//   12   41:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (chronology)).toString());
	//   14   45:new             #227 <Class IndexOutOfBoundsException>
	//   15   48:dup             
	//   16   49:aload_2         
	//   17   50:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   18   53:invokespecial   #232 <Method void IndexOutOfBoundsException(String)>
	//   19   56:athrow          

		case 1: // '\001'
			return chronology.dayOfMonth();
	//   20   57:aload_2         
	//   21   58:invokevirtual   #235 <Method DateTimeField Chronology.dayOfMonth()>
	//   22   61:areturn         

		case 0: // '\0'
			return chronology.monthOfYear();
	//   23   62:aload_2         
	//   24   63:invokevirtual   #237 <Method DateTimeField Chronology.monthOfYear()>
	//   25   66:areturn         
		}
	}

	public DateTimeFieldType getFieldType(int i)
	{
		return FIELD_TYPES[i];
	//    0    0:getstatic       #36  <Field DateTimeFieldType[] FIELD_TYPES>
	//    1    3:iload_1         
	//    2    4:aaload          
	//    3    5:areturn         
	}

	public DateTimeFieldType[] getFieldTypes()
	{
		return (DateTimeFieldType[])((DateTimeFieldType []) (FIELD_TYPES)).clone();
	//    0    0:getstatic       #36  <Field DateTimeFieldType[] FIELD_TYPES>
	//    1    3:invokevirtual   #245 <Method Object _5B_Lorg.joda.time.DateTimeFieldType_3B_.clone()>
	//    2    6:checkcast       #242 <Class DateTimeFieldType[]>
	//    3    9:areturn         
	}

	public int getMonthOfYear()
	{
		return getValue(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #211 <Method int getValue(int)>
	//    3    5:ireturn         
	}

	public MonthDay minus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #251 <Method MonthDay withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public MonthDay minusDays(int i)
	{
		return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:invokestatic    #259 <Method DurationFieldType DurationFieldType.days()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #264 <Method int FieldUtils.safeNegate(int)>
	//    4    8:invokevirtual   #268 <Method MonthDay withFieldAdded(DurationFieldType, int)>
	//    5   11:areturn         
	}

	public MonthDay minusMonths(int i)
	{
		return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:invokestatic    #272 <Method DurationFieldType DurationFieldType.months()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #264 <Method int FieldUtils.safeNegate(int)>
	//    4    8:invokevirtual   #268 <Method MonthDay withFieldAdded(DurationFieldType, int)>
	//    5   11:areturn         
	}

	public Property monthOfYear()
	{
		return new Property(0);
	//    0    0:new             #10  <Class MonthDay$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #208 <Method void MonthDay$Property(MonthDay, int)>
	//    5    9:areturn         
	}

	public MonthDay plus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #251 <Method MonthDay withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public MonthDay plusDays(int i)
	{
		return withFieldAdded(DurationFieldType.days(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #259 <Method DurationFieldType DurationFieldType.days()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #268 <Method MonthDay withFieldAdded(DurationFieldType, int)>
	//    4    8:areturn         
	}

	public MonthDay plusMonths(int i)
	{
		return withFieldAdded(DurationFieldType.months(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #272 <Method DurationFieldType DurationFieldType.months()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #268 <Method MonthDay withFieldAdded(DurationFieldType, int)>
	//    4    8:areturn         
	}

	public Property property(DateTimeFieldType datetimefieldtype)
	{
		return new Property(indexOfSupported(datetimefieldtype));
	//    0    0:new             #10  <Class MonthDay$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #281 <Method int indexOfSupported(DateTimeFieldType)>
	//    6   10:invokespecial   #208 <Method void MonthDay$Property(MonthDay, int)>
	//    7   13:areturn         
	}

	public int size()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public LocalDate toLocalDate(int i)
	{
		return new LocalDate(i, getMonthOfYear(), getDayOfMonth(), getChronology());
	//    0    0:new             #172 <Class LocalDate>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #285 <Method int getMonthOfYear()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #286 <Method int getDayOfMonth()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #189 <Method Chronology getChronology()>
	//    9   17:invokespecial   #289 <Method void LocalDate(int, int, int, Chronology)>
	//   10   20:areturn         
	}

	public String toString()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #292 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #293 <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (DateTimeFieldType.monthOfYear())));
	//    4    8:aload_1         
	//    5    9:invokestatic    #31  <Method DateTimeFieldType DateTimeFieldType.monthOfYear()>
	//    6   12:invokeinterface #298 <Method boolean List.add(Object)>
	//    7   17:pop             
		((List) (arraylist)).add(((Object) (DateTimeFieldType.dayOfMonth())));
	//    8   18:aload_1         
	//    9   19:invokestatic    #34  <Method DateTimeFieldType DateTimeFieldType.dayOfMonth()>
	//   10   22:invokeinterface #298 <Method boolean List.add(Object)>
	//   11   27:pop             
		return ISODateTimeFormat.forFields(((java.util.Collection) (arraylist)), true, true).print(((ReadablePartial) (this)));
	//   12   28:aload_1         
	//   13   29:iconst_1        
	//   14   30:iconst_1        
	//   15   31:invokestatic    #302 <Method DateTimeFormatter ISODateTimeFormat.forFields(java.util.Collection, boolean, boolean)>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #306 <Method String DateTimeFormatter.print(ReadablePartial)>
	//   18   38:areturn         
	}

	public String toString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #308 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #65  <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #306 <Method String DateTimeFormatter.print(ReadablePartial)>
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
	//    3    5:invokevirtual   #308 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).withLocale(locale).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #65  <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #313 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #306 <Method String DateTimeFormatter.print(ReadablePartial)>
	//   11   21:areturn         
	}

	public MonthDay withChronologyRetainFields(Chronology chronology)
	{
		chronology = DateTimeUtils.getChronology(chronology).withUTC();
	//    0    0:aload_1         
	//    1    1:invokestatic    #96  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    2    4:invokevirtual   #202 <Method Chronology Chronology.withUTC()>
	//    3    7:astore_1        
		if(chronology == getChronology())
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #189 <Method Chronology getChronology()>
	//*   7   13:if_acmpne       18
		{
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			MonthDay monthday = new MonthDay(this, chronology);
	//   10   18:new             #2   <Class MonthDay>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #204 <Method void MonthDay(MonthDay, Chronology)>
	//   15   27:astore_2        
			chronology.validate(((ReadablePartial) (monthday)), getValues());
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #319 <Method int[] getValues()>
	//   20   34:invokevirtual   #323 <Method void Chronology.validate(ReadablePartial, int[])>
			return monthday;
	//   21   37:aload_2         
	//   22   38:areturn         
		}
	}

	public MonthDay withDayOfMonth(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #319 <Method int[] getValues()>
	//    2    4:astore_2        
		return new MonthDay(this, getChronology().dayOfMonth().set(((ReadablePartial) (this)), 1, ai, i));
	//    3    5:new             #2   <Class MonthDay>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #189 <Method Chronology getChronology()>
	//    8   14:invokevirtual   #235 <Method DateTimeField Chronology.dayOfMonth()>
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #330 <Method int[] DateTimeField.set(ReadablePartial, int, int[], int)>
	//   14   24:invokespecial   #332 <Method void MonthDay(MonthDay, int[])>
	//   15   27:areturn         
	}

	public MonthDay withField(DateTimeFieldType datetimefieldtype, int i)
	{
		int j = indexOfSupported(datetimefieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #281 <Method int indexOfSupported(DateTimeFieldType)>
	//    3    5:istore_3        
		if(i == getValue(j))
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:iload_3         
	//*   7    9:invokevirtual   #211 <Method int getValue(int)>
	//*   8   12:icmpne          17
		{
			return this;
	//    9   15:aload_0         
	//   10   16:areturn         
		} else
		{
			datetimefieldtype = ((DateTimeFieldType) (getValues()));
	//   11   17:aload_0         
	//   12   18:invokevirtual   #319 <Method int[] getValues()>
	//   13   21:astore_1        
			return new MonthDay(this, getField(j).set(((ReadablePartial) (this)), j, ((int []) (datetimefieldtype)), i));
	//   14   22:new             #2   <Class MonthDay>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:iload_3         
	//   19   29:invokevirtual   #337 <Method DateTimeField getField(int)>
	//   20   32:aload_0         
	//   21   33:iload_3         
	//   22   34:aload_1         
	//   23   35:iload_2         
	//   24   36:invokevirtual   #330 <Method int[] DateTimeField.set(ReadablePartial, int, int[], int)>
	//   25   39:invokespecial   #332 <Method void MonthDay(MonthDay, int[])>
	//   26   42:areturn         
		}
	}

	public MonthDay withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		int j = indexOfSupported(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #340 <Method int indexOfSupported(DurationFieldType)>
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
	//    9   13:invokevirtual   #319 <Method int[] getValues()>
	//   10   16:astore_1        
			return new MonthDay(this, getField(j).add(((ReadablePartial) (this)), j, ((int []) (durationfieldtype)), i));
	//   11   17:new             #2   <Class MonthDay>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:iload_3         
	//   16   24:invokevirtual   #337 <Method DateTimeField getField(int)>
	//   17   27:aload_0         
	//   18   28:iload_3         
	//   19   29:aload_1         
	//   20   30:iload_2         
	//   21   31:invokevirtual   #342 <Method int[] DateTimeField.add(ReadablePartial, int, int[], int)>
	//   22   34:invokespecial   #332 <Method void MonthDay(MonthDay, int[])>
	//   23   37:areturn         
		}
	}

	public MonthDay withMonthOfYear(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #319 <Method int[] getValues()>
	//    2    4:astore_2        
		return new MonthDay(this, getChronology().monthOfYear().set(((ReadablePartial) (this)), 0, ai, i));
	//    3    5:new             #2   <Class MonthDay>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #189 <Method Chronology getChronology()>
	//    8   14:invokevirtual   #237 <Method DateTimeField Chronology.monthOfYear()>
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #330 <Method int[] DateTimeField.set(ReadablePartial, int, int[], int)>
	//   14   24:invokespecial   #332 <Method void MonthDay(MonthDay, int[])>
	//   15   27:areturn         
	}

	public MonthDay withPeriodAdded(ReadablePeriod readableperiod, int i)
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
	//    7   11:invokevirtual   #319 <Method int[] getValues()>
	//    8   14:astore          5
			for(int j = 0; j < readableperiod.size();)
	//*   9   16:iconst_0        
	//*  10   17:istore_3        
	//*  11   18:iload_3         
	//*  12   19:aload_1         
	//*  13   20:invokeinterface #347 <Method int ReadablePeriod.size()>
	//*  14   25:icmpge          88
			{
				int k = indexOf(readableperiod.getFieldType(j));
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:iload_3         
	//   18   31:invokeinterface #350 <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//   19   36:invokevirtual   #353 <Method int indexOf(DurationFieldType)>
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
	//   27   53:invokevirtual   #337 <Method DateTimeField getField(int)>
	//   28   56:aload_0         
	//   29   57:iload           4
	//   30   59:aload           5
	//   31   61:aload_1         
	//   32   62:iload_3         
	//   33   63:invokeinterface #354 <Method int ReadablePeriod.getValue(int)>
	//   34   68:iload_2         
	//   35   69:invokestatic    #358 <Method int FieldUtils.safeMultiply(int, int)>
	//   36   72:invokevirtual   #342 <Method int[] DateTimeField.add(ReadablePartial, int, int[], int)>
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
			return new MonthDay(this, ai);
	//   45   88:new             #2   <Class MonthDay>
	//   46   91:dup             
	//   47   92:aload_0         
	//   48   93:aload           5
	//   49   95:invokespecial   #332 <Method void MonthDay(MonthDay, int[])>
	//   50   98:areturn         
		} else
		{
			return this;
	//   51   99:aload_0         
	//   52  100:areturn         
		}
	}

	public static final int DAY_OF_MONTH = 1;
	private static final DateTimeFieldType FIELD_TYPES[] = {
		DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()
	};
	public static final int MONTH_OF_YEAR = 0;
	private static final DateTimeFormatter PARSER = (new DateTimeFormatterBuilder()).appendOptional(ISODateTimeFormat.localDateParser().getParser()).appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();
	private static final long serialVersionUID = 0x463b2031L;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       DateTimeFieldType[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:invokestatic    #31  <Method DateTimeFieldType DateTimeFieldType.monthOfYear()>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:invokestatic    #34  <Method DateTimeFieldType DateTimeFieldType.dayOfMonth()>
	//    9   15:aastore         
	//   10   16:putstatic       #36  <Field DateTimeFieldType[] FIELD_TYPES>
	//   11   19:new             #38  <Class DateTimeFormatterBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #41  <Method void DateTimeFormatterBuilder()>
	//   14   26:invokestatic    #47  <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//   15   29:invokevirtual   #53  <Method org.joda.time.format.DateTimeParser DateTimeFormatter.getParser()>
	//   16   32:invokevirtual   #57  <Method DateTimeFormatterBuilder DateTimeFormatterBuilder.appendOptional(org.joda.time.format.DateTimeParser)>
	//   17   35:ldc1            #59  <String "--MM-dd">
	//   18   37:invokestatic    #65  <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//   19   40:invokevirtual   #53  <Method org.joda.time.format.DateTimeParser DateTimeFormatter.getParser()>
	//   20   43:invokevirtual   #57  <Method DateTimeFormatterBuilder DateTimeFormatterBuilder.appendOptional(org.joda.time.format.DateTimeParser)>
	//   21   46:invokevirtual   #68  <Method DateTimeFormatter DateTimeFormatterBuilder.toFormatter()>
	//   22   49:putstatic       #70  <Field DateTimeFormatter PARSER>
	//*  23   52:return          
	}
}
