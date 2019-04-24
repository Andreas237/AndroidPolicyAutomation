// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$9 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method AtomicBoolean read(JsonReader)>
	//    3    5:areturn         
	}

	public AtomicBoolean read(JsonReader jsonreader)
		throws IOException
	{
		return new AtomicBoolean(jsonreader.nextBoolean());
	//    0    0:new             #22  <Class AtomicBoolean>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method boolean JsonReader.nextBoolean()>
	//    4    8:invokespecial   #31  <Method void AtomicBoolean(boolean)>
	//    5   11:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (AtomicBoolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #22  <Class AtomicBoolean>
	//    4    6:invokevirtual   #36  <Method void write(JsonWriter, AtomicBoolean)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, AtomicBoolean atomicboolean)
		throws IOException
	{
		jsonwriter.value(atomicboolean.get());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #39  <Method boolean AtomicBoolean.get()>
	//    3    5:invokevirtual   #45  <Method JsonWriter JsonWriter.value(boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	TypeAdapters$9()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
