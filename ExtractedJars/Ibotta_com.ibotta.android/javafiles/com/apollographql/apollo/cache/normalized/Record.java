// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.cache.normalized.RecordWeigher;
import java.util.*;

public final class Record
{
	public static class Builder
	{

		public Builder addField(String s, Object obj)
		{
			fields.put(Utils.checkNotNull(((Object) (s)), "key == null"), obj);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Map fields>
		//    2    4:aload_1         
		//    3    5:ldc1            #39  <String "key == null">
		//    4    7:invokestatic    #45  <Method Object Utils.checkNotNull(Object, Object)>
		//    5   10:aload_2         
		//    6   11:invokeinterface #50  <Method Object Map.put(Object, Object)>
		//    7   16:pop             
			return this;
		//    8   17:aload_0         
		//    9   18:areturn         
		}

		public Record build()
		{
			return new Record(key, fields, mutationId);
		//    0    0:new             #6   <Class Record>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field String key>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field Map fields>
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field UUID mutationId>
		//    8   16:invokespecial   #55  <Method void Record(String, Map, UUID)>
		//    9   19:areturn         
		}

		public String key()
		{
			return key;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String key>
		//    2    4:areturn         
		}

		public Builder mutationId(UUID uuid)
		{
			mutationId = uuid;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field UUID mutationId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final Map fields;
		private final String key;
		private UUID mutationId;

		public Builder(String s, Map map, UUID uuid)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			key = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String key>
			fields = ((Map) (new LinkedHashMap(map)));
		//    5    9:aload_0         
		//    6   10:new             #23  <Class LinkedHashMap>
		//    7   13:dup             
		//    8   14:aload_2         
		//    9   15:invokespecial   #26  <Method void LinkedHashMap(Map)>
		//   10   18:putfield        #28  <Field Map fields>
			mutationId = uuid;
		//   11   21:aload_0         
		//   12   22:aload_3         
		//   13   23:putfield        #30  <Field UUID mutationId>
		//   14   26:return          
		}
	}


	Record(String s, Map map, UUID uuid)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		sizeInBytes = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #23  <Field int sizeInBytes>
		key = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field String key>
		fields = map;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #27  <Field Map fields>
		mutationId = uuid;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #29  <Field UUID mutationId>
	//   14   24:return          
	}

	private void adjustSizeEstimate(Object obj, Object obj1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(sizeInBytes != -1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #23  <Field int sizeInBytes>
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          24
			sizeInBytes = sizeInBytes + RecordWeigher.byteChange(obj, obj1);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field int sizeInBytes>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokestatic    #40  <Method int RecordWeigher.byteChange(Object, Object)>
	//   12   20:iadd            
	//   13   21:putfield        #23  <Field int sizeInBytes>
		this;
	//   14   24:aload_0         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return;
	//   16   26:return          
		obj;
	//   17   27:astore_1        
	//*  18   28:aload_0         
		throw obj;
	//   19   29:monitorexit     
	//   20   30:aload_1         
	//   21   31:athrow          
	}

	public static Builder builder(String s)
	{
		return new Builder((String)Utils.checkNotNull(((Object) (s)), "key == null"), ((Map) (new LinkedHashMap())), ((UUID) (null)));
	//    0    0:new             #6   <Class Record$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #45  <String "key == null">
	//    4    7:invokestatic    #51  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   10:checkcast       #53  <Class String>
	//    6   13:new             #55  <Class LinkedHashMap>
	//    7   16:dup             
	//    8   17:invokespecial   #56  <Method void LinkedHashMap()>
	//    9   20:aconst_null     
	//   10   21:invokespecial   #58  <Method void Record$Builder(String, Map, UUID)>
	//   11   24:areturn         
	}

	public Record clone()
	{
		return toBuilder().build();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Record$Builder toBuilder()>
	//    2    4:invokevirtual   #68  <Method Record Record$Builder.build()>
	//    3    7:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method Record clone()>
	//    2    4:areturn         
	}

	public Object field(String s)
	{
		return fields.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map fields>
	//    2    4:aload_1         
	//    3    5:invokeinterface #82  <Method Object Map.get(Object)>
	//    4   10:areturn         
	}

	public Map fields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map fields>
	//    2    4:areturn         
	}

	public boolean hasField(String s)
	{
		return fields.containsKey(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map fields>
	//    2    4:aload_1         
	//    3    5:invokeinterface #90  <Method boolean Map.containsKey(Object)>
	//    4   10:ireturn         
	}

	public String key()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String key>
	//    2    4:areturn         
	}

	public Set mergeWith(Record record)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #95  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void HashSet()>
	//    3    7:astore_3        
		Iterator iterator = record.fields.entrySet().iterator();
	//    4    8:aload_1         
	//    5    9:getfield        #27  <Field Map fields>
	//    6   12:invokeinterface #100 <Method Set Map.entrySet()>
	//    7   17:invokeinterface #106 <Method Iterator Set.iterator()>
	//    8   22:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   24:aload           4
	//   10   26:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//   11   31:ifeq            204
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   12   34:aload           4
	//   13   36:invokeinterface #115 <Method Object Iterator.next()>
	//   14   41:checkcast       #117 <Class java.util.Map$Entry>
	//   15   44:astore          5
			Object obj = entry.getValue();
	//   16   46:aload           5
	//   17   48:invokeinterface #120 <Method Object java.util.Map$Entry.getValue()>
	//   18   53:astore          6
			boolean flag = fields.containsKey(entry.getKey());
	//   19   55:aload_0         
	//   20   56:getfield        #27  <Field Map fields>
	//   21   59:aload           5
	//   22   61:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   23   66:invokeinterface #90  <Method boolean Map.containsKey(Object)>
	//   24   71:istore_2        
			Object obj1 = fields.get(entry.getKey());
	//   25   72:aload_0         
	//   26   73:getfield        #27  <Field Map fields>
	//   27   76:aload           5
	//   28   78:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   29   83:invokeinterface #82  <Method Object Map.get(Object)>
	//   30   88:astore          7
			if(!flag || obj1 == null && obj != null || obj1 != null && !obj1.equals(obj))
	//*  31   90:iload_2         
	//*  32   91:ifeq            119
	//*  33   94:aload           7
	//*  34   96:ifnonnull       104
	//*  35   99:aload           6
	//*  36  101:ifnonnull       119
	//*  37  104:aload           7
	//*  38  106:ifnull          24
	//*  39  109:aload           7
	//*  40  111:aload           6
	//*  41  113:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//*  42  116:ifne            24
			{
				fields.put(entry.getKey(), obj);
	//   43  119:aload_0         
	//   44  120:getfield        #27  <Field Map fields>
	//   45  123:aload           5
	//   46  125:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   47  130:aload           6
	//   48  132:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   49  137:pop             
				StringBuilder stringbuilder = new StringBuilder();
	//   50  138:new             #131 <Class StringBuilder>
	//   51  141:dup             
	//   52  142:invokespecial   #132 <Method void StringBuilder()>
	//   53  145:astore          8
				stringbuilder.append(key());
	//   54  147:aload           8
	//   55  149:aload_0         
	//   56  150:invokevirtual   #134 <Method String key()>
	//   57  153:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   58  156:pop             
				stringbuilder.append(".");
	//   59  157:aload           8
	//   60  159:ldc1            #140 <String ".">
	//   61  161:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   62  164:pop             
				stringbuilder.append((String)entry.getKey());
	//   63  165:aload           8
	//   64  167:aload           5
	//   65  169:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   66  174:checkcast       #53  <Class String>
	//   67  177:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   68  180:pop             
				((Set) (hashset)).add(((Object) (stringbuilder.toString())));
	//   69  181:aload_3         
	//   70  182:aload           8
	//   71  184:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   72  187:invokeinterface #146 <Method boolean Set.add(Object)>
	//   73  192:pop             
				adjustSizeEstimate(obj, obj1);
	//   74  193:aload_0         
	//   75  194:aload           6
	//   76  196:aload           7
	//   77  198:invokespecial   #148 <Method void adjustSizeEstimate(Object, Object)>
			}
		} while(true);
	//   78  201:goto            24
		mutationId = record.mutationId;
	//   79  204:aload_0         
	//   80  205:aload_1         
	//   81  206:getfield        #29  <Field UUID mutationId>
	//   82  209:putfield        #29  <Field UUID mutationId>
		return ((Set) (hashset));
	//   83  212:aload_3         
	//   84  213:areturn         
	}

	public UUID mutationId()
	{
		return mutationId;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field UUID mutationId>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		return new Builder(key(), fields, mutationId);
	//    0    0:new             #6   <Class Record$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #134 <Method String key()>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Map fields>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field UUID mutationId>
	//    8   16:invokespecial   #58  <Method void Record$Builder(String, Map, UUID)>
	//    9   19:areturn         
	}

	private final Map fields;
	private final String key;
	private volatile UUID mutationId;
	private int sizeInBytes;
}
