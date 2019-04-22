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
	//    5    7:invokevirtual   #30  <Method long Calendar.getTimeInMillis()>
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
	//    5    7:invokevirtual   #37  <Method void serialize(Calendar, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Calendar calendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #42  <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            18
		{
			jsongenerator.writeNumber(_timestamp(calendar));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #44  <Method long _timestamp(Calendar)>
	//    8   14:invokevirtual   #50  <Method void JsonGenerator.writeNumber(long)>
			return;
	//    9   17:return          
		} else
		{
			_serializeAsString(calendar.getTime(), jsongenerator, serializerprovider);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #54  <Method java.util.Date Calendar.getTime()>
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #58  <Method void _serializeAsString(java.util.Date, JsonGenerator, SerializerProvider)>
			return;
	//   16   28:return          
		}
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
	//    3    3:invokevirtual   #63  <Method CalendarSerializer withFormat(Boolean, DateFormat)>
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
