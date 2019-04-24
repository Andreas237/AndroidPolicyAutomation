// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.*;

// Referenced classes of package com.google.gson:
//			JsonIOException, JsonSyntaxException, JsonParseException, JsonElement

public final class JsonParser
{

	public JsonParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public JsonElement parse(JsonReader jsonreader)
		throws JsonIOException, JsonSyntaxException
	{
		boolean flag;
		flag = jsonreader.isLenient();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method boolean JsonReader.isLenient()>
	//    2    4:istore_2        
		jsonreader.setLenient(true);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #29  <Method void JsonReader.setLenient(boolean)>
		JsonElement jsonelement = Streams.parse(jsonreader);
	//    6   10:aload_1         
	//    7   11:invokestatic    #33  <Method JsonElement Streams.parse(JsonReader)>
	//    8   14:astore_3        
		jsonreader.setLenient(flag);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #29  <Method void JsonReader.setLenient(boolean)>
		return jsonelement;
	//   12   20:aload_3         
	//   13   21:areturn         
		Object obj;
		obj;
	//   14   22:astore_3        
		throw new JsonParseException((new StringBuilder()).append("Failed parsing JSON source: ").append(((Object) (jsonreader))).append(" to Json").toString(), ((Throwable) (obj)));
	//   15   23:new             #35  <Class JsonParseException>
	//   16   26:dup             
	//   17   27:new             #37  <Class StringBuilder>
	//   18   30:dup             
	//   19   31:invokespecial   #38  <Method void StringBuilder()>
	//   20   34:ldc1            #40  <String "Failed parsing JSON source: ">
	//   21   36:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:aload_1         
	//   23   40:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   24   43:ldc1            #49  <String " to Json">
	//   25   45:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   27   51:aload_3         
	//   28   52:invokespecial   #56  <Method void JsonParseException(String, Throwable)>
	//   29   55:athrow          
		obj;
	//   30   56:astore_3        
		throw new JsonParseException((new StringBuilder()).append("Failed parsing JSON source: ").append(((Object) (jsonreader))).append(" to Json").toString(), ((Throwable) (obj)));
	//   31   57:new             #35  <Class JsonParseException>
	//   32   60:dup             
	//   33   61:new             #37  <Class StringBuilder>
	//   34   64:dup             
	//   35   65:invokespecial   #38  <Method void StringBuilder()>
	//   36   68:ldc1            #40  <String "Failed parsing JSON source: ">
	//   37   70:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   38   73:aload_1         
	//   39   74:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   40   77:ldc1            #49  <String " to Json">
	//   41   79:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   42   82:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   43   85:aload_3         
	//   44   86:invokespecial   #56  <Method void JsonParseException(String, Throwable)>
	//   45   89:athrow          
		obj;
	//   46   90:astore_3        
		jsonreader.setLenient(flag);
	//   47   91:aload_1         
	//   48   92:iload_2         
	//   49   93:invokevirtual   #29  <Method void JsonReader.setLenient(boolean)>
		throw obj;
	//   50   96:aload_3         
	//   51   97:athrow          
	}

	public JsonElement parse(Reader reader)
		throws JsonIOException, JsonSyntaxException
	{
		JsonElement jsonelement;
		try
		{
			reader = ((Reader) (new JsonReader(reader)));
	//    0    0:new             #21  <Class JsonReader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #67  <Method void JsonReader(Reader)>
	//    4    8:astore_1        
			jsonelement = parse(((JsonReader) (reader)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #68  <Method JsonElement parse(JsonReader)>
	//    8   14:astore_2        
			if(!jsonelement.isJsonNull() && ((JsonReader) (reader)).peek() != JsonToken.END_DOCUMENT)
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #73  <Method boolean JsonElement.isJsonNull()>
	//*  11   19:ifne            42
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #77  <Method JsonToken JsonReader.peek()>
	//*  14   26:getstatic       #83  <Field JsonToken JsonToken.END_DOCUMENT>
	//*  15   29:if_acmpeq       42
				throw new JsonSyntaxException("Did not consume the entire document.");
	//   16   32:new             #15  <Class JsonSyntaxException>
	//   17   35:dup             
	//   18   36:ldc1            #85  <String "Did not consume the entire document.">
	//   19   38:invokespecial   #88  <Method void JsonSyntaxException(String)>
	//   20   41:athrow          
		}
	//*  21   42:aload_2         
	//*  22   43:areturn         
		// Misplaced declaration of an exception variable
		catch(Reader reader)
	//*  23   44:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (reader)));
	//   24   45:new             #15  <Class JsonSyntaxException>
	//   25   48:dup             
	//   26   49:aload_1         
	//   27   50:invokespecial   #91  <Method void JsonSyntaxException(Throwable)>
	//   28   53:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Reader reader)
	//*  29   54:astore_1        
		{
			throw new JsonIOException(((Throwable) (reader)));
	//   30   55:new             #13  <Class JsonIOException>
	//   31   58:dup             
	//   32   59:aload_1         
	//   33   60:invokespecial   #92  <Method void JsonIOException(Throwable)>
	//   34   63:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Reader reader)
	//*  35   64:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (reader)));
	//   36   65:new             #15  <Class JsonSyntaxException>
	//   37   68:dup             
	//   38   69:aload_1         
	//   39   70:invokespecial   #91  <Method void JsonSyntaxException(Throwable)>
	//   40   73:athrow          
		}
		return jsonelement;
	}

	public JsonElement parse(String s)
		throws JsonSyntaxException
	{
		return parse(((Reader) (new StringReader(s))));
	//    0    0:aload_0         
	//    1    1:new             #95  <Class StringReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #96  <Method void StringReader(String)>
	//    5    9:invokevirtual   #98  <Method JsonElement parse(Reader)>
	//    6   12:areturn         
	}
}
