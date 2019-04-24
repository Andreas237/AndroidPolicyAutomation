// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class FieldProperty extends SettableBeanProperty
{

	protected FieldProperty(FieldProperty fieldproperty)
	{
		super(((SettableBeanProperty) (fieldproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void SettableBeanProperty(SettableBeanProperty)>
		_annotated = fieldproperty._annotated;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #19  <Field AnnotatedField _annotated>
	//    6   10:putfield        #19  <Field AnnotatedField _annotated>
		fieldproperty = ((FieldProperty) (_annotated.getAnnotated()));
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field AnnotatedField _annotated>
	//    9   17:invokevirtual   #25  <Method Field AnnotatedField.getAnnotated()>
	//   10   20:astore_1        
		if(fieldproperty == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       35
		{
			throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
	//   13   25:new             #27  <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #29  <String "Missing field (broken JDK (de)serialization?)">
	//   16   31:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
		} else
		{
			_field = ((Field) (fieldproperty));
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:putfield        #34  <Field Field _field>
			return;
	//   21   40:return          
		}
	}

	protected FieldProperty(FieldProperty fieldproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (fieldproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #39  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_annotated = fieldproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field AnnotatedField _annotated>
	//    7   11:putfield        #19  <Field AnnotatedField _annotated>
		_field = fieldproperty._field;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #34  <Field Field _field>
	//   11   19:putfield        #34  <Field Field _field>
	//   12   22:return          
	}

	protected FieldProperty(FieldProperty fieldproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (fieldproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_annotated = fieldproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field AnnotatedField _annotated>
	//    7   11:putfield        #19  <Field AnnotatedField _annotated>
		_field = fieldproperty._field;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #34  <Field Field _field>
	//   11   19:putfield        #34  <Field Field _field>
	//   12   22:return          
	}

	public FieldProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedField annotatedfield)
	{
		super(beanpropertydefinition, javatype, typedeserializer, annotations);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #49  <Method void SettableBeanProperty(BeanPropertyDefinition, JavaType, TypeDeserializer, Annotations)>
		_annotated = annotatedfield;
	//    6    9:aload_0         
	//    7   10:aload           5
	//    8   12:putfield        #19  <Field AnnotatedField _annotated>
		_field = annotatedfield.getAnnotated();
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:invokevirtual   #25  <Method Field AnnotatedField.getAnnotated()>
	//   12   21:putfield        #34  <Field Field _field>
	//   13   24:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializationcontext = ((DeserializationContext) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #59  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    4    6:astore_2        
		try
		{
			_field.set(obj, ((Object) (deserializationcontext)));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field Field _field>
	//    7   11:aload_3         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #65  <Method void Field.set(Object, Object)>
			return;
	//   10   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  11   17:astore_3        
		{
			_throwAsIOE(jsonparser, ((Exception) (obj)), ((Object) (deserializationcontext)));
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:aload_3         
	//   15   21:aload_2         
	//   16   22:invokevirtual   #69  <Method void _throwAsIOE(JsonParser, Exception, Object)>
		}
	//   17   25:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializationcontext = ((DeserializationContext) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #59  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    4    6:astore_2        
		try
		{
			_field.set(obj, ((Object) (deserializationcontext)));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field Field _field>
	//    7   11:aload_3         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #65  <Method void Field.set(Object, Object)>
		}
	//*  10   16:aload_3         
	//*  11   17:areturn         
		catch(Exception exception)
	//*  12   18:astore          4
		{
			_throwAsIOE(jsonparser, exception, ((Object) (deserializationcontext)));
	//   13   20:aload_0         
	//   14   21:aload_1         
	//   15   22:aload           4
	//   16   24:aload_2         
	//   17   25:invokevirtual   #69  <Method void _throwAsIOE(JsonParser, Exception, Object)>
			return obj;
	//   18   28:aload_3         
	//   19   29:areturn         
		}
		return obj;
	}

	public Annotation getAnnotation(Class class1)
	{
		if(_annotated == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field AnnotatedField _annotated>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _annotated.getAnnotation(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field AnnotatedField _annotated>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #76  <Method Annotation AnnotatedField.getAnnotation(Class)>
	//    9   17:areturn         
	}

	public AnnotatedMember getMember()
	{
		return ((AnnotatedMember) (_annotated));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AnnotatedField _annotated>
	//    2    4:areturn         
	}

	Object readResolve()
	{
		return ((Object) (new FieldProperty(this)));
	//    0    0:new             #2   <Class FieldProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #83  <Method void FieldProperty(FieldProperty)>
	//    4    8:areturn         
	}

	public final void set(Object obj, Object obj1)
		throws IOException
	{
		try
		{
			_field.set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Field _field>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #65  <Method void Field.set(Object, Object)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   6   10:astore_1        
		{
			_throwAsIOE(((Exception) (obj)), obj1);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #86  <Method void _throwAsIOE(Exception, Object)>
		}
	//   11   17:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		try
		{
			_field.set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Field _field>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #65  <Method void Field.set(Object, Object)>
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		catch(Exception exception)
	//*   7   11:astore_3        
		{
			_throwAsIOE(exception, obj1);
	//    8   12:aload_0         
	//    9   13:aload_3         
	//   10   14:aload_2         
	//   11   15:invokevirtual   #86  <Method void _throwAsIOE(Exception, Object)>
			return obj;
	//   12   18:aload_1         
	//   13   19:areturn         
		}
		return obj;
	}

	public volatile SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #93  <Method FieldProperty withName(PropertyName)>
	//    3    5:areturn         
	}

	public FieldProperty withName(PropertyName propertyname)
	{
		return new FieldProperty(this, propertyname);
	//    0    0:new             #2   <Class FieldProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #95  <Method void FieldProperty(FieldProperty, PropertyName)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (withValueDeserializer(jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method FieldProperty withValueDeserializer(JsonDeserializer)>
	//    3    5:areturn         
	}

	public FieldProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new FieldProperty(this, jsondeserializer);
	//    0    0:new             #2   <Class FieldProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #102 <Method void FieldProperty(FieldProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedField _annotated;
	protected final transient Field _field;
}
