// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

private static final class PropertySerializerMap$TypeAndSerializer
{

	public final JsonSerializer serializer;
	public final Class type;

	public PropertySerializerMap$TypeAndSerializer(Class class1, JsonSerializer jsonserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		type = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Class type>
		serializer = jsonserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field JsonSerializer serializer>
	//    8   14:return          
	}
}
