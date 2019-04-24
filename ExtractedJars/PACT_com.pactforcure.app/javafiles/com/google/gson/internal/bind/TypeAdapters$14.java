// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;
import java.math.BigDecimal;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$14 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method BigDecimal read(JsonReader)>
	//    3    5:areturn         
	}

	public BigDecimal read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		try
		{
			jsonreader = ((JsonReader) (new BigDecimal(jsonreader.nextString())));
	//    8   16:new             #39  <Class BigDecimal>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokevirtual   #43  <Method String JsonReader.nextString()>
	//   12   24:invokespecial   #46  <Method void BigDecimal(String)>
	//   13   27:astore_1        
		}
	//*  14   28:aload_1         
	//*  15   29:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  16   30:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   17   31:new             #48  <Class JsonSyntaxException>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokespecial   #51  <Method void JsonSyntaxException(Throwable)>
	//   21   39:athrow          
		}
		return ((BigDecimal) (jsonreader));
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (BigDecimal)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #39  <Class BigDecimal>
	//    4    6:invokevirtual   #56  <Method void write(JsonWriter, BigDecimal)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, BigDecimal bigdecimal)
		throws IOException
	{
		jsonwriter.value(((Number) (bigdecimal)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #62  <Method JsonWriter JsonWriter.value(Number)>
	//    3    5:pop             
	//    4    6:return          
	}

	TypeAdapters$14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
