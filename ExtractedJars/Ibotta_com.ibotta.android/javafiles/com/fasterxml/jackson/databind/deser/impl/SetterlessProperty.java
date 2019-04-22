// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class SetterlessProperty extends SettableBeanProperty
{

	protected SetterlessProperty(SetterlessProperty setterlessproperty, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider)
	{
		super(((SettableBeanProperty) (setterlessproperty)), jsondeserializer, nullvalueprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #17  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer, NullValueProvider)>
		_annotated = setterlessproperty._annotated;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #19  <Field AnnotatedMethod _annotated>
	//    8   12:putfield        #19  <Field AnnotatedMethod _annotated>
		_getter = setterlessproperty._getter;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #21  <Field Method _getter>
	//   12   20:putfield        #21  <Field Method _getter>
	//   13   23:return          
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
	//*   7   15:ifnull          43
			deserializationcontext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", new Object[] {
				getName()
			}));
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:invokevirtual   #64  <Method JavaType getType()>
	//   11   23:ldc1            #66  <String "Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet">
	//   12   25:iconst_1        
	//   13   26:anewarray       Object[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:invokevirtual   #72  <Method String getName()>
	//   18   35:aastore         
	//   19   36:invokestatic    #78  <Method String String.format(String, Object[])>
	//   20   39:invokevirtual   #84  <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   21   42:pop             
		try
		{
			obj = _getter.invoke(obj, (Object[])null);
	//   22   43:aload_0         
	//   23   44:getfield        #21  <Field Method _getter>
	//   24   47:aload_3         
	//   25   48:aconst_null     
	//   26   49:checkcast       #86  <Class Object[]>
	//   27   52:invokevirtual   #92  <Method Object Method.invoke(Object, Object[])>
	//   28   55:astore_3        
		}
	//*  29   56:aload_3         
	//*  30   57:ifnonnull       85
	//*  31   60:aload_2         
	//*  32   61:aload_0         
	//*  33   62:invokevirtual   #64  <Method JavaType getType()>
	//*  34   65:ldc1            #94  <String "Problem deserializing 'setterless' property '%s': get method returned null">
	//*  35   67:iconst_1        
	//*  36   68:anewarray       Object[]
	//*  37   71:dup             
	//*  38   72:iconst_0        
	//*  39   73:aload_0         
	//*  40   74:invokevirtual   #72  <Method String getName()>
	//*  41   77:aastore         
	//*  42   78:invokestatic    #78  <Method String String.format(String, Object[])>
	//*  43   81:invokevirtual   #84  <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//*  44   84:pop             
	//*  45   85:aload_0         
	//*  46   86:getfield        #98  <Field JsonDeserializer _valueDeserializer>
	//*  47   89:aload_1         
	//*  48   90:aload_2         
	//*  49   91:aload_3         
	//*  50   92:invokevirtual   #104 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//*  51   95:pop             
	//*  52   96:return          
		// Misplaced declaration of an exception variable
		catch(DeserializationContext deserializationcontext)
	//*  53   97:astore_2        
		{
			_throwAsIOE(jsonparser, ((Exception) (deserializationcontext)));
	//   54   98:aload_0         
	//   55   99:aload_1         
	//   56  100:aload_2         
	//   57  101:invokevirtual   #108 <Method IOException _throwAsIOE(JsonParser, Exception)>
	//   58  104:pop             
			return;
	//   59  105:return          
		}
		if(obj == null)
			deserializationcontext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property '%s': get method returned null", new Object[] {
				getName()
			}));
		_valueDeserializer.deserialize(jsonparser, deserializationcontext, obj);
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializeAndSet(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #112 <Method void deserializeAndSet(JsonParser, DeserializationContext, Object)>
		return obj;
	//    5    7:aload_3         
	//    6    8:areturn         
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		_annotated.fixAccess(deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AnnotatedMethod _annotated>
	//    2    4:aload_1         
	//    3    5:getstatic       #120 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    4    8:invokevirtual   #126 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    5   11:invokevirtual   #129 <Method void AnnotatedMethod.fixAccess(boolean)>
	//    6   14:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		return _annotated.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AnnotatedMethod _annotated>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method Annotation AnnotatedMethod.getAnnotation(Class)>
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
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #140 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #143 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Should never call `set()` on setterless property ('");
	//    4    8:aload_1         
	//    5    9:ldc1            #145 <String "Should never call `set()` on setterless property ('">
	//    6   11:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #72  <Method String getName()>
	//   11   20:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		((StringBuilder) (obj)).append("')");
	//   13   24:aload_1         
	//   14   25:ldc1            #151 <String "')">
	//   15   27:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		throw new UnsupportedOperationException(((StringBuilder) (obj)).toString());
	//   17   31:new             #153 <Class UnsupportedOperationException>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #159 <Method void UnsupportedOperationException(String)>
	//   22   42:athrow          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #163 <Method void set(Object, Object)>
		return obj;
	//    4    6:aload_1         
	//    5    7:areturn         
	}

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (new SetterlessProperty(this, propertyname)));
	//    0    0:new             #2   <Class SetterlessProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #167 <Method void SetterlessProperty(SetterlessProperty, PropertyName)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider)
	{
		return ((SettableBeanProperty) (new SetterlessProperty(this, _valueDeserializer, nullvalueprovider)));
	//    0    0:new             #2   <Class SetterlessProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #98  <Field JsonDeserializer _valueDeserializer>
	//    5    9:aload_1         
	//    6   10:invokespecial   #171 <Method void SetterlessProperty(SetterlessProperty, JsonDeserializer, NullValueProvider)>
	//    7   13:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		if(_valueDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field JsonDeserializer _valueDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((SettableBeanProperty) (new SetterlessProperty(this, jsondeserializer, _nullProvider)));
	//    6   10:new             #2   <Class SetterlessProperty>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #177 <Field NullValueProvider _nullProvider>
	//   12   20:invokespecial   #171 <Method void SetterlessProperty(SetterlessProperty, JsonDeserializer, NullValueProvider)>
	//   13   23:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMethod _annotated;
	protected final Method _getter;
}
