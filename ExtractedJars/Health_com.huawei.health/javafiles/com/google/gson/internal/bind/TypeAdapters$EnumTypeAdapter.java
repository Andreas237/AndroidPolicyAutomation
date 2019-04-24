// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$EnumTypeAdapter extends TypeAdapter
{

	public Enum read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #84  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #90  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #93  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return (Enum)nameToConstant.get(((Object) (jsonreader.nextString())));
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field Map nameToConstant>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #96  <Method String JsonReader.nextString()>
	//   12   24:invokeinterface #100 <Method Object Map.get(Object)>
	//   13   29:checkcast       #37  <Class Enum>
	//   14   32:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method Enum read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, Enum enum)
		throws IOException
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
	//    8   14:invokeinterface #100 <Method Object Map.get(Object)>
	//    9   19:checkcast       #109 <Class String>
	//   10   22:astore_2        
		jsonwriter.value(((String) (enum)));
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #114 <Method JsonWriter JsonWriter.value(String)>
	//   14   28:pop             
	//   15   29:return          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Enum)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #37  <Class Enum>
	//    4    6:invokevirtual   #118 <Method void write(JsonWriter, Enum)>
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
		int k;
		int l;
		String s;
		String s1;
		Enum aenum[];
		Enum enum;
		SerializedName serializedname;
		String as[];
		try
		{
			aenum = (Enum[])class1.getEnumConstants();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #33  <Method Object[] Class.getEnumConstants()>
	//   14   30:checkcast       #35  <Class Enum[]>
	//   15   33:astore          8
			k = aenum.length;
	//   16   35:aload           8
	//   17   37:arraylength     
	//   18   38:istore          4
		}
	//*  19   40:iconst_0        
	//*  20   41:istore_2        
	//*  21   42:iload_2         
	//*  22   43:iload           4
	//*  23   45:icmpge          179
	//*  24   48:aload           8
	//*  25   50:iload_2         
	//*  26   51:aaload          
	//*  27   52:astore          9
	//*  28   54:aload           9
	//*  29   56:invokevirtual   #41  <Method String Enum.name()>
	//*  30   59:astore          6
	//*  31   61:aload_1         
	//*  32   62:aload           6
	//*  33   64:invokevirtual   #45  <Method Field Class.getField(String)>
	//*  34   67:ldc1            #47  <Class SerializedName>
	//*  35   69:invokevirtual   #53  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//*  36   72:checkcast       #47  <Class SerializedName>
	//*  37   75:astore          10
	//*  38   77:aload           10
	//*  39   79:ifnull          144
	//*  40   82:aload           10
	//*  41   84:invokeinterface #56  <Method String SerializedName.value()>
	//*  42   89:astore          7
	//*  43   91:aload           10
	//*  44   93:invokeinterface #60  <Method String[] SerializedName.alternate()>
	//*  45   98:astore          10
	//*  46  100:aload           10
	//*  47  102:arraylength     
	//*  48  103:istore          5
	//*  49  105:iconst_0        
	//*  50  106:istore_3        
	//*  51  107:aload           7
	//*  52  109:astore          6
	//*  53  111:iload_3         
	//*  54  112:iload           5
	//*  55  114:icmpge          144
	//*  56  117:aload           10
	//*  57  119:iload_3         
	//*  58  120:aaload          
	//*  59  121:astore          6
	//*  60  123:aload_0         
	//*  61  124:getfield        #25  <Field Map nameToConstant>
	//*  62  127:aload           6
	//*  63  129:aload           9
	//*  64  131:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//*  65  136:pop             
	//*  66  137:iload_3         
	//*  67  138:iconst_1        
	//*  68  139:iadd            
	//*  69  140:istore_3        
	//*  70  141:goto            107
	//*  71  144:aload_0         
	//*  72  145:getfield        #25  <Field Map nameToConstant>
	//*  73  148:aload           6
	//*  74  150:aload           9
	//*  75  152:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//*  76  157:pop             
	//*  77  158:aload_0         
	//*  78  159:getfield        #27  <Field Map constantToName>
	//*  79  162:aload           9
	//*  80  164:aload           6
	//*  81  166:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//*  82  171:pop             
	//*  83  172:iload_2         
	//*  84  173:iconst_1        
	//*  85  174:iadd            
	//*  86  175:istore_2        
	//*  87  176:goto            42
	//*  88  179:return          
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  89  180:astore_1        
		{
			throw new AssertionError(((Object) (class1)));
	//   90  181:new             #68  <Class AssertionError>
	//   91  184:dup             
	//   92  185:aload_1         
	//   93  186:invokespecial   #71  <Method void AssertionError(Object)>
	//   94  189:athrow          
		}
		i = 0;
		if(i >= k)
			break; /* Loop/switch isn't completed */
		enum = aenum[i];
		s = enum.name();
		serializedname = (SerializedName)class1.getField(s).getAnnotation(com/google/gson/annotations/SerializedName);
		if(serializedname == null) goto _L2; else goto _L1
_L1:
		s1 = serializedname.value();
		as = serializedname.alternate();
		l = as.length;
		j = 0;
_L3:
		s = s1;
		if(j >= l)
			break; /* Loop/switch isn't completed */
		s = as[j];
		nameToConstant.put(((Object) (s)), ((Object) (enum)));
		j++;
		if(true) goto _L3; else goto _L2
_L2:
		nameToConstant.put(((Object) (s)), ((Object) (enum)));
		constantToName.put(((Object) (enum)), ((Object) (s)));
		i++;
		if(true) goto _L5; else goto _L4
_L5:
		break MISSING_BLOCK_LABEL_42;
_L4:
	}
}
