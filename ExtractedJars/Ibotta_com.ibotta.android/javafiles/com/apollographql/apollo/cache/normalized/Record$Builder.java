// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Utils;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			Record

public static class Record$Builder
{

	public Record$Builder addField(String s, Object obj)
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

	public Record$Builder mutationId(UUID uuid)
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

	public Record$Builder(String s, Map map, UUID uuid)
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
