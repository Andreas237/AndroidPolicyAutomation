// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			DateTimeSerializerBase

public class CalendarSerializer extends DateTimeSerializerBase
{

	public CalendarSerializer()
	{
		this(((Boolean) (null)), ((DateFormat) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void CalendarSerializer(Boolean, DateFormat)>
	//    4    6:return          
	}

	public CalendarSerializer(Boolean boolean1, DateFormat dateformat)
	{
		super(java/util/Calendar, boolean1, dateformat);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Calendar>
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:invokespecial   #24  <Method void DateTimeSerializerBase(Class, Boolean, DateFormat)>
	//    5    8:return          
	}

	protected volatile long _timestamp(Object obj)
	{
		return _timestamp((Calendar)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Calendar>
	//    3    5:invokevirtual   #29  <Method long _timestamp(Calendar)>
	//    4    8:lreturn         
	}

	protected long _timestamp(Calendar calendar)
	{
		if(calendar == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0L;
	//    2    4:lconst_0        
	//    3    5:lreturn         
		else
			return calendar.getTimeInMillis();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #33  <Method long Calendar.getTimeInMillis()>
	//    6   10:lreturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Calendar)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Calendar>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #40  <Method void serialize(Calendar, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Calendar calendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #45  <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            18
		{
			jsongenerator.writeNumber(_timestamp(calendar));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #29  <Method long _timestamp(Calendar)>
	//    8   14:invokevirtual   #51  <Method void JsonGenerator.writeNumber(long)>
			return;
	//    9   17:return          
		}
		if(_customFormat != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #55  <Field DateFormat _customFormat>
	//*  12   22:ifnull          55
		{
			synchronized(_customFormat)
	//*  13   25:aload_0         
	//*  14   26:getfield        #55  <Field DateFormat _customFormat>
	//*  15   29:astore_3        
	//*  16   30:aload_3         
	//*  17   31:monitorenter    
			{
				jsongenerator.writeString(_customFormat.format(calendar.getTime()));
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:getfield        #55  <Field DateFormat _customFormat>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #59  <Method java.util.Date Calendar.getTime()>
	//   23   41:invokevirtual   #65  <Method String DateFormat.format(java.util.Date)>
	//   24   44:invokevirtual   #69  <Method void JsonGenerator.writeString(String)>
			}
	//   25   47:aload_3         
	//   26   48:monitorexit     
			return;
	//   27   49:return          
		} else
	//*  28   50:astore_1        
	//*  29   51:aload_3         
	//*  30   52:monitorexit     
	//*  31   53:aload_1         
	//*  32   54:athrow          
		{
			serializerprovider.defaultSerializeDateValue(calendar.getTime(), jsongenerator);
	//   33   55:aload_3         
	//   34   56:aload_1         
	//   35   57:invokevirtual   #59  <Method java.util.Date Calendar.getTime()>
	//   36   60:aload_2         
	//   37   61:invokevirtual   #75  <Method void SerializerProvider.defaultSerializeDateValue(java.util.Date, JsonGenerator)>
			return;
	//   38   64:return          
		}
		calendar;
		serializerprovider;
		JVM INSTR monitorexit ;
		throw calendar;
	}

	public CalendarSerializer withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return new CalendarSerializer(boolean1, dateformat);
	//    0    0:new             #2   <Class CalendarSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #19  <Method void CalendarSerializer(Boolean, DateFormat)>
	//    5    9:areturn         
	}

	public volatile DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return ((DateTimeSerializerBase) (withFormat(boolean1, dateformat)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #80  <Method CalendarSerializer withFormat(Boolean, DateFormat)>
	//    4    6:areturn         
	}

	public static final CalendarSerializer instance = new CalendarSerializer();

	static 
	{
	//    0    0:new             #2   <Class CalendarSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void CalendarSerializer()>
	//    3    7:putstatic       #15  <Field CalendarSerializer instance>
	//*   4   10:return          
	}
}
