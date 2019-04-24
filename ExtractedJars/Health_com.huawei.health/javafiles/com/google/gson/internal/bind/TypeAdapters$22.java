// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$22 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method URI read(JsonReader)>
	//    3    5:areturn         
	}

	public URI read(JsonReader jsonreader)
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
		jsonreader = ((JsonReader) (jsonreader.nextString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method String JsonReader.nextString()>
	//   10   20:astore_1        
		if("null".equals(((Object) (jsonreader))))
	//*  11   21:ldc1            #43  <String "null">
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #49  <Method boolean String.equals(Object)>
	//*  14   27:ifeq            32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		try
		{
			jsonreader = ((JsonReader) (new URI(((String) (jsonreader)))));
	//   17   32:new             #51  <Class URI>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokespecial   #54  <Method void URI(String)>
	//   21   40:astore_1        
		}
	//*  22   41:aload_1         
	//*  23   42:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  24   43:astore_1        
		{
			throw new JsonIOException(((Throwable) (jsonreader)));
	//   25   44:new             #56  <Class JsonIOException>
	//   26   47:dup             
	//   27   48:aload_1         
	//   28   49:invokespecial   #59  <Method void JsonIOException(Throwable)>
	//   29   52:athrow          
		}
		return ((URI) (jsonreader));
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (URI)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class URI>
	//    4    6:invokevirtual   #64  <Method void write(JsonWriter, URI)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, URI uri)
		throws IOException
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
	//    6   10:invokevirtual   #67  <Method String URI.toASCIIString()>
	//    7   13:astore_2        
		jsonwriter.value(((String) (uri)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #73  <Method JsonWriter JsonWriter.value(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	TypeAdapters$22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
