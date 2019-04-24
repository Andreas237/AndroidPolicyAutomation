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
	{
		JsonArray jsonarray = new JsonArray();
	//    0    0:new             #88  <Class JsonArray>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void JsonArray()>
	//    3    7:astore_1        
		put(((JsonElement) (jsonarray)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #98  <Method void put(JsonElement)>
		stack.add(((Object) (jsonarray)));
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field List stack>
	//    9   17:aload_1         
	//   10   18:invokeinterface #101 <Method boolean List.add(Object)>
	//   11   23:pop             
		return ((JsonWriter) (this));
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public JsonWriter beginObject()
	{
		JsonObject jsonobject = new JsonObject();
	//    0    0:new             #79  <Class JsonObject>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void JsonObject()>
	//    3    7:astore_1        
		put(((JsonElement) (jsonobject)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #98  <Method void put(JsonElement)>
		stack.add(((Object) (jsonobject)));
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field List stack>
	//    9   17:aload_1         
	//   10   18:invokeinterface #101 <Method boolean List.add(Object)>
	//   11   23:pop             
		return ((JsonWriter) (this));
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public void close()
	{
		if(!stack.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            22
		{
			throw new IOException("Incomplete document");
	//    4   12:new             #106 <Class IOException>
	//    5   15:dup             
	//    6   16:ldc1            #108 <String "Incomplete document">
	//    7   18:invokespecial   #109 <Method void IOException(String)>
	//    8   21:athrow          
		} else
		{
			stack.add(((Object) (SENTINEL_CLOSED)));
	//    9   22:aload_0         
	//   10   23:getfield        #42  <Field List stack>
	//   11   26:getstatic       #33  <Field JsonPrimitive SENTINEL_CLOSED>
	//   12   29:invokeinterface #101 <Method boolean List.add(Object)>
	//   13   34:pop             
			return;
	//   14   35:return          
		}
	}

	public JsonWriter endArray()
	{
		if(!stack.isEmpty() && pendingName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            63
	//*   4   12:aload_0         
	//*   5   13:getfield        #68  <Field String pendingName>
	//*   6   16:ifnull          22
	//*   7   19:goto            63
		{
			if(peek() instanceof JsonArray)
	//*   8   22:aload_0         
	//*   9   23:invokespecial   #77  <Method JsonElement peek()>
	//*  10   26:instanceof      #88  <Class JsonArray>
	//*  11   29:ifeq            55
			{
				stack.remove(stack.size() - 1);
	//   12   32:aload_0         
	//   13   33:getfield        #42  <Field List stack>
	//   14   36:aload_0         
	//   15   37:getfield        #42  <Field List stack>
	//   16   40:invokeinterface #58  <Method int List.size()>
	//   17   45:iconst_1        
	//   18   46:isub            
	//   19   47:invokeinterface #113 <Method Object List.remove(int)>
	//   20   52:pop             
				return ((JsonWriter) (this));
	//   21   53:aload_0         
	//   22   54:areturn         
			} else
			{
				throw new IllegalStateException();
	//   23   55:new             #92  <Class IllegalStateException>
	//   24   58:dup             
	//   25   59:invokespecial   #93  <Method void IllegalStateException()>
	//   26   62:athrow          
			}
		} else
		{
			throw new IllegalStateException();
	//   27   63:new             #92  <Class IllegalStateException>
	//   28   66:dup             
	//   29   67:invokespecial   #93  <Method void IllegalStateException()>
	//   30   70:athrow          
		}
	}

	public JsonWriter endObject()
	{
		if(!stack.isEmpty() && pendingName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            63
	//*   4   12:aload_0         
	//*   5   13:getfield        #68  <Field String pendingName>
	//*   6   16:ifnull          22
	//*   7   19:goto            63
		{
			if(peek() instanceof JsonObject)
	//*   8   22:aload_0         
	//*   9   23:invokespecial   #77  <Method JsonElement peek()>
	//*  10   26:instanceof      #79  <Class JsonObject>
	//*  11   29:ifeq            55
			{
				stack.remove(stack.size() - 1);
	//   12   32:aload_0         
	//   13   33:getfield        #42  <Field List stack>
	//   14   36:aload_0         
	//   15   37:getfield        #42  <Field List stack>
	//   16   40:invokeinterface #58  <Method int List.size()>
	//   17   45:iconst_1        
	//   18   46:isub            
	//   19   47:invokeinterface #113 <Method Object List.remove(int)>
	//   20   52:pop             
				return ((JsonWriter) (this));
	//   21   53:aload_0         
	//   22   54:areturn         
			} else
			{
				throw new IllegalStateException();
	//   23   55:new             #92  <Class IllegalStateException>
	//   24   58:dup             
	//   25   59:invokespecial   #93  <Method void IllegalStateException()>
	//   26   62:athrow          
			}
		} else
		{
			throw new IllegalStateException();
	//   27   63:new             #92  <Class IllegalStateException>
	//   28   66:dup             
	//   29   67:invokespecial   #93  <Method void IllegalStateException()>
	//   30   70:athrow          
		}
	}

	public void flush()
	{
	//    0    0:return          
	}

	public JsonElement get()
	{
		if(!stack.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            48
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   12:new             #117 <Class StringBuilder>
	//    5   15:dup             
	//    6   16:invokespecial   #118 <Method void StringBuilder()>
	//    7   19:astore_1        
			stringbuilder.append("Expected one JSON element but was ");
	//    8   20:aload_1         
	//    9   21:ldc1            #120 <String "Expected one JSON element but was ">
	//   10   23:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:pop             
			stringbuilder.append(((Object) (stack)));
	//   12   27:aload_1         
	//   13   28:aload_0         
	//   14   29:getfield        #42  <Field List stack>
	//   15   32:invokevirtual   #127 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   17   36:new             #92  <Class IllegalStateException>
	//   18   39:dup             
	//   19   40:aload_1         
	//   20   41:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   21   44:invokespecial   #132 <Method void IllegalStateException(String)>
	//   22   47:athrow          
		} else
		{
			return product;
	//   23   48:aload_0         
	//   24   49:getfield        #50  <Field JsonElement product>
	//   25   52:areturn         
		}
	}

	public JsonWriter name(String s)
	{
		if(!stack.isEmpty() && pendingName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field List stack>
	//*   2    4:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   3    9:ifne            47
	//*   4   12:aload_0         
	//*   5   13:getfield        #68  <Field String pendingName>
	//*   6   16:ifnull          22
	//*   7   19:goto            47
		{
			if(peek() instanceof JsonObject)
	//*   8   22:aload_0         
	//*   9   23:invokespecial   #77  <Method JsonElement peek()>
	//*  10   26:instanceof      #79  <Class JsonObject>
	//*  11   29:ifeq            39
			{
				pendingName = s;
	//   12   32:aload_0         
	//   13   33:aload_1         
	//   14   34:putfield        #68  <Field String pendingName>
				return ((JsonWriter) (this));
	//   15   37:aload_0         
	//   16   38:areturn         
			} else
			{
				throw new IllegalStateException();
	//   17   39:new             #92  <Class IllegalStateException>
	//   18   42:dup             
	//   19   43:invokespecial   #93  <Method void IllegalStateException()>
	//   20   46:athrow          
			}
		} else
		{
			throw new IllegalStateException();
	//   21   47:new             #92  <Class IllegalStateException>
	//   22   50:dup             
	//   23   51:invokespecial   #93  <Method void IllegalStateException()>
	//   24   54:athrow          
		}
	}

	public JsonWriter nullValue()
	{
		put(((JsonElement) (JsonNull.INSTANCE)));
	//    0    0:aload_0         
	//    1    1:getstatic       #48  <Field JsonNull JsonNull.INSTANCE>
	//    2    4:invokespecial   #98  <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public JsonWriter value(double d)
	{
		if(!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #140 <Method boolean isLenient()>
	//*   2    4:ifne            54
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #146 <Method boolean Double.isNaN(double)>
	//*   5   11:ifne            21
	//*   6   14:dload_1         
	//*   7   15:invokestatic    #149 <Method boolean Double.isInfinite(double)>
	//*   8   18:ifeq            54
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #117 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #118 <Method void StringBuilder()>
	//   12   28:astore_3        
			stringbuilder.append("JSON forbids NaN and infinities: ");
	//   13   29:aload_3         
	//   14   30:ldc1            #151 <String "JSON forbids NaN and infinities: ">
	//   15   32:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
			stringbuilder.append(d);
	//   17   36:aload_3         
	//   18   37:dload_1         
	//   19   38:invokevirtual   #154 <Method StringBuilder StringBuilder.append(double)>
	//   20   41:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   42:new             #156 <Class IllegalArgumentException>
	//   22   45:dup             
	//   23   46:aload_3         
	//   24   47:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   25   50:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//   26   53:athrow          
		} else
		{
			put(((JsonElement) (new JsonPrimitive(((Number) (Double.valueOf(d)))))));
	//   27   54:aload_0         
	//   28   55:new             #26  <Class JsonPrimitive>
	//   29   58:dup             
	//   30   59:dload_1         
	//   31   60:invokestatic    #161 <Method Double Double.valueOf(double)>
	//   32   63:invokespecial   #164 <Method void JsonPrimitive(Number)>
	//   33   66:invokespecial   #98  <Method void put(JsonElement)>
			return ((JsonWriter) (this));
	//   34   69:aload_0         
	//   35   70:areturn         
		}
	}

	public JsonWriter value(long l)
	{
		put(((JsonElement) (new JsonPrimitive(((Number) (Long.valueOf(l)))))));
	//    0    0:aload_0         
	//    1    1:new             #26  <Class JsonPrimitive>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:invokestatic    #170 <Method Long Long.valueOf(long)>
	//    5    9:invokespecial   #164 <Method void JsonPrimitive(Number)>
	//    6   12:invokespecial   #98  <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public JsonWriter value(Number number)
	{
		if(number == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #173 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		if(!isLenient())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #140 <Method boolean isLenient()>
	//*   7   13:ifne            72
		{
			double d = number.doubleValue();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #179 <Method double Number.doubleValue()>
	//   10   20:dstore_2        
			if(Double.isNaN(d) || Double.isInfinite(d))
	//*  11   21:dload_2         
	//*  12   22:invokestatic    #146 <Method boolean Double.isNaN(double)>
	//*  13   25:ifne            35
	//*  14   28:dload_2         
	//*  15   29:invokestatic    #149 <Method boolean Double.isInfinite(double)>
	//*  16   32:ifeq            72
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   17   35:new             #117 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #118 <Method void StringBuilder()>
	//   20   42:astore          4
				stringbuilder.append("JSON forbids NaN and infinities: ");
	//   21   44:aload           4
	//   22   46:ldc1            #151 <String "JSON forbids NaN and infinities: ">
	//   23   48:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
				stringbuilder.append(((Object) (number)));
	//   25   52:aload           4
	//   26   54:aload_1         
	//   27   55:invokevirtual   #127 <Method StringBuilder StringBuilder.append(Object)>
	//   28   58:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   29   59:new             #156 <Class IllegalArgumentException>
	//   30   62:dup             
	//   31   63:aload           4
	//   32   65:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   33   68:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//   34   71:athrow          
			}
		}
		put(((JsonElement) (new JsonPrimitive(number))));
	//   35   72:aload_0         
	//   36   73:new             #26  <Class JsonPrimitive>
	//   37   76:dup             
	//   38   77:aload_1         
	//   39   78:invokespecial   #164 <Method void JsonPrimitive(Number)>
	//   40   81:invokespecial   #98  <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//   41   84:aload_0         
	//   42   85:areturn         
	}

	public JsonWriter value(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #173 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		} else
		{
			put(((JsonElement) (new JsonPrimitive(s))));
	//    5    9:aload_0         
	//    6   10:new             #26  <Class JsonPrimitive>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #31  <Method void JsonPrimitive(String)>
	//   10   18:invokespecial   #98  <Method void put(JsonElement)>
			return ((JsonWriter) (this));
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	public JsonWriter value(boolean flag)
	{
		put(((JsonElement) (new JsonPrimitive(Boolean.valueOf(flag)))));
	//    0    0:aload_0         
	//    1    1:new             #26  <Class JsonPrimitive>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokestatic    #185 <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #188 <Method void JsonPrimitive(Boolean)>
	//    6   12:invokespecial   #98  <Method void put(JsonElement)>
		return ((JsonWriter) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");
	private static final Writer UNWRITABLE_WRITER = new Writer() {

		public void close()
		{
			throw new AssertionError();
		//    0    0:new             #14  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void flush()
		{
			throw new AssertionError();
		//    0    0:new             #14  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void write(char ac[], int i, int j)
		{
			throw new AssertionError();
		//    0    0:new             #14  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void AssertionError()>
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
