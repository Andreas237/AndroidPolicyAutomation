// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.net.URL;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$18 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method URL read(JsonReader)>
	//    3    5:areturn         
	}

	public URL read(JsonReader jsonreader)
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #29  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #32  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		jsonreader = ((JsonReader) (jsonreader.nextString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #36  <Method String JsonReader.nextString()>
	//   10   20:astore_1        
		if("null".equals(((Object) (jsonreader))))
	//*  11   21:ldc1            #38  <String "null">
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*  14   27:ifeq            32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		else
			return new URL(((String) (jsonreader)));
	//   17   32:new             #46  <Class URL>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokespecial   #49  <Method void URL(String)>
	//   21   40:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (URL)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #46  <Class URL>
	//    4    6:invokevirtual   #54  <Method void write(JsonWriter, URL)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, URL url)
	{
		if(url == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			url = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			url = ((URL) (url.toExternalForm()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #57  <Method String URL.toExternalForm()>
	//    7   13:astore_2        
		jsonwriter.value(((String) (url)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #63  <Method JsonWriter JsonWriter.value(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	TypeAdapters$18()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
