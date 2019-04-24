// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;
import java.net.URL;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$18 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method URL read(JsonReader)>
	//    3    5:areturn         
	}

	public URL read(JsonReader jsonreader)
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
		} else
	//*   6   14:aconst_null     
	//*   7   15:areturn         
		{
			jsonreader = ((JsonReader) (jsonreader.nextString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #39  <Method String JsonReader.nextString()>
	//   10   20:astore_1        
			if(!"null".equals(((Object) (jsonreader))))
	//*  11   21:ldc1            #41  <String "null">
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  14   27:ifne            14
				return new URL(((String) (jsonreader)));
	//   15   30:new             #49  <Class URL>
	//   16   33:dup             
	//   17   34:aload_1         
	//   18   35:invokespecial   #52  <Method void URL(String)>
	//   19   38:areturn         
		}
		return null;
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (URL)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #49  <Class URL>
	//    4    6:invokevirtual   #57  <Method void write(JsonWriter, URL)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, URL url)
		throws IOException
	{
		if(url == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       13
			url = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:aload_1         
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #63  <Method JsonWriter JsonWriter.value(String)>
	//*   7   11:pop             
	//*   8   12:return          
			url = ((URL) (url.toExternalForm()));
	//    9   13:aload_2         
	//   10   14:invokevirtual   #66  <Method String URL.toExternalForm()>
	//   11   17:astore_2        
		jsonwriter.value(((String) (url)));
	//*  12   18:goto            6
	}

	TypeAdapters$18()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
