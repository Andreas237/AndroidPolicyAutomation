// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$12 extends TypeAdapter
{

	public Character read(JsonReader jsonreader)
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
		jsonreader = ((JsonReader) (jsonreader.nextString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #33  <Method String JsonReader.nextString()>
	//   10   20:astore_1        
		if(((String) (jsonreader)).length() != 1)
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #39  <Method int String.length()>
	//*  13   25:iconst_1        
	//*  14   26:icmpeq          62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   29:new             #41  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #42  <Method void StringBuilder()>
	//   18   36:astore_2        
			stringbuilder.append("Expecting character, got: ");
	//   19   37:aload_2         
	//   20   38:ldc1            #44  <String "Expecting character, got: ">
	//   21   40:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(((String) (jsonreader)));
	//   23   44:aload_2         
	//   24   45:aload_1         
	//   25   46:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			throw new JsonSyntaxException(stringbuilder.toString());
	//   27   50:new             #50  <Class JsonSyntaxException>
	//   28   53:dup             
	//   29   54:aload_2         
	//   30   55:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   31   58:invokespecial   #56  <Method void JsonSyntaxException(String)>
	//   32   61:athrow          
		} else
		{
			return Character.valueOf(((String) (jsonreader)).charAt(0));
	//   33   62:aload_1         
	//   34   63:iconst_0        
	//   35   64:invokevirtual   #60  <Method char String.charAt(int)>
	//   36   67:invokestatic    #66  <Method Character Character.valueOf(char)>
	//   37   70:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #69  <Method Character read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Character character)
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
	//    6   10:invokestatic    #74  <Method String String.valueOf(Object)>
	//    7   13:astore_2        
		jsonwriter.value(((String) (character)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #80  <Method JsonWriter JsonWriter.value(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Character)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #62  <Class Character>
	//    4    6:invokevirtual   #83  <Method void write(JsonWriter, Character)>
	//    5    9:return          
	}

	TypeAdapters$12()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
