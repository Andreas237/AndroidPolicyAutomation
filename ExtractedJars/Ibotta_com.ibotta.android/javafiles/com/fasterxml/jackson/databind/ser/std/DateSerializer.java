// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			DateTimeSerializerBase

public class DateSerializer extends DateTimeSerializerBase
{

	public DateSerializer()
	{
		this(((Boolean) (null)), ((DateFormat) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void DateSerializer(Boolean, DateFormat)>
	//    4    6:return          
	}

	public DateSerializer(Boolean boolean1, DateFormat dateformat)
	{
		super(java/util/Date, boolean1, dateformat);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Date>
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:invokespecial   #24  <Method void DateTimeSerializerBase(Class, Boolean, DateFormat)>
	//    5    8:return          
	}

	protected long _timestamp(Date date)
	{
		if(date == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0L;
	//    2    4:lconst_0        
	//    3    5:lreturn         
		else
			return date.getTime();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #30  <Method long Date.getTime()>
	//    6   10:lreturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Date)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Date>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #37  <Method void serialize(Date, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #42  <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            18
		{
			jsongenerator.writeNumber(_timestamp(date));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #44  <Method long _timestamp(Date)>
	//    8   14:invokevirtual   #50  <Method void JsonGenerator.writeNumber(long)>
			return;
	//    9   17:return          
		} else
		{
			_serializeAsString(date, jsongenerator, serializerprovider);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:invokevirtual   #53  <Method void _serializeAsString(Date, JsonGenerator, SerializerProvider)>
			return;
	//   15   25:return          
		}
	}

	public DateSerializer withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return new DateSerializer(boolean1, dateformat);
	//    0    0:new             #2   <Class DateSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #19  <Method void DateSerializer(Boolean, DateFormat)>
	//    5    9:areturn         
	}

	public volatile DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return ((DateTimeSerializerBase) (withFormat(boolean1, dateformat)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #58  <Method DateSerializer withFormat(Boolean, DateFormat)>
	//    4    6:areturn         
	}

	public static final DateSerializer instance = new DateSerializer();

	static 
	{
	//    0    0:new             #2   <Class DateSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DateSerializer()>
	//    3    7:putstatic       #15  <Field DateSerializer instance>
	//*   4   10:return          
	}
}
