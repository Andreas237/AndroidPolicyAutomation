// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson.internal.bind:
//			ReflectiveTypeAdapterFactory

static abstract class ReflectiveTypeAdapterFactory$BoundField
{

	abstract void read(JsonReader jsonreader, Object obj);

	abstract void write(JsonWriter jsonwriter, Object obj);

	abstract boolean writeField(Object obj);

	final boolean deserialized;
	final String name;
	final boolean serialized;

	protected ReflectiveTypeAdapterFactory$BoundField(String s, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String name>
		serialized = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean serialized>
		deserialized = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field boolean deserialized>
	//   11   19:return          
	}
}
