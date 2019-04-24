// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$5 extends TypeAdapter
{

	public Number read(JsonReader jsonreader)
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
		}
		byte byte0;
		try
		{
			byte0 = (byte)jsonreader.nextInt();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #35  <Method int JsonReader.nextInt()>
	//   10   20:int2byte        
	//   11   21:istore_2        
		}
	//*  12   22:iload_2         
	//*  13   23:invokestatic    #41  <Method Byte Byte.valueOf(byte)>
	//*  14   26:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  15   27:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   16   28:new             #43  <Class JsonSyntaxException>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokespecial   #46  <Method void JsonSyntaxException(Throwable)>
	//   20   36:athrow          
		}
		return ((Number) (Byte.valueOf(byte0)));
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #49  <Method Number read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Number number)
	{
		jsonwriter.value(number);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #57  <Method JsonWriter JsonWriter.value(Number)>
	//    3    5:pop             
	//    4    6:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #60  <Class Number>
	//    4    6:invokevirtual   #62  <Method void write(JsonWriter, Number)>
	//    5    9:return          
	}

	TypeAdapters$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
