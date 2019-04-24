// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
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
		throws IOException
	{
		JsonToken jsontoken = jsonreader.peek();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method JsonToken JsonReader.peek()>
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
			//*  35   77:astore_0        
			//*  36   78:return          
			//*  37   79:astore_0        
			//*  38   80:goto            64
			//*  39   83:astore_0        
			//*  40   84:goto            53
			//*  41   87:astore_0        
			//*  42   88:goto            42
			//*  43   91:astore_0        
			//*  44   92:goto            31
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   95:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  46   96:goto            20
			}
		}

		switch(_cls2..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
	//*   3    5:getstatic       #42  <Field int[] ObjectTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #48  <Method int JsonToken.ordinal()>
	//*   6   12:iaload          
		{
	//*   7   13:tableswitch     1 6: default 52
	//	               1 60
	//	               2 100
	//	               3 144
	//	               4 149
	//	               5 157
	//	               6 165
		default:
			throw new IllegalStateException();
	//    8   52:new             #50  <Class IllegalStateException>
	//    9   55:dup             
	//   10   56:invokespecial   #51  <Method void IllegalStateException()>
	//   11   59:athrow          

		case 1: // '\001'
			ArrayList arraylist = new ArrayList();
	//   12   60:new             #53  <Class ArrayList>
	//   13   63:dup             
	//   14   64:invokespecial   #54  <Method void ArrayList()>
	//   15   67:astore_2        
			jsonreader.beginArray();
	//   16   68:aload_1         
	//   17   69:invokevirtual   #57  <Method void JsonReader.beginArray()>
			for(; jsonreader.hasNext(); ((List) (arraylist)).add(read(jsonreader)));
	//   18   72:aload_1         
	//   19   73:invokevirtual   #61  <Method boolean JsonReader.hasNext()>
	//   20   76:ifeq            94
	//   21   79:aload_2         
	//   22   80:aload_0         
	//   23   81:aload_1         
	//   24   82:invokevirtual   #63  <Method Object read(JsonReader)>
	//   25   85:invokeinterface #69  <Method boolean List.add(Object)>
	//   26   90:pop             
	//*  27   91:goto            72
			jsonreader.endArray();
	//   28   94:aload_1         
	//   29   95:invokevirtual   #72  <Method void JsonReader.endArray()>
			return ((Object) (arraylist));
	//   30   98:aload_2         
	//   31   99:areturn         

		case 2: // '\002'
			LinkedTreeMap linkedtreemap = new LinkedTreeMap();
	//   32  100:new             #74  <Class LinkedTreeMap>
	//   33  103:dup             
	//   34  104:invokespecial   #75  <Method void LinkedTreeMap()>
	//   35  107:astore_2        
			jsonreader.beginObject();
	//   36  108:aload_1         
	//   37  109:invokevirtual   #78  <Method void JsonReader.beginObject()>
			for(; jsonreader.hasNext(); ((Map) (linkedtreemap)).put(((Object) (jsonreader.nextName())), read(jsonreader)));
	//   38  112:aload_1         
	//   39  113:invokevirtual   #61  <Method boolean JsonReader.hasNext()>
	//   40  116:ifeq            138
	//   41  119:aload_2         
	//   42  120:aload_1         
	//   43  121:invokevirtual   #82  <Method String JsonReader.nextName()>
	//   44  124:aload_0         
	//   45  125:aload_1         
	//   46  126:invokevirtual   #63  <Method Object read(JsonReader)>
	//   47  129:invokeinterface #88  <Method Object Map.put(Object, Object)>
	//   48  134:pop             
	//*  49  135:goto            112
			jsonreader.endObject();
	//   50  138:aload_1         
	//   51  139:invokevirtual   #91  <Method void JsonReader.endObject()>
			return ((Object) (linkedtreemap));
	//   52  142:aload_2         
	//   53  143:areturn         

		case 3: // '\003'
			return ((Object) (jsonreader.nextString()));
	//   54  144:aload_1         
	//   55  145:invokevirtual   #94  <Method String JsonReader.nextString()>
	//   56  148:areturn         

		case 4: // '\004'
			return ((Object) (Double.valueOf(jsonreader.nextDouble())));
	//   57  149:aload_1         
	//   58  150:invokevirtual   #98  <Method double JsonReader.nextDouble()>
	//   59  153:invokestatic    #104 <Method Double Double.valueOf(double)>
	//   60  156:areturn         

		case 5: // '\005'
			return ((Object) (Boolean.valueOf(jsonreader.nextBoolean())));
	//   61  157:aload_1         
	//   62  158:invokevirtual   #107 <Method boolean JsonReader.nextBoolean()>
	//   63  161:invokestatic    #112 <Method Boolean Boolean.valueOf(boolean)>
	//   64  164:areturn         

		case 6: // '\006'
			jsonreader.nextNull();
	//   65  165:aload_1         
	//   66  166:invokevirtual   #115 <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//   67  169:aconst_null     
	//   68  170:areturn         
		}
	}

	public void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		TypeAdapter typeadapter = gson.getAdapter(obj.getClass());
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field Gson gson>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #130 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #136 <Method TypeAdapter Gson.getAdapter(Class)>
	//   11   21:astore_3        
		if(typeadapter instanceof ObjectTypeAdapter)
	//*  12   22:aload_3         
	//*  13   23:instanceof      #2   <Class ObjectTypeAdapter>
	//*  14   26:ifeq            40
		{
			jsonwriter.beginObject();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #138 <Method JsonWriter JsonWriter.beginObject()>
	//   17   33:pop             
			jsonwriter.endObject();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #140 <Method JsonWriter JsonWriter.endObject()>
	//   20   38:pop             
			return;
	//   21   39:return          
		} else
		{
			typeadapter.write(jsonwriter, obj);
	//   22   40:aload_3         
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #142 <Method void TypeAdapter.write(JsonWriter, Object)>
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
