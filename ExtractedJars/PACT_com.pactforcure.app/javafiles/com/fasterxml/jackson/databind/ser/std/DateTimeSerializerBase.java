// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public abstract class DateTimeSerializerBase extends StdScalarSerializer
	implements ContextualSerializer
{

	protected DateTimeSerializerBase(Class class1, Boolean boolean1, DateFormat dateformat)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void StdScalarSerializer(Class)>
		_useTimestamp = boolean1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Boolean _useTimestamp>
		_customFormat = dateformat;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field DateFormat _customFormat>
	//    9   15:return          
	}

	protected void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, boolean flag)
		throws JsonMappingException
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            17
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:getstatic       #33  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//    6   10:getstatic       #39  <Field JsonValueFormat JsonValueFormat.UTC_MILLISEC>
	//    7   13:invokevirtual   #43  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType, JsonValueFormat)>
			return;
	//    8   16:return          
		} else
		{
			visitStringFormat(jsonformatvisitorwrapper, javatype, JsonValueFormat.DATE_TIME);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #46  <Field JsonValueFormat JsonValueFormat.DATE_TIME>
	//   13   23:invokevirtual   #50  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType, JsonValueFormat)>
			return;
	//   14   26:return          
		}
	}

	protected boolean _asTimestamp(SerializerProvider serializerprovider)
	{
		if(_useTimestamp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Boolean _useTimestamp>
	//*   2    4:ifnull          15
			return _useTimestamp.booleanValue();
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field Boolean _useTimestamp>
	//    5   11:invokevirtual   #59  <Method boolean Boolean.booleanValue()>
	//    6   14:ireturn         
		if(_customFormat == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #20  <Field DateFormat _customFormat>
	//*   9   19:ifnonnull       67
		{
			if(serializerprovider != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          34
				return serializerprovider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	//   12   26:aload_1         
	//   13   27:getstatic       #65  <Field SerializationFeature SerializationFeature.WRITE_DATES_AS_TIMESTAMPS>
	//   14   30:invokevirtual   #71  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//   15   33:ireturn         
			else
				throw new IllegalArgumentException((new StringBuilder()).append("Null SerializerProvider passed for ").append(handledType().getName()).toString());
	//   16   34:new             #73  <Class IllegalArgumentException>
	//   17   37:dup             
	//   18   38:new             #75  <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #78  <Method void StringBuilder()>
	//   21   45:ldc1            #80  <String "Null SerializerProvider passed for ">
	//   22   47:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:aload_0         
	//   24   51:invokevirtual   #88  <Method Class handledType()>
	//   25   54:invokevirtual   #94  <Method String Class.getName()>
	//   26   57:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   27   60:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   28   63:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//   29   66:athrow          
		} else
		{
			return false;
	//   30   67:iconst_0        
	//   31   68:ireturn         
		}
	}

	protected abstract long _timestamp(Object obj);

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		_acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype, _asTimestamp(jsonformatvisitorwrapper.getProvider()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:invokeinterface #110 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//    6   10:invokevirtual   #112 <Method boolean _asTimestamp(SerializerProvider)>
	//    7   13:invokevirtual   #114 <Method void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType, boolean)>
	//    8   16:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		DateTimeSerializerBase datetimeserializerbase = this;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(beanproperty != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          48
		{
			com.fasterxml.jackson.annotation.JsonFormat.Value value = serializerprovider.getAnnotationIntrospector().findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #120 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    6   10:aload_2         
	//    7   11:invokeinterface #126 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    8   16:invokevirtual   #132 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
	//    9   19:astore          5
			datetimeserializerbase = this;
	//   10   21:aload_0         
	//   11   22:astore_3        
			if(value != null)
	//*  12   23:aload           5
	//*  13   25:ifnull          48
				if(value.getShape().isNumeric())
	//*  14   28:aload           5
	//*  15   30:invokevirtual   #138 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  16   33:invokevirtual   #143 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Shape.isNumeric()>
	//*  17   36:ifeq            50
				{
					datetimeserializerbase = withFormat(Boolean.TRUE, ((DateFormat) (null)));
	//   18   39:aload_0         
	//   19   40:getstatic       #146 <Field Boolean Boolean.TRUE>
	//   20   43:aconst_null     
	//   21   44:invokevirtual   #150 <Method DateTimeSerializerBase withFormat(Boolean, DateFormat)>
	//   22   47:astore_3        
				} else
	//*  23   48:aload_3         
	//*  24   49:areturn         
				{
					datetimeserializerbase = this;
	//   25   50:aload_0         
	//   26   51:astore_3        
					if(value.getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
	//*  27   52:aload           5
	//*  28   54:invokevirtual   #138 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  29   57:getstatic       #154 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
	//*  30   60:if_acmpne       48
					{
						java.util.TimeZone timezone = value.getTimeZone();
	//   31   63:aload           5
	//   32   65:invokevirtual   #158 <Method java.util.TimeZone com.fasterxml.jackson.annotation.JsonFormat$Value.getTimeZone()>
	//   33   68:astore          4
						Object obj;
						if(value.hasPattern())
	//*  34   70:aload           5
	//*  35   72:invokevirtual   #161 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasPattern()>
	//*  36   75:ifeq            135
							beanproperty = ((BeanProperty) (value.getPattern()));
	//   37   78:aload           5
	//   38   80:invokevirtual   #164 <Method String com.fasterxml.jackson.annotation.JsonFormat$Value.getPattern()>
	//   39   83:astore_2        
						else
	//*  40   84:aload           5
	//*  41   86:invokevirtual   #167 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasLocale()>
	//*  42   89:ifeq            141
	//*  43   92:aload           5
	//*  44   94:invokevirtual   #171 <Method java.util.Locale com.fasterxml.jackson.annotation.JsonFormat$Value.getLocale()>
	//*  45   97:astore_3        
	//*  46   98:new             #173 <Class SimpleDateFormat>
	//*  47  101:dup             
	//*  48  102:aload_2         
	//*  49  103:aload_3         
	//*  50  104:invokespecial   #176 <Method void SimpleDateFormat(String, java.util.Locale)>
	//*  51  107:astore_3        
	//*  52  108:aload           4
	//*  53  110:astore_2        
	//*  54  111:aload           4
	//*  55  113:ifnonnull       121
	//*  56  116:aload_1         
	//*  57  117:invokevirtual   #177 <Method java.util.TimeZone SerializerProvider.getTimeZone()>
	//*  58  120:astore_2        
	//*  59  121:aload_3         
	//*  60  122:aload_2         
	//*  61  123:invokevirtual   #181 <Method void SimpleDateFormat.setTimeZone(java.util.TimeZone)>
	//*  62  126:aload_0         
	//*  63  127:getstatic       #184 <Field Boolean Boolean.FALSE>
	//*  64  130:aload_3         
	//*  65  131:invokevirtual   #150 <Method DateTimeSerializerBase withFormat(Boolean, DateFormat)>
	//*  66  134:areturn         
							beanproperty = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	//   67  135:ldc1            #186 <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//   68  137:astore_2        
						if(value.hasLocale())
							obj = ((Object) (value.getLocale()));
						else
	//*  69  138:goto            84
							obj = ((Object) (serializerprovider.getLocale()));
	//   70  141:aload_1         
	//   71  142:invokevirtual   #187 <Method java.util.Locale SerializerProvider.getLocale()>
	//   72  145:astore_3        
						obj = ((Object) (new SimpleDateFormat(((String) (beanproperty)), ((java.util.Locale) (obj)))));
						beanproperty = ((BeanProperty) (timezone));
						if(timezone == null)
							beanproperty = ((BeanProperty) (serializerprovider.getTimeZone()));
						((SimpleDateFormat) (obj)).setTimeZone(((java.util.TimeZone) (beanproperty)));
						return ((JsonSerializer) (withFormat(Boolean.FALSE, ((DateFormat) (obj)))));
					}
				}
		}
		return ((JsonSerializer) (datetimeserializerbase));
	//*  73  146:goto            98
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #112 <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            18
			serializerprovider = "number";
	//    4    8:ldc1            #192 <String "number">
	//    5   10:astore_1        
		else
	//*   6   11:aload_0         
	//*   7   12:aload_1         
	//*   8   13:iconst_1        
	//*   9   14:invokevirtual   #196 <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//*  10   17:areturn         
			serializerprovider = "string";
	//   11   18:ldc1            #198 <String "string">
	//   12   20:astore_1        
		return ((JsonNode) (createSchemaNode(((String) (serializerprovider)), true)));
	//*  13   21:goto            11
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return obj == null || _timestamp(obj) == 0L;
	//    0    0:aload_2         
	//    1    1:ifnull          14
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #202 <Method long _timestamp(Object)>
	//    5    9:lconst_0        
	//    6   10:lcmp            
	//    7   11:ifne            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public boolean isEmpty(Object obj)
	{
		return obj == null || _timestamp(obj) == 0L;
	//    0    0:aload_1         
	//    1    1:ifnull          14
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #202 <Method long _timestamp(Object)>
	//    5    9:lconst_0        
	//    6   10:lcmp            
	//    7   11:ifne            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	public abstract DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat);

	protected final DateFormat _customFormat;
	protected final Boolean _useTimestamp;
}
