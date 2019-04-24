// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.*;
import com.google.gson.stream.*;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.google.gson.internal.bind:
//			MapTypeAdapterFactory, TypeAdapterRuntimeTypeWrapper

private final class MapTypeAdapterFactory$Adapter extends TypeAdapter
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
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #98  <Method Map read(JsonReader)>
	//    3    5:areturn         
	}

	public Map read(JsonReader jsonreader)
	{
		JsonToken jsontoken = jsonreader.peek();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonReader.peek()>
	//    2    4:astore_3        
		if(jsontoken == JsonToken.NULL)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #110 <Field JsonToken JsonToken.NULL>
	//*   5    9:if_acmpne       18
		{
			jsonreader.nextNull();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #113 <Method void JsonReader.nextNull()>
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		}
		Map map = (Map)constructor.construct();
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field ObjectConstructor constructor>
	//   12   22:invokeinterface #119 <Method Object ObjectConstructor.construct()>
	//   13   27:checkcast       #121 <Class Map>
	//   14   30:astore_2        
		if(jsontoken == JsonToken.BEGIN_ARRAY)
	//*  15   31:aload_3         
	//*  16   32:getstatic       #124 <Field JsonToken JsonToken.BEGIN_ARRAY>
	//*  17   35:if_acmpne       126
		{
			jsonreader.beginArray();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #127 <Method void JsonReader.beginArray()>
			for(; jsonreader.hasNext(); jsonreader.endArray())
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #130 <Method boolean JsonReader.hasNext()>
	//*  22   46:ifeq            120
			{
				jsonreader.beginArray();
	//   23   49:aload_1         
	//   24   50:invokevirtual   #127 <Method void JsonReader.beginArray()>
				Object obj = keyTypeAdapter.read(jsonreader);
	//   25   53:aload_0         
	//   26   54:getfield        #32  <Field TypeAdapter keyTypeAdapter>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #132 <Method Object TypeAdapter.read(JsonReader)>
	//   29   61:astore_3        
				if(map.put(obj, valueTypeAdapter.read(jsonreader)) != null)
	//*  30   62:aload_2         
	//*  31   63:aload_3         
	//*  32   64:aload_0         
	//*  33   65:getfield        #34  <Field TypeAdapter valueTypeAdapter>
	//*  34   68:aload_1         
	//*  35   69:invokevirtual   #132 <Method Object TypeAdapter.read(JsonReader)>
	//*  36   72:invokeinterface #136 <Method Object Map.put(Object, Object)>
	//*  37   77:ifnull          113
				{
					jsonreader = ((JsonReader) (new StringBuilder()));
	//   38   80:new             #138 <Class StringBuilder>
	//   39   83:dup             
	//   40   84:invokespecial   #139 <Method void StringBuilder()>
	//   41   87:astore_1        
					((StringBuilder) (jsonreader)).append("duplicate key: ");
	//   42   88:aload_1         
	//   43   89:ldc1            #141 <String "duplicate key: ">
	//   44   91:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   45   94:pop             
					((StringBuilder) (jsonreader)).append(obj);
	//   46   95:aload_1         
	//   47   96:aload_3         
	//   48   97:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//   49  100:pop             
					throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
	//   50  101:new             #150 <Class JsonSyntaxException>
	//   51  104:dup             
	//   52  105:aload_1         
	//   53  106:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   54  109:invokespecial   #155 <Method void JsonSyntaxException(String)>
	//   55  112:athrow          
				}
			}

	//   56  113:aload_1         
	//   57  114:invokevirtual   #158 <Method void JsonReader.endArray()>
	//*  58  117:goto            42
			jsonreader.endArray();
	//   59  120:aload_1         
	//   60  121:invokevirtual   #158 <Method void JsonReader.endArray()>
			return map;
	//   61  124:aload_2         
	//   62  125:areturn         
		}
		jsonreader.beginObject();
	//   63  126:aload_1         
	//   64  127:invokevirtual   #161 <Method void JsonReader.beginObject()>
		while(jsonreader.hasNext()) 
	//*  65  130:aload_1         
	//*  66  131:invokevirtual   #130 <Method boolean JsonReader.hasNext()>
	//*  67  134:ifeq            204
		{
			JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonreader);
	//   68  137:getstatic       #167 <Field JsonReaderInternalAccess JsonReaderInternalAccess.INSTANCE>
	//   69  140:aload_1         
	//   70  141:invokevirtual   #171 <Method void JsonReaderInternalAccess.promoteNameToValue(JsonReader)>
			Object obj1 = keyTypeAdapter.read(jsonreader);
	//   71  144:aload_0         
	//   72  145:getfield        #32  <Field TypeAdapter keyTypeAdapter>
	//   73  148:aload_1         
	//   74  149:invokevirtual   #132 <Method Object TypeAdapter.read(JsonReader)>
	//   75  152:astore_3        
			if(map.put(obj1, valueTypeAdapter.read(jsonreader)) != null)
	//*  76  153:aload_2         
	//*  77  154:aload_3         
	//*  78  155:aload_0         
	//*  79  156:getfield        #34  <Field TypeAdapter valueTypeAdapter>
	//*  80  159:aload_1         
	//*  81  160:invokevirtual   #132 <Method Object TypeAdapter.read(JsonReader)>
	//*  82  163:invokeinterface #136 <Method Object Map.put(Object, Object)>
	//*  83  168:ifnull          130
			{
				jsonreader = ((JsonReader) (new StringBuilder()));
	//   84  171:new             #138 <Class StringBuilder>
	//   85  174:dup             
	//   86  175:invokespecial   #139 <Method void StringBuilder()>
	//   87  178:astore_1        
				((StringBuilder) (jsonreader)).append("duplicate key: ");
	//   88  179:aload_1         
	//   89  180:ldc1            #141 <String "duplicate key: ">
	//   90  182:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   91  185:pop             
				((StringBuilder) (jsonreader)).append(obj1);
	//   92  186:aload_1         
	//   93  187:aload_3         
	//   94  188:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//   95  191:pop             
				throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
	//   96  192:new             #150 <Class JsonSyntaxException>
	//   97  195:dup             
	//   98  196:aload_1         
	//   99  197:invokevirtual   #152 <Method String StringBuilder.toString()>
	//  100  200:invokespecial   #155 <Method void JsonSyntaxException(String)>
	//  101  203:athrow          
			}
		}
		jsonreader.endObject();
	//  102  204:aload_1         
	//  103  205:invokevirtual   #174 <Method void JsonReader.endObject()>
		return map;
	//  104  208:aload_2         
	//  105  209:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Map)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #121 <Class Map>
	//    4    6:invokevirtual   #180 <Method void write(JsonWriter, Map)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Map map)
	{
		if(map == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #186 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		if(!MapTypeAdapterFactory.access$000(MapTypeAdapterFactory.this))
	//*   6   10:aload_0         
	//*   7   11:getfield        #22  <Field MapTypeAdapterFactory this$0>
	//*   8   14:invokestatic    #190 <Method boolean MapTypeAdapterFactory.access$000(MapTypeAdapterFactory)>
	//*   9   17:ifne            96
		{
			jsonwriter.beginObject();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #192 <Method JsonWriter JsonWriter.beginObject()>
	//   12   24:pop             
			java.util.Map.Entry entry;
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); valueTypeAdapter.write(jsonwriter, entry.getValue()))
	//*  13   25:aload_2         
	//*  14   26:invokeinterface #196 <Method Set Map.entrySet()>
	//*  15   31:invokeinterface #202 <Method Iterator Set.iterator()>
	//*  16   36:astore_2        
	//*  17   37:aload_2         
	//*  18   38:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            90
			{
				entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   20   46:aload_2         
	//   21   47:invokeinterface #208 <Method Object Iterator.next()>
	//   22   52:checkcast       #210 <Class java.util.Map$Entry>
	//   23   55:astore          7
				jsonwriter.name(String.valueOf(entry.getKey()));
	//   24   57:aload_1         
	//   25   58:aload           7
	//   26   60:invokeinterface #213 <Method Object java.util.Map$Entry.getKey()>
	//   27   65:invokestatic    #66  <Method String String.valueOf(Object)>
	//   28   68:invokevirtual   #217 <Method JsonWriter JsonWriter.name(String)>
	//   29   71:pop             
			}

	//   30   72:aload_0         
	//   31   73:getfield        #34  <Field TypeAdapter valueTypeAdapter>
	//   32   76:aload_1         
	//   33   77:aload           7
	//   34   79:invokeinterface #220 <Method Object java.util.Map$Entry.getValue()>
	//   35   84:invokevirtual   #222 <Method void TypeAdapter.write(JsonWriter, Object)>
	//*  36   87:goto            37
			jsonwriter.endObject();
	//   37   90:aload_1         
	//   38   91:invokevirtual   #224 <Method JsonWriter JsonWriter.endObject()>
	//   39   94:pop             
			return;
	//   40   95:return          
		}
		ArrayList arraylist = new ArrayList(map.size());
	//   41   96:new             #226 <Class ArrayList>
	//   42   99:dup             
	//   43  100:aload_2         
	//   44  101:invokeinterface #230 <Method int Map.size()>
	//   45  106:invokespecial   #233 <Method void ArrayList(int)>
	//   46  109:astore          7
		ArrayList arraylist1 = new ArrayList(map.size());
	//   47  111:new             #226 <Class ArrayList>
	//   48  114:dup             
	//   49  115:aload_2         
	//   50  116:invokeinterface #230 <Method int Map.size()>
	//   51  121:invokespecial   #233 <Method void ArrayList(int)>
	//   52  124:astore          8
		map = ((Map) (map.entrySet().iterator()));
	//   53  126:aload_2         
	//   54  127:invokeinterface #196 <Method Set Map.entrySet()>
	//   55  132:invokeinterface #202 <Method Iterator Set.iterator()>
	//   56  137:astore_2        
		boolean flag3 = false;
	//   57  138:iconst_0        
	//   58  139:istore          6
		boolean flag2 = false;
	//   59  141:iconst_0        
	//   60  142:istore          5
		boolean flag;
		boolean flag1;
		for(flag = false; ((Iterator) (map)).hasNext(); flag |= flag1)
	//*  61  144:iconst_0        
	//*  62  145:istore_3        
	//*  63  146:aload_2         
	//*  64  147:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//*  65  152:ifeq            243
		{
			java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (map)).next();
	//   66  155:aload_2         
	//   67  156:invokeinterface #208 <Method Object Iterator.next()>
	//   68  161:checkcast       #210 <Class java.util.Map$Entry>
	//   69  164:astore          9
			JsonElement jsonelement = keyTypeAdapter.toJsonTree(entry1.getKey());
	//   70  166:aload_0         
	//   71  167:getfield        #32  <Field TypeAdapter keyTypeAdapter>
	//   72  170:aload           9
	//   73  172:invokeinterface #213 <Method Object java.util.Map$Entry.getKey()>
	//   74  177:invokevirtual   #237 <Method JsonElement TypeAdapter.toJsonTree(Object)>
	//   75  180:astore          10
			((List) (arraylist)).add(((Object) (jsonelement)));
	//   76  182:aload           7
	//   77  184:aload           10
	//   78  186:invokeinterface #243 <Method boolean List.add(Object)>
	//   79  191:pop             
			((List) (arraylist1)).add(entry1.getValue());
	//   80  192:aload           8
	//   81  194:aload           9
	//   82  196:invokeinterface #220 <Method Object java.util.Map$Entry.getValue()>
	//   83  201:invokeinterface #243 <Method boolean List.add(Object)>
	//   84  206:pop             
			if(!jsonelement.isJsonArray() && !jsonelement.isJsonObject())
	//*  85  207:aload           10
	//*  86  209:invokevirtual   #246 <Method boolean JsonElement.isJsonArray()>
	//*  87  212:ifne            232
	//*  88  215:aload           10
	//*  89  217:invokevirtual   #249 <Method boolean JsonElement.isJsonObject()>
	//*  90  220:ifeq            226
	//*  91  223:goto            232
				flag1 = false;
	//   92  226:iconst_0        
	//   93  227:istore          4
			else
	//*  94  229:goto            235
				flag1 = true;
	//   95  232:iconst_1        
	//   96  233:istore          4
		}

	//   97  235:iload_3         
	//   98  236:iload           4
	//   99  238:ior             
	//  100  239:istore_3        
	//* 101  240:goto            146
		if(flag)
	//* 102  243:iload_3         
	//* 103  244:ifeq            320
		{
			jsonwriter.beginArray();
	//  104  247:aload_1         
	//  105  248:invokevirtual   #251 <Method JsonWriter JsonWriter.beginArray()>
	//  106  251:pop             
			for(int i = ((int) (flag2)); i < ((List) (arraylist)).size(); i++)
	//* 107  252:iload           5
	//* 108  254:istore_3        
	//* 109  255:iload_3         
	//* 110  256:aload           7
	//* 111  258:invokeinterface #252 <Method int List.size()>
	//* 112  263:icmpge          314
			{
				jsonwriter.beginArray();
	//  113  266:aload_1         
	//  114  267:invokevirtual   #251 <Method JsonWriter JsonWriter.beginArray()>
	//  115  270:pop             
				Streams.write((JsonElement)((List) (arraylist)).get(i), jsonwriter);
	//  116  271:aload           7
	//  117  273:iload_3         
	//  118  274:invokeinterface #256 <Method Object List.get(int)>
	//  119  279:checkcast       #43  <Class JsonElement>
	//  120  282:aload_1         
	//  121  283:invokestatic    #261 <Method void Streams.write(JsonElement, JsonWriter)>
				valueTypeAdapter.write(jsonwriter, ((List) (arraylist1)).get(i));
	//  122  286:aload_0         
	//  123  287:getfield        #34  <Field TypeAdapter valueTypeAdapter>
	//  124  290:aload_1         
	//  125  291:aload           8
	//  126  293:iload_3         
	//  127  294:invokeinterface #256 <Method Object List.get(int)>
	//  128  299:invokevirtual   #222 <Method void TypeAdapter.write(JsonWriter, Object)>
				jsonwriter.endArray();
	//  129  302:aload_1         
	//  130  303:invokevirtual   #263 <Method JsonWriter JsonWriter.endArray()>
	//  131  306:pop             
			}

	//  132  307:iload_3         
	//  133  308:iconst_1        
	//  134  309:iadd            
	//  135  310:istore_3        
	//* 136  311:goto            255
			jsonwriter.endArray();
	//  137  314:aload_1         
	//  138  315:invokevirtual   #263 <Method JsonWriter JsonWriter.endArray()>
	//  139  318:pop             
			return;
	//  140  319:return          
		}
		jsonwriter.beginObject();
	//  141  320:aload_1         
	//  142  321:invokevirtual   #192 <Method JsonWriter JsonWriter.beginObject()>
	//  143  324:pop             
		for(int j = ((int) (flag3)); j < ((List) (arraylist)).size(); j++)
	//* 144  325:iload           6
	//* 145  327:istore_3        
	//* 146  328:iload_3         
	//* 147  329:aload           7
	//* 148  331:invokeinterface #252 <Method int List.size()>
	//* 149  336:icmpge          382
		{
			jsonwriter.name(keyToString((JsonElement)((List) (arraylist)).get(j)));
	//  150  339:aload_1         
	//  151  340:aload_0         
	//  152  341:aload           7
	//  153  343:iload_3         
	//  154  344:invokeinterface #256 <Method Object List.get(int)>
	//  155  349:checkcast       #43  <Class JsonElement>
	//  156  352:invokespecial   #265 <Method String keyToString(JsonElement)>
	//  157  355:invokevirtual   #217 <Method JsonWriter JsonWriter.name(String)>
	//  158  358:pop             
			valueTypeAdapter.write(jsonwriter, ((List) (arraylist1)).get(j));
	//  159  359:aload_0         
	//  160  360:getfield        #34  <Field TypeAdapter valueTypeAdapter>
	//  161  363:aload_1         
	//  162  364:aload           8
	//  163  366:iload_3         
	//  164  367:invokeinterface #256 <Method Object List.get(int)>
	//  165  372:invokevirtual   #222 <Method void TypeAdapter.write(JsonWriter, Object)>
		}

	//  166  375:iload_3         
	//  167  376:iconst_1        
	//  168  377:iadd            
	//  169  378:istore_3        
	//* 170  379:goto            328
		jsonwriter.endObject();
	//  171  382:aload_1         
	//  172  383:invokevirtual   #224 <Method JsonWriter JsonWriter.endObject()>
	//  173  386:pop             
	//  174  387:return          
	}

	private final ObjectConstructor constructor;
	private final TypeAdapter keyTypeAdapter;
	final MapTypeAdapterFactory this$0;
	private final TypeAdapter valueTypeAdapter;

	public MapTypeAdapterFactory$Adapter(Gson gson, Type type, TypeAdapter typeadapter, Type type1, TypeAdapter typeadapter1, ObjectConstructor objectconstructor)
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
