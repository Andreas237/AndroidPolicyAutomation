// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$20 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method StringBuffer read(JsonReader)>
	//    3    5:areturn         
	}

	public StringBuffer read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return new StringBuffer(jsonreader.nextString());
	//    8   16:new             #37  <Class StringBuffer>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokevirtual   #41  <Method String JsonReader.nextString()>
	//   12   24:invokespecial   #44  <Method void StringBuffer(String)>
	//   13   27:areturn         
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (StringBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #37  <Class StringBuffer>
	//    4    6:invokevirtual   #49  <Method void write(JsonWriter, StringBuffer)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, StringBuffer stringbuffer)
		throws IOException
	{
		if(stringbuffer == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			stringbuffer = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			stringbuffer = ((StringBuffer) (stringbuffer.toString()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #52  <Method String StringBuffer.toString()>
	//    7   13:astore_2        
		jsonwriter.value(((String) (stringbuffer)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #58  <Method JsonWriter JsonWriter.value(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	TypeAdapters$20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
