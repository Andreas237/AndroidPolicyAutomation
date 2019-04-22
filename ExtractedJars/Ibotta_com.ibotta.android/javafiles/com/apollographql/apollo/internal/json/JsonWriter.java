// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import com.apollographql.apollo.json.JsonDataException;
import java.io.*;
import okio.BufferedSink;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			JsonUtf8Writer, JsonScope

public abstract class JsonWriter
	implements Closeable, Flushable
{

	JsonWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		stackSize = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field int stackSize>
	//    5    9:aload_0         
	//    6   10:bipush          32
	//    7   12:newarray        int[]
	//    8   14:putfield        #29  <Field int[] scopes>
	//    9   17:aload_0         
	//   10   18:bipush          32
	//   11   20:anewarray       String[]
	//   12   23:putfield        #33  <Field String[] pathNames>
	//   13   26:aload_0         
	//   14   27:bipush          32
	//   15   29:newarray        int[]
	//   16   31:putfield        #35  <Field int[] pathIndices>
	//   17   34:return          
	}

	public static JsonWriter of(BufferedSink bufferedsink)
	{
		return ((JsonWriter) (new JsonUtf8Writer(bufferedsink)));
	//    0    0:new             #40  <Class JsonUtf8Writer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void JsonUtf8Writer(BufferedSink)>
	//    4    8:areturn         
	}

	public abstract JsonWriter beginArray()
		throws IOException;

	public abstract JsonWriter beginObject()
		throws IOException;

	public abstract JsonWriter endArray()
		throws IOException;

	public abstract JsonWriter endObject()
		throws IOException;

	public final String getPath()
	{
		return JsonScope.getPath(stackSize, scopes, pathNames, pathIndices);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int stackSize>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field int[] scopes>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field String[] pathNames>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field int[] pathIndices>
	//    8   16:invokestatic    #57  <Method String JsonScope.getPath(int, int[], String[], int[])>
	//    9   19:areturn         
	}

	public abstract JsonWriter name(String s)
		throws IOException;

	public abstract JsonWriter nullValue()
		throws IOException;

	final int peekScope()
	{
		int i = stackSize;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int stackSize>
	//    2    4:istore_1        
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            18
			return scopes[i - 1];
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field int[] scopes>
	//    7   13:iload_1         
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:iaload          
	//   11   17:ireturn         
		else
			throw new IllegalStateException("JsonWriter is closed.");
	//   12   18:new             #64  <Class IllegalStateException>
	//   13   21:dup             
	//   14   22:ldc1            #66  <String "JsonWriter is closed.">
	//   15   24:invokespecial   #69  <Method void IllegalStateException(String)>
	//   16   27:athrow          
	}

	final void pushScope(int i)
	{
		int j = stackSize;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int stackSize>
	//    2    4:istore_2        
		int ai[] = scopes;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field int[] scopes>
	//    5    9:astore_3        
		if(j != ai.length)
	//*   6   10:iload_2         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpeq          28
		{
			stackSize = j + 1;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:putfield        #27  <Field int stackSize>
			ai[j] = i;
	//   15   23:aload_3         
	//   16   24:iload_2         
	//   17   25:iload_1         
	//   18   26:iastore         
			return;
	//   19   27:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   28:new             #73  <Class StringBuilder>
	//   21   31:dup             
	//   22   32:invokespecial   #74  <Method void StringBuilder()>
	//   23   35:astore_3        
			stringbuilder.append("Nesting too deep at ");
	//   24   36:aload_3         
	//   25   37:ldc1            #76  <String "Nesting too deep at ">
	//   26   39:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   27   42:pop             
			stringbuilder.append(getPath());
	//   28   43:aload_3         
	//   29   44:aload_0         
	//   30   45:invokevirtual   #82  <Method String getPath()>
	//   31   48:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   32   51:pop             
			stringbuilder.append(": circular reference?");
	//   33   52:aload_3         
	//   34   53:ldc1            #84  <String ": circular reference?">
	//   35   55:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   36   58:pop             
			throw new JsonDataException(stringbuilder.toString());
	//   37   59:new             #86  <Class JsonDataException>
	//   38   62:dup             
	//   39   63:aload_3         
	//   40   64:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   41   67:invokespecial   #90  <Method void JsonDataException(String)>
	//   42   70:athrow          
		}
	}

	final void replaceTop(int i)
	{
		scopes[stackSize - 1] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int[] scopes>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int stackSize>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:iload_1         
	//    7   11:iastore         
	//    8   12:return          
	}

	public final void setSerializeNulls(boolean flag)
	{
		serializeNulls = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #95  <Field boolean serializeNulls>
	//    3    5:return          
	}

	public abstract JsonWriter value(Boolean boolean1)
		throws IOException;

	public abstract JsonWriter value(Number number)
		throws IOException;

	public abstract JsonWriter value(String s)
		throws IOException;

	String indent;
	boolean lenient;
	final int pathIndices[] = new int[32];
	final String pathNames[] = new String[32];
	boolean promoteValueToName;
	final int scopes[] = new int[32];
	boolean serializeNulls;
	int stackSize;
}
