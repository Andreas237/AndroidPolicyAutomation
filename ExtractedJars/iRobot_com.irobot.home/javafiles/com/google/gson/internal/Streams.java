// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import com.google.gson.*;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.*;
import java.io.*;

public final class Streams
{
	private static final class AppendableWriter extends Writer
	{

		public void close()
		{
		//    0    0:return          
		}

		public void flush()
		{
		//    0    0:return          
		}

		public void write(int i)
		{
			appendable.append((char)i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Appendable appendable>
		//    2    4:iload_1         
		//    3    5:int2char        
		//    4    6:invokeinterface #38  <Method Appendable Appendable.append(char)>
		//    5   11:pop             
		//    6   12:return          
		}

		public void write(char ac[], int i, int j)
		{
			currentWrite.chars = ac;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
		//    2    4:aload_1         
		//    3    5:putfield        #43  <Field char[] Streams$AppendableWriter$CurrentWrite.chars>
			appendable.append(((CharSequence) (currentWrite)), i, j + i);
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field Appendable appendable>
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
		//    8   16:iload_2         
		//    9   17:iload_3         
		//   10   18:iload_2         
		//   11   19:iadd            
		//   12   20:invokeinterface #46  <Method Appendable Appendable.append(CharSequence, int, int)>
		//   13   25:pop             
		//   14   26:return          
		}

		private final Appendable appendable;
		private final CurrentWrite currentWrite;

		private AppendableWriter(Appendable appendable1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Writer()>
			currentWrite = new CurrentWrite();
		//    2    4:aload_0         
		//    3    5:new             #9   <Class Streams$AppendableWriter$CurrentWrite>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void Streams$AppendableWriter$CurrentWrite()>
		//    6   12:putfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
			appendable = appendable1;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #24  <Field Appendable appendable>
		//   10   20:return          
		}

	}

	static class AppendableWriter.CurrentWrite
		implements CharSequence
	{

		public char charAt(int i)
		{
			return chars[i];
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field char[] chars>
		//    2    4:iload_1         
		//    3    5:caload          
		//    4    6:ireturn         
		}

		public int length()
		{
			return chars.length;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field char[] chars>
		//    2    4:arraylength     
		//    3    5:ireturn         
		}

		public CharSequence subSequence(int i, int j)
		{
			return ((CharSequence) (new String(chars, i, j - i)));
		//    0    0:new             #29  <Class String>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field char[] chars>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_1         
		//    7   11:isub            
		//    8   12:invokespecial   #32  <Method void String(char[], int, int)>
		//    9   15:areturn         
		}

		char chars[];

		AppendableWriter.CurrentWrite()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	public Streams()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static JsonElement parse(JsonReader jsonreader)
	{
		jsonreader.peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method com.google.gson.stream.JsonToken JsonReader.peek()>
	//    2    4:pop             
		boolean flag;
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		try
		{
			jsonreader = ((JsonReader) ((JsonElement)TypeAdapters.JSON_ELEMENT.read(jsonreader)));
	//    5    7:getstatic       #39  <Field TypeAdapter TypeAdapters.JSON_ELEMENT>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #45  <Method Object TypeAdapter.read(JsonReader)>
	//    8   14:checkcast       #47  <Class JsonElement>
	//    9   17:astore_0        
		}
	//*  10   18:aload_0         
	//*  11   19:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  12   20:astore_0        
		{
			break MISSING_BLOCK_LABEL_57;
	//   13   21:goto            57
		}
	//*  14   24:astore_0        
	//*  15   25:new             #49  <Class JsonSyntaxException>
	//*  16   28:dup             
	//*  17   29:aload_0         
	//*  18   30:invokespecial   #52  <Method void JsonSyntaxException(Throwable)>
	//*  19   33:athrow          
	//*  20   34:astore_0        
	//*  21   35:new             #54  <Class JsonIOException>
	//*  22   38:dup             
	//*  23   39:aload_0         
	//*  24   40:invokespecial   #55  <Method void JsonIOException(Throwable)>
	//*  25   43:athrow          
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  26   44:astore_0        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   27   45:new             #49  <Class JsonSyntaxException>
	//   28   48:dup             
	//   29   49:aload_0         
	//   30   50:invokespecial   #52  <Method void JsonSyntaxException(Throwable)>
	//   31   53:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
		{
			throw new JsonIOException(((Throwable) (jsonreader)));
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
		}
		return ((JsonElement) (jsonreader));
		jsonreader;
	//   32   54:astore_0        
		flag = true;
	//   33   55:iconst_1        
	//   34   56:istore_1        
		if(flag)
	//*  35   57:iload_1         
	//*  36   58:ifeq            65
			return ((JsonElement) (JsonNull.INSTANCE));
	//   37   61:getstatic       #61  <Field JsonNull JsonNull.INSTANCE>
	//   38   64:areturn         
		else
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   39   65:new             #49  <Class JsonSyntaxException>
	//   40   68:dup             
	//   41   69:aload_0         
	//   42   70:invokespecial   #52  <Method void JsonSyntaxException(Throwable)>
	//   43   73:athrow          
	}

	public static void write(JsonElement jsonelement, JsonWriter jsonwriter)
	{
		TypeAdapters.JSON_ELEMENT.write(jsonwriter, ((Object) (jsonelement)));
	//    0    0:getstatic       #39  <Field TypeAdapter TypeAdapters.JSON_ELEMENT>
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:invokevirtual   #66  <Method void TypeAdapter.write(JsonWriter, Object)>
	//    4    8:return          
	}

	public static Writer writerForAppendable(Appendable appendable)
	{
		if(appendable instanceof Writer)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #70  <Class Writer>
	//*   2    4:ifeq            12
			return (Writer)appendable;
	//    3    7:aload_0         
	//    4    8:checkcast       #70  <Class Writer>
	//    5   11:areturn         
		else
			return ((Writer) (new AppendableWriter(appendable)));
	//    6   12:new             #8   <Class Streams$AppendableWriter>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #73  <Method void Streams$AppendableWriter(Appendable, Streams$1)>
	//   11   21:areturn         
	}
}
