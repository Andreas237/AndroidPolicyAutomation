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
			throws IOException
		{
			appendable.append((char)i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Appendable appendable>
		//    2    4:iload_1         
		//    3    5:int2char        
		//    4    6:invokeinterface #40  <Method Appendable Appendable.append(char)>
		//    5   11:pop             
		//    6   12:return          
		}

		public void write(char ac[], int i, int j)
			throws IOException
		{
			currentWrite.chars = ac;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
		//    2    4:aload_1         
		//    3    5:putfield        #46  <Field char[] Streams$AppendableWriter$CurrentWrite.chars>
			appendable.append(((CharSequence) (currentWrite)), i, i + j);
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field Appendable appendable>
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
		//    8   16:iload_2         
		//    9   17:iload_2         
		//   10   18:iload_3         
		//   11   19:iadd            
		//   12   20:invokeinterface #49  <Method Appendable Appendable.append(CharSequence, int, int)>
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


	private Streams()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		throw new UnsupportedOperationException();
	//    2    4:new             #18  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #19  <Method void UnsupportedOperationException()>
	//    5   11:athrow          
	}

	public static JsonElement parse(JsonReader jsonreader)
		throws JsonParseException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		try
		{
			jsonreader.peek();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #38  <Method com.google.gson.stream.JsonToken JsonReader.peek()>
	//    4    6:pop             
		}
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:getstatic       #44  <Field TypeAdapter TypeAdapters.JSON_ELEMENT>
	//*   8   12:aload_0         
	//*   9   13:invokevirtual   #50  <Method Object TypeAdapter.read(JsonReader)>
	//*  10   16:checkcast       #52  <Class JsonElement>
	//*  11   19:astore_0        
	//*  12   20:aload_0         
	//*  13   21:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  14   22:astore_0        
		{
			if(flag)
	//*  15   23:iload_1         
	//*  16   24:ifeq            31
				return ((JsonElement) (JsonNull.INSTANCE));
	//   17   27:getstatic       #58  <Field JsonNull JsonNull.INSTANCE>
	//   18   30:areturn         
			else
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   19   31:new             #60  <Class JsonSyntaxException>
	//   20   34:dup             
	//   21   35:aload_0         
	//   22   36:invokespecial   #63  <Method void JsonSyntaxException(Throwable)>
	//   23   39:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  24   40:astore_0        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   25   41:new             #60  <Class JsonSyntaxException>
	//   26   44:dup             
	//   27   45:aload_0         
	//   28   46:invokespecial   #63  <Method void JsonSyntaxException(Throwable)>
	//   29   49:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  30   50:astore_0        
		{
			throw new JsonIOException(((Throwable) (jsonreader)));
	//   31   51:new             #65  <Class JsonIOException>
	//   32   54:dup             
	//   33   55:aload_0         
	//   34   56:invokespecial   #66  <Method void JsonIOException(Throwable)>
	//   35   59:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  36   60:astore_0        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   37   61:new             #60  <Class JsonSyntaxException>
	//   38   64:dup             
	//   39   65:aload_0         
	//   40   66:invokespecial   #63  <Method void JsonSyntaxException(Throwable)>
	//   41   69:athrow          
		}
		flag = false;
		jsonreader = ((JsonReader) ((JsonElement)TypeAdapters.JSON_ELEMENT.read(jsonreader)));
		return ((JsonElement) (jsonreader));
	}

	public static void write(JsonElement jsonelement, JsonWriter jsonwriter)
		throws IOException
	{
		TypeAdapters.JSON_ELEMENT.write(jsonwriter, ((Object) (jsonelement)));
	//    0    0:getstatic       #44  <Field TypeAdapter TypeAdapters.JSON_ELEMENT>
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:invokevirtual   #72  <Method void TypeAdapter.write(JsonWriter, Object)>
	//    4    8:return          
	}

	public static Writer writerForAppendable(Appendable appendable)
	{
		if(appendable instanceof Writer)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #76  <Class Writer>
	//*   2    4:ifeq            12
			return (Writer)appendable;
	//    3    7:aload_0         
	//    4    8:checkcast       #76  <Class Writer>
	//    5   11:areturn         
		else
			return ((Writer) (new AppendableWriter(appendable)));
	//    6   12:new             #8   <Class Streams$AppendableWriter>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #79  <Method void Streams$AppendableWriter(Appendable, Streams$1)>
	//   11   21:areturn         
	}
}
