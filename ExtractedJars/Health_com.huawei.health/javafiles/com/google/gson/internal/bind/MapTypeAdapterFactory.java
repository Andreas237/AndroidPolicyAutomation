// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters, TypeAdapterRuntimeTypeWrapper

public final class MapTypeAdapterFactory
	implements TypeAdapterFactory
{
	final class Adapter extends TypeAdapter
	{

		private String keyToString(JsonElement jsonelement)
		{
			if(jsonelement.isJsonPrimitive())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #47  <Method boolean JsonElement.isJsonPrimitive()>
		//*   2    4:ifeq            62
			{
				jsonelement = ((JsonElement) (jsonelement.getAsJsonPrimitive()));
		//    3    7:aload_1         
		//    4    8:invokevirtual   #51  <Method JsonPrimitive JsonElement.getAsJsonPrimitive()>
		//    5   11:astore_1        
				if(((JsonPrimitive) (jsonelement)).isNumber())
		//*   6   12:aload_1         
		//*   7   13:invokevirtual   #56  <Method boolean JsonPrimitive.isNumber()>
		//*   8   16:ifeq            27
					return String.valueOf(((Object) (((JsonPrimitive) (jsonelement)).getAsNumber())));
		//    9   19:aload_1         
		//   10   20:invokevirtual   #60  <Method Number JsonPrimitive.getAsNumber()>
		//   11   23:invokestatic    #66  <Method String String.valueOf(Object)>
		//   12   26:areturn         
				if(((JsonPrimitive) (jsonelement)).isBoolean())
		//*  13   27:aload_1         
		//*  14   28:invokevirtual   #69  <Method boolean JsonPrimitive.isBoolean()>
		//*  15   31:ifeq            42
					return Boolean.toString(((JsonPrimitive) (jsonelement)).getAsBoolean());
		//   16   34:aload_1         
		//   17   35:invokevirtual   #72  <Method boolean JsonPrimitive.getAsBoolean()>
		//   18   38:invokestatic    #78  <Method String Boolean.toString(boolean)>
		//   19   41:areturn         
				if(((JsonPrimitive) (jsonelement)).isString())
		//*  20   42:aload_1         
		//*  21   43:invokevirtual   #81  <Method boolean JsonPrimitive.isString()>
		//*  22   46:ifeq            54
					return ((JsonPrimitive) (jsonelement)).getAsString();
		//   23   49:aload_1         
		//   24   50:invokevirtual   #85  <Method String JsonPrimitive.getAsString()>
		//   25   53:areturn         
				else
					throw new AssertionError();
		//   26   54:new             #87  <Class AssertionError>
		//   27   57:dup             
		//   28   58:invokespecial   #88  <Method void AssertionError()>
		//   29   61:athrow          
			}
			if(jsonelement.isJsonNull())
		//*  30   62:aload_1         
		//*  31   63:invokevirtual   #91  <Method boolean JsonElement.isJsonNull()>
		//*  32   66:ifeq            72
				return "null";
		//   33   69:ldc1            #93  <String "null">
		//   34   71:areturn         
			else
				throw new AssertionError();
		//   35   72:new             #87  <Class AssertionError>
		//   36   75:dup             
		//   37   76:invokespecial   #88  <Method void AssertionError()>
		//   38   79:athrow          
		}

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method Map read(JsonReader)>
		//    3    5:areturn         
		}

		public Map read(JsonReader jsonreader)
			throws IOException
		{
			JsonToken jsontoken = jsonreader.peek();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #107 <Method JsonToken JsonReader.peek()>
		//    2    4:astore_3        
			if(jsontoken == JsonToken.NULL)
		//*   3    5:aload_3         
		//*   4    6:getstatic       #113 <Field JsonToken JsonToken.NULL>
		//*   5    9:if_acmpne       18
			{
				jsonreader.nextNull();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #116 <Method void JsonReader.nextNull()>
				return null;
		//    8   16:aconst_null     
		//    9   17:areturn         
			}
			Map map = (Map)constructor.construct();
		//   10   18:aload_0         
		//   11   19:getfield        #36  <Field ObjectConstructor constructor>
		//   12   22:invokeinterface #122 <Method Object ObjectConstructor.construct()>
		//   13   27:checkcast       #124 <Class Map>
		//   14   30:astore_2        
			if(jsontoken == JsonToken.BEGIN_ARRAY)
		//*  15   31:aload_3         
		//*  16   32:getstatic       #127 <Field JsonToken JsonToken.BEGIN_ARRAY>
		//*  17   35:if_acmpne       120
			{
				jsonreader.beginArray();
		//   18   38:aload_1         
		//   19   39:invokevirtual   #130 <Method void JsonReader.beginArray()>
				for(; jsonreader.hasNext(); jsonreader.endArray())
		//*  20   42:aload_1         
		//*  21   43:invokevirtual   #133 <Method boolean JsonReader.hasNext()>
		//*  22   46:ifeq            114
				{
					jsonreader.beginArray();
		//   23   49:aload_1         
		//   24   50:invokevirtual   #130 <Method void JsonReader.beginArray()>
					Object obj = keyTypeAdapter.read(jsonreader);
		//   25   53:aload_0         
		//   26   54:getfield        #32  <Field TypeAdapter keyTypeAdapter>
		//   27   57:aload_1         
		//   28   58:invokevirtual   #135 <Method Object TypeAdapter.read(JsonReader)>
		//   29   61:astore_3        
					if(map.put(obj, valueTypeAdapter.read(jsonreader)) != null)
		//*  30   62:aload_2         
		//*  31   63:aload_3         
		//*  32   64:aload_0         
		//*  33   65:getfield        #34  <Field TypeAdapter valueTypeAdapter>
		//*  34   68:aload_1         
		//*  35   69:invokevirtual   #135 <Method Object TypeAdapter.read(JsonReader)>
		//*  36   72:invokeinterface #139 <Method Object Map.put(Object, Object)>
		//*  37   77:ifnull          107
						throw new JsonSyntaxException((new StringBuilder()).append("duplicate key: ").append(obj).toString());
		//   38   80:new             #141 <Class JsonSyntaxException>
		//   39   83:dup             
		//   40   84:new             #143 <Class StringBuilder>
		//   41   87:dup             
		//   42   88:invokespecial   #144 <Method void StringBuilder()>
		//   43   91:ldc1            #146 <String "duplicate key: ">
		//   44   93:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
		//   45   96:aload_3         
		//   46   97:invokevirtual   #153 <Method StringBuilder StringBuilder.append(Object)>
		//   47  100:invokevirtual   #155 <Method String StringBuilder.toString()>
		//   48  103:invokespecial   #158 <Method void JsonSyntaxException(String)>
		//   49  106:athrow          
				}

		//   50  107:aload_1         
		//   51  108:invokevirtual   #161 <Method void JsonReader.endArray()>
		//*  52  111:goto            42
				jsonreader.endArray();
		//   53  114:aload_1         
		//   54  115:invokevirtual   #161 <Method void JsonReader.endArray()>
				return map;
		//   55  118:aload_2         
		//   56  119:areturn         
			}
			jsonreader.beginObject();
		//   57  120:aload_1         
		//   58  121:invokevirtual   #164 <Method void JsonReader.beginObject()>
			while(jsonreader.hasNext()) 
		//*  59  124:aload_1         
		//*  60  125:invokevirtual   #133 <Method boolean JsonReader.hasNext()>
		//*  61  128:ifeq            195
			{
				JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonreader);
		//   62  131:getstatic       #170 <Field JsonReaderInternalAccess JsonReaderInternalAccess.INSTANCE>
		//   63  134:aload_1         
		//   64  135:invokevirtual   #174 <Method void JsonReaderInternalAccess.promoteNameToValue(JsonReader)>
				Object obj1 = keyTypeAdapter.read(jsonreader);
		//   65  138:aload_0         
		//   66  139:getfield        #32  <Field TypeAdapter keyTypeAdapter>
		//   67  142:aload_1         
		//   68  143:invokevirtual   #135 <Method Object TypeAdapter.read(JsonReader)>
		//   69  146:astore_3        
				if(map.put(obj1, valueTypeAdapter.read(jsonreader)) != null)
		//*  70  147:aload_2         
		//*  71  148:aload_3         
		//*  72  149:aload_0         
		//*  73  150:getfield        #34  <Field TypeAdapter valueTypeAdapter>
		//*  74  153:aload_1         
		//*  75  154:invokevirtual   #135 <Method Object TypeAdapter.read(JsonReader)>
		//*  76  157:invokeinterface #139 <Method Object Map.put(Object, Object)>
		//*  77  162:ifnull          192
					throw new JsonSyntaxException((new StringBuilder()).append("duplicate key: ").append(obj1).toString());
		//   78  165:new             #141 <Class JsonSyntaxException>
		//   79  168:dup             
		//   80  169:new             #143 <Class StringBuilder>
		//   81  172:dup             
		//   82  173:invokespecial   #144 <Method void StringBuilder()>
		//   83  176:ldc1            #146 <String "duplicate key: ">
		//   84  178:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
		//   85  181:aload_3         
		//   86  182:invokevirtual   #153 <Method StringBuilder StringBuilder.append(Object)>
		//   87  185:invokevirtual   #155 <Method String StringBuilder.toString()>
		//   88  188:invokespecial   #158 <Method void JsonSyntaxException(String)>
		//   89  191:athrow          
			}
		//*  90  192:goto            124
			jsonreader.endObject();
		//   91  195:aload_1         
		//   92  196:invokevirtual   #177 <Method void JsonReader.endObject()>
			return map;
		//   93  199:aload_2         
		//   94  200:areturn         
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Map)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #124 <Class Map>
		//    4    6:invokevirtual   #183 <Method void write(JsonWriter, Map)>
		//    5    9:return          
		}

		public void write(JsonWriter jsonwriter, Map map)
			throws IOException
		{
			if(map == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       10
			{
				jsonwriter.nullValue();
		//    2    4:aload_1         
		//    3    5:invokevirtual   #189 <Method JsonWriter JsonWriter.nullValue()>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			if(!complexMapKeySerialization)
		//*   6   10:aload_0         
		//*   7   11:getfield        #22  <Field MapTypeAdapterFactory this$0>
		//*   8   14:getfield        #193 <Field boolean MapTypeAdapterFactory.complexMapKeySerialization>
		//*   9   17:ifne            96
			{
				jsonwriter.beginObject();
		//   10   20:aload_1         
		//   11   21:invokevirtual   #195 <Method JsonWriter JsonWriter.beginObject()>
		//   12   24:pop             
				java.util.Map.Entry entry;
				for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); valueTypeAdapter.write(jsonwriter, entry.getValue()))
		//*  13   25:aload_2         
		//*  14   26:invokeinterface #199 <Method Set Map.entrySet()>
		//*  15   31:invokeinterface #205 <Method Iterator Set.iterator()>
		//*  16   36:astore_2        
		//*  17   37:aload_2         
		//*  18   38:invokeinterface #208 <Method boolean Iterator.hasNext()>
		//*  19   43:ifeq            90
				{
					entry = (java.util.Map.Entry)((Iterator) (map)).next();
		//   20   46:aload_2         
		//   21   47:invokeinterface #211 <Method Object Iterator.next()>
		//   22   52:checkcast       #213 <Class java.util.Map$Entry>
		//   23   55:astore          5
					jsonwriter.name(String.valueOf(entry.getKey()));
		//   24   57:aload_1         
		//   25   58:aload           5
		//   26   60:invokeinterface #216 <Method Object java.util.Map$Entry.getKey()>
		//   27   65:invokestatic    #66  <Method String String.valueOf(Object)>
		//   28   68:invokevirtual   #220 <Method JsonWriter JsonWriter.name(String)>
		//   29   71:pop             
				}

		//   30   72:aload_0         
		//   31   73:getfield        #34  <Field TypeAdapter valueTypeAdapter>
		//   32   76:aload_1         
		//   33   77:aload           5
		//   34   79:invokeinterface #223 <Method Object java.util.Map$Entry.getValue()>
		//   35   84:invokevirtual   #225 <Method void TypeAdapter.write(JsonWriter, Object)>
		//*  36   87:goto            37
				jsonwriter.endObject();
		//   37   90:aload_1         
		//   38   91:invokevirtual   #227 <Method JsonWriter JsonWriter.endObject()>
		//   39   94:pop             
				return;
		//   40   95:return          
			}
			boolean flag = false;
		//   41   96:iconst_0        
		//   42   97:istore_3        
			ArrayList arraylist = new ArrayList(map.size());
		//   43   98:new             #229 <Class ArrayList>
		//   44  101:dup             
		//   45  102:aload_2         
		//   46  103:invokeinterface #233 <Method int Map.size()>
		//   47  108:invokespecial   #236 <Method void ArrayList(int)>
		//   48  111:astore          5
			ArrayList arraylist1 = new ArrayList(map.size());
		//   49  113:new             #229 <Class ArrayList>
		//   50  116:dup             
		//   51  117:aload_2         
		//   52  118:invokeinterface #233 <Method int Map.size()>
		//   53  123:invokespecial   #236 <Method void ArrayList(int)>
		//   54  126:astore          6
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
		//*  55  128:aload_2         
		//*  56  129:invokeinterface #199 <Method Set Map.entrySet()>
		//*  57  134:invokeinterface #205 <Method Iterator Set.iterator()>
		//*  58  139:astore_2        
		//*  59  140:aload_2         
		//*  60  141:invokeinterface #208 <Method boolean Iterator.hasNext()>
		//*  61  146:ifeq            234
			{
				java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (map)).next();
		//   62  149:aload_2         
		//   63  150:invokeinterface #211 <Method Object Iterator.next()>
		//   64  155:checkcast       #213 <Class java.util.Map$Entry>
		//   65  158:astore          7
				JsonElement jsonelement = keyTypeAdapter.toJsonTree(entry1.getKey());
		//   66  160:aload_0         
		//   67  161:getfield        #32  <Field TypeAdapter keyTypeAdapter>
		//   68  164:aload           7
		//   69  166:invokeinterface #216 <Method Object java.util.Map$Entry.getKey()>
		//   70  171:invokevirtual   #240 <Method JsonElement TypeAdapter.toJsonTree(Object)>
		//   71  174:astore          8
				((List) (arraylist)).add(((Object) (jsonelement)));
		//   72  176:aload           5
		//   73  178:aload           8
		//   74  180:invokeinterface #246 <Method boolean List.add(Object)>
		//   75  185:pop             
				((List) (arraylist1)).add(entry1.getValue());
		//   76  186:aload           6
		//   77  188:aload           7
		//   78  190:invokeinterface #223 <Method Object java.util.Map$Entry.getValue()>
		//   79  195:invokeinterface #246 <Method boolean List.add(Object)>
		//   80  200:pop             
				boolean flag1;
				if(jsonelement.isJsonArray() || jsonelement.isJsonObject())
		//*  81  201:aload           8
		//*  82  203:invokevirtual   #249 <Method boolean JsonElement.isJsonArray()>
		//*  83  206:ifne            217
		//*  84  209:aload           8
		//*  85  211:invokevirtual   #252 <Method boolean JsonElement.isJsonObject()>
		//*  86  214:ifeq            223
					flag1 = true;
		//   87  217:iconst_1        
		//   88  218:istore          4
				else
		//*  89  220:goto            226
					flag1 = false;
		//   90  223:iconst_0        
		//   91  224:istore          4
				flag |= flag1;
		//   92  226:iload_3         
		//   93  227:iload           4
		//   94  229:ior             
		//   95  230:istore_3        
			}

		//*  96  231:goto            140
			if(flag)
		//*  97  234:iload_3         
		//*  98  235:ifeq            314
			{
				jsonwriter.beginArray();
		//   99  238:aload_1         
		//  100  239:invokevirtual   #254 <Method JsonWriter JsonWriter.beginArray()>
		//  101  242:pop             
				int i = 0;
		//  102  243:iconst_0        
		//  103  244:istore_3        
				for(int k = ((List) (arraylist)).size(); i < k; i++)
		//* 104  245:aload           5
		//* 105  247:invokeinterface #255 <Method int List.size()>
		//* 106  252:istore          4
		//* 107  254:iload_3         
		//* 108  255:iload           4
		//* 109  257:icmpge          308
				{
					jsonwriter.beginArray();
		//  110  260:aload_1         
		//  111  261:invokevirtual   #254 <Method JsonWriter JsonWriter.beginArray()>
		//  112  264:pop             
					Streams.write((JsonElement)((List) (arraylist)).get(i), jsonwriter);
		//  113  265:aload           5
		//  114  267:iload_3         
		//  115  268:invokeinterface #259 <Method Object List.get(int)>
		//  116  273:checkcast       #43  <Class JsonElement>
		//  117  276:aload_1         
		//  118  277:invokestatic    #264 <Method void Streams.write(JsonElement, JsonWriter)>
					valueTypeAdapter.write(jsonwriter, ((List) (arraylist1)).get(i));
		//  119  280:aload_0         
		//  120  281:getfield        #34  <Field TypeAdapter valueTypeAdapter>
		//  121  284:aload_1         
		//  122  285:aload           6
		//  123  287:iload_3         
		//  124  288:invokeinterface #259 <Method Object List.get(int)>
		//  125  293:invokevirtual   #225 <Method void TypeAdapter.write(JsonWriter, Object)>
					jsonwriter.endArray();
		//  126  296:aload_1         
		//  127  297:invokevirtual   #266 <Method JsonWriter JsonWriter.endArray()>
		//  128  300:pop             
				}

		//  129  301:iload_3         
		//  130  302:iconst_1        
		//  131  303:iadd            
		//  132  304:istore_3        
		//* 133  305:goto            254
				jsonwriter.endArray();
		//  134  308:aload_1         
		//  135  309:invokevirtual   #266 <Method JsonWriter JsonWriter.endArray()>
		//  136  312:pop             
				return;
		//  137  313:return          
			}
			jsonwriter.beginObject();
		//  138  314:aload_1         
		//  139  315:invokevirtual   #195 <Method JsonWriter JsonWriter.beginObject()>
		//  140  318:pop             
			int j = 0;
		//  141  319:iconst_0        
		//  142  320:istore_3        
			for(int l = ((List) (arraylist)).size(); j < l; j++)
		//* 143  321:aload           5
		//* 144  323:invokeinterface #255 <Method int List.size()>
		//* 145  328:istore          4
		//* 146  330:iload_3         
		//* 147  331:iload           4
		//* 148  333:icmpge          379
			{
				jsonwriter.name(keyToString((JsonElement)((List) (arraylist)).get(j)));
		//  149  336:aload_1         
		//  150  337:aload_0         
		//  151  338:aload           5
		//  152  340:iload_3         
		//  153  341:invokeinterface #259 <Method Object List.get(int)>
		//  154  346:checkcast       #43  <Class JsonElement>
		//  155  349:invokespecial   #268 <Method String keyToString(JsonElement)>
		//  156  352:invokevirtual   #220 <Method JsonWriter JsonWriter.name(String)>
		//  157  355:pop             
				valueTypeAdapter.write(jsonwriter, ((List) (arraylist1)).get(j));
		//  158  356:aload_0         
		//  159  357:getfield        #34  <Field TypeAdapter valueTypeAdapter>
		//  160  360:aload_1         
		//  161  361:aload           6
		//  162  363:iload_3         
		//  163  364:invokeinterface #259 <Method Object List.get(int)>
		//  164  369:invokevirtual   #225 <Method void TypeAdapter.write(JsonWriter, Object)>
			}

		//  165  372:iload_3         
		//  166  373:iconst_1        
		//  167  374:iadd            
		//  168  375:istore_3        
		//* 169  376:goto            330
			jsonwriter.endObject();
		//  170  379:aload_1         
		//  171  380:invokevirtual   #227 <Method JsonWriter JsonWriter.endObject()>
		//  172  383:pop             
		//  173  384:return          
		}

		private final ObjectConstructor constructor;
		private final TypeAdapter keyTypeAdapter;
		final MapTypeAdapterFactory this$0;
		private final TypeAdapter valueTypeAdapter;

		public Adapter(Gson gson, Type type, TypeAdapter typeadapter, Type type1, TypeAdapter typeadapter1, ObjectConstructor objectconstructor)
		{
			this$0 = MapTypeAdapterFactory.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field MapTypeAdapterFactory this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void TypeAdapter()>
			keyTypeAdapter = ((TypeAdapter) (new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, type)));
		//    5    9:aload_0         
		//    6   10:new             #27  <Class TypeAdapterRuntimeTypeWrapper>
		//    7   13:dup             
		//    8   14:aload_2         
		//    9   15:aload           4
		//   10   17:aload_3         
		//   11   18:invokespecial   #30  <Method void TypeAdapterRuntimeTypeWrapper(Gson, TypeAdapter, Type)>
		//   12   21:putfield        #32  <Field TypeAdapter keyTypeAdapter>
			valueTypeAdapter = ((TypeAdapter) (new TypeAdapterRuntimeTypeWrapper(gson, typeadapter1, type1)));
		//   13   24:aload_0         
		//   14   25:new             #27  <Class TypeAdapterRuntimeTypeWrapper>
		//   15   28:dup             
		//   16   29:aload_2         
		//   17   30:aload           6
		//   18   32:aload           5
		//   19   34:invokespecial   #30  <Method void TypeAdapterRuntimeTypeWrapper(Gson, TypeAdapter, Type)>
		//   20   37:putfield        #34  <Field TypeAdapter valueTypeAdapter>
			constructor = objectconstructor;
		//   21   40:aload_0         
		//   22   41:aload           7
		//   23   43:putfield        #36  <Field ObjectConstructor constructor>
		//   24   46:return          
		}
	}


	public MapTypeAdapterFactory(ConstructorConstructor constructorconstructor, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		constructorConstructor = constructorconstructor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ConstructorConstructor constructorConstructor>
		complexMapKeySerialization = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field boolean complexMapKeySerialization>
	//    8   14:return          
	}

	private TypeAdapter getKeyAdapter(Gson gson, Type type)
	{
		if(type == Boolean.TYPE || type == java/lang/Boolean)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #31  <Field Class Boolean.TYPE>
	//*   2    4:if_acmpeq       13
	//*   3    7:aload_2         
	//*   4    8:ldc1            #27  <Class Boolean>
	//*   5   10:if_acmpne       17
			return TypeAdapters.BOOLEAN_AS_STRING;
	//    6   13:getstatic       #37  <Field TypeAdapter TypeAdapters.BOOLEAN_AS_STRING>
	//    7   16:areturn         
		else
			return gson.getAdapter(TypeToken.get(type));
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:invokestatic    #43  <Method TypeToken TypeToken.get(Type)>
	//   11   22:invokevirtual   #49  <Method TypeAdapter Gson.getAdapter(TypeToken)>
	//   12   25:areturn         
	}

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		Type type = typetoken.getType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #57  <Method Type TypeToken.getType()>
	//    2    4:astore_3        
		if(!((Class) (java/util/Map)).isAssignableFrom(typetoken.getRawType()))
	//*   3    5:ldc1            #59  <Class Map>
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #63  <Method Class TypeToken.getRawType()>
	//*   6   11:invokevirtual   #69  <Method boolean Class.isAssignableFrom(Class)>
	//*   7   14:ifne            19
		{
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		} else
		{
			Type atype[] = com.google.gson.internal..Gson.Types.getMapKeyAndValueTypes(type, com.google.gson.internal..Gson.Types.getRawType(type));
	//   10   19:aload_3         
	//   11   20:aload_3         
	//   12   21:invokestatic    #74  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   13   24:invokestatic    #78  <Method Type[] com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(Type, Class)>
	//   14   27:astore_3        
			TypeAdapter typeadapter = getKeyAdapter(gson, atype[0]);
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_3         
	//   18   31:iconst_0        
	//   19   32:aaload          
	//   20   33:invokespecial   #80  <Method TypeAdapter getKeyAdapter(Gson, Type)>
	//   21   36:astore          4
			TypeAdapter typeadapter1 = gson.getAdapter(TypeToken.get(atype[1]));
	//   22   38:aload_1         
	//   23   39:aload_3         
	//   24   40:iconst_1        
	//   25   41:aaload          
	//   26   42:invokestatic    #43  <Method TypeToken TypeToken.get(Type)>
	//   27   45:invokevirtual   #49  <Method TypeAdapter Gson.getAdapter(TypeToken)>
	//   28   48:astore          5
			typetoken = ((TypeToken) (constructorConstructor.get(typetoken)));
	//   29   50:aload_0         
	//   30   51:getfield        #20  <Field ConstructorConstructor constructorConstructor>
	//   31   54:aload_2         
	//   32   55:invokevirtual   #85  <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//   33   58:astore_2        
			return ((TypeAdapter) (new Adapter(gson, atype[0], typeadapter, atype[1], typeadapter1, ((ObjectConstructor) (typetoken)))));
	//   34   59:new             #8   <Class MapTypeAdapterFactory$Adapter>
	//   35   62:dup             
	//   36   63:aload_0         
	//   37   64:aload_1         
	//   38   65:aload_3         
	//   39   66:iconst_0        
	//   40   67:aaload          
	//   41   68:aload           4
	//   42   70:aload_3         
	//   43   71:iconst_1        
	//   44   72:aaload          
	//   45   73:aload           5
	//   46   75:aload_2         
	//   47   76:invokespecial   #88  <Method void MapTypeAdapterFactory$Adapter(MapTypeAdapterFactory, Gson, Type, TypeAdapter, Type, TypeAdapter, ObjectConstructor)>
	//   48   79:areturn         
		}
	}

	final boolean complexMapKeySerialization;
	private final ConstructorConstructor constructorConstructor;
}
