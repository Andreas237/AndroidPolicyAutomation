// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.datatype.XMLGregorianCalendar;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//			CoreXMLSerializers

public static class CoreXMLSerializers$XMLGregorianCalendarSerializer extends StdSerializer
	implements ContextualSerializer
{

	protected Calendar _convert(XMLGregorianCalendar xmlgregoriancalendar)
	{
		if(xmlgregoriancalendar == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((Calendar) (xmlgregoriancalendar.toGregorianCalendar()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #46  <Method java.util.GregorianCalendar XMLGregorianCalendar.toGregorianCalendar()>
	//    6   10:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		_delegate.acceptJsonFormatVisitor(jsonformatvisitorwrapper, ((JavaType) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonSerializer _delegate>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #54  <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//    5    9:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		beanproperty = ((BeanProperty) (serializerprovider.handlePrimaryContextualization(_delegate, beanproperty)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field JsonSerializer _delegate>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #63  <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//    5    9:astore_2        
		serializerprovider = ((SerializerProvider) (this));
	//    6   10:aload_0         
	//    7   11:astore_1        
		if(beanproperty != _delegate)
	//*   8   12:aload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #38  <Field JsonSerializer _delegate>
	//*  11   17:if_acmpeq       29
			serializerprovider = ((SerializerProvider) (new CoreXMLSerializers$XMLGregorianCalendarSerializer(((JsonSerializer) (beanproperty)))));
	//   12   20:new             #2   <Class CoreXMLSerializers$XMLGregorianCalendarSerializer>
	//   13   23:dup             
	//   14   24:aload_2         
	//   15   25:invokespecial   #31  <Method void CoreXMLSerializers$XMLGregorianCalendarSerializer(JsonSerializer)>
	//   16   28:astore_1        
		return ((JsonSerializer) (serializerprovider));
	//   17   29:aload_1         
	//   18   30:areturn         
	}

	public JsonSerializer getDelegatee()
	{
		return _delegate;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonSerializer _delegate>
	//    2    4:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (XMLGregorianCalendar)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #33  <Class XMLGregorianCalendar>
	//    4    6:invokevirtual   #72  <Method boolean isEmpty(SerializerProvider, XMLGregorianCalendar)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, XMLGregorianCalendar xmlgregoriancalendar)
	{
		return _delegate.isEmpty(serializerprovider, ((Object) (_convert(xmlgregoriancalendar))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonSerializer _delegate>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #74  <Method Calendar _convert(XMLGregorianCalendar)>
	//    6   10:invokevirtual   #76  <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//    7   13:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((XMLGregorianCalendar)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class XMLGregorianCalendar>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #83  <Method void serialize(XMLGregorianCalendar, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(XMLGregorianCalendar xmlgregoriancalendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		_delegate.serialize(((Object) (_convert(xmlgregoriancalendar))), jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonSerializer _delegate>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #74  <Method Calendar _convert(XMLGregorianCalendar)>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #85  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//    8   14:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((XMLGregorianCalendar)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class XMLGregorianCalendar>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #90  <Method void serializeWithType(XMLGregorianCalendar, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(XMLGregorianCalendar xmlgregoriancalendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		_delegate.serializeWithType(((Object) (_convert(xmlgregoriancalendar))), jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonSerializer _delegate>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #74  <Method Calendar _convert(XMLGregorianCalendar)>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokevirtual   #92  <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    9   16:return          
	}

	static final CoreXMLSerializers$XMLGregorianCalendarSerializer instance = new CoreXMLSerializers$XMLGregorianCalendarSerializer();
	final JsonSerializer _delegate;

	static 
	{
	//    0    0:new             #2   <Class CoreXMLSerializers$XMLGregorianCalendarSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void CoreXMLSerializers$XMLGregorianCalendarSerializer()>
	//    3    7:putstatic       #22  <Field CoreXMLSerializers$XMLGregorianCalendarSerializer instance>
	//*   4   10:return          
	}

	public CoreXMLSerializers$XMLGregorianCalendarSerializer()
	{
		this(((JsonSerializer) (CalendarSerializer.instance)));
	//    0    0:aload_0         
	//    1    1:getstatic       #28  <Field CalendarSerializer CalendarSerializer.instance>
	//    2    4:invokespecial   #31  <Method void CoreXMLSerializers$XMLGregorianCalendarSerializer(JsonSerializer)>
	//    3    7:return          
	}

	protected CoreXMLSerializers$XMLGregorianCalendarSerializer(JsonSerializer jsonserializer)
	{
		super(javax/xml/datatype/XMLGregorianCalendar);
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <Class XMLGregorianCalendar>
	//    2    3:invokespecial   #36  <Method void StdSerializer(Class)>
		_delegate = jsonserializer;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #38  <Field JsonSerializer _delegate>
	//    6   11:return          
	}
}
