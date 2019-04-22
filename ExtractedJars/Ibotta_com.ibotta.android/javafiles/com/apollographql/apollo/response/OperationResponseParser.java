// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.response;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.cache.normalized.ResponseNormalizer;
import com.apollographql.apollo.internal.field.MapFieldValueResolver;
import com.apollographql.apollo.internal.json.*;
import com.apollographql.apollo.internal.response.RealResponseReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import okio.BufferedSource;

// Referenced classes of package com.apollographql.apollo.response:
//			ScalarTypeAdapters

public final class OperationResponseParser
{

	public OperationResponseParser(Operation operation1, ResponseFieldMapper responsefieldmapper, ScalarTypeAdapters scalartypeadapters)
	{
		this(operation1, responsefieldmapper, scalartypeadapters, ResponseNormalizer.NO_OP_NORMALIZER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:getstatic       #28  <Field ResponseNormalizer ResponseNormalizer.NO_OP_NORMALIZER>
	//    5    7:invokespecial   #31  <Method void OperationResponseParser(Operation, ResponseFieldMapper, ScalarTypeAdapters, ResponseNormalizer)>
	//    6   10:return          
	}

	public OperationResponseParser(Operation operation1, ResponseFieldMapper responsefieldmapper, ScalarTypeAdapters scalartypeadapters, ResponseNormalizer responsenormalizer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		operation = operation1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field Operation operation>
		responseFieldMapper = responsefieldmapper;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field ResponseFieldMapper responseFieldMapper>
		scalarTypeAdapters = scalartypeadapters;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #43  <Field ScalarTypeAdapters scalarTypeAdapters>
		responseNormalizer = responsenormalizer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #45  <Field ResponseNormalizer responseNormalizer>
	//   14   25:return          
	}

	private Error readError(Map map)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void ArrayList()>
	//    3    7:astore_2        
		HashMap hashmap = new HashMap();
	//    4    8:new             #57  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #58  <Method void HashMap()>
	//    7   15:astore_3        
		Iterator iterator = map.entrySet().iterator();
	//    8   16:aload_1         
	//    9   17:invokeinterface #64  <Method Set Map.entrySet()>
	//   10   22:invokeinterface #70  <Method Iterator Set.iterator()>
	//   11   27:astore          4
		map = null;
	//   12   29:aconst_null     
	//   13   30:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   31:aload           4
	//   15   33:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   16   38:ifeq            202
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   17   41:aload           4
	//   18   43:invokeinterface #80  <Method Object Iterator.next()>
	//   19   48:checkcast       #82  <Class java.util.Map$Entry>
	//   20   51:astore          5
			if("message".equals(((java.util.Map.Entry) (obj)).getKey()))
	//*  21   53:ldc1            #84  <String "message">
	//*  22   55:aload           5
	//*  23   57:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//*  24   62:invokevirtual   #93  <Method boolean String.equals(Object)>
	//*  25   65:ifeq            93
			{
				map = ((Map) (((java.util.Map.Entry) (obj)).getValue()));
	//   26   68:aload           5
	//   27   70:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   28   75:astore_1        
				if(map != null)
	//*  29   76:aload_1         
	//*  30   77:ifnull          88
					map = ((Map) (((Object) (map)).toString()));
	//   31   80:aload_1         
	//   32   81:invokevirtual   #100 <Method String Object.toString()>
	//   33   84:astore_1        
				else
	//*  34   85:goto            31
					map = null;
	//   35   88:aconst_null     
	//   36   89:astore_1        
			} else
	//*  37   90:goto            31
			if("locations".equals(((java.util.Map.Entry) (obj)).getKey()))
	//*  38   93:ldc1            #102 <String "locations">
	//*  39   95:aload           5
	//*  40   97:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//*  41  102:invokevirtual   #93  <Method boolean String.equals(Object)>
	//*  42  105:ifeq            168
			{
				obj = ((Object) ((List)((java.util.Map.Entry) (obj)).getValue()));
	//   43  108:aload           5
	//   44  110:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   45  115:checkcast       #104 <Class List>
	//   46  118:astore          5
				if(obj != null)
	//*  47  120:aload           5
	//*  48  122:ifnull          31
				{
					obj = ((Object) (((List) (obj)).iterator()));
	//   49  125:aload           5
	//   50  127:invokeinterface #105 <Method Iterator List.iterator()>
	//   51  132:astore          5
					while(((Iterator) (obj)).hasNext()) 
	//*  52  134:aload           5
	//*  53  136:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  54  141:ifeq            31
						((List) (arraylist)).add(((Object) (readErrorLocation((Map)((Iterator) (obj)).next()))));
	//   55  144:aload_2         
	//   56  145:aload_0         
	//   57  146:aload           5
	//   58  148:invokeinterface #80  <Method Object Iterator.next()>
	//   59  153:checkcast       #60  <Class Map>
	//   60  156:invokespecial   #109 <Method com.apollographql.apollo.api.Error$Location readErrorLocation(Map)>
	//   61  159:invokeinterface #112 <Method boolean List.add(Object)>
	//   62  164:pop             
				}
			} else
	//*  63  165:goto            134
			if(((java.util.Map.Entry) (obj)).getValue() != null)
	//*  64  168:aload           5
	//*  65  170:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//*  66  175:ifnull          31
				((Map) (hashmap)).put(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
	//   67  178:aload_3         
	//   68  179:aload           5
	//   69  181:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   70  186:aload           5
	//   71  188:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   72  193:invokeinterface #116 <Method Object Map.put(Object, Object)>
	//   73  198:pop             
		} while(true);
	//   74  199:goto            31
		return new Error(((String) (map)), ((List) (arraylist)), ((Map) (hashmap)));
	//   75  202:new             #118 <Class Error>
	//   76  205:dup             
	//   77  206:aload_1         
	//   78  207:aload_2         
	//   79  208:aload_3         
	//   80  209:invokespecial   #121 <Method void Error(String, List, Map)>
	//   81  212:areturn         
	}

	private com.apollographql.apollo.api.Error.Location readErrorLocation(Map map)
	{
		long l1 = -1L;
	//    0    0:ldc2w           #123 <Long -1L>
	//    1    3:lstore          4
		long l2;
		long l3;
		if(map != null)
	//*   2    5:aload_1         
	//*   3    6:ifnull          117
		{
			map = ((Map) (map.entrySet().iterator()));
	//    4    9:aload_1         
	//    5   10:invokeinterface #64  <Method Set Map.entrySet()>
	//    6   15:invokeinterface #70  <Method Iterator Set.iterator()>
	//    7   20:astore_1        
			long l = -1L;
	//    8   21:ldc2w           #123 <Long -1L>
	//    9   24:lstore_2        
			do
			{
				l3 = l1;
	//   10   25:lload           4
	//   11   27:lstore          8
				l2 = l;
	//   12   29:lload_2         
	//   13   30:lstore          6
				if(!((Iterator) (map)).hasNext())
					break;
	//   14   32:aload_1         
	//   15   33:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   16   38:ifeq            126
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   17   41:aload_1         
	//   18   42:invokeinterface #80  <Method Object Iterator.next()>
	//   19   47:checkcast       #82  <Class java.util.Map$Entry>
	//   20   50:astore          10
				if("line".equals(entry.getKey()))
	//*  21   52:ldc1            #126 <String "line">
	//*  22   54:aload           10
	//*  23   56:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//*  24   61:invokevirtual   #93  <Method boolean String.equals(Object)>
	//*  25   64:ifeq            85
					l1 = ((BigDecimal)entry.getValue()).longValue();
	//   26   67:aload           10
	//   27   69:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   28   74:checkcast       #128 <Class BigDecimal>
	//   29   77:invokevirtual   #132 <Method long BigDecimal.longValue()>
	//   30   80:lstore          4
				else
	//*  31   82:goto            25
				if("column".equals(entry.getKey()))
	//*  32   85:ldc1            #134 <String "column">
	//*  33   87:aload           10
	//*  34   89:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//*  35   94:invokevirtual   #93  <Method boolean String.equals(Object)>
	//*  36   97:ifeq            25
					l = ((BigDecimal)entry.getValue()).longValue();
	//   37  100:aload           10
	//   38  102:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   39  107:checkcast       #128 <Class BigDecimal>
	//   40  110:invokevirtual   #132 <Method long BigDecimal.longValue()>
	//   41  113:lstore_2        
			} while(true);
	//   42  114:goto            25
		} else
		{
			l2 = -1L;
	//   43  117:ldc2w           #123 <Long -1L>
	//   44  120:lstore          6
			l3 = l1;
	//   45  122:lload           4
	//   46  124:lstore          8
		}
		return new com.apollographql.apollo.api.Error.Location(l3, l2);
	//   47  126:new             #136 <Class com.apollographql.apollo.api.Error$Location>
	//   48  129:dup             
	//   49  130:lload           8
	//   50  132:lload           6
	//   51  134:invokespecial   #139 <Method void com.apollographql.apollo.api.Error$Location(long, long)>
	//   52  137:areturn         
	}

	private List readResponseErrors(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		return responsejsonstreamreader.nextList(true, new com.apollographql.apollo.internal.json.ResponseJsonStreamReader.ListReader() {

			public Error read(ResponseJsonStreamReader responsejsonstreamreader1)
				throws IOException
			{
				return (Error)responsejsonstreamreader1.nextObject(true, new com.apollographql.apollo.internal.json.ResponseJsonStreamReader.ObjectReader() {

					public Error read(ResponseJsonStreamReader responsejsonstreamreader)
						throws IOException
					{
						return readError(responsejsonstreamreader.toMap());
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field OperationResponseParser$2 this$1>
					//    2    4:getfield        #28  <Field OperationResponseParser OperationResponseParser$2.this$0>
					//    3    7:aload_1         
					//    4    8:invokevirtual   #34  <Method Map ResponseJsonStreamReader.toMap()>
					//    5   11:invokestatic    #40  <Method Error OperationResponseParser.access$000(OperationResponseParser, Map)>
					//    6   14:areturn         
					}

					public volatile Object read(ResponseJsonStreamReader responsejsonstreamreader)
						throws IOException
					{
						return ((Object) (read(responsejsonstreamreader)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:invokevirtual   #43  <Method Error read(ResponseJsonStreamReader)>
					//    3    5:areturn         
					}

					final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field OperationResponseParser$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_1         
			//    1    1:iconst_1        
			//    2    2:new             #14  <Class OperationResponseParser$2$1>
			//    3    5:dup             
			//    4    6:aload_0         
			//    5    7:invokespecial   #31  <Method void OperationResponseParser$2$1(OperationResponseParser$2)>
			//    6   10:invokevirtual   #37  <Method Object ResponseJsonStreamReader.nextObject(boolean, com.apollographql.apollo.internal.json.ResponseJsonStreamReader$ObjectReader)>
			//    7   13:checkcast       #39  <Class Error>
			//    8   16:areturn         
			}

			public volatile Object read(ResponseJsonStreamReader responsejsonstreamreader1)
				throws IOException
			{
				return ((Object) (read(responsejsonstreamreader1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #43  <Method Error read(ResponseJsonStreamReader)>
			//    3    5:areturn         
			}

			final OperationResponseParser this$0;

			
			{
				this$0 = OperationResponseParser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field OperationResponseParser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:new             #9   <Class OperationResponseParser$2>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #147 <Method void OperationResponseParser$2(OperationResponseParser)>
	//    6   10:invokevirtual   #153 <Method List ResponseJsonStreamReader.nextList(boolean, com.apollographql.apollo.internal.json.ResponseJsonStreamReader$ListReader)>
	//    7   13:areturn         
	}

	public Response parse(Map map)
	{
		Utils.checkNotNull(((Object) (map)), "payload == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #160 <String "payload == null">
	//    2    3:invokestatic    #165 <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		boolean flag = map.containsKey("data");
	//    4    7:aload_1         
	//    5    8:ldc1            #167 <String "data">
	//    6   10:invokeinterface #170 <Method boolean Map.containsKey(Object)>
	//    7   15:istore_2        
		Object obj1 = null;
	//    8   16:aconst_null     
	//    9   17:astore          5
		Object obj;
		if(flag)
	//*  10   19:iload_2         
	//*  11   20:ifeq            85
		{
			obj = ((Object) ((Map)map.get("data")));
	//   12   23:aload_1         
	//   13   24:ldc1            #167 <String "data">
	//   14   26:invokeinterface #174 <Method Object Map.get(Object)>
	//   15   31:checkcast       #60  <Class Map>
	//   16   34:astore_3        
			obj = ((Object) (new RealResponseReader(operation.variables(), obj, ((com.apollographql.apollo.internal.field.FieldValueResolver) (new MapFieldValueResolver())), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (responseNormalizer)))));
	//   17   35:new             #176 <Class RealResponseReader>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:getfield        #39  <Field Operation operation>
	//   21   43:invokeinterface #182 <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//   22   48:aload_3         
	//   23   49:new             #184 <Class MapFieldValueResolver>
	//   24   52:dup             
	//   25   53:invokespecial   #185 <Method void MapFieldValueResolver()>
	//   26   56:aload_0         
	//   27   57:getfield        #43  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   28   60:aload_0         
	//   29   61:getfield        #45  <Field ResponseNormalizer responseNormalizer>
	//   30   64:invokespecial   #188 <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
	//   31   67:astore_3        
			obj = ((Object) ((com.apollographql.apollo.api.Operation.Data)responseFieldMapper.map(((com.apollographql.apollo.api.ResponseReader) (obj)))));
	//   32   68:aload_0         
	//   33   69:getfield        #41  <Field ResponseFieldMapper responseFieldMapper>
	//   34   72:aload_3         
	//   35   73:invokeinterface #194 <Method Object ResponseFieldMapper.map(com.apollographql.apollo.api.ResponseReader)>
	//   36   78:checkcast       #196 <Class com.apollographql.apollo.api.Operation$Data>
	//   37   81:astore_3        
		} else
	//*  38   82:goto            87
		{
			obj = null;
	//   39   85:aconst_null     
	//   40   86:astore_3        
		}
		Map map1 = ((Map) (obj1));
	//   41   87:aload           5
	//   42   89:astore          4
		if(map.containsKey("errors"))
	//*  43   91:aload_1         
	//*  44   92:ldc1            #198 <String "errors">
	//*  45   94:invokeinterface #170 <Method boolean Map.containsKey(Object)>
	//*  46   99:ifeq            178
		{
			List list = (List)map.get("errors");
	//   47  102:aload_1         
	//   48  103:ldc1            #198 <String "errors">
	//   49  105:invokeinterface #174 <Method Object Map.get(Object)>
	//   50  110:checkcast       #104 <Class List>
	//   51  113:astore          6
			map1 = ((Map) (obj1));
	//   52  115:aload           5
	//   53  117:astore          4
			if(list != null)
	//*  54  119:aload           6
	//*  55  121:ifnull          178
			{
				map = ((Map) (new ArrayList()));
	//   56  124:new             #54  <Class ArrayList>
	//   57  127:dup             
	//   58  128:invokespecial   #55  <Method void ArrayList()>
	//   59  131:astore_1        
				Iterator iterator = list.iterator();
	//   60  132:aload           6
	//   61  134:invokeinterface #105 <Method Iterator List.iterator()>
	//   62  139:astore          5
				do
				{
					map1 = map;
	//   63  141:aload_1         
	//   64  142:astore          4
					if(!iterator.hasNext())
						break;
	//   65  144:aload           5
	//   66  146:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   67  151:ifeq            178
					((List) (map)).add(((Object) (readError((Map)iterator.next()))));
	//   68  154:aload_1         
	//   69  155:aload_0         
	//   70  156:aload           5
	//   71  158:invokeinterface #80  <Method Object Iterator.next()>
	//   72  163:checkcast       #60  <Class Map>
	//   73  166:invokespecial   #52  <Method Error readError(Map)>
	//   74  169:invokeinterface #112 <Method boolean List.add(Object)>
	//   75  174:pop             
				} while(true);
	//   76  175:goto            141
			}
		}
		return Response.builder(operation).data(operation.wrapData(((com.apollographql.apollo.api.Operation.Data) (obj)))).errors(((List) (map1))).dependentKeys(responseNormalizer.dependentKeys()).build();
	//   77  178:aload_0         
	//   78  179:getfield        #39  <Field Operation operation>
	//   79  182:invokestatic    #204 <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
	//   80  185:aload_0         
	//   81  186:getfield        #39  <Field Operation operation>
	//   82  189:aload_3         
	//   83  190:invokeinterface #208 <Method Object Operation.wrapData(com.apollographql.apollo.api.Operation$Data)>
	//   84  195:invokevirtual   #213 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.data(Object)>
	//   85  198:aload           4
	//   86  200:invokevirtual   #216 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.errors(List)>
	//   87  203:aload_0         
	//   88  204:getfield        #45  <Field ResponseNormalizer responseNormalizer>
	//   89  207:invokevirtual   #219 <Method Set ResponseNormalizer.dependentKeys()>
	//   90  210:invokevirtual   #222 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.dependentKeys(Set)>
	//   91  213:invokevirtual   #226 <Method Response com.apollographql.apollo.api.Response$Builder.build()>
	//   92  216:areturn         
	}

	public Response parse(BufferedSource bufferedsource)
		throws IOException
	{
		com.apollographql.apollo.api.Operation.Data data;
		responseNormalizer.willResolveRootQuery(operation);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ResponseNormalizer responseNormalizer>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field Operation operation>
	//    4    8:invokevirtual   #233 <Method void ResponseNormalizer.willResolveRootQuery(Operation)>
		data = null;
	//    5   11:aconst_null     
	//    6   12:astore_2        
		BufferedSourceJsonReader bufferedsourcejsonreader = new BufferedSourceJsonReader(bufferedsource);
	//    7   13:new             #235 <Class BufferedSourceJsonReader>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #238 <Method void BufferedSourceJsonReader(BufferedSource)>
	//   11   21:astore_3        
		ResponseJsonStreamReader responsejsonstreamreader;
		bufferedsourcejsonreader.beginObject();
	//   12   22:aload_3         
	//   13   23:invokevirtual   #241 <Method void BufferedSourceJsonReader.beginObject()>
		responsejsonstreamreader = ApolloJsonReader.responseJsonStreamReader(bufferedsourcejsonreader);
	//   14   26:aload_3         
	//   15   27:invokestatic    #247 <Method ResponseJsonStreamReader ApolloJsonReader.responseJsonStreamReader(BufferedSourceJsonReader)>
	//   16   30:astore          4
		bufferedsource = null;
	//   17   32:aconst_null     
	//   18   33:astore_1        
_L1:
		String s;
		do
		{
label0:
			{
				if(!responsejsonstreamreader.hasNext())
					break MISSING_BLOCK_LABEL_108;
	//   19   34:aload           4
	//   20   36:invokevirtual   #248 <Method boolean ResponseJsonStreamReader.hasNext()>
	//   21   39:ifeq            108
				s = responsejsonstreamreader.nextName();
	//   22   42:aload           4
	//   23   44:invokevirtual   #251 <Method String ResponseJsonStreamReader.nextName()>
	//   24   47:astore          5
				if(!"data".equals(((Object) (s))))
					break label0;
	//   25   49:ldc1            #167 <String "data">
	//   26   51:aload           5
	//   27   53:invokevirtual   #93  <Method boolean String.equals(Object)>
	//   28   56:ifeq            80
				data = (com.apollographql.apollo.api.Operation.Data)responsejsonstreamreader.nextObject(true, new com.apollographql.apollo.internal.json.ResponseJsonStreamReader.ObjectReader() {

					public Object read(ResponseJsonStreamReader responsejsonstreamreader1)
						throws IOException
					{
						responsejsonstreamreader1 = ((ResponseJsonStreamReader) (responsejsonstreamreader1.toMap()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #32  <Method Map ResponseJsonStreamReader.toMap()>
					//    2    4:astore_1        
						responsejsonstreamreader1 = ((ResponseJsonStreamReader) (new RealResponseReader(operation.variables(), ((Object) (responsejsonstreamreader1)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (new MapFieldValueResolver())), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (responseNormalizer)))));
					//    3    5:new             #34  <Class RealResponseReader>
					//    4    8:dup             
					//    5    9:aload_0         
					//    6   10:getfield        #18  <Field OperationResponseParser this$0>
					//    7   13:getfield        #38  <Field Operation OperationResponseParser.operation>
					//    8   16:invokeinterface #44  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
					//    9   21:aload_1         
					//   10   22:new             #46  <Class MapFieldValueResolver>
					//   11   25:dup             
					//   12   26:invokespecial   #47  <Method void MapFieldValueResolver()>
					//   13   29:aload_0         
					//   14   30:getfield        #18  <Field OperationResponseParser this$0>
					//   15   33:getfield        #51  <Field ScalarTypeAdapters OperationResponseParser.scalarTypeAdapters>
					//   16   36:aload_0         
					//   17   37:getfield        #18  <Field OperationResponseParser this$0>
					//   18   40:getfield        #55  <Field ResponseNormalizer OperationResponseParser.responseNormalizer>
					//   19   43:invokespecial   #58  <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
					//   20   46:astore_1        
						return responseFieldMapper.map(((com.apollographql.apollo.api.ResponseReader) (responsejsonstreamreader1)));
					//   21   47:aload_0         
					//   22   48:getfield        #18  <Field OperationResponseParser this$0>
					//   23   51:getfield        #62  <Field ResponseFieldMapper OperationResponseParser.responseFieldMapper>
					//   24   54:aload_1         
					//   25   55:invokeinterface #68  <Method Object ResponseFieldMapper.map(com.apollographql.apollo.api.ResponseReader)>
					//   26   60:areturn         
					}

					final OperationResponseParser this$0;

			
			{
				this$0 = OperationResponseParser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field OperationResponseParser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   29   59:aload           4
	//   30   61:iconst_1        
	//   31   62:new             #7   <Class OperationResponseParser$1>
	//   32   65:dup             
	//   33   66:aload_0         
	//   34   67:invokespecial   #252 <Method void OperationResponseParser$1(OperationResponseParser)>
	//   35   70:invokevirtual   #256 <Method Object ResponseJsonStreamReader.nextObject(boolean, com.apollographql.apollo.internal.json.ResponseJsonStreamReader$ObjectReader)>
	//   36   73:checkcast       #196 <Class com.apollographql.apollo.api.Operation$Data>
	//   37   76:astore_2        
			}
		} while(true);
	//   38   77:goto            34
label1:
		{
			if(!"errors".equals(((Object) (s))))
				break label1;
	//   39   80:ldc1            #198 <String "errors">
	//   40   82:aload           5
	//   41   84:invokevirtual   #93  <Method boolean String.equals(Object)>
	//   42   87:ifeq            100
			bufferedsource = ((BufferedSource) (readResponseErrors(responsejsonstreamreader)));
	//   43   90:aload_0         
	//   44   91:aload           4
	//   45   93:invokespecial   #258 <Method List readResponseErrors(ResponseJsonStreamReader)>
	//   46   96:astore_1        
		}
		  goto _L1
	//*  47   97:goto            34
		responsejsonstreamreader.skipNext();
	//   48  100:aload           4
	//   49  102:invokevirtual   #261 <Method void ResponseJsonStreamReader.skipNext()>
		  goto _L1
	//*  50  105:goto            34
		bufferedsourcejsonreader.endObject();
	//   51  108:aload_3         
	//   52  109:invokevirtual   #264 <Method void BufferedSourceJsonReader.endObject()>
		bufferedsource = ((BufferedSource) (Response.builder(operation).data(operation.wrapData(data)).errors(((List) (bufferedsource))).dependentKeys(responseNormalizer.dependentKeys()).build()));
	//   53  112:aload_0         
	//   54  113:getfield        #39  <Field Operation operation>
	//   55  116:invokestatic    #204 <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
	//   56  119:aload_0         
	//   57  120:getfield        #39  <Field Operation operation>
	//   58  123:aload_2         
	//   59  124:invokeinterface #208 <Method Object Operation.wrapData(com.apollographql.apollo.api.Operation$Data)>
	//   60  129:invokevirtual   #213 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.data(Object)>
	//   61  132:aload_1         
	//   62  133:invokevirtual   #216 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.errors(List)>
	//   63  136:aload_0         
	//   64  137:getfield        #45  <Field ResponseNormalizer responseNormalizer>
	//   65  140:invokevirtual   #219 <Method Set ResponseNormalizer.dependentKeys()>
	//   66  143:invokevirtual   #222 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.dependentKeys(Set)>
	//   67  146:invokevirtual   #226 <Method Response com.apollographql.apollo.api.Response$Builder.build()>
	//   68  149:astore_1        
		bufferedsourcejsonreader.close();
	//   69  150:aload_3         
	//   70  151:invokevirtual   #267 <Method void BufferedSourceJsonReader.close()>
		return ((Response) (bufferedsource));
	//   71  154:aload_1         
	//   72  155:areturn         
		Exception exception;
		exception;
	//   73  156:astore_2        
		bufferedsource = ((BufferedSource) (bufferedsourcejsonreader));
	//   74  157:aload_3         
	//   75  158:astore_1        
		break MISSING_BLOCK_LABEL_165;
	//   76  159:goto            165
		exception;
	//   77  162:astore_2        
		bufferedsource = null;
	//   78  163:aconst_null     
	//   79  164:astore_1        
		if(bufferedsource != null)
	//*  80  165:aload_1         
	//*  81  166:ifnull          173
			((BufferedSourceJsonReader) (bufferedsource)).close();
	//   82  169:aload_1         
	//   83  170:invokevirtual   #267 <Method void BufferedSourceJsonReader.close()>
		throw exception;
	//   84  173:aload_2         
	//   85  174:athrow          
	}

	final Operation operation;
	final ResponseFieldMapper responseFieldMapper;
	final ResponseNormalizer responseNormalizer;
	final ScalarTypeAdapters scalarTypeAdapters;


/*
	static Error access$000(OperationResponseParser operationresponseparser, Map map)
	{
		return operationresponseparser.readError(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method Error readError(Map)>
	//    3    5:areturn         
	}

*/
}
