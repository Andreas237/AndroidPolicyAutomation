// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$15 extends TypeAdapter
{

	public Character read(JsonReader jsonreader)
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
		}
		jsonreader = ((JsonReader) (jsonreader.nextString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #35  <Method String JsonReader.nextString()>
	//   10   20:astore_1        
		if(((String) (jsonreader)).length() != 1)
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #41  <Method int String.length()>
	//*  13   25:iconst_1        
	//*  14   26:icmpeq          56
			throw new JsonSyntaxException((new StringBuilder()).append("Expecting character, got: ").append(((String) (jsonreader))).toString());
	//   15   29:new             #43  <Class JsonSyntaxException>
	//   16   32:dup             
	//   17   33:new             #45  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #46  <Method void StringBuilder()>
	//   20   40:ldc1            #48  <String "Expecting character, got: ">
	//   21   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   25   52:invokespecial   #58  <Method void JsonSyntaxException(String)>
	//   26   55:athrow          
		else
			return Character.valueOf(((String) (jsonreader)).charAt(0));
	//   27   56:aload_1         
	//   28   57:iconst_0        
	//   29   58:invokevirtual   #62  <Method char String.charAt(int)>
	//   30   61:invokestatic    #68  <Method Character Character.valueOf(char)>
	//   31   64:areturn         
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #72  <Method Character read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Character character)
		throws IOException
	{
		if(character == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			character = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			character = ((Character) (String.valueOf(((Object) (character)))));
	//    5    9:aload_2         
	//    6   10:invokestatic    #77  <Method String String.valueOf(Object)>
	//    7   13:astore_2        
		jsonwriter.value(((String) (character)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #83  <Method JsonWriter JsonWriter.value(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Character)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #64  <Class Character>
	//    4    6:invokevirtual   #86  <Method void write(JsonWriter, Character)>
	//    5    9:return          
	}

	TypeAdapters$15()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
