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

static final class TypeAdapters$19 extends TypeAdapter
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
		if(jsonreader.peek() != JsonToken.NULL) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//    2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
	//    3    7:if_acmpne       16
_L1:
		jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
_L4:
		return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
_L2:
		jsonreader = ((JsonReader) (jsonreader.nextString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method String JsonReader.nextString()>
	//   10   20:astore_1        
		if("null".equals(((Object) (jsonreader)))) goto _L4; else goto _L3
	//   11   21:ldc1            #43  <String "null">
	//   12   23:aload_1         
	//   13   24:invokevirtual   #49  <Method boolean String.equals(Object)>
	//   14   27:ifne            14
_L3:
		jsonreader = ((JsonReader) (new URI(((String) (jsonreader)))));
	//   15   30:new             #51  <Class URI>
	//   16   33:dup             
	//   17   34:aload_1         
	//   18   35:invokespecial   #54  <Method void URI(String)>
	//   19   38:astore_1        
		return ((URI) (jsonreader));
	//   20   39:aload_1         
	//   21   40:areturn         
		jsonreader;
	//   22   41:astore_1        
		throw new JsonIOException(((Throwable) (jsonreader)));
	//   23   42:new             #56  <Class JsonIOException>
	//   24   45:dup             
	//   25   46:aload_1         
	//   26   47:invokespecial   #59  <Method void JsonIOException(Throwable)>
	//   27   50:athrow          
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
	//*   1    1:ifnonnull       13
			uri = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:aload_1         
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #70  <Method JsonWriter JsonWriter.value(String)>
	//*   7   11:pop             
	//*   8   12:return          
			uri = ((URI) (uri.toASCIIString()));
	//    9   13:aload_2         
	//   10   14:invokevirtual   #73  <Method String URI.toASCIIString()>
	//   11   17:astore_2        
		jsonwriter.value(((String) (uri)));
	//*  12   18:goto            6
	}

	TypeAdapters$19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
