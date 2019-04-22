// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//			TreeCodec, Versioned, JsonFactory, JsonParser, 
//			JsonGenerator

public abstract class ObjectCodec extends TreeCodec
	implements Versioned
{

	protected ObjectCodec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void TreeCodec()>
	//    2    4:return          
	}

	public JsonFactory getFactory()
	{
		return getJsonFactory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #16  <Method JsonFactory getJsonFactory()>
	//    2    4:areturn         
	}

	public JsonFactory getJsonFactory()
	{
		return getFactory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method JsonFactory getFactory()>
	//    2    4:areturn         
	}

	public abstract Object readValue(JsonParser jsonparser, Class class1)
		throws IOException;

	public abstract void writeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException;
}
