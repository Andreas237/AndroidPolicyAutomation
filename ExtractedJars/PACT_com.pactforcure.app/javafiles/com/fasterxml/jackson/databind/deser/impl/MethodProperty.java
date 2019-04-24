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
import java.lang.reflect.Method;

public final class MethodProperty extends SettableBeanProperty
{

	protected MethodProperty(MethodProperty methodproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (methodproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_annotated = methodproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field AnnotatedMethod _annotated>
	//    7   11:putfield        #19  <Field AnnotatedMethod _annotated>
		_setter = methodproperty._setter;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #21  <Field Method _setter>
	//   11   19:putfield        #21  <Field Method _setter>
	//   12   22:return          
	}

	protected MethodProperty(MethodProperty methodproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (methodproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_annotated = methodproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field AnnotatedMethod _annotated>
	//    7   11:putfield        #19  <Field AnnotatedMethod _annotated>
		_setter = methodproperty._setter;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #21  <Field Method _setter>
	//   11   19:putfield        #21  <Field Method _setter>
	//   12   22:return          
	}

	protected MethodProperty(MethodProperty methodproperty, Method method)
	{
		super(((SettableBeanProperty) (methodproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void SettableBeanProperty(SettableBeanProperty)>
		_annotated = methodproperty._annotated;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #19  <Field AnnotatedMethod _annotated>
	//    6   10:putfield        #19  <Field AnnotatedMethod _annotated>
		_setter = method;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #21  <Field Method _setter>
	//   10   18:return          
	}

	public MethodProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedMethod annotatedmethod)
	{
		super(beanpropertydefinition, javatype, typedeserializer, annotations);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #36  <Method void SettableBeanProperty(BeanPropertyDefinition, JavaType, TypeDeserializer, Annotations)>
		_annotated = annotatedmethod;
	//    6    9:aload_0         
	//    7   10:aload           5
	//    8   12:putfield        #19  <Field AnnotatedMethod _annotated>
		_setter = annotatedmethod.getAnnotated();
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:invokevirtual   #42  <Method Method AnnotatedMethod.getAnnotated()>
	//   12   21:putfield        #21  <Field Method _setter>
	//   13   24:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializationcontext = ((DeserializationContext) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #52  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    4    6:astore_2        
		try
		{
			_setter.invoke(obj, new Object[] {
				deserializationcontext
			});
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field Method _setter>
	//    7   11:aload_3         
	//    8   12:iconst_1        
	//    9   13:anewarray       Object[]
	//   10   16:dup             
	//   11   17:iconst_0        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:invokevirtual   #60  <Method Object Method.invoke(Object, Object[])>
	//   15   23:pop             
			return;
	//   16   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  17   25:astore_3        
		{
			_throwAsIOE(jsonparser, ((Exception) (obj)), ((Object) (deserializationcontext)));
	//   18   26:aload_0         
	//   19   27:aload_1         
	//   20   28:aload_3         
	//   21   29:aload_2         
	//   22   30:invokevirtual   #64  <Method void _throwAsIOE(JsonParser, Exception, Object)>
		}
	//   23   33:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializationcontext = ((DeserializationContext) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #52  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    4    6:astore_2        
		Object obj1;
		try
		{
			obj1 = _setter.invoke(obj, new Object[] {
				deserializationcontext
			});
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field Method _setter>
	//    7   11:aload_3         
	//    8   12:iconst_1        
	//    9   13:anewarray       Object[]
	//   10   16:dup             
	//   11   17:iconst_0        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:invokevirtual   #60  <Method Object Method.invoke(Object, Object[])>
	//   15   23:astore          4
		}
	//*  16   25:aload           4
	//*  17   27:ifnonnull       32
	//*  18   30:aload_3         
	//*  19   31:areturn         
	//*  20   32:aload           4
	//*  21   34:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  22   35:astore_3        
		{
			_throwAsIOE(jsonparser, ((Exception) (obj)), ((Object) (deserializationcontext)));
	//   23   36:aload_0         
	//   24   37:aload_1         
	//   25   38:aload_3         
	//   26   39:aload_2         
	//   27   40:invokevirtual   #64  <Method void _throwAsIOE(JsonParser, Exception, Object)>
			return ((Object) (null));
	//   28   43:aconst_null     
	//   29   44:areturn         
		}
		if(obj1 == null)
			return obj;
		else
			return obj1;
	}

	public Annotation getAnnotation(Class class1)
	{
		if(_annotated == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field AnnotatedMethod _annotated>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _annotated.getAnnotation(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field AnnotatedMethod _annotated>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #71  <Method Annotation AnnotatedMethod.getAnnotation(Class)>
	//    9   17:areturn         
	}

	public AnnotatedMember getMember()
	{
		return ((AnnotatedMember) (_annotated));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AnnotatedMethod _annotated>
	//    2    4:areturn         
	}

	Object readResolve()
	{
		return ((Object) (new MethodProperty(this, _annotated.getAnnotated())));
	//    0    0:new             #2   <Class MethodProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field AnnotatedMethod _annotated>
	//    5    9:invokevirtual   #42  <Method Method AnnotatedMethod.getAnnotated()>
	//    6   12:invokespecial   #78  <Method void MethodProperty(MethodProperty, Method)>
	//    7   15:areturn         
	}

	public final void set(Object obj, Object obj1)
		throws IOException
	{
		try
		{
			_setter.invoke(obj, new Object[] {
				obj1
			});
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Method _setter>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:invokevirtual   #60  <Method Object Method.invoke(Object, Object[])>
	//   10   16:pop             
			return;
	//   11   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  12   18:astore_1        
		{
			_throwAsIOE(((Exception) (obj)), obj1);
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:aload_2         
	//   16   22:invokevirtual   #83  <Method void _throwAsIOE(Exception, Object)>
		}
	//   17   25:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		Object obj2;
		try
		{
			obj2 = _setter.invoke(obj, new Object[] {
				obj1
			});
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Method _setter>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:invokevirtual   #60  <Method Object Method.invoke(Object, Object[])>
	//   10   16:astore_3        
		}
	//*  11   17:aload_3         
	//*  12   18:ifnonnull       23
	//*  13   21:aload_1         
	//*  14   22:areturn         
	//*  15   23:aload_3         
	//*  16   24:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  17   25:astore_1        
		{
			_throwAsIOE(((Exception) (obj)), obj1);
	//   18   26:aload_0         
	//   19   27:aload_1         
	//   20   28:aload_2         
	//   21   29:invokevirtual   #83  <Method void _throwAsIOE(Exception, Object)>
			return ((Object) (null));
	//   22   32:aconst_null     
	//   23   33:areturn         
		}
		if(obj2 == null)
			return obj;
		else
			return obj2;
	}

	public volatile SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method MethodProperty withName(PropertyName)>
	//    3    5:areturn         
	}

	public MethodProperty withName(PropertyName propertyname)
	{
		return new MethodProperty(this, propertyname);
	//    0    0:new             #2   <Class MethodProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #92  <Method void MethodProperty(MethodProperty, PropertyName)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (withValueDeserializer(jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #97  <Method MethodProperty withValueDeserializer(JsonDeserializer)>
	//    3    5:areturn         
	}

	public MethodProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new MethodProperty(this, jsondeserializer);
	//    0    0:new             #2   <Class MethodProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #99  <Method void MethodProperty(MethodProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMethod _annotated;
	protected final transient Method _setter;
}
