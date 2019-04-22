// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			DateDeserializers

public static class DateDeserializers$CalendarDeserializer extends 
{

	public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return super.createContextual(deserializationcontext, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method JsonDeserializer DateDeserializers$DateBasedDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #50  <Method Calendar deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Calendar deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser = ((JsonParser) (_parseDate(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #56  <Method Date _parseDate(JsonParser, DeserializationContext)>
	//    4    6:astore_1        
		if(jsonparser == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		Object obj = ((Object) (_defaultCtor));
	//    9   13:aload_0         
	//   10   14:getfield        #21  <Field Constructor _defaultCtor>
	//   11   17:astore_3        
		if(obj == null)
	//*  12   18:aload_3         
	//*  13   19:ifnonnull       28
			return deserializationcontext.constructCalendar(((Date) (jsonparser)));
	//   14   22:aload_2         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #62  <Method Calendar DeserializationContext.constructCalendar(Date)>
	//   17   27:areturn         
		java.util.TimeZone timezone;
		try
		{
			obj = ((Object) ((Calendar)((Constructor) (obj)).newInstance(new Object[0])));
	//   18   28:aload_3         
	//   19   29:iconst_0        
	//   20   30:anewarray       Object[]
	//   21   33:invokevirtual   #70  <Method Object Constructor.newInstance(Object[])>
	//   22   36:checkcast       #16  <Class Calendar>
	//   23   39:astore_3        
			((Calendar) (obj)).setTimeInMillis(((Date) (jsonparser)).getTime());
	//   24   40:aload_3         
	//   25   41:aload_1         
	//   26   42:invokevirtual   #76  <Method long Date.getTime()>
	//   27   45:invokevirtual   #80  <Method void Calendar.setTimeInMillis(long)>
			timezone = deserializationcontext.getTimeZone();
	//   28   48:aload_2         
	//   29   49:invokevirtual   #84  <Method java.util.TimeZone DeserializationContext.getTimeZone()>
	//   30   52:astore          4
		}
	//*  31   54:aload           4
	//*  32   56:ifnull          65
	//*  33   59:aload_3         
	//*  34   60:aload           4
	//*  35   62:invokevirtual   #88  <Method void Calendar.setTimeZone(java.util.TimeZone)>
	//*  36   65:aload_3         
	//*  37   66:areturn         
		catch(Exception exception)
	//*  38   67:astore_3        
		{
			return (Calendar)deserializationcontext.handleInstantiationProblem(handledType(), ((Object) (jsonparser)), ((Throwable) (exception)));
	//   39   68:aload_2         
	//   40   69:aload_0         
	//   41   70:invokevirtual   #92  <Method Class handledType()>
	//   42   73:aload_1         
	//   43   74:aload_3         
	//   44   75:invokevirtual   #96  <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   45   78:checkcast       #16  <Class Calendar>
	//   46   81:areturn         
		}
		if(timezone == null)
			break MISSING_BLOCK_LABEL_65;
		((Calendar) (obj)).setTimeZone(timezone);
		return ((Calendar) (obj));
	}

	protected DateDeserializers$CalendarDeserializer withDateFormat(DateFormat dateformat, String s)
	{
		return new DateDeserializers$CalendarDeserializer(this, dateformat, s);
	//    0    0:new             #2   <Class DateDeserializers$CalendarDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #100 <Method void DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer, DateFormat, String)>
	//    6   10:areturn         
	}

	protected volatile  withDateFormat(DateFormat dateformat, String s)
	{
		return (() (withDateFormat(dateformat, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #103 <Method DateDeserializers$CalendarDeserializer withDateFormat(DateFormat, String)>
	//    4    6:areturn         
	}

	protected final Constructor _defaultCtor;

	public DateDeserializers$CalendarDeserializer()
	{
		super(java/util/Calendar);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class Calendar>
	//    2    3:invokespecial   #19  <Method void DateDeserializers$DateBasedDeserializer(Class)>
		_defaultCtor = null;
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #21  <Field Constructor _defaultCtor>
	//    6   11:return          
	}

	public DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer datedeserializers$calendardeserializer, DateFormat dateformat, String s)
	{
		super((() (datedeserializers$calendardeserializer)), dateformat, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #26  <Method void DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer, DateFormat, String)>
		_defaultCtor = datedeserializers$calendardeserializer._defaultCtor;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #21  <Field Constructor _defaultCtor>
	//    8   12:putfield        #21  <Field Constructor _defaultCtor>
	//    9   15:return          
	}

	public DateDeserializers$CalendarDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void DateDeserializers$DateBasedDeserializer(Class)>
		_defaultCtor = ClassUtil.findConstructor(class1, false);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:invokestatic    #32  <Method Constructor ClassUtil.findConstructor(Class, boolean)>
	//    7   11:putfield        #21  <Field Constructor _defaultCtor>
	//    8   14:return          
	}
}
