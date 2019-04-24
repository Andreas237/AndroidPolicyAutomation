// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

private static final class TypeAdapters$EnumTypeAdapter extends TypeAdapter
{

	public Enum read(JsonReader jsonreader)
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #76  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #82  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #85  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return (Enum)nameToConstant.get(((Object) (jsonreader.nextString())));
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field Map nameToConstant>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #88  <Method String JsonReader.nextString()>
	//   12   24:invokeinterface #92  <Method Object Map.get(Object)>
	//   13   29:checkcast       #37  <Class Enum>
	//   14   32:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method Enum read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Enum enum)
	{
		if(enum == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			enum = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            23
			enum = ((Enum) ((String)constantToName.get(((Object) (enum)))));
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Map constantToName>
	//    7   13:aload_2         
	//    8   14:invokeinterface #92  <Method Object Map.get(Object)>
	//    9   19:checkcast       #100 <Class String>
	//   10   22:astore_2        
		jsonwriter.value(((String) (enum)));
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #105 <Method JsonWriter JsonWriter.value(String)>
	//   14   28:pop             
	//   15   29:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Enum)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #37  <Class Enum>
	//    4    6:invokevirtual   #109 <Method void write(JsonWriter, Enum)>
	//    5    9:return          
	}

	private final Map constantToName;
	private final Map nameToConstant;

	public TypeAdapters$EnumTypeAdapter(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void TypeAdapter()>
		nameToConstant = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field Map nameToConstant>
		constantToName = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #22  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #23  <Method void HashMap()>
	//   11   23:putfield        #27  <Field Map constantToName>
		int i;
		int j;
		String s;
		Enum aenum[];
		Enum enum;
		SerializedName serializedname;
		try
		{
			aenum = (Enum[])class1.getEnumConstants();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #33  <Method Object[] Class.getEnumConstants()>
	//   14   30:checkcast       #35  <Class Enum[]>
	//   15   33:astore          5
			j = aenum.length;
	//   16   35:aload           5
	//   17   37:arraylength     
	//   18   38:istore_3        
		}
	//*  19   39:iconst_0        
	//*  20   40:istore_2        
	//*  21   41:iload_2         
	//*  22   42:iload_3         
	//*  23   43:icmpge          124
	//*  24   46:aload           5
	//*  25   48:iload_2         
	//*  26   49:aaload          
	//*  27   50:astore          6
	//*  28   52:aload           6
	//*  29   54:invokevirtual   #41  <Method String Enum.name()>
	//*  30   57:astore          4
	//*  31   59:aload_1         
	//*  32   60:aload           4
	//*  33   62:invokevirtual   #45  <Method Field Class.getField(String)>
	//*  34   65:ldc1            #47  <Class SerializedName>
	//*  35   67:invokevirtual   #53  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//*  36   70:checkcast       #47  <Class SerializedName>
	//*  37   73:astore          7
	//*  38   75:aload           7
	//*  39   77:ifnull          89
	//*  40   80:aload           7
	//*  41   82:invokeinterface #56  <Method String SerializedName.value()>
	//*  42   87:astore          4
	//*  43   89:aload_0         
	//*  44   90:getfield        #25  <Field Map nameToConstant>
	//*  45   93:aload           4
	//*  46   95:aload           6
	//*  47   97:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//*  48  102:pop             
	//*  49  103:aload_0         
	//*  50  104:getfield        #27  <Field Map constantToName>
	//*  51  107:aload           6
	//*  52  109:aload           4
	//*  53  111:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//*  54  116:pop             
	//*  55  117:iload_2         
	//*  56  118:iconst_1        
	//*  57  119:iadd            
	//*  58  120:istore_2        
	//*  59  121:goto            41
	//*  60  124:return          
	//*  61  125:new             #64  <Class AssertionError>
	//*  62  128:dup             
	//*  63  129:invokespecial   #65  <Method void AssertionError()>
	//*  64  132:athrow          
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			throw new AssertionError();
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		enum = aenum[i];
		s = enum.name();
		serializedname = (SerializedName)class1.getField(s).getAnnotation(com/google/gson/annotations/SerializedName);
		if(serializedname == null)
			break MISSING_BLOCK_LABEL_89;
		s = serializedname.value();
		nameToConstant.put(((Object) (s)), ((Object) (enum)));
		constantToName.put(((Object) (enum)), ((Object) (s)));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_41;
_L1:
	//*  65  133:astore_1        
	//*  66  134:goto            125
	}
}
