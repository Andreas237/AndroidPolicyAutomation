// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class JsonTreeWriter extends JsonWriter
{

	public JsonTreeWriter()
	{
		super(UNWRITABLE_WRITER);
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field Writer UNWRITABLE_WRITER>
	//    2    4:invokespecial   #37  <Method void JsonWriter(Writer)>
	//    3    7:aload_0         
	//    4    8:new             #39  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #40  <Method void ArrayList()>
	//    7   15:putfield        #42  <Field List stack>
		product = ((JsonElement) (JsonNull.INSTANCE));
	//    8   18:aload_0         
	//    9   19:getstatic       #48  <Field JsonNull JsonNull.INSTANCE>
	//   10   22:putfield        #50  <Field JsonElement product>
	//   11   25:return          
	}

	private JsonElement peek()
	{
		return (JsonElement)stack.get(stack.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List stack>
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field List stack>
	//    4    8:invokeinterface #58  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #62  <Method Object List.get(int)>
	//    8   20:checkcast       #64  <Class JsonElement>
	//    9   23:areturn         
	}

	private void put(JsonElement jsonelement)
	{
		if(pendingName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field String pendingName>
	//*   2    4:ifnull          42
		{
			if(!jsonelement.isJsonNull() || getSerializeNulls())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #72  <Method boolean JsonElement.isJsonNull()>
	//*   5   11:ifeq            21
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #75  <Method boolean getSerializeNulls()>
	//*   8   18:ifeq            36
				((JsonObject)peek()).add(pendingName, jsonelement);
	//    9   21:aload_0         
	//   10   22:invokespecial   #77  <Method JsonElement peek()>
	//   11   25:checkcast       #79  <Class JsonObject>
	//   12   28:aload_0         
	//   13   29:getfield        #68  <Field String pendingName>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #83  <Method void JsonObject.add(String, JsonElement)>
			pendingName = null;
	//   16   36:aload_0         
	//   17   37:aconst_null     
	//   18   38:putfield        #68  <Field String pendingName>
			return;
	//   19   41:return          
		}
		if(stack.isEmpty())
	//*  20   42:aload_0         
	//*  21   43:getfield        #42  <Field List stack>
	//*  22   46:invokeinterface #86  <Method boolean List.isEmpty()>
	//*  23   51:ifeq            60
		{
			product = jsonelement;
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:putfield        #50  <Field JsonElement product>
			return;
	//   27   59:return          
		}
		JsonElement jsonelement1 = peek();
	//   28   60:aload_0         
	//   29   61:invokespecial   #77  <Method JsonElement peek()>
	//   30   64:astore_2        
		if(jsonelement1 instanceof JsonArray)
	//*  31   65:aload_2         
	//*  32   66:instanceof      #88  <Class JsonArray>
	//*  33   69:ifeq            81
		{
			((JsonArray)jsonelement1).add(jsonelement);
	//   34   72:aload_2         
	//   35   73:checkcast       #88  <Class JsonArray>
	//   36   76:aload_1         
	//   37   77:invokevirtual   #90  <Method void JsonArray.add(JsonElement)>
			return;
	//   38   80:return          
		} else
		{
			throw new IllegalStateException();
	//   39   81:new             #92  <Class IllegalStateException>
	//   40   84:dup             
	//   41   85:invokespecial   #93  <Method void IllegalStateException()>
	//   42   88:athrow          
		}
	}

	public JsonWriter beginArray()
		throws IOException
	{
		JsonArray jsonarray = new JsonArray();
	//    0    0:new             #88  <Class JsonArray>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void JsonArray()>
	//    3    7:astore_1        
		put(((JsonElement) (jsonarray)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #100 <Method void put(JsonElement)>
		stack.add(((Object) (jsonarray)));
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field List stack>
	//    9   17:aload_1         
	//   10   18:invokeinterface #103 <Method boolean List.add(Object)>
	//   11   23:pop             
		return ((JsonWriter) (this));
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public JsonWriter beginObject()
		throws IOException
	{
		JsonObject jsonobject = new JsonObject();
	//    0    0:new             #79  <Class JsonObject>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void JsonObject()>
	//    3    7:astore_1        
		put(((JsonElement) (jsonobject)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #100 <Method void put(JsonElement)>
		stack.add(((Object) (jsonobject)));
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field List stack>
	//    9   17:aload_1         
	//   10   18:invokeinterface #103 <Method boolean List.add(Object)>
	//   11   23:pop             
		return ((JsonWriter) (this));
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public void close()
		throws IOException
	{
		if(!stack.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            22
		{
			throw new IOException("Incomplete document");
	//    4   12:new             #97  <Class IOException>
	//    5   15:dup             
	//    6   16:ldc1            #109 <String "Incomplete document">
	//    7   18:invokespecial   #110 <Method void IOException(String)>
	//    8   21:athrow          
		} else
		{
			stack.add(((Object) (SENTINEL_CLOSED)));
	//    9   22:aload_0         
	//   10   23:getfield        #42  <Field List stack>
	//   11   26:getstatic       #33  <Field JsonPrimitive SENTINEL_CLOSED>
	//   12   29:invokeinterface #103 <Method boolean List.add(Object)>
	//   13   34:pop             
			return;
	//   14   35:return          
		}
	}

	public JsonWriter endArray()
		throws IOException
	{
		if(stack.isEmpty() || pendingName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            19
	//*   4   12:aload_0         
	//*   5   13:getfield        #68  <Field String pendingName>
	//*   6   16:ifnull          27
			throw new IllegalStateException();
	//    7   19:new             #92  <Class IllegalStateException>
	//    8   22:dup             
	//    9   23:invokespecial   #93  <Method void IllegalStateException()>
	//   10   26:athrow          
		if(peek() instanceof JsonArray)
	//*  11   27:aload_0         
	//*  12   28:invokespecial   #77  <Method JsonElement peek()>
	//*  13   31:instanceof      #88  <Class JsonArray>
	//*  14   34:ifeq            60
		{
			stack.remove(stack.size() - 1);
	//   15   37:aload_0         
	//   16   38:getfield        #42  <Field List stack>
	//   17   41:aload_0         
	//   18   42:getfield        #42  <Field List stack>
	//   19   45:invokeinterface #58  <Method int List.size()>
	//   20   50:iconst_1        
	//   21   51:isub            
	//   22   52:invokeinterface #114 <Method Object List.remove(int)>
	//   23   57:pop             
			return ((JsonWriter) (this));
	//   24   58:aload_0         
	//   25   59:areturn         
		} else
		{
			throw new IllegalStateException();
	//   26   60:new             #92  <Class IllegalStateException>
	//   27   63:dup             
	//   28   64:invokespecial   #93  <Method void IllegalStateException()>
	//   29   67:athrow          
		}
	}

	public JsonWriter endObject()
		throws IOException
	{
		if(stack.isEmpty() || pendingName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            19
	//*   4   12:aload_0         
	//*   5   13:getfield        #68  <Field String pendingName>
	//*   6   16:ifnull          27
			throw new IllegalStateException();
	//    7   19:new             #92  <Class IllegalStateException>
	//    8   22:dup             
	//    9   23:invokespecial   #93  <Method void IllegalStateException()>
	//   10   26:athrow          
		if(peek() instanceof JsonObject)
	//*  11   27:aload_0         
	//*  12   28:invokespecial   #77  <Method JsonElement peek()>
	//*  13   31:instanceof      #79  <Class JsonObject>
	//*  14   34:ifeq            60
		{
			stack.remove(stack.size() - 1);
	//   15   37:aload_0         
	//   16   38:getfield        #42  <Field List stack>
	//   17   41:aload_0         
	//   18   42:getfield        #42  <Field List stack>
	//   19   45:invokeinterface #58  <Method int List.size()>
	//   20   50:iconst_1        
	//   21   51:isub            
	//   22   52:invokeinterface #114 <Method Object List.remove(int)>
	//   23   57:pop             
			return ((JsonWriter) (this));
	//   24   58:aload_0         
	//   25   59:areturn         
		} else
		{
			throw new IllegalStateException();
	//   26   60:new             #92  <Class IllegalStateException>
	//   27   63:dup             
	//   28   64:invokespecial   #93  <Method void IllegalStateException()>
	//   29   67:athrow          
		}
	}

	public void flush()
		throws IOException
	{
	//    0    0:return          
	}

	public JsonElement get()
	{
		if(!stack.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            42
			throw new IllegalStateException((new StringBuilder()).append("Expected one JSON element but was ").append(((Object) (stack))).toString());
	//    4   12:new             #92  <Class IllegalStateException>
	//    5   15:dup             
	//    6   16:new             #118 <Class StringBuilder>
	//    7   19:dup             
	//    8   20:invokespecial   #119 <Method void StringBuilder()>
	//    9   23:ldc1            #121 <String "Expected one JSON element but was ">
	//   10   25:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   11   28:aload_0         
	//   12   29:getfield        #42  <Field List stack>
	//   13   32:invokevirtual   #128 <Method StringBuilder StringBuilder.append(Object)>
	//   14   35:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   15   38:invokespecial   #133 <Method void IllegalStateException(String)>
	//   16   41:athrow          
		else
			return product;
	//   17   42:aload_0         
	//   18   43:getfield        #50  <Field JsonElement product>
	//   19   46:areturn         
	}

	public JsonWriter name(String s)
		throws IOException
	{
		if(stack.isEmpty() || pendingName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            19
	//*   4   12:aload_0         
	//*   5   13:getfield        #68  <Field String pendingName>
	//*   6   16:ifnull          27
			throw new IllegalStateException();
	//    7   19:new             #92  <Class IllegalStateException>
	//    8   22:dup             
	//    9   23:invokespecial   #93  <Method void IllegalStateException()>
	//   10   26:athrow          
		if(peek() instanceof JsonObject)
	//*  11   27:aload_0         
	//*  12   28:invokespecial   #77  <Method JsonElement peek()>
	//*  13   31:instanceof      #79  <Class JsonObject>
	//*  14   34:ifeq            44
		{
			pendingName = s;
	//   15   37:aload_0         
	//   16   38:aload_1         
	//   17   39:putfield        #68  <Field String pendingName>
			return ((JsonWriter) (this));
	//   18   42:aload_0         
	//   19   43:areturn         
		} else
		{
			throw new IllegalStateException();
	//   20   44:new             #92  <Class IllegalStateException>
	//   21   47:dup             
	//   22   48:invokespecial   #93  <Method void IllegalStateException()>
	//   23   51:athrow          
		}
	}

	public JsonWriter nullValue()
		throws IOException
	{
		put(((JsonElement) (JsonNull.INSTANCE)));
	//    0    0:aload_0         
	//    1    1:getstatic       #48  <Field JsonNull JsonNull.INSTANCE>
	//    2    4:invokespecial   #100 <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public JsonWriter value(double d)
		throws IOException
	{
		if(!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #141 <Method boolean isLenient()>
	//*   2    4:ifne            48
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #147 <Method boolean Double.isNaN(double)>
	//*   5   11:ifne            21
	//*   6   14:dload_1         
	//*   7   15:invokestatic    #150 <Method boolean Double.isInfinite(double)>
	//*   8   18:ifeq            48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d).toString());
	//    9   21:new             #152 <Class IllegalArgumentException>
	//   10   24:dup             
	//   11   25:new             #118 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #119 <Method void StringBuilder()>
	//   14   32:ldc1            #154 <String "JSON forbids NaN and infinities: ">
	//   15   34:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:dload_1         
	//   17   38:invokevirtual   #157 <Method StringBuilder StringBuilder.append(double)>
	//   18   41:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   19   44:invokespecial   #158 <Method void IllegalArgumentException(String)>
	//   20   47:athrow          
		} else
		{
			put(((JsonElement) (new JsonPrimitive(((Number) (Double.valueOf(d)))))));
	//   21   48:aload_0         
	//   22   49:new             #26  <Class JsonPrimitive>
	//   23   52:dup             
	//   24   53:dload_1         
	//   25   54:invokestatic    #162 <Method Double Double.valueOf(double)>
	//   26   57:invokespecial   #165 <Method void JsonPrimitive(Number)>
	//   27   60:invokespecial   #100 <Method void put(JsonElement)>
			return ((JsonWriter) (this));
	//   28   63:aload_0         
	//   29   64:areturn         
		}
	}

	public JsonWriter value(long l)
		throws IOException
	{
		put(((JsonElement) (new JsonPrimitive(((Number) (Long.valueOf(l)))))));
	//    0    0:aload_0         
	//    1    1:new             #26  <Class JsonPrimitive>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:invokestatic    #171 <Method Long Long.valueOf(long)>
	//    5    9:invokespecial   #165 <Method void JsonPrimitive(Number)>
	//    6   12:invokespecial   #100 <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public JsonWriter value(Boolean boolean1)
		throws IOException
	{
		if(boolean1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #174 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		} else
		{
			put(((JsonElement) (new JsonPrimitive(boolean1))));
	//    5    9:aload_0         
	//    6   10:new             #26  <Class JsonPrimitive>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #177 <Method void JsonPrimitive(Boolean)>
	//   10   18:invokespecial   #100 <Method void put(JsonElement)>
			return ((JsonWriter) (this));
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	public JsonWriter value(Number number)
		throws IOException
	{
		if(number == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #174 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		if(!isLenient())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #141 <Method boolean isLenient()>
	//*   7   13:ifne            62
		{
			double d = number.doubleValue();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #184 <Method double Number.doubleValue()>
	//   10   20:dstore_2        
			if(Double.isNaN(d) || Double.isInfinite(d))
	//*  11   21:dload_2         
	//*  12   22:invokestatic    #147 <Method boolean Double.isNaN(double)>
	//*  13   25:ifne            35
	//*  14   28:dload_2         
	//*  15   29:invokestatic    #150 <Method boolean Double.isInfinite(double)>
	//*  16   32:ifeq            62
				throw new IllegalArgumentException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(((Object) (number))).toString());
	//   17   35:new             #152 <Class IllegalArgumentException>
	//   18   38:dup             
	//   19   39:new             #118 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #119 <Method void StringBuilder()>
	//   22   46:ldc1            #154 <String "JSON forbids NaN and infinities: ">
	//   23   48:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:aload_1         
	//   25   52:invokevirtual   #128 <Method StringBuilder StringBuilder.append(Object)>
	//   26   55:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   27   58:invokespecial   #158 <Method void IllegalArgumentException(String)>
	//   28   61:athrow          
		}
		put(((JsonElement) (new JsonPrimitive(number))));
	//   29   62:aload_0         
	//   30   63:new             #26  <Class JsonPrimitive>
	//   31   66:dup             
	//   32   67:aload_1         
	//   33   68:invokespecial   #165 <Method void JsonPrimitive(Number)>
	//   34   71:invokespecial   #100 <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//   35   74:aload_0         
	//   36   75:areturn         
	}

	public JsonWriter value(String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #174 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		} else
		{
			put(((JsonElement) (new JsonPrimitive(s))));
	//    5    9:aload_0         
	//    6   10:new             #26  <Class JsonPrimitive>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #31  <Method void JsonPrimitive(String)>
	//   10   18:invokespecial   #100 <Method void put(JsonElement)>
			return ((JsonWriter) (this));
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	public JsonWriter value(boolean flag)
		throws IOException
	{
		put(((JsonElement) (new JsonPrimitive(Boolean.valueOf(flag)))));
	//    0    0:aload_0         
	//    1    1:new             #26  <Class JsonPrimitive>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokestatic    #190 <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #177 <Method void JsonPrimitive(Boolean)>
	//    6   12:invokespecial   #100 <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");
	private static final Writer UNWRITABLE_WRITER = new Writer() {

		public void close()
			throws IOException
		{
			throw new AssertionError();
		//    0    0:new             #16  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void flush()
			throws IOException
		{
			throw new AssertionError();
		//    0    0:new             #16  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void write(char ac[], int i, int j)
		{
			throw new AssertionError();
		//    0    0:new             #16  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AssertionError()>
		//    3    7:athrow          
		}

	}
;
	private String pendingName;
	private JsonElement product;
	private final List stack = new ArrayList();

	static 
	{
	//    0    0:new             #6   <Class JsonTreeWriter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void JsonTreeWriter$1()>
	//    3    7:putstatic       #24  <Field Writer UNWRITABLE_WRITER>
	//    4   10:new             #26  <Class JsonPrimitive>
	//    5   13:dup             
	//    6   14:ldc1            #28  <String "closed">
	//    7   16:invokespecial   #31  <Method void JsonPrimitive(String)>
	//    8   19:putstatic       #33  <Field JsonPrimitive SENTINEL_CLOSED>
	//*   9   22:return          
	}
}
