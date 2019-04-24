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

static final class TypeAdapters$14 extends TypeAdapter
{

	public Number read(JsonReader jsonreader)
		throws IOException
	{
		JsonToken jsontoken = jsonreader.peek();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
	//    2    4:astore_2        
		switch(TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[jsontoken.ordinal()])
	//*   3    5:getstatic       #28  <Field int[] TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #34  <Method int JsonToken.ordinal()>
	//*   6   12:iaload          
		{
	//*   7   13:tableswitch     1 4: default 44
	//	               1 53
	//	               2 65
	//	               3 53
	//	               4 47
	//*   8   44:goto            65
		case 4: // '\004'
			jsonreader.nextNull();
	//    9   47:aload_1         
	//   10   48:invokevirtual   #37  <Method void JsonReader.nextNull()>
			return null;
	//   11   51:aconst_null     
	//   12   52:areturn         

		case 1: // '\001'
		case 3: // '\003'
			return ((Number) (new LazilyParsedNumber(jsonreader.nextString())));
	//   13   53:new             #39  <Class LazilyParsedNumber>
	//   14   56:dup             
	//   15   57:aload_1         
	//   16   58:invokevirtual   #43  <Method String JsonReader.nextString()>
	//   17   61:invokespecial   #46  <Method void LazilyParsedNumber(String)>
	//   18   64:areturn         
		}
		throw new JsonSyntaxException((new StringBuilder()).append("Expecting number, got: ").append(((Object) (jsontoken))).toString());
	//   19   65:new             #48  <Class JsonSyntaxException>
	//   20   68:dup             
	//   21   69:new             #50  <Class StringBuilder>
	//   22   72:dup             
	//   23   73:invokespecial   #51  <Method void StringBuilder()>
	//   24   76:ldc1            #53  <String "Expecting number, got: ">
	//   25   78:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   26   81:aload_2         
	//   27   82:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   28   85:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   29   88:invokespecial   #64  <Method void JsonSyntaxException(String)>
	//   30   91:athrow          
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

	TypeAdapters$14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
