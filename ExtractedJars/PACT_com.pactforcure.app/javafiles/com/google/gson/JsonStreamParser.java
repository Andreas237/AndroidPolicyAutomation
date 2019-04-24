// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.gson:
//			JsonSyntaxException, JsonIOException, JsonParseException, JsonElement

public final class JsonStreamParser
	implements Iterator
{

	public JsonStreamParser(Reader reader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		parser = new JsonReader(reader);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class JsonReader>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #20  <Method void JsonReader(Reader)>
	//    7   13:putfield        #22  <Field JsonReader parser>
		parser.setLenient(true);
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field JsonReader parser>
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #26  <Method void JsonReader.setLenient(boolean)>
		lock = new Object();
	//   12   24:aload_0         
	//   13   25:new             #5   <Class Object>
	//   14   28:dup             
	//   15   29:invokespecial   #16  <Method void Object()>
	//   16   32:putfield        #28  <Field Object lock>
	//   17   35:return          
	}

	public JsonStreamParser(String s)
	{
		this(((Reader) (new StringReader(s))));
	//    0    0:aload_0         
	//    1    1:new             #32  <Class StringReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #34  <Method void StringReader(String)>
	//    5    9:invokespecial   #35  <Method void JsonStreamParser(Reader)>
	//    6   12:return          
	}

	public boolean hasNext()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		JsonToken jsontoken;
		JsonToken jsontoken1;
		jsontoken = parser.peek();
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field JsonReader parser>
	//    7   11:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
	//    8   14:astore_3        
		jsontoken1 = JsonToken.END_DOCUMENT;
	//    9   15:getstatic       #51  <Field JsonToken JsonToken.END_DOCUMENT>
	//   10   18:astore          4
		boolean flag;
		Object obj1;
		if(jsontoken != jsontoken1)
	//*  11   20:aload_3         
	//*  12   21:aload           4
	//*  13   23:if_acmpeq       57
			flag = true;
	//   14   26:iconst_1        
	//   15   27:istore_1        
		else
	//*  16   28:aload_2         
	//*  17   29:monitorexit     
	//*  18   30:iload_1         
	//*  19   31:ireturn         
	//*  20   32:astore_3        
	//*  21   33:new             #53  <Class JsonSyntaxException>
	//*  22   36:dup             
	//*  23   37:aload_3         
	//*  24   38:invokespecial   #56  <Method void JsonSyntaxException(Throwable)>
	//*  25   41:athrow          
	//*  26   42:astore_3        
	//*  27   43:aload_2         
	//*  28   44:monitorexit     
	//*  29   45:aload_3         
	//*  30   46:athrow          
	//*  31   47:astore_3        
	//*  32   48:new             #58  <Class JsonIOException>
	//*  33   51:dup             
	//*  34   52:aload_3         
	//*  35   53:invokespecial   #59  <Method void JsonIOException(Throwable)>
	//*  36   56:athrow          
			flag = false;
	//   37   57:iconst_0        
	//   38   58:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		obj1;
		throw new JsonSyntaxException(((Throwable) (obj1)));
		obj1;
		obj;
		JVM INSTR monitorexit ;
		throw obj1;
		obj1;
		throw new JsonIOException(((Throwable) (obj1)));
	//*  39   59:goto            28
	}

	public JsonElement next()
		throws JsonParseException
	{
		if(!hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean hasNext()>
	//*   2    4:ifne            15
			throw new NoSuchElementException();
	//    3    7:new             #71  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:invokespecial   #72  <Method void NoSuchElementException()>
	//    6   14:athrow          
		JsonElement jsonelement;
		try
		{
			jsonelement = Streams.parse(parser);
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field JsonReader parser>
	//    9   19:invokestatic    #78  <Method JsonElement Streams.parse(JsonReader)>
	//   10   22:astore_1        
		}
	//*  11   23:aload_1         
	//*  12   24:areturn         
		catch(StackOverflowError stackoverflowerror)
	//*  13   25:astore_1        
		{
			throw new JsonParseException("Failed parsing JSON source to Json", ((Throwable) (stackoverflowerror)));
	//   14   26:new             #63  <Class JsonParseException>
	//   15   29:dup             
	//   16   30:ldc1            #80  <String "Failed parsing JSON source to Json">
	//   17   32:aload_1         
	//   18   33:invokespecial   #83  <Method void JsonParseException(String, Throwable)>
	//   19   36:athrow          
		}
		catch(OutOfMemoryError outofmemoryerror)
	//*  20   37:astore_1        
		{
			throw new JsonParseException("Failed parsing JSON source to Json", ((Throwable) (outofmemoryerror)));
	//   21   38:new             #63  <Class JsonParseException>
	//   22   41:dup             
	//   23   42:ldc1            #80  <String "Failed parsing JSON source to Json">
	//   24   44:aload_1         
	//   25   45:invokespecial   #83  <Method void JsonParseException(String, Throwable)>
	//   26   48:athrow          
		}
		catch(JsonParseException jsonparseexception)
	//*  27   49:astore_2        
		{
			Object obj = ((Object) (jsonparseexception));
	//   28   50:aload_2         
	//   29   51:astore_1        
			if(jsonparseexception.getCause() instanceof EOFException)
	//*  30   52:aload_2         
	//*  31   53:invokevirtual   #87  <Method Throwable JsonParseException.getCause()>
	//*  32   56:instanceof      #89  <Class EOFException>
	//*  33   59:ifeq            70
				obj = ((Object) (new NoSuchElementException()));
	//   34   62:new             #71  <Class NoSuchElementException>
	//   35   65:dup             
	//   36   66:invokespecial   #72  <Method void NoSuchElementException()>
	//   37   69:astore_1        
			throw obj;
	//   38   70:aload_1         
	//   39   71:athrow          
		}
		return jsonelement;
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method JsonElement next()>
	//    2    4:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #96  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private final Object lock;
	private final JsonReader parser;
}
