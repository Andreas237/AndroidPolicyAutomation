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

	ObjectTypeAdapter(Gson gson1)
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
	//    1    1:invokevirtual   #35  <Method JsonToken JsonReader.peek()>
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
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
			//   11   24:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//   12   27:getstatic       #31  <Field JsonToken JsonToken.BEGIN_OBJECT>
			//   13   30:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
			//   18   39:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//   19   42:getstatic       #34  <Field JsonToken JsonToken.STRING>
			//   20   45:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
			//   25   54:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//   26   57:getstatic       #37  <Field JsonToken JsonToken.NUMBER>
			//   27   60:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
				}
			//*  30   65:goto            69
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   68:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
			//   32   69:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//   33   72:getstatic       #40  <Field JsonToken JsonToken.BOOLEAN>
			//   34   75:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//   35   78:iconst_5        
			//   36   79:iastore         
				}
			//*  37   80:goto            84
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   83:astore_0        
				try
				{
					$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
			//   39   84:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
			//   40   87:getstatic       #43  <Field JsonToken JsonToken.NULL>
			//   41   90:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//   42   93:bipush          6
			//   43   95:iastore         
			//   44   96:return          
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   97:astore_0        
			//*  46   98:return          
			}
		}

		switch(_cls2..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
	//*   3    5:getstatic       #39  <Field int[] ObjectTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #45  <Method int JsonToken.ordinal()>
	//*   6   12:iaload          
		{
	//*   7   13:tableswitch     1 6: default 52
	//	               1 55
	//	               2 95
	//	               3 139
	//	               4 144
	//	               5 152
	//	               6 160
	//*   8   52:goto            166
		case 1: // '\001'
			ArrayList arraylist = new ArrayList();
	//    9   55:new             #47  <Class ArrayList>
	//   10   58:dup             
	//   11   59:invokespecial   #48  <Method void ArrayList()>
	//   12   62:astore_2        
			jsonreader.beginArray();
	//   13   63:aload_1         
	//   14   64:invokevirtual   #51  <Method void JsonReader.beginArray()>
			for(; jsonreader.hasNext(); ((List) (arraylist)).add(read(jsonreader)));
	//   15   67:aload_1         
	//   16   68:invokevirtual   #55  <Method boolean JsonReader.hasNext()>
	//   17   71:ifeq            89
	//   18   74:aload_2         
	//   19   75:aload_0         
	//   20   76:aload_1         
	//   21   77:invokevirtual   #57  <Method Object read(JsonReader)>
	//   22   80:invokeinterface #63  <Method boolean List.add(Object)>
	//   23   85:pop             
	//*  24   86:goto            67
			jsonreader.endArray();
	//   25   89:aload_1         
	//   26   90:invokevirtual   #66  <Method void JsonReader.endArray()>
			return ((Object) (arraylist));
	//   27   93:aload_2         
	//   28   94:areturn         

		case 2: // '\002'
			LinkedTreeMap linkedtreemap = new LinkedTreeMap();
	//   29   95:new             #68  <Class LinkedTreeMap>
	//   30   98:dup             
	//   31   99:invokespecial   #69  <Method void LinkedTreeMap()>
	//   32  102:astore_2        
			jsonreader.beginObject();
	//   33  103:aload_1         
	//   34  104:invokevirtual   #72  <Method void JsonReader.beginObject()>
			for(; jsonreader.hasNext(); ((Map) (linkedtreemap)).put(((Object) (jsonreader.nextName())), read(jsonreader)));
	//   35  107:aload_1         
	//   36  108:invokevirtual   #55  <Method boolean JsonReader.hasNext()>
	//   37  111:ifeq            133
	//   38  114:aload_2         
	//   39  115:aload_1         
	//   40  116:invokevirtual   #76  <Method String JsonReader.nextName()>
	//   41  119:aload_0         
	//   42  120:aload_1         
	//   43  121:invokevirtual   #57  <Method Object read(JsonReader)>
	//   44  124:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   45  129:pop             
	//*  46  130:goto            107
			jsonreader.endObject();
	//   47  133:aload_1         
	//   48  134:invokevirtual   #85  <Method void JsonReader.endObject()>
			return ((Object) (linkedtreemap));
	//   49  137:aload_2         
	//   50  138:areturn         

		case 3: // '\003'
			return ((Object) (jsonreader.nextString()));
	//   51  139:aload_1         
	//   52  140:invokevirtual   #88  <Method String JsonReader.nextString()>
	//   53  143:areturn         

		case 4: // '\004'
			return ((Object) (Double.valueOf(jsonreader.nextDouble())));
	//   54  144:aload_1         
	//   55  145:invokevirtual   #92  <Method double JsonReader.nextDouble()>
	//   56  148:invokestatic    #98  <Method Double Double.valueOf(double)>
	//   57  151:areturn         

		case 5: // '\005'
			return ((Object) (Boolean.valueOf(jsonreader.nextBoolean())));
	//   58  152:aload_1         
	//   59  153:invokevirtual   #101 <Method boolean JsonReader.nextBoolean()>
	//   60  156:invokestatic    #106 <Method Boolean Boolean.valueOf(boolean)>
	//   61  159:areturn         

		case 6: // '\006'
			jsonreader.nextNull();
	//   62  160:aload_1         
	//   63  161:invokevirtual   #109 <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//   64  164:aconst_null     
	//   65  165:areturn         
		}
		throw new IllegalStateException();
	//   66  166:new             #111 <Class IllegalStateException>
	//   67  169:dup             
	//   68  170:invokespecial   #112 <Method void IllegalStateException()>
	//   69  173:athrow          
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
		//*   3    6:if_acmpne       18
				return ((TypeAdapter) (new ObjectTypeAdapter(gson1)));
		//    4    9:new             #8   <Class ObjectTypeAdapter>
		//    5   12:dup             
		//    6   13:aload_1         
		//    7   14:invokespecial   #24  <Method void ObjectTypeAdapter(Gson)>
		//    8   17:areturn         
			else
				return null;
		//    9   18:aconst_null     
		//   10   19:areturn         
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
