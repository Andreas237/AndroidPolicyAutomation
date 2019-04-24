// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.*;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$11 extends TypeAdapter
{

	public Number read(JsonReader jsonreader)
	{
		JsonToken jsontoken = jsonreader.peek();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
	//    2    4:astore_3        
		int i = TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken[jsontoken.ordinal()];
	//    3    5:getstatic       #26  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
	//    4    8:aload_3         
	//    5    9:invokevirtual   #32  <Method int JsonToken.ordinal()>
	//    6   12:iaload          
	//    7   13:istore_2        
		if(i != 1)
	//*   8   14:iload_2         
	//*   9   15:iconst_1        
	//*  10   16:icmpeq          63
		{
			if(i != 4)
	//*  11   19:iload_2         
	//*  12   20:iconst_4        
	//*  13   21:icmpeq          57
			{
				jsonreader = ((JsonReader) (new StringBuilder()));
	//   14   24:new             #34  <Class StringBuilder>
	//   15   27:dup             
	//   16   28:invokespecial   #35  <Method void StringBuilder()>
	//   17   31:astore_1        
				((StringBuilder) (jsonreader)).append("Expecting number, got: ");
	//   18   32:aload_1         
	//   19   33:ldc1            #37  <String "Expecting number, got: ">
	//   20   35:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
				((StringBuilder) (jsonreader)).append(((Object) (jsontoken)));
	//   22   39:aload_1         
	//   23   40:aload_3         
	//   24   41:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   25   44:pop             
				throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
	//   26   45:new             #46  <Class JsonSyntaxException>
	//   27   48:dup             
	//   28   49:aload_1         
	//   29   50:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   30   53:invokespecial   #53  <Method void JsonSyntaxException(String)>
	//   31   56:athrow          
			} else
			{
				jsonreader.nextNull();
	//   32   57:aload_1         
	//   33   58:invokevirtual   #56  <Method void JsonReader.nextNull()>
				return null;
	//   34   61:aconst_null     
	//   35   62:areturn         
			}
		} else
		{
			return ((Number) (new LazilyParsedNumber(jsonreader.nextString())));
	//   36   63:new             #58  <Class LazilyParsedNumber>
	//   37   66:dup             
	//   38   67:aload_1         
	//   39   68:invokevirtual   #61  <Method String JsonReader.nextString()>
	//   40   71:invokespecial   #62  <Method void LazilyParsedNumber(String)>
	//   41   74:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method Number read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Number number)
	{
		jsonwriter.value(number);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #73  <Method JsonWriter JsonWriter.value(Number)>
	//    3    5:pop             
	//    4    6:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #76  <Class Number>
	//    4    6:invokevirtual   #78  <Method void write(JsonWriter, Number)>
	//    5    9:return          
	}

	TypeAdapters$11()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
