// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind:
//			DeserializationContext

public abstract class KeyDeserializer
{
	public static abstract class None extends KeyDeserializer
	{

		public None()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void KeyDeserializer()>
		//    2    4:return          
		}
	}


	public KeyDeserializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract Object deserializeKey(String s, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException;
}
