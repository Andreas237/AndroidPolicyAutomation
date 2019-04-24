// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.*;

public final class JsonTreeReader extends JsonReader
{

	public JsonTreeReader(JsonElement jsonelement)
	{
		super(UNREADABLE_READER);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field Reader UNREADABLE_READER>
	//    2    4:invokespecial   #30  <Method void JsonReader(Reader)>
	//    3    7:aload_0         
	//    4    8:new             #32  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #33  <Method void ArrayList()>
	//    7   15:putfield        #35  <Field List stack>
		stack.add(((Object) (jsonelement)));
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field List stack>
	//   10   22:aload_1         
	//   11   23:invokeinterface #41  <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	private void expect(JsonToken jsontoken)
	{
		if(peek() != jsontoken)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #47  <Method JsonToken peek()>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       57
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #49  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #50  <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("Expected ");
	//    8   16:aload_2         
	//    9   17:ldc1            #52  <String "Expected ">
	//   10   19:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(((Object) (jsontoken)));
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   15   28:pop             
			stringbuilder.append(" but was ");
	//   16   29:aload_2         
	//   17   30:ldc1            #61  <String " but was ">
	//   18   32:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			stringbuilder.append(((Object) (peek())));
	//   20   36:aload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #47  <Method JsonToken peek()>
	//   23   41:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   24   44:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   25   45:new             #63  <Class IllegalStateException>
	//   26   48:dup             
	//   27   49:aload_2         
	//   28   50:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   29   53:invokespecial   #70  <Method void IllegalStateException(String)>
	//   30   56:athrow          
		} else
		{
			return;
	//   31   57:return          
		}
	}

	private Object peekStack()
	{
		return stack.get(stack.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List stack>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field List stack>
	//    4    8:invokeinterface #76  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #80  <Method Object List.get(int)>
	//    8   20:areturn         
	}

	private Object popStack()
	{
		return stack.remove(stack.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List stack>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field List stack>
	//    4    8:invokeinterface #76  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #84  <Method Object List.remove(int)>
	//    8   20:areturn         
	}

	public void beginArray()
	{
		expect(JsonToken.BEGIN_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #91  <Field JsonToken JsonToken.BEGIN_ARRAY>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		JsonArray jsonarray = (JsonArray)peekStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #95  <Method Object peekStack()>
	//    5   11:checkcast       #97  <Class JsonArray>
	//    6   14:astore_1        
		stack.add(((Object) (jsonarray.iterator())));
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field List stack>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #101 <Method Iterator JsonArray.iterator()>
	//   11   23:invokeinterface #41  <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void beginObject()
	{
		expect(JsonToken.BEGIN_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #105 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		JsonObject jsonobject = (JsonObject)peekStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #95  <Method Object peekStack()>
	//    5   11:checkcast       #107 <Class JsonObject>
	//    6   14:astore_1        
		stack.add(((Object) (jsonobject.entrySet().iterator())));
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field List stack>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #111 <Method Set JsonObject.entrySet()>
	//   11   23:invokeinterface #114 <Method Iterator Set.iterator()>
	//   12   28:invokeinterface #41  <Method boolean List.add(Object)>
	//   13   33:pop             
	//   14   34:return          
	}

	public void close()
	{
		stack.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List stack>
	//    2    4:invokeinterface #118 <Method void List.clear()>
		stack.add(SENTINEL_CLOSED);
	//    3    9:aload_0         
	//    4   10:getfield        #35  <Field List stack>
	//    5   13:getstatic       #25  <Field Object SENTINEL_CLOSED>
	//    6   16:invokeinterface #41  <Method boolean List.add(Object)>
	//    7   21:pop             
	//    8   22:return          
	}

	public void endArray()
	{
		expect(JsonToken.END_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #122 <Field JsonToken JsonToken.END_ARRAY>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #124 <Method Object popStack()>
	//    5   11:pop             
		popStack();
	//    6   12:aload_0         
	//    7   13:invokespecial   #124 <Method Object popStack()>
	//    8   16:pop             
	//    9   17:return          
	}

	public void endObject()
	{
		expect(JsonToken.END_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #128 <Field JsonToken JsonToken.END_OBJECT>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #124 <Method Object popStack()>
	//    5   11:pop             
		popStack();
	//    6   12:aload_0         
	//    7   13:invokespecial   #124 <Method Object popStack()>
	//    8   16:pop             
	//    9   17:return          
	}

	public boolean hasNext()
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method JsonToken peek()>
	//    2    4:astore_1        
		return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
	//    3    5:aload_1         
	//    4    6:getstatic       #128 <Field JsonToken JsonToken.END_OBJECT>
	//    5    9:if_acmpeq       21
	//    6   12:aload_1         
	//    7   13:getstatic       #122 <Field JsonToken JsonToken.END_ARRAY>
	//    8   16:if_acmpeq       21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public boolean nextBoolean()
	{
		expect(JsonToken.BOOLEAN);
	//    0    0:aload_0         
	//    1    1:getstatic       #134 <Field JsonToken JsonToken.BOOLEAN>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		return ((JsonPrimitive)popStack()).getAsBoolean();
	//    3    7:aload_0         
	//    4    8:invokespecial   #124 <Method Object popStack()>
	//    5   11:checkcast       #136 <Class JsonPrimitive>
	//    6   14:invokevirtual   #139 <Method boolean JsonPrimitive.getAsBoolean()>
	//    7   17:ireturn         
	}

	public double nextDouble()
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method JsonToken peek()>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//*   5    9:if_acmpeq       73
	//*   6   12:aload_3         
	//*   7   13:getstatic       #147 <Field JsonToken JsonToken.STRING>
	//*   8   16:if_acmpeq       73
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//    9   19:new             #49  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #50  <Method void StringBuilder()>
	//   12   26:astore          4
			stringbuilder1.append("Expected ");
	//   13   28:aload           4
	//   14   30:ldc1            #52  <String "Expected ">
	//   15   32:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
			stringbuilder1.append(((Object) (JsonToken.NUMBER)));
	//   17   36:aload           4
	//   18   38:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//   19   41:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   20   44:pop             
			stringbuilder1.append(" but was ");
	//   21   45:aload           4
	//   22   47:ldc1            #61  <String " but was ">
	//   23   49:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
			stringbuilder1.append(((Object) (jsontoken)));
	//   25   53:aload           4
	//   26   55:aload_3         
	//   27   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   28   59:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//   29   60:new             #63  <Class IllegalStateException>
	//   30   63:dup             
	//   31   64:aload           4
	//   32   66:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   33   69:invokespecial   #70  <Method void IllegalStateException(String)>
	//   34   72:athrow          
		}
		double d = ((JsonPrimitive)peekStack()).getAsDouble();
	//   35   73:aload_0         
	//   36   74:invokespecial   #95  <Method Object peekStack()>
	//   37   77:checkcast       #136 <Class JsonPrimitive>
	//   38   80:invokevirtual   #150 <Method double JsonPrimitive.getAsDouble()>
	//   39   83:dstore_1        
		if(!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
	//*  40   84:aload_0         
	//*  41   85:invokevirtual   #153 <Method boolean isLenient()>
	//*  42   88:ifne            138
	//*  43   91:dload_1         
	//*  44   92:invokestatic    #159 <Method boolean Double.isNaN(double)>
	//*  45   95:ifne            105
	//*  46   98:dload_1         
	//*  47   99:invokestatic    #162 <Method boolean Double.isInfinite(double)>
	//*  48  102:ifeq            138
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   49  105:new             #49  <Class StringBuilder>
	//   50  108:dup             
	//   51  109:invokespecial   #50  <Method void StringBuilder()>
	//   52  112:astore_3        
			stringbuilder.append("JSON forbids NaN and infinities: ");
	//   53  113:aload_3         
	//   54  114:ldc1            #164 <String "JSON forbids NaN and infinities: ">
	//   55  116:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   56  119:pop             
			stringbuilder.append(d);
	//   57  120:aload_3         
	//   58  121:dload_1         
	//   59  122:invokevirtual   #167 <Method StringBuilder StringBuilder.append(double)>
	//   60  125:pop             
			throw new NumberFormatException(stringbuilder.toString());
	//   61  126:new             #169 <Class NumberFormatException>
	//   62  129:dup             
	//   63  130:aload_3         
	//   64  131:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   65  134:invokespecial   #170 <Method void NumberFormatException(String)>
	//   66  137:athrow          
		} else
		{
			popStack();
	//   67  138:aload_0         
	//   68  139:invokespecial   #124 <Method Object popStack()>
	//   69  142:pop             
			return d;
	//   70  143:dload_1         
	//   71  144:dreturn         
		}
	}

	public int nextInt()
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method JsonToken peek()>
	//    2    4:astore_2        
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//*   5    9:if_acmpeq       67
	//*   6   12:aload_2         
	//*   7   13:getstatic       #147 <Field JsonToken JsonToken.STRING>
	//*   8   16:if_acmpeq       67
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   19:new             #49  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #50  <Method void StringBuilder()>
	//   12   26:astore_3        
			stringbuilder.append("Expected ");
	//   13   27:aload_3         
	//   14   28:ldc1            #52  <String "Expected ">
	//   15   30:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(((Object) (JsonToken.NUMBER)));
	//   17   34:aload_3         
	//   18   35:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//   19   38:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   20   41:pop             
			stringbuilder.append(" but was ");
	//   21   42:aload_3         
	//   22   43:ldc1            #61  <String " but was ">
	//   23   45:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			stringbuilder.append(((Object) (jsontoken)));
	//   25   49:aload_3         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   28   54:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   29   55:new             #63  <Class IllegalStateException>
	//   30   58:dup             
	//   31   59:aload_3         
	//   32   60:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   33   63:invokespecial   #70  <Method void IllegalStateException(String)>
	//   34   66:athrow          
		} else
		{
			int i = ((JsonPrimitive)peekStack()).getAsInt();
	//   35   67:aload_0         
	//   36   68:invokespecial   #95  <Method Object peekStack()>
	//   37   71:checkcast       #136 <Class JsonPrimitive>
	//   38   74:invokevirtual   #174 <Method int JsonPrimitive.getAsInt()>
	//   39   77:istore_1        
			popStack();
	//   40   78:aload_0         
	//   41   79:invokespecial   #124 <Method Object popStack()>
	//   42   82:pop             
			return i;
	//   43   83:iload_1         
	//   44   84:ireturn         
		}
	}

	public long nextLong()
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method JsonToken peek()>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//*   5    9:if_acmpeq       73
	//*   6   12:aload_3         
	//*   7   13:getstatic       #147 <Field JsonToken JsonToken.STRING>
	//*   8   16:if_acmpeq       73
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   19:new             #49  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #50  <Method void StringBuilder()>
	//   12   26:astore          4
			stringbuilder.append("Expected ");
	//   13   28:aload           4
	//   14   30:ldc1            #52  <String "Expected ">
	//   15   32:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
			stringbuilder.append(((Object) (JsonToken.NUMBER)));
	//   17   36:aload           4
	//   18   38:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//   19   41:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   20   44:pop             
			stringbuilder.append(" but was ");
	//   21   45:aload           4
	//   22   47:ldc1            #61  <String " but was ">
	//   23   49:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
			stringbuilder.append(((Object) (jsontoken)));
	//   25   53:aload           4
	//   26   55:aload_3         
	//   27   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   28   59:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   29   60:new             #63  <Class IllegalStateException>
	//   30   63:dup             
	//   31   64:aload           4
	//   32   66:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   33   69:invokespecial   #70  <Method void IllegalStateException(String)>
	//   34   72:athrow          
		} else
		{
			long l = ((JsonPrimitive)peekStack()).getAsLong();
	//   35   73:aload_0         
	//   36   74:invokespecial   #95  <Method Object peekStack()>
	//   37   77:checkcast       #136 <Class JsonPrimitive>
	//   38   80:invokevirtual   #179 <Method long JsonPrimitive.getAsLong()>
	//   39   83:lstore_1        
			popStack();
	//   40   84:aload_0         
	//   41   85:invokespecial   #124 <Method Object popStack()>
	//   42   88:pop             
			return l;
	//   43   89:lload_1         
	//   44   90:lreturn         
		}
	}

	public String nextName()
	{
		expect(JsonToken.NAME);
	//    0    0:aload_0         
	//    1    1:getstatic       #183 <Field JsonToken JsonToken.NAME>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
	//    3    7:aload_0         
	//    4    8:invokespecial   #95  <Method Object peekStack()>
	//    5   11:checkcast       #185 <Class Iterator>
	//    6   14:invokeinterface #188 <Method Object Iterator.next()>
	//    7   19:checkcast       #190 <Class java.util.Map$Entry>
	//    8   22:astore_1        
		stack.add(entry.getValue());
	//    9   23:aload_0         
	//   10   24:getfield        #35  <Field List stack>
	//   11   27:aload_1         
	//   12   28:invokeinterface #193 <Method Object java.util.Map$Entry.getValue()>
	//   13   33:invokeinterface #41  <Method boolean List.add(Object)>
	//   14   38:pop             
		return (String)entry.getKey();
	//   15   39:aload_1         
	//   16   40:invokeinterface #196 <Method Object java.util.Map$Entry.getKey()>
	//   17   45:checkcast       #198 <Class String>
	//   18   48:areturn         
	}

	public void nextNull()
	{
		expect(JsonToken.NULL);
	//    0    0:aload_0         
	//    1    1:getstatic       #202 <Field JsonToken JsonToken.NULL>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #124 <Method Object popStack()>
	//    5   11:pop             
	//    6   12:return          
	}

	public String nextString()
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method JsonToken peek()>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.STRING && jsontoken != JsonToken.NUMBER)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #147 <Field JsonToken JsonToken.STRING>
	//*   5    9:if_acmpeq       67
	//*   6   12:aload_1         
	//*   7   13:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//*   8   16:if_acmpeq       67
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   19:new             #49  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #50  <Method void StringBuilder()>
	//   12   26:astore_2        
			stringbuilder.append("Expected ");
	//   13   27:aload_2         
	//   14   28:ldc1            #52  <String "Expected ">
	//   15   30:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(((Object) (JsonToken.STRING)));
	//   17   34:aload_2         
	//   18   35:getstatic       #147 <Field JsonToken JsonToken.STRING>
	//   19   38:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   20   41:pop             
			stringbuilder.append(" but was ");
	//   21   42:aload_2         
	//   22   43:ldc1            #61  <String " but was ">
	//   23   45:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			stringbuilder.append(((Object) (jsontoken)));
	//   25   49:aload_2         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   28   54:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   29   55:new             #63  <Class IllegalStateException>
	//   30   58:dup             
	//   31   59:aload_2         
	//   32   60:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   33   63:invokespecial   #70  <Method void IllegalStateException(String)>
	//   34   66:athrow          
		} else
		{
			return ((JsonPrimitive)popStack()).getAsString();
	//   35   67:aload_0         
	//   36   68:invokespecial   #124 <Method Object popStack()>
	//   37   71:checkcast       #136 <Class JsonPrimitive>
	//   38   74:invokevirtual   #206 <Method String JsonPrimitive.getAsString()>
	//   39   77:areturn         
		}
	}

	public JsonToken peek()
	{
		if(stack.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field List stack>
	//*   2    4:invokeinterface #209 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            16
			return JsonToken.END_DOCUMENT;
	//    4   12:getstatic       #212 <Field JsonToken JsonToken.END_DOCUMENT>
	//    5   15:areturn         
		Object obj = peekStack();
	//    6   16:aload_0         
	//    7   17:invokespecial   #95  <Method Object peekStack()>
	//    8   20:astore_2        
		if(obj instanceof Iterator)
	//*   9   21:aload_2         
	//*  10   22:instanceof      #185 <Class Iterator>
	//*  11   25:ifeq            107
		{
			boolean flag = stack.get(stack.size() - 2) instanceof JsonObject;
	//   12   28:aload_0         
	//   13   29:getfield        #35  <Field List stack>
	//   14   32:aload_0         
	//   15   33:getfield        #35  <Field List stack>
	//   16   36:invokeinterface #76  <Method int List.size()>
	//   17   41:iconst_2        
	//   18   42:isub            
	//   19   43:invokeinterface #80  <Method Object List.get(int)>
	//   20   48:instanceof      #107 <Class JsonObject>
	//   21   51:istore_1        
			obj = ((Object) ((Iterator)obj));
	//   22   52:aload_2         
	//   23   53:checkcast       #185 <Class Iterator>
	//   24   56:astore_2        
			if(((Iterator) (obj)).hasNext())
	//*  25   57:aload_2         
	//*  26   58:invokeinterface #214 <Method boolean Iterator.hasNext()>
	//*  27   63:ifeq            95
				if(flag)
	//*  28   66:iload_1         
	//*  29   67:ifeq            74
				{
					return JsonToken.NAME;
	//   30   70:getstatic       #183 <Field JsonToken JsonToken.NAME>
	//   31   73:areturn         
				} else
				{
					stack.add(((Iterator) (obj)).next());
	//   32   74:aload_0         
	//   33   75:getfield        #35  <Field List stack>
	//   34   78:aload_2         
	//   35   79:invokeinterface #188 <Method Object Iterator.next()>
	//   36   84:invokeinterface #41  <Method boolean List.add(Object)>
	//   37   89:pop             
					return peek();
	//   38   90:aload_0         
	//   39   91:invokevirtual   #47  <Method JsonToken peek()>
	//   40   94:areturn         
				}
			if(flag)
	//*  41   95:iload_1         
	//*  42   96:ifeq            103
				return JsonToken.END_OBJECT;
	//   43   99:getstatic       #128 <Field JsonToken JsonToken.END_OBJECT>
	//   44  102:areturn         
			else
				return JsonToken.END_ARRAY;
	//   45  103:getstatic       #122 <Field JsonToken JsonToken.END_ARRAY>
	//   46  106:areturn         
		}
		if(obj instanceof JsonObject)
	//*  47  107:aload_2         
	//*  48  108:instanceof      #107 <Class JsonObject>
	//*  49  111:ifeq            118
			return JsonToken.BEGIN_OBJECT;
	//   50  114:getstatic       #105 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   51  117:areturn         
		if(obj instanceof JsonArray)
	//*  52  118:aload_2         
	//*  53  119:instanceof      #97  <Class JsonArray>
	//*  54  122:ifeq            129
			return JsonToken.BEGIN_ARRAY;
	//   55  125:getstatic       #91  <Field JsonToken JsonToken.BEGIN_ARRAY>
	//   56  128:areturn         
		if(obj instanceof JsonPrimitive)
	//*  57  129:aload_2         
	//*  58  130:instanceof      #136 <Class JsonPrimitive>
	//*  59  133:ifeq            182
		{
			obj = ((Object) ((JsonPrimitive)obj));
	//   60  136:aload_2         
	//   61  137:checkcast       #136 <Class JsonPrimitive>
	//   62  140:astore_2        
			if(((JsonPrimitive) (obj)).isString())
	//*  63  141:aload_2         
	//*  64  142:invokevirtual   #217 <Method boolean JsonPrimitive.isString()>
	//*  65  145:ifeq            152
				return JsonToken.STRING;
	//   66  148:getstatic       #147 <Field JsonToken JsonToken.STRING>
	//   67  151:areturn         
			if(((JsonPrimitive) (obj)).isBoolean())
	//*  68  152:aload_2         
	//*  69  153:invokevirtual   #220 <Method boolean JsonPrimitive.isBoolean()>
	//*  70  156:ifeq            163
				return JsonToken.BOOLEAN;
	//   71  159:getstatic       #134 <Field JsonToken JsonToken.BOOLEAN>
	//   72  162:areturn         
			if(((JsonPrimitive) (obj)).isNumber())
	//*  73  163:aload_2         
	//*  74  164:invokevirtual   #223 <Method boolean JsonPrimitive.isNumber()>
	//*  75  167:ifeq            174
				return JsonToken.NUMBER;
	//   76  170:getstatic       #144 <Field JsonToken JsonToken.NUMBER>
	//   77  173:areturn         
			else
				throw new AssertionError();
	//   78  174:new             #225 <Class AssertionError>
	//   79  177:dup             
	//   80  178:invokespecial   #226 <Method void AssertionError()>
	//   81  181:athrow          
		}
		if(obj instanceof JsonNull)
	//*  82  182:aload_2         
	//*  83  183:instanceof      #228 <Class JsonNull>
	//*  84  186:ifeq            193
			return JsonToken.NULL;
	//   85  189:getstatic       #202 <Field JsonToken JsonToken.NULL>
	//   86  192:areturn         
		if(obj == SENTINEL_CLOSED)
	//*  87  193:aload_2         
	//*  88  194:getstatic       #25  <Field Object SENTINEL_CLOSED>
	//*  89  197:if_acmpne       210
			throw new IllegalStateException("JsonReader is closed");
	//   90  200:new             #63  <Class IllegalStateException>
	//   91  203:dup             
	//   92  204:ldc1            #230 <String "JsonReader is closed">
	//   93  206:invokespecial   #70  <Method void IllegalStateException(String)>
	//   94  209:athrow          
		else
			throw new AssertionError();
	//   95  210:new             #225 <Class AssertionError>
	//   96  213:dup             
	//   97  214:invokespecial   #226 <Method void AssertionError()>
	//   98  217:athrow          
	}

	public void promoteNameToValue()
	{
		expect(JsonToken.NAME);
	//    0    0:aload_0         
	//    1    1:getstatic       #183 <Field JsonToken JsonToken.NAME>
	//    2    4:invokespecial   #93  <Method void expect(JsonToken)>
		java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
	//    3    7:aload_0         
	//    4    8:invokespecial   #95  <Method Object peekStack()>
	//    5   11:checkcast       #185 <Class Iterator>
	//    6   14:invokeinterface #188 <Method Object Iterator.next()>
	//    7   19:checkcast       #190 <Class java.util.Map$Entry>
	//    8   22:astore_1        
		stack.add(entry.getValue());
	//    9   23:aload_0         
	//   10   24:getfield        #35  <Field List stack>
	//   11   27:aload_1         
	//   12   28:invokeinterface #193 <Method Object java.util.Map$Entry.getValue()>
	//   13   33:invokeinterface #41  <Method boolean List.add(Object)>
	//   14   38:pop             
		stack.add(((Object) (new JsonPrimitive((String)entry.getKey()))));
	//   15   39:aload_0         
	//   16   40:getfield        #35  <Field List stack>
	//   17   43:new             #136 <Class JsonPrimitive>
	//   18   46:dup             
	//   19   47:aload_1         
	//   20   48:invokeinterface #196 <Method Object java.util.Map$Entry.getKey()>
	//   21   53:checkcast       #198 <Class String>
	//   22   56:invokespecial   #232 <Method void JsonPrimitive(String)>
	//   23   59:invokeinterface #41  <Method boolean List.add(Object)>
	//   24   64:pop             
	//   25   65:return          
	}

	public void skipValue()
	{
		if(peek() == JsonToken.NAME)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #47  <Method JsonToken peek()>
	//*   2    4:getstatic       #183 <Field JsonToken JsonToken.NAME>
	//*   3    7:if_acmpne       16
		{
			nextName();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #235 <Method String nextName()>
	//    6   14:pop             
			return;
	//    7   15:return          
		} else
		{
			popStack();
	//    8   16:aload_0         
	//    9   17:invokespecial   #124 <Method Object popStack()>
	//   10   20:pop             
			return;
	//   11   21:return          
		}
	}

	public String toString()
	{
		return ((Object)this).getClass().getSimpleName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #244 <Method String Class.getSimpleName()>
	//    3    7:areturn         
	}

	private static final Object SENTINEL_CLOSED = new Object();
	private static final Reader UNREADABLE_READER = new Reader() {

		public void close()
		{
			throw new AssertionError();
		//    0    0:new             #14  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public int read(char ac[], int i, int j)
		{
			throw new AssertionError();
		//    0    0:new             #14  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void AssertionError()>
		//    3    7:athrow          
		}

	}
;
	private final List stack = new ArrayList();

	static 
	{
	//    0    0:new             #6   <Class JsonTreeReader$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void JsonTreeReader$1()>
	//    3    7:putstatic       #20  <Field Reader UNREADABLE_READER>
	//    4   10:new             #22  <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #23  <Method void Object()>
	//    7   17:putstatic       #25  <Field Object SENTINEL_CLOSED>
	//*   8   20:return          
	}
}
