// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			DateTimeSerializerBase

public class SqlDateSerializer extends DateTimeSerializerBase
{

	public SqlDateSerializer()
	{
		this(((Boolean) (null)), ((DateFormat) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #11  <Method void SqlDateSerializer(Boolean, DateFormat)>
	//    4    6:return          
	}

	protected SqlDateSerializer(Boolean boolean1, DateFormat dateformat)
	{
		super(java/sql/Date, boolean1, dateformat);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class Date>
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:invokespecial   #17  <Method void DateTimeSerializerBase(Class, Boolean, DateFormat)>
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
	//    5    7:invokevirtual   #23  <Method long Date.getTime()>
	//    6   10:lreturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Date)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class Date>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #30  <Method void serialize(Date, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #35  <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            18
		{
			jsongenerator.writeNumber(_timestamp(date));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #37  <Method long _timestamp(Date)>
	//    8   14:invokevirtual   #43  <Method void JsonGenerator.writeNumber(long)>
			return;
	//    9   17:return          
		}
		if(_customFormat == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #47  <Field DateFormat _customFormat>
	//*  12   22:ifnonnull       34
		{
			jsongenerator.writeString(date.toString());
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #51  <Method String Date.toString()>
	//   16   30:invokevirtual   #55  <Method void JsonGenerator.writeString(String)>
			return;
	//   17   33:return          
		} else
		{
			_serializeAsString(((java.util.Date) (date)), jsongenerator, serializerprovider);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #59  <Method void _serializeAsString(java.util.Date, JsonGenerator, SerializerProvider)>
			return;
	//   23   41:return          
		}
	}

	public volatile DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return ((DateTimeSerializerBase) (withFormat(boolean1, dateformat)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #64  <Method SqlDateSerializer withFormat(Boolean, DateFormat)>
	//    4    6:areturn         
	}

	public SqlDateSerializer withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return new SqlDateSerializer(boolean1, dateformat);
	//    0    0:new             #2   <Class SqlDateSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #11  <Method void SqlDateSerializer(Boolean, DateFormat)>
	//    5    9:areturn         
	}
}
