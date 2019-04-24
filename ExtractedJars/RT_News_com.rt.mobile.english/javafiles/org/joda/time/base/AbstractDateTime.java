// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import java.util.*;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package org.joda.time.base:
//			AbstractInstant

public abstract class AbstractDateTime extends AbstractInstant
	implements ReadableDateTime
{

	protected AbstractDateTime()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AbstractInstant()>
	//    2    4:return          
	}

	public int get(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #15  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #17  <String "The DateTimeFieldType must not be null">
	//    5   10:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return datetimefieldtype.getField(getChronology()).get(getMillis());
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #24  <Method Chronology getChronology()>
	//   10   19:invokevirtual   #30  <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   11   22:aload_0         
	//   12   23:invokevirtual   #34  <Method long getMillis()>
	//   13   26:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//   14   29:ireturn         
	}

	public int getCenturyOfEra()
	{
		return getChronology().centuryOfEra().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #47  <Method DateTimeField Chronology.centuryOfEra()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getDayOfMonth()
	{
		return getChronology().dayOfMonth().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #51  <Method DateTimeField Chronology.dayOfMonth()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getDayOfWeek()
	{
		return getChronology().dayOfWeek().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #55  <Method DateTimeField Chronology.dayOfWeek()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getDayOfYear()
	{
		return getChronology().dayOfYear().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #59  <Method DateTimeField Chronology.dayOfYear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getEra()
	{
		return getChronology().era().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #63  <Method DateTimeField Chronology.era()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getHourOfDay()
	{
		return getChronology().hourOfDay().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #67  <Method DateTimeField Chronology.hourOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMillisOfDay()
	{
		return getChronology().millisOfDay().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #71  <Method DateTimeField Chronology.millisOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMillisOfSecond()
	{
		return getChronology().millisOfSecond().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #75  <Method DateTimeField Chronology.millisOfSecond()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMinuteOfDay()
	{
		return getChronology().minuteOfDay().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #79  <Method DateTimeField Chronology.minuteOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMinuteOfHour()
	{
		return getChronology().minuteOfHour().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #83  <Method DateTimeField Chronology.minuteOfHour()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMonthOfYear()
	{
		return getChronology().monthOfYear().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #87  <Method DateTimeField Chronology.monthOfYear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getSecondOfDay()
	{
		return getChronology().secondOfDay().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #91  <Method DateTimeField Chronology.secondOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getSecondOfMinute()
	{
		return getChronology().secondOfMinute().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #95  <Method DateTimeField Chronology.secondOfMinute()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getWeekOfWeekyear()
	{
		return getChronology().weekOfWeekyear().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #99  <Method DateTimeField Chronology.weekOfWeekyear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getWeekyear()
	{
		return getChronology().weekyear().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #103 <Method DateTimeField Chronology.weekyear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYear()
	{
		return getChronology().year().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #107 <Method DateTimeField Chronology.year()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYearOfCentury()
	{
		return getChronology().yearOfCentury().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #111 <Method DateTimeField Chronology.yearOfCentury()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYearOfEra()
	{
		return getChronology().yearOfEra().get(getMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #115 <Method DateTimeField Chronology.yearOfEra()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method long getMillis()>
	//    5   11:invokevirtual   #39  <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public Calendar toCalendar(Locale locale)
	{
		Locale locale1 = locale;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(locale == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			locale1 = Locale.getDefault();
	//    4    6:invokestatic    #123 <Method Locale Locale.getDefault()>
	//    5    9:astore_2        
		locale = ((Locale) (Calendar.getInstance(getZone().toTimeZone(), locale1)));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #127 <Method DateTimeZone getZone()>
	//    8   14:invokevirtual   #133 <Method java.util.TimeZone DateTimeZone.toTimeZone()>
	//    9   17:aload_2         
	//   10   18:invokestatic    #139 <Method Calendar Calendar.getInstance(java.util.TimeZone, Locale)>
	//   11   21:astore_1        
		((Calendar) (locale)).setTime(toDate());
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #143 <Method java.util.Date toDate()>
	//   15   27:invokevirtual   #147 <Method void Calendar.setTime(java.util.Date)>
		return ((Calendar) (locale));
	//   16   30:aload_1         
	//   17   31:areturn         
	}

	public GregorianCalendar toGregorianCalendar()
	{
		GregorianCalendar gregoriancalendar = new GregorianCalendar(getZone().toTimeZone());
	//    0    0:new             #151 <Class GregorianCalendar>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #127 <Method DateTimeZone getZone()>
	//    4    8:invokevirtual   #133 <Method java.util.TimeZone DateTimeZone.toTimeZone()>
	//    5   11:invokespecial   #154 <Method void GregorianCalendar(java.util.TimeZone)>
	//    6   14:astore_1        
		gregoriancalendar.setTime(toDate());
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #143 <Method java.util.Date toDate()>
	//   10   20:invokevirtual   #155 <Method void GregorianCalendar.setTime(java.util.Date)>
		return gregoriancalendar;
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method String AbstractInstant.toString()>
	//    2    4:areturn         
	}

	public String toString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #163 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).print(((org.joda.time.ReadableInstant) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #169 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #175 <Method String DateTimeFormatter.print(org.joda.time.ReadableInstant)>
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
	//    3    5:invokevirtual   #163 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).withLocale(locale).print(((org.joda.time.ReadableInstant) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #169 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #180 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #175 <Method String DateTimeFormatter.print(org.joda.time.ReadableInstant)>
	//   11   21:areturn         
	}
}
