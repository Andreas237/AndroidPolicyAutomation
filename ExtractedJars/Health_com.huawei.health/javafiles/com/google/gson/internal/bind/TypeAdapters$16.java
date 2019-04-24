// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$16 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method String read(JsonReader)>
	//    3    5:areturn         
	}

	public String read(JsonReader jsonreader)
		throws IOException
	{
		JsonToken jsontoken = jsonreader.peek();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
	//    2    4:astore_2        
		if(jsontoken == JsonToken.NULL)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #32  <Field JsonToken JsonToken.NULL>
	//*   5    9:if_acmpne       18
		{
			jsonreader.nextNull();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #35  <Method void JsonReader.nextNull()>
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		}
		if(jsontoken == JsonToken.BOOLEAN)
	//*  10   18:aload_2         
	//*  11   19:getstatic       #38  <Field JsonToken JsonToken.BOOLEAN>
	//*  12   22:if_acmpne       33
			return Boolean.toString(jsonreader.nextBoolean());
	//   13   25:aload_1         
	//   14   26:invokevirtual   #42  <Method boolean JsonReader.nextBoolean()>
	//   15   29:invokestatic    #48  <Method String Boolean.toString(boolean)>
	//   16   32:areturn         
		else
			return jsonreader.nextString();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #52  <Method String JsonReader.nextString()>
	//   19   37:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #56  <Class String>
	//    4    6:invokevirtual   #59  <Method void write(JsonWriter, String)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, String s)
		throws IOException
	{
		jsonwriter.value(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #65  <Method JsonWriter JsonWriter.value(String)>
	//    3    5:pop             
	//    4    6:return          
	}

	TypeAdapters$16()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
