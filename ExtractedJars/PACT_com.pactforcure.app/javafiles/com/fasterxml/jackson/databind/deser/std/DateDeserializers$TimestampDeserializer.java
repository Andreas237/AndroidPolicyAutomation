// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			DateDeserializers

public static class DateDeserializers$TimestampDeserializer extends DateDeserializers$DateBasedDeserializer
{

	public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return super.createContextual(deserializationcontext, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method JsonDeserializer DateDeserializers$DateBasedDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #36  <Method Timestamp deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Timestamp deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return new Timestamp(_parseDate(jsonparser, deserializationcontext).getTime());
	//    0    0:new             #12  <Class Timestamp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #40  <Method Date _parseDate(JsonParser, DeserializationContext)>
	//    6   10:invokevirtual   #46  <Method long Date.getTime()>
	//    7   13:invokespecial   #49  <Method void Timestamp(long)>
	//    8   16:areturn         
	}

	protected volatile DateDeserializers$DateBasedDeserializer withDateFormat(DateFormat dateformat, String s)
	{
		return ((DateDeserializers$DateBasedDeserializer) (withDateFormat(dateformat, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #54  <Method DateDeserializers$TimestampDeserializer withDateFormat(DateFormat, String)>
	//    4    6:areturn         
	}

	protected DateDeserializers$TimestampDeserializer withDateFormat(DateFormat dateformat, String s)
	{
		return new DateDeserializers$TimestampDeserializer(this, dateformat, s);
	//    0    0:new             #2   <Class DateDeserializers$TimestampDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #56  <Method void DateDeserializers$TimestampDeserializer(DateDeserializers$TimestampDeserializer, DateFormat, String)>
	//    6   10:areturn         
	}

	public DateDeserializers$TimestampDeserializer()
	{
		super(java/sql/Timestamp);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Class Timestamp>
	//    2    3:invokespecial   #15  <Method void DateDeserializers$DateBasedDeserializer(Class)>
	//    3    6:return          
	}

	public DateDeserializers$TimestampDeserializer(DateDeserializers$TimestampDeserializer datedeserializers$timestampdeserializer, DateFormat dateformat, String s)
	{
		super(((DateDeserializers$DateBasedDeserializer) (datedeserializers$timestampdeserializer)), dateformat, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #20  <Method void DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer, DateFormat, String)>
	//    5    7:return          
	}
}
