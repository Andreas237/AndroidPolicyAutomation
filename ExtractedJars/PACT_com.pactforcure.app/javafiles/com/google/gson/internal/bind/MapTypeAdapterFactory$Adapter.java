// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.*;
import com.google.gson.stream.*;
import java.io.IOException;
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
	//*  61  128:ifeq            192
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
	//*  77  162:ifnull          124
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
		jsonreader.endObject();
	//   90  192:aload_1         
	//   91  193:invokevirtual   #177 <Method void JsonReader.endObject()>
		return map;
	//   92  196:aload_2         
	//   93  197:areturn         
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
		if(!MapTypeAdapterFactory.access$000(MapTypeAdapterFactory.this))
	//*   6   10:aload_0         
	//*   7   11:getfield        #22  <Field MapTypeAdapterFactory this$0>
	//*   8   14:invokestatic    #193 <Method boolean MapTypeAdapterFactory.access$000(MapTypeAdapterFactory)>
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
		map = ((Map) (map.entrySet().iterator()));
	//   55  128:aload_2         
	//   56  129:invokeinterface #199 <Method Set Map.entrySet()>
	//   57  134:invokeinterface #205 <Method Iterator Set.iterator()>
	//   58  139:astore_2        
		while(((Iterator) (map)).hasNext()) 
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
	//*  86  214:ifeq            228
				flag1 = true;
	//   87  217:iconst_1        
	//   88  218:istore          4
			else
	//*  89  220:iload_3         
	//*  90  221:iload           4
	//*  91  223:ior             
	//*  92  224:istore_3        
	//*  93  225:goto            140
				flag1 = false;
	//   94  228:iconst_0        
	//   95  229:istore          4
			flag |= flag1;
		}
	//*  96  231:goto            220
		if(flag)
	//*  97  234:iload_3         
	//*  98  235:ifeq            310
		{
			jsonwriter.beginArray();
	//   99  238:aload_1         
	//  100  239:invokevirtual   #254 <Method JsonWriter JsonWriter.beginArray()>
	//  101  242:pop             
			for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//* 102  243:iconst_0        
	//* 103  244:istore_3        
	//* 104  245:iload_3         
	//* 105  246:aload           5
	//* 106  248:invokeinterface #255 <Method int List.size()>
	//* 107  253:icmpge          304
			{
				jsonwriter.beginArray();
	//  108  256:aload_1         
	//  109  257:invokevirtual   #254 <Method JsonWriter JsonWriter.beginArray()>
	//  110  260:pop             
				Streams.write((JsonElement)((List) (arraylist)).get(i), jsonwriter);
	//  111  261:aload           5
	//  112  263:iload_3         
	//  113  264:invokeinterface #259 <Method Object List.get(int)>
	//  114  269:checkcast       #43  <Class JsonElement>
	//  115  272:aload_1         
	//  116  273:invokestatic    #264 <Method void Streams.write(JsonElement, JsonWriter)>
				valueTypeAdapter.write(jsonwriter, ((List) (arraylist1)).get(i));
	//  117  276:aload_0         
	//  118  277:getfield        #34  <Field TypeAdapter valueTypeAdapter>
	//  119  280:aload_1         
	//  120  281:aload           6
	//  121  283:iload_3         
	//  122  284:invokeinterface #259 <Method Object List.get(int)>
	//  123  289:invokevirtual   #225 <Method void TypeAdapter.write(JsonWriter, Object)>
				jsonwriter.endArray();
	//  124  292:aload_1         
	//  125  293:invokevirtual   #266 <Method JsonWriter JsonWriter.endArray()>
	//  126  296:pop             
			}

	//  127  297:iload_3         
	//  128  298:iconst_1        
	//  129  299:iadd            
	//  130  300:istore_3        
	//* 131  301:goto            245
			jsonwriter.endArray();
	//  132  304:aload_1         
	//  133  305:invokevirtual   #266 <Method JsonWriter JsonWriter.endArray()>
	//  134  308:pop             
			return;
	//  135  309:return          
		}
		jsonwriter.beginObject();
	//  136  310:aload_1         
	//  137  311:invokevirtual   #195 <Method JsonWriter JsonWriter.beginObject()>
	//  138  314:pop             
		for(int j = 0; j < ((List) (arraylist)).size(); j++)
	//* 139  315:iconst_0        
	//* 140  316:istore_3        
	//* 141  317:iload_3         
	//* 142  318:aload           5
	//* 143  320:invokeinterface #255 <Method int List.size()>
	//* 144  325:icmpge          371
		{
			jsonwriter.name(keyToString((JsonElement)((List) (arraylist)).get(j)));
	//  145  328:aload_1         
	//  146  329:aload_0         
	//  147  330:aload           5
	//  148  332:iload_3         
	//  149  333:invokeinterface #259 <Method Object List.get(int)>
	//  150  338:checkcast       #43  <Class JsonElement>
	//  151  341:invokespecial   #268 <Method String keyToString(JsonElement)>
	//  152  344:invokevirtual   #220 <Method JsonWriter JsonWriter.name(String)>
	//  153  347:pop             
			valueTypeAdapter.write(jsonwriter, ((List) (arraylist1)).get(j));
	//  154  348:aload_0         
	//  155  349:getfield        #34  <Field TypeAdapter valueTypeAdapter>
	//  156  352:aload_1         
	//  157  353:aload           6
	//  158  355:iload_3         
	//  159  356:invokeinterface #259 <Method Object List.get(int)>
	//  160  361:invokevirtual   #225 <Method void TypeAdapter.write(JsonWriter, Object)>
		}

	//  161  364:iload_3         
	//  162  365:iconst_1        
	//  163  366:iadd            
	//  164  367:istore_3        
	//* 165  368:goto            317
		jsonwriter.endObject();
	//  166  371:aload_1         
	//  167  372:invokevirtual   #227 <Method JsonWriter JsonWriter.endObject()>
	//  168  375:pop             
	//  169  376:return          
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
