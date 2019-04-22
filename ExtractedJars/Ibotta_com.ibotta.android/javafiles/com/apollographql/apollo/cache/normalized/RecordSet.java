// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import java.util.*;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			Record

public final class RecordSet
{

	public RecordSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void LinkedHashMap()>
	//    6   12:putfield        #16  <Field Map recordMap>
	//    7   15:return          
	}

	public Collection allRecords()
	{
		return recordMap.values();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map recordMap>
	//    2    4:invokeinterface #24  <Method Collection Map.values()>
	//    3    9:areturn         
	}

	public Set merge(Record record)
	{
		Record record1 = (Record)recordMap.get(((Object) (record.key())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map recordMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method String Record.key()>
	//    4    8:invokeinterface #38  <Method Object Map.get(Object)>
	//    5   13:checkcast       #30  <Class Record>
	//    6   16:astore_2        
		if(record1 == null)
	//*   7   17:aload_2         
	//*   8   18:ifnonnull       40
		{
			recordMap.put(((Object) (record.key())), ((Object) (record)));
	//    9   21:aload_0         
	//   10   22:getfield        #16  <Field Map recordMap>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #34  <Method String Record.key()>
	//   13   29:aload_1         
	//   14   30:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   15   35:pop             
			return Collections.emptySet();
	//   16   36:invokestatic    #48  <Method Set Collections.emptySet()>
	//   17   39:areturn         
		} else
		{
			return record1.mergeWith(record);
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #51  <Method Set Record.mergeWith(Record)>
	//   21   45:areturn         
		}
	}

	private final Map recordMap = new LinkedHashMap();
}
