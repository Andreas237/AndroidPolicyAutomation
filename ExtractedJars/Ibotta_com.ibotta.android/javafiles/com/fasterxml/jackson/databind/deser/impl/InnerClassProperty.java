// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
{

	protected InnerClassProperty(SettableBeanProperty settablebeanproperty, AnnotatedConstructor annotatedconstructor)
	{
		super(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating(SettableBeanProperty)>
		_annotated = annotatedconstructor;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field AnnotatedConstructor _annotated>
		settablebeanproperty = ((SettableBeanProperty) (_annotated));
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AnnotatedConstructor _annotated>
	//    8   14:astore_1        
		if(settablebeanproperty == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       24
			settablebeanproperty = null;
	//   11   19:aconst_null     
	//   12   20:astore_1        
		else
	//*  13   21:goto            29
			settablebeanproperty = ((SettableBeanProperty) (((AnnotatedConstructor) (settablebeanproperty)).getAnnotated()));
	//   14   24:aload_1         
	//   15   25:invokevirtual   #26  <Method Constructor AnnotatedConstructor.getAnnotated()>
	//   16   28:astore_1        
		_creator = ((Constructor) (settablebeanproperty));
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #28  <Field Constructor _creator>
		if(_creator != null)
	//*  20   34:aload_0         
	//*  21   35:getfield        #28  <Field Constructor _creator>
	//*  22   38:ifnull          42
			return;
	//   23   41:return          
		else
			throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
	//   24   42:new             #30  <Class IllegalArgumentException>
	//   25   45:dup             
	//   26   46:ldc1            #32  <String "Missing constructor (broken JDK (de)serialization?)">
	//   27   48:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   28   51:athrow          
	}

	public InnerClassProperty(SettableBeanProperty settablebeanproperty, Constructor constructor)
	{
		super(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating(SettableBeanProperty)>
		_creator = constructor;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field Constructor _creator>
	//    6   10:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #51  <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #57  <Field JsonToken JsonToken.VALUE_NULL>
	//*   3    7:if_acmpne       22
			jsonparser = ((JsonParser) (_valueDeserializer.getNullValue(deserializationcontext)));
	//    4   10:aload_0         
	//    5   11:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #67  <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//    8   18:astore_1        
		else
	//*   9   19:goto            121
		if(_valueTypeDeserializer != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #71  <Field com.fasterxml.jackson.databind.jsontype.TypeDeserializer _valueTypeDeserializer>
	//*  12   26:ifnull          46
		{
			jsonparser = ((JsonParser) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer)));
	//   13   29:aload_0         
	//   14   30:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:getfield        #71  <Field com.fasterxml.jackson.databind.jsontype.TypeDeserializer _valueTypeDeserializer>
	//   19   39:invokevirtual   #75  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)>
	//   20   42:astore_1        
		} else
	//*  21   43:goto            121
		{
			Object obj1;
			try
			{
				obj1 = _creator.newInstance(new Object[] {
					obj
				});
	//   22   46:aload_0         
	//   23   47:getfield        #28  <Field Constructor _creator>
	//   24   50:iconst_1        
	//   25   51:anewarray       Object[]
	//   26   54:dup             
	//   27   55:iconst_0        
	//   28   56:aload_3         
	//   29   57:aastore         
	//   30   58:invokevirtual   #83  <Method Object Constructor.newInstance(Object[])>
	//   31   61:astore          4
			}
	//*  32   63:goto            106
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//*  33   66:astore          4
			{
				ClassUtil.unwrapAndThrowAsIAE(((Throwable) (obj1)), String.format("Failed to instantiate class %s, problem: %s", new Object[] {
					_creator.getDeclaringClass().getName(), ((Exception) (obj1)).getMessage()
				}));
	//   34   68:aload           4
	//   35   70:ldc1            #85  <String "Failed to instantiate class %s, problem: %s">
	//   36   72:iconst_2        
	//   37   73:anewarray       Object[]
	//   38   76:dup             
	//   39   77:iconst_0        
	//   40   78:aload_0         
	//   41   79:getfield        #28  <Field Constructor _creator>
	//   42   82:invokevirtual   #89  <Method Class Constructor.getDeclaringClass()>
	//   43   85:invokevirtual   #95  <Method String Class.getName()>
	//   44   88:aastore         
	//   45   89:dup             
	//   46   90:iconst_1        
	//   47   91:aload           4
	//   48   93:invokevirtual   #98  <Method String Exception.getMessage()>
	//   49   96:aastore         
	//   50   97:invokestatic    #104 <Method String String.format(String, Object[])>
	//   51  100:invokestatic    #110 <Method void ClassUtil.unwrapAndThrowAsIAE(Throwable, String)>
				obj1 = null;
	//   52  103:aconst_null     
	//   53  104:astore          4
			}
			_valueDeserializer.deserialize(jsonparser, deserializationcontext, obj1);
	//   54  106:aload_0         
	//   55  107:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//   56  110:aload_1         
	//   57  111:aload_2         
	//   58  112:aload           4
	//   59  114:invokevirtual   #114 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   60  117:pop             
			jsonparser = ((JsonParser) (obj1));
	//   61  118:aload           4
	//   62  120:astore_1        
		}
		set(obj, ((Object) (jsonparser)));
	//   63  121:aload_0         
	//   64  122:aload_3         
	//   65  123:aload_1         
	//   66  124:invokevirtual   #118 <Method void set(Object, Object)>
	//   67  127:return          
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
	//    5    5:invokevirtual   #123 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    6    8:invokevirtual   #127 <Method Object setAndReturn(Object, Object)>
	//    7   11:areturn         
	}

	Object readResolve()
	{
		return ((Object) (new InnerClassProperty(((SettableBeanProperty) (this)), _annotated)));
	//    0    0:new             #2   <Class InnerClassProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field AnnotatedConstructor _annotated>
	//    5    9:invokespecial   #131 <Method void InnerClassProperty(SettableBeanProperty, AnnotatedConstructor)>
	//    6   12:areturn         
	}

	protected SettableBeanProperty withDelegate(SettableBeanProperty settablebeanproperty)
	{
		if(settablebeanproperty == _flddelegate)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #137 <Field SettableBeanProperty _flddelegate>
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((SettableBeanProperty) (new InnerClassProperty(settablebeanproperty, _creator)));
	//    6   10:new             #2   <Class InnerClassProperty>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field Constructor _creator>
	//   11   19:invokespecial   #139 <Method void InnerClassProperty(SettableBeanProperty, Constructor)>
	//   12   22:areturn         
	}

	Object writeReplace()
	{
		if(_annotated == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field AnnotatedConstructor _annotated>
	//*   2    4:ifnonnull       30
			return ((Object) (new InnerClassProperty(((SettableBeanProperty) (this)), new AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext) (null)), _creator, ((com.fasterxml.jackson.databind.introspect.AnnotationMap) (null)), ((com.fasterxml.jackson.databind.introspect.AnnotationMap []) (null))))));
	//    3    7:new             #2   <Class InnerClassProperty>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:new             #22  <Class AnnotatedConstructor>
	//    7   15:dup             
	//    8   16:aconst_null     
	//    9   17:aload_0         
	//   10   18:getfield        #28  <Field Constructor _creator>
	//   11   21:aconst_null     
	//   12   22:aconst_null     
	//   13   23:invokespecial   #143 <Method void AnnotatedConstructor(com.fasterxml.jackson.databind.introspect.TypeResolutionContext, Constructor, com.fasterxml.jackson.databind.introspect.AnnotationMap, com.fasterxml.jackson.databind.introspect.AnnotationMap[])>
	//   14   26:invokespecial   #131 <Method void InnerClassProperty(SettableBeanProperty, AnnotatedConstructor)>
	//   15   29:areturn         
		else
			return ((Object) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected AnnotatedConstructor _annotated;
	protected final transient Constructor _creator;
}
