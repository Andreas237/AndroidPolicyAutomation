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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//			ReadablePartial, DurationFieldType, DateTimeUtils, Chronology, 
//			DateTimeZone, DateTimeField, DateTimeFieldType, DurationField, 
//			DateTime, ReadablePeriod

public final class LocalTime extends BaseLocal
	implements ReadablePartial, Serializable
{

	public LocalTime()
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #73  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:invokestatic    #79  <Method ISOChronology ISOChronology.getInstance()>
	//    3    7:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//    4   10:return          
	}

	public LocalTime(int i, int j)
	{
		this(i, j, 0, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokestatic    #86  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    6    8:invokespecial   #89  <Method void LocalTime(int, int, int, int, Chronology)>
	//    7   11:return          
	}

	public LocalTime(int i, int j, int k)
	{
		this(i, j, k, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #86  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    6    8:invokespecial   #89  <Method void LocalTime(int, int, int, int, Chronology)>
	//    7   11:return          
	}

	public LocalTime(int i, int j, int k, int l)
	{
		this(i, j, k, l, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #86  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    6    9:invokespecial   #89  <Method void LocalTime(int, int, int, int, Chronology)>
	//    7   12:return          
	}

	public LocalTime(int i, int j, int k, int l, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void BaseLocal()>
		chronology = DateTimeUtils.getChronology(chronology).withUTC();
	//    2    4:aload           5
	//    3    6:invokestatic    #95  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    9:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//    5   12:astore          5
		long l1 = chronology.getDateTimeMillis(0L, i, j, k, l);
	//    6   14:aload           5
	//    7   16:lconst_0        
	//    8   17:iload_1         
	//    9   18:iload_2         
	//   10   19:iload_3         
	//   11   20:iload           4
	//   12   22:invokevirtual   #105 <Method long Chronology.getDateTimeMillis(long, int, int, int, int)>
	//   13   25:lstore          6
		iChronology = chronology;
	//   14   27:aload_0         
	//   15   28:aload           5
	//   16   30:putfield        #107 <Field Chronology iChronology>
		iLocalMillis = l1;
	//   17   33:aload_0         
	//   18   34:lload           6
	//   19   36:putfield        #109 <Field long iLocalMillis>
	//   20   39:return          
	}

	public LocalTime(long l)
	{
		this(l, ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #79  <Method ISOChronology ISOChronology.getInstance()>
	//    3    5:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//    4    8:return          
	}

	public LocalTime(long l, Chronology chronology)
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
		iLocalMillis = chronology.millisOfDay().get(l);
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #128 <Method DateTimeField Chronology.millisOfDay()>
	//   17   31:lload_1         
	//   18   32:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//   19   35:i2l             
	//   20   36:putfield        #109 <Field long iLocalMillis>
		iChronology = chronology;
	//   21   39:aload_0         
	//   22   40:aload_3         
	//   23   41:putfield        #107 <Field Chronology iChronology>
	//   24   44:return          
	}

	public LocalTime(long l, DateTimeZone datetimezone)
	{
		this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #138 <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    6:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//    5    9:return          
	}

	public LocalTime(Object obj)
	{
		this(obj, (Chronology)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #97  <Class Chronology>
	//    4    6:invokespecial   #142 <Method void LocalTime(Object, Chronology)>
	//    5    9:return          
	}

	public LocalTime(Object obj, Chronology chronology)
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
		obj = ((Object) (partialconverter.getPartialValues(((ReadablePartial) (this)), obj, chronology, ISODateTimeFormat.localTimeParser())));
	//   16   32:aload_3         
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #162 <Method DateTimeFormatter ISODateTimeFormat.localTimeParser()>
	//   21   39:invokeinterface #166 <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology, DateTimeFormatter)>
	//   22   44:astore_1        
		iLocalMillis = iChronology.getDateTimeMillis(0L, obj[0], obj[1], obj[2], obj[3]);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #107 <Field Chronology iChronology>
	//   26   50:lconst_0        
	//   27   51:aload_1         
	//   28   52:iconst_0        
	//   29   53:iaload          
	//   30   54:aload_1         
	//   31   55:iconst_1        
	//   32   56:iaload          
	//   33   57:aload_1         
	//   34   58:iconst_2        
	//   35   59:iaload          
	//   36   60:aload_1         
	//   37   61:iconst_3        
	//   38   62:iaload          
	//   39   63:invokevirtual   #105 <Method long Chronology.getDateTimeMillis(long, int, int, int, int)>
	//   40   66:putfield        #109 <Field long iLocalMillis>
	//   41   69:return          
	}

	public LocalTime(Object obj, DateTimeZone datetimezone)
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
		obj = ((Object) (partialconverter.getPartialValues(((ReadablePartial) (this)), obj, ((Chronology) (datetimezone)), ISODateTimeFormat.localTimeParser())));
	//   16   32:aload_3         
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #162 <Method DateTimeFormatter ISODateTimeFormat.localTimeParser()>
	//   21   39:invokeinterface #166 <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology, DateTimeFormatter)>
	//   22   44:astore_1        
		iLocalMillis = iChronology.getDateTimeMillis(0L, obj[0], obj[1], obj[2], obj[3]);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #107 <Field Chronology iChronology>
	//   26   50:lconst_0        
	//   27   51:aload_1         
	//   28   52:iconst_0        
	//   29   53:iaload          
	//   30   54:aload_1         
	//   31   55:iconst_1        
	//   32   56:iaload          
	//   33   57:aload_1         
	//   34   58:iconst_2        
	//   35   59:iaload          
	//   36   60:aload_1         
	//   37   61:iconst_3        
	//   38   62:iaload          
	//   39   63:invokevirtual   #105 <Method long Chronology.getDateTimeMillis(long, int, int, int, int)>
	//   40   66:putfield        #109 <Field long iLocalMillis>
	//   41   69:return          
	}

	public LocalTime(Chronology chronology)
	{
		this(DateTimeUtils.currentTimeMillis(), chronology);
	//    0    0:aload_0         
	//    1    1:invokestatic    #73  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//    4    8:return          
	}

	public LocalTime(DateTimeZone datetimezone)
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #73  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #138 <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    8:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//    5   11:return          
	}

	public static LocalTime fromCalendarFields(Calendar calendar)
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
		else
			return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
	//    7   14:new             #2   <Class LocalTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:bipush          11
	//   11   21:invokevirtual   #186 <Method int Calendar.get(int)>
	//   12   24:aload_0         
	//   13   25:bipush          12
	//   14   27:invokevirtual   #186 <Method int Calendar.get(int)>
	//   15   30:aload_0         
	//   16   31:bipush          13
	//   17   33:invokevirtual   #186 <Method int Calendar.get(int)>
	//   18   36:aload_0         
	//   19   37:bipush          14
	//   20   39:invokevirtual   #186 <Method int Calendar.get(int)>
	//   21   42:invokespecial   #37  <Method void LocalTime(int, int, int, int)>
	//   22   45:areturn         
	}

	public static LocalTime fromDateFields(Date date)
	{
		if(date == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The date must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #190 <String "The date must not be null">
	//    5   10:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), ((int)(date.getTime() % 1000L) + 1000) % 1000);
	//    7   14:new             #2   <Class LocalTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokevirtual   #196 <Method int Date.getHours()>
	//   11   22:aload_0         
	//   12   23:invokevirtual   #199 <Method int Date.getMinutes()>
	//   13   26:aload_0         
	//   14   27:invokevirtual   #202 <Method int Date.getSeconds()>
	//   15   30:aload_0         
	//   16   31:invokevirtual   #205 <Method long Date.getTime()>
	//   17   34:ldc2w           #206 <Long 1000L>
	//   18   37:lrem            
	//   19   38:l2i             
	//   20   39:sipush          1000
	//   21   42:iadd            
	//   22   43:sipush          1000
	//   23   46:irem            
	//   24   47:invokespecial   #37  <Method void LocalTime(int, int, int, int)>
	//   25   50:areturn         
	}

	public static LocalTime fromMillisOfDay(long l)
	{
		return fromMillisOfDay(l, ((Chronology) (null)));
	//    0    0:lload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #212 <Method LocalTime fromMillisOfDay(long, Chronology)>
	//    3    5:areturn         
	}

	public static LocalTime fromMillisOfDay(long l, Chronology chronology)
	{
		return new LocalTime(l, DateTimeUtils.getChronology(chronology).withUTC());
	//    0    0:new             #2   <Class LocalTime>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #95  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    5    9:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//    6   12:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//    7   15:areturn         
	}

	public static LocalTime now()
	{
		return new LocalTime();
	//    0    0:new             #2   <Class LocalTime>
	//    1    3:dup             
	//    2    4:invokespecial   #215 <Method void LocalTime()>
	//    3    7:areturn         
	}

	public static LocalTime now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #218 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #220 <String "Chronology must not be null">
	//    5   10:invokespecial   #221 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new LocalTime(chronology);
	//    7   14:new             #2   <Class LocalTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #223 <Method void LocalTime(Chronology)>
	//   11   22:areturn         
	}

	public static LocalTime now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #218 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #226 <String "Zone must not be null">
	//    5   10:invokespecial   #221 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new LocalTime(datetimezone);
	//    7   14:new             #2   <Class LocalTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #228 <Method void LocalTime(DateTimeZone)>
	//   11   22:areturn         
	}

	public static LocalTime parse(String s)
	{
		return parse(s, ISODateTimeFormat.localTimeParser());
	//    0    0:aload_0         
	//    1    1:invokestatic    #162 <Method DateTimeFormatter ISODateTimeFormat.localTimeParser()>
	//    2    4:invokestatic    #234 <Method LocalTime parse(String, DateTimeFormatter)>
	//    3    7:areturn         
	}

	public static LocalTime parse(String s, DateTimeFormatter datetimeformatter)
	{
		return datetimeformatter.parseLocalTime(s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #240 <Method LocalTime DateTimeFormatter.parseLocalTime(String)>
	//    3    5:areturn         
	}

	private Object readResolve()
	{
		if(iChronology == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field Chronology iChronology>
	//*   2    4:ifnonnull       22
			return ((Object) (new LocalTime(iLocalMillis, ((Chronology) (ISOChronology.getInstanceUTC())))));
	//    3    7:new             #2   <Class LocalTime>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #109 <Field long iLocalMillis>
	//    7   15:invokestatic    #86  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    8   18:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//    9   21:areturn         
		if(!DateTimeZone.UTC.equals(((Object) (iChronology.getZone()))))
	//*  10   22:getstatic       #120 <Field DateTimeZone DateTimeZone.UTC>
	//*  11   25:aload_0         
	//*  12   26:getfield        #107 <Field Chronology iChronology>
	//*  13   29:invokevirtual   #114 <Method DateTimeZone Chronology.getZone()>
	//*  14   32:invokevirtual   #245 <Method boolean DateTimeZone.equals(Object)>
	//*  15   35:ifne            57
			return ((Object) (new LocalTime(iLocalMillis, iChronology.withUTC())));
	//   16   38:new             #2   <Class LocalTime>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:getfield        #109 <Field long iLocalMillis>
	//   20   46:aload_0         
	//   21   47:getfield        #107 <Field Chronology iChronology>
	//   22   50:invokevirtual   #101 <Method Chronology Chronology.withUTC()>
	//   23   53:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//   24   56:areturn         
		else
			return ((Object) (this));
	//   25   57:aload_0         
	//   26   58:areturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ReadablePartial)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class ReadablePartial>
	//    3    5:invokevirtual   #250 <Method int compareTo(ReadablePartial)>
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
		if(readablepartial instanceof LocalTime)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocalTime>
	//*   7   11:ifeq            63
		{
			LocalTime localtime = (LocalTime)readablepartial;
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class LocalTime>
	//   10   18:astore_2        
			if(((Object) (iChronology)).equals(((Object) (localtime.iChronology))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #107 <Field Chronology iChronology>
	//*  13   23:aload_2         
	//*  14   24:getfield        #107 <Field Chronology iChronology>
	//*  15   27:invokevirtual   #253 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            63
			{
				if(iLocalMillis < localtime.iLocalMillis)
	//*  17   33:aload_0         
	//*  18   34:getfield        #109 <Field long iLocalMillis>
	//*  19   37:aload_2         
	//*  20   38:getfield        #109 <Field long iLocalMillis>
	//*  21   41:lcmp            
	//*  22   42:ifge            47
					return -1;
	//   23   45:iconst_m1       
	//   24   46:ireturn         
				return iLocalMillis != localtime.iLocalMillis ? 1 : 0;
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
	//   37   65:invokespecial   #254 <Method int BaseLocal.compareTo(ReadablePartial)>
	//   38   68:ireturn         
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
		if(obj instanceof LocalTime)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocalTime>
	//*   7   11:ifeq            49
		{
			LocalTime localtime = (LocalTime)obj;
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class LocalTime>
	//   10   18:astore_2        
			if(((Object) (iChronology)).equals(((Object) (localtime.iChronology))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #107 <Field Chronology iChronology>
	//*  13   23:aload_2         
	//*  14   24:getfield        #107 <Field Chronology iChronology>
	//*  15   27:invokevirtual   #253 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            49
				return iLocalMillis == localtime.iLocalMillis;
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
	//   29   51:invokespecial   #255 <Method boolean BaseLocal.equals(Object)>
	//   30   54:ireturn         
	}

	public int get(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #258 <String "The DateTimeFieldType must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(datetimefieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #262 <Method boolean isSupported(DateTimeFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #264 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #265 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("Field '");
	//   15   31:aload_2         
	//   16   32:ldc2            #267 <String "Field '">
	//   17   35:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #274 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_2         
	//   24   46:ldc2            #276 <String "' is not supported">
	//   25   49:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		} else
		{
			return datetimefieldtype.getField(getChronology()).get(getLocalMillis());
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:invokevirtual   #282 <Method Chronology getChronology()>
	//   36   70:invokevirtual   #288 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   37   73:aload_0         
	//   38   74:invokevirtual   #291 <Method long getLocalMillis()>
	//   39   77:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//   40   80:ireturn         
		}
	}

	public Chronology getChronology()
	{
		return iChronology;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Chronology iChronology>
	//    2    4:areturn         
	}

	protected DateTimeField getField(int i, Chronology chronology)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 81
	//	               1 76
	//	               2 71
	//	               3 66
		default:
			chronology = ((Chronology) (new StringBuilder()));
	//    2   32:new             #264 <Class StringBuilder>
	//    3   35:dup             
	//    4   36:invokespecial   #265 <Method void StringBuilder()>
	//    5   39:astore_2        
			((StringBuilder) (chronology)).append("Invalid index: ");
	//    6   40:aload_2         
	//    7   41:ldc2            #294 <String "Invalid index: ">
	//    8   44:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//    9   47:pop             
			((StringBuilder) (chronology)).append(i);
	//   10   48:aload_2         
	//   11   49:iload_1         
	//   12   50:invokevirtual   #297 <Method StringBuilder StringBuilder.append(int)>
	//   13   53:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (chronology)).toString());
	//   14   54:new             #299 <Class IndexOutOfBoundsException>
	//   15   57:dup             
	//   16   58:aload_2         
	//   17   59:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   18   62:invokespecial   #300 <Method void IndexOutOfBoundsException(String)>
	//   19   65:athrow          

		case 3: // '\003'
			return chronology.millisOfSecond();
	//   20   66:aload_2         
	//   21   67:invokevirtual   #303 <Method DateTimeField Chronology.millisOfSecond()>
	//   22   70:areturn         

		case 2: // '\002'
			return chronology.secondOfMinute();
	//   23   71:aload_2         
	//   24   72:invokevirtual   #306 <Method DateTimeField Chronology.secondOfMinute()>
	//   25   75:areturn         

		case 1: // '\001'
			return chronology.minuteOfHour();
	//   26   76:aload_2         
	//   27   77:invokevirtual   #309 <Method DateTimeField Chronology.minuteOfHour()>
	//   28   80:areturn         

		case 0: // '\0'
			return chronology.hourOfDay();
	//   29   81:aload_2         
	//   30   82:invokevirtual   #312 <Method DateTimeField Chronology.hourOfDay()>
	//   31   85:areturn         
		}
	}

	public int getHourOfDay()
	{
		return getChronology().hourOfDay().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #312 <Method DateTimeField Chronology.hourOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #291 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	protected long getLocalMillis()
	{
		return iLocalMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field long iLocalMillis>
	//    2    4:lreturn         
	}

	public int getMillisOfDay()
	{
		return getChronology().millisOfDay().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #128 <Method DateTimeField Chronology.millisOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #291 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMillisOfSecond()
	{
		return getChronology().millisOfSecond().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #303 <Method DateTimeField Chronology.millisOfSecond()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #291 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMinuteOfHour()
	{
		return getChronology().minuteOfHour().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #309 <Method DateTimeField Chronology.minuteOfHour()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #291 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getSecondOfMinute()
	{
		return getChronology().secondOfMinute().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #306 <Method DateTimeField Chronology.secondOfMinute()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #291 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getValue(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 111
	//	               1 96
	//	               2 81
	//	               3 66
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   32:new             #264 <Class StringBuilder>
	//    3   35:dup             
	//    4   36:invokespecial   #265 <Method void StringBuilder()>
	//    5   39:astore_2        
			stringbuilder.append("Invalid index: ");
	//    6   40:aload_2         
	//    7   41:ldc2            #294 <String "Invalid index: ">
	//    8   44:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//    9   47:pop             
			stringbuilder.append(i);
	//   10   48:aload_2         
	//   11   49:iload_1         
	//   12   50:invokevirtual   #297 <Method StringBuilder StringBuilder.append(int)>
	//   13   53:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   14   54:new             #299 <Class IndexOutOfBoundsException>
	//   15   57:dup             
	//   16   58:aload_2         
	//   17   59:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   18   62:invokespecial   #300 <Method void IndexOutOfBoundsException(String)>
	//   19   65:athrow          

		case 3: // '\003'
			return getChronology().millisOfSecond().get(getLocalMillis());
	//   20   66:aload_0         
	//   21   67:invokevirtual   #282 <Method Chronology getChronology()>
	//   22   70:invokevirtual   #303 <Method DateTimeField Chronology.millisOfSecond()>
	//   23   73:aload_0         
	//   24   74:invokevirtual   #291 <Method long getLocalMillis()>
	//   25   77:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//   26   80:ireturn         

		case 2: // '\002'
			return getChronology().secondOfMinute().get(getLocalMillis());
	//   27   81:aload_0         
	//   28   82:invokevirtual   #282 <Method Chronology getChronology()>
	//   29   85:invokevirtual   #306 <Method DateTimeField Chronology.secondOfMinute()>
	//   30   88:aload_0         
	//   31   89:invokevirtual   #291 <Method long getLocalMillis()>
	//   32   92:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//   33   95:ireturn         

		case 1: // '\001'
			return getChronology().minuteOfHour().get(getLocalMillis());
	//   34   96:aload_0         
	//   35   97:invokevirtual   #282 <Method Chronology getChronology()>
	//   36  100:invokevirtual   #309 <Method DateTimeField Chronology.minuteOfHour()>
	//   37  103:aload_0         
	//   38  104:invokevirtual   #291 <Method long getLocalMillis()>
	//   39  107:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//   40  110:ireturn         

		case 0: // '\0'
			return getChronology().hourOfDay().get(getLocalMillis());
	//   41  111:aload_0         
	//   42  112:invokevirtual   #282 <Method Chronology getChronology()>
	//   43  115:invokevirtual   #312 <Method DateTimeField Chronology.hourOfDay()>
	//   44  118:aload_0         
	//   45  119:invokevirtual   #291 <Method long getLocalMillis()>
	//   46  122:invokevirtual   #134 <Method int DateTimeField.get(long)>
	//   47  125:ireturn         
		}
	}

	public Property hourOfDay()
	{
	/* block-local class not found */
	class Property {}

		return new Property(getChronology().hourOfDay());
	//    0    0:new             #10  <Class LocalTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #282 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #312 <Method DateTimeField Chronology.hourOfDay()>
	//    6   12:invokespecial   #322 <Method void LocalTime$Property(LocalTime, DateTimeField)>
	//    7   15:areturn         
	}

	public boolean isSupported(DateTimeFieldType datetimefieldtype)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(datetimefieldtype == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if(!isSupported(datetimefieldtype.getDurationType()))
	//*   6    8:aload_0         
	//*   7    9:aload_1         
	//*   8   10:invokevirtual   #325 <Method DurationFieldType DateTimeFieldType.getDurationType()>
	//*   9   13:invokevirtual   #328 <Method boolean isSupported(DurationFieldType)>
	//*  10   16:ifne            21
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		datetimefieldtype = ((DateTimeFieldType) (datetimefieldtype.getRangeDurationType()));
	//   13   21:aload_1         
	//   14   22:invokevirtual   #331 <Method DurationFieldType DateTimeFieldType.getRangeDurationType()>
	//   15   25:astore_1        
		if(isSupported(((DurationFieldType) (datetimefieldtype))) || datetimefieldtype == DurationFieldType.days())
	//*  16   26:aload_0         
	//*  17   27:aload_1         
	//*  18   28:invokevirtual   #328 <Method boolean isSupported(DurationFieldType)>
	//*  19   31:ifne            41
	//*  20   34:aload_1         
	//*  21   35:invokestatic    #334 <Method DurationFieldType DurationFieldType.days()>
	//*  22   38:if_acmpne       43
			flag = true;
	//   23   41:iconst_1        
	//   24   42:istore_2        
		return flag;
	//   25   43:iload_2         
	//   26   44:ireturn         
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
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #337 <Method DurationField DurationFieldType.getField(Chronology)>
	//    8   14:astore_2        
		if(!TIME_DURATION_TYPES.contains(((Object) (durationfieldtype))) && durationfield.getUnitMillis() >= getChronology().days().getUnitMillis())
	//*   9   15:getstatic       #45  <Field Set TIME_DURATION_TYPES>
	//*  10   18:aload_1         
	//*  11   19:invokeinterface #340 <Method boolean Set.contains(Object)>
	//*  12   24:ifne            50
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #345 <Method long DurationField.getUnitMillis()>
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #282 <Method Chronology getChronology()>
	//*  17   35:invokevirtual   #348 <Method DurationField Chronology.days()>
	//*  18   38:invokevirtual   #345 <Method long DurationField.getUnitMillis()>
	//*  19   41:lcmp            
	//*  20   42:ifge            48
	//*  21   45:goto            50
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		else
			return durationfield.isSupported();
	//   24   50:aload_2         
	//   25   51:invokevirtual   #351 <Method boolean DurationField.isSupported()>
	//   26   54:ireturn         
	}

	public Property millisOfDay()
	{
		return new Property(getChronology().millisOfDay());
	//    0    0:new             #10  <Class LocalTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #282 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #128 <Method DateTimeField Chronology.millisOfDay()>
	//    6   12:invokespecial   #322 <Method void LocalTime$Property(LocalTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property millisOfSecond()
	{
		return new Property(getChronology().millisOfSecond());
	//    0    0:new             #10  <Class LocalTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #282 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #303 <Method DateTimeField Chronology.millisOfSecond()>
	//    6   12:invokespecial   #322 <Method void LocalTime$Property(LocalTime, DateTimeField)>
	//    7   15:areturn         
	}

	public LocalTime minus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #357 <Method LocalTime withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public LocalTime minusHours(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #361 <Method DurationField Chronology.hours()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #365 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalTime minusMillis(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #371 <Method DurationField Chronology.millis()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #365 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalTime minusMinutes(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #374 <Method DurationField Chronology.minutes()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #365 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalTime minusSeconds(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #377 <Method DurationField Chronology.seconds()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #365 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public Property minuteOfHour()
	{
		return new Property(getChronology().minuteOfHour());
	//    0    0:new             #10  <Class LocalTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #282 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #309 <Method DateTimeField Chronology.minuteOfHour()>
	//    6   12:invokespecial   #322 <Method void LocalTime$Property(LocalTime, DateTimeField)>
	//    7   15:areturn         
	}

	public LocalTime plus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #357 <Method LocalTime withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public LocalTime plusHours(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #361 <Method DurationField Chronology.hours()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #381 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalTime plusMillis(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #371 <Method DurationField Chronology.millis()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #381 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalTime plusMinutes(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #374 <Method DurationField Chronology.minutes()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #381 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalTime plusSeconds(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #377 <Method DurationField Chronology.seconds()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #381 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
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
	//    4    8:ldc2            #258 <String "The DateTimeFieldType must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(datetimefieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #262 <Method boolean isSupported(DateTimeFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #264 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #265 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("Field '");
	//   15   31:aload_2         
	//   16   32:ldc2            #267 <String "Field '">
	//   17   35:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #274 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_2         
	//   24   46:ldc2            #276 <String "' is not supported">
	//   25   49:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		} else
		{
			return new Property(datetimefieldtype.getField(getChronology()));
	//   33   65:new             #10  <Class LocalTime$Property>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:aload_0         
	//   38   72:invokevirtual   #282 <Method Chronology getChronology()>
	//   39   75:invokevirtual   #288 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   40   78:invokespecial   #322 <Method void LocalTime$Property(LocalTime, DateTimeField)>
	//   41   81:areturn         
		}
	}

	public Property secondOfMinute()
	{
		return new Property(getChronology().secondOfMinute());
	//    0    0:new             #10  <Class LocalTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #282 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #306 <Method DateTimeField Chronology.secondOfMinute()>
	//    6   12:invokespecial   #322 <Method void LocalTime$Property(LocalTime, DateTimeField)>
	//    7   15:areturn         
	}

	public int size()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public DateTime toDateTimeToday()
	{
		return toDateTimeToday(((DateTimeZone) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #392 <Method DateTime toDateTimeToday(DateTimeZone)>
	//    3    5:areturn         
	}

	public DateTime toDateTimeToday(DateTimeZone datetimezone)
	{
		datetimezone = ((DateTimeZone) (getChronology().withZone(datetimezone)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method Chronology getChronology()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #396 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    4    8:astore_1        
		return new DateTime(((Chronology) (datetimezone)).set(((ReadablePartial) (this)), DateTimeUtils.currentTimeMillis()), ((Chronology) (datetimezone)));
	//    5    9:new             #398 <Class DateTime>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokestatic    #73  <Method long DateTimeUtils.currentTimeMillis()>
	//   10   18:invokevirtual   #402 <Method long Chronology.set(ReadablePartial, long)>
	//   11   21:aload_1         
	//   12   22:invokespecial   #403 <Method void DateTime(long, Chronology)>
	//   13   25:areturn         
	}

	public String toString()
	{
		return ISODateTimeFormat.time().print(((ReadablePartial) (this)));
	//    0    0:invokestatic    #407 <Method DateTimeFormatter ISODateTimeFormat.time()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #411 <Method String DateTimeFormatter.print(ReadablePartial)>
	//    3    7:areturn         
	}

	public String toString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #413 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #419 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #411 <Method String DateTimeFormatter.print(ReadablePartial)>
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
	//    3    5:invokevirtual   #413 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).withLocale(locale).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #419 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #424 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #411 <Method String DateTimeFormatter.print(ReadablePartial)>
	//   11   21:areturn         
	}

	public LocalTime withField(DateTimeFieldType datetimefieldtype, int i)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #429 <String "Field must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(datetimefieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #262 <Method boolean isSupported(DateTimeFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #264 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #265 <Method void StringBuilder()>
	//   14   30:astore_3        
			stringbuilder.append("Field '");
	//   15   31:aload_3         
	//   16   32:ldc2            #267 <String "Field '">
	//   17   35:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #274 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_3         
	//   24   46:ldc2            #276 <String "' is not supported">
	//   25   49:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_3         
	//   30   58:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		} else
		{
			return withLocalMillis(datetimefieldtype.getField(getChronology()).set(getLocalMillis(), i));
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:aload_0         
	//   36   68:invokevirtual   #282 <Method Chronology getChronology()>
	//   37   71:invokevirtual   #288 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   38   74:aload_0         
	//   39   75:invokevirtual   #291 <Method long getLocalMillis()>
	//   40   78:iload_2         
	//   41   79:invokevirtual   #431 <Method long DateTimeField.set(long, int)>
	//   42   82:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   43   85:areturn         
		}
	}

	public LocalTime withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #176 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #429 <String "Field must not be null">
	//    5   11:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(durationfieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #328 <Method boolean isSupported(DurationFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #264 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #265 <Method void StringBuilder()>
	//   14   30:astore_3        
			stringbuilder.append("Field '");
	//   15   31:aload_3         
	//   16   32:ldc2            #267 <String "Field '">
	//   17   35:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (durationfieldtype)));
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #274 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_3         
	//   24   46:ldc2            #276 <String "' is not supported">
	//   25   49:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #176 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_3         
	//   30   58:invokevirtual   #280 <Method String StringBuilder.toString()>
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
	//   40   74:invokevirtual   #282 <Method Chronology getChronology()>
	//   41   77:invokevirtual   #337 <Method DurationField DurationFieldType.getField(Chronology)>
	//   42   80:aload_0         
	//   43   81:invokevirtual   #291 <Method long getLocalMillis()>
	//   44   84:iload_2         
	//   45   85:invokevirtual   #381 <Method long DurationField.add(long, int)>
	//   46   88:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   47   91:areturn         
	}

	public LocalTime withFields(ReadablePartial readablepartial)
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
	//    6    8:invokevirtual   #282 <Method Chronology getChronology()>
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #291 <Method long getLocalMillis()>
	//   10   16:invokevirtual   #402 <Method long Chronology.set(ReadablePartial, long)>
	//   11   19:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   12   22:areturn         
	}

	public LocalTime withHourOfDay(int i)
	{
		return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #282 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #312 <Method DateTimeField Chronology.hourOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #291 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #431 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	LocalTime withLocalMillis(long l)
	{
		if(l == getLocalMillis())
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #291 <Method long getLocalMillis()>
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return new LocalTime(l, getChronology());
	//    7   11:new             #2   <Class LocalTime>
	//    8   14:dup             
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #282 <Method Chronology getChronology()>
	//   12   20:invokespecial   #82  <Method void LocalTime(long, Chronology)>
	//   13   23:areturn         
	}

	public LocalTime withMillisOfDay(int i)
	{
		return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #282 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #128 <Method DateTimeField Chronology.millisOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #291 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #431 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalTime withMillisOfSecond(int i)
	{
		return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #282 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #303 <Method DateTimeField Chronology.millisOfSecond()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #291 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #431 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalTime withMinuteOfHour(int i)
	{
		return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #282 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #309 <Method DateTimeField Chronology.minuteOfHour()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #291 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #431 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalTime withPeriodAdded(ReadablePeriod readableperiod, int i)
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
				return withLocalMillis(getChronology().add(readableperiod, getLocalMillis(), i));
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #282 <Method Chronology getChronology()>
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #291 <Method long getLocalMillis()>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #442 <Method long Chronology.add(ReadablePeriod, long, int)>
	//   14   24:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//   15   27:areturn         
		} else
		{
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		}
	}

	public LocalTime withSecondOfMinute(int i)
	{
		return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #282 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #306 <Method DateTimeField Chronology.secondOfMinute()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #291 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #431 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #368 <Method LocalTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	private static final int HOUR_OF_DAY = 0;
	public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
	private static final int MILLIS_OF_SECOND = 3;
	private static final int MINUTE_OF_HOUR = 1;
	private static final int SECOND_OF_MINUTE = 2;
	private static final Set TIME_DURATION_TYPES;
	private static final long serialVersionUID = 0xbbf29defL;
	private final Chronology iChronology;
	private final long iLocalMillis;

	static 
	{
	//    0    0:new             #2   <Class LocalTime>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokespecial   #37  <Method void LocalTime(int, int, int, int)>
	//    7   11:putstatic       #39  <Field LocalTime MIDNIGHT>
		TIME_DURATION_TYPES = ((Set) (new HashSet()));
	//    8   14:new             #41  <Class HashSet>
	//    9   17:dup             
	//   10   18:invokespecial   #43  <Method void HashSet()>
	//   11   21:putstatic       #45  <Field Set TIME_DURATION_TYPES>
		TIME_DURATION_TYPES.add(((Object) (DurationFieldType.millis())));
	//   12   24:getstatic       #45  <Field Set TIME_DURATION_TYPES>
	//   13   27:invokestatic    #51  <Method DurationFieldType DurationFieldType.millis()>
	//   14   30:invokeinterface #57  <Method boolean Set.add(Object)>
	//   15   35:pop             
		TIME_DURATION_TYPES.add(((Object) (DurationFieldType.seconds())));
	//   16   36:getstatic       #45  <Field Set TIME_DURATION_TYPES>
	//   17   39:invokestatic    #60  <Method DurationFieldType DurationFieldType.seconds()>
	//   18   42:invokeinterface #57  <Method boolean Set.add(Object)>
	//   19   47:pop             
		TIME_DURATION_TYPES.add(((Object) (DurationFieldType.minutes())));
	//   20   48:getstatic       #45  <Field Set TIME_DURATION_TYPES>
	//   21   51:invokestatic    #63  <Method DurationFieldType DurationFieldType.minutes()>
	//   22   54:invokeinterface #57  <Method boolean Set.add(Object)>
	//   23   59:pop             
		TIME_DURATION_TYPES.add(((Object) (DurationFieldType.hours())));
	//   24   60:getstatic       #45  <Field Set TIME_DURATION_TYPES>
	//   25   63:invokestatic    #66  <Method DurationFieldType DurationFieldType.hours()>
	//   26   66:invokeinterface #57  <Method boolean Set.add(Object)>
	//   27   71:pop             
	//*  28   72:return          
	}
}
