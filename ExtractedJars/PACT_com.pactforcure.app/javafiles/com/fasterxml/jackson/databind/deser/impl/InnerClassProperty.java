// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends SettableBeanProperty
{

	public InnerClassProperty(SettableBeanProperty settablebeanproperty, Constructor constructor)
	{
		super(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void SettableBeanProperty(SettableBeanProperty)>
		_delegate = settablebeanproperty;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #22  <Field SettableBeanProperty _delegate>
		_creator = constructor;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #24  <Field Constructor _creator>
	//    9   15:return          
	}

	protected InnerClassProperty(InnerClassProperty innerclassproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (innerclassproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_delegate = innerclassproperty._delegate.withValueDeserializer(jsondeserializer);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #22  <Field SettableBeanProperty _delegate>
	//    7   11:aload_2         
	//    8   12:invokevirtual   #35  <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(JsonDeserializer)>
	//    9   15:putfield        #22  <Field SettableBeanProperty _delegate>
		_creator = innerclassproperty._creator;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #24  <Field Constructor _creator>
	//   13   23:putfield        #24  <Field Constructor _creator>
	//   14   26:return          
	}

	protected InnerClassProperty(InnerClassProperty innerclassproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (innerclassproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_delegate = innerclassproperty._delegate.withName(propertyname);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #22  <Field SettableBeanProperty _delegate>
	//    7   11:aload_2         
	//    8   12:invokevirtual   #44  <Method SettableBeanProperty SettableBeanProperty.withName(PropertyName)>
	//    9   15:putfield        #22  <Field SettableBeanProperty _delegate>
		_creator = innerclassproperty._creator;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #24  <Field Constructor _creator>
	//   13   23:putfield        #24  <Field Constructor _creator>
	//   14   26:return          
	}

	protected InnerClassProperty(InnerClassProperty innerclassproperty, AnnotatedConstructor annotatedconstructor)
	{
		super(((SettableBeanProperty) (innerclassproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void SettableBeanProperty(SettableBeanProperty)>
		_delegate = innerclassproperty._delegate;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #22  <Field SettableBeanProperty _delegate>
	//    6   10:putfield        #22  <Field SettableBeanProperty _delegate>
		_annotated = annotatedconstructor;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #47  <Field AnnotatedConstructor _annotated>
		if(_annotated == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #47  <Field AnnotatedConstructor _annotated>
	//*  12   22:ifnonnull       49
			innerclassproperty = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		else
	//*  15   27:aload_0         
	//*  16   28:aload_1         
	//*  17   29:putfield        #24  <Field Constructor _creator>
	//*  18   32:aload_0         
	//*  19   33:getfield        #24  <Field Constructor _creator>
	//*  20   36:ifnonnull       60
	//*  21   39:new             #49  <Class IllegalArgumentException>
	//*  22   42:dup             
	//*  23   43:ldc1            #51  <String "Missing constructor (broken JDK (de)serialization?)">
	//*  24   45:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//*  25   48:athrow          
			innerclassproperty = ((InnerClassProperty) (_annotated.getAnnotated()));
	//   26   49:aload_0         
	//   27   50:getfield        #47  <Field AnnotatedConstructor _annotated>
	//   28   53:invokevirtual   #60  <Method Constructor AnnotatedConstructor.getAnnotated()>
	//   29   56:astore_1        
		_creator = ((Constructor) (innerclassproperty));
		if(_creator == null)
			throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
		else
	//*  30   57:goto            27
			return;
	//   31   60:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		Object obj1;
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #72  <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #78  <Field JsonToken JsonToken.VALUE_NULL>
	//*   3    7:if_acmpne       28
			obj1 = _valueDeserializer.getNullValue(deserializationcontext);
	//    4   10:aload_0         
	//    5   11:getfield        #82  <Field JsonDeserializer _valueDeserializer>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #88  <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//    8   18:astore          4
		else
	//*   9   20:aload_0         
	//*  10   21:aload_3         
	//*  11   22:aload           4
	//*  12   24:invokevirtual   #92  <Method void set(Object, Object)>
	//*  13   27:return          
		if(_valueTypeDeserializer != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #96  <Field com.fasterxml.jackson.databind.jsontype.TypeDeserializer _valueTypeDeserializer>
	//*  16   32:ifnull          53
		{
			obj1 = _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer);
	//   17   35:aload_0         
	//   18   36:getfield        #82  <Field JsonDeserializer _valueDeserializer>
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:getfield        #96  <Field com.fasterxml.jackson.databind.jsontype.TypeDeserializer _valueTypeDeserializer>
	//   23   45:invokevirtual   #100 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)>
	//   24   48:astore          4
		} else
	//*  25   50:goto            20
		{
			try
			{
				obj1 = _creator.newInstance(new Object[] {
					obj
				});
	//   26   53:aload_0         
	//   27   54:getfield        #24  <Field Constructor _creator>
	//   28   57:iconst_1        
	//   29   58:anewarray       Object[]
	//   30   61:dup             
	//   31   62:iconst_0        
	//   32   63:aload_3         
	//   33   64:aastore         
	//   34   65:invokevirtual   #108 <Method Object Constructor.newInstance(Object[])>
	//   35   68:astore          4
			}
	//*  36   70:aload_0         
	//*  37   71:getfield        #82  <Field JsonDeserializer _valueDeserializer>
	//*  38   74:aload_1         
	//*  39   75:aload_2         
	//*  40   76:aload           4
	//*  41   78:invokevirtual   #112 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//*  42   81:pop             
	//*  43   82:goto            20
			catch(Exception exception)
	//*  44   85:astore          4
			{
				ClassUtil.unwrapAndThrowAsIAE(((Throwable) (exception)), (new StringBuilder()).append("Failed to instantiate class ").append(_creator.getDeclaringClass().getName()).append(", problem: ").append(exception.getMessage()).toString());
	//   45   87:aload           4
	//   46   89:new             #114 <Class StringBuilder>
	//   47   92:dup             
	//   48   93:invokespecial   #117 <Method void StringBuilder()>
	//   49   96:ldc1            #119 <String "Failed to instantiate class ">
	//   50   98:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   51  101:aload_0         
	//   52  102:getfield        #24  <Field Constructor _creator>
	//   53  105:invokevirtual   #127 <Method Class Constructor.getDeclaringClass()>
	//   54  108:invokevirtual   #133 <Method String Class.getName()>
	//   55  111:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   56  114:ldc1            #135 <String ", problem: ">
	//   57  116:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   58  119:aload           4
	//   59  121:invokevirtual   #138 <Method String Exception.getMessage()>
	//   60  124:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   61  127:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   62  130:invokestatic    #147 <Method void ClassUtil.unwrapAndThrowAsIAE(Throwable, String)>
				exception = null;
	//   63  133:aconst_null     
	//   64  134:astore          4
			}
			_valueDeserializer.deserialize(jsonparser, deserializationcontext, obj1);
		}
		set(obj, obj1);
	//*  65  136:goto            70
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return setAndReturn(obj, deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #152 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    6    8:invokevirtual   #156 <Method Object setAndReturn(Object, Object)>
	//    7   11:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return _delegate.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SettableBeanProperty _delegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #160 <Method Annotation SettableBeanProperty.getAnnotation(Class)>
	//    4    8:areturn         
	}

	public AnnotatedMember getMember()
	{
		return _delegate.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SettableBeanProperty _delegate>
	//    2    4:invokevirtual   #165 <Method AnnotatedMember SettableBeanProperty.getMember()>
	//    3    7:areturn         
	}

	Object readResolve()
	{
		return ((Object) (new InnerClassProperty(this, _annotated)));
	//    0    0:new             #2   <Class InnerClassProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field AnnotatedConstructor _annotated>
	//    5    9:invokespecial   #169 <Method void InnerClassProperty(InnerClassProperty, AnnotatedConstructor)>
	//    6   12:areturn         
	}

	public final void set(Object obj, Object obj1)
		throws IOException
	{
		_delegate.set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SettableBeanProperty _delegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #170 <Method void SettableBeanProperty.set(Object, Object)>
	//    5    9:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		return _delegate.setAndReturn(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SettableBeanProperty _delegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #171 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #174 <Method InnerClassProperty withName(PropertyName)>
	//    3    5:areturn         
	}

	public InnerClassProperty withName(PropertyName propertyname)
	{
		return new InnerClassProperty(this, propertyname);
	//    0    0:new             #2   <Class InnerClassProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #176 <Method void InnerClassProperty(InnerClassProperty, PropertyName)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (withValueDeserializer(jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #179 <Method InnerClassProperty withValueDeserializer(JsonDeserializer)>
	//    3    5:areturn         
	}

	public InnerClassProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new InnerClassProperty(this, jsondeserializer);
	//    0    0:new             #2   <Class InnerClassProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #181 <Method void InnerClassProperty(InnerClassProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	Object writeReplace()
	{
		if(_annotated != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field AnnotatedConstructor _annotated>
	//*   2    4:ifnull          9
			return ((Object) (this));
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return ((Object) (new InnerClassProperty(this, new AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext) (null)), _creator, ((com.fasterxml.jackson.databind.introspect.AnnotationMap) (null)), ((com.fasterxml.jackson.databind.introspect.AnnotationMap []) (null))))));
	//    5    9:new             #2   <Class InnerClassProperty>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:new             #56  <Class AnnotatedConstructor>
	//    9   17:dup             
	//   10   18:aconst_null     
	//   11   19:aload_0         
	//   12   20:getfield        #24  <Field Constructor _creator>
	//   13   23:aconst_null     
	//   14   24:aconst_null     
	//   15   25:invokespecial   #186 <Method void AnnotatedConstructor(com.fasterxml.jackson.databind.introspect.TypeResolutionContext, Constructor, com.fasterxml.jackson.databind.introspect.AnnotationMap, com.fasterxml.jackson.databind.introspect.AnnotationMap[])>
	//   16   28:invokespecial   #169 <Method void InnerClassProperty(InnerClassProperty, AnnotatedConstructor)>
	//   17   31:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected AnnotatedConstructor _annotated;
	protected final transient Constructor _creator;
	protected final SettableBeanProperty _delegate;
}
