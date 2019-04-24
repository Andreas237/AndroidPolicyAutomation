// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public class StdDelegatingDeserializer extends StdDeserializer
	implements ContextualDeserializer, ResolvableDeserializer
{

	protected StdDelegatingDeserializer(StdDelegatingDeserializer stddelegatingdeserializer)
	{
		super(((StdDeserializer) (stddelegatingdeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void StdDeserializer(StdDeserializer)>
		_converter = stddelegatingdeserializer._converter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #28  <Field Converter _converter>
	//    6   10:putfield        #28  <Field Converter _converter>
		_delegateType = stddelegatingdeserializer._delegateType;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #30  <Field JavaType _delegateType>
	//   10   18:putfield        #30  <Field JavaType _delegateType>
		_delegateDeserializer = stddelegatingdeserializer._delegateDeserializer;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//   14   26:putfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//   15   29:return          
	}

	public StdDelegatingDeserializer(Converter converter)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <Class Object>
	//    2    3:invokespecial   #41  <Method void StdDeserializer(Class)>
		_converter = converter;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #28  <Field Converter _converter>
		_delegateType = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #30  <Field JavaType _delegateType>
		_delegateDeserializer = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//   12   21:return          
	}

	public StdDelegatingDeserializer(Converter converter, JavaType javatype, JsonDeserializer jsondeserializer)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #46  <Method void StdDeserializer(JavaType)>
		_converter = converter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #28  <Field Converter _converter>
		_delegateType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #30  <Field JavaType _delegateType>
		_delegateDeserializer = jsondeserializer;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//   12   20:return          
	}

	protected Object _handleIncompatibleUpdateValue(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		throw new UnsupportedOperationException(String.format((new StringBuilder()).append("Can not update object of type %s (using deserializer for type %s)").append(obj.getClass().getName()).toString(), new Object[] {
			_delegateType
		}));
	//    0    0:new             #53  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #58  <Method void StringBuilder()>
	//    5   11:ldc1            #60  <String "Can not update object of type %s (using deserializer for type %s)">
	//    6   13:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_3         
	//    8   17:invokevirtual   #68  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #74  <Method String Class.getName()>
	//   10   23:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   12   29:iconst_1        
	//   13   30:anewarray       Object[]
	//   14   33:dup             
	//   15   34:iconst_0        
	//   16   35:aload_0         
	//   17   36:getfield        #30  <Field JavaType _delegateType>
	//   18   39:aastore         
	//   19   40:invokestatic    #83  <Method String String.format(String, Object[])>
	//   20   43:invokespecial   #86  <Method void UnsupportedOperationException(String)>
	//   21   46:athrow          
	}

	protected Object convertValue(Object obj)
	{
		return _converter.convert(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Converter _converter>
	//    2    4:aload_1         
	//    3    5:invokeinterface #94  <Method Object Converter.convert(Object)>
	//    4   10:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(_delegateDeserializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//*   2    4:ifnull          47
		{
			beanproperty = ((BeanProperty) (deserializationcontext.handleSecondaryContextualization(_delegateDeserializer, beanproperty, _delegateType)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field JavaType _delegateType>
	//    9   17:invokevirtual   #105 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   10   20:astore_2        
			deserializationcontext = ((DeserializationContext) (this));
	//   11   21:aload_0         
	//   12   22:astore_1        
			if(beanproperty != _delegateDeserializer)
	//*  13   23:aload_2         
	//*  14   24:aload_0         
	//*  15   25:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//*  16   28:if_acmpeq       45
				deserializationcontext = ((DeserializationContext) (withDelegate(_converter, _delegateType, ((JsonDeserializer) (beanproperty)))));
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #28  <Field Converter _converter>
	//   20   36:aload_0         
	//   21   37:getfield        #30  <Field JavaType _delegateType>
	//   22   40:aload_2         
	//   23   41:invokevirtual   #109 <Method StdDelegatingDeserializer withDelegate(Converter, JavaType, JsonDeserializer)>
	//   24   44:astore_1        
			return ((JsonDeserializer) (deserializationcontext));
	//   25   45:aload_1         
	//   26   46:areturn         
		} else
		{
			JavaType javatype = _converter.getInputType(deserializationcontext.getTypeFactory());
	//   27   47:aload_0         
	//   28   48:getfield        #28  <Field Converter _converter>
	//   29   51:aload_1         
	//   30   52:invokevirtual   #113 <Method com.fasterxml.jackson.databind.type.TypeFactory DeserializationContext.getTypeFactory()>
	//   31   55:invokeinterface #117 <Method JavaType Converter.getInputType(com.fasterxml.jackson.databind.type.TypeFactory)>
	//   32   60:astore_3        
			return ((JsonDeserializer) (withDelegate(_converter, javatype, deserializationcontext.findContextualValueDeserializer(javatype, beanproperty))));
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #28  <Field Converter _converter>
	//   36   66:aload_3         
	//   37   67:aload_1         
	//   38   68:aload_3         
	//   39   69:aload_2         
	//   40   70:invokevirtual   #121 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   41   73:invokevirtual   #109 <Method StdDelegatingDeserializer withDelegate(Converter, JavaType, JsonDeserializer)>
	//   42   76:areturn         
		}
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser = ((JsonParser) (_delegateDeserializer.deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #128 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
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
	//   12   18:invokevirtual   #130 <Method Object convertValue(Object)>
	//   13   21:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(_delegateType.getRawClass().isAssignableFrom(obj.getClass()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field JavaType _delegateType>
	//*   2    4:invokevirtual   #136 <Method Class JavaType.getRawClass()>
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #68  <Method Class Object.getClass()>
	//*   5   11:invokevirtual   #140 <Method boolean Class.isAssignableFrom(Class)>
	//*   6   14:ifeq            28
			return _delegateDeserializer.deserialize(jsonparser, deserializationcontext, obj);
	//    7   17:aload_0         
	//    8   18:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #142 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   13   27:areturn         
		else
			return _handleIncompatibleUpdateValue(jsonparser, deserializationcontext, obj);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #144 <Method Object _handleIncompatibleUpdateValue(JsonParser, DeserializationContext, Object)>
	//   19   35:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		jsonparser = ((JsonParser) (_delegateDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #149 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    6   10:astore_1        
		if(jsonparser == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       17
			return ((Object) (null));
	//    9   15:aconst_null     
	//   10   16:areturn         
		else
			return convertValue(((Object) (jsonparser)));
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:invokevirtual   #130 <Method Object convertValue(Object)>
	//   14   22:areturn         
	}

	public JsonDeserializer getDelegatee()
	{
		return _delegateDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:areturn         
	}

	public Class handledType()
	{
		return _delegateDeserializer.handledType();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:invokevirtual   #155 <Method Class JsonDeserializer.handledType()>
	//    3    7:areturn         
	}

	public void resolve(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(_delegateDeserializer != null && (_delegateDeserializer instanceof ResolvableDeserializer))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//*   5   11:instanceof      #9   <Class ResolvableDeserializer>
	//*   6   14:ifeq            30
			((ResolvableDeserializer)_delegateDeserializer).resolve(deserializationcontext);
	//    7   17:aload_0         
	//    8   18:getfield        #32  <Field JsonDeserializer _delegateDeserializer>
	//    9   21:checkcast       #9   <Class ResolvableDeserializer>
	//   10   24:aload_1         
	//   11   25:invokeinterface #160 <Method void ResolvableDeserializer.resolve(DeserializationContext)>
	//   12   30:return          
	}

	protected StdDelegatingDeserializer withDelegate(Converter converter, JavaType javatype, JsonDeserializer jsondeserializer)
	{
		if(((Object)this).getClass() != com/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #68  <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class StdDelegatingDeserializer>
	//*   3    6:if_acmpeq       47
			throw new IllegalStateException((new StringBuilder()).append("Sub-class ").append(((Object)this).getClass().getName()).append(" must override 'withDelegate'").toString());
	//    4    9:new             #162 <Class IllegalStateException>
	//    5   12:dup             
	//    6   13:new             #55  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #58  <Method void StringBuilder()>
	//    9   20:ldc1            #164 <String "Sub-class ">
	//   10   22:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #68  <Method Class Object.getClass()>
	//   13   29:invokevirtual   #74  <Method String Class.getName()>
	//   14   32:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc1            #166 <String " must override 'withDelegate'">
	//   16   37:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   17   40:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   18   43:invokespecial   #167 <Method void IllegalStateException(String)>
	//   19   46:athrow          
		else
			return new StdDelegatingDeserializer(converter, javatype, jsondeserializer);
	//   20   47:new             #2   <Class StdDelegatingDeserializer>
	//   21   50:dup             
	//   22   51:aload_1         
	//   23   52:aload_2         
	//   24   53:aload_3         
	//   25   54:invokespecial   #169 <Method void StdDelegatingDeserializer(Converter, JavaType, JsonDeserializer)>
	//   26   57:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Converter _converter;
	protected final JsonDeserializer _delegateDeserializer;
	protected final JavaType _delegateType;
}
