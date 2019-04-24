// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
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
		throws IOException
	{
		if(peek() != jsontoken)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method JsonToken peek()>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       47
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (jsontoken))).append(" but was ").append(((Object) (peek()))).toString());
	//    4    8:new             #51  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #53  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #54  <Method void StringBuilder()>
	//    9   19:ldc1            #56  <String "Expected ">
	//   10   21:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   13   28:ldc1            #65  <String " but was ">
	//   14   30:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #49  <Method JsonToken peek()>
	//   17   37:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   19   43:invokespecial   #72  <Method void IllegalStateException(String)>
	//   20   46:athrow          
		else
			return;
	//   21   47:return          
	}

	private Object peekStack()
	{
		return stack.get(stack.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List stack>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field List stack>
	//    4    8:invokeinterface #79  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #83  <Method Object List.get(int)>
	//    8   20:areturn         
	}

	private Object popStack()
	{
		return stack.remove(stack.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List stack>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field List stack>
	//    4    8:invokeinterface #79  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #87  <Method Object List.remove(int)>
	//    8   20:areturn         
	}

	public void beginArray()
		throws IOException
	{
		expect(JsonToken.BEGIN_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #94  <Field JsonToken JsonToken.BEGIN_ARRAY>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		JsonArray jsonarray = (JsonArray)peekStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method Object peekStack()>
	//    5   11:checkcast       #100 <Class JsonArray>
	//    6   14:astore_1        
		stack.add(((Object) (jsonarray.iterator())));
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field List stack>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #104 <Method Iterator JsonArray.iterator()>
	//   11   23:invokeinterface #41  <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void beginObject()
		throws IOException
	{
		expect(JsonToken.BEGIN_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #108 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		JsonObject jsonobject = (JsonObject)peekStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method Object peekStack()>
	//    5   11:checkcast       #110 <Class JsonObject>
	//    6   14:astore_1        
		stack.add(((Object) (jsonobject.entrySet().iterator())));
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field List stack>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #114 <Method Set JsonObject.entrySet()>
	//   11   23:invokeinterface #117 <Method Iterator Set.iterator()>
	//   12   28:invokeinterface #41  <Method boolean List.add(Object)>
	//   13   33:pop             
	//   14   34:return          
	}

	public void close()
		throws IOException
	{
		stack.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List stack>
	//    2    4:invokeinterface #121 <Method void List.clear()>
		stack.add(SENTINEL_CLOSED);
	//    3    9:aload_0         
	//    4   10:getfield        #35  <Field List stack>
	//    5   13:getstatic       #25  <Field Object SENTINEL_CLOSED>
	//    6   16:invokeinterface #41  <Method boolean List.add(Object)>
	//    7   21:pop             
	//    8   22:return          
	}

	public void endArray()
		throws IOException
	{
		expect(JsonToken.END_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #125 <Field JsonToken JsonToken.END_ARRAY>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #127 <Method Object popStack()>
	//    5   11:pop             
		popStack();
	//    6   12:aload_0         
	//    7   13:invokespecial   #127 <Method Object popStack()>
	//    8   16:pop             
	//    9   17:return          
	}

	public void endObject()
		throws IOException
	{
		expect(JsonToken.END_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #131 <Field JsonToken JsonToken.END_OBJECT>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #127 <Method Object popStack()>
	//    5   11:pop             
		popStack();
	//    6   12:aload_0         
	//    7   13:invokespecial   #127 <Method Object popStack()>
	//    8   16:pop             
	//    9   17:return          
	}

	public boolean hasNext()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method JsonToken peek()>
	//    2    4:astore_1        
		return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
	//    3    5:aload_1         
	//    4    6:getstatic       #131 <Field JsonToken JsonToken.END_OBJECT>
	//    5    9:if_acmpeq       21
	//    6   12:aload_1         
	//    7   13:getstatic       #125 <Field JsonToken JsonToken.END_ARRAY>
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
	//    1    1:getstatic       #137 <Field JsonToken JsonToken.BOOLEAN>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		return ((JsonPrimitive)popStack()).getAsBoolean();
	//    3    7:aload_0         
	//    4    8:invokespecial   #127 <Method Object popStack()>
	//    5   11:checkcast       #139 <Class JsonPrimitive>
	//    6   14:invokevirtual   #142 <Method boolean JsonPrimitive.getAsBoolean()>
	//    7   17:ireturn         
	}

	public double nextDouble()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method JsonToken peek()>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//*   5    9:if_acmpeq       57
	//*   6   12:aload_3         
	//*   7   13:getstatic       #150 <Field JsonToken JsonToken.STRING>
	//*   8   16:if_acmpeq       57
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.NUMBER))).append(" but was ").append(((Object) (jsontoken))).toString());
	//    9   19:new             #51  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #53  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #54  <Method void StringBuilder()>
	//   14   30:ldc1            #56  <String "Expected ">
	//   15   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//   17   38:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:ldc1            #65  <String " but was ">
	//   19   43:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #72  <Method void IllegalStateException(String)>
	//   24   56:athrow          
		double d = ((JsonPrimitive)peekStack()).getAsDouble();
	//   25   57:aload_0         
	//   26   58:invokespecial   #98  <Method Object peekStack()>
	//   27   61:checkcast       #139 <Class JsonPrimitive>
	//   28   64:invokevirtual   #153 <Method double JsonPrimitive.getAsDouble()>
	//   29   67:dstore_1        
		if(!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
	//*  30   68:aload_0         
	//*  31   69:invokevirtual   #156 <Method boolean isLenient()>
	//*  32   72:ifne            116
	//*  33   75:dload_1         
	//*  34   76:invokestatic    #162 <Method boolean Double.isNaN(double)>
	//*  35   79:ifne            89
	//*  36   82:dload_1         
	//*  37   83:invokestatic    #165 <Method boolean Double.isInfinite(double)>
	//*  38   86:ifeq            116
		{
			throw new NumberFormatException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d).toString());
	//   39   89:new             #167 <Class NumberFormatException>
	//   40   92:dup             
	//   41   93:new             #53  <Class StringBuilder>
	//   42   96:dup             
	//   43   97:invokespecial   #54  <Method void StringBuilder()>
	//   44  100:ldc1            #169 <String "JSON forbids NaN and infinities: ">
	//   45  102:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   46  105:dload_1         
	//   47  106:invokevirtual   #172 <Method StringBuilder StringBuilder.append(double)>
	//   48  109:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   49  112:invokespecial   #173 <Method void NumberFormatException(String)>
	//   50  115:athrow          
		} else
		{
			popStack();
	//   51  116:aload_0         
	//   52  117:invokespecial   #127 <Method Object popStack()>
	//   53  120:pop             
			return d;
	//   54  121:dload_1         
	//   55  122:dreturn         
		}
	}

	public int nextInt()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method JsonToken peek()>
	//    2    4:astore_2        
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//*   5    9:if_acmpeq       57
	//*   6   12:aload_2         
	//*   7   13:getstatic       #150 <Field JsonToken JsonToken.STRING>
	//*   8   16:if_acmpeq       57
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.NUMBER))).append(" but was ").append(((Object) (jsontoken))).toString());
	//    9   19:new             #51  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #53  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #54  <Method void StringBuilder()>
	//   14   30:ldc1            #56  <String "Expected ">
	//   15   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//   17   38:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:ldc1            #65  <String " but was ">
	//   19   43:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_2         
	//   21   47:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #72  <Method void IllegalStateException(String)>
	//   24   56:athrow          
		} else
		{
			int i = ((JsonPrimitive)peekStack()).getAsInt();
	//   25   57:aload_0         
	//   26   58:invokespecial   #98  <Method Object peekStack()>
	//   27   61:checkcast       #139 <Class JsonPrimitive>
	//   28   64:invokevirtual   #177 <Method int JsonPrimitive.getAsInt()>
	//   29   67:istore_1        
			popStack();
	//   30   68:aload_0         
	//   31   69:invokespecial   #127 <Method Object popStack()>
	//   32   72:pop             
			return i;
	//   33   73:iload_1         
	//   34   74:ireturn         
		}
	}

	public long nextLong()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method JsonToken peek()>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//*   5    9:if_acmpeq       57
	//*   6   12:aload_3         
	//*   7   13:getstatic       #150 <Field JsonToken JsonToken.STRING>
	//*   8   16:if_acmpeq       57
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.NUMBER))).append(" but was ").append(((Object) (jsontoken))).toString());
	//    9   19:new             #51  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #53  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #54  <Method void StringBuilder()>
	//   14   30:ldc1            #56  <String "Expected ">
	//   15   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//   17   38:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:ldc1            #65  <String " but was ">
	//   19   43:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #72  <Method void IllegalStateException(String)>
	//   24   56:athrow          
		} else
		{
			long l = ((JsonPrimitive)peekStack()).getAsLong();
	//   25   57:aload_0         
	//   26   58:invokespecial   #98  <Method Object peekStack()>
	//   27   61:checkcast       #139 <Class JsonPrimitive>
	//   28   64:invokevirtual   #182 <Method long JsonPrimitive.getAsLong()>
	//   29   67:lstore_1        
			popStack();
	//   30   68:aload_0         
	//   31   69:invokespecial   #127 <Method Object popStack()>
	//   32   72:pop             
			return l;
	//   33   73:lload_1         
	//   34   74:lreturn         
		}
	}

	public String nextName()
		throws IOException
	{
		expect(JsonToken.NAME);
	//    0    0:aload_0         
	//    1    1:getstatic       #186 <Field JsonToken JsonToken.NAME>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method Object peekStack()>
	//    5   11:checkcast       #188 <Class Iterator>
	//    6   14:invokeinterface #191 <Method Object Iterator.next()>
	//    7   19:checkcast       #193 <Class java.util.Map$Entry>
	//    8   22:astore_1        
		stack.add(entry.getValue());
	//    9   23:aload_0         
	//   10   24:getfield        #35  <Field List stack>
	//   11   27:aload_1         
	//   12   28:invokeinterface #196 <Method Object java.util.Map$Entry.getValue()>
	//   13   33:invokeinterface #41  <Method boolean List.add(Object)>
	//   14   38:pop             
		return (String)entry.getKey();
	//   15   39:aload_1         
	//   16   40:invokeinterface #199 <Method Object java.util.Map$Entry.getKey()>
	//   17   45:checkcast       #201 <Class String>
	//   18   48:areturn         
	}

	public void nextNull()
		throws IOException
	{
		expect(JsonToken.NULL);
	//    0    0:aload_0         
	//    1    1:getstatic       #205 <Field JsonToken JsonToken.NULL>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		popStack();
	//    3    7:aload_0         
	//    4    8:invokespecial   #127 <Method Object popStack()>
	//    5   11:pop             
	//    6   12:return          
	}

	public String nextString()
		throws IOException
	{
		JsonToken jsontoken = peek();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method JsonToken peek()>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.STRING && jsontoken != JsonToken.NUMBER)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #150 <Field JsonToken JsonToken.STRING>
	//*   5    9:if_acmpeq       57
	//*   6   12:aload_1         
	//*   7   13:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//*   8   16:if_acmpeq       57
			throw new IllegalStateException((new StringBuilder()).append("Expected ").append(((Object) (JsonToken.STRING))).append(" but was ").append(((Object) (jsontoken))).toString());
	//    9   19:new             #51  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #53  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #54  <Method void StringBuilder()>
	//   14   30:ldc1            #56  <String "Expected ">
	//   15   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:getstatic       #150 <Field JsonToken JsonToken.STRING>
	//   17   38:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:ldc1            #65  <String " but was ">
	//   19   43:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #72  <Method void IllegalStateException(String)>
	//   24   56:athrow          
		else
			return ((JsonPrimitive)popStack()).getAsString();
	//   25   57:aload_0         
	//   26   58:invokespecial   #127 <Method Object popStack()>
	//   27   61:checkcast       #139 <Class JsonPrimitive>
	//   28   64:invokevirtual   #209 <Method String JsonPrimitive.getAsString()>
	//   29   67:areturn         
	}

	public JsonToken peek()
		throws IOException
	{
		if(stack.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field List stack>
	//*   2    4:invokeinterface #212 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            16
			return JsonToken.END_DOCUMENT;
	//    4   12:getstatic       #215 <Field JsonToken JsonToken.END_DOCUMENT>
	//    5   15:areturn         
		Object obj = peekStack();
	//    6   16:aload_0         
	//    7   17:invokespecial   #98  <Method Object peekStack()>
	//    8   20:astore_2        
		if(obj instanceof Iterator)
	//*   9   21:aload_2         
	//*  10   22:instanceof      #188 <Class Iterator>
	//*  11   25:ifeq            107
		{
			boolean flag = stack.get(stack.size() - 2) instanceof JsonObject;
	//   12   28:aload_0         
	//   13   29:getfield        #35  <Field List stack>
	//   14   32:aload_0         
	//   15   33:getfield        #35  <Field List stack>
	//   16   36:invokeinterface #79  <Method int List.size()>
	//   17   41:iconst_2        
	//   18   42:isub            
	//   19   43:invokeinterface #83  <Method Object List.get(int)>
	//   20   48:instanceof      #110 <Class JsonObject>
	//   21   51:istore_1        
			obj = ((Object) ((Iterator)obj));
	//   22   52:aload_2         
	//   23   53:checkcast       #188 <Class Iterator>
	//   24   56:astore_2        
			if(((Iterator) (obj)).hasNext())
	//*  25   57:aload_2         
	//*  26   58:invokeinterface #217 <Method boolean Iterator.hasNext()>
	//*  27   63:ifeq            95
				if(flag)
	//*  28   66:iload_1         
	//*  29   67:ifeq            74
				{
					return JsonToken.NAME;
	//   30   70:getstatic       #186 <Field JsonToken JsonToken.NAME>
	//   31   73:areturn         
				} else
				{
					stack.add(((Iterator) (obj)).next());
	//   32   74:aload_0         
	//   33   75:getfield        #35  <Field List stack>
	//   34   78:aload_2         
	//   35   79:invokeinterface #191 <Method Object Iterator.next()>
	//   36   84:invokeinterface #41  <Method boolean List.add(Object)>
	//   37   89:pop             
					return peek();
	//   38   90:aload_0         
	//   39   91:invokevirtual   #49  <Method JsonToken peek()>
	//   40   94:areturn         
				}
			if(flag)
	//*  41   95:iload_1         
	//*  42   96:ifeq            103
				return JsonToken.END_OBJECT;
	//   43   99:getstatic       #131 <Field JsonToken JsonToken.END_OBJECT>
	//   44  102:areturn         
			else
				return JsonToken.END_ARRAY;
	//   45  103:getstatic       #125 <Field JsonToken JsonToken.END_ARRAY>
	//   46  106:areturn         
		}
		if(obj instanceof JsonObject)
	//*  47  107:aload_2         
	//*  48  108:instanceof      #110 <Class JsonObject>
	//*  49  111:ifeq            118
			return JsonToken.BEGIN_OBJECT;
	//   50  114:getstatic       #108 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   51  117:areturn         
		if(obj instanceof JsonArray)
	//*  52  118:aload_2         
	//*  53  119:instanceof      #100 <Class JsonArray>
	//*  54  122:ifeq            129
			return JsonToken.BEGIN_ARRAY;
	//   55  125:getstatic       #94  <Field JsonToken JsonToken.BEGIN_ARRAY>
	//   56  128:areturn         
		if(obj instanceof JsonPrimitive)
	//*  57  129:aload_2         
	//*  58  130:instanceof      #139 <Class JsonPrimitive>
	//*  59  133:ifeq            182
		{
			obj = ((Object) ((JsonPrimitive)obj));
	//   60  136:aload_2         
	//   61  137:checkcast       #139 <Class JsonPrimitive>
	//   62  140:astore_2        
			if(((JsonPrimitive) (obj)).isString())
	//*  63  141:aload_2         
	//*  64  142:invokevirtual   #220 <Method boolean JsonPrimitive.isString()>
	//*  65  145:ifeq            152
				return JsonToken.STRING;
	//   66  148:getstatic       #150 <Field JsonToken JsonToken.STRING>
	//   67  151:areturn         
			if(((JsonPrimitive) (obj)).isBoolean())
	//*  68  152:aload_2         
	//*  69  153:invokevirtual   #223 <Method boolean JsonPrimitive.isBoolean()>
	//*  70  156:ifeq            163
				return JsonToken.BOOLEAN;
	//   71  159:getstatic       #137 <Field JsonToken JsonToken.BOOLEAN>
	//   72  162:areturn         
			if(((JsonPrimitive) (obj)).isNumber())
	//*  73  163:aload_2         
	//*  74  164:invokevirtual   #226 <Method boolean JsonPrimitive.isNumber()>
	//*  75  167:ifeq            174
				return JsonToken.NUMBER;
	//   76  170:getstatic       #147 <Field JsonToken JsonToken.NUMBER>
	//   77  173:areturn         
			else
				throw new AssertionError();
	//   78  174:new             #228 <Class AssertionError>
	//   79  177:dup             
	//   80  178:invokespecial   #229 <Method void AssertionError()>
	//   81  181:athrow          
		}
		if(obj instanceof JsonNull)
	//*  82  182:aload_2         
	//*  83  183:instanceof      #231 <Class JsonNull>
	//*  84  186:ifeq            193
			return JsonToken.NULL;
	//   85  189:getstatic       #205 <Field JsonToken JsonToken.NULL>
	//   86  192:areturn         
		if(obj == SENTINEL_CLOSED)
	//*  87  193:aload_2         
	//*  88  194:getstatic       #25  <Field Object SENTINEL_CLOSED>
	//*  89  197:if_acmpne       210
			throw new IllegalStateException("JsonReader is closed");
	//   90  200:new             #51  <Class IllegalStateException>
	//   91  203:dup             
	//   92  204:ldc1            #233 <String "JsonReader is closed">
	//   93  206:invokespecial   #72  <Method void IllegalStateException(String)>
	//   94  209:athrow          
		else
			throw new AssertionError();
	//   95  210:new             #228 <Class AssertionError>
	//   96  213:dup             
	//   97  214:invokespecial   #229 <Method void AssertionError()>
	//   98  217:athrow          
	}

	public void promoteNameToValue()
		throws IOException
	{
		expect(JsonToken.NAME);
	//    0    0:aload_0         
	//    1    1:getstatic       #186 <Field JsonToken JsonToken.NAME>
	//    2    4:invokespecial   #96  <Method void expect(JsonToken)>
		java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method Object peekStack()>
	//    5   11:checkcast       #188 <Class Iterator>
	//    6   14:invokeinterface #191 <Method Object Iterator.next()>
	//    7   19:checkcast       #193 <Class java.util.Map$Entry>
	//    8   22:astore_1        
		stack.add(entry.getValue());
	//    9   23:aload_0         
	//   10   24:getfield        #35  <Field List stack>
	//   11   27:aload_1         
	//   12   28:invokeinterface #196 <Method Object java.util.Map$Entry.getValue()>
	//   13   33:invokeinterface #41  <Method boolean List.add(Object)>
	//   14   38:pop             
		stack.add(((Object) (new JsonPrimitive((String)entry.getKey()))));
	//   15   39:aload_0         
	//   16   40:getfield        #35  <Field List stack>
	//   17   43:new             #139 <Class JsonPrimitive>
	//   18   46:dup             
	//   19   47:aload_1         
	//   20   48:invokeinterface #199 <Method Object java.util.Map$Entry.getKey()>
	//   21   53:checkcast       #201 <Class String>
	//   22   56:invokespecial   #235 <Method void JsonPrimitive(String)>
	//   23   59:invokeinterface #41  <Method boolean List.add(Object)>
	//   24   64:pop             
	//   25   65:return          
	}

	public void skipValue()
		throws IOException
	{
		if(peek() == JsonToken.NAME)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method JsonToken peek()>
	//*   2    4:getstatic       #186 <Field JsonToken JsonToken.NAME>
	//*   3    7:if_acmpne       16
		{
			nextName();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #238 <Method String nextName()>
	//    6   14:pop             
			return;
	//    7   15:return          
		} else
		{
			popStack();
	//    8   16:aload_0         
	//    9   17:invokespecial   #127 <Method Object popStack()>
	//   10   20:pop             
			return;
	//   11   21:return          
		}
	}

	public String toString()
	{
		return ((Object)this).getClass().getSimpleName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #242 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #247 <Method String Class.getSimpleName()>
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
