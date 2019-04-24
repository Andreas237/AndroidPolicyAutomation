// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$1 extends TypeAdapter
{

	public Class read(JsonReader jsonreader)
		throws IOException
	{
		throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
	//    0    0:new             #18  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?">
	//    3    6:invokespecial   #23  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method Class read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Class class1)
		throws IOException
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Attempted to serialize java.lang.Class: ").append(class1.getName()).append(". Forgot to register a type adapter?").toString());
	//    0    0:new             #18  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #31  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #32  <Method void StringBuilder()>
	//    5   11:ldc1            #34  <String "Attempted to serialize java.lang.Class: ">
	//    6   13:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_2         
	//    8   17:invokevirtual   #44  <Method String Class.getName()>
	//    9   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #46  <String ". Forgot to register a type adapter?">
	//   11   25:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   13   31:invokespecial   #23  <Method void UnsupportedOperationException(String)>
	//   14   34:athrow          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Class)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #40  <Class Class>
	//    4    6:invokevirtual   #52  <Method void write(JsonWriter, Class)>
	//    5    9:return          
	}

	TypeAdapters$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
