// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind:
//			SerializerProvider

public interface JsonSerializable
{
	public static abstract class Base
		implements JsonSerializable
	{

		public boolean isEmpty(SerializerProvider serializerprovider)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Base()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	public abstract void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException;
}
