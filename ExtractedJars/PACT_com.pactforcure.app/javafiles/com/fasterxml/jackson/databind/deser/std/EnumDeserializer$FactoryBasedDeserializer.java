// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer, EnumDeserializer

protected static class EnumDeserializer$FactoryBasedDeserializer extends StdDeserializer
	implements ContextualDeserializer
{

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		EnumDeserializer$FactoryBasedDeserializer enumdeserializer$factorybaseddeserializer = this;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(_deser == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #36  <Field JsonDeserializer _deser>
	//*   4    6:ifnonnull       42
		{
			enumdeserializer$factorybaseddeserializer = this;
	//    5    9:aload_0         
	//    6   10:astore_3        
			if(_inputType != java/lang/String)
	//*   7   11:aload_0         
	//*   8   12:getfield        #32  <Field Class _inputType>
	//*   9   15:ldc1            #53  <Class String>
	//*  10   17:if_acmpeq       42
				enumdeserializer$factorybaseddeserializer = new EnumDeserializer$FactoryBasedDeserializer(this, deserializationcontext.findContextualValueDeserializer(deserializationcontext.constructType(_inputType), beanproperty));
	//   11   20:new             #2   <Class EnumDeserializer$FactoryBasedDeserializer>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:aload_1         
	//   16   27:aload_0         
	//   17   28:getfield        #32  <Field Class _inputType>
	//   18   31:invokevirtual   #59  <Method com.fasterxml.jackson.databind.JavaType DeserializationContext.constructType(Class)>
	//   19   34:aload_2         
	//   20   35:invokevirtual   #63  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, BeanProperty)>
	//   21   38:invokespecial   #65  <Method void EnumDeserializer$FactoryBasedDeserializer(EnumDeserializer$FactoryBasedDeserializer, JsonDeserializer)>
	//   22   41:astore_3        
		}
		return ((JsonDeserializer) (enumdeserializer$factorybaseddeserializer));
	//   23   42:aload_3         
	//   24   43:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_deser != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field JsonDeserializer _deser>
	//*   2    4:ifnull          39
		{
			jsonparser = ((JsonParser) (_deser.deserialize(jsonparser, deserializationcontext)));
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field JsonDeserializer _deser>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #77  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    8   16:astore_1        
		} else
	//*   9   17:aload_0         
	//*  10   18:getfield        #34  <Field Method _factory>
	//*  11   21:aload_0         
	//*  12   22:getfield        #27  <Field Class _valueClass>
	//*  13   25:iconst_1        
	//*  14   26:anewarray       Object[]
	//*  15   29:dup             
	//*  16   30:iconst_0        
	//*  17   31:aload_1         
	//*  18   32:aastore         
	//*  19   33:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
	//*  20   36:astore_1        
	//*  21   37:aload_1         
	//*  22   38:areturn         
		{
			JsonToken jsontoken = jsonparser.getCurrentToken();
	//   23   39:aload_1         
	//   24   40:invokevirtual   #91  <Method JsonToken JsonParser.getCurrentToken()>
	//   25   43:astore_3        
			if(jsontoken == JsonToken.VALUE_STRING || jsontoken == JsonToken.FIELD_NAME)
	//*  26   44:aload_3         
	//*  27   45:getstatic       #97  <Field JsonToken JsonToken.VALUE_STRING>
	//*  28   48:if_acmpeq       58
	//*  29   51:aload_3         
	//*  30   52:getstatic       #100 <Field JsonToken JsonToken.FIELD_NAME>
	//*  31   55:if_acmpne       66
				jsonparser = ((JsonParser) (jsonparser.getText()));
	//   32   58:aload_1         
	//   33   59:invokevirtual   #104 <Method String JsonParser.getText()>
	//   34   62:astore_1        
			else
	//*  35   63:goto            17
				jsonparser = ((JsonParser) (jsonparser.getValueAsString()));
	//   36   66:aload_1         
	//   37   67:invokevirtual   #107 <Method String JsonParser.getValueAsString()>
	//   38   70:astore_1        
		}
		try
		{
			jsonparser = ((JsonParser) (_factory.invoke(((Object) (_valueClass)), new Object[] {
				jsonparser
			})));
		}
	//*  39   71:goto            17
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  40   74:astore_1        
		{
			jsonparser = ((JsonParser) (ClassUtil.getRootCause(((Throwable) (jsonparser)))));
	//   41   75:aload_1         
	//   42   76:invokestatic    #113 <Method Throwable ClassUtil.getRootCause(Throwable)>
	//   43   79:astore_1        
			if(jsonparser instanceof IOException)
	//*  44   80:aload_1         
	//*  45   81:instanceof      #71  <Class IOException>
	//*  46   84:ifeq            92
				throw (IOException)jsonparser;
	//   47   87:aload_1         
	//   48   88:checkcast       #71  <Class IOException>
	//   49   91:athrow          
			else
				throw deserializationcontext.instantiationException(_valueClass, ((Throwable) (jsonparser)));
	//   50   92:aload_2         
	//   51   93:aload_0         
	//   52   94:getfield        #27  <Field Class _valueClass>
	//   53   97:aload_1         
	//   54   98:invokevirtual   #117 <Method JsonMappingException DeserializationContext.instantiationException(Class, Throwable)>
	//   55  101:athrow          
		}
		return ((Object) (jsonparser));
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		if(_deser == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field JsonDeserializer _deser>
	//*   2    4:ifnonnull       14
			return deserialize(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #120 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		else
			return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #125 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   12   20:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JsonDeserializer _deser;
	protected final Method _factory;
	protected final Class _inputType;

	protected EnumDeserializer$FactoryBasedDeserializer(EnumDeserializer$FactoryBasedDeserializer enumdeserializer$factorybaseddeserializer, JsonDeserializer jsondeserializer)
	{
		super(enumdeserializer$factorybaseddeserializer._valueClass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #27  <Field Class _valueClass>
	//    3    5:invokespecial   #30  <Method void StdDeserializer(Class)>
		_inputType = enumdeserializer$factorybaseddeserializer._inputType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #32  <Field Class _inputType>
	//    7   13:putfield        #32  <Field Class _inputType>
		_factory = enumdeserializer$factorybaseddeserializer._factory;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #34  <Field Method _factory>
	//   11   21:putfield        #34  <Field Method _factory>
		_deser = jsondeserializer;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #36  <Field JsonDeserializer _deser>
	//   15   29:return          
	}

	public EnumDeserializer$FactoryBasedDeserializer(Class class1, AnnotatedMethod annotatedmethod, Class class2)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void StdDeserializer(Class)>
		_factory = annotatedmethod.getAnnotated();
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #46  <Method Method AnnotatedMethod.getAnnotated()>
	//    6   10:putfield        #34  <Field Method _factory>
		_inputType = class2;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #32  <Field Class _inputType>
		_deser = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #36  <Field JsonDeserializer _deser>
	//   13   23:return          
	}
}
