// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$19 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method URI read(JsonReader)>
	//    3    5:areturn         
	}

	public URI read(JsonReader jsonreader)
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
		}
		jsonreader = ((JsonReader) (jsonreader.nextString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #38  <Method String JsonReader.nextString()>
	//   10   20:astore_1        
		if("null".equals(((Object) (jsonreader))))
	//*  11   21:ldc1            #40  <String "null">
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  14   27:ifeq            32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		try
		{
			jsonreader = ((JsonReader) (new URI(((String) (jsonreader)))));
	//   17   32:new             #48  <Class URI>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokespecial   #51  <Method void URI(String)>
	//   21   40:astore_1        
		}
	//*  22   41:aload_1         
	//*  23   42:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  24   43:astore_1        
		{
			throw new JsonIOException(((Throwable) (jsonreader)));
	//   25   44:new             #53  <Class JsonIOException>
	//   26   47:dup             
	//   27   48:aload_1         
	//   28   49:invokespecial   #56  <Method void JsonIOException(Throwable)>
	//   29   52:athrow          
		}
		return ((URI) (jsonreader));
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (URI)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #48  <Class URI>
	//    4    6:invokevirtual   #61  <Method void write(JsonWriter, URI)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, URI uri)
	{
		if(uri == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			uri = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			uri = ((URI) (uri.toASCIIString()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #64  <Method String URI.toASCIIString()>
	//    7   13:astore_2        
		jsonwriter.value(((String) (uri)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #70  <Method JsonWriter JsonWriter.value(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	TypeAdapters$19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
