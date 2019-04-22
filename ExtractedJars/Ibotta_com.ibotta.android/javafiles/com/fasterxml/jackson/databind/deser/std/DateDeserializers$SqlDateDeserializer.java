// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			DateDeserializers

public static class DateDeserializers$SqlDateDeserializer extends r
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
	//    3    3:invokevirtual   #36  <Method Date deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser = ((JsonParser) (_parseDate(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #40  <Method java.util.Date _parseDate(JsonParser, DeserializationContext)>
	//    4    6:astore_1        
		if(jsonparser == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		else
			return new Date(((java.util.Date) (jsonparser)).getTime());
	//    9   13:new             #12  <Class Date>
	//   10   16:dup             
	//   11   17:aload_1         
	//   12   18:invokevirtual   #46  <Method long java.util.Date.getTime()>
	//   13   21:invokespecial   #49  <Method void Date(long)>
	//   14   24:areturn         
	}

	protected volatile r withDateFormat(DateFormat dateformat, String s)
	{
		return ((r) (withDateFormat(dateformat, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #54  <Method DateDeserializers$SqlDateDeserializer withDateFormat(DateFormat, String)>
	//    4    6:areturn         
	}

	protected DateDeserializers$SqlDateDeserializer withDateFormat(DateFormat dateformat, String s)
	{
		return new DateDeserializers$SqlDateDeserializer(this, dateformat, s);
	//    0    0:new             #2   <Class DateDeserializers$SqlDateDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #56  <Method void DateDeserializers$SqlDateDeserializer(DateDeserializers$SqlDateDeserializer, DateFormat, String)>
	//    6   10:areturn         
	}

	public DateDeserializers$SqlDateDeserializer()
	{
		super(java/sql/Date);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Class Date>
	//    2    3:invokespecial   #15  <Method void DateDeserializers$DateBasedDeserializer(Class)>
	//    3    6:return          
	}

	public DateDeserializers$SqlDateDeserializer(DateDeserializers$SqlDateDeserializer datedeserializers$sqldatedeserializer, DateFormat dateformat, String s)
	{
		super(((r) (datedeserializers$sqldatedeserializer)), dateformat, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #20  <Method void DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer, DateFormat, String)>
	//    5    7:return          
	}
}
