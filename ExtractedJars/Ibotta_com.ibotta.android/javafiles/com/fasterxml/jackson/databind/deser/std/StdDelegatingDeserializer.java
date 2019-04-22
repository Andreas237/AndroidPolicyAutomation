// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public class StdDelegatingDeserializer extends StdDeserializer
	implements ContextualDeserializer, ResolvableDeserializer
{

	public StdDelegatingDeserializer(Converter converter)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Class Object>
	//    2    3:invokespecial   #28  <Method void StdDeserializer(Class)>
		_converter = converter;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #30  <Field Converter _converter>
		_delegateType = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #32  <Field JavaType _delegateType>
		_delegateDeserializer = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//   12   21:return          
	}

	public StdDelegatingDeserializer(Converter converter, JavaType javatype, JsonDeserializer jsondeserializer)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #41  <Method void StdDeserializer(JavaType)>
		_converter = converter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #30  <Field Converter _converter>
		_delegateType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #32  <Field JavaType _delegateType>
		_delegateDeserializer = jsondeserializer;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//   12   20:return          
	}

	protected Object _handleIncompatibleUpdateValue(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		jsonparser = ((JsonParser) (new StringBuilder()));
	//    0    0:new             #48  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (jsonparser)).append("Cannot update object of type %s (using deserializer for type %s)");
	//    4    8:aload_1         
	//    5    9:ldc1            #53  <String "Cannot update object of type %s (using deserializer for type %s)">
	//    6   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (jsonparser)).append(obj.getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_3         
	//   10   17:invokevirtual   #61  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #67  <Method String Class.getName()>
	//   12   23:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(String.format(((StringBuilder) (jsonparser)).toString(), new Object[] {
			_delegateType
		}));
	//   14   27:new             #69  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   18   35:iconst_1        
	//   19   36:anewarray       Object[]
	//   20   39:dup             
	//   21   40:iconst_0        
	//   22   41:aload_0         
	//   23   42:getfield        #32  <Field JavaType _delegateType>
	//   24   45:aastore         
	//   25   46:invokestatic    #78  <Method String String.format(String, Object[])>
	//   26   49:invokespecial   #81  <Method void UnsupportedOperationException(String)>
	//   27   52:athrow          
	}

	protected Object convertValue(Object obj)
	{
		return _converter.convert(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Converter _converter>
	//    2    4:aload_1         
	//    3    5:invokeinterface #89  <Method Object Converter.convert(Object)>
	//    4   10:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = _delegateDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:astore_3        
		if(jsondeserializer != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          44
		{
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, _delegateType)));
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #32  <Field JavaType _delegateType>
	//   10   16:invokevirtual   #100 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   11   19:astore_1        
			if(deserializationcontext != _delegateDeserializer)
	//*  12   20:aload_1         
	//*  13   21:aload_0         
	//*  14   22:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//*  15   25:if_acmpeq       42
				return ((JsonDeserializer) (withDelegate(_converter, _delegateType, ((JsonDeserializer) (deserializationcontext)))));
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #30  <Field Converter _converter>
	//   19   33:aload_0         
	//   20   34:getfield        #32  <Field JavaType _delegateType>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #104 <Method StdDelegatingDeserializer withDelegate(Converter, JavaType, JsonDeserializer)>
	//   23   41:areturn         
			else
				return ((JsonDeserializer) (this));
	//   24   42:aload_0         
	//   25   43:areturn         
		} else
		{
			JavaType javatype = _converter.getInputType(deserializationcontext.getTypeFactory());
	//   26   44:aload_0         
	//   27   45:getfield        #30  <Field Converter _converter>
	//   28   48:aload_1         
	//   29   49:invokevirtual   #108 <Method com.fasterxml.jackson.databind.type.TypeFactory DeserializationContext.getTypeFactory()>
	//   30   52:invokeinterface #112 <Method JavaType Converter.getInputType(com.fasterxml.jackson.databind.type.TypeFactory)>
	//   31   57:astore_3        
			return ((JsonDeserializer) (withDelegate(_converter, javatype, deserializationcontext.findContextualValueDeserializer(javatype, beanproperty))));
	//   32   58:aload_0         
	//   33   59:aload_0         
	//   34   60:getfield        #30  <Field Converter _converter>
	//   35   63:aload_3         
	//   36   64:aload_1         
	//   37   65:aload_3         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #116 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   40   70:invokevirtual   #104 <Method StdDelegatingDeserializer withDelegate(Converter, JavaType, JsonDeserializer)>
	//   41   73:areturn         
		}
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser = ((JsonParser) (_delegateDeserializer.deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #123 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    5    9:astore_1        
		if(jsonparser == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			return ((Object) (null));
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return convertValue(((Object) (jsonparser)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #125 <Method Object convertValue(Object)>
	//   13   21:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(_delegateType.getRawClass().isAssignableFrom(obj.getClass()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field JavaType _delegateType>
	//*   2    4:invokevirtual   #131 <Method Class JavaType.getRawClass()>
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #61  <Method Class Object.getClass()>
	//*   5   11:invokevirtual   #135 <Method boolean Class.isAssignableFrom(Class)>
	//*   6   14:ifeq            28
			return _delegateDeserializer.deserialize(jsonparser, deserializationcontext, obj);
	//    7   17:aload_0         
	//    8   18:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #137 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   13   27:areturn         
		else
			return _handleIncompatibleUpdateValue(jsonparser, deserializationcontext, obj);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #139 <Method Object _handleIncompatibleUpdateValue(JsonParser, DeserializationContext, Object)>
	//   19   35:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		jsonparser = ((JsonParser) (_delegateDeserializer.deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #123 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    5    9:astore_1        
		if(jsonparser == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			return ((Object) (null));
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return convertValue(((Object) (jsonparser)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #125 <Method Object convertValue(Object)>
	//   13   21:areturn         
	}

	public JsonDeserializer getDelegatee()
	{
		return _delegateDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:areturn         
	}

	public Class handledType()
	{
		return _delegateDeserializer.handledType();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:invokevirtual   #148 <Method Class JsonDeserializer.handledType()>
	//    3    7:areturn         
	}

	public void resolve(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = _delegateDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:astore_2        
		if(jsondeserializer != null && (jsondeserializer instanceof ResolvableDeserializer))
	//*   3    5:aload_2         
	//*   4    6:ifnull          26
	//*   5    9:aload_2         
	//*   6   10:instanceof      #9   <Class ResolvableDeserializer>
	//*   7   13:ifeq            26
			((ResolvableDeserializer)jsondeserializer).resolve(deserializationcontext);
	//    8   16:aload_2         
	//    9   17:checkcast       #9   <Class ResolvableDeserializer>
	//   10   20:aload_1         
	//   11   21:invokeinterface #153 <Method void ResolvableDeserializer.resolve(DeserializationContext)>
	//   12   26:return          
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return _delegateDeserializer.supportsUpdate(deserializationconfig);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #157 <Method Boolean JsonDeserializer.supportsUpdate(DeserializationConfig)>
	//    4    8:areturn         
	}

	protected StdDelegatingDeserializer withDelegate(Converter converter, JavaType javatype, JsonDeserializer jsondeserializer)
	{
		ClassUtil.verifyMustOverride(com/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer, ((Object) (this)), "withDelegate");
	//    0    0:ldc1            #2   <Class StdDelegatingDeserializer>
	//    1    2:aload_0         
	//    2    3:ldc1            #158 <String "withDelegate">
	//    3    5:invokestatic    #164 <Method void ClassUtil.verifyMustOverride(Class, Object, String)>
		return new StdDelegatingDeserializer(converter, javatype, jsondeserializer);
	//    4    8:new             #2   <Class StdDelegatingDeserializer>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokespecial   #166 <Method void StdDelegatingDeserializer(Converter, JavaType, JsonDeserializer)>
	//   10   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Converter _converter;
	protected final JsonDeserializer _delegateDeserializer;
	protected final JavaType _delegateType;
}
