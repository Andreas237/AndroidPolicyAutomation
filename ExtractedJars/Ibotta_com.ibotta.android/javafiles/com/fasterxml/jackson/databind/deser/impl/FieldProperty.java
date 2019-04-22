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
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			NullsConstantProvider

public final class FieldProperty extends SettableBeanProperty
{

	protected FieldProperty(FieldProperty fieldproperty)
	{
		super(((SettableBeanProperty) (fieldproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void SettableBeanProperty(SettableBeanProperty)>
		_annotated = fieldproperty._annotated;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #21  <Field AnnotatedField _annotated>
	//    6   10:putfield        #21  <Field AnnotatedField _annotated>
		Field field = _annotated.getAnnotated();
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field AnnotatedField _annotated>
	//    9   17:invokevirtual   #27  <Method Field AnnotatedField.getAnnotated()>
	//   10   20:astore_2        
		if(field != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          39
		{
			_field = field;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #29  <Field Field _field>
			_skipNulls = fieldproperty._skipNulls;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #31  <Field boolean _skipNulls>
	//   19   35:putfield        #31  <Field boolean _skipNulls>
			return;
	//   20   38:return          
		} else
		{
			throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
	//   21   39:new             #33  <Class IllegalArgumentException>
	//   22   42:dup             
	//   23   43:ldc1            #35  <String "Missing field (broken JDK (de)serialization?)">
	//   24   45:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   25   48:athrow          
		}
	}

	protected FieldProperty(FieldProperty fieldproperty, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider)
	{
		super(((SettableBeanProperty) (fieldproperty)), jsondeserializer, nullvalueprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #43  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer, NullValueProvider)>
		_annotated = fieldproperty._annotated;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #21  <Field AnnotatedField _annotated>
	//    8   12:putfield        #21  <Field AnnotatedField _annotated>
		_field = fieldproperty._field;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #29  <Field Field _field>
	//   12   20:putfield        #29  <Field Field _field>
		_skipNulls = NullsConstantProvider.isSkipper(nullvalueprovider);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokestatic    #49  <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//   16   28:putfield        #31  <Field boolean _skipNulls>
	//   17   31:return          
	}

	protected FieldProperty(FieldProperty fieldproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (fieldproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #55  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_annotated = fieldproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #21  <Field AnnotatedField _annotated>
	//    7   11:putfield        #21  <Field AnnotatedField _annotated>
		_field = fieldproperty._field;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #29  <Field Field _field>
	//   11   19:putfield        #29  <Field Field _field>
		_skipNulls = fieldproperty._skipNulls;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field boolean _skipNulls>
	//   15   27:putfield        #31  <Field boolean _skipNulls>
	//   16   30:return          
	}

	public FieldProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedField annotatedfield)
	{
		super(beanpropertydefinition, javatype, typedeserializer, annotations);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #59  <Method void SettableBeanProperty(BeanPropertyDefinition, JavaType, TypeDeserializer, Annotations)>
		_annotated = annotatedfield;
	//    6    9:aload_0         
	//    7   10:aload           5
	//    8   12:putfield        #21  <Field AnnotatedField _annotated>
		_field = annotatedfield.getAnnotated();
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:invokevirtual   #27  <Method Field AnnotatedField.getAnnotated()>
	//   12   21:putfield        #29  <Field Field _field>
		_skipNulls = NullsConstantProvider.isSkipper(_nullProvider);
	//   13   24:aload_0         
	//   14   25:aload_0         
	//   15   26:getfield        #63  <Field NullValueProvider _nullProvider>
	//   16   29:invokestatic    #49  <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//   17   32:putfield        #31  <Field boolean _skipNulls>
	//   18   35:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #75  <Field JsonToken JsonToken.VALUE_NULL>
	//*   2    4:invokevirtual   #81  <Method boolean JsonParser.hasToken(JsonToken)>
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
	//    9   19:getfield        #63  <Field NullValueProvider _nullProvider>
	//   10   22:aload_2         
	//   11   23:invokeinterface #87  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   12   28:astore_2        
		} else
	//*  13   29:goto            66
		if(_valueTypeDeserializer == null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #91  <Field TypeDeserializer _valueTypeDeserializer>
	//*  16   36:ifnonnull       52
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   17   39:aload_0         
	//   18   40:getfield        #95  <Field JsonDeserializer _valueDeserializer>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #101 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   22   48:astore_2        
		else
	//*  23   49:goto            66
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer)));
	//   24   52:aload_0         
	//   25   53:getfield        #95  <Field JsonDeserializer _valueDeserializer>
	//   26   56:aload_1         
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:getfield        #91  <Field TypeDeserializer _valueTypeDeserializer>
	//   30   62:invokevirtual   #105 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   31   65:astore_2        
		try
		{
			_field.set(obj, ((Object) (deserializationcontext)));
	//   32   66:aload_0         
	//   33   67:getfield        #29  <Field Field _field>
	//   34   70:aload_3         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #111 <Method void Field.set(Object, Object)>
			return;
	//   37   75:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  38   76:astore_3        
		{
			_throwAsIOE(jsonparser, ((Exception) (obj)), ((Object) (deserializationcontext)));
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:aload_3         
	//   42   80:aload_2         
	//   43   81:invokevirtual   #115 <Method void _throwAsIOE(JsonParser, Exception, Object)>
		}
	//   44   84:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #75  <Field JsonToken JsonToken.VALUE_NULL>
	//*   2    4:invokevirtual   #81  <Method boolean JsonParser.hasToken(JsonToken)>
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
	//   10   20:getfield        #63  <Field NullValueProvider _nullProvider>
	//   11   23:aload_2         
	//   12   24:invokeinterface #87  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   13   29:astore_2        
		} else
	//*  14   30:goto            67
		if(_valueTypeDeserializer == null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #91  <Field TypeDeserializer _valueTypeDeserializer>
	//*  17   37:ifnonnull       53
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   18   40:aload_0         
	//   19   41:getfield        #95  <Field JsonDeserializer _valueDeserializer>
	//   20   44:aload_1         
	//   21   45:aload_2         
	//   22   46:invokevirtual   #101 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   23   49:astore_2        
		else
	//*  24   50:goto            67
			deserializationcontext = ((DeserializationContext) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer)));
	//   25   53:aload_0         
	//   26   54:getfield        #95  <Field JsonDeserializer _valueDeserializer>
	//   27   57:aload_1         
	//   28   58:aload_2         
	//   29   59:aload_0         
	//   30   60:getfield        #91  <Field TypeDeserializer _valueTypeDeserializer>
	//   31   63:invokevirtual   #105 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   32   66:astore_2        
		try
		{
			_field.set(obj, ((Object) (deserializationcontext)));
	//   33   67:aload_0         
	//   34   68:getfield        #29  <Field Field _field>
	//   35   71:aload_3         
	//   36   72:aload_2         
	//   37   73:invokevirtual   #111 <Method void Field.set(Object, Object)>
		}
	//*  38   76:aload_3         
	//*  39   77:areturn         
		catch(Exception exception)
	//*  40   78:astore          4
		{
			_throwAsIOE(jsonparser, exception, ((Object) (deserializationcontext)));
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:aload           4
	//   44   84:aload_2         
	//   45   85:invokevirtual   #115 <Method void _throwAsIOE(JsonParser, Exception, Object)>
			return obj;
	//   46   88:aload_3         
	//   47   89:areturn         
		}
		return obj;
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (_field)), deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Field _field>
	//    2    4:aload_1         
	//    3    5:getstatic       #126 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    4    8:invokevirtual   #132 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    5   11:invokestatic    #138 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
	//    6   14:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		AnnotatedField annotatedfield = _annotated;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedField _annotated>
	//    2    4:astore_2        
		if(annotatedfield == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotatedfield.getAnnotation(class1);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #142 <Method Annotation AnnotatedField.getAnnotation(Class)>
	//   10   16:areturn         
	}

	public AnnotatedMember getMember()
	{
		return ((AnnotatedMember) (_annotated));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedField _annotated>
	//    2    4:areturn         
	}

	Object readResolve()
	{
		return ((Object) (new FieldProperty(this)));
	//    0    0:new             #2   <Class FieldProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #149 <Method void FieldProperty(FieldProperty)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		try
		{
			_field.set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Field _field>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #111 <Method void Field.set(Object, Object)>
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
	//   10   14:invokevirtual   #152 <Method void _throwAsIOE(Exception, Object)>
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
	//    1    1:getfield        #29  <Field Field _field>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #111 <Method void Field.set(Object, Object)>
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
	//   11   15:invokevirtual   #152 <Method void _throwAsIOE(Exception, Object)>
			return obj;
	//   12   18:aload_1         
	//   13   19:areturn         
		}
		return obj;
	}

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (new FieldProperty(this, propertyname)));
	//    0    0:new             #2   <Class FieldProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #158 <Method void FieldProperty(FieldProperty, PropertyName)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider)
	{
		return ((SettableBeanProperty) (new FieldProperty(this, _valueDeserializer, nullvalueprovider)));
	//    0    0:new             #2   <Class FieldProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #95  <Field JsonDeserializer _valueDeserializer>
	//    5    9:aload_1         
	//    6   10:invokespecial   #162 <Method void FieldProperty(FieldProperty, JsonDeserializer, NullValueProvider)>
	//    7   13:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		if(_valueDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field JsonDeserializer _valueDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((SettableBeanProperty) (new FieldProperty(this, jsondeserializer, _nullProvider)));
	//    6   10:new             #2   <Class FieldProperty>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #63  <Field NullValueProvider _nullProvider>
	//   12   20:invokespecial   #162 <Method void FieldProperty(FieldProperty, JsonDeserializer, NullValueProvider)>
	//   13   23:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedField _annotated;
	protected final transient Field _field;
	protected final boolean _skipNulls;
}
