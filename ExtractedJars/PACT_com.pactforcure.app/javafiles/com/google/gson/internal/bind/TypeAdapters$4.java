// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$4 extends TypeAdapter
{

	public Boolean read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #28  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #31  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return Boolean.valueOf(jsonreader.nextString());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #35  <Method String JsonReader.nextString()>
	//   10   20:invokestatic    #41  <Method Boolean Boolean.valueOf(String)>
	//   11   23:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method Boolean read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Boolean boolean1)
		throws IOException
	{
		if(boolean1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       14
			boolean1 = "null";
	//    2    4:ldc1            #49  <String "null">
	//    3    6:astore_2        
		else
	//*   4    7:aload_1         
	//*   5    8:aload_2         
	//*   6    9:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
	//*   7   12:pop             
	//*   8   13:return          
			boolean1 = ((Boolean) (boolean1.toString()));
	//    9   14:aload_2         
	//   10   15:invokevirtual   #58  <Method String Boolean.toString()>
	//   11   18:astore_2        
		jsonwriter.value(((String) (boolean1)));
	//*  12   19:goto            7
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #37  <Class Boolean>
	//    4    6:invokevirtual   #61  <Method void write(JsonWriter, Boolean)>
	//    5    9:return          
	}

	TypeAdapters$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
