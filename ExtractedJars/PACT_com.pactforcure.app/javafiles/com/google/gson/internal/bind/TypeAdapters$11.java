// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.*;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$11 extends TypeAdapter
{

	public Number read(JsonReader jsonreader)
		throws IOException
	{
		JsonToken jsontoken = jsonreader.peek();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
	//    2    4:astore_2        
		switch(TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken[jsontoken.ordinal()])
	//*   3    5:getstatic       #28  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #34  <Method int JsonToken.ordinal()>
	//*   6   12:iaload          
		{
	//*   7   13:tableswitch     1 4: default 44
	//	               1 77
	//	               2 44
	//	               3 44
	//	               4 71
		case 2: // '\002'
		case 3: // '\003'
		default:
			throw new JsonSyntaxException((new StringBuilder()).append("Expecting number, got: ").append(((Object) (jsontoken))).toString());
	//    8   44:new             #36  <Class JsonSyntaxException>
	//    9   47:dup             
	//   10   48:new             #38  <Class StringBuilder>
	//   11   51:dup             
	//   12   52:invokespecial   #39  <Method void StringBuilder()>
	//   13   55:ldc1            #41  <String "Expecting number, got: ">
	//   14   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   60:aload_2         
	//   16   61:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   17   64:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   18   67:invokespecial   #55  <Method void JsonSyntaxException(String)>
	//   19   70:athrow          

		case 4: // '\004'
			jsonreader.nextNull();
	//   20   71:aload_1         
	//   21   72:invokevirtual   #58  <Method void JsonReader.nextNull()>
			return null;
	//   22   75:aconst_null     
	//   23   76:areturn         

		case 1: // '\001'
			return ((Number) (new LazilyParsedNumber(jsonreader.nextString())));
	//   24   77:new             #60  <Class LazilyParsedNumber>
	//   25   80:dup             
	//   26   81:aload_1         
	//   27   82:invokevirtual   #63  <Method String JsonReader.nextString()>
	//   28   85:invokespecial   #64  <Method void LazilyParsedNumber(String)>
	//   29   88:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #68  <Method Number read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Number number)
		throws IOException
	{
		jsonwriter.value(number);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #76  <Method JsonWriter JsonWriter.value(Number)>
	//    3    5:pop             
	//    4    6:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #79  <Class Number>
	//    4    6:invokevirtual   #81  <Method void write(JsonWriter, Number)>
	//    5    9:return          
	}

	TypeAdapters$11()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
