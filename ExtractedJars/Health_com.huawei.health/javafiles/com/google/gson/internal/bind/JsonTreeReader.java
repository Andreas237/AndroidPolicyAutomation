// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Set;

public final class JsonTreeReader extends JsonReader
{

	public JsonTreeReader(JsonElement jsonelement)
	{
		super(UNREADABLE_READER);
	//    0    0:aload_0         
	//    1    1:getstatic       #25  <Field Reader UNREADABLE_READER>
	//    2    4:invokespecial   #35  <Method void JsonReader(Reader)>
		stack = new Object[32];
	//    3    7:aload_0         
	//    4    8:bipush          32
	//    5   10:anewarray       Object[]
	//    6   13:putfield        #37  <Field Object[] stack>
		stackSize = 0;
	//    7   16:aload_0         
	//    8   17:iconst_0        
	//    9   18:putfield        #39  <Field int stackSize>
		pathNames = new String[32];
	//   10   21:aload_0         
	//   11   22:bipush          32
	//   12   24:anewarray       String[]
	//   13   27:putfield        #43  <Field String[] pathNames>
		pathIndices = new int[32];
	//   14   30:aload_0         
	//   15   31:bipush          32
	//   16   33:newarray        int[]
	//   17   35:putfield        #45  <Field int[] pathIndices>
		push(((Object) (jsonelement)));
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #49  <Method void push(Object)>
	//   21   43:return          
	}

	private void expect(JsonToken jsontoken)
		throws IOException
	{
		if(peek() != jsontoken)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method JsonToken peek()>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       54
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (jsontoken))).append(" but was ").append(((Object) (peek()))).append(locationString()).toString());
	//    4    8:new             #59  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #61  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #62  <Method void StringBuilder()>
	//    9   19:ldc1            #64  <String "Expected ">
	//   10   21:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   13   28:ldc1            #73  <String " but was ">
	//   14   30:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #57  <Method JsonToken peek()>
	//   17   37:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:aload_0         
	//   19   41:invokespecial   #77  <Method String locationString()>
	//   20   44:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   22   50:invokespecial   #83  <Method void IllegalStateException(String)>
	//   23   53:athrow          
		else
			return;
	//   24   54:return          
	}

	private String locationString()
	{
		return (new StringBuilder()).append(" at path ").append(getPath()).toString();
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:ldc1            #86  <String " at path ">
	//    4    9:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #89  <Method String getPath()>
	//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #80  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private Object peekStack()
	{
		return stack[stackSize - 1];
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object[] stack>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field int stackSize>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:aaload          
	//    7   11:areturn         
	}

	private Object popStack()
	{
		Object aobj[] = stack;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object[] stack>
	//    2    4:astore_2        
		int i = stackSize - 1;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field int stackSize>
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:istore_1        
		stackSize = i;
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:putfield        #39  <Field int stackSize>
		Object obj = aobj[i];
	//   11   17:aload_2         
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:astore_2        
		stack[stackSize] = null;
	//   15   21:aload_0         
	//   16   22:getfield        #37  <Field Object[] stack>
	//   17   25:aload_0         
	//   18   26:getfield        #39  <Field int stackSize>
	//   19   29:aconst_null     
	//   20   30:aastore         
		return obj;
	//   21   31:aload_2         
	//   22   32:areturn         
	}

	private void push(Object obj)
	{
		if(stackSize == stack.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int stackSize>
	//*   2    4:aload_0         
	//*   3    5:getfield        #37  <Field Object[] stack>
	//*   4    8:arraylength     
	//*   5    9:icmpne          104
		{
			Object aobj[] = new Object[stackSize * 2];
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field int stackSize>
	//    8   16:iconst_2        
	//    9   17:imul            
	//   10   18:anewarray       Object[]
	//   11   21:astore_3        
			int ai[] = new int[stackSize * 2];
	//   12   22:aload_0         
	//   13   23:getfield        #39  <Field int stackSize>
	//   14   26:iconst_2        
	//   15   27:imul            
	//   16   28:newarray        int[]
	//   17   30:astore          4
			String as[] = new String[stackSize * 2];
	//   18   32:aload_0         
	//   19   33:getfield        #39  <Field int stackSize>
	//   20   36:iconst_2        
	//   21   37:imul            
	//   22   38:anewarray       String[]
	//   23   41:astore          5
			System.arraycopy(((Object) (stack)), 0, ((Object) (aobj)), 0, stackSize);
	//   24   43:aload_0         
	//   25   44:getfield        #37  <Field Object[] stack>
	//   26   47:iconst_0        
	//   27   48:aload_3         
	//   28   49:iconst_0        
	//   29   50:aload_0         
	//   30   51:getfield        #39  <Field int stackSize>
	//   31   54:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathIndices)), 0, ((Object) (ai)), 0, stackSize);
	//   32   57:aload_0         
	//   33   58:getfield        #45  <Field int[] pathIndices>
	//   34   61:iconst_0        
	//   35   62:aload           4
	//   36   64:iconst_0        
	//   37   65:aload_0         
	//   38   66:getfield        #39  <Field int stackSize>
	//   39   69:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathNames)), 0, ((Object) (as)), 0, stackSize);
	//   40   72:aload_0         
	//   41   73:getfield        #43  <Field String[] pathNames>
	//   42   76:iconst_0        
	//   43   77:aload           5
	//   44   79:iconst_0        
	//   45   80:aload_0         
	//   46   81:getfield        #39  <Field int stackSize>
	//   47   84:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			stack = aobj;
	//   48   87:aload_0         
	//   49   88:aload_3         
	//   50   89:putfield        #37  <Field Object[] stack>
			pathIndices = ai;
	//   51   92:aload_0         
	//   52   93:aload           4
	//   53   95:putfield        #45  <Field int[] pathIndices>
			pathNames = as;
	//   54   98:aload_0         
	//   55   99:aload           5
	//   56  101:putfield        #43  <Field String[] pathNames>
		}
		Object aobj1[] = stack;
	//   57  104:aload_0         
	//   58  105:getfield        #37  <Field Object[] stack>
	//   59  108:astore_3        
		int i = stackSize;
	//   60  109:aload_0         
	//   61  110:getfield        #39  <Field int stackSize>
	//   62  113:istore_2        
		stackSize = i + 1;
	//   63  114:aload_0         
	//   64  115:iload_2         
	//   65  116:iconst_1        
	//   66  117:iadd            
	//   67  118:putfield        #39  <Field int stackSize>
		aobj1[i] = obj;
	//   68  121:aload_3         
	//   69  122:iload_2         
	//   70  123:aload_1         
	//   71  124:aastore         
	//   72  125:return          
	}

	public void beginArray()
		throws IOException
	{
		expect(JsonToken.BEGIN_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #105 <Field JsonToken JsonToken.BEGIN_ARRAY>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		push(((Object) (((JsonArray)peekStack()).iterator())));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #109 <Method Object peekStack()>
	//    6   12:checkcast       #111 <Class JsonArray>
	//    7   15:invokevirtual   #115 <Method Iterator JsonArray.iterator()>
	//    8   18:invokespecial   #49  <Method void push(Object)>
		pathIndices[stackSize - 1] = 0;
	//    9   21:aload_0         
	//   10   22:getfield        #45  <Field int[] pathIndices>
	//   11   25:aload_0         
	//   12   26:getfield        #39  <Field int stackSize>
	//   13   29:iconst_1        
	//   14   30:isub            
	//   15   31:iconst_0        
	//   16   32:iastore         
	//   17   33:return          
	}

	public void beginObject()
		throws IOException
	{
		expect(JsonToken.BEGIN_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #119 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		push(((Object) (((JsonObject)peekStack()).entrySet().iterator())));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #109 <Method Object peekStack()>
	//    6   12:checkcast       #121 <Class JsonObject>
	//    7   15:invokevirtual   #125 <Method Set JsonObject.entrySet()>
	//    8   18:invokeinterface #128 <Method Iterator Set.iterator()>
	//    9   23:invokespecial   #49  <Method void push(Object)>
	//   10   26:return          
	}

	public void close()
		throws IOException
	{
		stack = (new Object[] {
			SENTINEL_CLOSED
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:getstatic       #30  <Field Object SENTINEL_CLOSED>
	//    6   10:aastore         
	//    7   11:putfield        #37  <Field Object[] stack>
		stackSize = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #39  <Field int stackSize>
	//   11   19:return          
	}

	public void endArray()
		throws IOException
	{
		expect(JsonToken.END_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #133 <Field JsonToken JsonToken.END_ARRAY>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #135 <Method Object popStack()>
	//    5   11:pop             
		popStack();
	//    6   12:aload_0         
	//    7   13:invokespecial   #135 <Method Object popStack()>
	//    8   16:pop             
		if(stackSize > 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #39  <Field int stackSize>
	//*  11   21:ifle            44
		{
			int ai[] = pathIndices;
	//   12   24:aload_0         
	//   13   25:getfield        #45  <Field int[] pathIndices>
	//   14   28:astore_2        
			int i = stackSize - 1;
	//   15   29:aload_0         
	//   16   30:getfield        #39  <Field int stackSize>
	//   17   33:iconst_1        
	//   18   34:isub            
	//   19   35:istore_1        
			ai[i] = ai[i] + 1;
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_2         
	//   23   39:iload_1         
	//   24   40:iaload          
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:iastore         
		}
	//   28   44:return          
	}

	public void endObject()
		throws IOException
	{
		expect(JsonToken.END_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #139 <Field JsonToken JsonToken.END_OBJECT>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #135 <Method Object popStack()>
	//    5   11:pop             
		popStack();
	//    6   12:aload_0         
	//    7   13:invokespecial   #135 <Method Object popStack()>
	//    8   16:pop             
		if(stackSize > 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #39  <Field int stackSize>
	//*  11   21:ifle            44
		{
			int ai[] = pathIndices;
	//   12   24:aload_0         
	//   13   25:getfield        #45  <Field int[] pathIndices>
	//   14   28:astore_2        
			int i = stackSize - 1;
	//   15   29:aload_0         
	//   16   30:getfield        #39  <Field int stackSize>
	//   17   33:iconst_1        
	//   18   34:isub            
	//   19   35:istore_1        
			ai[i] = ai[i] + 1;
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_2         
	//   23   39:iload_1         
	//   24   40:iaload          
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:iastore         
		}
	//   28   44:return          
	}

	public String getPath()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append('$');
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:bipush          36
	//    4    9:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//    5   12:astore_3        
		int i;
		for(int j = 0; j < stackSize; j = i + 1)
	//*   6   13:iconst_0        
	//*   7   14:istore_2        
	//*   8   15:iload_2         
	//*   9   16:aload_0         
	//*  10   17:getfield        #39  <Field int stackSize>
	//*  11   20:icmpge          157
		{
			if(stack[j] instanceof JsonArray)
	//*  12   23:aload_0         
	//*  13   24:getfield        #37  <Field Object[] stack>
	//*  14   27:iload_2         
	//*  15   28:aaload          
	//*  16   29:instanceof      #111 <Class JsonArray>
	//*  17   32:ifeq            83
			{
				Object aobj[] = stack;
	//   18   35:aload_0         
	//   19   36:getfield        #37  <Field Object[] stack>
	//   20   39:astore          4
				j++;
	//   21   41:iload_2         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_2        
				i = j;
	//   25   45:iload_2         
	//   26   46:istore_1        
				if(aobj[j] instanceof Iterator)
	//*  27   47:aload           4
	//*  28   49:iload_2         
	//*  29   50:aaload          
	//*  30   51:instanceof      #144 <Class Iterator>
	//*  31   54:ifeq            150
				{
					stringbuilder.append('[').append(pathIndices[j]).append(']');
	//   32   57:aload_3         
	//   33   58:bipush          91
	//   34   60:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   35   63:aload_0         
	//   36   64:getfield        #45  <Field int[] pathIndices>
	//   37   67:iload_2         
	//   38   68:iaload          
	//   39   69:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   40   72:bipush          93
	//   41   74:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   42   77:pop             
					i = j;
	//   43   78:iload_2         
	//   44   79:istore_1        
				}
				continue;
	//   45   80:goto            150
			}
			i = j;
	//   46   83:iload_2         
	//   47   84:istore_1        
			if(!(stack[j] instanceof JsonObject))
				continue;
	//   48   85:aload_0         
	//   49   86:getfield        #37  <Field Object[] stack>
	//   50   89:iload_2         
	//   51   90:aaload          
	//   52   91:instanceof      #121 <Class JsonObject>
	//   53   94:ifeq            150
			Object aobj1[] = stack;
	//   54   97:aload_0         
	//   55   98:getfield        #37  <Field Object[] stack>
	//   56  101:astore          4
			j++;
	//   57  103:iload_2         
	//   58  104:iconst_1        
	//   59  105:iadd            
	//   60  106:istore_2        
			i = j;
	//   61  107:iload_2         
	//   62  108:istore_1        
			if(!(aobj1[j] instanceof Iterator))
				continue;
	//   63  109:aload           4
	//   64  111:iload_2         
	//   65  112:aaload          
	//   66  113:instanceof      #144 <Class Iterator>
	//   67  116:ifeq            150
			stringbuilder.append('.');
	//   68  119:aload_3         
	//   69  120:bipush          46
	//   70  122:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   71  125:pop             
			i = j;
	//   72  126:iload_2         
	//   73  127:istore_1        
			if(pathNames[j] != null)
	//*  74  128:aload_0         
	//*  75  129:getfield        #43  <Field String[] pathNames>
	//*  76  132:iload_2         
	//*  77  133:aaload          
	//*  78  134:ifnull          150
			{
				stringbuilder.append(pathNames[j]);
	//   79  137:aload_3         
	//   80  138:aload_0         
	//   81  139:getfield        #43  <Field String[] pathNames>
	//   82  142:iload_2         
	//   83  143:aaload          
	//   84  144:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   85  147:pop             
				i = j;
	//   86  148:iload_2         
	//   87  149:istore_1        
			}
		}

	//   88  150:iload_1         
	//   89  151:iconst_1        
	//   90  152:iadd            
	//   91  153:istore_2        
	//*  92  154:goto            15
		return stringbuilder.toString();
	//   93  157:aload_3         
	//   94  158:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   95  161:areturn         
	}

	public boolean hasNext()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method JsonToken peek()>
	//    2    4:astore_1        
		return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
	//    3    5:aload_1         
	//    4    6:getstatic       #139 <Field JsonToken JsonToken.END_OBJECT>
	//    5    9:if_acmpeq       21
	//    6   12:aload_1         
	//    7   13:getstatic       #133 <Field JsonToken JsonToken.END_ARRAY>
	//    8   16:if_acmpeq       21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public boolean nextBoolean()
		throws IOException
	{
		expect(JsonToken.BOOLEAN);
	//    0    0:aload_0         
	//    1    1:getstatic       #153 <Field JsonToken JsonToken.BOOLEAN>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		boolean flag = ((JsonPrimitive)popStack()).getAsBoolean();
	//    3    7:aload_0         
	//    4    8:invokespecial   #135 <Method Object popStack()>
	//    5   11:checkcast       #155 <Class JsonPrimitive>
	//    6   14:invokevirtual   #158 <Method boolean JsonPrimitive.getAsBoolean()>
	//    7   17:istore_2        
		if(stackSize > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #39  <Field int stackSize>
	//*  10   22:ifle            45
		{
			int ai[] = pathIndices;
	//   11   25:aload_0         
	//   12   26:getfield        #45  <Field int[] pathIndices>
	//   13   29:astore_3        
			int i = stackSize - 1;
	//   14   30:aload_0         
	//   15   31:getfield        #39  <Field int stackSize>
	//   16   34:iconst_1        
	//   17   35:isub            
	//   18   36:istore_1        
			ai[i] = ai[i] + 1;
	//   19   37:aload_3         
	//   20   38:iload_1         
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:iaload          
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:iastore         
		}
		return flag;
	//   27   45:iload_2         
	//   28   46:ireturn         
	}

	public double nextDouble()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method JsonToken peek()>
	//    2    4:astore          4
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    6:aload           4
	//*   4    8:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//*   5   11:if_acmpeq       68
	//*   6   14:aload           4
	//*   7   16:getstatic       #166 <Field JsonToken JsonToken.STRING>
	//*   8   19:if_acmpeq       68
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.NUMBER))).append(" but was ").append(((Object) (jsontoken))).append(locationString()).toString());
	//    9   22:new             #59  <Class IllegalStateException>
	//   10   25:dup             
	//   11   26:new             #61  <Class StringBuilder>
	//   12   29:dup             
	//   13   30:invokespecial   #62  <Method void StringBuilder()>
	//   14   33:ldc1            #64  <String "Expected ">
	//   15   35:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//   17   41:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   18   44:ldc1            #73  <String " but was ">
	//   19   46:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:aload           4
	//   21   51:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   22   54:aload_0         
	//   23   55:invokespecial   #77  <Method String locationString()>
	//   24   58:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   25   61:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   26   64:invokespecial   #83  <Method void IllegalStateException(String)>
	//   27   67:athrow          
		double d = ((JsonPrimitive)peekStack()).getAsDouble();
	//   28   68:aload_0         
	//   29   69:invokespecial   #109 <Method Object peekStack()>
	//   30   72:checkcast       #155 <Class JsonPrimitive>
	//   31   75:invokevirtual   #169 <Method double JsonPrimitive.getAsDouble()>
	//   32   78:dstore_1        
		if(!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
	//*  33   79:aload_0         
	//*  34   80:invokevirtual   #172 <Method boolean isLenient()>
	//*  35   83:ifne            127
	//*  36   86:dload_1         
	//*  37   87:invokestatic    #178 <Method boolean Double.isNaN(double)>
	//*  38   90:ifne            100
	//*  39   93:dload_1         
	//*  40   94:invokestatic    #181 <Method boolean Double.isInfinite(double)>
	//*  41   97:ifeq            127
			throw new NumberFormatException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d).toString());
	//   42  100:new             #183 <Class NumberFormatException>
	//   43  103:dup             
	//   44  104:new             #61  <Class StringBuilder>
	//   45  107:dup             
	//   46  108:invokespecial   #62  <Method void StringBuilder()>
	//   47  111:ldc1            #185 <String "JSON forbids NaN and infinities: ">
	//   48  113:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   49  116:dload_1         
	//   50  117:invokevirtual   #188 <Method StringBuilder StringBuilder.append(double)>
	//   51  120:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   52  123:invokespecial   #189 <Method void NumberFormatException(String)>
	//   53  126:athrow          
		popStack();
	//   54  127:aload_0         
	//   55  128:invokespecial   #135 <Method Object popStack()>
	//   56  131:pop             
		if(stackSize > 0)
	//*  57  132:aload_0         
	//*  58  133:getfield        #39  <Field int stackSize>
	//*  59  136:ifle            162
		{
			int ai[] = pathIndices;
	//   60  139:aload_0         
	//   61  140:getfield        #45  <Field int[] pathIndices>
	//   62  143:astore          4
			int i = stackSize - 1;
	//   63  145:aload_0         
	//   64  146:getfield        #39  <Field int stackSize>
	//   65  149:iconst_1        
	//   66  150:isub            
	//   67  151:istore_3        
			ai[i] = ai[i] + 1;
	//   68  152:aload           4
	//   69  154:iload_3         
	//   70  155:aload           4
	//   71  157:iload_3         
	//   72  158:iaload          
	//   73  159:iconst_1        
	//   74  160:iadd            
	//   75  161:iastore         
		}
		return d;
	//   76  162:dload_1         
	//   77  163:dreturn         
	}

	public int nextInt()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method JsonToken peek()>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//*   5    9:if_acmpeq       64
	//*   6   12:aload_3         
	//*   7   13:getstatic       #166 <Field JsonToken JsonToken.STRING>
	//*   8   16:if_acmpeq       64
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.NUMBER))).append(" but was ").append(((Object) (jsontoken))).append(locationString()).toString());
	//    9   19:new             #59  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #61  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #62  <Method void StringBuilder()>
	//   14   30:ldc1            #64  <String "Expected ">
	//   15   32:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//   17   38:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:ldc1            #73  <String " but was ">
	//   19   43:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:aload_0         
	//   23   51:invokespecial   #77  <Method String locationString()>
	//   24   54:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   26   60:invokespecial   #83  <Method void IllegalStateException(String)>
	//   27   63:athrow          
		int i = ((JsonPrimitive)peekStack()).getAsInt();
	//   28   64:aload_0         
	//   29   65:invokespecial   #109 <Method Object peekStack()>
	//   30   68:checkcast       #155 <Class JsonPrimitive>
	//   31   71:invokevirtual   #194 <Method int JsonPrimitive.getAsInt()>
	//   32   74:istore_1        
		popStack();
	//   33   75:aload_0         
	//   34   76:invokespecial   #135 <Method Object popStack()>
	//   35   79:pop             
		if(stackSize > 0)
	//*  36   80:aload_0         
	//*  37   81:getfield        #39  <Field int stackSize>
	//*  38   84:ifle            107
		{
			int ai[] = pathIndices;
	//   39   87:aload_0         
	//   40   88:getfield        #45  <Field int[] pathIndices>
	//   41   91:astore_3        
			int j = stackSize - 1;
	//   42   92:aload_0         
	//   43   93:getfield        #39  <Field int stackSize>
	//   44   96:iconst_1        
	//   45   97:isub            
	//   46   98:istore_2        
			ai[j] = ai[j] + 1;
	//   47   99:aload_3         
	//   48  100:iload_2         
	//   49  101:aload_3         
	//   50  102:iload_2         
	//   51  103:iaload          
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:iastore         
		}
		return i;
	//   55  107:iload_1         
	//   56  108:ireturn         
	}

	public long nextLong()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method JsonToken peek()>
	//    2    4:astore          4
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    6:aload           4
	//*   4    8:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//*   5   11:if_acmpeq       68
	//*   6   14:aload           4
	//*   7   16:getstatic       #166 <Field JsonToken JsonToken.STRING>
	//*   8   19:if_acmpeq       68
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.NUMBER))).append(" but was ").append(((Object) (jsontoken))).append(locationString()).toString());
	//    9   22:new             #59  <Class IllegalStateException>
	//   10   25:dup             
	//   11   26:new             #61  <Class StringBuilder>
	//   12   29:dup             
	//   13   30:invokespecial   #62  <Method void StringBuilder()>
	//   14   33:ldc1            #64  <String "Expected ">
	//   15   35:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//   17   41:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   18   44:ldc1            #73  <String " but was ">
	//   19   46:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:aload           4
	//   21   51:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   22   54:aload_0         
	//   23   55:invokespecial   #77  <Method String locationString()>
	//   24   58:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   25   61:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   26   64:invokespecial   #83  <Method void IllegalStateException(String)>
	//   27   67:athrow          
		long l = ((JsonPrimitive)peekStack()).getAsLong();
	//   28   68:aload_0         
	//   29   69:invokespecial   #109 <Method Object peekStack()>
	//   30   72:checkcast       #155 <Class JsonPrimitive>
	//   31   75:invokevirtual   #199 <Method long JsonPrimitive.getAsLong()>
	//   32   78:lstore_2        
		popStack();
	//   33   79:aload_0         
	//   34   80:invokespecial   #135 <Method Object popStack()>
	//   35   83:pop             
		if(stackSize > 0)
	//*  36   84:aload_0         
	//*  37   85:getfield        #39  <Field int stackSize>
	//*  38   88:ifle            114
		{
			int ai[] = pathIndices;
	//   39   91:aload_0         
	//   40   92:getfield        #45  <Field int[] pathIndices>
	//   41   95:astore          4
			int i = stackSize - 1;
	//   42   97:aload_0         
	//   43   98:getfield        #39  <Field int stackSize>
	//   44  101:iconst_1        
	//   45  102:isub            
	//   46  103:istore_1        
			ai[i] = ai[i] + 1;
	//   47  104:aload           4
	//   48  106:iload_1         
	//   49  107:aload           4
	//   50  109:iload_1         
	//   51  110:iaload          
	//   52  111:iconst_1        
	//   53  112:iadd            
	//   54  113:iastore         
		}
		return l;
	//   55  114:lload_2         
	//   56  115:lreturn         
	}

	public String nextName()
		throws IOException
	{
		expect(JsonToken.NAME);
	//    0    0:aload_0         
	//    1    1:getstatic       #203 <Field JsonToken JsonToken.NAME>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
	//    3    7:aload_0         
	//    4    8:invokespecial   #109 <Method Object peekStack()>
	//    5   11:checkcast       #144 <Class Iterator>
	//    6   14:invokeinterface #206 <Method Object Iterator.next()>
	//    7   19:checkcast       #208 <Class java.util.Map$Entry>
	//    8   22:astore_1        
		String s = (String)entry.getKey();
	//    9   23:aload_1         
	//   10   24:invokeinterface #211 <Method Object java.util.Map$Entry.getKey()>
	//   11   29:checkcast       #41  <Class String>
	//   12   32:astore_2        
		pathNames[stackSize - 1] = s;
	//   13   33:aload_0         
	//   14   34:getfield        #43  <Field String[] pathNames>
	//   15   37:aload_0         
	//   16   38:getfield        #39  <Field int stackSize>
	//   17   41:iconst_1        
	//   18   42:isub            
	//   19   43:aload_2         
	//   20   44:aastore         
		push(entry.getValue());
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokeinterface #214 <Method Object java.util.Map$Entry.getValue()>
	//   24   52:invokespecial   #49  <Method void push(Object)>
		return s;
	//   25   55:aload_2         
	//   26   56:areturn         
	}

	public void nextNull()
		throws IOException
	{
		expect(JsonToken.NULL);
	//    0    0:aload_0         
	//    1    1:getstatic       #218 <Field JsonToken JsonToken.NULL>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #135 <Method Object popStack()>
	//    5   11:pop             
		if(stackSize > 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #39  <Field int stackSize>
	//*   8   16:ifle            39
		{
			int ai[] = pathIndices;
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field int[] pathIndices>
	//   11   23:astore_2        
			int i = stackSize - 1;
	//   12   24:aload_0         
	//   13   25:getfield        #39  <Field int stackSize>
	//   14   28:iconst_1        
	//   15   29:isub            
	//   16   30:istore_1        
			ai[i] = ai[i] + 1;
	//   17   31:aload_2         
	//   18   32:iload_1         
	//   19   33:aload_2         
	//   20   34:iload_1         
	//   21   35:iaload          
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:iastore         
		}
	//   25   39:return          
	}

	public String nextString()
		throws IOException
	{
		Object obj = ((Object) (peek()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method JsonToken peek()>
	//    2    4:astore_2        
		if(obj != JsonToken.STRING && obj != JsonToken.NUMBER)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #166 <Field JsonToken JsonToken.STRING>
	//*   5    9:if_acmpeq       64
	//*   6   12:aload_2         
	//*   7   13:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//*   8   16:if_acmpeq       64
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.STRING))).append(" but was ").append(obj).append(locationString()).toString());
	//    9   19:new             #59  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #61  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #62  <Method void StringBuilder()>
	//   14   30:ldc1            #64  <String "Expected ">
	//   15   32:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:getstatic       #166 <Field JsonToken JsonToken.STRING>
	//   17   38:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:ldc1            #73  <String " but was ">
	//   19   43:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_2         
	//   21   47:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:aload_0         
	//   23   51:invokespecial   #77  <Method String locationString()>
	//   24   54:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   26   60:invokespecial   #83  <Method void IllegalStateException(String)>
	//   27   63:athrow          
		obj = ((Object) (((JsonPrimitive)popStack()).getAsString()));
	//   28   64:aload_0         
	//   29   65:invokespecial   #135 <Method Object popStack()>
	//   30   68:checkcast       #155 <Class JsonPrimitive>
	//   31   71:invokevirtual   #222 <Method String JsonPrimitive.getAsString()>
	//   32   74:astore_2        
		if(stackSize > 0)
	//*  33   75:aload_0         
	//*  34   76:getfield        #39  <Field int stackSize>
	//*  35   79:ifle            102
		{
			int ai[] = pathIndices;
	//   36   82:aload_0         
	//   37   83:getfield        #45  <Field int[] pathIndices>
	//   38   86:astore_3        
			int i = stackSize - 1;
	//   39   87:aload_0         
	//   40   88:getfield        #39  <Field int stackSize>
	//   41   91:iconst_1        
	//   42   92:isub            
	//   43   93:istore_1        
			ai[i] = ai[i] + 1;
	//   44   94:aload_3         
	//   45   95:iload_1         
	//   46   96:aload_3         
	//   47   97:iload_1         
	//   48   98:iaload          
	//   49   99:iconst_1        
	//   50  100:iadd            
	//   51  101:iastore         
		}
		return ((String) (obj));
	//   52  102:aload_2         
	//   53  103:areturn         
	}

	public JsonToken peek()
		throws IOException
	{
		if(stackSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int stackSize>
	//*   2    4:ifne            11
			return JsonToken.END_DOCUMENT;
	//    3    7:getstatic       #225 <Field JsonToken JsonToken.END_DOCUMENT>
	//    4   10:areturn         
		Object obj = peekStack();
	//    5   11:aload_0         
	//    6   12:invokespecial   #109 <Method Object peekStack()>
	//    7   15:astore_2        
		if(obj instanceof Iterator)
	//*   8   16:aload_2         
	//*   9   17:instanceof      #144 <Class Iterator>
	//*  10   20:ifeq            87
		{
			boolean flag = stack[stackSize - 2] instanceof JsonObject;
	//   11   23:aload_0         
	//   12   24:getfield        #37  <Field Object[] stack>
	//   13   27:aload_0         
	//   14   28:getfield        #39  <Field int stackSize>
	//   15   31:iconst_2        
	//   16   32:isub            
	//   17   33:aaload          
	//   18   34:instanceof      #121 <Class JsonObject>
	//   19   37:istore_1        
			obj = ((Object) ((Iterator)obj));
	//   20   38:aload_2         
	//   21   39:checkcast       #144 <Class Iterator>
	//   22   42:astore_2        
			if(((Iterator) (obj)).hasNext())
	//*  23   43:aload_2         
	//*  24   44:invokeinterface #227 <Method boolean Iterator.hasNext()>
	//*  25   49:ifeq            75
				if(flag)
	//*  26   52:iload_1         
	//*  27   53:ifeq            60
				{
					return JsonToken.NAME;
	//   28   56:getstatic       #203 <Field JsonToken JsonToken.NAME>
	//   29   59:areturn         
				} else
				{
					push(((Iterator) (obj)).next());
	//   30   60:aload_0         
	//   31   61:aload_2         
	//   32   62:invokeinterface #206 <Method Object Iterator.next()>
	//   33   67:invokespecial   #49  <Method void push(Object)>
					return peek();
	//   34   70:aload_0         
	//   35   71:invokevirtual   #57  <Method JsonToken peek()>
	//   36   74:areturn         
				}
			if(flag)
	//*  37   75:iload_1         
	//*  38   76:ifeq            83
				return JsonToken.END_OBJECT;
	//   39   79:getstatic       #139 <Field JsonToken JsonToken.END_OBJECT>
	//   40   82:areturn         
			else
				return JsonToken.END_ARRAY;
	//   41   83:getstatic       #133 <Field JsonToken JsonToken.END_ARRAY>
	//   42   86:areturn         
		}
		if(obj instanceof JsonObject)
	//*  43   87:aload_2         
	//*  44   88:instanceof      #121 <Class JsonObject>
	//*  45   91:ifeq            98
			return JsonToken.BEGIN_OBJECT;
	//   46   94:getstatic       #119 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   47   97:areturn         
		if(obj instanceof JsonArray)
	//*  48   98:aload_2         
	//*  49   99:instanceof      #111 <Class JsonArray>
	//*  50  102:ifeq            109
			return JsonToken.BEGIN_ARRAY;
	//   51  105:getstatic       #105 <Field JsonToken JsonToken.BEGIN_ARRAY>
	//   52  108:areturn         
		if(obj instanceof JsonPrimitive)
	//*  53  109:aload_2         
	//*  54  110:instanceof      #155 <Class JsonPrimitive>
	//*  55  113:ifeq            162
		{
			obj = ((Object) ((JsonPrimitive)obj));
	//   56  116:aload_2         
	//   57  117:checkcast       #155 <Class JsonPrimitive>
	//   58  120:astore_2        
			if(((JsonPrimitive) (obj)).isString())
	//*  59  121:aload_2         
	//*  60  122:invokevirtual   #230 <Method boolean JsonPrimitive.isString()>
	//*  61  125:ifeq            132
				return JsonToken.STRING;
	//   62  128:getstatic       #166 <Field JsonToken JsonToken.STRING>
	//   63  131:areturn         
			if(((JsonPrimitive) (obj)).isBoolean())
	//*  64  132:aload_2         
	//*  65  133:invokevirtual   #233 <Method boolean JsonPrimitive.isBoolean()>
	//*  66  136:ifeq            143
				return JsonToken.BOOLEAN;
	//   67  139:getstatic       #153 <Field JsonToken JsonToken.BOOLEAN>
	//   68  142:areturn         
			if(((JsonPrimitive) (obj)).isNumber())
	//*  69  143:aload_2         
	//*  70  144:invokevirtual   #236 <Method boolean JsonPrimitive.isNumber()>
	//*  71  147:ifeq            154
				return JsonToken.NUMBER;
	//   72  150:getstatic       #163 <Field JsonToken JsonToken.NUMBER>
	//   73  153:areturn         
			else
				throw new AssertionError();
	//   74  154:new             #238 <Class AssertionError>
	//   75  157:dup             
	//   76  158:invokespecial   #239 <Method void AssertionError()>
	//   77  161:athrow          
		}
		if(obj instanceof JsonNull)
	//*  78  162:aload_2         
	//*  79  163:instanceof      #241 <Class JsonNull>
	//*  80  166:ifeq            173
			return JsonToken.NULL;
	//   81  169:getstatic       #218 <Field JsonToken JsonToken.NULL>
	//   82  172:areturn         
		if(obj == SENTINEL_CLOSED)
	//*  83  173:aload_2         
	//*  84  174:getstatic       #30  <Field Object SENTINEL_CLOSED>
	//*  85  177:if_acmpne       190
			throw new IllegalStateException("JsonReader is closed");
	//   86  180:new             #59  <Class IllegalStateException>
	//   87  183:dup             
	//   88  184:ldc1            #243 <String "JsonReader is closed">
	//   89  186:invokespecial   #83  <Method void IllegalStateException(String)>
	//   90  189:athrow          
		else
			throw new AssertionError();
	//   91  190:new             #238 <Class AssertionError>
	//   92  193:dup             
	//   93  194:invokespecial   #239 <Method void AssertionError()>
	//   94  197:athrow          
	}

	public void promoteNameToValue()
		throws IOException
	{
		expect(JsonToken.NAME);
	//    0    0:aload_0         
	//    1    1:getstatic       #203 <Field JsonToken JsonToken.NAME>
	//    2    4:invokespecial   #107 <Method void expect(JsonToken)>
		java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
	//    3    7:aload_0         
	//    4    8:invokespecial   #109 <Method Object peekStack()>
	//    5   11:checkcast       #144 <Class Iterator>
	//    6   14:invokeinterface #206 <Method Object Iterator.next()>
	//    7   19:checkcast       #208 <Class java.util.Map$Entry>
	//    8   22:astore_1        
		push(entry.getValue());
	//    9   23:aload_0         
	//   10   24:aload_1         
	//   11   25:invokeinterface #214 <Method Object java.util.Map$Entry.getValue()>
	//   12   30:invokespecial   #49  <Method void push(Object)>
		push(((Object) (new JsonPrimitive((String)entry.getKey()))));
	//   13   33:aload_0         
	//   14   34:new             #155 <Class JsonPrimitive>
	//   15   37:dup             
	//   16   38:aload_1         
	//   17   39:invokeinterface #211 <Method Object java.util.Map$Entry.getKey()>
	//   18   44:checkcast       #41  <Class String>
	//   19   47:invokespecial   #245 <Method void JsonPrimitive(String)>
	//   20   50:invokespecial   #49  <Method void push(Object)>
	//   21   53:return          
	}

	public void skipValue()
		throws IOException
	{
		if(peek() == JsonToken.NAME)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method JsonToken peek()>
	//*   2    4:getstatic       #203 <Field JsonToken JsonToken.NAME>
	//*   3    7:if_acmpne       31
		{
			nextName();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #248 <Method String nextName()>
	//    6   14:pop             
			pathNames[stackSize - 2] = "null";
	//    7   15:aload_0         
	//    8   16:getfield        #43  <Field String[] pathNames>
	//    9   19:aload_0         
	//   10   20:getfield        #39  <Field int stackSize>
	//   11   23:iconst_2        
	//   12   24:isub            
	//   13   25:ldc1            #250 <String "null">
	//   14   27:aastore         
		} else
	//*  15   28:goto            56
		{
			popStack();
	//   16   31:aload_0         
	//   17   32:invokespecial   #135 <Method Object popStack()>
	//   18   35:pop             
			if(stackSize > 0)
	//*  19   36:aload_0         
	//*  20   37:getfield        #39  <Field int stackSize>
	//*  21   40:ifle            56
				pathNames[stackSize - 1] = "null";
	//   22   43:aload_0         
	//   23   44:getfield        #43  <Field String[] pathNames>
	//   24   47:aload_0         
	//   25   48:getfield        #39  <Field int stackSize>
	//   26   51:iconst_1        
	//   27   52:isub            
	//   28   53:ldc1            #250 <String "null">
	//   29   55:aastore         
		}
		if(stackSize > 0)
	//*  30   56:aload_0         
	//*  31   57:getfield        #39  <Field int stackSize>
	//*  32   60:ifle            83
		{
			int ai[] = pathIndices;
	//   33   63:aload_0         
	//   34   64:getfield        #45  <Field int[] pathIndices>
	//   35   67:astore_2        
			int i = stackSize - 1;
	//   36   68:aload_0         
	//   37   69:getfield        #39  <Field int stackSize>
	//   38   72:iconst_1        
	//   39   73:isub            
	//   40   74:istore_1        
			ai[i] = ai[i] + 1;
	//   41   75:aload_2         
	//   42   76:iload_1         
	//   43   77:aload_2         
	//   44   78:iload_1         
	//   45   79:iaload          
	//   46   80:iconst_1        
	//   47   81:iadd            
	//   48   82:iastore         
		}
	//   49   83:return          
	}

	public String toString()
	{
		return ((Object)this).getClass().getSimpleName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #259 <Method String Class.getSimpleName()>
	//    3    7:areturn         
	}

	private static final Object SENTINEL_CLOSED = new Object();
	private static final Reader UNREADABLE_READER = new Reader() {

		public void close()
			throws IOException
		{
			throw new AssertionError();
		//    0    0:new             #16  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public int read(char ac[], int i, int j)
			throws IOException
		{
			throw new AssertionError();
		//    0    0:new             #16  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AssertionError()>
		//    3    7:athrow          
		}

	}
;
	private int pathIndices[];
	private String pathNames[];
	private Object stack[];
	private int stackSize;

	static 
	{
	//    0    0:new             #6   <Class JsonTreeReader$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void JsonTreeReader$1()>
	//    3    7:putstatic       #25  <Field Reader UNREADABLE_READER>
	//    4   10:new             #27  <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void Object()>
	//    7   17:putstatic       #30  <Field Object SENTINEL_CLOSED>
	//*   8   20:return          
	}
}
