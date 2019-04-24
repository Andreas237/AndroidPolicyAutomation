// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$1 extends TypeAdapter
{

	public Class read(JsonReader jsonreader)
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
	//    8   16:new             #31  <Class UnsupportedOperationException>
	//    9   19:dup             
	//   10   20:ldc1            #33  <String "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?">
	//   11   22:invokespecial   #36  <Method void UnsupportedOperationException(String)>
	//   12   25:athrow          
		}
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method Class read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Class class1)
	{
		if(class1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #47  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			jsonwriter = ((JsonWriter) (new StringBuilder()));
	//    6   10:new             #49  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #50  <Method void StringBuilder()>
	//    9   17:astore_1        
			((StringBuilder) (jsonwriter)).append("Attempted to serialize java.lang.Class: ");
	//   10   18:aload_1         
	//   11   19:ldc1            #52  <String "Attempted to serialize java.lang.Class: ">
	//   12   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			((StringBuilder) (jsonwriter)).append(class1.getName());
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #62  <Method String Class.getName()>
	//   17   30:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			((StringBuilder) (jsonwriter)).append(". Forgot to register a type adapter?");
	//   19   34:aload_1         
	//   20   35:ldc1            #64  <String ". Forgot to register a type adapter?">
	//   21   37:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new UnsupportedOperationException(((StringBuilder) (jsonwriter)).toString());
	//   23   41:new             #31  <Class UnsupportedOperationException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #36  <Method void UnsupportedOperationException(String)>
	//   28   52:athrow          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Class)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #58  <Class Class>
	//    4    6:invokevirtual   #70  <Method void write(JsonWriter, Class)>
	//    5    9:return          
	}

	TypeAdapters$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
