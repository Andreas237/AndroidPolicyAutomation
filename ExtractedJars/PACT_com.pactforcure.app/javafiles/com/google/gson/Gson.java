// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.gson:
//			FieldNamingPolicy, LongSerializationPolicy, JsonIOException, JsonSyntaxException, 
//			TypeAdapter, TypeAdapterFactory, JsonNull, JsonDeserializationContext, 
//			JsonSerializationContext, FieldNamingStrategy, JsonElement, JsonParseException

public final class Gson
{
	static class FutureTypeAdapter extends TypeAdapter
	{

		public Object read(JsonReader jsonreader)
			throws IOException
		{
			if(_flddelegate == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field TypeAdapter _flddelegate>
		//*   2    4:ifnonnull       15
				throw new IllegalStateException();
		//    3    7:new             #24  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:invokespecial   #25  <Method void IllegalStateException()>
		//    6   14:athrow          
			else
				return _flddelegate.read(jsonreader);
		//    7   15:aload_0         
		//    8   16:getfield        #22  <Field TypeAdapter _flddelegate>
		//    9   19:aload_1         
		//   10   20:invokevirtual   #27  <Method Object TypeAdapter.read(JsonReader)>
		//   11   23:areturn         
		}

		public void setDelegate(TypeAdapter typeadapter)
		{
			if(_flddelegate != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field TypeAdapter _flddelegate>
		//*   2    4:ifnull          15
			{
				throw new AssertionError();
		//    3    7:new             #34  <Class AssertionError>
		//    4   10:dup             
		//    5   11:invokespecial   #35  <Method void AssertionError()>
		//    6   14:athrow          
			} else
			{
				_flddelegate = typeadapter;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #22  <Field TypeAdapter _flddelegate>
				return;
		//   10   20:return          
			}
		}

		public void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			if(_flddelegate == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field TypeAdapter _flddelegate>
		//*   2    4:ifnonnull       15
			{
				throw new IllegalStateException();
		//    3    7:new             #24  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:invokespecial   #25  <Method void IllegalStateException()>
		//    6   14:athrow          
			} else
			{
				_flddelegate.write(jsonwriter, obj);
		//    7   15:aload_0         
		//    8   16:getfield        #22  <Field TypeAdapter _flddelegate>
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokevirtual   #40  <Method void TypeAdapter.write(JsonWriter, Object)>
				return;
		//   12   24:return          
			}
		}

		private TypeAdapter _flddelegate;

		FutureTypeAdapter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void TypeAdapter()>
		//    2    4:return          
		}
	}


	public Gson()
	{
		this(Excluder.DEFAULT, ((FieldNamingStrategy) (FieldNamingPolicy.IDENTITY)), Collections.emptyMap(), false, false, false, true, false, false, LongSerializationPolicy.DEFAULT, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:getstatic       #51  <Field Excluder Excluder.DEFAULT>
	//    2    4:getstatic       #57  <Field FieldNamingPolicy FieldNamingPolicy.IDENTITY>
	//    3    7:invokestatic    #63  <Method Map Collections.emptyMap()>
	//    4   10:iconst_0        
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:iconst_1        
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:getstatic       #68  <Field LongSerializationPolicy LongSerializationPolicy.DEFAULT>
	//   11   19:invokestatic    #72  <Method List Collections.emptyList()>
	//   12   22:invokespecial   #75  <Method void Gson(Excluder, FieldNamingStrategy, Map, boolean, boolean, boolean, boolean, boolean, boolean, LongSerializationPolicy, List)>
	//   13   25:return          
	}

	Gson(Excluder excluder, FieldNamingStrategy fieldnamingstrategy, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
			boolean flag4, boolean flag5, LongSerializationPolicy longserializationpolicy, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		calls = new ThreadLocal();
	//    2    4:aload_0         
	//    3    5:new             #80  <Class ThreadLocal>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void ThreadLocal()>
	//    6   12:putfield        #83  <Field ThreadLocal calls>
		typeTokenCache = Collections.synchronizedMap(((Map) (new HashMap())));
	//    7   15:aload_0         
	//    8   16:new             #85  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void HashMap()>
	//   11   23:invokestatic    #90  <Method Map Collections.synchronizedMap(Map)>
	//   12   26:putfield        #92  <Field Map typeTokenCache>
		deserializationContext = new JsonDeserializationContext() {

			public Object deserialize(JsonElement jsonelement, Type type)
				throws JsonParseException
			{
				return fromJson(jsonelement, type);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Gson this$0>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #25  <Method Object Gson.fromJson(JsonElement, Type)>
			//    5    9:areturn         
			}

			final Gson this$0;

			
			{
				this$0 = Gson.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Gson this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   29:aload_0         
	//   14   30:new             #6   <Class Gson$1>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #95  <Method void Gson$1(Gson)>
	//   18   38:putfield        #97  <Field JsonDeserializationContext deserializationContext>
		serializationContext = new JsonSerializationContext() {

			public JsonElement serialize(Object obj)
			{
				return toJsonTree(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Gson this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #23  <Method JsonElement Gson.toJsonTree(Object)>
			//    4    8:areturn         
			}

			public JsonElement serialize(Object obj, Type type)
			{
				return toJsonTree(obj, type);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Gson this$0>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #26  <Method JsonElement Gson.toJsonTree(Object, Type)>
			//    5    9:areturn         
			}

			final Gson this$0;

			
			{
				this$0 = Gson.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Gson this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   19   41:aload_0         
	//   20   42:new             #8   <Class Gson$2>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:invokespecial   #98  <Method void Gson$2(Gson)>
	//   24   50:putfield        #100 <Field JsonSerializationContext serializationContext>
		constructorConstructor = new ConstructorConstructor(map);
	//   25   53:aload_0         
	//   26   54:new             #102 <Class ConstructorConstructor>
	//   27   57:dup             
	//   28   58:aload_3         
	//   29   59:invokespecial   #105 <Method void ConstructorConstructor(Map)>
	//   30   62:putfield        #107 <Field ConstructorConstructor constructorConstructor>
		serializeNulls = flag;
	//   31   65:aload_0         
	//   32   66:iload           4
	//   33   68:putfield        #109 <Field boolean serializeNulls>
		generateNonExecutableJson = flag2;
	//   34   71:aload_0         
	//   35   72:iload           6
	//   36   74:putfield        #111 <Field boolean generateNonExecutableJson>
		htmlSafe = flag3;
	//   37   77:aload_0         
	//   38   78:iload           7
	//   39   80:putfield        #113 <Field boolean htmlSafe>
		prettyPrinting = flag4;
	//   40   83:aload_0         
	//   41   84:iload           8
	//   42   86:putfield        #115 <Field boolean prettyPrinting>
		map = ((Map) (new ArrayList()));
	//   43   89:new             #117 <Class ArrayList>
	//   44   92:dup             
	//   45   93:invokespecial   #118 <Method void ArrayList()>
	//   46   96:astore_3        
		((List) (map)).add(((Object) (TypeAdapters.JSON_ELEMENT_FACTORY)));
	//   47   97:aload_3         
	//   48   98:getstatic       #124 <Field TypeAdapterFactory TypeAdapters.JSON_ELEMENT_FACTORY>
	//   49  101:invokeinterface #130 <Method boolean List.add(Object)>
	//   50  106:pop             
		((List) (map)).add(((Object) (ObjectTypeAdapter.FACTORY)));
	//   51  107:aload_3         
	//   52  108:getstatic       #135 <Field TypeAdapterFactory ObjectTypeAdapter.FACTORY>
	//   53  111:invokeinterface #130 <Method boolean List.add(Object)>
	//   54  116:pop             
		((List) (map)).add(((Object) (excluder)));
	//   55  117:aload_3         
	//   56  118:aload_1         
	//   57  119:invokeinterface #130 <Method boolean List.add(Object)>
	//   58  124:pop             
		((List) (map)).addAll(((java.util.Collection) (list)));
	//   59  125:aload_3         
	//   60  126:aload           11
	//   61  128:invokeinterface #139 <Method boolean List.addAll(java.util.Collection)>
	//   62  133:pop             
		((List) (map)).add(((Object) (TypeAdapters.STRING_FACTORY)));
	//   63  134:aload_3         
	//   64  135:getstatic       #142 <Field TypeAdapterFactory TypeAdapters.STRING_FACTORY>
	//   65  138:invokeinterface #130 <Method boolean List.add(Object)>
	//   66  143:pop             
		((List) (map)).add(((Object) (TypeAdapters.INTEGER_FACTORY)));
	//   67  144:aload_3         
	//   68  145:getstatic       #145 <Field TypeAdapterFactory TypeAdapters.INTEGER_FACTORY>
	//   69  148:invokeinterface #130 <Method boolean List.add(Object)>
	//   70  153:pop             
		((List) (map)).add(((Object) (TypeAdapters.BOOLEAN_FACTORY)));
	//   71  154:aload_3         
	//   72  155:getstatic       #148 <Field TypeAdapterFactory TypeAdapters.BOOLEAN_FACTORY>
	//   73  158:invokeinterface #130 <Method boolean List.add(Object)>
	//   74  163:pop             
		((List) (map)).add(((Object) (TypeAdapters.BYTE_FACTORY)));
	//   75  164:aload_3         
	//   76  165:getstatic       #151 <Field TypeAdapterFactory TypeAdapters.BYTE_FACTORY>
	//   77  168:invokeinterface #130 <Method boolean List.add(Object)>
	//   78  173:pop             
		((List) (map)).add(((Object) (TypeAdapters.SHORT_FACTORY)));
	//   79  174:aload_3         
	//   80  175:getstatic       #154 <Field TypeAdapterFactory TypeAdapters.SHORT_FACTORY>
	//   81  178:invokeinterface #130 <Method boolean List.add(Object)>
	//   82  183:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(Long.TYPE, java/lang/Long, longAdapter(longserializationpolicy)))));
	//   83  184:aload_3         
	//   84  185:getstatic       #160 <Field Class Long.TYPE>
	//   85  188:ldc1            #156 <Class Long>
	//   86  190:aload_0         
	//   87  191:aload           10
	//   88  193:invokespecial   #164 <Method TypeAdapter longAdapter(LongSerializationPolicy)>
	//   89  196:invokestatic    #168 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, Class, TypeAdapter)>
	//   90  199:invokeinterface #130 <Method boolean List.add(Object)>
	//   91  204:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(Double.TYPE, java/lang/Double, doubleAdapter(flag5)))));
	//   92  205:aload_3         
	//   93  206:getstatic       #171 <Field Class Double.TYPE>
	//   94  209:ldc1            #170 <Class Double>
	//   95  211:aload_0         
	//   96  212:iload           9
	//   97  214:invokespecial   #175 <Method TypeAdapter doubleAdapter(boolean)>
	//   98  217:invokestatic    #168 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, Class, TypeAdapter)>
	//   99  220:invokeinterface #130 <Method boolean List.add(Object)>
	//  100  225:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(Float.TYPE, java/lang/Float, floatAdapter(flag5)))));
	//  101  226:aload_3         
	//  102  227:getstatic       #178 <Field Class Float.TYPE>
	//  103  230:ldc1            #177 <Class Float>
	//  104  232:aload_0         
	//  105  233:iload           9
	//  106  235:invokespecial   #181 <Method TypeAdapter floatAdapter(boolean)>
	//  107  238:invokestatic    #168 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, Class, TypeAdapter)>
	//  108  241:invokeinterface #130 <Method boolean List.add(Object)>
	//  109  246:pop             
		((List) (map)).add(((Object) (TypeAdapters.NUMBER_FACTORY)));
	//  110  247:aload_3         
	//  111  248:getstatic       #184 <Field TypeAdapterFactory TypeAdapters.NUMBER_FACTORY>
	//  112  251:invokeinterface #130 <Method boolean List.add(Object)>
	//  113  256:pop             
		((List) (map)).add(((Object) (TypeAdapters.CHARACTER_FACTORY)));
	//  114  257:aload_3         
	//  115  258:getstatic       #187 <Field TypeAdapterFactory TypeAdapters.CHARACTER_FACTORY>
	//  116  261:invokeinterface #130 <Method boolean List.add(Object)>
	//  117  266:pop             
		((List) (map)).add(((Object) (TypeAdapters.STRING_BUILDER_FACTORY)));
	//  118  267:aload_3         
	//  119  268:getstatic       #190 <Field TypeAdapterFactory TypeAdapters.STRING_BUILDER_FACTORY>
	//  120  271:invokeinterface #130 <Method boolean List.add(Object)>
	//  121  276:pop             
		((List) (map)).add(((Object) (TypeAdapters.STRING_BUFFER_FACTORY)));
	//  122  277:aload_3         
	//  123  278:getstatic       #193 <Field TypeAdapterFactory TypeAdapters.STRING_BUFFER_FACTORY>
	//  124  281:invokeinterface #130 <Method boolean List.add(Object)>
	//  125  286:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(java/math/BigDecimal, TypeAdapters.BIG_DECIMAL))));
	//  126  287:aload_3         
	//  127  288:ldc1            #195 <Class BigDecimal>
	//  128  290:getstatic       #199 <Field TypeAdapter TypeAdapters.BIG_DECIMAL>
	//  129  293:invokestatic    #202 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//  130  296:invokeinterface #130 <Method boolean List.add(Object)>
	//  131  301:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(java/math/BigInteger, TypeAdapters.BIG_INTEGER))));
	//  132  302:aload_3         
	//  133  303:ldc1            #204 <Class BigInteger>
	//  134  305:getstatic       #207 <Field TypeAdapter TypeAdapters.BIG_INTEGER>
	//  135  308:invokestatic    #202 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//  136  311:invokeinterface #130 <Method boolean List.add(Object)>
	//  137  316:pop             
		((List) (map)).add(((Object) (TypeAdapters.URL_FACTORY)));
	//  138  317:aload_3         
	//  139  318:getstatic       #210 <Field TypeAdapterFactory TypeAdapters.URL_FACTORY>
	//  140  321:invokeinterface #130 <Method boolean List.add(Object)>
	//  141  326:pop             
		((List) (map)).add(((Object) (TypeAdapters.URI_FACTORY)));
	//  142  327:aload_3         
	//  143  328:getstatic       #213 <Field TypeAdapterFactory TypeAdapters.URI_FACTORY>
	//  144  331:invokeinterface #130 <Method boolean List.add(Object)>
	//  145  336:pop             
		((List) (map)).add(((Object) (TypeAdapters.UUID_FACTORY)));
	//  146  337:aload_3         
	//  147  338:getstatic       #216 <Field TypeAdapterFactory TypeAdapters.UUID_FACTORY>
	//  148  341:invokeinterface #130 <Method boolean List.add(Object)>
	//  149  346:pop             
		((List) (map)).add(((Object) (TypeAdapters.LOCALE_FACTORY)));
	//  150  347:aload_3         
	//  151  348:getstatic       #219 <Field TypeAdapterFactory TypeAdapters.LOCALE_FACTORY>
	//  152  351:invokeinterface #130 <Method boolean List.add(Object)>
	//  153  356:pop             
		((List) (map)).add(((Object) (TypeAdapters.INET_ADDRESS_FACTORY)));
	//  154  357:aload_3         
	//  155  358:getstatic       #222 <Field TypeAdapterFactory TypeAdapters.INET_ADDRESS_FACTORY>
	//  156  361:invokeinterface #130 <Method boolean List.add(Object)>
	//  157  366:pop             
		((List) (map)).add(((Object) (TypeAdapters.BIT_SET_FACTORY)));
	//  158  367:aload_3         
	//  159  368:getstatic       #225 <Field TypeAdapterFactory TypeAdapters.BIT_SET_FACTORY>
	//  160  371:invokeinterface #130 <Method boolean List.add(Object)>
	//  161  376:pop             
		((List) (map)).add(((Object) (DateTypeAdapter.FACTORY)));
	//  162  377:aload_3         
	//  163  378:getstatic       #228 <Field TypeAdapterFactory DateTypeAdapter.FACTORY>
	//  164  381:invokeinterface #130 <Method boolean List.add(Object)>
	//  165  386:pop             
		((List) (map)).add(((Object) (TypeAdapters.CALENDAR_FACTORY)));
	//  166  387:aload_3         
	//  167  388:getstatic       #231 <Field TypeAdapterFactory TypeAdapters.CALENDAR_FACTORY>
	//  168  391:invokeinterface #130 <Method boolean List.add(Object)>
	//  169  396:pop             
		((List) (map)).add(((Object) (TimeTypeAdapter.FACTORY)));
	//  170  397:aload_3         
	//  171  398:getstatic       #234 <Field TypeAdapterFactory TimeTypeAdapter.FACTORY>
	//  172  401:invokeinterface #130 <Method boolean List.add(Object)>
	//  173  406:pop             
		((List) (map)).add(((Object) (SqlDateTypeAdapter.FACTORY)));
	//  174  407:aload_3         
	//  175  408:getstatic       #237 <Field TypeAdapterFactory SqlDateTypeAdapter.FACTORY>
	//  176  411:invokeinterface #130 <Method boolean List.add(Object)>
	//  177  416:pop             
		((List) (map)).add(((Object) (TypeAdapters.TIMESTAMP_FACTORY)));
	//  178  417:aload_3         
	//  179  418:getstatic       #240 <Field TypeAdapterFactory TypeAdapters.TIMESTAMP_FACTORY>
	//  180  421:invokeinterface #130 <Method boolean List.add(Object)>
	//  181  426:pop             
		((List) (map)).add(((Object) (ArrayTypeAdapter.FACTORY)));
	//  182  427:aload_3         
	//  183  428:getstatic       #243 <Field TypeAdapterFactory ArrayTypeAdapter.FACTORY>
	//  184  431:invokeinterface #130 <Method boolean List.add(Object)>
	//  185  436:pop             
		((List) (map)).add(((Object) (TypeAdapters.CLASS_FACTORY)));
	//  186  437:aload_3         
	//  187  438:getstatic       #246 <Field TypeAdapterFactory TypeAdapters.CLASS_FACTORY>
	//  188  441:invokeinterface #130 <Method boolean List.add(Object)>
	//  189  446:pop             
		((List) (map)).add(((Object) (new CollectionTypeAdapterFactory(constructorConstructor))));
	//  190  447:aload_3         
	//  191  448:new             #248 <Class CollectionTypeAdapterFactory>
	//  192  451:dup             
	//  193  452:aload_0         
	//  194  453:getfield        #107 <Field ConstructorConstructor constructorConstructor>
	//  195  456:invokespecial   #251 <Method void CollectionTypeAdapterFactory(ConstructorConstructor)>
	//  196  459:invokeinterface #130 <Method boolean List.add(Object)>
	//  197  464:pop             
		((List) (map)).add(((Object) (new MapTypeAdapterFactory(constructorConstructor, flag1))));
	//  198  465:aload_3         
	//  199  466:new             #253 <Class MapTypeAdapterFactory>
	//  200  469:dup             
	//  201  470:aload_0         
	//  202  471:getfield        #107 <Field ConstructorConstructor constructorConstructor>
	//  203  474:iload           5
	//  204  476:invokespecial   #256 <Method void MapTypeAdapterFactory(ConstructorConstructor, boolean)>
	//  205  479:invokeinterface #130 <Method boolean List.add(Object)>
	//  206  484:pop             
		((List) (map)).add(((Object) (new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor))));
	//  207  485:aload_3         
	//  208  486:new             #258 <Class JsonAdapterAnnotationTypeAdapterFactory>
	//  209  489:dup             
	//  210  490:aload_0         
	//  211  491:getfield        #107 <Field ConstructorConstructor constructorConstructor>
	//  212  494:invokespecial   #259 <Method void JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor)>
	//  213  497:invokeinterface #130 <Method boolean List.add(Object)>
	//  214  502:pop             
		((List) (map)).add(((Object) (TypeAdapters.ENUM_FACTORY)));
	//  215  503:aload_3         
	//  216  504:getstatic       #262 <Field TypeAdapterFactory TypeAdapters.ENUM_FACTORY>
	//  217  507:invokeinterface #130 <Method boolean List.add(Object)>
	//  218  512:pop             
		((List) (map)).add(((Object) (new ReflectiveTypeAdapterFactory(constructorConstructor, fieldnamingstrategy, excluder))));
	//  219  513:aload_3         
	//  220  514:new             #264 <Class ReflectiveTypeAdapterFactory>
	//  221  517:dup             
	//  222  518:aload_0         
	//  223  519:getfield        #107 <Field ConstructorConstructor constructorConstructor>
	//  224  522:aload_2         
	//  225  523:aload_1         
	//  226  524:invokespecial   #267 <Method void ReflectiveTypeAdapterFactory(ConstructorConstructor, FieldNamingStrategy, Excluder)>
	//  227  527:invokeinterface #130 <Method boolean List.add(Object)>
	//  228  532:pop             
		factories = Collections.unmodifiableList(((List) (map)));
	//  229  533:aload_0         
	//  230  534:aload_3         
	//  231  535:invokestatic    #271 <Method List Collections.unmodifiableList(List)>
	//  232  538:putfield        #273 <Field List factories>
	//  233  541:return          
	}

	private static void assertFullConsumption(Object obj, JsonReader jsonreader)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          45
			try
			{
				if(jsonreader.peek() != JsonToken.END_DOCUMENT)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #293 <Method JsonToken JsonReader.peek()>
	//*   4    8:getstatic       #299 <Field JsonToken JsonToken.END_DOCUMENT>
	//*   5   11:if_acmpeq       45
					throw new JsonIOException("JSON document was not fully consumed.");
	//    6   14:new             #301 <Class JsonIOException>
	//    7   17:dup             
	//    8   18:ldc2            #303 <String "JSON document was not fully consumed.">
	//    9   21:invokespecial   #306 <Method void JsonIOException(String)>
	//   10   24:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  11   25:astore_0        
			{
				throw new JsonSyntaxException(((Throwable) (obj)));
	//   12   26:new             #308 <Class JsonSyntaxException>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #311 <Method void JsonSyntaxException(Throwable)>
	//   16   34:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  17   35:astore_0        
			{
				throw new JsonIOException(((Throwable) (obj)));
	//   18   36:new             #301 <Class JsonIOException>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:invokespecial   #312 <Method void JsonIOException(Throwable)>
	//   22   44:athrow          
			}
	//   23   45:return          
	}

	private void checkValidFloatingPoint(double d)
	{
		if(Double.isNaN(d) || Double.isInfinite(d))
	//*   0    0:dload_1         
	//*   1    1:invokestatic    #316 <Method boolean Double.isNaN(double)>
	//*   2    4:ifne            14
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #319 <Method boolean Double.isInfinite(double)>
	//*   5   11:ifeq            48
			throw new IllegalArgumentException((new StringBuilder()).append(d).append(" is not a valid double value as per JSON specification. To override this").append(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
	//    6   14:new             #321 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:new             #323 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #324 <Method void StringBuilder()>
	//   11   25:dload_1         
	//   12   26:invokevirtual   #328 <Method StringBuilder StringBuilder.append(double)>
	//   13   29:ldc2            #330 <String " is not a valid double value as per JSON specification. To override this">
	//   14   32:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc2            #335 <String " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.">
	//   16   38:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #339 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #340 <Method void IllegalArgumentException(String)>
	//   19   47:athrow          
		else
			return;
	//   20   48:return          
	}

	private TypeAdapter doubleAdapter(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			return TypeAdapters.DOUBLE;
	//    2    4:getstatic       #343 <Field TypeAdapter TypeAdapters.DOUBLE>
	//    3    7:areturn         
		else
			return ((TypeAdapter) (new TypeAdapter() {

				public Double read(JsonReader jsonreader)
					throws IOException
				{
					if(jsonreader.peek() == JsonToken.NULL)
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #30  <Method JsonToken JsonReader.peek()>
				//*   2    4:getstatic       #36  <Field JsonToken JsonToken.NULL>
				//*   3    7:if_acmpne       16
					{
						jsonreader.nextNull();
				//    4   10:aload_1         
				//    5   11:invokevirtual   #39  <Method void JsonReader.nextNull()>
						return null;
				//    6   14:aconst_null     
				//    7   15:areturn         
					} else
					{
						return Double.valueOf(jsonreader.nextDouble());
				//    8   16:aload_1         
				//    9   17:invokevirtual   #43  <Method double JsonReader.nextDouble()>
				//   10   20:invokestatic    #49  <Method Double Double.valueOf(double)>
				//   11   23:areturn         
					}
				}

				public volatile Object read(JsonReader jsonreader)
					throws IOException
				{
					return ((Object) (read(jsonreader)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #53  <Method Double read(JsonReader)>
				//    3    5:areturn         
				}

				public void write(JsonWriter jsonwriter, Number number)
					throws IOException
				{
					if(number == null)
				//*   0    0:aload_2         
				//*   1    1:ifnonnull       10
					{
						jsonwriter.nullValue();
				//    2    4:aload_1         
				//    3    5:invokevirtual   #61  <Method JsonWriter JsonWriter.nullValue()>
				//    4    8:pop             
						return;
				//    5    9:return          
					} else
					{
						double d = number.doubleValue();
				//    6   10:aload_2         
				//    7   11:invokevirtual   #66  <Method double Number.doubleValue()>
				//    8   14:dstore_3        
						checkValidFloatingPoint(d);
				//    9   15:aload_0         
				//   10   16:getfield        #16  <Field Gson this$0>
				//   11   19:dload_3         
				//   12   20:invokestatic    #70  <Method void Gson.access$000(Gson, double)>
						jsonwriter.value(number);
				//   13   23:aload_1         
				//   14   24:aload_2         
				//   15   25:invokevirtual   #74  <Method JsonWriter JsonWriter.value(Number)>
				//   16   28:pop             
						return;
				//   17   29:return          
					}
				}

				public volatile void write(JsonWriter jsonwriter, Object obj)
					throws IOException
				{
					write(jsonwriter, (Number)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #63  <Class Number>
				//    4    6:invokevirtual   #77  <Method void write(JsonWriter, Number)>
				//    5    9:return          
				}

				final Gson this$0;

			
			{
				this$0 = Gson.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Gson this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void TypeAdapter()>
			//    5    9:return          
			}
			}
));
	//    4    8:new             #10  <Class Gson$3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #344 <Method void Gson$3(Gson)>
	//    8   16:areturn         
	}

	private TypeAdapter floatAdapter(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			return TypeAdapters.FLOAT;
	//    2    4:getstatic       #348 <Field TypeAdapter TypeAdapters.FLOAT>
	//    3    7:areturn         
		else
			return ((TypeAdapter) (new TypeAdapter() {

				public Float read(JsonReader jsonreader)
					throws IOException
				{
					if(jsonreader.peek() == JsonToken.NULL)
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #30  <Method JsonToken JsonReader.peek()>
				//*   2    4:getstatic       #36  <Field JsonToken JsonToken.NULL>
				//*   3    7:if_acmpne       16
					{
						jsonreader.nextNull();
				//    4   10:aload_1         
				//    5   11:invokevirtual   #39  <Method void JsonReader.nextNull()>
						return null;
				//    6   14:aconst_null     
				//    7   15:areturn         
					} else
					{
						return Float.valueOf((float)jsonreader.nextDouble());
				//    8   16:aload_1         
				//    9   17:invokevirtual   #43  <Method double JsonReader.nextDouble()>
				//   10   20:d2f             
				//   11   21:invokestatic    #49  <Method Float Float.valueOf(float)>
				//   12   24:areturn         
					}
				}

				public volatile Object read(JsonReader jsonreader)
					throws IOException
				{
					return ((Object) (read(jsonreader)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #53  <Method Float read(JsonReader)>
				//    3    5:areturn         
				}

				public void write(JsonWriter jsonwriter, Number number)
					throws IOException
				{
					if(number == null)
				//*   0    0:aload_2         
				//*   1    1:ifnonnull       10
					{
						jsonwriter.nullValue();
				//    2    4:aload_1         
				//    3    5:invokevirtual   #61  <Method JsonWriter JsonWriter.nullValue()>
				//    4    8:pop             
						return;
				//    5    9:return          
					} else
					{
						float f = number.floatValue();
				//    6   10:aload_2         
				//    7   11:invokevirtual   #67  <Method float Number.floatValue()>
				//    8   14:fstore_3        
						checkValidFloatingPoint(f);
				//    9   15:aload_0         
				//   10   16:getfield        #16  <Field Gson this$0>
				//   11   19:fload_3         
				//   12   20:f2d             
				//   13   21:invokestatic    #71  <Method void Gson.access$000(Gson, double)>
						jsonwriter.value(number);
				//   14   24:aload_1         
				//   15   25:aload_2         
				//   16   26:invokevirtual   #75  <Method JsonWriter JsonWriter.value(Number)>
				//   17   29:pop             
						return;
				//   18   30:return          
					}
				}

				public volatile void write(JsonWriter jsonwriter, Object obj)
					throws IOException
				{
					write(jsonwriter, (Number)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #63  <Class Number>
				//    4    6:invokevirtual   #78  <Method void write(JsonWriter, Number)>
				//    5    9:return          
				}

				final Gson this$0;

			
			{
				this$0 = Gson.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Gson this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void TypeAdapter()>
			//    5    9:return          
			}
			}
));
	//    4    8:new             #12  <Class Gson$4>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #349 <Method void Gson$4(Gson)>
	//    8   16:areturn         
	}

	private TypeAdapter longAdapter(LongSerializationPolicy longserializationpolicy)
	{
		if(longserializationpolicy == LongSerializationPolicy.DEFAULT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #68  <Field LongSerializationPolicy LongSerializationPolicy.DEFAULT>
	//*   2    4:if_acmpne       11
			return TypeAdapters.LONG;
	//    3    7:getstatic       #352 <Field TypeAdapter TypeAdapters.LONG>
	//    4   10:areturn         
		else
			return ((TypeAdapter) (new TypeAdapter() {

				public Number read(JsonReader jsonreader)
					throws IOException
				{
					if(jsonreader.peek() == JsonToken.NULL)
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #30  <Method JsonToken JsonReader.peek()>
				//*   2    4:getstatic       #36  <Field JsonToken JsonToken.NULL>
				//*   3    7:if_acmpne       16
					{
						jsonreader.nextNull();
				//    4   10:aload_1         
				//    5   11:invokevirtual   #39  <Method void JsonReader.nextNull()>
						return null;
				//    6   14:aconst_null     
				//    7   15:areturn         
					} else
					{
						return ((Number) (Long.valueOf(jsonreader.nextLong())));
				//    8   16:aload_1         
				//    9   17:invokevirtual   #43  <Method long JsonReader.nextLong()>
				//   10   20:invokestatic    #49  <Method Long Long.valueOf(long)>
				//   11   23:areturn         
					}
				}

				public volatile Object read(JsonReader jsonreader)
					throws IOException
				{
					return ((Object) (read(jsonreader)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #53  <Method Number read(JsonReader)>
				//    3    5:areturn         
				}

				public void write(JsonWriter jsonwriter, Number number)
					throws IOException
				{
					if(number == null)
				//*   0    0:aload_2         
				//*   1    1:ifnonnull       10
					{
						jsonwriter.nullValue();
				//    2    4:aload_1         
				//    3    5:invokevirtual   #61  <Method JsonWriter JsonWriter.nullValue()>
				//    4    8:pop             
						return;
				//    5    9:return          
					} else
					{
						jsonwriter.value(((Object) (number)).toString());
				//    6   10:aload_1         
				//    7   11:aload_2         
				//    8   12:invokevirtual   #67  <Method String Object.toString()>
				//    9   15:invokevirtual   #71  <Method JsonWriter JsonWriter.value(String)>
				//   10   18:pop             
						return;
				//   11   19:return          
					}
				}

				public volatile void write(JsonWriter jsonwriter, Object obj)
					throws IOException
				{
					write(jsonwriter, (Number)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #74  <Class Number>
				//    4    6:invokevirtual   #76  <Method void write(JsonWriter, Number)>
				//    5    9:return          
				}

				final Gson this$0;

			
			{
				this$0 = Gson.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Gson this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void TypeAdapter()>
			//    5    9:return          
			}
			}
));
	//    5   11:new             #14  <Class Gson$5>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #353 <Method void Gson$5(Gson)>
	//    9   19:areturn         
	}

	public Object fromJson(JsonElement jsonelement, Class class1)
		throws JsonSyntaxException
	{
		jsonelement = ((JsonElement) (fromJson(jsonelement, ((Type) (class1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #359 <Method Object fromJson(JsonElement, Type)>
	//    4    6:astore_1        
		return Primitives.wrap(class1).cast(((Object) (jsonelement)));
	//    5    7:aload_2         
	//    6    8:invokestatic    #365 <Method Class Primitives.wrap(Class)>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #371 <Method Object Class.cast(Object)>
	//    9   15:areturn         
	}

	public Object fromJson(JsonElement jsonelement, Type type)
		throws JsonSyntaxException
	{
		if(jsonelement == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return fromJson(((JsonReader) (new JsonTreeReader(jsonelement))), type);
	//    4    6:aload_0         
	//    5    7:new             #375 <Class JsonTreeReader>
	//    6   10:dup             
	//    7   11:aload_1         
	//    8   12:invokespecial   #378 <Method void JsonTreeReader(JsonElement)>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #381 <Method Object fromJson(JsonReader, Type)>
	//   11   19:areturn         
	}

	public Object fromJson(JsonReader jsonreader, Type type)
		throws JsonIOException, JsonSyntaxException
	{
		boolean flag;
		boolean flag1;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag1 = jsonreader.isLenient();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #390 <Method boolean JsonReader.isLenient()>
	//    4    6:istore          4
		jsonreader.setLenient(true);
	//    5    8:aload_1         
	//    6    9:iconst_1        
	//    7   10:invokevirtual   #394 <Method void JsonReader.setLenient(boolean)>
		jsonreader.peek();
	//    8   13:aload_1         
	//    9   14:invokevirtual   #293 <Method JsonToken JsonReader.peek()>
	//   10   17:pop             
		flag = false;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		type = ((Type) (getAdapter(TypeToken.get(type)).read(jsonreader)));
	//   13   20:aload_0         
	//   14   21:aload_2         
	//   15   22:invokestatic    #400 <Method TypeToken TypeToken.get(Type)>
	//   16   25:invokevirtual   #404 <Method TypeAdapter getAdapter(TypeToken)>
	//   17   28:aload_1         
	//   18   29:invokevirtual   #410 <Method Object TypeAdapter.read(JsonReader)>
	//   19   32:astore_2        
		jsonreader.setLenient(flag1);
	//   20   33:aload_1         
	//   21   34:iload           4
	//   22   36:invokevirtual   #394 <Method void JsonReader.setLenient(boolean)>
		return ((Object) (type));
	//   23   39:aload_2         
	//   24   40:areturn         
		type;
	//   25   41:astore_2        
		if(flag)
	//*  26   42:iload_3         
	//*  27   43:ifeq            54
		{
			jsonreader.setLenient(flag1);
	//   28   46:aload_1         
	//   29   47:iload           4
	//   30   49:invokevirtual   #394 <Method void JsonReader.setLenient(boolean)>
			return ((Object) (null));
	//   31   52:aconst_null     
	//   32   53:areturn         
		}
		throw new JsonSyntaxException(((Throwable) (type)));
	//   33   54:new             #308 <Class JsonSyntaxException>
	//   34   57:dup             
	//   35   58:aload_2         
	//   36   59:invokespecial   #311 <Method void JsonSyntaxException(Throwable)>
	//   37   62:athrow          
		type;
	//   38   63:astore_2        
		jsonreader.setLenient(flag1);
	//   39   64:aload_1         
	//   40   65:iload           4
	//   41   67:invokevirtual   #394 <Method void JsonReader.setLenient(boolean)>
		throw type;
	//   42   70:aload_2         
	//   43   71:athrow          
		type;
	//   44   72:astore_2        
		throw new JsonSyntaxException(((Throwable) (type)));
	//   45   73:new             #308 <Class JsonSyntaxException>
	//   46   76:dup             
	//   47   77:aload_2         
	//   48   78:invokespecial   #311 <Method void JsonSyntaxException(Throwable)>
	//   49   81:athrow          
		type;
	//   50   82:astore_2        
		throw new JsonSyntaxException(((Throwable) (type)));
	//   51   83:new             #308 <Class JsonSyntaxException>
	//   52   86:dup             
	//   53   87:aload_2         
	//   54   88:invokespecial   #311 <Method void JsonSyntaxException(Throwable)>
	//   55   91:athrow          
	}

	public Object fromJson(Reader reader, Class class1)
		throws JsonSyntaxException, JsonIOException
	{
		reader = ((Reader) (new JsonReader(reader)));
	//    0    0:new             #289 <Class JsonReader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #415 <Method void JsonReader(Reader)>
	//    4    8:astore_1        
		Object obj = fromJson(((JsonReader) (reader)), ((Type) (class1)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #381 <Method Object fromJson(JsonReader, Type)>
	//    9   15:astore_3        
		assertFullConsumption(obj, ((JsonReader) (reader)));
	//   10   16:aload_3         
	//   11   17:aload_1         
	//   12   18:invokestatic    #417 <Method void assertFullConsumption(Object, JsonReader)>
		return Primitives.wrap(class1).cast(obj);
	//   13   21:aload_2         
	//   14   22:invokestatic    #365 <Method Class Primitives.wrap(Class)>
	//   15   25:aload_3         
	//   16   26:invokevirtual   #371 <Method Object Class.cast(Object)>
	//   17   29:areturn         
	}

	public Object fromJson(Reader reader, Type type)
		throws JsonIOException, JsonSyntaxException
	{
		reader = ((Reader) (new JsonReader(reader)));
	//    0    0:new             #289 <Class JsonReader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #415 <Method void JsonReader(Reader)>
	//    4    8:astore_1        
		type = ((Type) (fromJson(((JsonReader) (reader)), type)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #381 <Method Object fromJson(JsonReader, Type)>
	//    9   15:astore_2        
		assertFullConsumption(((Object) (type)), ((JsonReader) (reader)));
	//   10   16:aload_2         
	//   11   17:aload_1         
	//   12   18:invokestatic    #417 <Method void assertFullConsumption(Object, JsonReader)>
		return ((Object) (type));
	//   13   21:aload_2         
	//   14   22:areturn         
	}

	public Object fromJson(String s, Class class1)
		throws JsonSyntaxException
	{
		s = ((String) (fromJson(s, ((Type) (class1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #424 <Method Object fromJson(String, Type)>
	//    4    6:astore_1        
		return Primitives.wrap(class1).cast(((Object) (s)));
	//    5    7:aload_2         
	//    6    8:invokestatic    #365 <Method Class Primitives.wrap(Class)>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #371 <Method Object Class.cast(Object)>
	//    9   15:areturn         
	}

	public Object fromJson(String s, Type type)
		throws JsonSyntaxException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return fromJson(((Reader) (new StringReader(s))), type);
	//    4    6:aload_0         
	//    5    7:new             #427 <Class StringReader>
	//    6   10:dup             
	//    7   11:aload_1         
	//    8   12:invokespecial   #428 <Method void StringReader(String)>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #430 <Method Object fromJson(Reader, Type)>
	//   11   19:areturn         
	}

	public TypeAdapter getAdapter(TypeToken typetoken)
	{
		boolean flag;
		Object obj;
		obj = ((Object) ((TypeAdapter)typeTokenCache.get(((Object) (typetoken)))));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Map typeTokenCache>
	//    2    4:aload_1         
	//    3    5:invokeinterface #435 <Method Object Map.get(Object)>
	//    4   10:checkcast       #406 <Class TypeAdapter>
	//    5   13:astore_3        
		if(obj != null)
	//*   6   14:aload_3         
	//*   7   15:ifnull          20
			return ((TypeAdapter) (obj));
	//    8   18:aload_3         
	//    9   19:areturn         
		Object obj1 = ((Object) ((Map)calls.get()));
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field ThreadLocal calls>
	//   12   24:invokevirtual   #438 <Method Object ThreadLocal.get()>
	//   13   27:checkcast       #433 <Class Map>
	//   14   30:astore          4
		flag = false;
	//   15   32:iconst_0        
	//   16   33:istore_2        
		obj = obj1;
	//   17   34:aload           4
	//   18   36:astore_3        
		if(obj1 == null)
	//*  19   37:aload           4
	//*  20   39:ifnonnull       60
		{
			obj = ((Object) (new HashMap()));
	//   21   42:new             #85  <Class HashMap>
	//   22   45:dup             
	//   23   46:invokespecial   #86  <Method void HashMap()>
	//   24   49:astore_3        
			calls.set(obj);
	//   25   50:aload_0         
	//   26   51:getfield        #83  <Field ThreadLocal calls>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #442 <Method void ThreadLocal.set(Object)>
			flag = true;
	//   29   58:iconst_1        
	//   30   59:istore_2        
		}
		obj1 = ((Object) ((FutureTypeAdapter)((Map) (obj)).get(((Object) (typetoken)))));
	//   31   60:aload_3         
	//   32   61:aload_1         
	//   33   62:invokeinterface #435 <Method Object Map.get(Object)>
	//   34   67:checkcast       #16  <Class Gson$FutureTypeAdapter>
	//   35   70:astore          4
		if(obj1 != null)
	//*  36   72:aload           4
	//*  37   74:ifnull          80
			return ((TypeAdapter) (obj1));
	//   38   77:aload           4
	//   39   79:areturn         
		FutureTypeAdapter futuretypeadapter;
		Iterator iterator;
		futuretypeadapter = new FutureTypeAdapter();
	//   40   80:new             #16  <Class Gson$FutureTypeAdapter>
	//   41   83:dup             
	//   42   84:invokespecial   #443 <Method void Gson$FutureTypeAdapter()>
	//   43   87:astore          4
		((Map) (obj)).put(((Object) (typetoken)), ((Object) (futuretypeadapter)));
	//   44   89:aload_3         
	//   45   90:aload_1         
	//   46   91:aload           4
	//   47   93:invokeinterface #447 <Method Object Map.put(Object, Object)>
	//   48   98:pop             
		iterator = factories.iterator();
	//   49   99:aload_0         
	//   50  100:getfield        #273 <Field List factories>
	//   51  103:invokeinterface #451 <Method Iterator List.iterator()>
	//   52  108:astore          5
		TypeAdapter typeadapter;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_186;
	//   53  110:aload           5
	//   54  112:invokeinterface #456 <Method boolean Iterator.hasNext()>
	//   55  117:ifeq            186
			typeadapter = ((TypeAdapterFactory)iterator.next()).create(this, typetoken);
	//   56  120:aload           5
	//   57  122:invokeinterface #459 <Method Object Iterator.next()>
	//   58  127:checkcast       #461 <Class TypeAdapterFactory>
	//   59  130:aload_0         
	//   60  131:aload_1         
	//   61  132:invokeinterface #465 <Method TypeAdapter TypeAdapterFactory.create(Gson, TypeToken)>
	//   62  137:astore          6
		} while(typeadapter == null);
	//   63  139:aload           6
	//   64  141:ifnull          110
		futuretypeadapter.setDelegate(typeadapter);
	//   65  144:aload           4
	//   66  146:aload           6
	//   67  148:invokevirtual   #469 <Method void Gson$FutureTypeAdapter.setDelegate(TypeAdapter)>
		typeTokenCache.put(((Object) (typetoken)), ((Object) (typeadapter)));
	//   68  151:aload_0         
	//   69  152:getfield        #92  <Field Map typeTokenCache>
	//   70  155:aload_1         
	//   71  156:aload           6
	//   72  158:invokeinterface #447 <Method Object Map.put(Object, Object)>
	//   73  163:pop             
		((Map) (obj)).remove(((Object) (typetoken)));
	//   74  164:aload_3         
	//   75  165:aload_1         
	//   76  166:invokeinterface #472 <Method Object Map.remove(Object)>
	//   77  171:pop             
		if(flag)
	//*  78  172:iload_2         
	//*  79  173:ifeq            183
			calls.remove();
	//   80  176:aload_0         
	//   81  177:getfield        #83  <Field ThreadLocal calls>
	//   82  180:invokevirtual   #474 <Method void ThreadLocal.remove()>
		return typeadapter;
	//   83  183:aload           6
	//   84  185:areturn         
		throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot handle ").append(((Object) (typetoken))).toString());
	//   85  186:new             #321 <Class IllegalArgumentException>
	//   86  189:dup             
	//   87  190:new             #323 <Class StringBuilder>
	//   88  193:dup             
	//   89  194:invokespecial   #324 <Method void StringBuilder()>
	//   90  197:ldc2            #476 <String "GSON cannot handle ">
	//   91  200:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   92  203:aload_1         
	//   93  204:invokevirtual   #479 <Method StringBuilder StringBuilder.append(Object)>
	//   94  207:invokevirtual   #339 <Method String StringBuilder.toString()>
	//   95  210:invokespecial   #340 <Method void IllegalArgumentException(String)>
	//   96  213:athrow          
		Exception exception;
		exception;
	//   97  214:astore          4
		((Map) (obj)).remove(((Object) (typetoken)));
	//   98  216:aload_3         
	//   99  217:aload_1         
	//  100  218:invokeinterface #472 <Method Object Map.remove(Object)>
	//  101  223:pop             
		if(flag)
	//* 102  224:iload_2         
	//* 103  225:ifeq            235
			calls.remove();
	//  104  228:aload_0         
	//  105  229:getfield        #83  <Field ThreadLocal calls>
	//  106  232:invokevirtual   #474 <Method void ThreadLocal.remove()>
		throw exception;
	//  107  235:aload           4
	//  108  237:athrow          
	}

	public TypeAdapter getAdapter(Class class1)
	{
		return getAdapter(TypeToken.get(class1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #484 <Method TypeToken TypeToken.get(Class)>
	//    3    5:invokevirtual   #404 <Method TypeAdapter getAdapter(TypeToken)>
	//    4    8:areturn         
	}

	public TypeAdapter getDelegateAdapter(TypeAdapterFactory typeadapterfactory, TypeToken typetoken)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(!factories.contains(((Object) (typeadapterfactory))))
	//*   2    2:aload_0         
	//*   3    3:getfield        #273 <Field List factories>
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #490 <Method boolean List.contains(Object)>
	//*   6   12:ifne            17
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_3        
		for(Iterator iterator = factories.iterator(); iterator.hasNext();)
	//*   9   17:aload_0         
	//*  10   18:getfield        #273 <Field List factories>
	//*  11   21:invokeinterface #451 <Method Iterator List.iterator()>
	//*  12   26:astore          4
	//*  13   28:aload           4
	//*  14   30:invokeinterface #456 <Method boolean Iterator.hasNext()>
	//*  15   35:ifeq            84
		{
			Object obj = ((Object) ((TypeAdapterFactory)iterator.next()));
	//   16   38:aload           4
	//   17   40:invokeinterface #459 <Method Object Iterator.next()>
	//   18   45:checkcast       #461 <Class TypeAdapterFactory>
	//   19   48:astore          5
			if(!flag)
	//*  20   50:iload_3         
	//*  21   51:ifne            65
			{
				if(obj == typeadapterfactory)
	//*  22   54:aload           5
	//*  23   56:aload_1         
	//*  24   57:if_acmpne       28
					flag = true;
	//   25   60:iconst_1        
	//   26   61:istore_3        
			} else
	//*  27   62:goto            28
			{
				obj = ((Object) (((TypeAdapterFactory) (obj)).create(this, typetoken)));
	//   28   65:aload           5
	//   29   67:aload_0         
	//   30   68:aload_2         
	//   31   69:invokeinterface #465 <Method TypeAdapter TypeAdapterFactory.create(Gson, TypeToken)>
	//   32   74:astore          5
				if(obj != null)
	//*  33   76:aload           5
	//*  34   78:ifnull          28
					return ((TypeAdapter) (obj));
	//   35   81:aload           5
	//   36   83:areturn         
			}
		}

		throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot serialize ").append(((Object) (typetoken))).toString());
	//   37   84:new             #321 <Class IllegalArgumentException>
	//   38   87:dup             
	//   39   88:new             #323 <Class StringBuilder>
	//   40   91:dup             
	//   41   92:invokespecial   #324 <Method void StringBuilder()>
	//   42   95:ldc2            #492 <String "GSON cannot serialize ">
	//   43   98:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   44  101:aload_2         
	//   45  102:invokevirtual   #479 <Method StringBuilder StringBuilder.append(Object)>
	//   46  105:invokevirtual   #339 <Method String StringBuilder.toString()>
	//   47  108:invokespecial   #340 <Method void IllegalArgumentException(String)>
	//   48  111:athrow          
	}

	public JsonWriter newJsonWriter(Writer writer)
		throws IOException
	{
		if(generateNonExecutableJson)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field boolean generateNonExecutableJson>
	//*   2    4:ifeq            13
			writer.write(")]}'\n");
	//    3    7:aload_1         
	//    4    8:ldc1            #24  <String ")]}'\n">
	//    5   10:invokevirtual   #500 <Method void Writer.write(String)>
		writer = ((Writer) (new JsonWriter(writer)));
	//    6   13:new             #502 <Class JsonWriter>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #505 <Method void JsonWriter(Writer)>
	//   10   21:astore_1        
		if(prettyPrinting)
	//*  11   22:aload_0         
	//*  12   23:getfield        #115 <Field boolean prettyPrinting>
	//*  13   26:ifeq            36
			((JsonWriter) (writer)).setIndent("  ");
	//   14   29:aload_1         
	//   15   30:ldc2            #507 <String "  ">
	//   16   33:invokevirtual   #510 <Method void JsonWriter.setIndent(String)>
		((JsonWriter) (writer)).setSerializeNulls(serializeNulls);
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:getfield        #109 <Field boolean serializeNulls>
	//   20   41:invokevirtual   #513 <Method void JsonWriter.setSerializeNulls(boolean)>
		return ((JsonWriter) (writer));
	//   21   44:aload_1         
	//   22   45:areturn         
	}

	public String toJson(JsonElement jsonelement)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #517 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #518 <Method void StringWriter()>
	//    3    7:astore_2        
		toJson(jsonelement, ((Appendable) (stringwriter)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #521 <Method void toJson(JsonElement, Appendable)>
		return stringwriter.toString();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #522 <Method String StringWriter.toString()>
	//   10   18:areturn         
	}

	public String toJson(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			return toJson(((JsonElement) (JsonNull.INSTANCE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #529 <Field JsonNull JsonNull.INSTANCE>
	//    4    8:invokevirtual   #531 <Method String toJson(JsonElement)>
	//    5   11:areturn         
		else
			return toJson(obj, ((Type) (obj.getClass())));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #535 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #538 <Method String toJson(Object, Type)>
	//   11   21:areturn         
	}

	public String toJson(Object obj, Type type)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #517 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #518 <Method void StringWriter()>
	//    3    7:astore_3        
		toJson(obj, type, ((Appendable) (stringwriter)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #541 <Method void toJson(Object, Type, Appendable)>
		return stringwriter.toString();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #522 <Method String StringWriter.toString()>
	//   11   19:areturn         
	}

	public void toJson(JsonElement jsonelement, JsonWriter jsonwriter)
		throws JsonIOException
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag = jsonwriter.isLenient();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #543 <Method boolean JsonWriter.isLenient()>
	//    2    4:istore_3        
		jsonwriter.setLenient(true);
	//    3    5:aload_2         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #544 <Method void JsonWriter.setLenient(boolean)>
		flag1 = jsonwriter.isHtmlSafe();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #547 <Method boolean JsonWriter.isHtmlSafe()>
	//    8   14:istore          4
		jsonwriter.setHtmlSafe(htmlSafe);
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #113 <Field boolean htmlSafe>
	//   12   21:invokevirtual   #550 <Method void JsonWriter.setHtmlSafe(boolean)>
		flag2 = jsonwriter.getSerializeNulls();
	//   13   24:aload_2         
	//   14   25:invokevirtual   #553 <Method boolean JsonWriter.getSerializeNulls()>
	//   15   28:istore          5
		jsonwriter.setSerializeNulls(serializeNulls);
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #109 <Field boolean serializeNulls>
	//   19   35:invokevirtual   #513 <Method void JsonWriter.setSerializeNulls(boolean)>
		Streams.write(jsonelement, jsonwriter);
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokestatic    #557 <Method void Streams.write(JsonElement, JsonWriter)>
		jsonwriter.setLenient(flag);
	//   23   43:aload_2         
	//   24   44:iload_3         
	//   25   45:invokevirtual   #544 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   26   48:aload_2         
	//   27   49:iload           4
	//   28   51:invokevirtual   #550 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   29   54:aload_2         
	//   30   55:iload           5
	//   31   57:invokevirtual   #513 <Method void JsonWriter.setSerializeNulls(boolean)>
		return;
	//   32   60:return          
		jsonelement;
	//   33   61:astore_1        
		throw new JsonIOException(((Throwable) (jsonelement)));
	//   34   62:new             #301 <Class JsonIOException>
	//   35   65:dup             
	//   36   66:aload_1         
	//   37   67:invokespecial   #312 <Method void JsonIOException(Throwable)>
	//   38   70:athrow          
		jsonelement;
	//   39   71:astore_1        
		jsonwriter.setLenient(flag);
	//   40   72:aload_2         
	//   41   73:iload_3         
	//   42   74:invokevirtual   #544 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   43   77:aload_2         
	//   44   78:iload           4
	//   45   80:invokevirtual   #550 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   46   83:aload_2         
	//   47   84:iload           5
	//   48   86:invokevirtual   #513 <Method void JsonWriter.setSerializeNulls(boolean)>
		throw jsonelement;
	//   49   89:aload_1         
	//   50   90:athrow          
	}

	public void toJson(JsonElement jsonelement, Appendable appendable)
		throws JsonIOException
	{
		try
		{
			toJson(jsonelement, newJsonWriter(Streams.writerForAppendable(appendable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokestatic    #561 <Method Writer Streams.writerForAppendable(Appendable)>
	//    5    7:invokevirtual   #563 <Method JsonWriter newJsonWriter(Writer)>
	//    6   10:invokevirtual   #565 <Method void toJson(JsonElement, JsonWriter)>
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(JsonElement jsonelement)
	//*   8   14:astore_1        
		{
			throw new RuntimeException(((Throwable) (jsonelement)));
	//    9   15:new             #567 <Class RuntimeException>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #568 <Method void RuntimeException(Throwable)>
	//   13   23:athrow          
		}
	}

	public void toJson(Object obj, Appendable appendable)
		throws JsonIOException
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
		{
			toJson(obj, ((Type) (obj.getClass())), appendable);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #535 <Method Class Object.getClass()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #541 <Method void toJson(Object, Type, Appendable)>
			return;
	//    8   14:return          
		} else
		{
			toJson(((JsonElement) (JsonNull.INSTANCE)), appendable);
	//    9   15:aload_0         
	//   10   16:getstatic       #529 <Field JsonNull JsonNull.INSTANCE>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #521 <Method void toJson(JsonElement, Appendable)>
			return;
	//   13   23:return          
		}
	}

	public void toJson(Object obj, Type type, JsonWriter jsonwriter)
		throws JsonIOException
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		type = ((Type) (getAdapter(TypeToken.get(type))));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #400 <Method TypeToken TypeToken.get(Type)>
	//    3    5:invokevirtual   #404 <Method TypeAdapter getAdapter(TypeToken)>
	//    4    8:astore_2        
		flag = jsonwriter.isLenient();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #543 <Method boolean JsonWriter.isLenient()>
	//    7   13:istore          4
		jsonwriter.setLenient(true);
	//    8   15:aload_3         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #544 <Method void JsonWriter.setLenient(boolean)>
		flag1 = jsonwriter.isHtmlSafe();
	//   11   20:aload_3         
	//   12   21:invokevirtual   #547 <Method boolean JsonWriter.isHtmlSafe()>
	//   13   24:istore          5
		jsonwriter.setHtmlSafe(htmlSafe);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #113 <Field boolean htmlSafe>
	//   17   31:invokevirtual   #550 <Method void JsonWriter.setHtmlSafe(boolean)>
		flag2 = jsonwriter.getSerializeNulls();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #553 <Method boolean JsonWriter.getSerializeNulls()>
	//   20   38:istore          6
		jsonwriter.setSerializeNulls(serializeNulls);
	//   21   40:aload_3         
	//   22   41:aload_0         
	//   23   42:getfield        #109 <Field boolean serializeNulls>
	//   24   45:invokevirtual   #513 <Method void JsonWriter.setSerializeNulls(boolean)>
		((TypeAdapter) (type)).write(jsonwriter, obj);
	//   25   48:aload_2         
	//   26   49:aload_3         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #573 <Method void TypeAdapter.write(JsonWriter, Object)>
		jsonwriter.setLenient(flag);
	//   29   54:aload_3         
	//   30   55:iload           4
	//   31   57:invokevirtual   #544 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   32   60:aload_3         
	//   33   61:iload           5
	//   34   63:invokevirtual   #550 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   35   66:aload_3         
	//   36   67:iload           6
	//   37   69:invokevirtual   #513 <Method void JsonWriter.setSerializeNulls(boolean)>
		return;
	//   38   72:return          
		obj;
	//   39   73:astore_1        
		throw new JsonIOException(((Throwable) (obj)));
	//   40   74:new             #301 <Class JsonIOException>
	//   41   77:dup             
	//   42   78:aload_1         
	//   43   79:invokespecial   #312 <Method void JsonIOException(Throwable)>
	//   44   82:athrow          
		obj;
	//   45   83:astore_1        
		jsonwriter.setLenient(flag);
	//   46   84:aload_3         
	//   47   85:iload           4
	//   48   87:invokevirtual   #544 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   49   90:aload_3         
	//   50   91:iload           5
	//   51   93:invokevirtual   #550 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   52   96:aload_3         
	//   53   97:iload           6
	//   54   99:invokevirtual   #513 <Method void JsonWriter.setSerializeNulls(boolean)>
		throw obj;
	//   55  102:aload_1         
	//   56  103:athrow          
	}

	public void toJson(Object obj, Type type, Appendable appendable)
		throws JsonIOException
	{
		try
		{
			toJson(obj, type, newJsonWriter(Streams.writerForAppendable(appendable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_3         
	//    5    5:invokestatic    #561 <Method Writer Streams.writerForAppendable(Appendable)>
	//    6    8:invokevirtual   #563 <Method JsonWriter newJsonWriter(Writer)>
	//    7   11:invokevirtual   #575 <Method void toJson(Object, Type, JsonWriter)>
			return;
	//    8   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   9   15:astore_1        
		{
			throw new JsonIOException(((Throwable) (obj)));
	//   10   16:new             #301 <Class JsonIOException>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:invokespecial   #312 <Method void JsonIOException(Throwable)>
	//   14   24:athrow          
		}
	}

	public JsonElement toJsonTree(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return ((JsonElement) (JsonNull.INSTANCE));
	//    2    4:getstatic       #529 <Field JsonNull JsonNull.INSTANCE>
	//    3    7:areturn         
		else
			return toJsonTree(obj, ((Type) (obj.getClass())));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #535 <Method Class Object.getClass()>
	//    8   14:invokevirtual   #580 <Method JsonElement toJsonTree(Object, Type)>
	//    9   17:areturn         
	}

	public JsonElement toJsonTree(Object obj, Type type)
	{
		JsonTreeWriter jsontreewriter = new JsonTreeWriter();
	//    0    0:new             #582 <Class JsonTreeWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #583 <Method void JsonTreeWriter()>
	//    3    7:astore_3        
		toJson(obj, type, ((JsonWriter) (jsontreewriter)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #575 <Method void toJson(Object, Type, JsonWriter)>
		return jsontreewriter.get();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #586 <Method JsonElement JsonTreeWriter.get()>
	//   11   19:areturn         
	}

	public String toString()
	{
		return (new StringBuilder("{serializeNulls:")).append(serializeNulls).append("factories:").append(((Object) (factories))).append(",instanceCreators:").append(((Object) (constructorConstructor))).append("}").toString();
	//    0    0:new             #323 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #588 <String "{serializeNulls:">
	//    3    7:invokespecial   #589 <Method void StringBuilder(String)>
	//    4   10:aload_0         
	//    5   11:getfield        #109 <Field boolean serializeNulls>
	//    6   14:invokevirtual   #592 <Method StringBuilder StringBuilder.append(boolean)>
	//    7   17:ldc2            #594 <String "factories:">
	//    8   20:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:getfield        #273 <Field List factories>
	//   11   27:invokevirtual   #479 <Method StringBuilder StringBuilder.append(Object)>
	//   12   30:ldc2            #596 <String ",instanceCreators:">
	//   13   33:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:aload_0         
	//   15   37:getfield        #107 <Field ConstructorConstructor constructorConstructor>
	//   16   40:invokevirtual   #479 <Method StringBuilder StringBuilder.append(Object)>
	//   17   43:ldc2            #598 <String "}">
	//   18   46:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   19   49:invokevirtual   #339 <Method String StringBuilder.toString()>
	//   20   52:areturn         
	}

	static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
	private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
	private final ThreadLocal calls;
	private final ConstructorConstructor constructorConstructor;
	final JsonDeserializationContext deserializationContext;
	private final List factories;
	private final boolean generateNonExecutableJson;
	private final boolean htmlSafe;
	private final boolean prettyPrinting;
	final JsonSerializationContext serializationContext;
	private final boolean serializeNulls;
	private final Map typeTokenCache;


/*
	static void access$000(Gson gson, double d)
	{
		gson.checkValidFloatingPoint(d);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokespecial   #281 <Method void checkValidFloatingPoint(double)>
		return;
	//    3    5:return          
	}

*/
}
