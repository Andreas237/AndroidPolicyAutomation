// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//			TypeAdapter

class TypeAdapter$1 extends TypeAdapter
{

	public Object read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return TypeAdapter.this.read(jsonreader);
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field TypeAdapter this$0>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #39  <Method Object TypeAdapter.read(JsonReader)>
	//   12   24:areturn         
		}
	}

	public void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
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
	//   10   16:invokevirtual   #52  <Method void TypeAdapter.write(JsonWriter, Object)>
			return;
	//   11   19:return          
		}
	}

	final TypeAdapter this$0;

	TypeAdapter$1()
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
