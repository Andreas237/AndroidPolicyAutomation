// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.gson:
//			TypeAdapter, Gson

static final class Gson$4 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method AtomicLong read(JsonReader)>
	//    3    5:areturn         
	}

	public AtomicLong read(JsonReader jsonreader)
		throws IOException
	{
		return new AtomicLong(((Number)val$longAdapter.read(jsonreader)).longValue());
	//    0    0:new             #30  <Class AtomicLong>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field TypeAdapter val$longAdapter>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method Object TypeAdapter.read(JsonReader)>
	//    6   12:checkcast       #34  <Class Number>
	//    7   15:invokevirtual   #38  <Method long Number.longValue()>
	//    8   18:invokespecial   #41  <Method void AtomicLong(long)>
	//    9   21:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (AtomicLong)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #30  <Class AtomicLong>
	//    4    6:invokevirtual   #46  <Method void write(JsonWriter, AtomicLong)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, AtomicLong atomiclong)
		throws IOException
	{
		val$longAdapter.write(jsonwriter, ((Object) (Long.valueOf(atomiclong.get()))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TypeAdapter val$longAdapter>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #49  <Method long AtomicLong.get()>
	//    5    9:invokestatic    #55  <Method Long Long.valueOf(long)>
	//    6   12:invokevirtual   #57  <Method void TypeAdapter.write(JsonWriter, Object)>
	//    7   15:return          
	}

	final TypeAdapter val$longAdapter;

	Gson$4(TypeAdapter typeadapter)
	{
		val$longAdapter = typeadapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field TypeAdapter val$longAdapter>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void TypeAdapter()>
	//    5    9:return          
	}
}
