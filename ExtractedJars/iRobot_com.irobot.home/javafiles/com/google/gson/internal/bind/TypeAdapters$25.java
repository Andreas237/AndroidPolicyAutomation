// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.*;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$25 extends TypeAdapter
{

	public JsonElement read(JsonReader jsonreader)
	{
		switch(TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken[jsonreader.peek().ordinal()])
	//*   0    0:getstatic       #20  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
	//*   3    7:invokevirtual   #32  <Method int JsonToken.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 6: default 48
	//	               1 169
	//	               2 154
	//	               3 142
	//	               4 134
	//	               5 97
	//	               6 56
		default:
			throw new IllegalArgumentException();
	//    6   48:new             #34  <Class IllegalArgumentException>
	//    7   51:dup             
	//    8   52:invokespecial   #35  <Method void IllegalArgumentException()>
	//    9   55:athrow          

		case 6: // '\006'
			JsonObject jsonobject = new JsonObject();
	//   10   56:new             #37  <Class JsonObject>
	//   11   59:dup             
	//   12   60:invokespecial   #38  <Method void JsonObject()>
	//   13   63:astore_2        
			jsonreader.beginObject();
	//   14   64:aload_1         
	//   15   65:invokevirtual   #41  <Method void JsonReader.beginObject()>
			for(; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), read(jsonreader)));
	//   16   68:aload_1         
	//   17   69:invokevirtual   #45  <Method boolean JsonReader.hasNext()>
	//   18   72:ifeq            91
	//   19   75:aload_2         
	//   20   76:aload_1         
	//   21   77:invokevirtual   #49  <Method String JsonReader.nextName()>
	//   22   80:aload_0         
	//   23   81:aload_1         
	//   24   82:invokevirtual   #51  <Method JsonElement read(JsonReader)>
	//   25   85:invokevirtual   #55  <Method void JsonObject.add(String, JsonElement)>
	//*  26   88:goto            68
			jsonreader.endObject();
	//   27   91:aload_1         
	//   28   92:invokevirtual   #58  <Method void JsonReader.endObject()>
			return ((JsonElement) (jsonobject));
	//   29   95:aload_2         
	//   30   96:areturn         

		case 5: // '\005'
			JsonArray jsonarray = new JsonArray();
	//   31   97:new             #60  <Class JsonArray>
	//   32  100:dup             
	//   33  101:invokespecial   #61  <Method void JsonArray()>
	//   34  104:astore_2        
			jsonreader.beginArray();
	//   35  105:aload_1         
	//   36  106:invokevirtual   #64  <Method void JsonReader.beginArray()>
			for(; jsonreader.hasNext(); jsonarray.add(read(jsonreader)));
	//   37  109:aload_1         
	//   38  110:invokevirtual   #45  <Method boolean JsonReader.hasNext()>
	//   39  113:ifeq            128
	//   40  116:aload_2         
	//   41  117:aload_0         
	//   42  118:aload_1         
	//   43  119:invokevirtual   #51  <Method JsonElement read(JsonReader)>
	//   44  122:invokevirtual   #67  <Method void JsonArray.add(JsonElement)>
	//*  45  125:goto            109
			jsonreader.endArray();
	//   46  128:aload_1         
	//   47  129:invokevirtual   #70  <Method void JsonReader.endArray()>
			return ((JsonElement) (jsonarray));
	//   48  132:aload_2         
	//   49  133:areturn         

		case 4: // '\004'
			jsonreader.nextNull();
	//   50  134:aload_1         
	//   51  135:invokevirtual   #73  <Method void JsonReader.nextNull()>
			return ((JsonElement) (JsonNull.INSTANCE));
	//   52  138:getstatic       #79  <Field JsonNull JsonNull.INSTANCE>
	//   53  141:areturn         

		case 3: // '\003'
			return ((JsonElement) (new JsonPrimitive(jsonreader.nextString())));
	//   54  142:new             #81  <Class JsonPrimitive>
	//   55  145:dup             
	//   56  146:aload_1         
	//   57  147:invokevirtual   #84  <Method String JsonReader.nextString()>
	//   58  150:invokespecial   #87  <Method void JsonPrimitive(String)>
	//   59  153:areturn         

		case 2: // '\002'
			return ((JsonElement) (new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()))));
	//   60  154:new             #81  <Class JsonPrimitive>
	//   61  157:dup             
	//   62  158:aload_1         
	//   63  159:invokevirtual   #90  <Method boolean JsonReader.nextBoolean()>
	//   64  162:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//   65  165:invokespecial   #99  <Method void JsonPrimitive(Boolean)>
	//   66  168:areturn         

		case 1: // '\001'
			return ((JsonElement) (new JsonPrimitive(((Number) (new LazilyParsedNumber(jsonreader.nextString()))))));
	//   67  169:new             #81  <Class JsonPrimitive>
	//   68  172:dup             
	//   69  173:new             #101 <Class LazilyParsedNumber>
	//   70  176:dup             
	//   71  177:aload_1         
	//   72  178:invokevirtual   #84  <Method String JsonReader.nextString()>
	//   73  181:invokespecial   #102 <Method void LazilyParsedNumber(String)>
	//   74  184:invokespecial   #105 <Method void JsonPrimitive(Number)>
	//   75  187:areturn         
		}
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method JsonElement read(JsonReader)>
	//    3    5:areturn         
	}

	public void write(JsonWriter jsonwriter, JsonElement jsonelement)
	{
		if(jsonelement != null && !jsonelement.isJsonNull())
	//*   0    0:aload_2         
	//*   1    1:ifnull          239
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #113 <Method boolean JsonElement.isJsonNull()>
	//*   4    8:ifeq            14
	//*   5   11:goto            239
		{
			if(jsonelement.isJsonPrimitive())
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #116 <Method boolean JsonElement.isJsonPrimitive()>
	//*   8   18:ifeq            70
			{
				jsonelement = ((JsonElement) (jsonelement.getAsJsonPrimitive()));
	//    9   21:aload_2         
	//   10   22:invokevirtual   #120 <Method JsonPrimitive JsonElement.getAsJsonPrimitive()>
	//   11   25:astore_2        
				if(((JsonPrimitive) (jsonelement)).isNumber())
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #123 <Method boolean JsonPrimitive.isNumber()>
	//*  14   30:ifeq            43
				{
					jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsNumber());
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:invokevirtual   #127 <Method Number JsonPrimitive.getAsNumber()>
	//   18   38:invokevirtual   #133 <Method JsonWriter JsonWriter.value(Number)>
	//   19   41:pop             
					return;
	//   20   42:return          
				}
				if(((JsonPrimitive) (jsonelement)).isBoolean())
	//*  21   43:aload_2         
	//*  22   44:invokevirtual   #136 <Method boolean JsonPrimitive.isBoolean()>
	//*  23   47:ifeq            60
				{
					jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsBoolean());
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #139 <Method boolean JsonPrimitive.getAsBoolean()>
	//   27   55:invokevirtual   #142 <Method JsonWriter JsonWriter.value(boolean)>
	//   28   58:pop             
					return;
	//   29   59:return          
				} else
				{
					jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsString());
	//   30   60:aload_1         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #145 <Method String JsonPrimitive.getAsString()>
	//   33   65:invokevirtual   #148 <Method JsonWriter JsonWriter.value(String)>
	//   34   68:pop             
					return;
	//   35   69:return          
				}
			}
			if(jsonelement.isJsonArray())
	//*  36   70:aload_2         
	//*  37   71:invokevirtual   #151 <Method boolean JsonElement.isJsonArray()>
	//*  38   74:ifeq            122
			{
				jsonwriter.beginArray();
	//   39   77:aload_1         
	//   40   78:invokevirtual   #154 <Method JsonWriter JsonWriter.beginArray()>
	//   41   81:pop             
				for(jsonelement = ((JsonElement) (jsonelement.getAsJsonArray().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)((Iterator) (jsonelement)).next()));
	//   42   82:aload_2         
	//   43   83:invokevirtual   #158 <Method JsonArray JsonElement.getAsJsonArray()>
	//   44   86:invokevirtual   #162 <Method Iterator JsonArray.iterator()>
	//   45   89:astore_2        
	//   46   90:aload_2         
	//   47   91:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//   48   96:ifeq            116
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:aload_2         
	//   52  102:invokeinterface #169 <Method Object Iterator.next()>
	//   53  107:checkcast       #110 <Class JsonElement>
	//   54  110:invokevirtual   #171 <Method void write(JsonWriter, JsonElement)>
	//*  55  113:goto            90
				jsonwriter.endArray();
	//   56  116:aload_1         
	//   57  117:invokevirtual   #173 <Method JsonWriter JsonWriter.endArray()>
	//   58  120:pop             
				return;
	//   59  121:return          
			}
			if(jsonelement.isJsonObject())
	//*  60  122:aload_2         
	//*  61  123:invokevirtual   #176 <Method boolean JsonElement.isJsonObject()>
	//*  62  126:ifeq            203
			{
				jsonwriter.beginObject();
	//   63  129:aload_1         
	//   64  130:invokevirtual   #178 <Method JsonWriter JsonWriter.beginObject()>
	//   65  133:pop             
				java.util.Map.Entry entry;
				for(jsonelement = ((JsonElement) (jsonelement.getAsJsonObject().entrySet().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)entry.getValue()))
	//*  66  134:aload_2         
	//*  67  135:invokevirtual   #182 <Method JsonObject JsonElement.getAsJsonObject()>
	//*  68  138:invokevirtual   #186 <Method Set JsonObject.entrySet()>
	//*  69  141:invokeinterface #189 <Method Iterator Set.iterator()>
	//*  70  146:astore_2        
	//*  71  147:aload_2         
	//*  72  148:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//*  73  153:ifeq            197
				{
					entry = (java.util.Map.Entry)((Iterator) (jsonelement)).next();
	//   74  156:aload_2         
	//   75  157:invokeinterface #169 <Method Object Iterator.next()>
	//   76  162:checkcast       #191 <Class java.util.Map$Entry>
	//   77  165:astore_3        
					jsonwriter.name((String)entry.getKey());
	//   78  166:aload_1         
	//   79  167:aload_3         
	//   80  168:invokeinterface #194 <Method Object java.util.Map$Entry.getKey()>
	//   81  173:checkcast       #196 <Class String>
	//   82  176:invokevirtual   #199 <Method JsonWriter JsonWriter.name(String)>
	//   83  179:pop             
				}

	//   84  180:aload_0         
	//   85  181:aload_1         
	//   86  182:aload_3         
	//   87  183:invokeinterface #202 <Method Object java.util.Map$Entry.getValue()>
	//   88  188:checkcast       #110 <Class JsonElement>
	//   89  191:invokevirtual   #171 <Method void write(JsonWriter, JsonElement)>
	//*  90  194:goto            147
				jsonwriter.endObject();
	//   91  197:aload_1         
	//   92  198:invokevirtual   #204 <Method JsonWriter JsonWriter.endObject()>
	//   93  201:pop             
				return;
	//   94  202:return          
			} else
			{
				jsonwriter = ((JsonWriter) (new StringBuilder()));
	//   95  203:new             #206 <Class StringBuilder>
	//   96  206:dup             
	//   97  207:invokespecial   #207 <Method void StringBuilder()>
	//   98  210:astore_1        
				((StringBuilder) (jsonwriter)).append("Couldn't write ");
	//   99  211:aload_1         
	//  100  212:ldc1            #209 <String "Couldn't write ">
	//  101  214:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  102  217:pop             
				((StringBuilder) (jsonwriter)).append(((Object) (((Object) (jsonelement)).getClass())));
	//  103  218:aload_1         
	//  104  219:aload_2         
	//  105  220:invokevirtual   #219 <Method Class Object.getClass()>
	//  106  223:invokevirtual   #222 <Method StringBuilder StringBuilder.append(Object)>
	//  107  226:pop             
				throw new IllegalArgumentException(((StringBuilder) (jsonwriter)).toString());
	//  108  227:new             #34  <Class IllegalArgumentException>
	//  109  230:dup             
	//  110  231:aload_1         
	//  111  232:invokevirtual   #225 <Method String StringBuilder.toString()>
	//  112  235:invokespecial   #226 <Method void IllegalArgumentException(String)>
	//  113  238:athrow          
			}
		} else
		{
			jsonwriter.nullValue();
	//  114  239:aload_1         
	//  115  240:invokevirtual   #229 <Method JsonWriter JsonWriter.nullValue()>
	//  116  243:pop             
			return;
	//  117  244:return          
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (JsonElement)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #110 <Class JsonElement>
	//    4    6:invokevirtual   #171 <Method void write(JsonWriter, JsonElement)>
	//    5    9:return          
	}

	TypeAdapters$25()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
