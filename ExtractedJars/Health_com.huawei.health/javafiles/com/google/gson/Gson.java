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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

// Referenced classes of package com.google.gson:
//			FieldNamingPolicy, LongSerializationPolicy, JsonIOException, JsonSyntaxException, 
//			TypeAdapter, TypeAdapterFactory, JsonNull, FieldNamingStrategy, 
//			JsonElement

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
		this(Excluder.DEFAULT, ((FieldNamingStrategy) (FieldNamingPolicy.IDENTITY)), Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:getstatic       #73  <Field Excluder Excluder.DEFAULT>
	//    2    4:getstatic       #79  <Field FieldNamingPolicy FieldNamingPolicy.IDENTITY>
	//    3    7:invokestatic    #85  <Method Map Collections.emptyMap()>
	//    4   10:iconst_0        
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:iconst_1        
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:iconst_0        
	//   11   17:getstatic       #90  <Field LongSerializationPolicy LongSerializationPolicy.DEFAULT>
	//   12   20:invokestatic    #94  <Method List Collections.emptyList()>
	//   13   23:invokespecial   #97  <Method void Gson(Excluder, FieldNamingStrategy, Map, boolean, boolean, boolean, boolean, boolean, boolean, boolean, LongSerializationPolicy, List)>
	//   14   26:return          
	}

	Gson(Excluder excluder1, FieldNamingStrategy fieldnamingstrategy, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
			boolean flag4, boolean flag5, boolean flag6, LongSerializationPolicy longserializationpolicy, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Object()>
		calls = new ThreadLocal();
	//    2    4:aload_0         
	//    3    5:new             #101 <Class ThreadLocal>
	//    4    8:dup             
	//    5    9:invokespecial   #102 <Method void ThreadLocal()>
	//    6   12:putfield        #104 <Field ThreadLocal calls>
		typeTokenCache = ((Map) (new ConcurrentHashMap()));
	//    7   15:aload_0         
	//    8   16:new             #106 <Class ConcurrentHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #107 <Method void ConcurrentHashMap()>
	//   11   23:putfield        #109 <Field Map typeTokenCache>
		constructorConstructor = new ConstructorConstructor(map);
	//   12   26:aload_0         
	//   13   27:new             #111 <Class ConstructorConstructor>
	//   14   30:dup             
	//   15   31:aload_3         
	//   16   32:invokespecial   #114 <Method void ConstructorConstructor(Map)>
	//   17   35:putfield        #116 <Field ConstructorConstructor constructorConstructor>
		excluder = excluder1;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:putfield        #118 <Field Excluder excluder>
		fieldNamingStrategy = fieldnamingstrategy;
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:putfield        #120 <Field FieldNamingStrategy fieldNamingStrategy>
		serializeNulls = flag;
	//   24   48:aload_0         
	//   25   49:iload           4
	//   26   51:putfield        #122 <Field boolean serializeNulls>
		generateNonExecutableJson = flag2;
	//   27   54:aload_0         
	//   28   55:iload           6
	//   29   57:putfield        #124 <Field boolean generateNonExecutableJson>
		htmlSafe = flag3;
	//   30   60:aload_0         
	//   31   61:iload           7
	//   32   63:putfield        #126 <Field boolean htmlSafe>
		prettyPrinting = flag4;
	//   33   66:aload_0         
	//   34   67:iload           8
	//   35   69:putfield        #128 <Field boolean prettyPrinting>
		lenient = flag5;
	//   36   72:aload_0         
	//   37   73:iload           9
	//   38   75:putfield        #130 <Field boolean lenient>
		map = ((Map) (new ArrayList()));
	//   39   78:new             #132 <Class ArrayList>
	//   40   81:dup             
	//   41   82:invokespecial   #133 <Method void ArrayList()>
	//   42   85:astore_3        
		((List) (map)).add(((Object) (TypeAdapters.JSON_ELEMENT_FACTORY)));
	//   43   86:aload_3         
	//   44   87:getstatic       #139 <Field TypeAdapterFactory TypeAdapters.JSON_ELEMENT_FACTORY>
	//   45   90:invokeinterface #145 <Method boolean List.add(Object)>
	//   46   95:pop             
		((List) (map)).add(((Object) (ObjectTypeAdapter.FACTORY)));
	//   47   96:aload_3         
	//   48   97:getstatic       #150 <Field TypeAdapterFactory ObjectTypeAdapter.FACTORY>
	//   49  100:invokeinterface #145 <Method boolean List.add(Object)>
	//   50  105:pop             
		((List) (map)).add(((Object) (excluder1)));
	//   51  106:aload_3         
	//   52  107:aload_1         
	//   53  108:invokeinterface #145 <Method boolean List.add(Object)>
	//   54  113:pop             
		((List) (map)).addAll(((java.util.Collection) (list)));
	//   55  114:aload_3         
	//   56  115:aload           12
	//   57  117:invokeinterface #154 <Method boolean List.addAll(java.util.Collection)>
	//   58  122:pop             
		((List) (map)).add(((Object) (TypeAdapters.STRING_FACTORY)));
	//   59  123:aload_3         
	//   60  124:getstatic       #157 <Field TypeAdapterFactory TypeAdapters.STRING_FACTORY>
	//   61  127:invokeinterface #145 <Method boolean List.add(Object)>
	//   62  132:pop             
		((List) (map)).add(((Object) (TypeAdapters.INTEGER_FACTORY)));
	//   63  133:aload_3         
	//   64  134:getstatic       #160 <Field TypeAdapterFactory TypeAdapters.INTEGER_FACTORY>
	//   65  137:invokeinterface #145 <Method boolean List.add(Object)>
	//   66  142:pop             
		((List) (map)).add(((Object) (TypeAdapters.BOOLEAN_FACTORY)));
	//   67  143:aload_3         
	//   68  144:getstatic       #163 <Field TypeAdapterFactory TypeAdapters.BOOLEAN_FACTORY>
	//   69  147:invokeinterface #145 <Method boolean List.add(Object)>
	//   70  152:pop             
		((List) (map)).add(((Object) (TypeAdapters.BYTE_FACTORY)));
	//   71  153:aload_3         
	//   72  154:getstatic       #166 <Field TypeAdapterFactory TypeAdapters.BYTE_FACTORY>
	//   73  157:invokeinterface #145 <Method boolean List.add(Object)>
	//   74  162:pop             
		((List) (map)).add(((Object) (TypeAdapters.SHORT_FACTORY)));
	//   75  163:aload_3         
	//   76  164:getstatic       #169 <Field TypeAdapterFactory TypeAdapters.SHORT_FACTORY>
	//   77  167:invokeinterface #145 <Method boolean List.add(Object)>
	//   78  172:pop             
		longserializationpolicy = ((LongSerializationPolicy) (longAdapter(longserializationpolicy)));
	//   79  173:aload           11
	//   80  175:invokestatic    #173 <Method TypeAdapter longAdapter(LongSerializationPolicy)>
	//   81  178:astore          11
		((List) (map)).add(((Object) (TypeAdapters.newFactory(Long.TYPE, java/lang/Long, ((TypeAdapter) (longserializationpolicy))))));
	//   82  180:aload_3         
	//   83  181:getstatic       #179 <Field Class Long.TYPE>
	//   84  184:ldc1            #175 <Class Long>
	//   85  186:aload           11
	//   86  188:invokestatic    #183 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, Class, TypeAdapter)>
	//   87  191:invokeinterface #145 <Method boolean List.add(Object)>
	//   88  196:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(Double.TYPE, java/lang/Double, doubleAdapter(flag6)))));
	//   89  197:aload_3         
	//   90  198:getstatic       #186 <Field Class Double.TYPE>
	//   91  201:ldc1            #185 <Class Double>
	//   92  203:aload_0         
	//   93  204:iload           10
	//   94  206:invokespecial   #190 <Method TypeAdapter doubleAdapter(boolean)>
	//   95  209:invokestatic    #183 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, Class, TypeAdapter)>
	//   96  212:invokeinterface #145 <Method boolean List.add(Object)>
	//   97  217:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(Float.TYPE, java/lang/Float, floatAdapter(flag6)))));
	//   98  218:aload_3         
	//   99  219:getstatic       #193 <Field Class Float.TYPE>
	//  100  222:ldc1            #192 <Class Float>
	//  101  224:aload_0         
	//  102  225:iload           10
	//  103  227:invokespecial   #196 <Method TypeAdapter floatAdapter(boolean)>
	//  104  230:invokestatic    #183 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, Class, TypeAdapter)>
	//  105  233:invokeinterface #145 <Method boolean List.add(Object)>
	//  106  238:pop             
		((List) (map)).add(((Object) (TypeAdapters.NUMBER_FACTORY)));
	//  107  239:aload_3         
	//  108  240:getstatic       #199 <Field TypeAdapterFactory TypeAdapters.NUMBER_FACTORY>
	//  109  243:invokeinterface #145 <Method boolean List.add(Object)>
	//  110  248:pop             
		((List) (map)).add(((Object) (TypeAdapters.ATOMIC_INTEGER_FACTORY)));
	//  111  249:aload_3         
	//  112  250:getstatic       #202 <Field TypeAdapterFactory TypeAdapters.ATOMIC_INTEGER_FACTORY>
	//  113  253:invokeinterface #145 <Method boolean List.add(Object)>
	//  114  258:pop             
		((List) (map)).add(((Object) (TypeAdapters.ATOMIC_BOOLEAN_FACTORY)));
	//  115  259:aload_3         
	//  116  260:getstatic       #205 <Field TypeAdapterFactory TypeAdapters.ATOMIC_BOOLEAN_FACTORY>
	//  117  263:invokeinterface #145 <Method boolean List.add(Object)>
	//  118  268:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(java/util/concurrent/atomic/AtomicLong, atomicLongAdapter(((TypeAdapter) (longserializationpolicy)))))));
	//  119  269:aload_3         
	//  120  270:ldc1            #207 <Class AtomicLong>
	//  121  272:aload           11
	//  122  274:invokestatic    #211 <Method TypeAdapter atomicLongAdapter(TypeAdapter)>
	//  123  277:invokestatic    #214 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//  124  280:invokeinterface #145 <Method boolean List.add(Object)>
	//  125  285:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(java/util/concurrent/atomic/AtomicLongArray, atomicLongArrayAdapter(((TypeAdapter) (longserializationpolicy)))))));
	//  126  286:aload_3         
	//  127  287:ldc1            #216 <Class AtomicLongArray>
	//  128  289:aload           11
	//  129  291:invokestatic    #219 <Method TypeAdapter atomicLongArrayAdapter(TypeAdapter)>
	//  130  294:invokestatic    #214 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//  131  297:invokeinterface #145 <Method boolean List.add(Object)>
	//  132  302:pop             
		((List) (map)).add(((Object) (TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY)));
	//  133  303:aload_3         
	//  134  304:getstatic       #222 <Field TypeAdapterFactory TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY>
	//  135  307:invokeinterface #145 <Method boolean List.add(Object)>
	//  136  312:pop             
		((List) (map)).add(((Object) (TypeAdapters.CHARACTER_FACTORY)));
	//  137  313:aload_3         
	//  138  314:getstatic       #225 <Field TypeAdapterFactory TypeAdapters.CHARACTER_FACTORY>
	//  139  317:invokeinterface #145 <Method boolean List.add(Object)>
	//  140  322:pop             
		((List) (map)).add(((Object) (TypeAdapters.STRING_BUILDER_FACTORY)));
	//  141  323:aload_3         
	//  142  324:getstatic       #228 <Field TypeAdapterFactory TypeAdapters.STRING_BUILDER_FACTORY>
	//  143  327:invokeinterface #145 <Method boolean List.add(Object)>
	//  144  332:pop             
		((List) (map)).add(((Object) (TypeAdapters.STRING_BUFFER_FACTORY)));
	//  145  333:aload_3         
	//  146  334:getstatic       #231 <Field TypeAdapterFactory TypeAdapters.STRING_BUFFER_FACTORY>
	//  147  337:invokeinterface #145 <Method boolean List.add(Object)>
	//  148  342:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(java/math/BigDecimal, TypeAdapters.BIG_DECIMAL))));
	//  149  343:aload_3         
	//  150  344:ldc1            #233 <Class BigDecimal>
	//  151  346:getstatic       #237 <Field TypeAdapter TypeAdapters.BIG_DECIMAL>
	//  152  349:invokestatic    #214 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//  153  352:invokeinterface #145 <Method boolean List.add(Object)>
	//  154  357:pop             
		((List) (map)).add(((Object) (TypeAdapters.newFactory(java/math/BigInteger, TypeAdapters.BIG_INTEGER))));
	//  155  358:aload_3         
	//  156  359:ldc1            #239 <Class BigInteger>
	//  157  361:getstatic       #242 <Field TypeAdapter TypeAdapters.BIG_INTEGER>
	//  158  364:invokestatic    #214 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//  159  367:invokeinterface #145 <Method boolean List.add(Object)>
	//  160  372:pop             
		((List) (map)).add(((Object) (TypeAdapters.URL_FACTORY)));
	//  161  373:aload_3         
	//  162  374:getstatic       #245 <Field TypeAdapterFactory TypeAdapters.URL_FACTORY>
	//  163  377:invokeinterface #145 <Method boolean List.add(Object)>
	//  164  382:pop             
		((List) (map)).add(((Object) (TypeAdapters.URI_FACTORY)));
	//  165  383:aload_3         
	//  166  384:getstatic       #248 <Field TypeAdapterFactory TypeAdapters.URI_FACTORY>
	//  167  387:invokeinterface #145 <Method boolean List.add(Object)>
	//  168  392:pop             
		((List) (map)).add(((Object) (TypeAdapters.UUID_FACTORY)));
	//  169  393:aload_3         
	//  170  394:getstatic       #251 <Field TypeAdapterFactory TypeAdapters.UUID_FACTORY>
	//  171  397:invokeinterface #145 <Method boolean List.add(Object)>
	//  172  402:pop             
		((List) (map)).add(((Object) (TypeAdapters.CURRENCY_FACTORY)));
	//  173  403:aload_3         
	//  174  404:getstatic       #254 <Field TypeAdapterFactory TypeAdapters.CURRENCY_FACTORY>
	//  175  407:invokeinterface #145 <Method boolean List.add(Object)>
	//  176  412:pop             
		((List) (map)).add(((Object) (TypeAdapters.LOCALE_FACTORY)));
	//  177  413:aload_3         
	//  178  414:getstatic       #257 <Field TypeAdapterFactory TypeAdapters.LOCALE_FACTORY>
	//  179  417:invokeinterface #145 <Method boolean List.add(Object)>
	//  180  422:pop             
		((List) (map)).add(((Object) (TypeAdapters.INET_ADDRESS_FACTORY)));
	//  181  423:aload_3         
	//  182  424:getstatic       #260 <Field TypeAdapterFactory TypeAdapters.INET_ADDRESS_FACTORY>
	//  183  427:invokeinterface #145 <Method boolean List.add(Object)>
	//  184  432:pop             
		((List) (map)).add(((Object) (TypeAdapters.BIT_SET_FACTORY)));
	//  185  433:aload_3         
	//  186  434:getstatic       #263 <Field TypeAdapterFactory TypeAdapters.BIT_SET_FACTORY>
	//  187  437:invokeinterface #145 <Method boolean List.add(Object)>
	//  188  442:pop             
		((List) (map)).add(((Object) (DateTypeAdapter.FACTORY)));
	//  189  443:aload_3         
	//  190  444:getstatic       #266 <Field TypeAdapterFactory DateTypeAdapter.FACTORY>
	//  191  447:invokeinterface #145 <Method boolean List.add(Object)>
	//  192  452:pop             
		((List) (map)).add(((Object) (TypeAdapters.CALENDAR_FACTORY)));
	//  193  453:aload_3         
	//  194  454:getstatic       #269 <Field TypeAdapterFactory TypeAdapters.CALENDAR_FACTORY>
	//  195  457:invokeinterface #145 <Method boolean List.add(Object)>
	//  196  462:pop             
		((List) (map)).add(((Object) (TimeTypeAdapter.FACTORY)));
	//  197  463:aload_3         
	//  198  464:getstatic       #272 <Field TypeAdapterFactory TimeTypeAdapter.FACTORY>
	//  199  467:invokeinterface #145 <Method boolean List.add(Object)>
	//  200  472:pop             
		((List) (map)).add(((Object) (SqlDateTypeAdapter.FACTORY)));
	//  201  473:aload_3         
	//  202  474:getstatic       #275 <Field TypeAdapterFactory SqlDateTypeAdapter.FACTORY>
	//  203  477:invokeinterface #145 <Method boolean List.add(Object)>
	//  204  482:pop             
		((List) (map)).add(((Object) (TypeAdapters.TIMESTAMP_FACTORY)));
	//  205  483:aload_3         
	//  206  484:getstatic       #278 <Field TypeAdapterFactory TypeAdapters.TIMESTAMP_FACTORY>
	//  207  487:invokeinterface #145 <Method boolean List.add(Object)>
	//  208  492:pop             
		((List) (map)).add(((Object) (ArrayTypeAdapter.FACTORY)));
	//  209  493:aload_3         
	//  210  494:getstatic       #281 <Field TypeAdapterFactory ArrayTypeAdapter.FACTORY>
	//  211  497:invokeinterface #145 <Method boolean List.add(Object)>
	//  212  502:pop             
		((List) (map)).add(((Object) (TypeAdapters.CLASS_FACTORY)));
	//  213  503:aload_3         
	//  214  504:getstatic       #284 <Field TypeAdapterFactory TypeAdapters.CLASS_FACTORY>
	//  215  507:invokeinterface #145 <Method boolean List.add(Object)>
	//  216  512:pop             
		((List) (map)).add(((Object) (new CollectionTypeAdapterFactory(constructorConstructor))));
	//  217  513:aload_3         
	//  218  514:new             #286 <Class CollectionTypeAdapterFactory>
	//  219  517:dup             
	//  220  518:aload_0         
	//  221  519:getfield        #116 <Field ConstructorConstructor constructorConstructor>
	//  222  522:invokespecial   #289 <Method void CollectionTypeAdapterFactory(ConstructorConstructor)>
	//  223  525:invokeinterface #145 <Method boolean List.add(Object)>
	//  224  530:pop             
		((List) (map)).add(((Object) (new MapTypeAdapterFactory(constructorConstructor, flag1))));
	//  225  531:aload_3         
	//  226  532:new             #291 <Class MapTypeAdapterFactory>
	//  227  535:dup             
	//  228  536:aload_0         
	//  229  537:getfield        #116 <Field ConstructorConstructor constructorConstructor>
	//  230  540:iload           5
	//  231  542:invokespecial   #294 <Method void MapTypeAdapterFactory(ConstructorConstructor, boolean)>
	//  232  545:invokeinterface #145 <Method boolean List.add(Object)>
	//  233  550:pop             
		jsonAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
	//  234  551:aload_0         
	//  235  552:new             #296 <Class JsonAdapterAnnotationTypeAdapterFactory>
	//  236  555:dup             
	//  237  556:aload_0         
	//  238  557:getfield        #116 <Field ConstructorConstructor constructorConstructor>
	//  239  560:invokespecial   #297 <Method void JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor)>
	//  240  563:putfield        #299 <Field JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory>
		((List) (map)).add(((Object) (jsonAdapterFactory)));
	//  241  566:aload_3         
	//  242  567:aload_0         
	//  243  568:getfield        #299 <Field JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory>
	//  244  571:invokeinterface #145 <Method boolean List.add(Object)>
	//  245  576:pop             
		((List) (map)).add(((Object) (TypeAdapters.ENUM_FACTORY)));
	//  246  577:aload_3         
	//  247  578:getstatic       #302 <Field TypeAdapterFactory TypeAdapters.ENUM_FACTORY>
	//  248  581:invokeinterface #145 <Method boolean List.add(Object)>
	//  249  586:pop             
		((List) (map)).add(((Object) (new ReflectiveTypeAdapterFactory(constructorConstructor, fieldnamingstrategy, excluder1, jsonAdapterFactory))));
	//  250  587:aload_3         
	//  251  588:new             #304 <Class ReflectiveTypeAdapterFactory>
	//  252  591:dup             
	//  253  592:aload_0         
	//  254  593:getfield        #116 <Field ConstructorConstructor constructorConstructor>
	//  255  596:aload_2         
	//  256  597:aload_1         
	//  257  598:aload_0         
	//  258  599:getfield        #299 <Field JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory>
	//  259  602:invokespecial   #307 <Method void ReflectiveTypeAdapterFactory(ConstructorConstructor, FieldNamingStrategy, Excluder, JsonAdapterAnnotationTypeAdapterFactory)>
	//  260  605:invokeinterface #145 <Method boolean List.add(Object)>
	//  261  610:pop             
		factories = Collections.unmodifiableList(((List) (map)));
	//  262  611:aload_0         
	//  263  612:aload_3         
	//  264  613:invokestatic    #311 <Method List Collections.unmodifiableList(List)>
	//  265  616:putfield        #313 <Field List factories>
	//  266  619:return          
	}

	private static void assertFullConsumption(Object obj, JsonReader jsonreader)
	{
		if(obj == null)
			break MISSING_BLOCK_LABEL_25;
	//    0    0:aload_0         
	//    1    1:ifnull          25
		if(jsonreader.peek() != JsonToken.END_DOCUMENT)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #327 <Method JsonToken JsonReader.peek()>
	//*   4    8:getstatic       #333 <Field JsonToken JsonToken.END_DOCUMENT>
	//*   5   11:if_acmpeq       25
			throw new JsonIOException("JSON document was not fully consumed.");
	//    6   14:new             #335 <Class JsonIOException>
	//    7   17:dup             
	//    8   18:ldc2            #337 <String "JSON document was not fully consumed.">
	//    9   21:invokespecial   #340 <Method void JsonIOException(String)>
	//   10   24:athrow          
		return;
	//   11   25:return          
		obj;
	//   12   26:astore_0        
		throw new JsonSyntaxException(((Throwable) (obj)));
	//   13   27:new             #342 <Class JsonSyntaxException>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #345 <Method void JsonSyntaxException(Throwable)>
	//   17   35:athrow          
		obj;
	//   18   36:astore_0        
		throw new JsonIOException(((Throwable) (obj)));
	//   19   37:new             #335 <Class JsonIOException>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #346 <Method void JsonIOException(Throwable)>
	//   23   45:athrow          
	}

	private static TypeAdapter atomicLongAdapter(TypeAdapter typeadapter)
	{
		return ((_cls4) (new TypeAdapter(typeadapter) {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method AtomicLong read(JsonReader)>
			//    3    5:areturn         
			}

			public AtomicLong read(JsonReader jsonreader)
				throws IOException
			{
				return new AtomicLong(((Number)longAdapter.read(jsonreader)).longValue());
			//    0    0:new             #30  <Class AtomicLong>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #16  <Field TypeAdapter val$longAdapter>
			//    4    8:aload_1         
			//    5    9:invokevirtual   #32  <Method Object TypeAdapter.read(JsonReader)>
			//    6   12:checkcast       #34  <Class Number>
			//    7   15:invokevirtual   #38  <Method long Number.longValue()>
			//    8   18:invokespecial   #41  <Method void AtomicLong(long)>
			//    9   21:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (AtomicLong)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #30  <Class AtomicLong>
			//    4    6:invokevirtual   #46  <Method void write(JsonWriter, AtomicLong)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, AtomicLong atomiclong)
				throws IOException
			{
				longAdapter.write(jsonwriter, ((Object) (Long.valueOf(atomiclong.get()))));
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field TypeAdapter val$longAdapter>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #49  <Method long AtomicLong.get()>
			//    5    9:invokestatic    #55  <Method Long Long.valueOf(long)>
			//    6   12:invokevirtual   #57  <Method void TypeAdapter.write(JsonWriter, Object)>
			//    7   15:return          
			}

			final TypeAdapter val$longAdapter;

			
			{
				longAdapter = typeadapter;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TypeAdapter val$longAdapter>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void TypeAdapter()>
			//    5    9:return          
			}
		}
)).nullSafe();
	//    0    0:new             #12  <Class Gson$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #349 <Method void Gson$4(TypeAdapter)>
	//    4    8:invokevirtual   #353 <Method TypeAdapter Gson$4.nullSafe()>
	//    5   11:areturn         
	}

	private static TypeAdapter atomicLongArrayAdapter(TypeAdapter typeadapter)
	{
		return ((_cls5) (new TypeAdapter(typeadapter) {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method AtomicLongArray read(JsonReader)>
			//    3    5:areturn         
			}

			public AtomicLongArray read(JsonReader jsonreader)
				throws IOException
			{
				ArrayList arraylist = new ArrayList();
			//    0    0:new             #30  <Class ArrayList>
			//    1    3:dup             
			//    2    4:invokespecial   #31  <Method void ArrayList()>
			//    3    7:astore          4
				jsonreader.beginArray();
			//    4    9:aload_1         
			//    5   10:invokevirtual   #36  <Method void JsonReader.beginArray()>
				for(; jsonreader.hasNext(); ((List) (arraylist)).add(((Object) (Long.valueOf(((Number)longAdapter.read(jsonreader)).longValue())))));
			//    6   13:aload_1         
			//    7   14:invokevirtual   #40  <Method boolean JsonReader.hasNext()>
			//    8   17:ifeq            48
			//    9   20:aload           4
			//   10   22:aload_0         
			//   11   23:getfield        #16  <Field TypeAdapter val$longAdapter>
			//   12   26:aload_1         
			//   13   27:invokevirtual   #42  <Method Object TypeAdapter.read(JsonReader)>
			//   14   30:checkcast       #44  <Class Number>
			//   15   33:invokevirtual   #48  <Method long Number.longValue()>
			//   16   36:invokestatic    #54  <Method Long Long.valueOf(long)>
			//   17   39:invokeinterface #60  <Method boolean List.add(Object)>
			//   18   44:pop             
			//*  19   45:goto            13
				jsonreader.endArray();
			//   20   48:aload_1         
			//   21   49:invokevirtual   #63  <Method void JsonReader.endArray()>
				int j = ((List) (arraylist)).size();
			//   22   52:aload           4
			//   23   54:invokeinterface #67  <Method int List.size()>
			//   24   59:istore_3        
				jsonreader = ((JsonReader) (new AtomicLongArray(j)));
			//   25   60:new             #69  <Class AtomicLongArray>
			//   26   63:dup             
			//   27   64:iload_3         
			//   28   65:invokespecial   #72  <Method void AtomicLongArray(int)>
			//   29   68:astore_1        
				for(int i = 0; i < j; i++)
			//*  30   69:iconst_0        
			//*  31   70:istore_2        
			//*  32   71:iload_2         
			//*  33   72:iload_3         
			//*  34   73:icmpge          102
					((AtomicLongArray) (jsonreader)).set(i, ((Long)((List) (arraylist)).get(i)).longValue());
			//   35   76:aload_1         
			//   36   77:iload_2         
			//   37   78:aload           4
			//   38   80:iload_2         
			//   39   81:invokeinterface #76  <Method Object List.get(int)>
			//   40   86:checkcast       #50  <Class Long>
			//   41   89:invokevirtual   #77  <Method long Long.longValue()>
			//   42   92:invokevirtual   #81  <Method void AtomicLongArray.set(int, long)>

			//   43   95:iload_2         
			//   44   96:iconst_1        
			//   45   97:iadd            
			//   46   98:istore_2        
			//*  47   99:goto            71
				return ((AtomicLongArray) (jsonreader));
			//   48  102:aload_1         
			//   49  103:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (AtomicLongArray)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #69  <Class AtomicLongArray>
			//    4    6:invokevirtual   #86  <Method void write(JsonWriter, AtomicLongArray)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, AtomicLongArray atomiclongarray)
				throws IOException
			{
				jsonwriter.beginArray();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #91  <Method JsonWriter JsonWriter.beginArray()>
			//    2    4:pop             
				int i = 0;
			//    3    5:iconst_0        
			//    4    6:istore_3        
				for(int j = atomiclongarray.length(); i < j; i++)
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #94  <Method int AtomicLongArray.length()>
			//*   7   11:istore          4
			//*   8   13:iload_3         
			//*   9   14:iload           4
			//*  10   16:icmpge          42
					longAdapter.write(jsonwriter, ((Object) (Long.valueOf(atomiclongarray.get(i)))));
			//   11   19:aload_0         
			//   12   20:getfield        #16  <Field TypeAdapter val$longAdapter>
			//   13   23:aload_1         
			//   14   24:aload_2         
			//   15   25:iload_3         
			//   16   26:invokevirtual   #97  <Method long AtomicLongArray.get(int)>
			//   17   29:invokestatic    #54  <Method Long Long.valueOf(long)>
			//   18   32:invokevirtual   #99  <Method void TypeAdapter.write(JsonWriter, Object)>

			//   19   35:iload_3         
			//   20   36:iconst_1        
			//   21   37:iadd            
			//   22   38:istore_3        
			//*  23   39:goto            13
				jsonwriter.endArray();
			//   24   42:aload_1         
			//   25   43:invokevirtual   #101 <Method JsonWriter JsonWriter.endArray()>
			//   26   46:pop             
			//   27   47:return          
			}

			final TypeAdapter val$longAdapter;

			
			{
				longAdapter = typeadapter;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TypeAdapter val$longAdapter>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void TypeAdapter()>
			//    5    9:return          
			}
		}
)).nullSafe();
	//    0    0:new             #14  <Class Gson$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #355 <Method void Gson$5(TypeAdapter)>
	//    4    8:invokevirtual   #356 <Method TypeAdapter Gson$5.nullSafe()>
	//    5   11:areturn         
	}

	static void checkValidFloatingPoint(double d)
	{
		if(Double.isNaN(d) || Double.isInfinite(d))
	//*   0    0:dload_0         
	//*   1    1:invokestatic    #363 <Method boolean Double.isNaN(double)>
	//*   2    4:ifne            14
	//*   3    7:dload_0         
	//*   4    8:invokestatic    #366 <Method boolean Double.isInfinite(double)>
	//*   5   11:ifeq            42
			throw new IllegalArgumentException((new StringBuilder()).append(d).append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
	//    6   14:new             #368 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:new             #370 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #371 <Method void StringBuilder()>
	//   11   25:dload_0         
	//   12   26:invokevirtual   #375 <Method StringBuilder StringBuilder.append(double)>
	//   13   29:ldc2            #377 <String " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.">
	//   14   32:invokevirtual   #380 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #384 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #385 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		else
			return;
	//   18   42:return          
	}

	private TypeAdapter doubleAdapter(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			return TypeAdapters.DOUBLE;
	//    2    4:getstatic       #388 <Field TypeAdapter TypeAdapters.DOUBLE>
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
						Gson.checkValidFloatingPoint(number.doubleValue());
				//    6   10:aload_2         
				//    7   11:invokevirtual   #66  <Method double Number.doubleValue()>
				//    8   14:invokestatic    #70  <Method void Gson.checkValidFloatingPoint(double)>
						jsonwriter.value(number);
				//    9   17:aload_1         
				//   10   18:aload_2         
				//   11   19:invokevirtual   #74  <Method JsonWriter JsonWriter.value(Number)>
				//   12   22:pop             
						return;
				//   13   23:return          
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
	//    4    8:new             #6   <Class Gson$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #391 <Method void Gson$1(Gson)>
	//    8   16:areturn         
	}

	private TypeAdapter floatAdapter(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			return TypeAdapters.FLOAT;
	//    2    4:getstatic       #395 <Field TypeAdapter TypeAdapters.FLOAT>
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
						Gson.checkValidFloatingPoint(number.floatValue());
				//    6   10:aload_2         
				//    7   11:invokevirtual   #67  <Method float Number.floatValue()>
				//    8   14:f2d             
				//    9   15:invokestatic    #71  <Method void Gson.checkValidFloatingPoint(double)>
						jsonwriter.value(number);
				//   10   18:aload_1         
				//   11   19:aload_2         
				//   12   20:invokevirtual   #75  <Method JsonWriter JsonWriter.value(Number)>
				//   13   23:pop             
						return;
				//   14   24:return          
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
	//    4    8:new             #8   <Class Gson$2>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #396 <Method void Gson$2(Gson)>
	//    8   16:areturn         
	}

	private static TypeAdapter longAdapter(LongSerializationPolicy longserializationpolicy)
	{
		if(longserializationpolicy == LongSerializationPolicy.DEFAULT)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #90  <Field LongSerializationPolicy LongSerializationPolicy.DEFAULT>
	//*   2    4:if_acmpne       11
			return TypeAdapters.LONG;
	//    3    7:getstatic       #399 <Field TypeAdapter TypeAdapters.LONG>
	//    4   10:areturn         
		else
			return ((TypeAdapter) (new TypeAdapter() {

				public Number read(JsonReader jsonreader)
					throws IOException
				{
					if(jsonreader.peek() == JsonToken.NULL)
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
				//*   2    4:getstatic       #31  <Field JsonToken JsonToken.NULL>
				//*   3    7:if_acmpne       16
					{
						jsonreader.nextNull();
				//    4   10:aload_1         
				//    5   11:invokevirtual   #34  <Method void JsonReader.nextNull()>
						return null;
				//    6   14:aconst_null     
				//    7   15:areturn         
					} else
					{
						return ((Number) (Long.valueOf(jsonreader.nextLong())));
				//    8   16:aload_1         
				//    9   17:invokevirtual   #38  <Method long JsonReader.nextLong()>
				//   10   20:invokestatic    #44  <Method Long Long.valueOf(long)>
				//   11   23:areturn         
					}
				}

				public volatile Object read(JsonReader jsonreader)
					throws IOException
				{
					return ((Object) (read(jsonreader)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #48  <Method Number read(JsonReader)>
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
				//    3    5:invokevirtual   #56  <Method JsonWriter JsonWriter.nullValue()>
				//    4    8:pop             
						return;
				//    5    9:return          
					} else
					{
						jsonwriter.value(((Object) (number)).toString());
				//    6   10:aload_1         
				//    7   11:aload_2         
				//    8   12:invokevirtual   #62  <Method String Object.toString()>
				//    9   15:invokevirtual   #66  <Method JsonWriter JsonWriter.value(String)>
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
				//    3    3:checkcast       #69  <Class Number>
				//    4    6:invokevirtual   #71  <Method void write(JsonWriter, Number)>
				//    5    9:return          
				}

			}
));
	//    5   11:new             #10  <Class Gson$3>
	//    6   14:dup             
	//    7   15:invokespecial   #400 <Method void Gson$3()>
	//    8   18:areturn         
	}

	public Excluder excluder()
	{
		return excluder;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Excluder excluder>
	//    2    4:areturn         
	}

	public FieldNamingStrategy fieldNamingStrategy()
	{
		return fieldNamingStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field FieldNamingStrategy fieldNamingStrategy>
	//    2    4:areturn         
	}

	public Object fromJson(JsonElement jsonelement, Class class1)
		throws JsonSyntaxException
	{
		jsonelement = ((JsonElement) (fromJson(jsonelement, ((Type) (class1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #408 <Method Object fromJson(JsonElement, Type)>
	//    4    6:astore_1        
		return Primitives.wrap(class1).cast(((Object) (jsonelement)));
	//    5    7:aload_2         
	//    6    8:invokestatic    #414 <Method Class Primitives.wrap(Class)>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #420 <Method Object Class.cast(Object)>
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
	//    5    7:new             #424 <Class JsonTreeReader>
	//    6   10:dup             
	//    7   11:aload_1         
	//    8   12:invokespecial   #427 <Method void JsonTreeReader(JsonElement)>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #430 <Method Object fromJson(JsonReader, Type)>
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
	//    3    3:invokevirtual   #439 <Method boolean JsonReader.isLenient()>
	//    4    6:istore          4
		jsonreader.setLenient(true);
	//    5    8:aload_1         
	//    6    9:iconst_1        
	//    7   10:invokevirtual   #443 <Method void JsonReader.setLenient(boolean)>
		jsonreader.peek();
	//    8   13:aload_1         
	//    9   14:invokevirtual   #327 <Method JsonToken JsonReader.peek()>
	//   10   17:pop             
		flag = false;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		type = ((Type) (getAdapter(TypeToken.get(type)).read(jsonreader)));
	//   13   20:aload_0         
	//   14   21:aload_2         
	//   15   22:invokestatic    #446 <Method TypeToken TypeToken.get(Type)>
	//   16   25:invokevirtual   #450 <Method TypeAdapter getAdapter(TypeToken)>
	//   17   28:aload_1         
	//   18   29:invokevirtual   #456 <Method Object TypeAdapter.read(JsonReader)>
	//   19   32:astore_2        
		jsonreader.setLenient(flag1);
	//   20   33:aload_1         
	//   21   34:iload           4
	//   22   36:invokevirtual   #443 <Method void JsonReader.setLenient(boolean)>
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
	//   30   49:invokevirtual   #443 <Method void JsonReader.setLenient(boolean)>
			return ((Object) (null));
	//   31   52:aconst_null     
	//   32   53:areturn         
		}
		throw new JsonSyntaxException(((Throwable) (type)));
	//   33   54:new             #342 <Class JsonSyntaxException>
	//   34   57:dup             
	//   35   58:aload_2         
	//   36   59:invokespecial   #345 <Method void JsonSyntaxException(Throwable)>
	//   37   62:athrow          
		type;
	//   38   63:astore_2        
		throw new JsonSyntaxException(((Throwable) (type)));
	//   39   64:new             #342 <Class JsonSyntaxException>
	//   40   67:dup             
	//   41   68:aload_2         
	//   42   69:invokespecial   #345 <Method void JsonSyntaxException(Throwable)>
	//   43   72:athrow          
		type;
	//   44   73:astore_2        
		throw new JsonSyntaxException(((Throwable) (type)));
	//   45   74:new             #342 <Class JsonSyntaxException>
	//   46   77:dup             
	//   47   78:aload_2         
	//   48   79:invokespecial   #345 <Method void JsonSyntaxException(Throwable)>
	//   49   82:athrow          
		type;
	//   50   83:astore_2        
		jsonreader.setLenient(flag1);
	//   51   84:aload_1         
	//   52   85:iload           4
	//   53   87:invokevirtual   #443 <Method void JsonReader.setLenient(boolean)>
		throw type;
	//   54   90:aload_2         
	//   55   91:athrow          
	}

	public Object fromJson(Reader reader, Class class1)
		throws JsonSyntaxException, JsonIOException
	{
		reader = ((Reader) (newJsonReader(reader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #462 <Method JsonReader newJsonReader(Reader)>
	//    3    5:astore_1        
		Object obj = fromJson(((JsonReader) (reader)), ((Type) (class1)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #430 <Method Object fromJson(JsonReader, Type)>
	//    8   12:astore_3        
		assertFullConsumption(obj, ((JsonReader) (reader)));
	//    9   13:aload_3         
	//   10   14:aload_1         
	//   11   15:invokestatic    #464 <Method void assertFullConsumption(Object, JsonReader)>
		return Primitives.wrap(class1).cast(obj);
	//   12   18:aload_2         
	//   13   19:invokestatic    #414 <Method Class Primitives.wrap(Class)>
	//   14   22:aload_3         
	//   15   23:invokevirtual   #420 <Method Object Class.cast(Object)>
	//   16   26:areturn         
	}

	public Object fromJson(Reader reader, Type type)
		throws JsonIOException, JsonSyntaxException
	{
		reader = ((Reader) (newJsonReader(reader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #462 <Method JsonReader newJsonReader(Reader)>
	//    3    5:astore_1        
		type = ((Type) (fromJson(((JsonReader) (reader)), type)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #430 <Method Object fromJson(JsonReader, Type)>
	//    8   12:astore_2        
		assertFullConsumption(((Object) (type)), ((JsonReader) (reader)));
	//    9   13:aload_2         
	//   10   14:aload_1         
	//   11   15:invokestatic    #464 <Method void assertFullConsumption(Object, JsonReader)>
		return ((Object) (type));
	//   12   18:aload_2         
	//   13   19:areturn         
	}

	public Object fromJson(String s, Class class1)
		throws JsonSyntaxException
	{
		s = ((String) (fromJson(s, ((Type) (class1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #471 <Method Object fromJson(String, Type)>
	//    4    6:astore_1        
		return Primitives.wrap(class1).cast(((Object) (s)));
	//    5    7:aload_2         
	//    6    8:invokestatic    #414 <Method Class Primitives.wrap(Class)>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #420 <Method Object Class.cast(Object)>
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
	//    5    7:new             #474 <Class StringReader>
	//    6   10:dup             
	//    7   11:aload_1         
	//    8   12:invokespecial   #475 <Method void StringReader(String)>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #477 <Method Object fromJson(Reader, Type)>
	//   11   19:areturn         
	}

	public TypeAdapter getAdapter(TypeToken typetoken)
	{
		boolean flag;
		Object obj;
		Object obj1 = ((Object) (typeTokenCache));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Map typeTokenCache>
	//    2    4:astore          4
		if(typetoken == null)
	//*   3    6:aload_1         
	//*   4    7:ifnonnull       17
			obj = ((Object) (NULL_KEY_SURROGATE));
	//    5   10:getstatic       #66  <Field TypeToken NULL_KEY_SURROGATE>
	//    6   13:astore_3        
		else
	//*   7   14:goto            19
			obj = ((Object) (typetoken));
	//    8   17:aload_1         
	//    9   18:astore_3        
		obj = ((Object) ((TypeAdapter)((Map) (obj1)).get(obj)));
	//   10   19:aload           4
	//   11   21:aload_3         
	//   12   22:invokeinterface #482 <Method Object Map.get(Object)>
	//   13   27:checkcast       #452 <Class TypeAdapter>
	//   14   30:astore_3        
		if(obj != null)
	//*  15   31:aload_3         
	//*  16   32:ifnull          37
			return ((TypeAdapter) (obj));
	//   17   35:aload_3         
	//   18   36:areturn         
		obj1 = ((Object) ((Map)calls.get()));
	//   19   37:aload_0         
	//   20   38:getfield        #104 <Field ThreadLocal calls>
	//   21   41:invokevirtual   #485 <Method Object ThreadLocal.get()>
	//   22   44:checkcast       #480 <Class Map>
	//   23   47:astore          4
		flag = false;
	//   24   49:iconst_0        
	//   25   50:istore_2        
		obj = obj1;
	//   26   51:aload           4
	//   27   53:astore_3        
		if(obj1 == null)
	//*  28   54:aload           4
	//*  29   56:ifnonnull       77
		{
			obj = ((Object) (new HashMap()));
	//   30   59:new             #487 <Class HashMap>
	//   31   62:dup             
	//   32   63:invokespecial   #488 <Method void HashMap()>
	//   33   66:astore_3        
			calls.set(obj);
	//   34   67:aload_0         
	//   35   68:getfield        #104 <Field ThreadLocal calls>
	//   36   71:aload_3         
	//   37   72:invokevirtual   #492 <Method void ThreadLocal.set(Object)>
			flag = true;
	//   38   75:iconst_1        
	//   39   76:istore_2        
		}
		obj1 = ((Object) ((FutureTypeAdapter)((Map) (obj)).get(((Object) (typetoken)))));
	//   40   77:aload_3         
	//   41   78:aload_1         
	//   42   79:invokeinterface #482 <Method Object Map.get(Object)>
	//   43   84:checkcast       #16  <Class Gson$FutureTypeAdapter>
	//   44   87:astore          4
		if(obj1 != null)
	//*  45   89:aload           4
	//*  46   91:ifnull          97
			return ((TypeAdapter) (obj1));
	//   47   94:aload           4
	//   48   96:areturn         
		FutureTypeAdapter futuretypeadapter;
		Iterator iterator;
		futuretypeadapter = new FutureTypeAdapter();
	//   49   97:new             #16  <Class Gson$FutureTypeAdapter>
	//   50  100:dup             
	//   51  101:invokespecial   #493 <Method void Gson$FutureTypeAdapter()>
	//   52  104:astore          4
		((Map) (obj)).put(((Object) (typetoken)), ((Object) (futuretypeadapter)));
	//   53  106:aload_3         
	//   54  107:aload_1         
	//   55  108:aload           4
	//   56  110:invokeinterface #497 <Method Object Map.put(Object, Object)>
	//   57  115:pop             
		iterator = factories.iterator();
	//   58  116:aload_0         
	//   59  117:getfield        #313 <Field List factories>
	//   60  120:invokeinterface #501 <Method Iterator List.iterator()>
	//   61  125:astore          5
		TypeAdapter typeadapter;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_206;
	//   62  127:aload           5
	//   63  129:invokeinterface #506 <Method boolean Iterator.hasNext()>
	//   64  134:ifeq            206
			typeadapter = ((TypeAdapterFactory)iterator.next()).create(this, typetoken);
	//   65  137:aload           5
	//   66  139:invokeinterface #509 <Method Object Iterator.next()>
	//   67  144:checkcast       #511 <Class TypeAdapterFactory>
	//   68  147:aload_0         
	//   69  148:aload_1         
	//   70  149:invokeinterface #515 <Method TypeAdapter TypeAdapterFactory.create(Gson, TypeToken)>
	//   71  154:astore          6
		} while(typeadapter == null);
	//   72  156:aload           6
	//   73  158:ifnull          203
		futuretypeadapter.setDelegate(typeadapter);
	//   74  161:aload           4
	//   75  163:aload           6
	//   76  165:invokevirtual   #518 <Method void Gson$FutureTypeAdapter.setDelegate(TypeAdapter)>
		typeTokenCache.put(((Object) (typetoken)), ((Object) (typeadapter)));
	//   77  168:aload_0         
	//   78  169:getfield        #109 <Field Map typeTokenCache>
	//   79  172:aload_1         
	//   80  173:aload           6
	//   81  175:invokeinterface #497 <Method Object Map.put(Object, Object)>
	//   82  180:pop             
		((Map) (obj)).remove(((Object) (typetoken)));
	//   83  181:aload_3         
	//   84  182:aload_1         
	//   85  183:invokeinterface #521 <Method Object Map.remove(Object)>
	//   86  188:pop             
		if(flag)
	//*  87  189:iload_2         
	//*  88  190:ifeq            200
			calls.remove();
	//   89  193:aload_0         
	//   90  194:getfield        #104 <Field ThreadLocal calls>
	//   91  197:invokevirtual   #523 <Method void ThreadLocal.remove()>
		return typeadapter;
	//   92  200:aload           6
	//   93  202:areturn         
	//*  94  203:goto            127
		throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot handle ").append(((Object) (typetoken))).toString());
	//   95  206:new             #368 <Class IllegalArgumentException>
	//   96  209:dup             
	//   97  210:new             #370 <Class StringBuilder>
	//   98  213:dup             
	//   99  214:invokespecial   #371 <Method void StringBuilder()>
	//  100  217:ldc2            #525 <String "GSON cannot handle ">
	//  101  220:invokevirtual   #380 <Method StringBuilder StringBuilder.append(String)>
	//  102  223:aload_1         
	//  103  224:invokevirtual   #528 <Method StringBuilder StringBuilder.append(Object)>
	//  104  227:invokevirtual   #384 <Method String StringBuilder.toString()>
	//  105  230:invokespecial   #385 <Method void IllegalArgumentException(String)>
	//  106  233:athrow          
		Exception exception;
		exception;
	//  107  234:astore          4
		((Map) (obj)).remove(((Object) (typetoken)));
	//  108  236:aload_3         
	//  109  237:aload_1         
	//  110  238:invokeinterface #521 <Method Object Map.remove(Object)>
	//  111  243:pop             
		if(flag)
	//* 112  244:iload_2         
	//* 113  245:ifeq            255
			calls.remove();
	//  114  248:aload_0         
	//  115  249:getfield        #104 <Field ThreadLocal calls>
	//  116  252:invokevirtual   #523 <Method void ThreadLocal.remove()>
		throw exception;
	//  117  255:aload           4
	//  118  257:athrow          
	}

	public TypeAdapter getAdapter(Class class1)
	{
		return getAdapter(TypeToken.get(class1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #64  <Method TypeToken TypeToken.get(Class)>
	//    3    5:invokevirtual   #450 <Method TypeAdapter getAdapter(TypeToken)>
	//    4    8:areturn         
	}

	public TypeAdapter getDelegateAdapter(TypeAdapterFactory typeadapterfactory, TypeToken typetoken)
	{
		Object obj = ((Object) (typeadapterfactory));
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!factories.contains(((Object) (typeadapterfactory))))
	//*   2    3:aload_0         
	//*   3    4:getfield        #313 <Field List factories>
	//*   4    7:aload_1         
	//*   5    8:invokeinterface #536 <Method boolean List.contains(Object)>
	//*   6   13:ifne            22
			obj = ((Object) (jsonAdapterFactory));
	//    7   16:aload_0         
	//    8   17:getfield        #299 <Field JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory>
	//    9   20:astore          4
		boolean flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_3        
		for(typeadapterfactory = ((TypeAdapterFactory) (factories.iterator())); ((Iterator) (typeadapterfactory)).hasNext();)
	//*  12   24:aload_0         
	//*  13   25:getfield        #313 <Field List factories>
	//*  14   28:invokeinterface #501 <Method Iterator List.iterator()>
	//*  15   33:astore_1        
	//*  16   34:aload_1         
	//*  17   35:invokeinterface #506 <Method boolean Iterator.hasNext()>
	//*  18   40:ifeq            92
		{
			Object obj1 = ((Object) ((TypeAdapterFactory)((Iterator) (typeadapterfactory)).next()));
	//   19   43:aload_1         
	//   20   44:invokeinterface #509 <Method Object Iterator.next()>
	//   21   49:checkcast       #511 <Class TypeAdapterFactory>
	//   22   52:astore          5
			if(!flag)
	//*  23   54:iload_3         
	//*  24   55:ifne            70
			{
				if(obj1 == obj)
	//*  25   58:aload           5
	//*  26   60:aload           4
	//*  27   62:if_acmpne       34
					flag = true;
	//   28   65:iconst_1        
	//   29   66:istore_3        
			} else
	//*  30   67:goto            34
			{
				obj1 = ((Object) (((TypeAdapterFactory) (obj1)).create(this, typetoken)));
	//   31   70:aload           5
	//   32   72:aload_0         
	//   33   73:aload_2         
	//   34   74:invokeinterface #515 <Method TypeAdapter TypeAdapterFactory.create(Gson, TypeToken)>
	//   35   79:astore          5
				if(obj1 != null)
	//*  36   81:aload           5
	//*  37   83:ifnull          89
					return ((TypeAdapter) (obj1));
	//   38   86:aload           5
	//   39   88:areturn         
			}
		}

	//*  40   89:goto            34
		throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot serialize ").append(((Object) (typetoken))).toString());
	//   41   92:new             #368 <Class IllegalArgumentException>
	//   42   95:dup             
	//   43   96:new             #370 <Class StringBuilder>
	//   44   99:dup             
	//   45  100:invokespecial   #371 <Method void StringBuilder()>
	//   46  103:ldc2            #538 <String "GSON cannot serialize ">
	//   47  106:invokevirtual   #380 <Method StringBuilder StringBuilder.append(String)>
	//   48  109:aload_2         
	//   49  110:invokevirtual   #528 <Method StringBuilder StringBuilder.append(Object)>
	//   50  113:invokevirtual   #384 <Method String StringBuilder.toString()>
	//   51  116:invokespecial   #385 <Method void IllegalArgumentException(String)>
	//   52  119:athrow          
	}

	public boolean htmlSafe()
	{
		return htmlSafe;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field boolean htmlSafe>
	//    2    4:ireturn         
	}

	public JsonReader newJsonReader(Reader reader)
	{
		reader = ((Reader) (new JsonReader(reader)));
	//    0    0:new             #323 <Class JsonReader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #542 <Method void JsonReader(Reader)>
	//    4    8:astore_1        
		((JsonReader) (reader)).setLenient(lenient);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #130 <Field boolean lenient>
	//    8   14:invokevirtual   #443 <Method void JsonReader.setLenient(boolean)>
		return ((JsonReader) (reader));
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public JsonWriter newJsonWriter(Writer writer)
		throws IOException
	{
		if(generateNonExecutableJson)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field boolean generateNonExecutableJson>
	//*   2    4:ifeq            13
			writer.write(")]}'\n");
	//    3    7:aload_1         
	//    4    8:ldc1            #31  <String ")]}'\n">
	//    5   10:invokevirtual   #549 <Method void Writer.write(String)>
		writer = ((Writer) (new JsonWriter(writer)));
	//    6   13:new             #551 <Class JsonWriter>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #554 <Method void JsonWriter(Writer)>
	//   10   21:astore_1        
		if(prettyPrinting)
	//*  11   22:aload_0         
	//*  12   23:getfield        #128 <Field boolean prettyPrinting>
	//*  13   26:ifeq            36
			((JsonWriter) (writer)).setIndent("  ");
	//   14   29:aload_1         
	//   15   30:ldc2            #556 <String "  ">
	//   16   33:invokevirtual   #559 <Method void JsonWriter.setIndent(String)>
		((JsonWriter) (writer)).setSerializeNulls(serializeNulls);
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:getfield        #122 <Field boolean serializeNulls>
	//   20   41:invokevirtual   #562 <Method void JsonWriter.setSerializeNulls(boolean)>
		return ((JsonWriter) (writer));
	//   21   44:aload_1         
	//   22   45:areturn         
	}

	public boolean serializeNulls()
	{
		return serializeNulls;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field boolean serializeNulls>
	//    2    4:ireturn         
	}

	public String toJson(JsonElement jsonelement)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #566 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #567 <Method void StringWriter()>
	//    3    7:astore_2        
		toJson(jsonelement, ((Appendable) (stringwriter)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #570 <Method void toJson(JsonElement, Appendable)>
		return stringwriter.toString();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #571 <Method String StringWriter.toString()>
	//   10   18:areturn         
	}

	public String toJson(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			return toJson(((JsonElement) (JsonNull.INSTANCE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #578 <Field JsonNull JsonNull.INSTANCE>
	//    4    8:invokevirtual   #580 <Method String toJson(JsonElement)>
	//    5   11:areturn         
		else
			return toJson(obj, ((Type) (obj.getClass())));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #584 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #587 <Method String toJson(Object, Type)>
	//   11   21:areturn         
	}

	public String toJson(Object obj, Type type)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #566 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #567 <Method void StringWriter()>
	//    3    7:astore_3        
		toJson(obj, type, ((Appendable) (stringwriter)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #590 <Method void toJson(Object, Type, Appendable)>
		return stringwriter.toString();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #571 <Method String StringWriter.toString()>
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
	//    1    1:invokevirtual   #592 <Method boolean JsonWriter.isLenient()>
	//    2    4:istore_3        
		jsonwriter.setLenient(true);
	//    3    5:aload_2         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #593 <Method void JsonWriter.setLenient(boolean)>
		flag1 = jsonwriter.isHtmlSafe();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #596 <Method boolean JsonWriter.isHtmlSafe()>
	//    8   14:istore          4
		jsonwriter.setHtmlSafe(htmlSafe);
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #126 <Field boolean htmlSafe>
	//   12   21:invokevirtual   #599 <Method void JsonWriter.setHtmlSafe(boolean)>
		flag2 = jsonwriter.getSerializeNulls();
	//   13   24:aload_2         
	//   14   25:invokevirtual   #602 <Method boolean JsonWriter.getSerializeNulls()>
	//   15   28:istore          5
		jsonwriter.setSerializeNulls(serializeNulls);
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #122 <Field boolean serializeNulls>
	//   19   35:invokevirtual   #562 <Method void JsonWriter.setSerializeNulls(boolean)>
		Streams.write(jsonelement, jsonwriter);
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokestatic    #606 <Method void Streams.write(JsonElement, JsonWriter)>
		jsonwriter.setLenient(flag);
	//   23   43:aload_2         
	//   24   44:iload_3         
	//   25   45:invokevirtual   #593 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   26   48:aload_2         
	//   27   49:iload           4
	//   28   51:invokevirtual   #599 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   29   54:aload_2         
	//   30   55:iload           5
	//   31   57:invokevirtual   #562 <Method void JsonWriter.setSerializeNulls(boolean)>
		return;
	//   32   60:return          
		jsonelement;
	//   33   61:astore_1        
		throw new JsonIOException(((Throwable) (jsonelement)));
	//   34   62:new             #335 <Class JsonIOException>
	//   35   65:dup             
	//   36   66:aload_1         
	//   37   67:invokespecial   #346 <Method void JsonIOException(Throwable)>
	//   38   70:athrow          
		jsonelement;
	//   39   71:astore_1        
		jsonwriter.setLenient(flag);
	//   40   72:aload_2         
	//   41   73:iload_3         
	//   42   74:invokevirtual   #593 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   43   77:aload_2         
	//   44   78:iload           4
	//   45   80:invokevirtual   #599 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   46   83:aload_2         
	//   47   84:iload           5
	//   48   86:invokevirtual   #562 <Method void JsonWriter.setSerializeNulls(boolean)>
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
	//    4    4:invokestatic    #610 <Method Writer Streams.writerForAppendable(Appendable)>
	//    5    7:invokevirtual   #612 <Method JsonWriter newJsonWriter(Writer)>
	//    6   10:invokevirtual   #614 <Method void toJson(JsonElement, JsonWriter)>
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(JsonElement jsonelement)
	//*   8   14:astore_1        
		{
			throw new JsonIOException(((Throwable) (jsonelement)));
	//    9   15:new             #335 <Class JsonIOException>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #346 <Method void JsonIOException(Throwable)>
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
	//    5    7:invokevirtual   #584 <Method Class Object.getClass()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #590 <Method void toJson(Object, Type, Appendable)>
			return;
	//    8   14:return          
		} else
		{
			toJson(((JsonElement) (JsonNull.INSTANCE)), appendable);
	//    9   15:aload_0         
	//   10   16:getstatic       #578 <Field JsonNull JsonNull.INSTANCE>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #570 <Method void toJson(JsonElement, Appendable)>
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
	//    2    2:invokestatic    #446 <Method TypeToken TypeToken.get(Type)>
	//    3    5:invokevirtual   #450 <Method TypeAdapter getAdapter(TypeToken)>
	//    4    8:astore_2        
		flag = jsonwriter.isLenient();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #592 <Method boolean JsonWriter.isLenient()>
	//    7   13:istore          4
		jsonwriter.setLenient(true);
	//    8   15:aload_3         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #593 <Method void JsonWriter.setLenient(boolean)>
		flag1 = jsonwriter.isHtmlSafe();
	//   11   20:aload_3         
	//   12   21:invokevirtual   #596 <Method boolean JsonWriter.isHtmlSafe()>
	//   13   24:istore          5
		jsonwriter.setHtmlSafe(htmlSafe);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #126 <Field boolean htmlSafe>
	//   17   31:invokevirtual   #599 <Method void JsonWriter.setHtmlSafe(boolean)>
		flag2 = jsonwriter.getSerializeNulls();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #602 <Method boolean JsonWriter.getSerializeNulls()>
	//   20   38:istore          6
		jsonwriter.setSerializeNulls(serializeNulls);
	//   21   40:aload_3         
	//   22   41:aload_0         
	//   23   42:getfield        #122 <Field boolean serializeNulls>
	//   24   45:invokevirtual   #562 <Method void JsonWriter.setSerializeNulls(boolean)>
		((TypeAdapter) (type)).write(jsonwriter, obj);
	//   25   48:aload_2         
	//   26   49:aload_3         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #619 <Method void TypeAdapter.write(JsonWriter, Object)>
		jsonwriter.setLenient(flag);
	//   29   54:aload_3         
	//   30   55:iload           4
	//   31   57:invokevirtual   #593 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   32   60:aload_3         
	//   33   61:iload           5
	//   34   63:invokevirtual   #599 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   35   66:aload_3         
	//   36   67:iload           6
	//   37   69:invokevirtual   #562 <Method void JsonWriter.setSerializeNulls(boolean)>
		return;
	//   38   72:return          
		obj;
	//   39   73:astore_1        
		throw new JsonIOException(((Throwable) (obj)));
	//   40   74:new             #335 <Class JsonIOException>
	//   41   77:dup             
	//   42   78:aload_1         
	//   43   79:invokespecial   #346 <Method void JsonIOException(Throwable)>
	//   44   82:athrow          
		obj;
	//   45   83:astore_1        
		jsonwriter.setLenient(flag);
	//   46   84:aload_3         
	//   47   85:iload           4
	//   48   87:invokevirtual   #593 <Method void JsonWriter.setLenient(boolean)>
		jsonwriter.setHtmlSafe(flag1);
	//   49   90:aload_3         
	//   50   91:iload           5
	//   51   93:invokevirtual   #599 <Method void JsonWriter.setHtmlSafe(boolean)>
		jsonwriter.setSerializeNulls(flag2);
	//   52   96:aload_3         
	//   53   97:iload           6
	//   54   99:invokevirtual   #562 <Method void JsonWriter.setSerializeNulls(boolean)>
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
	//    5    5:invokestatic    #610 <Method Writer Streams.writerForAppendable(Appendable)>
	//    6    8:invokevirtual   #612 <Method JsonWriter newJsonWriter(Writer)>
	//    7   11:invokevirtual   #621 <Method void toJson(Object, Type, JsonWriter)>
			return;
	//    8   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   9   15:astore_1        
		{
			throw new JsonIOException(((Throwable) (obj)));
	//   10   16:new             #335 <Class JsonIOException>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:invokespecial   #346 <Method void JsonIOException(Throwable)>
	//   14   24:athrow          
		}
	}

	public JsonElement toJsonTree(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return ((JsonElement) (JsonNull.INSTANCE));
	//    2    4:getstatic       #578 <Field JsonNull JsonNull.INSTANCE>
	//    3    7:areturn         
		else
			return toJsonTree(obj, ((Type) (obj.getClass())));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #584 <Method Class Object.getClass()>
	//    8   14:invokevirtual   #626 <Method JsonElement toJsonTree(Object, Type)>
	//    9   17:areturn         
	}

	public JsonElement toJsonTree(Object obj, Type type)
	{
		JsonTreeWriter jsontreewriter = new JsonTreeWriter();
	//    0    0:new             #628 <Class JsonTreeWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #629 <Method void JsonTreeWriter()>
	//    3    7:astore_3        
		toJson(obj, type, ((JsonWriter) (jsontreewriter)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #621 <Method void toJson(Object, Type, JsonWriter)>
		return jsontreewriter.get();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #632 <Method JsonElement JsonTreeWriter.get()>
	//   11   19:areturn         
	}

	public String toString()
	{
		return (new StringBuilder("{serializeNulls:")).append(serializeNulls).append(",factories:").append(((Object) (factories))).append(",instanceCreators:").append(((Object) (constructorConstructor))).append("}").toString();
	//    0    0:new             #370 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #634 <String "{serializeNulls:">
	//    3    7:invokespecial   #635 <Method void StringBuilder(String)>
	//    4   10:aload_0         
	//    5   11:getfield        #122 <Field boolean serializeNulls>
	//    6   14:invokevirtual   #638 <Method StringBuilder StringBuilder.append(boolean)>
	//    7   17:ldc2            #640 <String ",factories:">
	//    8   20:invokevirtual   #380 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:getfield        #313 <Field List factories>
	//   11   27:invokevirtual   #528 <Method StringBuilder StringBuilder.append(Object)>
	//   12   30:ldc2            #642 <String ",instanceCreators:">
	//   13   33:invokevirtual   #380 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:aload_0         
	//   15   37:getfield        #116 <Field ConstructorConstructor constructorConstructor>
	//   16   40:invokevirtual   #528 <Method StringBuilder StringBuilder.append(Object)>
	//   17   43:ldc2            #644 <String "}">
	//   18   46:invokevirtual   #380 <Method StringBuilder StringBuilder.append(String)>
	//   19   49:invokevirtual   #384 <Method String StringBuilder.toString()>
	//   20   52:areturn         
	}

	static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
	static final boolean DEFAULT_ESCAPE_HTML = true;
	static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
	static final boolean DEFAULT_LENIENT = false;
	static final boolean DEFAULT_PRETTY_PRINT = false;
	static final boolean DEFAULT_SERIALIZE_NULLS = false;
	static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
	private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
	private static final TypeToken NULL_KEY_SURROGATE = TypeToken.get(java/lang/Object);
	private final ThreadLocal calls;
	private final ConstructorConstructor constructorConstructor;
	private final Excluder excluder;
	private final List factories;
	private final FieldNamingStrategy fieldNamingStrategy;
	private final boolean generateNonExecutableJson;
	private final boolean htmlSafe;
	private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
	private final boolean lenient;
	private final boolean prettyPrinting;
	private final boolean serializeNulls;
	private final Map typeTokenCache;

	static 
	{
	//    0    0:ldc1            #4   <Class Object>
	//    1    2:invokestatic    #64  <Method TypeToken TypeToken.get(Class)>
	//    2    5:putstatic       #66  <Field TypeToken NULL_KEY_SURROGATE>
	//*   3    8:return          
	}
}
