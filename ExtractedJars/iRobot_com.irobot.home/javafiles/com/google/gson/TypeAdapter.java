// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.*;

// Referenced classes of package com.google.gson:
//			JsonIOException, JsonElement

public abstract class TypeAdapter
{

	public TypeAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object fromJson(Reader reader)
	{
		return read(new JsonReader(reader));
	//    0    0:aload_0         
	//    1    1:new             #16  <Class JsonReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #19  <Method void JsonReader(Reader)>
	//    5    9:invokevirtual   #23  <Method Object read(JsonReader)>
	//    6   12:areturn         
	}

	public final Object fromJson(String s)
	{
		return fromJson(((Reader) (new StringReader(s))));
	//    0    0:aload_0         
	//    1    1:new             #28  <Class StringReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #31  <Method void StringReader(String)>
	//    5    9:invokevirtual   #33  <Method Object fromJson(Reader)>
	//    6   12:areturn         
	}

	public final Object fromJsonTree(JsonElement jsonelement)
	{
		try
		{
			jsonelement = ((JsonElement) (read(((JsonReader) (new JsonTreeReader(jsonelement))))));
	//    0    0:aload_0         
	//    1    1:new             #40  <Class JsonTreeReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #43  <Method void JsonTreeReader(JsonElement)>
	//    5    9:invokevirtual   #23  <Method Object read(JsonReader)>
	//    6   12:astore_1        
		}
	//*   7   13:aload_1         
	//*   8   14:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonElement jsonelement)
	//*   9   15:astore_1        
		{
			throw new JsonIOException(((Throwable) (jsonelement)));
	//   10   16:new             #45  <Class JsonIOException>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:invokespecial   #48  <Method void JsonIOException(Throwable)>
	//   14   24:athrow          
		}
		return ((Object) (jsonelement));
	}

	public final TypeAdapter nullSafe()
	{
		return ((TypeAdapter) (new TypeAdapter() {

			public Object read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return ((Object) (null));
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return TypeAdapter.this.read(jsonreader);
			//    8   16:aload_0         
			//    9   17:getfield        #14  <Field TypeAdapter this$0>
			//   10   20:aload_1         
			//   11   21:invokevirtual   #37  <Method Object TypeAdapter.read(JsonReader)>
			//   12   24:areturn         
				}
			}

			public void write(JsonWriter jsonwriter, Object obj)
			{
				if(obj == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #47  <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				} else
				{
					TypeAdapter.this.write(jsonwriter, obj);
			//    6   10:aload_0         
			//    7   11:getfield        #14  <Field TypeAdapter this$0>
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #49  <Method void TypeAdapter.write(JsonWriter, Object)>
					return;
			//   11   19:return          
				}
			}

			final TypeAdapter this$0;

			
			{
				this$0 = TypeAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TypeAdapter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void TypeAdapter()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #7   <Class TypeAdapter$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void TypeAdapter$1(TypeAdapter)>
	//    4    8:areturn         
	}

	public abstract Object read(JsonReader jsonreader);

	public final String toJson(Object obj)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #59  <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringWriter()>
	//    3    7:astore_2        
		toJson(((Writer) (stringwriter)), obj);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #63  <Method void toJson(Writer, Object)>
		return stringwriter.toString();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #67  <Method String StringWriter.toString()>
	//   10   18:areturn         
	}

	public final void toJson(Writer writer, Object obj)
	{
		write(new JsonWriter(writer), obj);
	//    0    0:aload_0         
	//    1    1:new             #70  <Class JsonWriter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #73  <Method void JsonWriter(Writer)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #77  <Method void write(JsonWriter, Object)>
	//    7   13:return          
	}

	public final JsonElement toJsonTree(Object obj)
	{
		try
		{
			JsonTreeWriter jsontreewriter = new JsonTreeWriter();
	//    0    0:new             #82  <Class JsonTreeWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void JsonTreeWriter()>
	//    3    7:astore_2        
			write(((JsonWriter) (jsontreewriter)), obj);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #77  <Method void write(JsonWriter, Object)>
			obj = ((Object) (jsontreewriter.get()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #87  <Method JsonElement JsonTreeWriter.get()>
	//   10   18:astore_1        
		}
	//*  11   19:aload_1         
	//*  12   20:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  13   21:astore_1        
		{
			throw new JsonIOException(((Throwable) (obj)));
	//   14   22:new             #45  <Class JsonIOException>
	//   15   25:dup             
	//   16   26:aload_1         
	//   17   27:invokespecial   #48  <Method void JsonIOException(Throwable)>
	//   18   30:athrow          
		}
		return ((JsonElement) (obj));
	}

	public abstract void write(JsonWriter jsonwriter, Object obj);
}
