// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//			TypeAdapter, Gson

static final class Gson$3 extends TypeAdapter
{

	public Number read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #31  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #34  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return ((Number) (Long.valueOf(jsonreader.nextLong())));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #38  <Method long JsonReader.nextLong()>
	//   10   20:invokestatic    #44  <Method Long Long.valueOf(long)>
	//   11   23:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method Number read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Number number)
		throws IOException
	{
		if(number == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			jsonwriter.value(((Object) (number)).toString());
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #62  <Method String Object.toString()>
	//    9   15:invokevirtual   #66  <Method JsonWriter JsonWriter.value(String)>
	//   10   18:pop             
			return;
	//   11   19:return          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #69  <Class Number>
	//    4    6:invokevirtual   #71  <Method void write(JsonWriter, Number)>
	//    5    9:return          
	}

	Gson$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
