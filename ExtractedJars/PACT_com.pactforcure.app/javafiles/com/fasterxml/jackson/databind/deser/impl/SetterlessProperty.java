// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class SetterlessProperty extends SettableBeanProperty
{

	protected SetterlessProperty(SetterlessProperty setterlessproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (setterlessproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_annotated = setterlessproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field AnnotatedMethod _annotated>
	//    7   11:putfield        #19  <Field AnnotatedMethod _annotated>
		_getter = setterlessproperty._getter;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #21  <Field Method _getter>
	//   11   19:putfield        #21  <Field Method _getter>
	//   12   22:return          
	}

	protected SetterlessProperty(SetterlessProperty setterlessproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (setterlessproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_annotated = setterlessproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field AnnotatedMethod _annotated>
	//    7   11:putfield        #19  <Field AnnotatedMethod _annotated>
		_getter = setterlessproperty._getter;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #21  <Field Method _getter>
	//   11   19:putfield        #21  <Field Method _getter>
	//   12   22:return          
	}

	public SetterlessProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedMethod annotatedmethod)
	{
		super(beanpropertydefinition, javatype, typedeserializer, annotations);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #32  <Method void SettableBeanProperty(BeanPropertyDefinition, JavaType, TypeDeserializer, Annotations)>
		_annotated = annotatedmethod;
	//    6    9:aload_0         
	//    7   10:aload           5
	//    8   12:putfield        #19  <Field AnnotatedMethod _annotated>
		_getter = annotatedmethod.getAnnotated();
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:invokevirtual   #38  <Method Method AnnotatedMethod.getAnnotated()>
	//   12   21:putfield        #21  <Field Method _getter>
	//   13   24:return          
	}

	public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #50  <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #56  <Field JsonToken JsonToken.VALUE_NULL>
	//*   3    7:if_acmpne       11
			return;
	//    4   10:return          
		if(_valueTypeDeserializer != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #60  <Field TypeDeserializer _valueTypeDeserializer>
	//*   7   15:ifnull          50
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Problem deserializing 'setterless' property (\"").append(getName()).append("\"): no way to handle typed deser with setterless yet").toString());
	//    8   18:aload_1         
	//    9   19:new             #62  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #65  <Method void StringBuilder()>
	//   12   26:ldc1            #67  <String "Problem deserializing 'setterless' property (\"">
	//   13   28:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_0         
	//   15   32:invokevirtual   #75  <Method String getName()>
	//   16   35:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:ldc1            #77  <String "\"): no way to handle typed deser with setterless yet">
	//   18   40:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   19   43:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   20   46:invokestatic    #86  <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   21   49:athrow          
		try
		{
			obj = _getter.invoke(obj, new Object[0]);
	//   22   50:aload_0         
	//   23   51:getfield        #21  <Field Method _getter>
	//   24   54:aload_3         
	//   25   55:iconst_0        
	//   26   56:anewarray       Object[]
	//   27   59:invokevirtual   #94  <Method Object Method.invoke(Object, Object[])>
	//   28   62:astore_3        
		}
	//*  29   63:aload_3         
	//*  30   64:ifnonnull       108
	//*  31   67:aload_1         
	//*  32   68:new             #62  <Class StringBuilder>
	//*  33   71:dup             
	//*  34   72:invokespecial   #65  <Method void StringBuilder()>
	//*  35   75:ldc1            #96  <String "Problem deserializing 'setterless' property '">
	//*  36   77:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  37   80:aload_0         
	//*  38   81:invokevirtual   #75  <Method String getName()>
	//*  39   84:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  40   87:ldc1            #98  <String "': get method returned null">
	//*  41   89:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  42   92:invokevirtual   #80  <Method String StringBuilder.toString()>
	//*  43   95:invokestatic    #86  <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//*  44   98:athrow          
		// Misplaced declaration of an exception variable
		catch(DeserializationContext deserializationcontext)
	//*  45   99:astore_2        
		{
			_throwAsIOE(jsonparser, ((Exception) (deserializationcontext)));
	//   46  100:aload_0         
	//   47  101:aload_1         
	//   48  102:aload_2         
	//   49  103:invokevirtual   #102 <Method IOException _throwAsIOE(JsonParser, Exception)>
	//   50  106:pop             
			return;
	//   51  107:return          
		}
		if(obj == null)
		{
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Problem deserializing 'setterless' property '").append(getName()).append("': get method returned null").toString());
		} else
		{
			_valueDeserializer.deserialize(jsonparser, deserializationcontext, obj);
	//   52  108:aload_0         
	//   53  109:getfield        #106 <Field JsonDeserializer _valueDeserializer>
	//   54  112:aload_1         
	//   55  113:aload_2         
	//   56  114:aload_3         
	//   57  115:invokevirtual   #112 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   58  118:pop             
			return;
	//   59  119:return          
		}
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializeAndSet(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #116 <Method void deserializeAndSet(JsonParser, DeserializationContext, Object)>
		return obj;
	//    5    7:aload_3         
	//    6    8:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return _annotated.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AnnotatedMethod _annotated>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #120 <Method Annotation AnnotatedMethod.getAnnotation(Class)>
	//    4    8:areturn         
	}

	public AnnotatedMember getMember()
	{
		return ((AnnotatedMember) (_annotated));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AnnotatedMethod _annotated>
	//    2    4:areturn         
	}

	public final void set(Object obj, Object obj1)
		throws IOException
	{
		throw new UnsupportedOperationException("Should never call 'set' on setterless property");
	//    0    0:new             #127 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #129 <String "Should never call 'set' on setterless property">
	//    3    6:invokespecial   #132 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #136 <Method void set(Object, Object)>
		return ((Object) (null));
	//    4    6:aconst_null     
	//    5    7:areturn         
	}

	public volatile SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #141 <Method SetterlessProperty withName(PropertyName)>
	//    3    5:areturn         
	}

	public SetterlessProperty withName(PropertyName propertyname)
	{
		return new SetterlessProperty(this, propertyname);
	//    0    0:new             #2   <Class SetterlessProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #143 <Method void SetterlessProperty(SetterlessProperty, PropertyName)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (withValueDeserializer(jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #148 <Method SetterlessProperty withValueDeserializer(JsonDeserializer)>
	//    3    5:areturn         
	}

	public SetterlessProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new SetterlessProperty(this, jsondeserializer);
	//    0    0:new             #2   <Class SetterlessProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #150 <Method void SetterlessProperty(SetterlessProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMethod _annotated;
	protected final Method _getter;
}
