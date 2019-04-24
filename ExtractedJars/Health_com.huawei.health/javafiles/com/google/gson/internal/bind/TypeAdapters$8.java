// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$8 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method AtomicInteger read(JsonReader)>
	//    3    5:areturn         
	}

	public AtomicInteger read(JsonReader jsonreader)
		throws IOException
	{
		try
		{
			jsonreader = ((JsonReader) (new AtomicInteger(jsonreader.nextInt())));
	//    0    0:new             #24  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method int JsonReader.nextInt()>
	//    4    8:invokespecial   #33  <Method void AtomicInteger(int)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*   8   14:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//    9   15:new             #35  <Class JsonSyntaxException>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #38  <Method void JsonSyntaxException(Throwable)>
	//   13   23:athrow          
		}
		return ((AtomicInteger) (jsonreader));
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (AtomicInteger)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #24  <Class AtomicInteger>
	//    4    6:invokevirtual   #43  <Method void write(JsonWriter, AtomicInteger)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, AtomicInteger atomicinteger)
		throws IOException
	{
		jsonwriter.value(atomicinteger.get());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #46  <Method int AtomicInteger.get()>
	//    3    5:i2l             
	//    4    6:invokevirtual   #52  <Method JsonWriter JsonWriter.value(long)>
	//    5    9:pop             
	//    6   10:return          
	}

	TypeAdapters$8()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
