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
//			ReadablePartial, DateTimeUtils, Chronology, DateTimeZone, 
//			DateTimeFieldType, DateTimeField, DurationFieldType, DurationField, 
//			DateTime, LocalDate, LocalTime, ReadableDuration, 
//			ReadablePeriod

public final class LocalDateTime extends BaseLocal
	implements ReadablePartial, Serializable
{

	public LocalDateTime()
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:invokestatic    #40  <Method ISOChronology ISOChronology.getInstance()>
	//    3    7:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
	//    4   10:return          
	}

	public LocalDateTime(int i, int j, int k, int l, int i1)
	{
		this(i, j, k, l, i1, 0, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokestatic    #48  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    9   13:invokespecial   #51  <Method void LocalDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   16:return          
	}

	public LocalDateTime(int i, int j, int k, int l, int i1, int j1)
	{
		this(i, j, k, l, i1, j1, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iconst_0        
	//    8   11:invokestatic    #48  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    9   14:invokespecial   #51  <Method void LocalDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   17:return          
	}

	public LocalDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
	{
		this(i, j, k, l, i1, j1, k1, ((Chronology) (ISOChronology.getInstanceUTC())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:invokestatic    #48  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    9   15:invokespecial   #51  <Method void LocalDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   18:return          
	}

	public LocalDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
			Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void BaseLocal()>
		chronology = DateTimeUtils.getChronology(chronology).withUTC();
	//    2    4:aload           8
	//    3    6:invokestatic    #59  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    9:invokevirtual   #65  <Method Chronology Chronology.withUTC()>
	//    5   12:astore          8
		long l1 = chronology.getDateTimeMillis(i, j, k, l, i1, j1, k1);
	//    6   14:aload           8
	//    7   16:iload_1         
	//    8   17:iload_2         
	//    9   18:iload_3         
	//   10   19:iload           4
	//   11   21:iload           5
	//   12   23:iload           6
	//   13   25:iload           7
	//   14   27:invokevirtual   #69  <Method long Chronology.getDateTimeMillis(int, int, int, int, int, int, int)>
	//   15   30:lstore          9
		iChronology = chronology;
	//   16   32:aload_0         
	//   17   33:aload           8
	//   18   35:putfield        #71  <Field Chronology iChronology>
		iLocalMillis = l1;
	//   19   38:aload_0         
	//   20   39:lload           9
	//   21   41:putfield        #73  <Field long iLocalMillis>
	//   22   44:return          
	}

	public LocalDateTime(long l)
	{
		this(l, ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #40  <Method ISOChronology ISOChronology.getInstance()>
	//    3    5:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
	//    4    8:return          
	}

	public LocalDateTime(long l, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void BaseLocal()>
		chronology = DateTimeUtils.getChronology(chronology);
	//    2    4:aload_3         
	//    3    5:invokestatic    #59  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    8:astore_3        
		iLocalMillis = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, l);
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #78  <Method DateTimeZone Chronology.getZone()>
	//    8   14:getstatic       #84  <Field DateTimeZone DateTimeZone.UTC>
	//    9   17:lload_1         
	//   10   18:invokevirtual   #88  <Method long DateTimeZone.getMillisKeepLocal(DateTimeZone, long)>
	//   11   21:putfield        #73  <Field long iLocalMillis>
		iChronology = chronology.withUTC();
	//   12   24:aload_0         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #65  <Method Chronology Chronology.withUTC()>
	//   15   29:putfield        #71  <Field Chronology iChronology>
	//   16   32:return          
	}

	public LocalDateTime(long l, DateTimeZone datetimezone)
	{
		this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #92  <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    6:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
	//    5    9:return          
	}

	public LocalDateTime(Object obj)
	{
		this(obj, (Chronology)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #61  <Class Chronology>
	//    4    6:invokespecial   #96  <Method void LocalDateTime(Object, Chronology)>
	//    5    9:return          
	}

	public LocalDateTime(Object obj, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void BaseLocal()>
		PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
	//    2    4:invokestatic    #101 <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #105 <Method PartialConverter ConverterManager.getPartialConverter(Object)>
	//    5   11:astore_3        
		chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #110 <Method Chronology PartialConverter.getChronology(Object, Chronology)>
	//   10   20:invokestatic    #59  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   11   23:astore_2        
		iChronology = chronology.withUTC();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #65  <Method Chronology Chronology.withUTC()>
	//   15   29:putfield        #71  <Field Chronology iChronology>
		obj = ((Object) (partialconverter.getPartialValues(((ReadablePartial) (this)), obj, chronology, ISODateTimeFormat.localDateOptionalTimeParser())));
	//   16   32:aload_3         
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #116 <Method DateTimeFormatter ISODateTimeFormat.localDateOptionalTimeParser()>
	//   21   39:invokeinterface #120 <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology, DateTimeFormatter)>
	//   22   44:astore_1        
		iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], obj[3]);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #71  <Field Chronology iChronology>
	//   26   50:aload_1         
	//   27   51:iconst_0        
	//   28   52:iaload          
	//   29   53:aload_1         
	//   30   54:iconst_1        
	//   31   55:iaload          
	//   32   56:aload_1         
	//   33   57:iconst_2        
	//   34   58:iaload          
	//   35   59:aload_1         
	//   36   60:iconst_3        
	//   37   61:iaload          
	//   38   62:invokevirtual   #123 <Method long Chronology.getDateTimeMillis(int, int, int, int)>
	//   39   65:putfield        #73  <Field long iLocalMillis>
	//   40   68:return          
	}

	public LocalDateTime(Object obj, DateTimeZone datetimezone)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void BaseLocal()>
		PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
	//    2    4:invokestatic    #101 <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #105 <Method PartialConverter ConverterManager.getPartialConverter(Object)>
	//    5   11:astore_3        
		datetimezone = ((DateTimeZone) (DateTimeUtils.getChronology(partialconverter.getChronology(obj, datetimezone))));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #127 <Method Chronology PartialConverter.getChronology(Object, DateTimeZone)>
	//   10   20:invokestatic    #59  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   11   23:astore_2        
		iChronology = ((Chronology) (datetimezone)).withUTC();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #65  <Method Chronology Chronology.withUTC()>
	//   15   29:putfield        #71  <Field Chronology iChronology>
		obj = ((Object) (partialconverter.getPartialValues(((ReadablePartial) (this)), obj, ((Chronology) (datetimezone)), ISODateTimeFormat.localDateOptionalTimeParser())));
	//   16   32:aload_3         
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #116 <Method DateTimeFormatter ISODateTimeFormat.localDateOptionalTimeParser()>
	//   21   39:invokeinterface #120 <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology, DateTimeFormatter)>
	//   22   44:astore_1        
		iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], obj[3]);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #71  <Field Chronology iChronology>
	//   26   50:aload_1         
	//   27   51:iconst_0        
	//   28   52:iaload          
	//   29   53:aload_1         
	//   30   54:iconst_1        
	//   31   55:iaload          
	//   32   56:aload_1         
	//   33   57:iconst_2        
	//   34   58:iaload          
	//   35   59:aload_1         
	//   36   60:iconst_3        
	//   37   61:iaload          
	//   38   62:invokevirtual   #123 <Method long Chronology.getDateTimeMillis(int, int, int, int)>
	//   39   65:putfield        #73  <Field long iLocalMillis>
	//   40   68:return          
	}

	public LocalDateTime(Chronology chronology)
	{
		this(DateTimeUtils.currentTimeMillis(), chronology);
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
	//    4    8:return          
	}

	public LocalDateTime(DateTimeZone datetimezone)
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #92  <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    8:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
	//    5   11:return          
	}

	private Date correctDstTransition(Date date, TimeZone timezone)
	{
label0:
		{
			Calendar calendar = Calendar.getInstance(timezone);
	//    0    0:aload_2         
	//    1    1:invokestatic    #136 <Method Calendar Calendar.getInstance(TimeZone)>
	//    2    4:astore_3        
			calendar.setTime(date);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #140 <Method void Calendar.setTime(Date)>
			date = ((Date) (fromCalendarFields(calendar)));
	//    6   10:aload_3         
	//    7   11:invokestatic    #144 <Method LocalDateTime fromCalendarFields(Calendar)>
	//    8   14:astore_1        
			if(((LocalDateTime) (date)).isBefore(((ReadablePartial) (this))))
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #148 <Method boolean isBefore(ReadablePartial)>
	//*  12   20:ifeq            96
			{
				do
				{
					timezone = ((TimeZone) (date));
	//   13   23:aload_1         
	//   14   24:astore_2        
					if(!((LocalDateTime) (date)).isBefore(((ReadablePartial) (this))))
						break;
	//   15   25:aload_1         
	//   16   26:aload_0         
	//   17   27:invokevirtual   #148 <Method boolean isBefore(ReadablePartial)>
	//   18   30:ifeq            53
					calendar.setTimeInMillis(calendar.getTimeInMillis() + 60000L);
	//   19   33:aload_3         
	//   20   34:aload_3         
	//   21   35:invokevirtual   #151 <Method long Calendar.getTimeInMillis()>
	//   22   38:ldc2w           #152 <Long 60000L>
	//   23   41:ladd            
	//   24   42:invokevirtual   #156 <Method void Calendar.setTimeInMillis(long)>
					date = ((Date) (fromCalendarFields(calendar)));
	//   25   45:aload_3         
	//   26   46:invokestatic    #144 <Method LocalDateTime fromCalendarFields(Calendar)>
	//   27   49:astore_1        
				} while(true);
	//   28   50:goto            23
				for(; !((LocalDateTime) (timezone)).isBefore(((ReadablePartial) (this))); timezone = ((TimeZone) (fromCalendarFields(calendar))))
	//*  29   53:aload_2         
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #148 <Method boolean isBefore(ReadablePartial)>
	//*  32   58:ifne            81
					calendar.setTimeInMillis(calendar.getTimeInMillis() - 1000L);
	//   33   61:aload_3         
	//   34   62:aload_3         
	//   35   63:invokevirtual   #151 <Method long Calendar.getTimeInMillis()>
	//   36   66:ldc2w           #157 <Long 1000L>
	//   37   69:lsub            
	//   38   70:invokevirtual   #156 <Method void Calendar.setTimeInMillis(long)>

	//   39   73:aload_3         
	//   40   74:invokestatic    #144 <Method LocalDateTime fromCalendarFields(Calendar)>
	//   41   77:astore_2        
	//*  42   78:goto            53
				calendar.setTimeInMillis(calendar.getTimeInMillis() + 1000L);
	//   43   81:aload_3         
	//   44   82:aload_3         
	//   45   83:invokevirtual   #151 <Method long Calendar.getTimeInMillis()>
	//   46   86:ldc2w           #157 <Long 1000L>
	//   47   89:ladd            
	//   48   90:invokevirtual   #156 <Method void Calendar.setTimeInMillis(long)>
			} else
	//*  49   93:goto            137
			if(((LocalDateTime) (date)).equals(((Object) (this))))
	//*  50   96:aload_1         
	//*  51   97:aload_0         
	//*  52   98:invokevirtual   #162 <Method boolean equals(Object)>
	//*  53  101:ifeq            137
			{
				date = ((Date) (Calendar.getInstance(timezone)));
	//   54  104:aload_2         
	//   55  105:invokestatic    #136 <Method Calendar Calendar.getInstance(TimeZone)>
	//   56  108:astore_1        
				((Calendar) (date)).setTimeInMillis(calendar.getTimeInMillis() - (long)timezone.getDSTSavings());
	//   57  109:aload_1         
	//   58  110:aload_3         
	//   59  111:invokevirtual   #151 <Method long Calendar.getTimeInMillis()>
	//   60  114:aload_2         
	//   61  115:invokevirtual   #168 <Method int TimeZone.getDSTSavings()>
	//   62  118:i2l             
	//   63  119:lsub            
	//   64  120:invokevirtual   #156 <Method void Calendar.setTimeInMillis(long)>
				if(fromCalendarFields(((Calendar) (date))).equals(((Object) (this))))
	//*  65  123:aload_1         
	//*  66  124:invokestatic    #144 <Method LocalDateTime fromCalendarFields(Calendar)>
	//*  67  127:aload_0         
	//*  68  128:invokevirtual   #162 <Method boolean equals(Object)>
	//*  69  131:ifeq            137
					break label0;
	//   70  134:goto            139
			}
			date = ((Date) (calendar));
	//   71  137:aload_3         
	//   72  138:astore_1        
		}
		return ((Calendar) (date)).getTime();
	//   73  139:aload_1         
	//   74  140:invokevirtual   #172 <Method Date Calendar.getTime()>
	//   75  143:areturn         
	}

	public static LocalDateTime fromCalendarFields(Calendar calendar)
	{
		if(calendar == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The calendar must not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #176 <String "The calendar must not be null">
	//    5   10:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		int j = calendar.get(0);
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #183 <Method int Calendar.get(int)>
	//   10   19:istore_2        
		int i = calendar.get(1);
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:invokevirtual   #183 <Method int Calendar.get(int)>
	//   14   25:istore_1        
		if(j != 1)
	//*  15   26:iload_2         
	//*  16   27:iconst_1        
	//*  17   28:icmpne          34
	//*  18   31:goto            41
			i = 1 - i;
	//   19   34:iconst_1        
	//   20   35:iload_1         
	//   21   36:isub            
	//   22   37:istore_1        
	//*  23   38:goto            31
		return new LocalDateTime(i, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
	//   24   41:new             #2   <Class LocalDateTime>
	//   25   44:dup             
	//   26   45:iload_1         
	//   27   46:aload_0         
	//   28   47:iconst_2        
	//   29   48:invokevirtual   #183 <Method int Calendar.get(int)>
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:aload_0         
	//   33   54:iconst_5        
	//   34   55:invokevirtual   #183 <Method int Calendar.get(int)>
	//   35   58:aload_0         
	//   36   59:bipush          11
	//   37   61:invokevirtual   #183 <Method int Calendar.get(int)>
	//   38   64:aload_0         
	//   39   65:bipush          12
	//   40   67:invokevirtual   #183 <Method int Calendar.get(int)>
	//   41   70:aload_0         
	//   42   71:bipush          13
	//   43   73:invokevirtual   #183 <Method int Calendar.get(int)>
	//   44   76:aload_0         
	//   45   77:bipush          14
	//   46   79:invokevirtual   #183 <Method int Calendar.get(int)>
	//   47   82:invokespecial   #185 <Method void LocalDateTime(int, int, int, int, int, int, int)>
	//   48   85:areturn         
	}

	public static LocalDateTime fromDateFields(Date date)
	{
		if(date == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The date must not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #189 <String "The date must not be null">
	//    5   10:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(date.getTime() < 0L)
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #193 <Method long Date.getTime()>
	//*   9   18:lconst_0        
	//*  10   19:lcmp            
	//*  11   20:ifge            41
		{
			GregorianCalendar gregoriancalendar = new GregorianCalendar();
	//   12   23:new             #195 <Class GregorianCalendar>
	//   13   26:dup             
	//   14   27:invokespecial   #196 <Method void GregorianCalendar()>
	//   15   30:astore_1        
			gregoriancalendar.setTime(date);
	//   16   31:aload_1         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #197 <Method void GregorianCalendar.setTime(Date)>
			return fromCalendarFields(((Calendar) (gregoriancalendar)));
	//   19   36:aload_1         
	//   20   37:invokestatic    #144 <Method LocalDateTime fromCalendarFields(Calendar)>
	//   21   40:areturn         
		} else
		{
			return new LocalDateTime(date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), ((int)(date.getTime() % 1000L) + 1000) % 1000);
	//   22   41:new             #2   <Class LocalDateTime>
	//   23   44:dup             
	//   24   45:aload_0         
	//   25   46:invokevirtual   #200 <Method int Date.getYear()>
	//   26   49:sipush          1900
	//   27   52:iadd            
	//   28   53:aload_0         
	//   29   54:invokevirtual   #203 <Method int Date.getMonth()>
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:aload_0         
	//   33   60:invokevirtual   #206 <Method int Date.getDate()>
	//   34   63:aload_0         
	//   35   64:invokevirtual   #209 <Method int Date.getHours()>
	//   36   67:aload_0         
	//   37   68:invokevirtual   #212 <Method int Date.getMinutes()>
	//   38   71:aload_0         
	//   39   72:invokevirtual   #215 <Method int Date.getSeconds()>
	//   40   75:aload_0         
	//   41   76:invokevirtual   #193 <Method long Date.getTime()>
	//   42   79:ldc2w           #157 <Long 1000L>
	//   43   82:lrem            
	//   44   83:l2i             
	//   45   84:sipush          1000
	//   46   87:iadd            
	//   47   88:sipush          1000
	//   48   91:irem            
	//   49   92:invokespecial   #185 <Method void LocalDateTime(int, int, int, int, int, int, int)>
	//   50   95:areturn         
		}
	}

	public static LocalDateTime now()
	{
		return new LocalDateTime();
	//    0    0:new             #2   <Class LocalDateTime>
	//    1    3:dup             
	//    2    4:invokespecial   #218 <Method void LocalDateTime()>
	//    3    7:areturn         
	}

	public static LocalDateTime now(Chronology chronology)
	{
		if(chronology == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Chronology must not be null");
	//    2    4:new             #221 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #223 <String "Chronology must not be null">
	//    5   10:invokespecial   #224 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new LocalDateTime(chronology);
	//    7   14:new             #2   <Class LocalDateTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #226 <Method void LocalDateTime(Chronology)>
	//   11   22:areturn         
	}

	public static LocalDateTime now(DateTimeZone datetimezone)
	{
		if(datetimezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Zone must not be null");
	//    2    4:new             #221 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #229 <String "Zone must not be null">
	//    5   10:invokespecial   #224 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return new LocalDateTime(datetimezone);
	//    7   14:new             #2   <Class LocalDateTime>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #231 <Method void LocalDateTime(DateTimeZone)>
	//   11   22:areturn         
	}

	public static LocalDateTime parse(String s)
	{
		return parse(s, ISODateTimeFormat.localDateOptionalTimeParser());
	//    0    0:aload_0         
	//    1    1:invokestatic    #116 <Method DateTimeFormatter ISODateTimeFormat.localDateOptionalTimeParser()>
	//    2    4:invokestatic    #237 <Method LocalDateTime parse(String, DateTimeFormatter)>
	//    3    7:areturn         
	}

	public static LocalDateTime parse(String s, DateTimeFormatter datetimeformatter)
	{
		return datetimeformatter.parseLocalDateTime(s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #243 <Method LocalDateTime DateTimeFormatter.parseLocalDateTime(String)>
	//    3    5:areturn         
	}

	private Object readResolve()
	{
		if(iChronology == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Chronology iChronology>
	//*   2    4:ifnonnull       22
			return ((Object) (new LocalDateTime(iLocalMillis, ((Chronology) (ISOChronology.getInstanceUTC())))));
	//    3    7:new             #2   <Class LocalDateTime>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field long iLocalMillis>
	//    7   15:invokestatic    #48  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    8   18:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
	//    9   21:areturn         
		if(!DateTimeZone.UTC.equals(((Object) (iChronology.getZone()))))
	//*  10   22:getstatic       #84  <Field DateTimeZone DateTimeZone.UTC>
	//*  11   25:aload_0         
	//*  12   26:getfield        #71  <Field Chronology iChronology>
	//*  13   29:invokevirtual   #78  <Method DateTimeZone Chronology.getZone()>
	//*  14   32:invokevirtual   #246 <Method boolean DateTimeZone.equals(Object)>
	//*  15   35:ifne            57
			return ((Object) (new LocalDateTime(iLocalMillis, iChronology.withUTC())));
	//   16   38:new             #2   <Class LocalDateTime>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:getfield        #73  <Field long iLocalMillis>
	//   20   46:aload_0         
	//   21   47:getfield        #71  <Field Chronology iChronology>
	//   22   50:invokevirtual   #65  <Method Chronology Chronology.withUTC()>
	//   23   53:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
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
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #253 <Method DateTimeField Chronology.centuryOfEra()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ReadablePartial)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class ReadablePartial>
	//    3    5:invokevirtual   #261 <Method int compareTo(ReadablePartial)>
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
		if(readablepartial instanceof LocalDateTime)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocalDateTime>
	//*   7   11:ifeq            63
		{
			LocalDateTime localdatetime = (LocalDateTime)readablepartial;
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class LocalDateTime>
	//   10   18:astore_2        
			if(((Object) (iChronology)).equals(((Object) (localdatetime.iChronology))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #71  <Field Chronology iChronology>
	//*  13   23:aload_2         
	//*  14   24:getfield        #71  <Field Chronology iChronology>
	//*  15   27:invokevirtual   #264 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            63
			{
				if(iLocalMillis < localdatetime.iLocalMillis)
	//*  17   33:aload_0         
	//*  18   34:getfield        #73  <Field long iLocalMillis>
	//*  19   37:aload_2         
	//*  20   38:getfield        #73  <Field long iLocalMillis>
	//*  21   41:lcmp            
	//*  22   42:ifge            47
					return -1;
	//   23   45:iconst_m1       
	//   24   46:ireturn         
				return iLocalMillis != localdatetime.iLocalMillis ? 1 : 0;
	//   25   47:aload_0         
	//   26   48:getfield        #73  <Field long iLocalMillis>
	//   27   51:aload_2         
	//   28   52:getfield        #73  <Field long iLocalMillis>
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
	//   37   65:invokespecial   #265 <Method int BaseLocal.compareTo(ReadablePartial)>
	//   38   68:ireturn         
	}

	public Property dayOfMonth()
	{
		return new Property(getChronology().dayOfMonth());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #268 <Method DateTimeField Chronology.dayOfMonth()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfWeek()
	{
		return new Property(getChronology().dayOfWeek());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #271 <Method DateTimeField Chronology.dayOfWeek()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property dayOfYear()
	{
		return new Property(getChronology().dayOfYear());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #274 <Method DateTimeField Chronology.dayOfYear()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
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
		if(obj instanceof LocalDateTime)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocalDateTime>
	//*   7   11:ifeq            49
		{
			LocalDateTime localdatetime = (LocalDateTime)obj;
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class LocalDateTime>
	//   10   18:astore_2        
			if(((Object) (iChronology)).equals(((Object) (localdatetime.iChronology))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #71  <Field Chronology iChronology>
	//*  13   23:aload_2         
	//*  14   24:getfield        #71  <Field Chronology iChronology>
	//*  15   27:invokevirtual   #264 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            49
				return iLocalMillis == localdatetime.iLocalMillis;
	//   17   33:aload_0         
	//   18   34:getfield        #73  <Field long iLocalMillis>
	//   19   37:aload_2         
	//   20   38:getfield        #73  <Field long iLocalMillis>
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
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #278 <Method DateTimeField Chronology.era()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public int get(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #281 <String "The DateTimeFieldType must not be null">
	//    5   11:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return datetimefieldtype.getField(getChronology()).get(getLocalMillis());
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #250 <Method Chronology getChronology()>
	//   10   20:invokevirtual   #287 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #290 <Method long getLocalMillis()>
	//   13   27:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//   14   30:ireturn         
	}

	public int getCenturyOfEra()
	{
		return getChronology().centuryOfEra().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #253 <Method DateTimeField Chronology.centuryOfEra()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public Chronology getChronology()
	{
		return iChronology;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Chronology iChronology>
	//    2    4:areturn         
	}

	public int getDayOfMonth()
	{
		return getChronology().dayOfMonth().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #268 <Method DateTimeField Chronology.dayOfMonth()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getDayOfWeek()
	{
		return getChronology().dayOfWeek().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #271 <Method DateTimeField Chronology.dayOfWeek()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getDayOfYear()
	{
		return getChronology().dayOfYear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #274 <Method DateTimeField Chronology.dayOfYear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getEra()
	{
		return getChronology().era().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #278 <Method DateTimeField Chronology.era()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
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
	//    2   32:new             #303 <Class StringBuilder>
	//    3   35:dup             
	//    4   36:invokespecial   #304 <Method void StringBuilder()>
	//    5   39:astore_2        
			((StringBuilder) (chronology)).append("Invalid index: ");
	//    6   40:aload_2         
	//    7   41:ldc2            #306 <String "Invalid index: ">
	//    8   44:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//    9   47:pop             
			((StringBuilder) (chronology)).append(i);
	//   10   48:aload_2         
	//   11   49:iload_1         
	//   12   50:invokevirtual   #313 <Method StringBuilder StringBuilder.append(int)>
	//   13   53:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (chronology)).toString());
	//   14   54:new             #315 <Class IndexOutOfBoundsException>
	//   15   57:dup             
	//   16   58:aload_2         
	//   17   59:invokevirtual   #319 <Method String StringBuilder.toString()>
	//   18   62:invokespecial   #320 <Method void IndexOutOfBoundsException(String)>
	//   19   65:athrow          

		case 3: // '\003'
			return chronology.millisOfDay();
	//   20   66:aload_2         
	//   21   67:invokevirtual   #323 <Method DateTimeField Chronology.millisOfDay()>
	//   22   70:areturn         

		case 2: // '\002'
			return chronology.dayOfMonth();
	//   23   71:aload_2         
	//   24   72:invokevirtual   #268 <Method DateTimeField Chronology.dayOfMonth()>
	//   25   75:areturn         

		case 1: // '\001'
			return chronology.monthOfYear();
	//   26   76:aload_2         
	//   27   77:invokevirtual   #326 <Method DateTimeField Chronology.monthOfYear()>
	//   28   80:areturn         

		case 0: // '\0'
			return chronology.year();
	//   29   81:aload_2         
	//   30   82:invokevirtual   #329 <Method DateTimeField Chronology.year()>
	//   31   85:areturn         
		}
	}

	public int getHourOfDay()
	{
		return getChronology().hourOfDay().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #333 <Method DateTimeField Chronology.hourOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	protected long getLocalMillis()
	{
		return iLocalMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field long iLocalMillis>
	//    2    4:lreturn         
	}

	public int getMillisOfDay()
	{
		return getChronology().millisOfDay().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #323 <Method DateTimeField Chronology.millisOfDay()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMillisOfSecond()
	{
		return getChronology().millisOfSecond().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #338 <Method DateTimeField Chronology.millisOfSecond()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMinuteOfHour()
	{
		return getChronology().minuteOfHour().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #342 <Method DateTimeField Chronology.minuteOfHour()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getMonthOfYear()
	{
		return getChronology().monthOfYear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #326 <Method DateTimeField Chronology.monthOfYear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getSecondOfMinute()
	{
		return getChronology().secondOfMinute().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #347 <Method DateTimeField Chronology.secondOfMinute()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
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
	//    2   32:new             #303 <Class StringBuilder>
	//    3   35:dup             
	//    4   36:invokespecial   #304 <Method void StringBuilder()>
	//    5   39:astore_2        
			stringbuilder.append("Invalid index: ");
	//    6   40:aload_2         
	//    7   41:ldc2            #306 <String "Invalid index: ">
	//    8   44:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//    9   47:pop             
			stringbuilder.append(i);
	//   10   48:aload_2         
	//   11   49:iload_1         
	//   12   50:invokevirtual   #313 <Method StringBuilder StringBuilder.append(int)>
	//   13   53:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   14   54:new             #315 <Class IndexOutOfBoundsException>
	//   15   57:dup             
	//   16   58:aload_2         
	//   17   59:invokevirtual   #319 <Method String StringBuilder.toString()>
	//   18   62:invokespecial   #320 <Method void IndexOutOfBoundsException(String)>
	//   19   65:athrow          

		case 3: // '\003'
			return getChronology().millisOfDay().get(getLocalMillis());
	//   20   66:aload_0         
	//   21   67:invokevirtual   #250 <Method Chronology getChronology()>
	//   22   70:invokevirtual   #323 <Method DateTimeField Chronology.millisOfDay()>
	//   23   73:aload_0         
	//   24   74:invokevirtual   #290 <Method long getLocalMillis()>
	//   25   77:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//   26   80:ireturn         

		case 2: // '\002'
			return getChronology().dayOfMonth().get(getLocalMillis());
	//   27   81:aload_0         
	//   28   82:invokevirtual   #250 <Method Chronology getChronology()>
	//   29   85:invokevirtual   #268 <Method DateTimeField Chronology.dayOfMonth()>
	//   30   88:aload_0         
	//   31   89:invokevirtual   #290 <Method long getLocalMillis()>
	//   32   92:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//   33   95:ireturn         

		case 1: // '\001'
			return getChronology().monthOfYear().get(getLocalMillis());
	//   34   96:aload_0         
	//   35   97:invokevirtual   #250 <Method Chronology getChronology()>
	//   36  100:invokevirtual   #326 <Method DateTimeField Chronology.monthOfYear()>
	//   37  103:aload_0         
	//   38  104:invokevirtual   #290 <Method long getLocalMillis()>
	//   39  107:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//   40  110:ireturn         

		case 0: // '\0'
			return getChronology().year().get(getLocalMillis());
	//   41  111:aload_0         
	//   42  112:invokevirtual   #250 <Method Chronology getChronology()>
	//   43  115:invokevirtual   #329 <Method DateTimeField Chronology.year()>
	//   44  118:aload_0         
	//   45  119:invokevirtual   #290 <Method long getLocalMillis()>
	//   46  122:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//   47  125:ireturn         
		}
	}

	public int getWeekOfWeekyear()
	{
		return getChronology().weekOfWeekyear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #352 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getWeekyear()
	{
		return getChronology().weekyear().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #356 <Method DateTimeField Chronology.weekyear()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYear()
	{
		return getChronology().year().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #329 <Method DateTimeField Chronology.year()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYearOfCentury()
	{
		return getChronology().yearOfCentury().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #360 <Method DateTimeField Chronology.yearOfCentury()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public int getYearOfEra()
	{
		return getChronology().yearOfEra().get(getLocalMillis());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:invokevirtual   #364 <Method DateTimeField Chronology.yearOfEra()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   11:invokevirtual   #295 <Method int DateTimeField.get(long)>
	//    6   14:ireturn         
	}

	public Property hourOfDay()
	{
		return new Property(getChronology().hourOfDay());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #333 <Method DateTimeField Chronology.hourOfDay()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public boolean isSupported(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return datetimefieldtype.getField(getChronology()).isSupported();
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #287 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//    8   14:invokevirtual   #369 <Method boolean DateTimeField.isSupported()>
	//    9   17:ireturn         
	}

	public boolean isSupported(DurationFieldType durationfieldtype)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return durationfieldtype.getField(getChronology()).isSupported();
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #375 <Method DurationField DurationFieldType.getField(Chronology)>
	//    8   14:invokevirtual   #378 <Method boolean DurationField.isSupported()>
	//    9   17:ireturn         
	}

	public Property millisOfDay()
	{
		return new Property(getChronology().millisOfDay());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #323 <Method DateTimeField Chronology.millisOfDay()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property millisOfSecond()
	{
		return new Property(getChronology().millisOfSecond());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #338 <Method DateTimeField Chronology.millisOfSecond()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public LocalDateTime minus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #384 <Method LocalDateTime withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public LocalDateTime minus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #389 <Method LocalDateTime withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public LocalDateTime minusDays(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #395 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime minusHours(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #407 <Method DurationField Chronology.hours()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime minusMillis(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #411 <Method DurationField Chronology.millis()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime minusMinutes(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #415 <Method DurationField Chronology.minutes()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime minusMonths(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #419 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime minusSeconds(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #423 <Method DurationField Chronology.seconds()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime minusWeeks(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #427 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime minusYears(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #431 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #399 <Method long DurationField.subtract(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public Property minuteOfHour()
	{
		return new Property(getChronology().minuteOfHour());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #342 <Method DateTimeField Chronology.minuteOfHour()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property monthOfYear()
	{
		return new Property(getChronology().monthOfYear());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #326 <Method DateTimeField Chronology.monthOfYear()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public LocalDateTime plus(ReadableDuration readableduration)
	{
		return withDurationAdded(readableduration, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #384 <Method LocalDateTime withDurationAdded(ReadableDuration, int)>
	//    4    6:areturn         
	}

	public LocalDateTime plus(ReadablePeriod readableperiod)
	{
		return withPeriodAdded(readableperiod, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #389 <Method LocalDateTime withPeriodAdded(ReadablePeriod, int)>
	//    4    6:areturn         
	}

	public LocalDateTime plusDays(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #395 <Method DurationField Chronology.days()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime plusHours(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #407 <Method DurationField Chronology.hours()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime plusMillis(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #411 <Method DurationField Chronology.millis()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime plusMinutes(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #415 <Method DurationField Chronology.minutes()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime plusMonths(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #419 <Method DurationField Chronology.months()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime plusSeconds(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #423 <Method DurationField Chronology.seconds()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime plusWeeks(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #427 <Method DurationField Chronology.weeks()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public LocalDateTime plusYears(int i)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:invokevirtual   #431 <Method DurationField Chronology.years()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   12   22:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   13   25:areturn         
	}

	public Property property(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #281 <String "The DateTimeFieldType must not be null">
	//    5   11:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!isSupported(datetimefieldtype))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #447 <Method boolean isSupported(DateTimeFieldType)>
	//*  10   20:ifne            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #303 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #304 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("Field '");
	//   15   31:aload_2         
	//   16   32:ldc2            #449 <String "Field '">
	//   17   35:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #452 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append("' is not supported");
	//   23   45:aload_2         
	//   24   46:ldc2            #454 <String "' is not supported">
	//   25   49:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #174 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #319 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		} else
		{
			return new Property(datetimefieldtype.getField(getChronology()));
	//   33   65:new             #10  <Class LocalDateTime$Property>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:aload_0         
	//   38   72:invokevirtual   #250 <Method Chronology getChronology()>
	//   39   75:invokevirtual   #287 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   40   78:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//   41   81:areturn         
		}
	}

	public Property secondOfMinute()
	{
		return new Property(getChronology().secondOfMinute());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #347 <Method DateTimeField Chronology.secondOfMinute()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public int size()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public Date toDate()
	{
		int i = getDayOfMonth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #458 <Method int getDayOfMonth()>
	//    2    4:istore_1        
		Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, i, getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
	//    3    5:new             #191 <Class Date>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #459 <Method int getYear()>
	//    7   13:sipush          1900
	//    8   16:isub            
	//    9   17:aload_0         
	//   10   18:invokevirtual   #461 <Method int getMonthOfYear()>
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:iload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #463 <Method int getHourOfDay()>
	//   16   28:aload_0         
	//   17   29:invokevirtual   #465 <Method int getMinuteOfHour()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #467 <Method int getSecondOfMinute()>
	//   20   36:invokespecial   #469 <Method void Date(int, int, int, int, int, int)>
	//   21   39:astore_2        
		date.setTime(date.getTime() + (long)getMillisOfSecond());
	//   22   40:aload_2         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #193 <Method long Date.getTime()>
	//   25   45:aload_0         
	//   26   46:invokevirtual   #471 <Method int getMillisOfSecond()>
	//   27   49:i2l             
	//   28   50:ladd            
	//   29   51:invokevirtual   #473 <Method void Date.setTime(long)>
		return correctDstTransition(date, TimeZone.getDefault());
	//   30   54:aload_0         
	//   31   55:aload_2         
	//   32   56:invokestatic    #477 <Method TimeZone TimeZone.getDefault()>
	//   33   59:invokespecial   #479 <Method Date correctDstTransition(Date, TimeZone)>
	//   34   62:areturn         
	}

	public Date toDate(TimeZone timezone)
	{
		Object obj = ((Object) (Calendar.getInstance(timezone)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #136 <Method Calendar Calendar.getInstance(TimeZone)>
	//    2    4:astore_2        
		((Calendar) (obj)).clear();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #483 <Method void Calendar.clear()>
		((Calendar) (obj)).set(getYear(), getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #459 <Method int getYear()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #461 <Method int getMonthOfYear()>
	//   10   18:iconst_1        
	//   11   19:isub            
	//   12   20:aload_0         
	//   13   21:invokevirtual   #458 <Method int getDayOfMonth()>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #463 <Method int getHourOfDay()>
	//   16   28:aload_0         
	//   17   29:invokevirtual   #465 <Method int getMinuteOfHour()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #467 <Method int getSecondOfMinute()>
	//   20   36:invokevirtual   #486 <Method void Calendar.set(int, int, int, int, int, int)>
		obj = ((Object) (((Calendar) (obj)).getTime()));
	//   21   39:aload_2         
	//   22   40:invokevirtual   #172 <Method Date Calendar.getTime()>
	//   23   43:astore_2        
		((Date) (obj)).setTime(((Date) (obj)).getTime() + (long)getMillisOfSecond());
	//   24   44:aload_2         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #193 <Method long Date.getTime()>
	//   27   49:aload_0         
	//   28   50:invokevirtual   #471 <Method int getMillisOfSecond()>
	//   29   53:i2l             
	//   30   54:ladd            
	//   31   55:invokevirtual   #473 <Method void Date.setTime(long)>
		return correctDstTransition(((Date) (obj)), timezone);
	//   32   58:aload_0         
	//   33   59:aload_2         
	//   34   60:aload_1         
	//   35   61:invokespecial   #479 <Method Date correctDstTransition(Date, TimeZone)>
	//   36   64:areturn         
	}

	public DateTime toDateTime()
	{
		return toDateTime((DateTimeZone)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #80  <Class DateTimeZone>
	//    3    5:invokevirtual   #491 <Method DateTime toDateTime(DateTimeZone)>
	//    4    8:areturn         
	}

	public DateTime toDateTime(DateTimeZone datetimezone)
	{
		datetimezone = DateTimeUtils.getZone(datetimezone);
	//    0    0:aload_1         
	//    1    1:invokestatic    #494 <Method DateTimeZone DateTimeUtils.getZone(DateTimeZone)>
	//    2    4:astore_1        
		datetimezone = ((DateTimeZone) (iChronology.withZone(datetimezone)));
	//    3    5:aload_0         
	//    4    6:getfield        #71  <Field Chronology iChronology>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #498 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    7   13:astore_1        
		return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), ((Chronology) (datetimezone)));
	//    8   14:new             #500 <Class DateTime>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokevirtual   #459 <Method int getYear()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #461 <Method int getMonthOfYear()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #458 <Method int getDayOfMonth()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #463 <Method int getHourOfDay()>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #465 <Method int getMinuteOfHour()>
	//   20   38:aload_0         
	//   21   39:invokevirtual   #467 <Method int getSecondOfMinute()>
	//   22   42:aload_0         
	//   23   43:invokevirtual   #471 <Method int getMillisOfSecond()>
	//   24   46:aload_1         
	//   25   47:invokespecial   #501 <Method void DateTime(int, int, int, int, int, int, int, Chronology)>
	//   26   50:areturn         
	}

	public LocalDate toLocalDate()
	{
		return new LocalDate(getLocalMillis(), getChronology());
	//    0    0:new             #505 <Class LocalDate>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #290 <Method long getLocalMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #250 <Method Chronology getChronology()>
	//    6   12:invokespecial   #506 <Method void LocalDate(long, Chronology)>
	//    7   15:areturn         
	}

	public LocalTime toLocalTime()
	{
		return new LocalTime(getLocalMillis(), getChronology());
	//    0    0:new             #510 <Class LocalTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #290 <Method long getLocalMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #250 <Method Chronology getChronology()>
	//    6   12:invokespecial   #511 <Method void LocalTime(long, Chronology)>
	//    7   15:areturn         
	}

	public String toString()
	{
		return ISODateTimeFormat.dateTime().print(((ReadablePartial) (this)));
	//    0    0:invokestatic    #515 <Method DateTimeFormatter ISODateTimeFormat.dateTime()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #519 <Method String DateTimeFormatter.print(ReadablePartial)>
	//    3    7:areturn         
	}

	public String toString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #521 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #527 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #519 <Method String DateTimeFormatter.print(ReadablePartial)>
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
	//    3    5:invokevirtual   #521 <Method String toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).withLocale(locale).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #527 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #532 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #519 <Method String DateTimeFormatter.print(ReadablePartial)>
	//   11   21:areturn         
	}

	public Property weekOfWeekyear()
	{
		return new Property(getChronology().weekOfWeekyear());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #352 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property weekyear()
	{
		return new Property(getChronology().weekyear());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #356 <Method DateTimeField Chronology.weekyear()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public LocalDateTime withCenturyOfEra(int i)
	{
		return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #253 <Method DateTimeField Chronology.centuryOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withDate(int i, int j, int k)
	{
		Chronology chronology = getChronology();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:astore          6
		long l = getLocalMillis();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   10:lstore          4
		l = chronology.year().set(l, i);
	//    6   12:aload           6
	//    7   14:invokevirtual   #329 <Method DateTimeField Chronology.year()>
	//    8   17:lload           4
	//    9   19:iload_1         
	//   10   20:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   11   23:lstore          4
		l = chronology.monthOfYear().set(l, j);
	//   12   25:aload           6
	//   13   27:invokevirtual   #326 <Method DateTimeField Chronology.monthOfYear()>
	//   14   30:lload           4
	//   15   32:iload_2         
	//   16   33:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   17   36:lstore          4
		return withLocalMillis(chronology.dayOfMonth().set(l, k));
	//   18   38:aload_0         
	//   19   39:aload           6
	//   20   41:invokevirtual   #268 <Method DateTimeField Chronology.dayOfMonth()>
	//   21   44:lload           4
	//   22   46:iload_3         
	//   23   47:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   24   50:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   25   53:areturn         
	}

	public LocalDateTime withDayOfMonth(int i)
	{
		return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #268 <Method DateTimeField Chronology.dayOfMonth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withDayOfWeek(int i)
	{
		return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #271 <Method DateTimeField Chronology.dayOfWeek()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withDayOfYear(int i)
	{
		return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #274 <Method DateTimeField Chronology.dayOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withDurationAdded(ReadableDuration readableduration, int i)
	{
		if(readableduration != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(i == 0)
	//*   2    4:iload_2         
	//*   3    5:ifne            10
				return this;
	//    4    8:aload_0         
	//    5    9:areturn         
			else
				return withLocalMillis(getChronology().add(getLocalMillis(), readableduration.getMillis(), i));
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #250 <Method Chronology getChronology()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #290 <Method long getLocalMillis()>
	//   11   19:aload_1         
	//   12   20:invokeinterface #546 <Method long ReadableDuration.getMillis()>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #549 <Method long Chronology.add(long, long, int)>
	//   15   29:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   16   32:areturn         
		} else
		{
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public LocalDateTime withEra(int i)
	{
		return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #278 <Method DateTimeField Chronology.era()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withField(DateTimeFieldType datetimefieldtype, int i)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #554 <String "Field must not be null">
	//    5   11:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return withLocalMillis(datetimefieldtype.getField(getChronology()).set(getLocalMillis(), i));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #250 <Method Chronology getChronology()>
	//   11   21:invokevirtual   #287 <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #290 <Method long getLocalMillis()>
	//   14   28:iload_2         
	//   15   29:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   16   32:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   17   35:areturn         
	}

	public LocalDateTime withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #554 <String "Field must not be null">
	//    5   11:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(i == 0)
	//*   7   15:iload_2         
	//*   8   16:ifne            21
			return this;
	//    9   19:aload_0         
	//   10   20:areturn         
		else
			return withLocalMillis(durationfieldtype.getField(getChronology()).add(getLocalMillis(), i));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #250 <Method Chronology getChronology()>
	//   15   27:invokevirtual   #375 <Method DurationField DurationFieldType.getField(Chronology)>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #290 <Method long getLocalMillis()>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #436 <Method long DurationField.add(long, int)>
	//   20   38:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   21   41:areturn         
	}

	public LocalDateTime withFields(ReadablePartial readablepartial)
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
	//    6    8:invokevirtual   #250 <Method Chronology getChronology()>
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #290 <Method long getLocalMillis()>
	//   10   16:invokevirtual   #561 <Method long Chronology.set(ReadablePartial, long)>
	//   11   19:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   12   22:areturn         
	}

	public LocalDateTime withHourOfDay(int i)
	{
		return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #333 <Method DateTimeField Chronology.hourOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	LocalDateTime withLocalMillis(long l)
	{
		if(l == getLocalMillis())
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #290 <Method long getLocalMillis()>
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return new LocalDateTime(l, getChronology());
	//    7   11:new             #2   <Class LocalDateTime>
	//    8   14:dup             
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #250 <Method Chronology getChronology()>
	//   12   20:invokespecial   #43  <Method void LocalDateTime(long, Chronology)>
	//   13   23:areturn         
	}

	public LocalDateTime withMillisOfDay(int i)
	{
		return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #323 <Method DateTimeField Chronology.millisOfDay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withMillisOfSecond(int i)
	{
		return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #338 <Method DateTimeField Chronology.millisOfSecond()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withMinuteOfHour(int i)
	{
		return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #342 <Method DateTimeField Chronology.minuteOfHour()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withMonthOfYear(int i)
	{
		return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #326 <Method DateTimeField Chronology.monthOfYear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withPeriodAdded(ReadablePeriod readableperiod, int i)
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
	//    8   12:invokevirtual   #250 <Method Chronology getChronology()>
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #290 <Method long getLocalMillis()>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #569 <Method long Chronology.add(ReadablePeriod, long, int)>
	//   14   24:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   15   27:areturn         
		} else
		{
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		}
	}

	public LocalDateTime withSecondOfMinute(int i)
	{
		return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #347 <Method DateTimeField Chronology.secondOfMinute()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withTime(int i, int j, int k, int l)
	{
		Chronology chronology = getChronology();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method Chronology getChronology()>
	//    2    4:astore          7
		long l1 = getLocalMillis();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #290 <Method long getLocalMillis()>
	//    5   10:lstore          5
		l1 = chronology.hourOfDay().set(l1, i);
	//    6   12:aload           7
	//    7   14:invokevirtual   #333 <Method DateTimeField Chronology.hourOfDay()>
	//    8   17:lload           5
	//    9   19:iload_1         
	//   10   20:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   11   23:lstore          5
		l1 = chronology.minuteOfHour().set(l1, j);
	//   12   25:aload           7
	//   13   27:invokevirtual   #342 <Method DateTimeField Chronology.minuteOfHour()>
	//   14   30:lload           5
	//   15   32:iload_2         
	//   16   33:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   17   36:lstore          5
		l1 = chronology.secondOfMinute().set(l1, k);
	//   18   38:aload           7
	//   19   40:invokevirtual   #347 <Method DateTimeField Chronology.secondOfMinute()>
	//   20   43:lload           5
	//   21   45:iload_3         
	//   22   46:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   23   49:lstore          5
		return withLocalMillis(chronology.millisOfSecond().set(l1, l));
	//   24   51:aload_0         
	//   25   52:aload           7
	//   26   54:invokevirtual   #338 <Method DateTimeField Chronology.millisOfSecond()>
	//   27   57:lload           5
	//   28   59:iload           4
	//   29   61:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//   30   64:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//   31   67:areturn         
	}

	public LocalDateTime withWeekOfWeekyear(int i)
	{
		return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #352 <Method DateTimeField Chronology.weekOfWeekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withWeekyear(int i)
	{
		return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #356 <Method DateTimeField Chronology.weekyear()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withYear(int i)
	{
		return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #329 <Method DateTimeField Chronology.year()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withYearOfCentury(int i)
	{
		return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #360 <Method DateTimeField Chronology.yearOfCentury()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public LocalDateTime withYearOfEra(int i)
	{
		return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #250 <Method Chronology getChronology()>
	//    3    5:invokevirtual   #364 <Method DateTimeField Chronology.yearOfEra()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #290 <Method long getLocalMillis()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #536 <Method long DateTimeField.set(long, int)>
	//    8   16:invokevirtual   #403 <Method LocalDateTime withLocalMillis(long)>
	//    9   19:areturn         
	}

	public Property year()
	{
		return new Property(getChronology().year());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #329 <Method DateTimeField Chronology.year()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfCentury()
	{
		return new Property(getChronology().yearOfCentury());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #360 <Method DateTimeField Chronology.yearOfCentury()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	public Property yearOfEra()
	{
		return new Property(getChronology().yearOfEra());
	//    0    0:new             #10  <Class LocalDateTime$Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #250 <Method Chronology getChronology()>
	//    5    9:invokevirtual   #364 <Method DateTimeField Chronology.yearOfEra()>
	//    6   12:invokespecial   #256 <Method void LocalDateTime$Property(LocalDateTime, DateTimeField)>
	//    7   15:areturn         
	}

	private static final int DAY_OF_MONTH = 2;
	private static final int MILLIS_OF_DAY = 3;
	private static final int MONTH_OF_YEAR = 1;
	private static final int YEAR = 0;
	private static final long serialVersionUID = 0xf5a58710L;
	private final Chronology iChronology;
	private final long iLocalMillis;
}
