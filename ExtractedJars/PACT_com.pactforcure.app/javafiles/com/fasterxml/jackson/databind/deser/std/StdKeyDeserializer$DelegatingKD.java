// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

static final class StdKeyDeserializer$DelegatingKD extends KeyDeserializer
	implements Serializable
{

	public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		Object obj;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
		{
			obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		} else
	//*   4    6:aload_3         
	//*   5    7:areturn         
		{
			Object obj1;
			try
			{
				obj1 = _delegate.deserialize(deserializationcontext.getParser(), deserializationcontext);
	//    6    8:aload_0         
	//    7    9:getfield        #28  <Field JsonDeserializer _delegate>
	//    8   12:aload_2         
	//    9   13:invokevirtual   #45  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//   10   16:aload_2         
	//   11   17:invokevirtual   #51  <Method Object JsonDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, DeserializationContext)>
	//   12   20:astore          4
			}
	//*  13   22:aload           4
	//*  14   24:astore_3        
	//*  15   25:aload           4
	//*  16   27:ifnonnull       6
	//*  17   30:aload_2         
	//*  18   31:aload_0         
	//*  19   32:getfield        #26  <Field Class _keyClass>
	//*  20   35:aload_1         
	//*  21   36:ldc1            #53  <String "not a valid representation">
	//*  22   38:invokevirtual   #57  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//*  23   41:athrow          
			catch(Exception exception)
	//*  24   42:astore_3        
			{
				throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder()).append("not a valid representation: ").append(exception.getMessage()).toString());
	//   25   43:aload_2         
	//   26   44:aload_0         
	//   27   45:getfield        #26  <Field Class _keyClass>
	//   28   48:aload_1         
	//   29   49:new             #59  <Class StringBuilder>
	//   30   52:dup             
	//   31   53:invokespecial   #60  <Method void StringBuilder()>
	//   32   56:ldc1            #62  <String "not a valid representation: ">
	//   33   58:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:aload_3         
	//   35   62:invokevirtual   #70  <Method String Exception.getMessage()>
	//   36   65:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   37   68:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   38   71:invokevirtual   #57  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   39   74:athrow          
			}
			obj = obj1;
			if(obj1 == null)
				throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
		}
		return obj;
	}

	public Class getKeyClass()
	{
		return _keyClass;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Class _keyClass>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JsonDeserializer _delegate;
	protected final Class _keyClass;

	protected StdKeyDeserializer$DelegatingKD(Class class1, JsonDeserializer jsondeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void KeyDeserializer()>
		_keyClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Class _keyClass>
		_delegate = jsondeserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field JsonDeserializer _delegate>
	//    8   14:return          
	}
}
