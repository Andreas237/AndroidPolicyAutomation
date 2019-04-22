// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.internal.Utils;
import java.util.concurrent.ConcurrentHashMap;

public final class ResponseFieldMapperFactory
{

	public ResponseFieldMapperFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #16  <Field ConcurrentHashMap pool>
	//    7   15:return          
	}

	public ResponseFieldMapper create(Operation operation)
	{
		Utils.checkNotNull(((Object) (operation)), "operation == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "operation == null">
	//    2    3:invokestatic    #28  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		Class class1 = ((Object) (operation)).getClass();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #32  <Method Class Object.getClass()>
	//    6   11:astore_2        
		ResponseFieldMapper responsefieldmapper = (ResponseFieldMapper)pool.get(((Object) (class1)));
	//    7   12:aload_0         
	//    8   13:getfield        #16  <Field ConcurrentHashMap pool>
	//    9   16:aload_2         
	//   10   17:invokevirtual   #36  <Method Object ConcurrentHashMap.get(Object)>
	//   11   20:checkcast       #38  <Class ResponseFieldMapper>
	//   12   23:astore_3        
		if(responsefieldmapper != null)
	//*  13   24:aload_3         
	//*  14   25:ifnull          30
		{
			return responsefieldmapper;
	//   15   28:aload_3         
	//   16   29:areturn         
		} else
		{
			pool.putIfAbsent(((Object) (class1)), ((Object) (operation.responseFieldMapper())));
	//   17   30:aload_0         
	//   18   31:getfield        #16  <Field ConcurrentHashMap pool>
	//   19   34:aload_2         
	//   20   35:aload_1         
	//   21   36:invokeinterface #44  <Method ResponseFieldMapper Operation.responseFieldMapper()>
	//   22   41:invokevirtual   #47  <Method Object ConcurrentHashMap.putIfAbsent(Object, Object)>
	//   23   44:pop             
			return (ResponseFieldMapper)pool.get(((Object) (class1)));
	//   24   45:aload_0         
	//   25   46:getfield        #16  <Field ConcurrentHashMap pool>
	//   26   49:aload_2         
	//   27   50:invokevirtual   #36  <Method Object ConcurrentHashMap.get(Object)>
	//   28   53:checkcast       #38  <Class ResponseFieldMapper>
	//   29   56:areturn         
		}
	}

	private final ConcurrentHashMap pool = new ConcurrentHashMap();
}
