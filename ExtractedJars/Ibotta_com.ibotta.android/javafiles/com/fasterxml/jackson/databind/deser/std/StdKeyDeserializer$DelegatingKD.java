// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

static final class StdKeyDeserializer$DelegatingKD extends KeyDeserializer
	implements Serializable
{

	public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj = ((Object) (new TokenBuffer(deserializationcontext.getParser(), deserializationcontext)));
	//    4    6:new             #39  <Class TokenBuffer>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokevirtual   #45  <Method JsonParser DeserializationContext.getParser()>
	//    8   14:aload_2         
	//    9   15:invokespecial   #48  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   10   18:astore_3        
		((TokenBuffer) (obj)).writeString(s);
	//   11   19:aload_3         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #52  <Method void TokenBuffer.writeString(String)>
		try
		{
			obj = ((Object) (((TokenBuffer) (obj)).asParser()));
	//   14   24:aload_3         
	//   15   25:invokevirtual   #55  <Method JsonParser TokenBuffer.asParser()>
	//   16   28:astore_3        
			((JsonParser) (obj)).nextToken();
	//   17   29:aload_3         
	//   18   30:invokevirtual   #61  <Method com.fasterxml.jackson.core.JsonToken JsonParser.nextToken()>
	//   19   33:pop             
			obj = _delegate.deserialize(((JsonParser) (obj)), deserializationcontext);
	//   20   34:aload_0         
	//   21   35:getfield        #28  <Field JsonDeserializer _delegate>
	//   22   38:aload_3         
	//   23   39:aload_2         
	//   24   40:invokevirtual   #67  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   25   43:astore_3        
		}
	//*  26   44:aload_3         
	//*  27   45:ifnull          50
	//*  28   48:aload_3         
	//*  29   49:areturn         
	//*  30   50:aload_2         
	//*  31   51:aload_0         
	//*  32   52:getfield        #26  <Field Class _keyClass>
	//*  33   55:aload_1         
	//*  34   56:ldc1            #69  <String "not a valid representation">
	//*  35   58:iconst_0        
	//*  36   59:anewarray       Object[]
	//*  37   62:invokevirtual   #75  <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//*  38   65:astore_3        
	//*  39   66:aload_3         
	//*  40   67:areturn         
		catch(Exception exception)
	//*  41   68:astore_3        
		{
			return deserializationcontext.handleWeirdKey(_keyClass, s, "not a valid representation: %s", new Object[] {
				exception.getMessage()
			});
	//   42   69:aload_2         
	//   43   70:aload_0         
	//   44   71:getfield        #26  <Field Class _keyClass>
	//   45   74:aload_1         
	//   46   75:ldc1            #77  <String "not a valid representation: %s">
	//   47   77:iconst_1        
	//   48   78:anewarray       Object[]
	//   49   81:dup             
	//   50   82:iconst_0        
	//   51   83:aload_3         
	//   52   84:invokevirtual   #81  <Method String Exception.getMessage()>
	//   53   87:aastore         
	//   54   88:invokevirtual   #75  <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//   55   91:areturn         
		}
		if(obj != null)
			return obj;
		obj = deserializationcontext.handleWeirdKey(_keyClass, s, "not a valid representation", new Object[0]);
		return obj;
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
