// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$8 extends TypeAdapter
{

	public Number read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #24  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #30  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #33  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		long l;
		try
		{
			l = jsonreader.nextLong();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #37  <Method long JsonReader.nextLong()>
	//   10   20:lstore_2        
		}
	//*  11   21:lload_2         
	//*  12   22:invokestatic    #43  <Method Long Long.valueOf(long)>
	//*  13   25:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  14   26:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   15   27:new             #45  <Class JsonSyntaxException>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #48  <Method void JsonSyntaxException(Throwable)>
	//   19   35:athrow          
		}
		return ((Number) (Long.valueOf(l)));
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method Number read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Number number)
		throws IOException
	{
		jsonwriter.value(number);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #60  <Method JsonWriter JsonWriter.value(Number)>
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
	//    3    3:checkcast       #63  <Class Number>
	//    4    6:invokevirtual   #65  <Method void write(JsonWriter, Number)>
	//    5    9:return          
	}

	TypeAdapters$8()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
