// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$4 extends TypeAdapter
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
		} else
		{
			return Boolean.valueOf(jsonreader.nextString());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #33  <Method String JsonReader.nextString()>
	//   10   20:invokestatic    #39  <Method Boolean Boolean.valueOf(String)>
	//   11   23:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method Boolean read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			boolean1 = "null";
	//    2    4:ldc1            #46  <String "null">
	//    3    6:astore_2        
		else
	//*   4    7:goto            15
			boolean1 = ((Boolean) (boolean1.toString()));
	//    5   10:aload_2         
	//    6   11:invokevirtual   #49  <Method String Boolean.toString()>
	//    7   14:astore_2        
		jsonwriter.value(((String) (boolean1)));
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
	//   11   20:pop             
	//   12   21:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class Boolean>
	//    4    6:invokevirtual   #58  <Method void write(JsonWriter, Boolean)>
	//    5    9:return          
	}

	TypeAdapters$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
