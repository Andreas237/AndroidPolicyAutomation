// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$3 extends TypeAdapter
{

	public Boolean read(JsonReader jsonreader)
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		if(jsonreader.peek() == JsonToken.STRING)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
	//*  10   20:getstatic       #32  <Field JsonToken JsonToken.STRING>
	//*  11   23:if_acmpne       37
			return Boolean.valueOf(Boolean.parseBoolean(jsonreader.nextString()));
	//   12   26:aload_1         
	//   13   27:invokevirtual   #36  <Method String JsonReader.nextString()>
	//   14   30:invokestatic    #42  <Method boolean Boolean.parseBoolean(String)>
	//   15   33:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   16   36:areturn         
		else
			return Boolean.valueOf(jsonreader.nextBoolean());
	//   17   37:aload_1         
	//   18   38:invokevirtual   #50  <Method boolean JsonReader.nextBoolean()>
	//   19   41:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   20   44:areturn         
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method Boolean read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Boolean boolean1)
	{
		if(boolean1 == null)
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
			jsonwriter.value(boolean1.booleanValue());
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #64  <Method boolean Boolean.booleanValue()>
	//    9   15:invokevirtual   #68  <Method JsonWriter JsonWriter.value(boolean)>
	//   10   18:pop             
			return;
	//   11   19:return          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #38  <Class Boolean>
	//    4    6:invokevirtual   #71  <Method void write(JsonWriter, Boolean)>
	//    5    9:return          
	}

	TypeAdapters$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
