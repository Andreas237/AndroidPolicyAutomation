// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import java.util.*;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadablePartial, DurationFieldType, DateTimeUtils, Chronology, 
//			DateTimeZone, DateTimeField, DateTimeFieldType, DurationField, 
//			DateMidnight, LocalTime, DateTime, Interval, 
//			LocalDateTime, ReadablePeriod

public final class LocalDate extends BaseLocal
	implements ReadablePartial, Serializable
{

	public LocalDate()
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:invokestatic    #80  <Method ISOChronology ISOChronology.getInstance()>
	//    3    7:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//    4   10:return          
	}

	public LocalDate(int i, int j, int k)
	{
		this(i, j, k, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #87  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    5    7:invokespecial   #90  <Method void LocalDate(int, int, int, Chronology)>
	//    6   10:return          
	}

	public LocalDate(int i, int j, int k, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void BaseLocal()>
		chronology = DateTimeUtils.getChronology(chronology).withUTC();
	//    2    4:aload           4
	//    3    6:invokestatic    #95  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    9:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//    5   12:astore          4
		long l = chronology.getDateTimeMillis(i, j, k, 0);
	//    6   14:aload           4
	//    7   16:iload_1         
	//    8   17:iload_2         
	//    9   18:iload_3         
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #105 <Method long Chronology.getDateTimeMillis(int, int, int, int)>
	//   12   23:lstore          5
		iChronology = chronology;
	//   13   25:aload_0         
	//   14   26:aload           4
	//   15   28:putfield        #107 <Field Chronology iChronology>
		iLocalMillis = l;
	//   16   31:aload_0         
	//   17   32:lload           5
	//   18   34:putfield        #109 <Field long iLocalMillis>
	//   19   37:return          
	}

	public LocalDate(long l)
	{
		this(l, ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #80  <Method ISOChronology ISOChronology.getInstance()>
	//    3    5:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//    4    8:return          
	}

	public LocalDate(long l, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void BaseLocal()>
		chronology = DateTimeUtils.getChronology(chronology);
	//    2    4:aload_3         
	//    3    5:invokestatic    #95  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    8:astore_3        
		l = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, l);
	//    5    9:aload_3         
	//    6   10:invokevirtual   #114 <Method DateTimeZone Chronology.getZone()>
	//    7   13:getstatic       #120 <Field DateTimeZone DateTimeZone.UTC>
	//    8   16:lload_1         
	//    9   17:invokevirtual   #124 <Method long DateTimeZone.getMillisKeepLocal(DateTimeZone, long)>
	//   10   20:lstore_1        
		chronology = chronology.withUTC();
	//   11   21:aload_3         
	//   12   22:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//   13   25:astore_3        
		iLocalMillis = chronology.dayOfMonth().roundFloor(l);
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//   17   31:lload_1         
	//   18   32:invokevirtual   #134 <Method long DateTimeField.roundFloor(long)>
	//   19   35:putfield        #109 <Field long iLocalMillis>
		iChronology = chronology;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #107 <Field Chronology iChronology>
	//   23   43:return          
	}

	public LocalDate(long l, DateTimeZone datetimezone)
	{
		this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #138 <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    6:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//    5    9:return          
	}

	public LocalDate(Object obj)
	{
		this(obj, (Chronology)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #97  <Class Chronology>
	//    4    6:invokespecial   #142 <Method void LocalDate(Object, Chronology)>
	//    5    9:return          
	}

	public LocalDate(Object obj, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void BaseLocal()>
		PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
	//    2    4:invokestatic    #147 <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #151 <Method PartialConverter ConverterManager.getPartialConverter(Object)>
	//    5   11:astore_3        
		chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #156 <Method Chronology PartialConverter.getChronology(Object, Chronology)>
	//   10   20:invokestatic    #95  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   11   23:astore_2        
		iChronology = chronology.withUTC();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//   15   29:putfield        #107 <Field Chronology iChronology>
		obj = ((Object) (partialconverter.getPartialValues(((ReadablePartial) (this)), obj, chronology, ISODateTimeFormat.localDateParser())));
	//   16   32:aload_3         
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #162 <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//   21   39:invokeinterface #166 <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology, DateTimeFormatter)>
	//   22   44:astore_1        
		iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], 0);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #107 <Field Chronology iChronology>
	//   26   50:aload_1         
	//   27   51:iconst_0        
	//   28   52:iaload          
	//   29   53:aload_1         
	//   30   54:iconst_1        
	//   31   55:iaload          
	//   32   56:aload_1         
	//   33   57:iconst_2        
	//   34   58:iaload          
	//   35   59:iconst_0        
	//   36   60:invokevirtual   #105 <Method long Chronology.getDateTimeMillis(int, int, int, int)>
	//   37   63:putfield        #109 <Field long iLocalMillis>
	//   38   66:return          
	}

	public LocalDate(Object obj, DateTimeZone datetimezone)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void BaseLocal()>
		PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
	//    2    4:invokestatic    #147 <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #151 <Method PartialConverter ConverterManager.getPartialConverter(Object)>
	//    5   11:astore_3        
		datetimezone = ((DateTimeZone) (DateTimeUtils.getChronology(partialconverter.getChronology(obj, datetimezone))));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #170 <Method Chronology PartialConverter.getChronology(Object, DateTimeZone)>
	//   10   20:invokestatic    #95  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   11   23:astore_2        
		iChronology = ((Chronology) (datetimezone)).withUTC();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//   15   29:putfield        #107 <Field Chronology iChronology>
		obj = ((Object) (partialconverter.getPartialValues(((ReadablePartial) (this)), obj, ((Chronology) (datetimezone)), ISODateTimeFormat.localDateParser())));
	//   16   32:aload_3         
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #162 <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//   21   39:invokeinterface #166 <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology, DateTimeFormatter)>
	//   22   44:astore_1        
		iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], 0);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #107 <Field Chronology iChronology>
	//   26   50:aload_1         
	//   27   51:iconst_0        
	//   28   52:iaload          
	//   29   53:aload_1         
	//   30   54:iconst_1        
	//   31   55:iaload          
	//   32   56:aload_1         
	//   33   57:iconst_2        
	//   34   58:iaload          
	//   35   59:iconst_0        
	//   36   60:invokevirtual   #105 <Method long Chronology.getDateTimeMillis(int, int, int, int)>
	//   37   63:putfield        #109 <Field long iLocalMillis>
	//   38   66:return          
	}

	public LocalDate(Chronology chronology)
	{
		this(DateTimeUtils.currentTimeMillis(), chronology);
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//    4    8:return          
	}

	public LocalDate(DateTimeZone datetimezone)
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #138 <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    8:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//    5   11:return          
	}

	public static LocalDate fromCalendarFields(Calendar calendar)
	{
		if(calendar == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The calendar must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #178 <String "The calendar must not be null">
	//    5   10:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		int j = calendar.get(0);
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #187 <Method int Calendar.get(int)>
	//   10   19:istore_2        
		int i = calendar.get(1);
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:invokevirtual   #187 <Method int Calendar.get(int)>
	//   14   25:istore_1        
		if(j != 1)
	//*  15   26:iload_2         
	//*  16   27:iconst_1        
	//*  17   28:icmpne          34
	//*  18   31:goto            38
			i = 1 - i;
	//   19   34:iconst_1        
	//   20   35:iload_1         
	//   21   36:isub            
	//   22   37:istore_1        
		return new LocalDate(i, calendar.get(2) + 1, calendar.get(5));
	//   23   38:new             #2   <Class LocalDate>
	//   24   41:dup             
	//   25   42:iload_1         
	//   26   43:aload_0         
	//   27   44:iconst_2        
	//   28   45:invokevirtual   #187 <Method int Calendar.get(int)>
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:aload_0         
	//   32   51:iconst_5        
	//   33   52:invokevirtual   #187 <Method int Calendar.get(int)>
	//   34   55:invokespecial   #189 <Method void LocalDate(int, int, int)>
	//   35   58:areturn         
	}

	public static LocalDate fromDateFields(Date date)
	{
		if(date == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The date must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #193 <String "The date must not be null">
	//    5   10:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(date.getTime() < 0L)
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #198 <Method long Date.getTime()>
	//*   9   18:lconst_0        
	//*  10   19:lcmp            
	//*  11   20:ifge            41
		{
			GregorianCalendar gregoriancalendar = new GregorianCalendar();
	//   12   23:new             #200 <Class GregorianCalendar>
	//   13   26:dup             
	//   14   27:invokespecial   #201 <Method void GregorianCalendar()>
	//   15   30:astore_1        
			gregoriancalendar.setTime(date);
	//   16   31:aload_1         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #205 <Method void GregorianCalendar.setTime(Date)>
			return fromCalendarFields(((Calendar) (gregoriancalendar)));
	//   19   36:aload_1         
	//   20   37:invokestatic    #207 <Method LocalDate fromCalendarFields(Calendar)>
	//   21   40:areturn         
		} else
		{
			return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
	//   22   41:new             #2   <Class LocalDate>
	//   23   44:dup             
	//   24   45:aload_0         
	//   25   46:invokevirtual   #211 <Method int Date.getYear()>
	//   26   49:sipush          1900
	//   27   52:iadd            
	//   28   53:aload_0         
	//   29   54:invokevirtual   #214 <Method int Date.getMonth()>
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:aload_0         
	//   33   60:invokevirtual   #217 <Method int Date.getDate()>
	//   34   63:invokespecial   #189 <Method void LocalDate(int, int, int)>
	//   35   66:areturn         
		}
	}

	public static LocalDate now()
	{
		return new LocalDate();
	//    0    0:new             #2   <Class LocalDate>
	//    1    3:dup             
	//    2    4:invokespecial   #220 <Method void LocalDate()>
	//    3    7:areturn         
	}

	public static LocalDate now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #223 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #225 <String "Chronology must not be null">
	//    5   10:invokespecial   #226 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new LocalDate(chronology);
	//    7   14:new             #2   <Class LocalDate>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #228 <Method void LocalDate(Chronology)>
	//   11   22:areturn         
	}

	public static LocalDate now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #223 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #231 <String "Zone must not be null">
	//    5   10:invokespecial   #226 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new LocalDate(datetimezone);
	//    7   14:new             #2   <Class LocalDate>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #233 <Method void LocalDate(DateTimeZone)>
	//   11   22:areturn         
	}

	public static LocalDate parse(String s)
	{
		return parse(s, ISODateTimeFormat.localDateParser());
	//    0    0:aload_0         
	//    1    1:invokestatic    #162 <Method DateTimeFormatter ISODateTimeFormat.localDateParser()>
	//    2    4:invokestatic    #239 <Method LocalDate parse(String, DateTimeFormatter)>
	//    3    7:areturn         
	}

	public static LocalDate parse(String s, DateTimeFormatter datetimeformatter)
	{
		return datetimeformatter.parseLocalDate(s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #245 <Method LocalDate DateTimeFormatter.parseLocalDate(String)>
	//    3    5:areturn         
	}

	private Object readResolve()
	{
		if(iChronology == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field Chronology iChronology>
	//*   2    4:ifnonnull       22
			return ((Object) (new LocalDate(iLocalMillis, ((Chronology) (ISOChronology.getInstanceUTC())))));
	//    3    7:new             #2   <Class LocalDate>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #109 <Field long iLocalMillis>
	//    7   15:invokestatic    #87  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    8   18:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//    9   21:areturn         
		if(!DateTimeZone.UTC.equals(((Object) (iChronology.getZone()))))
	//*  10   22:getstatic       #120 <Field DateTimeZone DateTimeZone.UTC>
	//*  11   25:aload_0         
	//*  12   26:getfield        #107 <Field Chronology iChronology>
	//*  13   29:invokevirtual   #114 <Method DateTimeZone Chronology.getZone()>
	//*  14   32:invokevirtual   #250 <Method boolean DateTimeZone.equals(Object)>
	//*  15   35:ifne            57
			return ((Object) (new LocalDate(iLocalMillis, iChronology.withUTC())));
	//   16   38:new             #2   <Class LocalDate>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:getfield        #109 <Field long iLocalMillis>
	//   20   46:aload_0         
	//   21   47:getfield        #107 <Field Chronology iChronology>
	//   22   50:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//   23   53:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//   24   56:areturn         
		else
			return ((Object) (this));
	//   25   57:aload_0         
	//   26   58:areturn         
	}

	public Property centuryOfEra()
	{
	/* block-local class not found */
	class Property {}

		return new Property(getChronology().centuryOfEra());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #256 <Method DateTimeField Chronology.centuryOfEra()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ReadablePartial)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class ReadablePartial>
	//    3    5:invokevirtual   #264 <Method int compareTo(ReadablePartial)>
	//    4    8:ireturn         
	}

	public int compareTo(ReadablePartial readablepartial)
	{
		if(this == readablepartial)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		if(readablepartial instanceof LocalDate)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocalDate>
	//*   7   11:ifeq            63
		{
			LocalDate localdate = (LocalDate)readablepartial;
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class LocalDate>
	//   10   18:astore_2        
			if(((Object) (iChronology)).equals(((Object) (localdate.iChronology))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #107 <Field Chronology iChronology>
	//*  13   23:aload_2         
	//*  14   24:getfield        #107 <Field Chronology iChronology>
	//*  15   27:invokevirtual   #267 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            63
			{
				if(iLocalMillis < localdate.iLocalMillis)
	//*  17   33:aload_0         
	//*  18   34:getfield        #109 <Field long iLocalMillis>
	//*  19   37:aload_2         
	//*  20   38:getfield        #109 <Field long iLocalMillis>
	//*  21   41:lcmp            
	//*  22   42:ifge            47
					return -1;
	//   23   45:iconst_m1       
	//   24   46:ireturn         
				return iLocalMillis != localdate.iLocalMillis ? 1 : 0;
	//   25   47:aload_0         
	//   26   48:getfield        #109 <Field long iLocalMillis>
	//   27   51:aload_2         
	//   28   52:getfield        #109 <Field long iLocalMillis>
	//   29   55:lcmp            
	//   30   56:ifne            61
	//   31   59:iconst_0        
	//   32   60:ireturn         
	//   33   61:iconst_1        
	//   34   62:ireturn         
			}
		}
		return super.compareTo(readablepartial);
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:invokespecial   #268 <Method int BaseLocal.compareTo(ReadablePartial)>
	//   38   68:ireturn         
	}

	public Property dayOfMonth()
	{
		return new Property(getChronology().dayOfMonth());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfWeek()
	{
		return new Property(getChronology().dayOfWeek());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #271 <Method DateTimeField Chronology.dayOfWeek()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfYear()
	{
		return new Property(getChronology().dayOfYear());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #274 <Method DateTimeField Chronology.dayOfYear()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj instanceof LocalDate)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocalDate>
	//*   7   11:ifeq            49
		{
			LocalDate localdate = (LocalDate)obj;
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class LocalDate>
	//   10   18:astore_2        
			if(((Object) (iChronology)).equals(((Object) (localdate.iChronology))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #107 <Field Chronology iChronology>
	//*  13   23:aload_2         
	//*  14   24:getfield        #107 <Field Chronology iChronology>
	//*  15   27:invokevirtual   #267 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            49
				return iLocalMillis == localdate.iLocalMillis;
	//   17   33:aload_0         
	//   18   34:getfield        #109 <Field long iLocalMillis>
	//   19   37:aload_2         
	//   20   38:getfield        #109 <Field long iLocalMillis>
	//   21   41:lcmp            
	//   22   42:ifne            47
	//   23   45:iconst_1        
	//   24   46:ireturn         
	//   25   47:iconst_0        
	//   26   48:ireturn         
		}
		return super.equals(obj);
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:invokespecial   #275 <Method boolean BaseLocal.equals(Object)>
	//   30   54:ireturn         
	}

	public Property era()
	{
		return new Property(getChronology().era());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #278 <Method DateTimeField Chronology.era()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public int get(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #281 <String "The DateTimeFieldType must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(datetimefieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #285 <Method boolean isSupported(DateTimeFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #287 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #288 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("Field '");
	//   15   31:aload_2         
	//   16   32:ldc2            #290 <String "Field '">
	//   17   35:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_2         
	//   24   46:ldc2            #299 <String "' is not supported">
	//   25   49:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		} else
		{
			return datetimefieldtype.getField(getChronology()).get(getLocalMillis());
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:invokevirtual   #254 <Method Chronology getChronology()>
	//   36   70:invokevirtual   #309 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   37   73:aload_0         
	//   38   74:invokevirtual   #312 <Method long getLocalMillis()>
	//   39   77:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//   40   80:ireturn         
		}
	}

	public int getCenturyOfEra()
	{
		return getChronology().centuryOfEra().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #256 <Method DateTimeField Chronology.centuryOfEra()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public Chronology getChronology()
	{
		return iChronology;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Chronology iChronology>
	//    2    4:areturn         
	}

	public int getDayOfMonth()
	{
		return getChronology().dayOfMonth().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getDayOfWeek()
	{
		return getChronology().dayOfWeek().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #271 <Method DateTimeField Chronology.dayOfWeek()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getDayOfYear()
	{
		return getChronology().dayOfYear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #274 <Method DateTimeField Chronology.dayOfYear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getEra()
	{
		return getChronology().era().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #278 <Method DateTimeField Chronology.era()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	protected DateTimeField getField(int i, Chronology chronology)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 72
	//	               1 67
	//	               2 62
		default:
			chronology = ((Chronology) (new StringBuilder()));
	//    2   28:new             #287 <Class StringBuilder>
	//    3   31:dup             
	//    4   32:invokespecial   #288 <Method void StringBuilder()>
	//    5   35:astore_2        
			((StringBuilder) (chronology)).append("Invalid index: ");
	//    6   36:aload_2         
	//    7   37:ldc2            #323 <String "Invalid index: ">
	//    8   40:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//    9   43:pop             
			((StringBuilder) (chronology)).append(i);
	//   10   44:aload_2         
	//   11   45:iload_1         
	//   12   46:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//   13   49:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (chronology)).toString());
	//   14   50:new             #328 <Class IndexOutOfBoundsException>
	//   15   53:dup             
	//   16   54:aload_2         
	//   17   55:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   18   58:invokespecial   #329 <Method void IndexOutOfBoundsException(String)>
	//   19   61:athrow          

		case 2: // '\002'
			return chronology.dayOfMonth();
	//   20   62:aload_2         
	//   21   63:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//   22   66:areturn         

		case 1: // '\001'
			return chronology.monthOfYear();
	//   23   67:aload_2         
	//   24   68:invokevirtual   #332 <Method DateTimeField Chronology.monthOfYear()>
	//   25   71:areturn         

		case 0: // '\0'
			return chronology.year();
	//   26   72:aload_2         
	//   27   73:invokevirtual   #335 <Method DateTimeField Chronology.year()>
	//   28   76:areturn         
		}
	}

	protected long getLocalMillis()
	{
		return iLocalMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field long iLocalMillis>
	//    2    4:lreturn         
	}

	public int getMonthOfYear()
	{
		return getChronology().monthOfYear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #332 <Method DateTimeField Chronology.monthOfYear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getValue(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 92
	//	               1 77
	//	               2 62
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   28:new             #287 <Class StringBuilder>
	//    3   31:dup             
	//    4   32:invokespecial   #288 <Method void StringBuilder()>
	//    5   35:astore_2        
			stringbuilder.append("Invalid index: ");
	//    6   36:aload_2         
	//    7   37:ldc2            #323 <String "Invalid index: ">
	//    8   40:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//    9   43:pop             
			stringbuilder.append(i);
	//   10   44:aload_2         
	//   11   45:iload_1         
	//   12   46:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//   13   49:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   14   50:new             #328 <Class IndexOutOfBoundsException>
	//   15   53:dup             
	//   16   54:aload_2         
	//   17   55:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   18   58:invokespecial   #329 <Method void IndexOutOfBoundsException(String)>
	//   19   61:athrow          

		case 2: // '\002'
			return getChronology().dayOfMonth().get(getLocalMillis());
	//   20   62:aload_0         
	//   21   63:invokevirtual   #254 <Method Chronology getChronology()>
	//   22   66:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//   23   69:aload_0         
	//   24   70:invokevirtual   #312 <Method long getLocalMillis()>
	//   25   73:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//   26   76:ireturn         

		case 1: // '\001'
			return getChronology().monthOfYear().get(getLocalMillis());
	//   27   77:aload_0         
	//   28   78:invokevirtual   #254 <Method Chronology getChronology()>
	//   29   81:invokevirtual   #332 <Method DateTimeField Chronology.monthOfYear()>
	//   30   84:aload_0         
	//   31   85:invokevirtual   #312 <Method long getLocalMillis()>
	//   32   88:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//   33   91:ireturn         

		case 0: // '\0'
			return getChronology().year().get(getLocalMillis());
	//   34   92:aload_0         
	//   35   93:invokevirtual   #254 <Method Chronology getChronology()>
	//   36   96:invokevirtual   #335 <Method DateTimeField Chronology.year()>
	//   37   99:aload_0         
	//   38  100:invokevirtual   #312 <Method long getLocalMillis()>
	//   39  103:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//   40  106:ireturn         
		}
	}

	public int getWeekOfWeekyear()
	{
		return getChronology().weekOfWeekyear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #341 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getWeekyear()
	{
		return getChronology().weekyear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #345 <Method DateTimeField Chronology.weekyear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYear()
	{
		return getChronology().year().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #335 <Method DateTimeField Chronology.year()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYearOfCentury()
	{
		return getChronology().yearOfCentury().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #349 <Method DateTimeField Chronology.yearOfCentury()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYearOfEra()
	{
		return getChronology().yearOfEra().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #353 <Method DateTimeField Chronology.yearOfEra()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #312 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #315 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int hashCode()
	{
		int j = iHash;
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field int iHash>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            21
		{
			i = super.hashCode();
	//    7   11:aload_0         
	//    8   12:invokespecial   #358 <Method int BaseLocal.hashCode()>
	//    9   15:istore_1        
			iHash = i;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:putfield        #356 <Field int iHash>
		}
		return i;
	//   13   21:iload_1         
	//   14   22:ireturn         
	}

	public boolean isSupported(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		DurationFieldType durationfieldtype = datetimefieldtype.getDurationType();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #361 <Method DurationFieldType DateTimeFieldType.getDurationType()>
	//    6   10:astore_2        
		if(!DATE_DURATION_TYPES.contains(((Object) (durationfieldtype))) && durationfieldtype.getField(getChronology()).getUnitMillis() < getChronology().days().getUnitMillis())
	//*   7   11:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #364 <Method boolean Set.contains(Object)>
	//*  10   20:ifne            53
	//*  11   23:aload_2         
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #254 <Method Chronology getChronology()>
	//*  14   28:invokevirtual   #367 <Method DurationField DurationFieldType.getField(Chronology)>
	//*  15   31:invokevirtual   #372 <Method long DurationField.getUnitMillis()>
	//*  16   34:aload_0         
	//*  17   35:invokevirtual   #254 <Method Chronology getChronology()>
	//*  18   38:invokevirtual   #375 <Method DurationField Chronology.days()>
	//*  19   41:invokevirtual   #372 <Method long DurationField.getUnitMillis()>
	//*  20   44:lcmp            
	//*  21   45:iflt            51
	//*  22   48:goto            53
			return false;
	//   23   51:iconst_0        
	//   24   52:ireturn         
		else
			return datetimefieldtype.getField(getChronology()).isSupported();
	//   25   53:aload_1         
	//   26   54:aload_0         
	//   27   55:invokevirtual   #254 <Method Chronology getChronology()>
	//   28   58:invokevirtual   #309 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   29   61:invokevirtual   #378 <Method boolean DateTimeField.isSupported()>
	//   30   64:ireturn         
	}

	public boolean isSupported(DurationFieldType durationfieldtype)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		DurationField durationfield = durationfieldtype.getField(getChronology());
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #367 <Method DurationField DurationFieldType.getField(Chronology)>
	//    8   14:astore_2        
		if(!DATE_DURATION_TYPES.contains(((Object) (durationfieldtype))) && durationfield.getUnitMillis() < getChronology().days().getUnitMillis())
	//*   9   15:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//*  10   18:aload_1         
	//*  11   19:invokeinterface #364 <Method boolean Set.contains(Object)>
	//*  12   24:ifne            50
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #372 <Method long DurationField.getUnitMillis()>
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #254 <Method Chronology getChronology()>
	//*  17   35:invokevirtual   #375 <Method DurationField Chronology.days()>
	//*  18   38:invokevirtual   #372 <Method long DurationField.getUnitMillis()>
	//*  19   41:lcmp            
	//*  20   42:iflt            48
	//*  21   45:goto            50
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		else
			return durationfield.isSupported();
	//   24   50:aload_2         
	//   25   51:invokevirtual   #380 <Method boolean DurationField.isSupported()>
	//   26   54:ireturn         
	}

	public LocalDate minus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #386 <Method LocalDate withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public LocalDate minusDays(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #375 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #392 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDate minusMonths(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #399 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #392 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDate minusWeeks(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #402 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #392 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDate minusYears(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #405 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #392 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public Property monthOfYear()
	{
		return new Property(getChronology().monthOfYear());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #332 <Method DateTimeField Chronology.monthOfYear()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public LocalDate plus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #386 <Method LocalDate withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public LocalDate plusDays(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().days().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #375 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #409 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDate plusMonths(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().months().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #399 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #409 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDate plusWeeks(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #402 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #409 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDate plusYears(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().years().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #405 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #409 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   13   25:areturn         
	}

	public Property property(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #281 <String "The DateTimeFieldType must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(datetimefieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #285 <Method boolean isSupported(DateTimeFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #287 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #288 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("Field '");
	//   15   31:aload_2         
	//   16   32:ldc2            #290 <String "Field '">
	//   17   35:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_2         
	//   24   46:ldc2            #299 <String "' is not supported">
	//   25   49:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		} else
		{
			return new Property(datetimefieldtype.getField(getChronology()));
	//   33   65:new             #10  <Class LocalDate$Property>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:aload_0         
	//   38   72:invokevirtual   #254 <Method Chronology getChronology()>
	//   39   75:invokevirtual   #309 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   40   78:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//   41   81:areturn         
		}
	}

	public int size()
	{
		return 3;
	//    0    0:iconst_3        
	//    1    1:ireturn         
	}

	public Date toDate()
	{
		int i = getDayOfMonth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #419 <Method int getDayOfMonth()>
	//    2    4:istore_1        
		Date date1 = new Date(getYear() - 1900, getMonthOfYear() - 1, i);
	//    3    5:new             #195 <Class Date>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #420 <Method int getYear()>
	//    7   13:sipush          1900
	//    8   16:isub            
	//    9   17:aload_0         
	//   10   18:invokevirtual   #422 <Method int getMonthOfYear()>
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:iload_1         
	//   14   24:invokespecial   #423 <Method void Date(int, int, int)>
	//   15   27:astore_3        
		LocalDate localdate1 = fromDateFields(date1);
	//   16   28:aload_3         
	//   17   29:invokestatic    #425 <Method LocalDate fromDateFields(Date)>
	//   18   32:astore          4
		if(localdate1.isBefore(((ReadablePartial) (this))))
	//*  19   34:aload           4
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #429 <Method boolean isBefore(ReadablePartial)>
	//*  22   40:ifeq            111
		{
			for(LocalDate localdate = localdate1; !localdate.equals(((Object) (this))); localdate = fromDateFields(date1))
	//*  23   43:aload           4
	//*  24   45:astore_2        
	//*  25   46:aload_2         
	//*  26   47:aload_0         
	//*  27   48:invokevirtual   #430 <Method boolean equals(Object)>
	//*  28   51:ifne            74
				date1.setTime(date1.getTime() + 0x36ee80L);
	//   29   54:aload_3         
	//   30   55:aload_3         
	//   31   56:invokevirtual   #198 <Method long Date.getTime()>
	//   32   59:ldc2w           #431 <Long 0x36ee80L>
	//   33   62:ladd            
	//   34   63:invokevirtual   #434 <Method void Date.setTime(long)>

	//   35   66:aload_3         
	//   36   67:invokestatic    #425 <Method LocalDate fromDateFields(Date)>
	//   37   70:astore_2        
	//*  38   71:goto            46
			for(; date1.getDate() == i; date1.setTime(date1.getTime() - 1000L));
	//   39   74:aload_3         
	//   40   75:invokevirtual   #217 <Method int Date.getDate()>
	//   41   78:iload_1         
	//   42   79:icmpne          97
	//   43   82:aload_3         
	//   44   83:aload_3         
	//   45   84:invokevirtual   #198 <Method long Date.getTime()>
	//   46   87:ldc2w           #435 <Long 1000L>
	//   47   90:lsub            
	//   48   91:invokevirtual   #434 <Method void Date.setTime(long)>
	//*  49   94:goto            74
			date1.setTime(date1.getTime() + 1000L);
	//   50   97:aload_3         
	//   51   98:aload_3         
	//   52   99:invokevirtual   #198 <Method long Date.getTime()>
	//   53  102:ldc2w           #435 <Long 1000L>
	//   54  105:ladd            
	//   55  106:invokevirtual   #434 <Method void Date.setTime(long)>
			return date1;
	//   56  109:aload_3         
	//   57  110:areturn         
		}
		Date date = date1;
	//   58  111:aload_3         
	//   59  112:astore_2        
		if(localdate1.equals(((Object) (this))))
	//*  60  113:aload           4
	//*  61  115:aload_0         
	//*  62  116:invokevirtual   #430 <Method boolean equals(Object)>
	//*  63  119:ifeq            157
		{
			Date date2 = new Date(date1.getTime() - (long)TimeZone.getDefault().getDSTSavings());
	//   64  122:new             #195 <Class Date>
	//   65  125:dup             
	//   66  126:aload_3         
	//   67  127:invokevirtual   #198 <Method long Date.getTime()>
	//   68  130:invokestatic    #442 <Method TimeZone TimeZone.getDefault()>
	//   69  133:invokevirtual   #445 <Method int TimeZone.getDSTSavings()>
	//   70  136:i2l             
	//   71  137:lsub            
	//   72  138:invokespecial   #447 <Method void Date(long)>
	//   73  141:astore          4
			date = date1;
	//   74  143:aload_3         
	//   75  144:astore_2        
			if(date2.getDate() == i)
	//*  76  145:aload           4
	//*  77  147:invokevirtual   #217 <Method int Date.getDate()>
	//*  78  150:iload_1         
	//*  79  151:icmpne          157
				date = date2;
	//   80  154:aload           4
	//   81  156:astore_2        
		}
		return date;
	//   82  157:aload_2         
	//   83  158:areturn         
	}

	public DateMidnight toDateMidnight()
	{
		return toDateMidnight(((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #453 <Method DateMidnight toDateMidnight(DateTimeZone)>
	//    3    5:areturn         
	}

	public DateMidnight toDateMidnight(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #456 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		datetimezone = ((DateTimeZone) (getChronology().withZone(datetimezone)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #460 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    7   13:astore_1        
		return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), ((Chronology) (datetimezone)));
	//    8   14:new             #462 <Class DateMidnight>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokevirtual   #420 <Method int getYear()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #422 <Method int getMonthOfYear()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #419 <Method int getDayOfMonth()>
	//   16   30:aload_1         
	//   17   31:invokespecial   #463 <Method void DateMidnight(int, int, int, Chronology)>
	//   18   34:areturn         
	}

	public DateTime toDateTime(LocalTime localtime)
	{
		return toDateTime(localtime, ((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #468 <Method DateTime toDateTime(LocalTime, DateTimeZone)>
	//    4    6:areturn         
	}

	public DateTime toDateTime(LocalTime localtime, DateTimeZone datetimezone)
	{
		if(localtime == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			return toDateTimeAtCurrentTime(datetimezone);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #472 <Method DateTime toDateTimeAtCurrentTime(DateTimeZone)>
	//    5    9:areturn         
		if(getChronology() != localtime.getChronology())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #254 <Method Chronology getChronology()>
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #475 <Method Chronology LocalTime.getChronology()>
	//*  10   18:if_acmpeq       32
		{
			throw new IllegalArgumentException("The chronology of the time does not match");
	//   11   21:new             #176 <Class IllegalArgumentException>
	//   12   24:dup             
	//   13   25:ldc2            #477 <String "The chronology of the time does not match">
	//   14   28:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   15   31:athrow          
		} else
		{
			datetimezone = ((DateTimeZone) (getChronology().withZone(datetimezone)));
	//   16   32:aload_0         
	//   17   33:invokevirtual   #254 <Method Chronology getChronology()>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #460 <Method Chronology Chronology.withZone(DateTimeZone)>
	//   20   40:astore_2        
			return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), localtime.getHourOfDay(), localtime.getMinuteOfHour(), localtime.getSecondOfMinute(), localtime.getMillisOfSecond(), ((Chronology) (datetimezone)));
	//   21   41:new             #479 <Class DateTime>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokevirtual   #420 <Method int getYear()>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #422 <Method int getMonthOfYear()>
	//   27   53:aload_0         
	//   28   54:invokevirtual   #419 <Method int getDayOfMonth()>
	//   29   57:aload_1         
	//   30   58:invokevirtual   #482 <Method int LocalTime.getHourOfDay()>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #485 <Method int LocalTime.getMinuteOfHour()>
	//   33   65:aload_1         
	//   34   66:invokevirtual   #488 <Method int LocalTime.getSecondOfMinute()>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #491 <Method int LocalTime.getMillisOfSecond()>
	//   37   73:aload_2         
	//   38   74:invokespecial   #494 <Method void DateTime(int, int, int, int, int, int, int, Chronology)>
	//   39   77:areturn         
		}
	}

	public DateTime toDateTimeAtCurrentTime()
	{
		return toDateTimeAtCurrentTime(((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #472 <Method DateTime toDateTimeAtCurrentTime(DateTimeZone)>
	//    3    5:areturn         
	}

	public DateTime toDateTimeAtCurrentTime(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #456 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		datetimezone = ((DateTimeZone) (getChronology().withZone(datetimezone)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #460 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    7   13:astore_1        
		return new DateTime(((Chronology) (datetimezone)).set(((ReadablePartial) (this)), DateTimeUtils.currentTimeMillis()), ((Chronology) (datetimezone)));
	//    8   14:new             #479 <Class DateTime>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokestatic    #74  <Method long DateTimeUtils.currentTimeMillis()>
	//   13   23:invokevirtual   #499 <Method long Chronology.set(ReadablePartial, long)>
	//   14   26:aload_1         
	//   15   27:invokespecial   #500 <Method void DateTime(long, Chronology)>
	//   16   30:areturn         
	}

	public DateTime toDateTimeAtMidnight()
	{
		return toDateTimeAtMidnight(((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #503 <Method DateTime toDateTimeAtMidnight(DateTimeZone)>
	//    3    5:areturn         
	}

	public DateTime toDateTimeAtMidnight(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #456 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		datetimezone = ((DateTimeZone) (getChronology().withZone(datetimezone)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #460 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    7   13:astore_1        
		return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, ((Chronology) (datetimezone)));
	//    8   14:new             #479 <Class DateTime>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokevirtual   #420 <Method int getYear()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #422 <Method int getMonthOfYear()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #419 <Method int getDayOfMonth()>
	//   16   30:iconst_0        
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:aload_1         
	//   21   35:invokespecial   #494 <Method void DateTime(int, int, int, int, int, int, int, Chronology)>
	//   22   38:areturn         
	}

	public DateTime toDateTimeAtStartOfDay()
	{
		return toDateTimeAtStartOfDay(((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #506 <Method DateTime toDateTimeAtStartOfDay(DateTimeZone)>
	//    3    5:areturn         
	}

	public DateTime toDateTimeAtStartOfDay(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #456 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		Chronology chronology = getChronology().withZone(datetimezone);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #460 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    7   13:astore          4
		long l = datetimezone.convertLocalToUTC(getLocalMillis() + 0x1499700L, false);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #312 <Method long getLocalMillis()>
	//   11   20:ldc2w           #507 <Long 0x1499700L>
	//   12   23:ladd            
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #512 <Method long DateTimeZone.convertLocalToUTC(long, boolean)>
	//   15   28:lstore_2        
		return new DateTime(chronology.dayOfMonth().roundFloor(l), chronology);
	//   16   29:new             #479 <Class DateTime>
	//   17   32:dup             
	//   18   33:aload           4
	//   19   35:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//   20   38:lload_2         
	//   21   39:invokevirtual   #134 <Method long DateTimeField.roundFloor(long)>
	//   22   42:aload           4
	//   23   44:invokespecial   #500 <Method void DateTime(long, Chronology)>
	//   24   47:areturn         
	}

	public Interval toInterval()
	{
		return toInterval(((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #517 <Method Interval toInterval(DateTimeZone)>
	//    3    5:areturn         
	}

	public Interval toInterval(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #456 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		return new Interval(((ReadableInstant) (toDateTimeAtStartOfDay(datetimezone))), ((ReadableInstant) (plusDays(1).toDateTimeAtStartOfDay(datetimezone))));
	//    3    5:new             #519 <Class Interval>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #506 <Method DateTime toDateTimeAtStartOfDay(DateTimeZone)>
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #521 <Method LocalDate plusDays(int)>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #506 <Method DateTime toDateTimeAtStartOfDay(DateTimeZone)>
	//   13   23:invokespecial   #524 <Method void Interval(ReadableInstant, ReadableInstant)>
	//   14   26:areturn         
	}

	public LocalDateTime toLocalDateTime(LocalTime localtime)
	{
		if(localtime == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("The time must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #528 <String "The time must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(getChronology() != localtime.getChronology())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #254 <Method Chronology getChronology()>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #475 <Method Chronology LocalTime.getChronology()>
	//*  11   23:if_acmpeq       37
			throw new IllegalArgumentException("The chronology of the time does not match");
	//   12   26:new             #176 <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc2            #477 <String "The chronology of the time does not match">
	//   15   33:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   16   36:athrow          
		else
			return new LocalDateTime(getLocalMillis() + localtime.getLocalMillis(), getChronology());
	//   17   37:new             #530 <Class LocalDateTime>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:invokevirtual   #312 <Method long getLocalMillis()>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #531 <Method long LocalTime.getLocalMillis()>
	//   23   49:ladd            
	//   24   50:aload_0         
	//   25   51:invokevirtual   #254 <Method Chronology getChronology()>
	//   26   54:invokespecial   #532 <Method void LocalDateTime(long, Chronology)>
	//   27   57:areturn         
	}

	public String toString()
	{
		return ISODateTimeFormat.date().print(((ReadablePartial) (this)));
	//    0    0:invokestatic    #536 <Method DateTimeFormatter ISODateTimeFormat.date()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #540 <Method String DateTimeFormatter.print(ReadablePartial)>
	//    3    7:areturn         
	}

	public String toString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #542 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #548 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #540 <Method String DateTimeFormatter.print(ReadablePartial)>
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
	//    3    5:invokevirtual   #542 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).withLocale(locale).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #548 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #553 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #540 <Method String DateTimeFormatter.print(ReadablePartial)>
	//   11   21:areturn         
	}

	public Property weekOfWeekyear()
	{
		return new Property(getChronology().weekOfWeekyear());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #341 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public Property weekyear()
	{
		return new Property(getChronology().weekyear());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #345 <Method DateTimeField Chronology.weekyear()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public LocalDate withCenturyOfEra(int i)
	{
		return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #256 <Method DateTimeField Chronology.centuryOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withDayOfMonth(int i)
	{
		return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withDayOfWeek(int i)
	{
		return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #271 <Method DateTimeField Chronology.dayOfWeek()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withDayOfYear(int i)
	{
		return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #274 <Method DateTimeField Chronology.dayOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withEra(int i)
	{
		return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #278 <Method DateTimeField Chronology.era()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withField(DateTimeFieldType datetimefieldtype, int i)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #565 <String "Field must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(datetimefieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #285 <Method boolean isSupported(DateTimeFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #287 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #288 <Method void StringBuilder()>
	//   14   30:astore_3        
			stringbuilder.append("Field '");
	//   15   31:aload_3         
	//   16   32:ldc2            #290 <String "Field '">
	//   17   35:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_3         
	//   24   46:ldc2            #299 <String "' is not supported">
	//   25   49:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_3         
	//   30   58:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		} else
		{
			return withLocalMillis(datetimefieldtype.getField(getChronology()).set(getLocalMillis(), i));
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:aload_0         
	//   36   68:invokevirtual   #254 <Method Chronology getChronology()>
	//   37   71:invokevirtual   #309 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   38   74:aload_0         
	//   39   75:invokevirtual   #312 <Method long getLocalMillis()>
	//   40   78:iload_2         
	//   41   79:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//   42   82:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   43   85:areturn         
		}
	}

	public LocalDate withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #565 <String "Field must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(durationfieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #569 <Method boolean isSupported(DurationFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #287 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #288 <Method void StringBuilder()>
	//   14   30:astore_3        
			stringbuilder.append("Field '");
	//   15   31:aload_3         
	//   16   32:ldc2            #290 <String "Field '">
	//   17   35:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (durationfieldtype)));
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_3         
	//   24   46:ldc2            #299 <String "' is not supported">
	//   25   49:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_3         
	//   30   58:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		}
		if(i == 0)
	//*  33   65:iload_2         
	//*  34   66:ifne            71
			return this;
	//   35   69:aload_0         
	//   36   70:areturn         
		else
			return withLocalMillis(durationfieldtype.getField(getChronology()).add(getLocalMillis(), i));
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:aload_0         
	//   40   74:invokevirtual   #254 <Method Chronology getChronology()>
	//   41   77:invokevirtual   #367 <Method DurationField DurationFieldType.getField(Chronology)>
	//   42   80:aload_0         
	//   43   81:invokevirtual   #312 <Method long getLocalMillis()>
	//   44   84:iload_2         
	//   45   85:invokevirtual   #409 <Method long DurationField.add(long, int)>
	//   46   88:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   47   91:areturn         
	}

	public LocalDate withFields(ReadablePartial readablepartial)
	{
		if(readablepartial == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().set(readablepartial, getLocalMillis()));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #254 <Method Chronology getChronology()>
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #312 <Method long getLocalMillis()>
	//   10   16:invokevirtual   #499 <Method long Chronology.set(ReadablePartial, long)>
	//   11   19:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   12   22:areturn         
	}

	LocalDate withLocalMillis(long l)
	{
		l = iChronology.dayOfMonth().roundFloor(l);
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Chronology iChronology>
	//    2    4:invokevirtual   #128 <Method DateTimeField Chronology.dayOfMonth()>
	//    3    7:lload_1         
	//    4    8:invokevirtual   #134 <Method long DateTimeField.roundFloor(long)>
	//    5   11:lstore_1        
		if(l == getLocalMillis())
	//*   6   12:lload_1         
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #312 <Method long getLocalMillis()>
	//*   9   17:lcmp            
	//*  10   18:ifne            23
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		else
			return new LocalDate(l, getChronology());
	//   13   23:new             #2   <Class LocalDate>
	//   14   26:dup             
	//   15   27:lload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #254 <Method Chronology getChronology()>
	//   18   32:invokespecial   #83  <Method void LocalDate(long, Chronology)>
	//   19   35:areturn         
	}

	public LocalDate withMonthOfYear(int i)
	{
		return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #332 <Method DateTimeField Chronology.monthOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withPeriodAdded(ReadablePeriod readableperiod, int i)
	{
		if(readableperiod != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          104
		{
			if(i == 0)
	//*   2    4:iload_2         
	//*   3    5:ifne            10
				return this;
	//    4    8:aload_0         
	//    5    9:areturn         
			long l = getLocalMillis();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #312 <Method long getLocalMillis()>
	//    8   14:lstore          4
			Chronology chronology = getChronology();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #254 <Method Chronology getChronology()>
	//   11   20:astore          10
			for(int j = 0; j < readableperiod.size();)
	//*  12   22:iconst_0        
	//*  13   23:istore_3        
	//*  14   24:iload_3         
	//*  15   25:aload_1         
	//*  16   26:invokeinterface #576 <Method int ReadablePeriod.size()>
	//*  17   31:icmpge          97
			{
				long l2 = FieldUtils.safeMultiply(readableperiod.getValue(j), i);
	//   18   34:aload_1         
	//   19   35:iload_3         
	//   20   36:invokeinterface #578 <Method int ReadablePeriod.getValue(int)>
	//   21   41:iload_2         
	//   22   42:invokestatic    #584 <Method int FieldUtils.safeMultiply(int, int)>
	//   23   45:i2l             
	//   24   46:lstore          8
				DurationFieldType durationfieldtype = readableperiod.getFieldType(j);
	//   25   48:aload_1         
	//   26   49:iload_3         
	//   27   50:invokeinterface #588 <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//   28   55:astore          11
				long l1 = l;
	//   29   57:lload           4
	//   30   59:lstore          6
				if(isSupported(durationfieldtype))
	//*  31   61:aload_0         
	//*  32   62:aload           11
	//*  33   64:invokevirtual   #569 <Method boolean isSupported(DurationFieldType)>
	//*  34   67:ifeq            86
					l1 = durationfieldtype.getField(chronology).add(l, l2);
	//   35   70:aload           11
	//   36   72:aload           10
	//   37   74:invokevirtual   #367 <Method DurationField DurationFieldType.getField(Chronology)>
	//   38   77:lload           4
	//   39   79:lload           8
	//   40   81:invokevirtual   #591 <Method long DurationField.add(long, long)>
	//   41   84:lstore          6
				j++;
	//   42   86:iload_3         
	//   43   87:iconst_1        
	//   44   88:iadd            
	//   45   89:istore_3        
				l = l1;
	//   46   90:lload           6
	//   47   92:lstore          4
			}

	//*  48   94:goto            24
			return withLocalMillis(l);
	//   49   97:aload_0         
	//   50   98:lload           4
	//   51  100:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//   52  103:areturn         
		} else
		{
			return this;
	//   53  104:aload_0         
	//   54  105:areturn         
		}
	}

	public LocalDate withWeekOfWeekyear(int i)
	{
		return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #341 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withWeekyear(int i)
	{
		return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #345 <Method DateTimeField Chronology.weekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withYear(int i)
	{
		return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #335 <Method DateTimeField Chronology.year()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withYearOfCentury(int i)
	{
		return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #349 <Method DateTimeField Chronology.yearOfCentury()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDate withYearOfEra(int i)
	{
		return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #353 <Method DateTimeField Chronology.yearOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #312 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #557 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #396 <Method LocalDate withLocalMillis(long)>
	//    9   19:areturn         
	}

	public Property year()
	{
		return new Property(getChronology().year());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #335 <Method DateTimeField Chronology.year()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfCentury()
	{
		return new Property(getChronology().yearOfCentury());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #349 <Method DateTimeField Chronology.yearOfCentury()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfEra()
	{
		return new Property(getChronology().yearOfEra());
	//    0    0:new             #10  <Class LocalDate$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #254 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #353 <Method DateTimeField Chronology.yearOfEra()>
	//    6   12:invokespecial   #259 <Method void LocalDate$Property(LocalDate, DateTimeField)>
	//    7   15:areturn         
	}

	private static final Set DATE_DURATION_TYPES;
	private static final int DAY_OF_MONTH = 2;
	private static final int MONTH_OF_YEAR = 1;
	private static final int YEAR = 0;
	private static final long serialVersionUID = 0xd3e4ebb5L;
	private final Chronology iChronology;
	private transient int iHash;
	private final long iLocalMillis;

	static 
	{
		DATE_DURATION_TYPES = ((Set) (new HashSet()));
	//    0    0:new             #32  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void HashSet()>
	//    3    7:putstatic       #37  <Field Set DATE_DURATION_TYPES>
		DATE_DURATION_TYPES.add(((Object) (DurationFieldType.days())));
	//    4   10:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//    5   13:invokestatic    #43  <Method DurationFieldType DurationFieldType.days()>
	//    6   16:invokeinterface #49  <Method boolean Set.add(Object)>
	//    7   21:pop             
		DATE_DURATION_TYPES.add(((Object) (DurationFieldType.weeks())));
	//    8   22:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//    9   25:invokestatic    #52  <Method DurationFieldType DurationFieldType.weeks()>
	//   10   28:invokeinterface #49  <Method boolean Set.add(Object)>
	//   11   33:pop             
		DATE_DURATION_TYPES.add(((Object) (DurationFieldType.months())));
	//   12   34:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//   13   37:invokestatic    #55  <Method DurationFieldType DurationFieldType.months()>
	//   14   40:invokeinterface #49  <Method boolean Set.add(Object)>
	//   15   45:pop             
		DATE_DURATION_TYPES.add(((Object) (DurationFieldType.weekyears())));
	//   16   46:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//   17   49:invokestatic    #58  <Method DurationFieldType DurationFieldType.weekyears()>
	//   18   52:invokeinterface #49  <Method boolean Set.add(Object)>
	//   19   57:pop             
		DATE_DURATION_TYPES.add(((Object) (DurationFieldType.years())));
	//   20   58:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//   21   61:invokestatic    #61  <Method DurationFieldType DurationFieldType.years()>
	//   22   64:invokeinterface #49  <Method boolean Set.add(Object)>
	//   23   69:pop             
		DATE_DURATION_TYPES.add(((Object) (DurationFieldType.centuries())));
	//   24   70:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//   25   73:invokestatic    #64  <Method DurationFieldType DurationFieldType.centuries()>
	//   26   76:invokeinterface #49  <Method boolean Set.add(Object)>
	//   27   81:pop             
		DATE_DURATION_TYPES.add(((Object) (DurationFieldType.eras())));
	//   28   82:getstatic       #37  <Field Set DATE_DURATION_TYPES>
	//   29   85:invokestatic    #67  <Method DurationFieldType DurationFieldType.eras()>
	//   30   88:invokeinterface #49  <Method boolean Set.add(Object)>
	//   31   93:pop             
	//*  32   94:return          
	}
}
