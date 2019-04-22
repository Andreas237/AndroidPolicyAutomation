// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.cache.normalized.*;
import com.apollographql.apollo.internal.response.ResolveDelegate;
import com.apollographql.apollo.internal.util.SimpleStack;
import java.util.*;

public abstract class ResponseNormalizer
	implements ResolveDelegate
{

	public ResponseNormalizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		recordSet = new RecordSet();
	//    2    4:aload_0         
	//    3    5:new             #39  <Class RecordSet>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void RecordSet()>
	//    6   12:putfield        #42  <Field RecordSet recordSet>
		dependentKeys = Collections.emptySet();
	//    7   15:aload_0         
	//    8   16:invokestatic    #48  <Method Set Collections.emptySet()>
	//    9   19:putfield        #50  <Field Set dependentKeys>
	//   10   22:return          
	}

	private String pathToString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_3        
		int j = path.size();
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field List path>
	//    6   12:invokeinterface #63  <Method int List.size()>
	//    7   17:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   18:iconst_0        
	//*   9   19:istore_1        
	//*  10   20:iload_1         
	//*  11   21:iload_2         
	//*  12   22:icmpge          64
		{
			stringbuilder.append((String)path.get(i));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getfield        #57  <Field List path>
	//   16   30:iload_1         
	//   17   31:invokeinterface #67  <Method Object List.get(int)>
	//   18   36:checkcast       #69  <Class String>
	//   19   39:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			if(i < j - 1)
	//*  21   43:iload_1         
	//*  22   44:iload_2         
	//*  23   45:iconst_1        
	//*  24   46:isub            
	//*  25   47:icmpge          57
				stringbuilder.append(".");
	//   26   50:aload_3         
	//   27   51:ldc1            #75  <String ".">
	//   28   53:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		}

	//   30   57:iload_1         
	//   31   58:iconst_1        
	//   32   59:iadd            
	//   33   60:istore_1        
	//*  34   61:goto            20
		return stringbuilder.toString();
	//   35   64:aload_3         
	//   36   65:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   37   68:areturn         
	}

	public Set dependentKeys()
	{
		return dependentKeys;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Set dependentKeys>
	//    2    4:areturn         
	}

	public void didResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables)
	{
		Object obj = ((Object) (path));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List path>
	//    2    4:astore_3        
		((List) (obj)).remove(((List) (obj)).size() - 1);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:invokeinterface #63  <Method int List.size()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:invokeinterface #85  <Method Object List.remove(int)>
	//    9   19:pop             
		obj = valueStack.pop();
	//   10   20:aload_0         
	//   11   21:getfield        #87  <Field SimpleStack valueStack>
	//   12   24:invokevirtual   #93  <Method Object SimpleStack.pop()>
	//   13   27:astore_3        
		responsefield = ((ResponseField) (responsefield.cacheKey(variables)));
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #99  <Method String ResponseField.cacheKey(com.apollographql.apollo.api.Operation$Variables)>
	//   17   33:astore_1        
		variables = ((com.apollographql.apollo.api.Operation.Variables) (new StringBuilder()));
	//   18   34:new             #54  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #55  <Method void StringBuilder()>
	//   21   41:astore_2        
		((StringBuilder) (variables)).append(currentRecordBuilder.key());
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:getfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
	//   25   47:invokevirtual   #106 <Method String com.apollographql.apollo.cache.normalized.Record$Builder.key()>
	//   26   50:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
		((StringBuilder) (variables)).append(".");
	//   28   54:aload_2         
	//   29   55:ldc1            #75  <String ".">
	//   30   57:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		((StringBuilder) (variables)).append(((String) (responsefield)));
	//   32   61:aload_2         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		variables = ((com.apollographql.apollo.api.Operation.Variables) (((StringBuilder) (variables)).toString()));
	//   36   67:aload_2         
	//   37   68:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   38   71:astore_2        
		dependentKeys.add(((Object) (variables)));
	//   39   72:aload_0         
	//   40   73:getfield        #50  <Field Set dependentKeys>
	//   41   76:aload_2         
	//   42   77:invokeinterface #112 <Method boolean Set.add(Object)>
	//   43   82:pop             
		currentRecordBuilder.addField(((String) (responsefield)), obj);
	//   44   83:aload_0         
	//   45   84:getfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
	//   46   87:aload_1         
	//   47   88:aload_3         
	//   48   89:invokevirtual   #116 <Method com.apollographql.apollo.cache.normalized.Record$Builder com.apollographql.apollo.cache.normalized.Record$Builder.addField(String, Object)>
	//   49   92:pop             
		if(recordStack.isEmpty())
	//*  50   93:aload_0         
	//*  51   94:getfield        #118 <Field SimpleStack recordStack>
	//*  52   97:invokevirtual   #122 <Method boolean SimpleStack.isEmpty()>
	//*  53  100:ifeq            118
			recordSet.merge(currentRecordBuilder.build());
	//   54  103:aload_0         
	//   55  104:getfield        #42  <Field RecordSet recordSet>
	//   56  107:aload_0         
	//   57  108:getfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
	//   58  111:invokevirtual   #126 <Method Record com.apollographql.apollo.cache.normalized.Record$Builder.build()>
	//   59  114:invokevirtual   #130 <Method Set RecordSet.merge(Record)>
	//   60  117:pop             
	//   61  118:return          
	}

	public void didResolveElement(int i)
	{
		List list = path;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List path>
	//    2    4:astore_2        
		list.remove(list.size() - 1);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokeinterface #63  <Method int List.size()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:invokeinterface #85  <Method Object List.remove(int)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void didResolveList(List list)
	{
		ArrayList arraylist = new ArrayList(list.size());
	//    0    0:new             #136 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #63  <Method int List.size()>
	//    4   10:invokespecial   #138 <Method void ArrayList(int)>
	//    5   13:astore          4
		int j = list.size();
	//    6   15:aload_1         
	//    7   16:invokeinterface #63  <Method int List.size()>
	//    8   21:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   22:iconst_0        
	//*  10   23:istore_2        
	//*  11   24:iload_2         
	//*  12   25:iload_3         
	//*  13   26:icmpge          51
			((List) (arraylist)).add(0, valueStack.pop());
	//   14   29:aload           4
	//   15   31:iconst_0        
	//   16   32:aload_0         
	//   17   33:getfield        #87  <Field SimpleStack valueStack>
	//   18   36:invokevirtual   #93  <Method Object SimpleStack.pop()>
	//   19   39:invokeinterface #141 <Method void List.add(int, Object)>

	//   20   44:iload_2         
	//   21   45:iconst_1        
	//   22   46:iadd            
	//   23   47:istore_2        
	//*  24   48:goto            24
		valueStack.push(((Object) (arraylist)));
	//   25   51:aload_0         
	//   26   52:getfield        #87  <Field SimpleStack valueStack>
	//   27   55:aload           4
	//   28   57:invokevirtual   #145 <Method void SimpleStack.push(Object)>
	//   29   60:return          
	}

	public void didResolveNull()
	{
		valueStack.push(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field SimpleStack valueStack>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #145 <Method void SimpleStack.push(Object)>
	//    4    8:return          
	}

	public void didResolveObject(ResponseField responsefield, Optional optional)
	{
		path = (List)pathStack.pop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #150 <Field SimpleStack pathStack>
	//    3    5:invokevirtual   #93  <Method Object SimpleStack.pop()>
	//    4    8:checkcast       #59  <Class List>
	//    5   11:putfield        #57  <Field List path>
		if(optional.isPresent())
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #155 <Method boolean Optional.isPresent()>
	//*   8   18:ifeq            70
		{
			responsefield = ((ResponseField) (currentRecordBuilder.build()));
	//    9   21:aload_0         
	//   10   22:getfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
	//   11   25:invokevirtual   #126 <Method Record com.apollographql.apollo.cache.normalized.Record$Builder.build()>
	//   12   28:astore_1        
			valueStack.push(((Object) (new CacheReference(((Record) (responsefield)).key()))));
	//   13   29:aload_0         
	//   14   30:getfield        #87  <Field SimpleStack valueStack>
	//   15   33:new             #157 <Class CacheReference>
	//   16   36:dup             
	//   17   37:aload_1         
	//   18   38:invokevirtual   #160 <Method String Record.key()>
	//   19   41:invokespecial   #163 <Method void CacheReference(String)>
	//   20   44:invokevirtual   #145 <Method void SimpleStack.push(Object)>
			dependentKeys.add(((Object) (((Record) (responsefield)).key())));
	//   21   47:aload_0         
	//   22   48:getfield        #50  <Field Set dependentKeys>
	//   23   51:aload_1         
	//   24   52:invokevirtual   #160 <Method String Record.key()>
	//   25   55:invokeinterface #112 <Method boolean Set.add(Object)>
	//   26   60:pop             
			recordSet.merge(((Record) (responsefield)));
	//   27   61:aload_0         
	//   28   62:getfield        #42  <Field RecordSet recordSet>
	//   29   65:aload_1         
	//   30   66:invokevirtual   #130 <Method Set RecordSet.merge(Record)>
	//   31   69:pop             
		}
		currentRecordBuilder = ((Record)recordStack.pop()).toBuilder();
	//   32   70:aload_0         
	//   33   71:aload_0         
	//   34   72:getfield        #118 <Field SimpleStack recordStack>
	//   35   75:invokevirtual   #93  <Method Object SimpleStack.pop()>
	//   36   78:checkcast       #159 <Class Record>
	//   37   81:invokevirtual   #167 <Method com.apollographql.apollo.cache.normalized.Record$Builder Record.toBuilder()>
	//   38   84:putfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
	//   39   87:return          
	}

	public void didResolveScalar(Object obj)
	{
		valueStack.push(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field SimpleStack valueStack>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method void SimpleStack.push(Object)>
	//    4    8:return          
	}

	public Collection records()
	{
		return recordSet.allRecords();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field RecordSet recordSet>
	//    2    4:invokevirtual   #176 <Method Collection RecordSet.allRecords()>
	//    3    7:areturn         
	}

	public abstract CacheKey resolveCacheKey(ResponseField responsefield, Object obj);

	public void willResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables)
	{
		responsefield = ((ResponseField) (responsefield.cacheKey(variables)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #99  <Method String ResponseField.cacheKey(com.apollographql.apollo.api.Operation$Variables)>
	//    3    5:astore_1        
		path.add(((Object) (responsefield)));
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field List path>
	//    6   10:aload_1         
	//    7   11:invokeinterface #182 <Method boolean List.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void willResolveElement(int i)
	{
		path.add(((Object) (Integer.toString(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List path>
	//    2    4:iload_1         
	//    3    5:invokestatic    #188 <Method String Integer.toString(int)>
	//    4    8:invokeinterface #182 <Method boolean List.add(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	public void willResolveObject(ResponseField responsefield, Optional optional)
	{
		pathStack.push(((Object) (path)));
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field SimpleStack pathStack>
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field List path>
	//    4    8:invokevirtual   #145 <Method void SimpleStack.push(Object)>
		if(optional.isPresent())
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #155 <Method boolean Optional.isPresent()>
	//*   7   15:ifeq            31
			responsefield = ((ResponseField) (resolveCacheKey(responsefield, optional.get())));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #191 <Method Object Optional.get()>
	//   12   24:invokevirtual   #193 <Method CacheKey resolveCacheKey(ResponseField, Object)>
	//   13   27:astore_1        
		else
	//*  14   28:goto            35
			responsefield = ((ResponseField) (CacheKey.NO_KEY));
	//   15   31:getstatic       #199 <Field CacheKey CacheKey.NO_KEY>
	//   16   34:astore_1        
		optional = ((Optional) (((CacheKey) (responsefield)).key()));
	//   17   35:aload_1         
	//   18   36:invokevirtual   #200 <Method String CacheKey.key()>
	//   19   39:astore_2        
		if(((CacheKey) (responsefield)).equals(((Object) (CacheKey.NO_KEY))))
	//*  20   40:aload_1         
	//*  21   41:getstatic       #199 <Field CacheKey CacheKey.NO_KEY>
	//*  22   44:invokevirtual   #203 <Method boolean CacheKey.equals(Object)>
	//*  23   47:ifeq            58
		{
			responsefield = ((ResponseField) (pathToString()));
	//   24   50:aload_0         
	//   25   51:invokespecial   #205 <Method String pathToString()>
	//   26   54:astore_1        
		} else
	//*  27   55:goto            82
		{
			path = ((List) (new ArrayList()));
	//   28   58:aload_0         
	//   29   59:new             #136 <Class ArrayList>
	//   30   62:dup             
	//   31   63:invokespecial   #206 <Method void ArrayList()>
	//   32   66:putfield        #57  <Field List path>
			path.add(((Object) (optional)));
	//   33   69:aload_0         
	//   34   70:getfield        #57  <Field List path>
	//   35   73:aload_2         
	//   36   74:invokeinterface #182 <Method boolean List.add(Object)>
	//   37   79:pop             
			responsefield = ((ResponseField) (optional));
	//   38   80:aload_2         
	//   39   81:astore_1        
		}
		recordStack.push(((Object) (currentRecordBuilder.build())));
	//   40   82:aload_0         
	//   41   83:getfield        #118 <Field SimpleStack recordStack>
	//   42   86:aload_0         
	//   43   87:getfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
	//   44   90:invokevirtual   #126 <Method Record com.apollographql.apollo.cache.normalized.Record$Builder.build()>
	//   45   93:invokevirtual   #145 <Method void SimpleStack.push(Object)>
		currentRecordBuilder = Record.builder(((String) (responsefield)));
	//   46   96:aload_0         
	//   47   97:aload_1         
	//   48   98:invokestatic    #210 <Method com.apollographql.apollo.cache.normalized.Record$Builder Record.builder(String)>
	//   49  101:putfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
	//   50  104:return          
	}

	void willResolveRecord(CacheKey cachekey)
	{
		pathStack = new SimpleStack();
	//    0    0:aload_0         
	//    1    1:new             #89  <Class SimpleStack>
	//    2    4:dup             
	//    3    5:invokespecial   #213 <Method void SimpleStack()>
	//    4    8:putfield        #150 <Field SimpleStack pathStack>
		recordStack = new SimpleStack();
	//    5   11:aload_0         
	//    6   12:new             #89  <Class SimpleStack>
	//    7   15:dup             
	//    8   16:invokespecial   #213 <Method void SimpleStack()>
	//    9   19:putfield        #118 <Field SimpleStack recordStack>
		valueStack = new SimpleStack();
	//   10   22:aload_0         
	//   11   23:new             #89  <Class SimpleStack>
	//   12   26:dup             
	//   13   27:invokespecial   #213 <Method void SimpleStack()>
	//   14   30:putfield        #87  <Field SimpleStack valueStack>
		dependentKeys = ((Set) (new HashSet()));
	//   15   33:aload_0         
	//   16   34:new             #215 <Class HashSet>
	//   17   37:dup             
	//   18   38:invokespecial   #216 <Method void HashSet()>
	//   19   41:putfield        #50  <Field Set dependentKeys>
		path = ((List) (new ArrayList()));
	//   20   44:aload_0         
	//   21   45:new             #136 <Class ArrayList>
	//   22   48:dup             
	//   23   49:invokespecial   #206 <Method void ArrayList()>
	//   24   52:putfield        #57  <Field List path>
		currentRecordBuilder = Record.builder(cachekey.key());
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #200 <Method String CacheKey.key()>
	//   28   60:invokestatic    #210 <Method com.apollographql.apollo.cache.normalized.Record$Builder Record.builder(String)>
	//   29   63:putfield        #101 <Field com.apollographql.apollo.cache.normalized.Record$Builder currentRecordBuilder>
		recordSet = new RecordSet();
	//   30   66:aload_0         
	//   31   67:new             #39  <Class RecordSet>
	//   32   70:dup             
	//   33   71:invokespecial   #40  <Method void RecordSet()>
	//   34   74:putfield        #42  <Field RecordSet recordSet>
	//   35   77:return          
	}

	public void willResolveRootQuery(Operation operation)
	{
		willResolveRecord(CacheKeyResolver.rootKeyForOperation(operation));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #224 <Method CacheKey CacheKeyResolver.rootKeyForOperation(Operation)>
	//    3    5:invokevirtual   #226 <Method void willResolveRecord(CacheKey)>
	//    4    8:return          
	}

	public static final ResponseNormalizer NO_OP_NORMALIZER = new ResponseNormalizer() {

		public Set dependentKeys()
		{
			return Collections.emptySet();
		//    0    0:invokestatic    #16  <Method Set Collections.emptySet()>
		//    1    3:areturn         
		}

		public void didResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables)
		{
		//    0    0:return          
		}

		public void didResolveElement(int i)
		{
		//    0    0:return          
		}

		public void didResolveList(List list)
		{
		//    0    0:return          
		}

		public void didResolveNull()
		{
		//    0    0:return          
		}

		public void didResolveObject(ResponseField responsefield, Optional optional)
		{
		//    0    0:return          
		}

		public void didResolveScalar(Object obj)
		{
		//    0    0:return          
		}

		public Collection records()
		{
			return ((Collection) (Collections.emptyList()));
		//    0    0:invokestatic    #35  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public CacheKey resolveCacheKey(ResponseField responsefield, Object obj)
		{
			return CacheKey.NO_KEY;
		//    0    0:getstatic       #45  <Field CacheKey CacheKey.NO_KEY>
		//    1    3:areturn         
		}

		public void willResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables)
		{
		//    0    0:return          
		}

		public void willResolveElement(int i)
		{
		//    0    0:return          
		}

		public void willResolveObject(ResponseField responsefield, Optional optional)
		{
		//    0    0:return          
		}

		public void willResolveRootQuery(Operation operation)
		{
		//    0    0:return          
		}

	}
;
	private com.apollographql.apollo.cache.normalized.Record.Builder currentRecordBuilder;
	private Set dependentKeys;
	private List path;
	private SimpleStack pathStack;
	private RecordSet recordSet;
	private SimpleStack recordStack;
	private SimpleStack valueStack;

	static 
	{
	//    0    0:new             #9   <Class ResponseNormalizer$1>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ResponseNormalizer$1()>
	//    3    7:putstatic       #35  <Field ResponseNormalizer NO_OP_NORMALIZER>
	//*   4   10:return          
	}
}
