// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.Date;
import java.text.DateFormat;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			DateTimeSerializerBase

public class SqlDateSerializer extends DateTimeSerializerBase
{

	public SqlDateSerializer()
	{
		this(Boolean.FALSE);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field Boolean Boolean.FALSE>
	//    2    4:invokespecial   #17  <Method void SqlDateSerializer(Boolean)>
	//    3    7:return          
	}

	protected SqlDateSerializer(Boolean boolean1)
	{
		super(java/sql/Date, boolean1, ((DateFormat) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <Class Date>
	//    2    3:aload_1         
	//    3    4:aconst_null     
	//    4    5:invokespecial   #23  <Method void DateTimeSerializerBase(Class, Boolean, DateFormat)>
	//    5    8:return          
	}

	protected volatile long _timestamp(Object obj)
	{
		return _timestamp((Date)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class Date>
	//    3    5:invokevirtual   #28  <Method long _timestamp(Date)>
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
	//    5    7:invokevirtual   #32  <Method long Date.getTime()>
	//    6   10:lreturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		_acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype, _useTimestamp.booleanValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #39  <Field Boolean _useTimestamp>
	//    5    7:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
	//    6   10:invokevirtual   #47  <Method void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType, boolean)>
	//    7   13:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #52  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #56  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Date)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class Date>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #63  <Method void serialize(Date, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #69  <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            18
		{
			jsongenerator.writeNumber(_timestamp(date));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #28  <Method long _timestamp(Date)>
	//    8   14:invokevirtual   #75  <Method void JsonGenerator.writeNumber(long)>
			return;
	//    9   17:return          
		} else
		{
			jsongenerator.writeString(date.toString());
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #79  <Method String Date.toString()>
	//   13   23:invokevirtual   #83  <Method void JsonGenerator.writeString(String)>
			return;
	//   14   26:return          
		}
	}

	public volatile DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return ((DateTimeSerializerBase) (withFormat(boolean1, dateformat)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #88  <Method SqlDateSerializer withFormat(Boolean, DateFormat)>
	//    4    6:areturn         
	}

	public SqlDateSerializer withFormat(Boolean boolean1, DateFormat dateformat)
	{
		return new SqlDateSerializer(boolean1);
	//    0    0:new             #2   <Class SqlDateSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #17  <Method void SqlDateSerializer(Boolean)>
	//    4    8:areturn         
	}
}
