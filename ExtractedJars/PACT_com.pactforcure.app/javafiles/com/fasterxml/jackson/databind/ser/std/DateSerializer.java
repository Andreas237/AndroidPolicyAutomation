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

	protected volatile long _timestamp(Object obj)
	{
		return _timestamp((Date)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Date>
	//    3    5:invokevirtual   #29  <Method long _timestamp(Date)>
	//    4    8:lreturn         
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
	//    5    7:invokevirtual   #33  <Method long Date.getTime()>
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
	//    5    7:invokevirtual   #40  <Method void serialize(Date, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #45  <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            18
		{
			jsongenerator.writeNumber(_timestamp(date));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #29  <Method long _timestamp(Date)>
	//    8   14:invokevirtual   #51  <Method void JsonGenerator.writeNumber(long)>
			return;
	//    9   17:return          
		}
		if(_customFormat != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #55  <Field DateFormat _customFormat>
	//*  12   22:ifnull          52
		{
			synchronized(_customFormat)
	//*  13   25:aload_0         
	//*  14   26:getfield        #55  <Field DateFormat _customFormat>
	//*  15   29:astore_3        
	//*  16   30:aload_3         
	//*  17   31:monitorenter    
			{
				jsongenerator.writeString(_customFormat.format(date));
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:getfield        #55  <Field DateFormat _customFormat>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #61  <Method String DateFormat.format(Date)>
	//   23   41:invokevirtual   #65  <Method void JsonGenerator.writeString(String)>
			}
	//   24   44:aload_3         
	//   25   45:monitorexit     
			return;
	//   26   46:return          
		} else
	//*  27   47:astore_1        
	//*  28   48:aload_3         
	//*  29   49:monitorexit     
	//*  30   50:aload_1         
	//*  31   51:athrow          
		{
			serializerprovider.defaultSerializeDateValue(date, jsongenerator);
	//   32   52:aload_3         
	//   33   53:aload_1         
	//   34   54:aload_2         
	//   35   55:invokevirtual   #71  <Method void SerializerProvider.defaultSerializeDateValue(Date, JsonGenerator)>
			return;
	//   36   58:return          
		}
		date;
		serializerprovider;
		JVM INSTR monitorexit ;
		throw date;
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
	//    3    3:invokevirtual   #76  <Method DateSerializer withFormat(Boolean, DateFormat)>
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
