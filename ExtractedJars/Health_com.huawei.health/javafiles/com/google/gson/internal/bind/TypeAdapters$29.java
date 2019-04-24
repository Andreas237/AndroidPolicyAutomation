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

static final class TypeAdapters$29 extends TypeAdapter
{

	public JsonElement read(JsonReader jsonreader)
		throws IOException
	{
		switch(TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[jsonreader.peek().ordinal()])
	//*   0    0:getstatic       #22  <Field int[] TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//*   3    7:invokevirtual   #34  <Method int JsonToken.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 10: default 64
	//	               1 79
	//	               2 98
	//	               3 67
	//	               4 113
	//	               5 121
	//	               6 158
	//	               7 199
	//	               8 199
	//	               9 199
	//	               10 199
	//*   6   64:goto            199
		case 3: // '\003'
			return ((JsonElement) (new JsonPrimitive(jsonreader.nextString())));
	//    7   67:new             #36  <Class JsonPrimitive>
	//    8   70:dup             
	//    9   71:aload_1         
	//   10   72:invokevirtual   #40  <Method String JsonReader.nextString()>
	//   11   75:invokespecial   #43  <Method void JsonPrimitive(String)>
	//   12   78:areturn         

		case 1: // '\001'
			return ((JsonElement) (new JsonPrimitive(((Number) (new LazilyParsedNumber(jsonreader.nextString()))))));
	//   13   79:new             #36  <Class JsonPrimitive>
	//   14   82:dup             
	//   15   83:new             #45  <Class LazilyParsedNumber>
	//   16   86:dup             
	//   17   87:aload_1         
	//   18   88:invokevirtual   #40  <Method String JsonReader.nextString()>
	//   19   91:invokespecial   #46  <Method void LazilyParsedNumber(String)>
	//   20   94:invokespecial   #49  <Method void JsonPrimitive(Number)>
	//   21   97:areturn         

		case 2: // '\002'
			return ((JsonElement) (new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()))));
	//   22   98:new             #36  <Class JsonPrimitive>
	//   23  101:dup             
	//   24  102:aload_1         
	//   25  103:invokevirtual   #53  <Method boolean JsonReader.nextBoolean()>
	//   26  106:invokestatic    #59  <Method Boolean Boolean.valueOf(boolean)>
	//   27  109:invokespecial   #62  <Method void JsonPrimitive(Boolean)>
	//   28  112:areturn         

		case 4: // '\004'
			jsonreader.nextNull();
	//   29  113:aload_1         
	//   30  114:invokevirtual   #65  <Method void JsonReader.nextNull()>
			return ((JsonElement) (JsonNull.INSTANCE));
	//   31  117:getstatic       #71  <Field JsonNull JsonNull.INSTANCE>
	//   32  120:areturn         

		case 5: // '\005'
			JsonArray jsonarray = new JsonArray();
	//   33  121:new             #73  <Class JsonArray>
	//   34  124:dup             
	//   35  125:invokespecial   #74  <Method void JsonArray()>
	//   36  128:astore_2        
			jsonreader.beginArray();
	//   37  129:aload_1         
	//   38  130:invokevirtual   #77  <Method void JsonReader.beginArray()>
			for(; jsonreader.hasNext(); jsonarray.add(read(jsonreader)));
	//   39  133:aload_1         
	//   40  134:invokevirtual   #80  <Method boolean JsonReader.hasNext()>
	//   41  137:ifeq            152
	//   42  140:aload_2         
	//   43  141:aload_0         
	//   44  142:aload_1         
	//   45  143:invokevirtual   #82  <Method JsonElement read(JsonReader)>
	//   46  146:invokevirtual   #86  <Method void JsonArray.add(JsonElement)>
	//*  47  149:goto            133
			jsonreader.endArray();
	//   48  152:aload_1         
	//   49  153:invokevirtual   #89  <Method void JsonReader.endArray()>
			return ((JsonElement) (jsonarray));
	//   50  156:aload_2         
	//   51  157:areturn         

		case 6: // '\006'
			JsonObject jsonobject = new JsonObject();
	//   52  158:new             #91  <Class JsonObject>
	//   53  161:dup             
	//   54  162:invokespecial   #92  <Method void JsonObject()>
	//   55  165:astore_2        
			jsonreader.beginObject();
	//   56  166:aload_1         
	//   57  167:invokevirtual   #95  <Method void JsonReader.beginObject()>
			for(; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), read(jsonreader)));
	//   58  170:aload_1         
	//   59  171:invokevirtual   #80  <Method boolean JsonReader.hasNext()>
	//   60  174:ifeq            193
	//   61  177:aload_2         
	//   62  178:aload_1         
	//   63  179:invokevirtual   #98  <Method String JsonReader.nextName()>
	//   64  182:aload_0         
	//   65  183:aload_1         
	//   66  184:invokevirtual   #82  <Method JsonElement read(JsonReader)>
	//   67  187:invokevirtual   #101 <Method void JsonObject.add(String, JsonElement)>
	//*  68  190:goto            170
			jsonreader.endObject();
	//   69  193:aload_1         
	//   70  194:invokevirtual   #104 <Method void JsonReader.endObject()>
			return ((JsonElement) (jsonobject));
	//   71  197:aload_2         
	//   72  198:areturn         
		}
		throw new IllegalArgumentException();
	//   73  199:new             #106 <Class IllegalArgumentException>
	//   74  202:dup             
	//   75  203:invokespecial   #107 <Method void IllegalArgumentException()>
	//   76  206:athrow          
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method JsonElement read(JsonReader)>
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
	//*  11   21:ifeq            77
		{
			jsonelement = ((JsonElement) (jsonelement.getAsJsonPrimitive()));
	//   12   24:aload_2         
	//   13   25:invokevirtual   #129 <Method JsonPrimitive JsonElement.getAsJsonPrimitive()>
	//   14   28:astore_2        
			if(((JsonPrimitive) (jsonelement)).isNumber())
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #132 <Method boolean JsonPrimitive.isNumber()>
	//*  17   33:ifeq            48
				jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsNumber());
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #136 <Method Number JsonPrimitive.getAsNumber()>
	//   21   41:invokevirtual   #140 <Method JsonWriter JsonWriter.value(Number)>
	//   22   44:pop             
			else
	//*  23   45:goto            76
			if(((JsonPrimitive) (jsonelement)).isBoolean())
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #143 <Method boolean JsonPrimitive.isBoolean()>
	//*  26   52:ifeq            67
				jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsBoolean());
	//   27   55:aload_1         
	//   28   56:aload_2         
	//   29   57:invokevirtual   #146 <Method boolean JsonPrimitive.getAsBoolean()>
	//   30   60:invokevirtual   #149 <Method JsonWriter JsonWriter.value(boolean)>
	//   31   63:pop             
			else
	//*  32   64:goto            76
				jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsString());
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:invokevirtual   #152 <Method String JsonPrimitive.getAsString()>
	//   36   72:invokevirtual   #155 <Method JsonWriter JsonWriter.value(String)>
	//   37   75:pop             
			return;
	//   38   76:return          
		}
		if(jsonelement.isJsonArray())
	//*  39   77:aload_2         
	//*  40   78:invokevirtual   #158 <Method boolean JsonElement.isJsonArray()>
	//*  41   81:ifeq            129
		{
			jsonwriter.beginArray();
	//   42   84:aload_1         
	//   43   85:invokevirtual   #160 <Method JsonWriter JsonWriter.beginArray()>
	//   44   88:pop             
			for(jsonelement = ((JsonElement) (jsonelement.getAsJsonArray().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)((Iterator) (jsonelement)).next()));
	//   45   89:aload_2         
	//   46   90:invokevirtual   #164 <Method JsonArray JsonElement.getAsJsonArray()>
	//   47   93:invokevirtual   #168 <Method Iterator JsonArray.iterator()>
	//   48   96:astore_2        
	//   49   97:aload_2         
	//   50   98:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   51  103:ifeq            123
	//   52  106:aload_0         
	//   53  107:aload_1         
	//   54  108:aload_2         
	//   55  109:invokeinterface #175 <Method Object Iterator.next()>
	//   56  114:checkcast       #113 <Class JsonElement>
	//   57  117:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
	//*  58  120:goto            97
			jsonwriter.endArray();
	//   59  123:aload_1         
	//   60  124:invokevirtual   #179 <Method JsonWriter JsonWriter.endArray()>
	//   61  127:pop             
			return;
	//   62  128:return          
		}
		if(jsonelement.isJsonObject())
	//*  63  129:aload_2         
	//*  64  130:invokevirtual   #182 <Method boolean JsonElement.isJsonObject()>
	//*  65  133:ifeq            210
		{
			jsonwriter.beginObject();
	//   66  136:aload_1         
	//   67  137:invokevirtual   #184 <Method JsonWriter JsonWriter.beginObject()>
	//   68  140:pop             
			java.util.Map.Entry entry;
			for(jsonelement = ((JsonElement) (jsonelement.getAsJsonObject().entrySet().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)entry.getValue()))
	//*  69  141:aload_2         
	//*  70  142:invokevirtual   #188 <Method JsonObject JsonElement.getAsJsonObject()>
	//*  71  145:invokevirtual   #192 <Method Set JsonObject.entrySet()>
	//*  72  148:invokeinterface #195 <Method Iterator Set.iterator()>
	//*  73  153:astore_2        
	//*  74  154:aload_2         
	//*  75  155:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  76  160:ifeq            204
			{
				entry = (java.util.Map.Entry)((Iterator) (jsonelement)).next();
	//   77  163:aload_2         
	//   78  164:invokeinterface #175 <Method Object Iterator.next()>
	//   79  169:checkcast       #197 <Class java.util.Map$Entry>
	//   80  172:astore_3        
				jsonwriter.name((String)entry.getKey());
	//   81  173:aload_1         
	//   82  174:aload_3         
	//   83  175:invokeinterface #200 <Method Object java.util.Map$Entry.getKey()>
	//   84  180:checkcast       #202 <Class String>
	//   85  183:invokevirtual   #205 <Method JsonWriter JsonWriter.name(String)>
	//   86  186:pop             
			}

	//   87  187:aload_0         
	//   88  188:aload_1         
	//   89  189:aload_3         
	//   90  190:invokeinterface #208 <Method Object java.util.Map$Entry.getValue()>
	//   91  195:checkcast       #113 <Class JsonElement>
	//   92  198:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
	//*  93  201:goto            154
			jsonwriter.endObject();
	//   94  204:aload_1         
	//   95  205:invokevirtual   #210 <Method JsonWriter JsonWriter.endObject()>
	//   96  208:pop             
			return;
	//   97  209:return          
		} else
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(((Object) (((Object) (jsonelement)).getClass()))).toString());
	//   98  210:new             #106 <Class IllegalArgumentException>
	//   99  213:dup             
	//  100  214:new             #212 <Class StringBuilder>
	//  101  217:dup             
	//  102  218:invokespecial   #213 <Method void StringBuilder()>
	//  103  221:ldc1            #215 <String "Couldn't write ">
	//  104  223:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  105  226:aload_2         
	//  106  227:invokevirtual   #225 <Method Class Object.getClass()>
	//  107  230:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
	//  108  233:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  109  236:invokespecial   #232 <Method void IllegalArgumentException(String)>
	//  110  239:athrow          
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

	TypeAdapters$29()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
