// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//			TypeAdapter, Gson

class Gson$1 extends TypeAdapter
{

	public Double read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #30  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #36  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #39  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return Double.valueOf(jsonreader.nextDouble());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #43  <Method double JsonReader.nextDouble()>
	//   10   20:invokestatic    #49  <Method Double Double.valueOf(double)>
	//   11   23:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method Double read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Number number)
		throws IOException
	{
		if(number == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			Gson.checkValidFloatingPoint(number.doubleValue());
	//    6   10:aload_2         
	//    7   11:invokevirtual   #66  <Method double Number.doubleValue()>
	//    8   14:invokestatic    #70  <Method void Gson.checkValidFloatingPoint(double)>
			jsonwriter.value(number);
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #74  <Method JsonWriter JsonWriter.value(Number)>
	//   12   22:pop             
			return;
	//   13   23:return          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #63  <Class Number>
	//    4    6:invokevirtual   #77  <Method void write(JsonWriter, Number)>
	//    5    9:return          
	}

	final Gson this$0;

	Gson$1()
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
