// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class FailingDeserializer extends StdDeserializer
{

	public FailingDeserializer(String s)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class Object>
	//    2    3:invokespecial   #18  <Method void StdDeserializer(Class)>
		_message = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #20  <Field String _message>
	//    6   11:return          
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		deserializationcontext.reportInputMismatch(((com.fasterxml.jackson.databind.JsonDeserializer) (this)), _message, new Object[0]);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field String _message>
	//    4    6:iconst_0        
	//    5    7:anewarray       Object[]
	//    6   10:invokevirtual   #31  <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.JsonDeserializer, String, Object[])>
	//    7   13:pop             
		return ((Object) (null));
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final String _message;
}
