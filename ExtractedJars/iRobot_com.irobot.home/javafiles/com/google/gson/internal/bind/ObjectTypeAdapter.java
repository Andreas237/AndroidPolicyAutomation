// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.util.*;

public final class ObjectTypeAdapter extends TypeAdapter
{

	private ObjectTypeAdapter(Gson gson1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void TypeAdapter()>
		gson = gson1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Gson gson>
	//    5    9:return          
	}


	public Object read(JsonReader jsonreader)
	{
		Object obj = ((Object) (jsonreader.peek()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method JsonToken JsonReader.peek()>
	//    2    4:astore_2        
		static class _cls2
		{

			static final int $SwitchMap$com$google$gson$stream$JsonToken[];

			static 
			{
				$SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];
			//    0    0:invokestatic    #18  <Method JsonToken[] JsonToken.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//    5   12:getstatic       #24  <Field JsonToken JsonToken.BEGIN_ARRAY>
			//    6   15:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//*  10   23:getstatic       #31  <Field JsonToken JsonToken.BEGIN_OBJECT>
			//*  11   26:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//*  15   34:getstatic       #34  <Field JsonToken JsonToken.STRING>
			//*  16   37:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//*  20   45:getstatic       #37  <Field JsonToken JsonToken.NUMBER>
			//*  21   48:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//*  25   56:getstatic       #40  <Field JsonToken JsonToken.BOOLEAN>
			//*  26   59:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//*  30   67:getstatic       #43  <Field JsonToken JsonToken.NULL>
			//*  31   70:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   35   77:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
				}
			//*  36   78:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   37   81:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
				}
			//*  38   82:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   39   85:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
				}
			//*  40   86:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   41   89:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
				}
			//*  42   90:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   43   93:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
				}
			//*  44   94:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   97:astore_0        
			//*  46   98:return          
			}
		}

		switch(_cls2..SwitchMap.com.google.gson.stream.JsonToken[((JsonToken) (obj)).ordinal()])
	//*   3    5:getstatic       #40  <Field int[] ObjectTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #46  <Method int JsonToken.ordinal()>
	//*   6   12:iaload          
		{
	//*   7   13:tableswitch     1 6: default 52
	//	               1 131
	//	               2 87
	//	               3 82
	//	               4 74
	//	               5 66
	//	               6 60
		default:
			throw new IllegalStateException();
	//    8   52:new             #48  <Class IllegalStateException>
	//    9   55:dup             
	//   10   56:invokespecial   #49  <Method void IllegalStateException()>
	//   11   59:athrow          

		case 6: // '\006'
			jsonreader.nextNull();
	//   12   60:aload_1         
	//   13   61:invokevirtual   #52  <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//   14   64:aconst_null     
	//   15   65:areturn         

		case 5: // '\005'
			return ((Object) (Boolean.valueOf(jsonreader.nextBoolean())));
	//   16   66:aload_1         
	//   17   67:invokevirtual   #56  <Method boolean JsonReader.nextBoolean()>
	//   18   70:invokestatic    #62  <Method Boolean Boolean.valueOf(boolean)>
	//   19   73:areturn         

		case 4: // '\004'
			return ((Object) (Double.valueOf(jsonreader.nextDouble())));
	//   20   74:aload_1         
	//   21   75:invokevirtual   #66  <Method double JsonReader.nextDouble()>
	//   22   78:invokestatic    #71  <Method Double Double.valueOf(double)>
	//   23   81:areturn         

		case 3: // '\003'
			return ((Object) (jsonreader.nextString()));
	//   24   82:aload_1         
	//   25   83:invokevirtual   #75  <Method String JsonReader.nextString()>
	//   26   86:areturn         

		case 2: // '\002'
			obj = ((Object) (new LinkedTreeMap()));
	//   27   87:new             #77  <Class LinkedTreeMap>
	//   28   90:dup             
	//   29   91:invokespecial   #78  <Method void LinkedTreeMap()>
	//   30   94:astore_2        
			jsonreader.beginObject();
	//   31   95:aload_1         
	//   32   96:invokevirtual   #81  <Method void JsonReader.beginObject()>
			for(; jsonreader.hasNext(); ((Map) (obj)).put(((Object) (jsonreader.nextName())), read(jsonreader)));
	//   33   99:aload_1         
	//   34  100:invokevirtual   #84  <Method boolean JsonReader.hasNext()>
	//   35  103:ifeq            125
	//   36  106:aload_2         
	//   37  107:aload_1         
	//   38  108:invokevirtual   #87  <Method String JsonReader.nextName()>
	//   39  111:aload_0         
	//   40  112:aload_1         
	//   41  113:invokevirtual   #89  <Method Object read(JsonReader)>
	//   42  116:invokeinterface #95  <Method Object Map.put(Object, Object)>
	//   43  121:pop             
	//*  44  122:goto            99
			jsonreader.endObject();
	//   45  125:aload_1         
	//   46  126:invokevirtual   #98  <Method void JsonReader.endObject()>
			return obj;
	//   47  129:aload_2         
	//   48  130:areturn         

		case 1: // '\001'
			obj = ((Object) (new ArrayList()));
	//   49  131:new             #100 <Class ArrayList>
	//   50  134:dup             
	//   51  135:invokespecial   #101 <Method void ArrayList()>
	//   52  138:astore_2        
			jsonreader.beginArray();
	//   53  139:aload_1         
	//   54  140:invokevirtual   #104 <Method void JsonReader.beginArray()>
			break;
		}
		for(; jsonreader.hasNext(); ((List) (obj)).add(read(jsonreader)));
	//   55  143:aload_1         
	//   56  144:invokevirtual   #84  <Method boolean JsonReader.hasNext()>
	//   57  147:ifeq            165
	//   58  150:aload_2         
	//   59  151:aload_0         
	//   60  152:aload_1         
	//   61  153:invokevirtual   #89  <Method Object read(JsonReader)>
	//   62  156:invokeinterface #110 <Method boolean List.add(Object)>
	//   63  161:pop             
	//*  64  162:goto            143
		jsonreader.endArray();
	//   65  165:aload_1         
	//   66  166:invokevirtual   #113 <Method void JsonReader.endArray()>
		return obj;
	//   67  169:aload_2         
	//   68  170:areturn         
	}

	public void write(JsonWriter jsonwriter, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #121 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		TypeAdapter typeadapter = gson.getAdapter(obj.getClass());
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field Gson gson>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #127 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #133 <Method TypeAdapter Gson.getAdapter(Class)>
	//   11   21:astore_3        
		if(typeadapter instanceof ObjectTypeAdapter)
	//*  12   22:aload_3         
	//*  13   23:instanceof      #2   <Class ObjectTypeAdapter>
	//*  14   26:ifeq            40
		{
			jsonwriter.beginObject();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #135 <Method JsonWriter JsonWriter.beginObject()>
	//   17   33:pop             
			jsonwriter.endObject();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #137 <Method JsonWriter JsonWriter.endObject()>
	//   20   38:pop             
			return;
	//   21   39:return          
		} else
		{
			typeadapter.write(jsonwriter, obj);
	//   22   40:aload_3         
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #139 <Method void TypeAdapter.write(JsonWriter, Object)>
			return;
	//   26   46:return          
		}
	}

	public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

		public TypeAdapter create(Gson gson1, TypeToken typetoken)
		{
			if(typetoken.getRawType() == java/lang/Object)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
		//*   2    4:ldc1            #4   <Class Object>
		//*   3    6:if_acmpne       19
				return ((TypeAdapter) (new ObjectTypeAdapter(gson1)));
		//    4    9:new             #8   <Class ObjectTypeAdapter>
		//    5   12:dup             
		//    6   13:aload_1         
		//    7   14:aconst_null     
		//    8   15:invokespecial   #24  <Method void ObjectTypeAdapter(Gson, ObjectTypeAdapter$1)>
		//    9   18:areturn         
			else
				return null;
		//   10   19:aconst_null     
		//   11   20:areturn         
		}

	}
;
	private final Gson gson;

	static 
	{
	//    0    0:new             #7   <Class ObjectTypeAdapter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ObjectTypeAdapter$1()>
	//    3    7:putstatic       #20  <Field TypeAdapterFactory FACTORY>
	//*   4   10:return          
	}
}
