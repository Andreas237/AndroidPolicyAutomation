// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind:
//			MapperFeature, DeserializationContext, JsonMappingException, DeserializationConfig

public abstract class JsonDeserializer
	implements NullValueProvider
{
	public static abstract class None extends JsonDeserializer
	{

		private None()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #10  <Method void JsonDeserializer()>
		//    2    4:return          
		}
	}


	public JsonDeserializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public abstract Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException;

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(deserializationcontext.isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE))
	//*   0    0:aload_2         
	//*   1    1:getstatic       #28  <Field MapperFeature MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE>
	//*   2    4:invokevirtual   #34  <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*   3    7:ifeq            17
		{
			return deserialize(jsonparser, deserializationcontext);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #36  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    8   16:areturn         
		} else
		{
			jsonparser = ((JsonParser) (new StringBuilder()));
	//    9   17:new             #38  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #39  <Method void StringBuilder()>
	//   12   24:astore_1        
			((StringBuilder) (jsonparser)).append("Cannot update object of type ");
	//   13   25:aload_1         
	//   14   26:ldc1            #41  <String "Cannot update object of type ">
	//   15   28:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			((StringBuilder) (jsonparser)).append(obj.getClass().getName());
	//   17   32:aload_1         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #49  <Method Class Object.getClass()>
	//   20   37:invokevirtual   #55  <Method String Class.getName()>
	//   21   40:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			((StringBuilder) (jsonparser)).append(" (by deserializer of type ");
	//   23   44:aload_1         
	//   24   45:ldc1            #57  <String " (by deserializer of type ">
	//   25   47:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			((StringBuilder) (jsonparser)).append(((Object)this).getClass().getName());
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:invokevirtual   #49  <Method Class Object.getClass()>
	//   30   56:invokevirtual   #55  <Method String Class.getName()>
	//   31   59:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
			((StringBuilder) (jsonparser)).append(")");
	//   33   63:aload_1         
	//   34   64:ldc1            #59  <String ")">
	//   35   66:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
			throw new UnsupportedOperationException(((StringBuilder) (jsonparser)).toString());
	//   37   70:new             #61  <Class UnsupportedOperationException>
	//   38   73:dup             
	//   39   74:aload_1         
	//   40   75:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   41   78:invokespecial   #67  <Method void UnsupportedOperationException(String)>
	//   42   81:athrow          
		}
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #77  <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public SettableBeanProperty findBackReference(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Cannot handle managed/back reference '");
	//    4    8:aload_2         
	//    5    9:ldc1            #81  <String "Cannot handle managed/back reference '">
	//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("': type: value deserializer of type ");
	//   12   21:aload_2         
	//   13   22:ldc1            #83  <String "': type: value deserializer of type ">
	//   14   24:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//   16   28:aload_2         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #49  <Method Class Object.getClass()>
	//   19   33:invokevirtual   #55  <Method String Class.getName()>
	//   20   36:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(" does not support them");
	//   22   40:aload_2         
	//   23   41:ldc1            #85  <String " does not support them">
	//   24   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   26   47:new             #87  <Class IllegalArgumentException>
	//   27   50:dup             
	//   28   51:aload_2         
	//   29   52:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   30   55:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   31   58:athrow          
	}

	public JsonDeserializer getDelegatee()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AccessPattern getEmptyAccessPattern()
	{
		return AccessPattern.DYNAMIC;
	//    0    0:getstatic       #99  <Field AccessPattern AccessPattern.DYNAMIC>
	//    1    3:areturn         
	}

	public Object getEmptyValue()
	{
		return getNullValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method Object getNullValue()>
	//    2    4:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return getNullValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method Object getNullValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public Collection getKnownPropertyNames()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AccessPattern getNullAccessPattern()
	{
		return AccessPattern.CONSTANT;
	//    0    0:getstatic       #118 <Field AccessPattern AccessPattern.CONSTANT>
	//    1    3:areturn         
	}

	public Object getNullValue()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return getNullValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method Object getNullValue()>
	//    2    4:areturn         
	}

	public ObjectIdReader getObjectIdReader()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class handledType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isCachable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JsonDeserializer replaceDelegatee(JsonDeserializer jsondeserializer)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #61  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #129 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}
}
