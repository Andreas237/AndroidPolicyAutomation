// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			DateDeserializers

public static class DateDeserializers$DateDeserializer extends izer
{

	public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return super.createContextual(deserializationcontext, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method JsonDeserializer DateDeserializers$DateBasedDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #44  <Method Date deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseDate(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #47  <Method Date _parseDate(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected volatile izer withDateFormat(DateFormat dateformat, String s)
	{
		return ((izer) (withDateFormat(dateformat, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #52  <Method DateDeserializers$DateDeserializer withDateFormat(DateFormat, String)>
	//    4    6:areturn         
	}

	protected DateDeserializers$DateDeserializer withDateFormat(DateFormat dateformat, String s)
	{
		return new DateDeserializers$DateDeserializer(this, dateformat, s);
	//    0    0:new             #2   <Class DateDeserializers$DateDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #54  <Method void DateDeserializers$DateDeserializer(DateDeserializers$DateDeserializer, DateFormat, String)>
	//    6   10:areturn         
	}

	public static final DateDeserializers$DateDeserializer instance = new DateDeserializers$DateDeserializer();

	static 
	{
	//    0    0:new             #2   <Class DateDeserializers$DateDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void DateDeserializers$DateDeserializer()>
	//    3    7:putstatic       #18  <Field DateDeserializers$DateDeserializer instance>
	//*   4   10:return          
	}

	public DateDeserializers$DateDeserializer()
	{
		super(java/util/Date);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Date>
	//    2    3:invokespecial   #24  <Method void DateDeserializers$DateBasedDeserializer(Class)>
	//    3    6:return          
	}

	public DateDeserializers$DateDeserializer(DateDeserializers$DateDeserializer datedeserializers$datedeserializer, DateFormat dateformat, String s)
	{
		super(((izer) (datedeserializers$datedeserializer)), dateformat, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #28  <Method void DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer, DateFormat, String)>
	//    5    7:return          
	}
}
