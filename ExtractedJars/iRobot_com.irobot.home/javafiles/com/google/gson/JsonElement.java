// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.google.gson:
//			JsonArray, JsonNull, JsonObject, JsonPrimitive

public abstract class JsonElement
{

	public JsonElement()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	abstract JsonElement deepCopy();

	public BigDecimal getAsBigDecimal()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public BigInteger getAsBigInteger()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public boolean getAsBoolean()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	Boolean getAsBooleanWrapper()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public byte getAsByte()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public char getAsCharacter()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public double getAsDouble()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public float getAsFloat()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public int getAsInt()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public JsonArray getAsJsonArray()
	{
		if(isJsonArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method boolean isJsonArray()>
	//*   2    4:ifeq            12
			return (JsonArray)this;
	//    3    7:aload_0         
	//    4    8:checkcast       #51  <Class JsonArray>
	//    5   11:areturn         
		else
			throw new IllegalStateException("This is not a JSON Array.");
	//    6   12:new             #53  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #55  <String "This is not a JSON Array.">
	//    9   18:invokespecial   #56  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public JsonNull getAsJsonNull()
	{
		if(isJsonNull())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #61  <Method boolean isJsonNull()>
	//*   2    4:ifeq            12
			return (JsonNull)this;
	//    3    7:aload_0         
	//    4    8:checkcast       #63  <Class JsonNull>
	//    5   11:areturn         
		else
			throw new IllegalStateException("This is not a JSON Null.");
	//    6   12:new             #53  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #65  <String "This is not a JSON Null.">
	//    9   18:invokespecial   #56  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public JsonObject getAsJsonObject()
	{
		if(isJsonObject())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isJsonObject()>
	//*   2    4:ifeq            12
		{
			return (JsonObject)this;
	//    3    7:aload_0         
	//    4    8:checkcast       #72  <Class JsonObject>
	//    5   11:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #74  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #75  <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("Not a JSON Object: ");
	//   10   20:aload_1         
	//   11   21:ldc1            #77  <String "Not a JSON Object: ">
	//   12   23:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(((Object) (this)));
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   18   33:new             #53  <Class IllegalStateException>
	//   19   36:dup             
	//   20   37:aload_1         
	//   21   38:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   22   41:invokespecial   #56  <Method void IllegalStateException(String)>
	//   23   44:athrow          
		}
	}

	public JsonPrimitive getAsJsonPrimitive()
	{
		if(isJsonPrimitive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #92  <Method boolean isJsonPrimitive()>
	//*   2    4:ifeq            12
			return (JsonPrimitive)this;
	//    3    7:aload_0         
	//    4    8:checkcast       #94  <Class JsonPrimitive>
	//    5   11:areturn         
		else
			throw new IllegalStateException("This is not a JSON Primitive.");
	//    6   12:new             #53  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #96  <String "This is not a JSON Primitive.">
	//    9   18:invokespecial   #56  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public long getAsLong()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public Number getAsNumber()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public short getAsShort()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public String getAsString()
	{
		throw new UnsupportedOperationException(((Object)this).getClass().getSimpleName());
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    5   11:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
	}

	public boolean isJsonArray()
	{
		return this instanceof JsonArray;
	//    0    0:aload_0         
	//    1    1:instanceof      #51  <Class JsonArray>
	//    2    4:ireturn         
	}

	public boolean isJsonNull()
	{
		return this instanceof JsonNull;
	//    0    0:aload_0         
	//    1    1:instanceof      #63  <Class JsonNull>
	//    2    4:ireturn         
	}

	public boolean isJsonObject()
	{
		return this instanceof JsonObject;
	//    0    0:aload_0         
	//    1    1:instanceof      #72  <Class JsonObject>
	//    2    4:ireturn         
	}

	public boolean isJsonPrimitive()
	{
		return this instanceof JsonPrimitive;
	//    0    0:aload_0         
	//    1    1:instanceof      #94  <Class JsonPrimitive>
	//    2    4:ireturn         
	}

	public String toString()
	{
		Object obj;
		try
		{
			obj = ((Object) (new StringWriter()));
	//    0    0:new             #107 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void StringWriter()>
	//    3    7:astore_1        
			JsonWriter jsonwriter = new JsonWriter(((java.io.Writer) (obj)));
	//    4    8:new             #110 <Class JsonWriter>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #113 <Method void JsonWriter(java.io.Writer)>
	//    8   16:astore_2        
			jsonwriter.setLenient(true);
	//    9   17:aload_2         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #117 <Method void JsonWriter.setLenient(boolean)>
			Streams.write(this, jsonwriter);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokestatic    #123 <Method void Streams.write(JsonElement, JsonWriter)>
			obj = ((Object) (((StringWriter) (obj)).toString()));
	//   15   27:aload_1         
	//   16   28:invokevirtual   #124 <Method String StringWriter.toString()>
	//   17   31:astore_1        
		}
	//*  18   32:aload_1         
	//*  19   33:areturn         
		catch(IOException ioexception)
	//*  20   34:astore_1        
		{
			throw new AssertionError(((Object) (ioexception)));
	//   21   35:new             #126 <Class AssertionError>
	//   22   38:dup             
	//   23   39:aload_1         
	//   24   40:invokespecial   #129 <Method void AssertionError(Object)>
	//   25   43:athrow          
		}
		return ((String) (obj));
	}
}
