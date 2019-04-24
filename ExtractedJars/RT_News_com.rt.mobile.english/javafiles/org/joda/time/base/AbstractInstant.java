// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import java.util.Date;
import org.joda.time.*;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public abstract class AbstractInstant
	implements ReadableInstant
{

	protected AbstractInstant()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ReadableInstant)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class ReadableInstant>
	//    3    5:invokevirtual   #16  <Method int compareTo(ReadableInstant)>
	//    4    8:ireturn         
	}

	public int compareTo(ReadableInstant readableinstant)
	{
		if(this == readableinstant)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		long l = readableinstant.getMillis();
	//    5    7:aload_1         
	//    6    8:invokeinterface #20  <Method long ReadableInstant.getMillis()>
	//    7   13:lstore_2        
		long l1 = getMillis();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #21  <Method long getMillis()>
	//   10   18:lstore          4
		if(l1 == l)
	//*  11   20:lload           4
	//*  12   22:lload_2         
	//*  13   23:lcmp            
	//*  14   24:ifne            29
			return 0;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		return l1 >= l ? 1 : -1;
	//   17   29:lload           4
	//   18   31:lload_2         
	//   19   32:lcmp            
	//   20   33:ifge            38
	//   21   36:iconst_m1       
	//   22   37:ireturn         
	//   23   38:iconst_1        
	//   24   39:ireturn         
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
		if(!(obj instanceof ReadableInstant))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #6   <Class ReadableInstant>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ReadableInstant)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #6   <Class ReadableInstant>
	//   12   20:astore_1        
		return getMillis() == ((ReadableInstant) (obj)).getMillis() && FieldUtils.equals(((Object) (getChronology())), ((Object) (((ReadableInstant) (obj)).getChronology())));
	//   13   21:aload_0         
	//   14   22:invokevirtual   #21  <Method long getMillis()>
	//   15   25:aload_1         
	//   16   26:invokeinterface #20  <Method long ReadableInstant.getMillis()>
	//   17   31:lcmp            
	//   18   32:ifne            53
	//   19   35:aload_0         
	//   20   36:invokevirtual   #27  <Method Chronology getChronology()>
	//   21   39:aload_1         
	//   22   40:invokeinterface #28  <Method Chronology ReadableInstant.getChronology()>
	//   23   45:invokestatic    #33  <Method boolean FieldUtils.equals(Object, Object)>
	//   24   48:ifeq            53
	//   25   51:iconst_1        
	//   26   52:ireturn         
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public int get(DateTimeField datetimefield)
	{
		if(datetimefield == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The DateTimeField must not be null");
	//    2    4:new             #37  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #39  <String "The DateTimeField must not be null">
	//    5   10:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return datetimefield.get(getMillis());
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #21  <Method long getMillis()>
	//   10   19:invokevirtual   #47  <Method int DateTimeField.get(long)>
	//   11   22:ireturn         
	}

	public int get(DateTimeFieldType datetimefieldtype)
	{
		if(datetimefieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("The DateTimeFieldType must not be null");
	//    2    4:new             #37  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #50  <String "The DateTimeFieldType must not be null">
	//    5   10:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return datetimefieldtype.getField(getChronology()).get(getMillis());
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #27  <Method Chronology getChronology()>
	//   10   19:invokevirtual   #56  <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//   11   22:aload_0         
	//   12   23:invokevirtual   #21  <Method long getMillis()>
	//   13   26:invokevirtual   #47  <Method int DateTimeField.get(long)>
	//   14   29:ireturn         
	}

	public DateTimeZone getZone()
	{
		return getChronology().getZone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Chronology getChronology()>
	//    2    4:invokevirtual   #62  <Method DateTimeZone Chronology.getZone()>
	//    3    7:areturn         
	}

	public int hashCode()
	{
		return (int)(getMillis() ^ getMillis() >>> 32) + ((Object) (getChronology())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method long getMillis()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:bipush          32
	//    5   10:lushr           
	//    6   11:lxor            
	//    7   12:l2i             
	//    8   13:aload_0         
	//    9   14:invokevirtual   #27  <Method Chronology getChronology()>
	//   10   17:invokevirtual   #66  <Method int Object.hashCode()>
	//   11   20:iadd            
	//   12   21:ireturn         
	}

	public boolean isAfter(long l)
	{
		return getMillis() > l;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method long getMillis()>
	//    2    4:lload_1         
	//    3    5:lcmp            
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isAfter(ReadableInstant readableinstant)
	{
		return isAfter(DateTimeUtils.getInstantMillis(readableinstant));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #75  <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    3    5:invokevirtual   #77  <Method boolean isAfter(long)>
	//    4    8:ireturn         
	}

	public boolean isAfterNow()
	{
		return isAfter(DateTimeUtils.currentTimeMillis());
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:invokevirtual   #77  <Method boolean isAfter(long)>
	//    3    7:ireturn         
	}

	public boolean isBefore(long l)
	{
		return getMillis() < l;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method long getMillis()>
	//    2    4:lload_1         
	//    3    5:lcmp            
	//    4    6:ifge            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isBefore(ReadableInstant readableinstant)
	{
		return isBefore(DateTimeUtils.getInstantMillis(readableinstant));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #75  <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    3    5:invokevirtual   #85  <Method boolean isBefore(long)>
	//    4    8:ireturn         
	}

	public boolean isBeforeNow()
	{
		return isBefore(DateTimeUtils.currentTimeMillis());
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:invokevirtual   #85  <Method boolean isBefore(long)>
	//    3    7:ireturn         
	}

	public boolean isEqual(long l)
	{
		return getMillis() == l;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method long getMillis()>
	//    2    4:lload_1         
	//    3    5:lcmp            
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isEqual(ReadableInstant readableinstant)
	{
		return isEqual(DateTimeUtils.getInstantMillis(readableinstant));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #75  <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    3    5:invokevirtual   #89  <Method boolean isEqual(long)>
	//    4    8:ireturn         
	}

	public boolean isEqualNow()
	{
		return isEqual(DateTimeUtils.currentTimeMillis());
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:invokevirtual   #89  <Method boolean isEqual(long)>
	//    3    7:ireturn         
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
	//    6    8:invokevirtual   #27  <Method Chronology getChronology()>
	//    7   11:invokevirtual   #56  <Method DateTimeField DateTimeFieldType.getField(Chronology)>
	//    8   14:invokevirtual   #94  <Method boolean DateTimeField.isSupported()>
	//    9   17:ireturn         
	}

	public Date toDate()
	{
		return new Date(getMillis());
	//    0    0:new             #98  <Class Date>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:invokespecial   #101 <Method void Date(long)>
	//    5   11:areturn         
	}

	public DateTime toDateTime()
	{
		return new DateTime(getMillis(), getZone());
	//    0    0:new             #105 <Class DateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method DateTimeZone getZone()>
	//    6   12:invokespecial   #109 <Method void DateTime(long, DateTimeZone)>
	//    7   15:areturn         
	}

	public DateTime toDateTime(Chronology chronology)
	{
		return new DateTime(getMillis(), chronology);
	//    0    0:new             #105 <Class DateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #113 <Method void DateTime(long, Chronology)>
	//    6   12:areturn         
	}

	public DateTime toDateTime(DateTimeZone datetimezone)
	{
		datetimezone = ((DateTimeZone) (DateTimeUtils.getChronology(getChronology()).withZone(datetimezone)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Chronology getChronology()>
	//    2    4:invokestatic    #117 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #121 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    5   11:astore_1        
		return new DateTime(getMillis(), ((Chronology) (datetimezone)));
	//    6   12:new             #105 <Class DateTime>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #21  <Method long getMillis()>
	//   10   20:aload_1         
	//   11   21:invokespecial   #113 <Method void DateTime(long, Chronology)>
	//   12   24:areturn         
	}

	public DateTime toDateTimeISO()
	{
		return new DateTime(getMillis(), ((Chronology) (ISOChronology.getInstance(getZone()))));
	//    0    0:new             #105 <Class DateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method DateTimeZone getZone()>
	//    6   12:invokestatic    #128 <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    7   15:invokespecial   #113 <Method void DateTime(long, Chronology)>
	//    8   18:areturn         
	}

	public Instant toInstant()
	{
		return new Instant(getMillis());
	//    0    0:new             #132 <Class Instant>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:invokespecial   #133 <Method void Instant(long)>
	//    5   11:areturn         
	}

	public MutableDateTime toMutableDateTime()
	{
		return new MutableDateTime(getMillis(), getZone());
	//    0    0:new             #137 <Class MutableDateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method DateTimeZone getZone()>
	//    6   12:invokespecial   #138 <Method void MutableDateTime(long, DateTimeZone)>
	//    7   15:areturn         
	}

	public MutableDateTime toMutableDateTime(Chronology chronology)
	{
		return new MutableDateTime(getMillis(), chronology);
	//    0    0:new             #137 <Class MutableDateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #140 <Method void MutableDateTime(long, Chronology)>
	//    6   12:areturn         
	}

	public MutableDateTime toMutableDateTime(DateTimeZone datetimezone)
	{
		datetimezone = ((DateTimeZone) (DateTimeUtils.getChronology(getChronology()).withZone(datetimezone)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Chronology getChronology()>
	//    2    4:invokestatic    #117 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #121 <Method Chronology Chronology.withZone(DateTimeZone)>
	//    5   11:astore_1        
		return new MutableDateTime(getMillis(), ((Chronology) (datetimezone)));
	//    6   12:new             #137 <Class MutableDateTime>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #21  <Method long getMillis()>
	//   10   20:aload_1         
	//   11   21:invokespecial   #140 <Method void MutableDateTime(long, Chronology)>
	//   12   24:areturn         
	}

	public MutableDateTime toMutableDateTimeISO()
	{
		return new MutableDateTime(getMillis(), ((Chronology) (ISOChronology.getInstance(getZone()))));
	//    0    0:new             #137 <Class MutableDateTime>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method long getMillis()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #106 <Method DateTimeZone getZone()>
	//    6   12:invokestatic    #128 <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    7   15:invokespecial   #140 <Method void MutableDateTime(long, Chronology)>
	//    8   18:areturn         
	}

	public String toString()
	{
		return ISODateTimeFormat.dateTime().print(((ReadableInstant) (this)));
	//    0    0:invokestatic    #151 <Method DateTimeFormatter ISODateTimeFormat.dateTime()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #157 <Method String DateTimeFormatter.print(ReadableInstant)>
	//    3    7:areturn         
	}

	public String toString(DateTimeFormatter datetimeformatter)
	{
		if(datetimeformatter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #161 <Method String toString()>
	//    4    8:areturn         
		else
			return datetimeformatter.print(((ReadableInstant) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #157 <Method String DateTimeFormatter.print(ReadableInstant)>
	//    8   14:areturn         
	}
}
