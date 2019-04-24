// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//			TypeAdapter, Gson

class Gson$4 extends TypeAdapter
{

	public Float read(JsonReader jsonreader)
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
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return Float.valueOf((float)jsonreader.nextDouble());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method double JsonReader.nextDouble()>
	//   10   20:d2f             
	//   11   21:invokestatic    #47  <Method Float Float.valueOf(float)>
	//   12   24:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method Float read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Number number)
	{
		if(number == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			float f = number.floatValue();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #64  <Method float Number.floatValue()>
	//    8   14:fstore_3        
			Gson.access$000(Gson.this, f);
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field Gson this$0>
	//   11   19:fload_3         
	//   12   20:f2d             
	//   13   21:invokestatic    #68  <Method void Gson.access$000(Gson, double)>
			jsonwriter.value(number);
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #72  <Method JsonWriter JsonWriter.value(Number)>
	//   17   29:pop             
			return;
	//   18   30:return          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #60  <Class Number>
	//    4    6:invokevirtual   #75  <Method void write(JsonWriter, Number)>
	//    5    9:return          
	}

	final Gson this$0;

	Gson$4()
	{
		this$0 = Gson.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Gson this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void TypeAdapter()>
	//    5    9:return          
	}
}
