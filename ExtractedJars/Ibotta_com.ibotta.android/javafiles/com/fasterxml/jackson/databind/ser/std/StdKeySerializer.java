// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class StdKeySerializer extends StdSerializer
{

	public StdKeySerializer()
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Class Object>
	//    2    3:invokespecial   #13  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeFieldName(obj.toString());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method String Object.toString()>
	//    3    5:invokevirtual   #28  <Method void JsonGenerator.writeFieldName(String)>
	//    4    8:return          
	}
}
