// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.field;

import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.*;
import com.apollographql.apollo.internal.cache.normalized.ReadableStore;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.field:
//			FieldValueResolver

public final class CacheFieldValueResolver
	implements FieldValueResolver
{

	public CacheFieldValueResolver(ReadableStore readablestore, com.apollographql.apollo.api.Operation.Variables variables1, CacheKeyResolver cachekeyresolver, CacheHeaders cacheheaders)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		readableCache = readablestore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ReadableStore readableCache>
		variables = variables1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field com.apollographql.apollo.api.Operation$Variables variables>
		cacheKeyResolver = cachekeyresolver;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field CacheKeyResolver cacheKeyResolver>
		cacheHeaders = cacheheaders;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field CacheHeaders cacheHeaders>
	//   14   25:return          
	}

	private Object fieldValue(Record record, ResponseField responsefield)
	{
		String s = responsefield.cacheKey(variables);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field com.apollographql.apollo.api.Operation$Variables variables>
	//    3    5:invokevirtual   #39  <Method String ResponseField.cacheKey(com.apollographql.apollo.api.Operation$Variables)>
	//    4    8:astore_3        
		if(record.hasField(s))
	//*   5    9:aload_1         
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #45  <Method boolean Record.hasField(String)>
	//*   8   14:ifeq            23
		{
			return record.field(s);
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #49  <Method Object Record.field(String)>
	//   12   22:areturn         
		} else
		{
			record = ((Record) (new StringBuilder()));
	//   13   23:new             #51  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #52  <Method void StringBuilder()>
	//   16   30:astore_1        
			((StringBuilder) (record)).append("Missing value: ");
	//   17   31:aload_1         
	//   18   32:ldc1            #54  <String "Missing value: ">
	//   19   34:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			((StringBuilder) (record)).append(responsefield.fieldName());
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:invokevirtual   #62  <Method String ResponseField.fieldName()>
	//   24   43:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
			throw new NullPointerException(((StringBuilder) (record)).toString());
	//   26   47:new             #64  <Class NullPointerException>
	//   27   50:dup             
	//   28   51:aload_1         
	//   29   52:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   30   55:invokespecial   #70  <Method void NullPointerException(String)>
	//   31   58:athrow          
		}
	}

	private List valueForList(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #76  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #77  <Method void ArrayList()>
	//    7   13:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #83  <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            128
		{
			Object obj = ((Iterator) (list)).next();
	//   14   30:aload_1         
	//   15   31:invokeinterface #93  <Method Object Iterator.next()>
	//   16   36:astore_3        
			if(obj instanceof CacheReference)
	//*  17   37:aload_3         
	//*  18   38:instanceof      #95  <Class CacheReference>
	//*  19   41:ifeq            92
			{
				obj = ((Object) ((CacheReference)obj));
	//   20   44:aload_3         
	//   21   45:checkcast       #95  <Class CacheReference>
	//   22   48:astore_3        
				obj = ((Object) (readableCache.read(((CacheReference) (obj)).key(), cacheHeaders)));
	//   23   49:aload_0         
	//   24   50:getfield        #24  <Field ReadableStore readableCache>
	//   25   53:aload_3         
	//   26   54:invokevirtual   #98  <Method String CacheReference.key()>
	//   27   57:aload_0         
	//   28   58:getfield        #30  <Field CacheHeaders cacheHeaders>
	//   29   61:invokeinterface #104 <Method Record ReadableStore.read(String, CacheHeaders)>
	//   30   66:astore_3        
				if(obj != null)
	//*  31   67:aload_3         
	//*  32   68:ifnull          82
					((List) (arraylist)).add(obj);
	//   33   71:aload_2         
	//   34   72:aload_3         
	//   35   73:invokeinterface #108 <Method boolean List.add(Object)>
	//   36   78:pop             
				else
	//*  37   79:goto            21
					throw new IllegalStateException("Cache MISS: failed to find record in cache by reference");
	//   38   82:new             #110 <Class IllegalStateException>
	//   39   85:dup             
	//   40   86:ldc1            #112 <String "Cache MISS: failed to find record in cache by reference">
	//   41   88:invokespecial   #113 <Method void IllegalStateException(String)>
	//   42   91:athrow          
			} else
			if(obj instanceof List)
	//*  43   92:aload_3         
	//*  44   93:instanceof      #79  <Class List>
	//*  45   96:ifeq            117
				((List) (arraylist)).add(((Object) (valueForList((List)obj))));
	//   46   99:aload_2         
	//   47  100:aload_0         
	//   48  101:aload_3         
	//   49  102:checkcast       #79  <Class List>
	//   50  105:invokespecial   #115 <Method List valueForList(List)>
	//   51  108:invokeinterface #108 <Method boolean List.add(Object)>
	//   52  113:pop             
			else
	//*  53  114:goto            21
				((List) (arraylist)).add(obj);
	//   54  117:aload_2         
	//   55  118:aload_3         
	//   56  119:invokeinterface #108 <Method boolean List.add(Object)>
	//   57  124:pop             
		}

	//*  58  125:goto            21
		return ((List) (arraylist));
	//   59  128:aload_2         
	//   60  129:areturn         
	}

	private Record valueForObject(Record record, ResponseField responsefield)
	{
		CacheKey cachekey = cacheKeyResolver.fromFieldArguments(responsefield, variables);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field CacheKeyResolver cacheKeyResolver>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field com.apollographql.apollo.api.Operation$Variables variables>
	//    5    9:invokevirtual   #123 <Method CacheKey CacheKeyResolver.fromFieldArguments(ResponseField, com.apollographql.apollo.api.Operation$Variables)>
	//    6   12:astore_3        
		if(!cachekey.equals(((Object) (CacheKey.NO_KEY))))
	//*   7   13:aload_3         
	//*   8   14:getstatic       #129 <Field CacheKey CacheKey.NO_KEY>
	//*   9   17:invokevirtual   #132 <Method boolean CacheKey.equals(Object)>
	//*  10   20:ifne            38
			record = ((Record) (new CacheReference(cachekey.key())));
	//   11   23:new             #95  <Class CacheReference>
	//   12   26:dup             
	//   13   27:aload_3         
	//   14   28:invokevirtual   #133 <Method String CacheKey.key()>
	//   15   31:invokespecial   #134 <Method void CacheReference(String)>
	//   16   34:astore_1        
		else
	//*  17   35:goto            48
			record = ((Record) ((CacheReference)fieldValue(record, responsefield)));
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokespecial   #136 <Method Object fieldValue(Record, ResponseField)>
	//   22   44:checkcast       #95  <Class CacheReference>
	//   23   47:astore_1        
		if(record != null)
	//*  24   48:aload_1         
	//*  25   49:ifnull          86
		{
			record = readableCache.read(((CacheReference) (record)).key(), cacheHeaders);
	//   26   52:aload_0         
	//   27   53:getfield        #24  <Field ReadableStore readableCache>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #98  <Method String CacheReference.key()>
	//   30   60:aload_0         
	//   31   61:getfield        #30  <Field CacheHeaders cacheHeaders>
	//   32   64:invokeinterface #104 <Method Record ReadableStore.read(String, CacheHeaders)>
	//   33   69:astore_1        
			if(record != null)
	//*  34   70:aload_1         
	//*  35   71:ifnull          76
				return record;
	//   36   74:aload_1         
	//   37   75:areturn         
			else
				throw new IllegalStateException("Cache MISS: failed to find record in cache by reference");
	//   38   76:new             #110 <Class IllegalStateException>
	//   39   79:dup             
	//   40   80:ldc1            #112 <String "Cache MISS: failed to find record in cache by reference">
	//   41   82:invokespecial   #113 <Method void IllegalStateException(String)>
	//   42   85:athrow          
		} else
		{
			return null;
	//   43   86:aconst_null     
	//   44   87:areturn         
		}
	}

	public Object valueFor(Record record, ResponseField responsefield)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$apollographql$apollo$api$ResponseField$Type[];

			static 
			{
				$SwitchMap$com$apollographql$apollo$api$ResponseField$Type = new int[com.apollographql.apollo.api.ResponseField.Type.values().length];
			//    0    0:invokestatic    #18  <Method com.apollographql.apollo.api.ResponseField$Type[] com.apollographql.apollo.api.ResponseField$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
				try
				{
					$SwitchMap$com$apollographql$apollo$api$ResponseField$Type[com.apollographql.apollo.api.ResponseField.Type.OBJECT.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
			//    5   12:getstatic       #24  <Field com.apollographql.apollo.api.ResponseField$Type com.apollographql.apollo.api.ResponseField$Type.OBJECT>
			//    6   15:invokevirtual   #28  <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
			//*  10   23:getstatic       #31  <Field com.apollographql.apollo.api.ResponseField$Type com.apollographql.apollo.api.ResponseField$Type.LIST>
			//*  11   26:invokevirtual   #28  <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$api$ResponseField$Type[com.apollographql.apollo.api.ResponseField.Type.LIST.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.com.apollographql.apollo.api.ResponseField.Type[responsefield.type().ordinal()])
	//*   0    0:getstatic       #141 <Field int[] CacheFieldValueResolver$1.$SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #145 <Method com.apollographql.apollo.api.ResponseField$Type ResponseField.type()>
	//*   3    7:invokevirtual   #151 <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 2: default 32
	//	               1 53
	//	               2 39
		default:
			return fieldValue(record, responsefield);
	//    6   32:aload_0         
	//    7   33:aload_1         
	//    8   34:aload_2         
	//    9   35:invokespecial   #136 <Method Object fieldValue(Record, ResponseField)>
	//   10   38:areturn         

		case 2: // '\002'
			return ((Object) (valueForList((List)fieldValue(record, responsefield))));
	//   11   39:aload_0         
	//   12   40:aload_0         
	//   13   41:aload_1         
	//   14   42:aload_2         
	//   15   43:invokespecial   #136 <Method Object fieldValue(Record, ResponseField)>
	//   16   46:checkcast       #79  <Class List>
	//   17   49:invokespecial   #115 <Method List valueForList(List)>
	//   18   52:areturn         

		case 1: // '\001'
			return ((Object) (valueForObject(record, responsefield)));
	//   19   53:aload_0         
	//   20   54:aload_1         
	//   21   55:aload_2         
	//   22   56:invokespecial   #153 <Method Record valueForObject(Record, ResponseField)>
	//   23   59:areturn         
		}
	}

	public volatile Object valueFor(Object obj, ResponseField responsefield)
	{
		return valueFor((Record)obj, responsefield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class Record>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #156 <Method Object valueFor(Record, ResponseField)>
	//    5    9:areturn         
	}

	private final CacheHeaders cacheHeaders;
	private final CacheKeyResolver cacheKeyResolver;
	private final ReadableStore readableCache;
	private final com.apollographql.apollo.api.Operation.Variables variables;
}
