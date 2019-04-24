// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$25 extends TypeAdapter
{

	public JsonElement read(JsonReader jsonreader)
		throws IOException
	{
		JsonObject jsonobject;
		switch(TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken[jsonreader.peek().ordinal()])
	//*   0    0:getstatic       #22  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//*   3    7:invokevirtual   #34  <Method int JsonToken.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 6: default 48
	//	               1 68
	//	               2 87
	//	               3 56
	//	               4 102
	//	               5 110
	//	               6 147
		default:
			throw new IllegalArgumentException();
	//    6   48:new             #36  <Class IllegalArgumentException>
	//    7   51:dup             
	//    8   52:invokespecial   #37  <Method void IllegalArgumentException()>
	//    9   55:athrow          

		case 3: // '\003'
			return ((JsonElement) (new JsonPrimitive(jsonreader.nextString())));
	//   10   56:new             #39  <Class JsonPrimitive>
	//   11   59:dup             
	//   12   60:aload_1         
	//   13   61:invokevirtual   #43  <Method String JsonReader.nextString()>
	//   14   64:invokespecial   #46  <Method void JsonPrimitive(String)>
	//   15   67:areturn         

		case 1: // '\001'
			return ((JsonElement) (new JsonPrimitive(((Number) (new LazilyParsedNumber(jsonreader.nextString()))))));
	//   16   68:new             #39  <Class JsonPrimitive>
	//   17   71:dup             
	//   18   72:new             #48  <Class LazilyParsedNumber>
	//   19   75:dup             
	//   20   76:aload_1         
	//   21   77:invokevirtual   #43  <Method String JsonReader.nextString()>
	//   22   80:invokespecial   #49  <Method void LazilyParsedNumber(String)>
	//   23   83:invokespecial   #52  <Method void JsonPrimitive(Number)>
	//   24   86:areturn         

		case 2: // '\002'
			return ((JsonElement) (new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()))));
	//   25   87:new             #39  <Class JsonPrimitive>
	//   26   90:dup             
	//   27   91:aload_1         
	//   28   92:invokevirtual   #56  <Method boolean JsonReader.nextBoolean()>
	//   29   95:invokestatic    #62  <Method Boolean Boolean.valueOf(boolean)>
	//   30   98:invokespecial   #65  <Method void JsonPrimitive(Boolean)>
	//   31  101:areturn         

		case 4: // '\004'
			jsonreader.nextNull();
	//   32  102:aload_1         
	//   33  103:invokevirtual   #68  <Method void JsonReader.nextNull()>
			return ((JsonElement) (JsonNull.INSTANCE));
	//   34  106:getstatic       #74  <Field JsonNull JsonNull.INSTANCE>
	//   35  109:areturn         

		case 5: // '\005'
			JsonArray jsonarray = new JsonArray();
	//   36  110:new             #76  <Class JsonArray>
	//   37  113:dup             
	//   38  114:invokespecial   #77  <Method void JsonArray()>
	//   39  117:astore_2        
			jsonreader.beginArray();
	//   40  118:aload_1         
	//   41  119:invokevirtual   #80  <Method void JsonReader.beginArray()>
			for(; jsonreader.hasNext(); jsonarray.add(read(jsonreader)));
	//   42  122:aload_1         
	//   43  123:invokevirtual   #83  <Method boolean JsonReader.hasNext()>
	//   44  126:ifeq            141
	//   45  129:aload_2         
	//   46  130:aload_0         
	//   47  131:aload_1         
	//   48  132:invokevirtual   #85  <Method JsonElement read(JsonReader)>
	//   49  135:invokevirtual   #89  <Method void JsonArray.add(JsonElement)>
	//*  50  138:goto            122
			jsonreader.endArray();
	//   51  141:aload_1         
	//   52  142:invokevirtual   #92  <Method void JsonReader.endArray()>
			return ((JsonElement) (jsonarray));
	//   53  145:aload_2         
	//   54  146:areturn         

		case 6: // '\006'
			jsonobject = new JsonObject();
	//   55  147:new             #94  <Class JsonObject>
	//   56  150:dup             
	//   57  151:invokespecial   #95  <Method void JsonObject()>
	//   58  154:astore_2        
			jsonreader.beginObject();
	//   59  155:aload_1         
	//   60  156:invokevirtual   #98  <Method void JsonReader.beginObject()>
			break;
		}
		for(; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), read(jsonreader)));
	//   61  159:aload_1         
	//   62  160:invokevirtual   #83  <Method boolean JsonReader.hasNext()>
	//   63  163:ifeq            182
	//   64  166:aload_2         
	//   65  167:aload_1         
	//   66  168:invokevirtual   #101 <Method String JsonReader.nextName()>
	//   67  171:aload_0         
	//   68  172:aload_1         
	//   69  173:invokevirtual   #85  <Method JsonElement read(JsonReader)>
	//   70  176:invokevirtual   #104 <Method void JsonObject.add(String, JsonElement)>
	//*  71  179:goto            159
		jsonreader.endObject();
	//   72  182:aload_1         
	//   73  183:invokevirtual   #107 <Method void JsonReader.endObject()>
		return ((JsonElement) (jsonobject));
	//   74  186:aload_2         
	//   75  187:areturn         
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #85  <Method JsonElement read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, JsonElement jsonelement)
		throws IOException
	{
		if(jsonelement == null || jsonelement.isJsonNull())
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #116 <Method boolean JsonElement.isJsonNull()>
	//*   4    8:ifeq            17
		{
			jsonwriter.nullValue();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #122 <Method JsonWriter JsonWriter.nullValue()>
	//    7   15:pop             
			return;
	//    8   16:return          
		}
		if(jsonelement.isJsonPrimitive())
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #125 <Method boolean JsonElement.isJsonPrimitive()>
	//*  11   21:ifeq            73
		{
			jsonelement = ((JsonElement) (jsonelement.getAsJsonPrimitive()));
	//   12   24:aload_2         
	//   13   25:invokevirtual   #129 <Method JsonPrimitive JsonElement.getAsJsonPrimitive()>
	//   14   28:astore_2        
			if(((JsonPrimitive) (jsonelement)).isNumber())
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #132 <Method boolean JsonPrimitive.isNumber()>
	//*  17   33:ifeq            46
			{
				jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsNumber());
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #136 <Method Number JsonPrimitive.getAsNumber()>
	//   21   41:invokevirtual   #140 <Method JsonWriter JsonWriter.value(Number)>
	//   22   44:pop             
				return;
	//   23   45:return          
			}
			if(((JsonPrimitive) (jsonelement)).isBoolean())
	//*  24   46:aload_2         
	//*  25   47:invokevirtual   #143 <Method boolean JsonPrimitive.isBoolean()>
	//*  26   50:ifeq            63
			{
				jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsBoolean());
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:invokevirtual   #146 <Method boolean JsonPrimitive.getAsBoolean()>
	//   30   58:invokevirtual   #149 <Method JsonWriter JsonWriter.value(boolean)>
	//   31   61:pop             
				return;
	//   32   62:return          
			} else
			{
				jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsString());
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:invokevirtual   #152 <Method String JsonPrimitive.getAsString()>
	//   36   68:invokevirtual   #155 <Method JsonWriter JsonWriter.value(String)>
	//   37   71:pop             
				return;
	//   38   72:return          
			}
		}
		if(jsonelement.isJsonArray())
	//*  39   73:aload_2         
	//*  40   74:invokevirtual   #158 <Method boolean JsonElement.isJsonArray()>
	//*  41   77:ifeq            125
		{
			jsonwriter.beginArray();
	//   42   80:aload_1         
	//   43   81:invokevirtual   #160 <Method JsonWriter JsonWriter.beginArray()>
	//   44   84:pop             
			for(jsonelement = ((JsonElement) (jsonelement.getAsJsonArray().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)((Iterator) (jsonelement)).next()));
	//   45   85:aload_2         
	//   46   86:invokevirtual   #164 <Method JsonArray JsonElement.getAsJsonArray()>
	//   47   89:invokevirtual   #168 <Method Iterator JsonArray.iterator()>
	//   48   92:astore_2        
	//   49   93:aload_2         
	//   50   94:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   51   99:ifeq            119
	//   52  102:aload_0         
	//   53  103:aload_1         
	//   54  104:aload_2         
	//   55  105:invokeinterface #175 <Method Object Iterator.next()>
	//   56  110:checkcast       #113 <Class JsonElement>
	//   57  113:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
	//*  58  116:goto            93
			jsonwriter.endArray();
	//   59  119:aload_1         
	//   60  120:invokevirtual   #179 <Method JsonWriter JsonWriter.endArray()>
	//   61  123:pop             
			return;
	//   62  124:return          
		}
		if(jsonelement.isJsonObject())
	//*  63  125:aload_2         
	//*  64  126:invokevirtual   #182 <Method boolean JsonElement.isJsonObject()>
	//*  65  129:ifeq            206
		{
			jsonwriter.beginObject();
	//   66  132:aload_1         
	//   67  133:invokevirtual   #184 <Method JsonWriter JsonWriter.beginObject()>
	//   68  136:pop             
			java.util.Map.Entry entry;
			for(jsonelement = ((JsonElement) (jsonelement.getAsJsonObject().entrySet().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)entry.getValue()))
	//*  69  137:aload_2         
	//*  70  138:invokevirtual   #188 <Method JsonObject JsonElement.getAsJsonObject()>
	//*  71  141:invokevirtual   #192 <Method Set JsonObject.entrySet()>
	//*  72  144:invokeinterface #195 <Method Iterator Set.iterator()>
	//*  73  149:astore_2        
	//*  74  150:aload_2         
	//*  75  151:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  76  156:ifeq            200
			{
				entry = (java.util.Map.Entry)((Iterator) (jsonelement)).next();
	//   77  159:aload_2         
	//   78  160:invokeinterface #175 <Method Object Iterator.next()>
	//   79  165:checkcast       #197 <Class java.util.Map$Entry>
	//   80  168:astore_3        
				jsonwriter.name((String)entry.getKey());
	//   81  169:aload_1         
	//   82  170:aload_3         
	//   83  171:invokeinterface #200 <Method Object java.util.Map$Entry.getKey()>
	//   84  176:checkcast       #202 <Class String>
	//   85  179:invokevirtual   #205 <Method JsonWriter JsonWriter.name(String)>
	//   86  182:pop             
			}

	//   87  183:aload_0         
	//   88  184:aload_1         
	//   89  185:aload_3         
	//   90  186:invokeinterface #208 <Method Object java.util.Map$Entry.getValue()>
	//   91  191:checkcast       #113 <Class JsonElement>
	//   92  194:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
	//*  93  197:goto            150
			jsonwriter.endObject();
	//   94  200:aload_1         
	//   95  201:invokevirtual   #210 <Method JsonWriter JsonWriter.endObject()>
	//   96  204:pop             
			return;
	//   97  205:return          
		} else
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(((Object) (((Object) (jsonelement)).getClass()))).toString());
	//   98  206:new             #36  <Class IllegalArgumentException>
	//   99  209:dup             
	//  100  210:new             #212 <Class StringBuilder>
	//  101  213:dup             
	//  102  214:invokespecial   #213 <Method void StringBuilder()>
	//  103  217:ldc1            #215 <String "Couldn't write ">
	//  104  219:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  105  222:aload_2         
	//  106  223:invokevirtual   #225 <Method Class Object.getClass()>
	//  107  226:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
	//  108  229:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  109  232:invokespecial   #232 <Method void IllegalArgumentException(String)>
	//  110  235:athrow          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (JsonElement)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #113 <Class JsonElement>
	//    4    6:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
	//    5    9:return          
	}

	TypeAdapters$25()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
