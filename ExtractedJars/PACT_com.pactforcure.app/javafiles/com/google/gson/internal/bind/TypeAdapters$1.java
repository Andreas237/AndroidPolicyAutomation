// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$1 extends TypeAdapter
{

	public Class read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #28  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #31  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
	//    8   16:new             #33  <Class UnsupportedOperationException>
	//    9   19:dup             
	//   10   20:ldc1            #35  <String "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?">
	//   11   22:invokespecial   #38  <Method void UnsupportedOperationException(String)>
	//   12   25:athrow          
		}
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method Class read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Class class1)
		throws IOException
	{
		if(class1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			throw new UnsupportedOperationException((new StringBuilder()).append("Attempted to serialize java.lang.Class: ").append(class1.getName()).append(". Forgot to register a type adapter?").toString());
	//    6   10:new             #33  <Class UnsupportedOperationException>
	//    7   13:dup             
	//    8   14:new             #52  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #53  <Method void StringBuilder()>
	//   11   21:ldc1            #55  <String "Attempted to serialize java.lang.Class: ">
	//   12   23:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:aload_2         
	//   14   27:invokevirtual   #65  <Method String Class.getName()>
	//   15   30:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:ldc1            #67  <String ". Forgot to register a type adapter?">
	//   17   35:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   19   41:invokespecial   #38  <Method void UnsupportedOperationException(String)>
	//   20   44:athrow          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Class)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #61  <Class Class>
	//    4    6:invokevirtual   #73  <Method void write(JsonWriter, Class)>
	//    5    9:return          
	}

	TypeAdapters$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
