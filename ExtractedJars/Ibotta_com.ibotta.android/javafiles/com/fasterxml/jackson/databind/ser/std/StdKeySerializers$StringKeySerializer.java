// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, StdKeySerializers

public static class StdKeySerializers$StringKeySerializer extends StdSerializer
{

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeFieldName((String)obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:checkcast       #12  <Class String>
	//    3    5:invokevirtual   #26  <Method void JsonGenerator.writeFieldName(String)>
	//    4    8:return          
	}

	public StdKeySerializers$StringKeySerializer()
	{
		super(java/lang/String, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Class String>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #15  <Method void StdSerializer(Class, boolean)>
	//    4    7:return          
	}
}
