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

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			NullsConstantProvider

public final class MethodProperty extends SettableBeanProperty
{

	protected MethodProperty(MethodProperty methodproperty, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider)
	{
		super(((SettableBeanProperty) (methodproperty)), jsondeserializer, nullvalueprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #19  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer, NullValueProvider)>
		_annotated = methodproperty._annotated;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #21  <Field AnnotatedMethod _annotated>
	//    8   12:putfield        #21  <Field AnnotatedMethod _annotated>
		_setter = methodproperty._setter;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field Method _setter>
	//   12   20:putfield        #23  <Field Method _setter>
		_skipNulls = NullsConstantProvider.isSkipper(nullvalueprovider);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokestatic    #29  <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//   16   28:putfield        #31  <Field boolean _skipNulls>
	//   17   31:return          
	}

	protected MethodProperty(MethodProperty methodproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (methodproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_annotated = methodproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #21  <Field AnnotatedMethod _annotated>
	//    7   11:putfield        #21  <Field AnnotatedMethod _annotated>
		_setter = methodproperty._setter;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #23  <Field Method _setter>
	//   11   19:putfield        #23  <Field Method _setter>
		_skipNulls = methodproperty._skipNulls;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field boolean _skipNulls>
	//   15   27:putfield        #31  <Field boolean _skipNulls>
	//   16   30:return          
	}

	protected MethodProperty(MethodProperty methodproperty, Method method)
	{
		super(((SettableBeanProperty) (methodproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void SettableBeanProperty(SettableBeanProperty)>
		_annotated = methodproperty._annotated;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #21  <Field AnnotatedMethod _annotated>
	//    6   10:putfield        #21  <Field AnnotatedMethod _annotated>
		_setter = method;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #23  <Field Method _setter>
		_skipNulls = methodproperty._skipNulls;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #31  <Field boolean _skipNulls>
	//   13   23:putfield        #31  <Field boolean _skipNulls>
	//   14   26:return          
	}

	public MethodProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedMethod annotatedmethod)
	{
		super(beanpropertydefinition, javatype, typedeserializer, annotations);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #46  <Method void SettableBeanProperty(BeanPropertyDefinition, JavaType, TypeDeserializer, Annotations)>
		_annotated = annotatedmethod;
	//    6    9:aload_0         
	//    7   10:aload           5
	//    8   12:putfield        #21  <Field AnnotatedMethod _annotated>
		_setter = annotatedmethod.getAnnotated();
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:invokevirtual   #52  <Method Method AnnotatedMethod.getAnnotated()>
	//   12   21:putfield        #23  <Field Method _setter>
		_skipNulls = NullsConstantProvider.isSkipper(_nullProvider);
	//   13   24:aload_0         
	//   14   25:aload_0         
	//   15   26:getfield        #56  <Field NullValueProvider _nullProvider>
	//   16   29:invokestatic    #29  <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//   17   32:putfield        #31  <Field boolean _skipNulls>
	//   18   35:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//*   2    4:invokevirtual   #74  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            32
		{
			if(_skipNulls)
	//*   4   10:aload_0         
	//*   5   11:getfield        #31  <Field boolean _skipNulls>
	//*   6   14:ifeq            18
				return;
	//    7   17:return          
			deserializationcontext = ((DeserializationContext) (_nullProvider.getNullValue(deserializationcontext)));
	//    8   18:aload_0         
	//    9   19:getfield        #56  <Field NullValueProvider _nullProvider>
	//   10   22:aload_2         
	//   11   23:invokeinterface #80  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   12   28:astore_2        
		} else
	//*  13   29:goto            66
		if(_valueTypeDeserializer == null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #84  <Field TypeDeserializer _valueTypeDeserializer>
	//*  16   36:ifnonnull       52
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   17   39:aload_0         
	//   18   40:getfield        #88  <Field JsonDeserializer _valueDeserializer>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #94  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   22   48:astore_2        
		else
	//*  23   49:goto            66
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer)));
	//   24   52:aload_0         
	//   25   53:getfield        #88  <Field JsonDeserializer _valueDeserializer>
	//   26   56:aload_1         
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:getfield        #84  <Field TypeDeserializer _valueTypeDeserializer>
	//   30   62:invokevirtual   #98  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   31   65:astore_2        
		try
		{
			_setter.invoke(obj, new Object[] {
				deserializationcontext
			});
	//   32   66:aload_0         
	//   33   67:getfield        #23  <Field Method _setter>
	//   34   70:aload_3         
	//   35   71:iconst_1        
	//   36   72:anewarray       Object[]
	//   37   75:dup             
	//   38   76:iconst_0        
	//   39   77:aload_2         
	//   40   78:aastore         
	//   41   79:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
	//   42   82:pop             
			return;
	//   43   83:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  44   84:astore_3        
		{
			_throwAsIOE(jsonparser, ((Exception) (obj)), ((Object) (deserializationcontext)));
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:aload_3         
	//   48   88:aload_2         
	//   49   89:invokevirtual   #110 <Method void _throwAsIOE(JsonParser, Exception, Object)>
		}
	//   50   92:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//*   2    4:invokevirtual   #74  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            33
		{
			if(_skipNulls)
	//*   4   10:aload_0         
	//*   5   11:getfield        #31  <Field boolean _skipNulls>
	//*   6   14:ifeq            19
				return obj;
	//    7   17:aload_3         
	//    8   18:areturn         
			deserializationcontext = ((DeserializationContext) (_nullProvider.getNullValue(deserializationcontext)));
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field NullValueProvider _nullProvider>
	//   11   23:aload_2         
	//   12   24:invokeinterface #80  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   13   29:astore_2        
		} else
	//*  14   30:goto            67
		if(_valueTypeDeserializer == null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #84  <Field TypeDeserializer _valueTypeDeserializer>
	//*  17   37:ifnonnull       53
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   18   40:aload_0         
	//   19   41:getfield        #88  <Field JsonDeserializer _valueDeserializer>
	//   20   44:aload_1         
	//   21   45:aload_2         
	//   22   46:invokevirtual   #94  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   23   49:astore_2        
		else
	//*  24   50:goto            67
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer)));
	//   25   53:aload_0         
	//   26   54:getfield        #88  <Field JsonDeserializer _valueDeserializer>
	//   27   57:aload_1         
	//   28   58:aload_2         
	//   29   59:aload_0         
	//   30   60:getfield        #84  <Field TypeDeserializer _valueTypeDeserializer>
	//   31   63:invokevirtual   #98  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   32   66:astore_2        
		Object obj1;
		try
		{
			obj1 = _setter.invoke(obj, new Object[] {
				deserializationcontext
			});
	//   33   67:aload_0         
	//   34   68:getfield        #23  <Field Method _setter>
	//   35   71:aload_3         
	//   36   72:iconst_1        
	//   37   73:anewarray       Object[]
	//   38   76:dup             
	//   39   77:iconst_0        
	//   40   78:aload_2         
	//   41   79:aastore         
	//   42   80:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
	//   43   83:astore          4
		}
	//*  44   85:aload           4
	//*  45   87:astore_1        
	//*  46   88:aload           4
	//*  47   90:ifnonnull       95
	//*  48   93:aload_3         
	//*  49   94:astore_1        
	//*  50   95:aload_1         
	//*  51   96:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  52   97:astore_3        
		{
			_throwAsIOE(jsonparser, ((Exception) (obj)), ((Object) (deserializationcontext)));
	//   53   98:aload_0         
	//   54   99:aload_1         
	//   55  100:aload_3         
	//   56  101:aload_2         
	//   57  102:invokevirtual   #110 <Method void _throwAsIOE(JsonParser, Exception, Object)>
			return ((Object) (null));
	//   58  105:aconst_null     
	//   59  106:areturn         
		}
		jsonparser = ((JsonParser) (obj1));
		if(obj1 == null)
			jsonparser = ((JsonParser) (obj));
		return ((Object) (jsonparser));
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		_annotated.fixAccess(deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedMethod _annotated>
	//    2    4:aload_1         
	//    3    5:getstatic       #121 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    4    8:invokevirtual   #127 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    5   11:invokevirtual   #130 <Method void AnnotatedMethod.fixAccess(boolean)>
	//    6   14:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		AnnotatedMethod annotatedmethod = _annotated;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedMethod _annotated>
	//    2    4:astore_2        
		if(annotatedmethod == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotatedmethod.getAnnotation(class1);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #134 <Method Annotation AnnotatedMethod.getAnnotation(Class)>
	//   10   16:areturn         
	}

	public AnnotatedMember getMember()
	{
		return ((AnnotatedMember) (_annotated));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedMethod _annotated>
	//    2    4:areturn         
	}

	Object readResolve()
	{
		return ((Object) (new MethodProperty(this, _annotated.getAnnotated())));
	//    0    0:new             #2   <Class MethodProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field AnnotatedMethod _annotated>
	//    5    9:invokevirtual   #52  <Method Method AnnotatedMethod.getAnnotated()>
	//    6   12:invokespecial   #141 <Method void MethodProperty(MethodProperty, Method)>
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
	//    1    1:getfield        #23  <Field Method _setter>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
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
	//   16   22:invokevirtual   #146 <Method void _throwAsIOE(Exception, Object)>
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
	//    1    1:getfield        #23  <Field Method _setter>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
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
	//   21   29:invokevirtual   #146 <Method void _throwAsIOE(Exception, Object)>
			return ((Object) (null));
	//   22   32:aconst_null     
	//   23   33:areturn         
		}
		if(obj2 == null)
			return obj;
		else
			return obj2;
	}

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (new MethodProperty(this, propertyname)));
	//    0    0:new             #2   <Class MethodProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #152 <Method void MethodProperty(MethodProperty, PropertyName)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider)
	{
		return ((SettableBeanProperty) (new MethodProperty(this, _valueDeserializer, nullvalueprovider)));
	//    0    0:new             #2   <Class MethodProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field JsonDeserializer _valueDeserializer>
	//    5    9:aload_1         
	//    6   10:invokespecial   #156 <Method void MethodProperty(MethodProperty, JsonDeserializer, NullValueProvider)>
	//    7   13:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		if(_valueDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field JsonDeserializer _valueDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((SettableBeanProperty) (new MethodProperty(this, jsondeserializer, _nullProvider)));
	//    6   10:new             #2   <Class MethodProperty>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #56  <Field NullValueProvider _nullProvider>
	//   12   20:invokespecial   #156 <Method void MethodProperty(MethodProperty, JsonDeserializer, NullValueProvider)>
	//   13   23:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMethod _annotated;
	protected final transient Method _setter;
	protected final boolean _skipNulls;
}
