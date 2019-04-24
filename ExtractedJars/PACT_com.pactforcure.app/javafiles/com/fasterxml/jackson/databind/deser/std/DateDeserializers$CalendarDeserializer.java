// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;
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
	//    3    3:invokevirtual   #44  <Method Calendar deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Calendar deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser = ((JsonParser) (_parseDate(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #50  <Method Date _parseDate(JsonParser, DeserializationContext)>
	//    4    6:astore_1        
		if(jsonparser != null) goto _L2; else goto _L1
	//    5    7:aload_1         
	//    6    8:ifnonnull       15
_L1:
		jsonparser = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
_L4:
		return ((Calendar) (jsonparser));
	//    9   13:aload_1         
	//   10   14:areturn         
_L2:
		if(_calendarClass == null)
	//*  11   15:aload_0         
	//*  12   16:getfield        #21  <Field Class _calendarClass>
	//*  13   19:ifnonnull       28
			return deserializationcontext.constructCalendar(((Date) (jsonparser)));
	//   14   22:aload_2         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #56  <Method Calendar DeserializationContext.constructCalendar(Date)>
	//   17   27:areturn         
		Calendar calendar;
		java.util.TimeZone timezone;
		try
		{
			calendar = (Calendar)_calendarClass.newInstance();
	//   18   28:aload_0         
	//   19   29:getfield        #21  <Field Class _calendarClass>
	//   20   32:invokevirtual   #62  <Method Object Class.newInstance()>
	//   21   35:checkcast       #16  <Class Calendar>
	//   22   38:astore_3        
			calendar.setTimeInMillis(((Date) (jsonparser)).getTime());
	//   23   39:aload_3         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #68  <Method long Date.getTime()>
	//   26   44:invokevirtual   #72  <Method void Calendar.setTimeInMillis(long)>
			timezone = deserializationcontext.getTimeZone();
	//   27   47:aload_2         
	//   28   48:invokevirtual   #76  <Method java.util.TimeZone DeserializationContext.getTimeZone()>
	//   29   51:astore          4
		}
	//*  30   53:aload_3         
	//*  31   54:astore_1        
	//*  32   55:aload           4
	//*  33   57:ifnull          13
	//*  34   60:aload_3         
	//*  35   61:aload           4
	//*  36   63:invokevirtual   #80  <Method void Calendar.setTimeZone(java.util.TimeZone)>
	//*  37   66:aload_3         
	//*  38   67:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  39   68:astore_1        
		{
			throw deserializationcontext.instantiationException(_calendarClass, ((Throwable) (jsonparser)));
	//   40   69:aload_2         
	//   41   70:aload_0         
	//   42   71:getfield        #21  <Field Class _calendarClass>
	//   43   74:aload_1         
	//   44   75:invokevirtual   #84  <Method JsonMappingException DeserializationContext.instantiationException(Class, Throwable)>
	//   45   78:athrow          
		}
		jsonparser = ((JsonParser) (calendar));
		if(timezone == null) goto _L4; else goto _L3
_L3:
		calendar.setTimeZone(timezone);
		return calendar;
	}

	protected DateDeserializers$CalendarDeserializer withDateFormat(DateFormat dateformat, String s)
	{
		return new DateDeserializers$CalendarDeserializer(this, dateformat, s);
	//    0    0:new             #2   <Class DateDeserializers$CalendarDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #88  <Method void DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer, DateFormat, String)>
	//    6   10:areturn         
	}

	protected volatile  withDateFormat(DateFormat dateformat, String s)
	{
		return (() (withDateFormat(dateformat, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #91  <Method DateDeserializers$CalendarDeserializer withDateFormat(DateFormat, String)>
	//    4    6:areturn         
	}

	protected final Class _calendarClass;

	public DateDeserializers$CalendarDeserializer()
	{
		super(java/util/Calendar);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class Calendar>
	//    2    3:invokespecial   #19  <Method void DateDeserializers$DateBasedDeserializer(Class)>
		_calendarClass = null;
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #21  <Field Class _calendarClass>
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
		_calendarClass = datedeserializers$calendardeserializer._calendarClass;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #21  <Field Class _calendarClass>
	//    8   12:putfield        #21  <Field Class _calendarClass>
	//    9   15:return          
	}

	public DateDeserializers$CalendarDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void DateDeserializers$DateBasedDeserializer(Class)>
		_calendarClass = class1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field Class _calendarClass>
	//    6   10:return          
	}
}
