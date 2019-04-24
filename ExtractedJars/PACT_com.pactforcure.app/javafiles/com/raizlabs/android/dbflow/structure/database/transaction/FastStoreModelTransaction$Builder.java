// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.structure.InternalAdapter;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			FastStoreModelTransaction

public static final class FastStoreModelTransaction$Builder
{

	public FastStoreModelTransaction$Builder add(Object obj)
	{
		models.add(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List models>
	//    2    4:aload_1         
	//    3    5:invokeinterface #47  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public FastStoreModelTransaction$Builder addAll(Collection collection)
	{
		if(collection != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			models.addAll(collection);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field List models>
	//    4    8:aload_1         
	//    5    9:invokeinterface #53  <Method boolean List.addAll(Collection)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final transient FastStoreModelTransaction$Builder addAll(Object aobj[])
	{
		models.addAll(((Collection) (Arrays.asList(aobj))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List models>
	//    2    4:aload_1         
	//    3    5:invokestatic    #62  <Method List Arrays.asList(Object[])>
	//    4    8:invokeinterface #53  <Method boolean List.addAll(Collection)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public FastStoreModelTransaction build()
	{
		return new FastStoreModelTransaction(this);
	//    0    0:new             #7   <Class FastStoreModelTransaction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method void FastStoreModelTransaction(FastStoreModelTransaction$Builder)>
	//    4    8:areturn         
	}

	private final InternalAdapter internalAdapter;
	List models;
	private final odelList processModelList;


/*
	static odelList access$000(FastStoreModelTransaction$Builder faststoremodeltransaction$builder)
	{
		return faststoremodeltransaction$builder.processModelList;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field FastStoreModelTransaction$ProcessModelList processModelList>
	//    2    4:areturn         
	}

*/


/*
	static InternalAdapter access$100(FastStoreModelTransaction$Builder faststoremodeltransaction$builder)
	{
		return faststoremodeltransaction$builder.internalAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InternalAdapter internalAdapter>
	//    2    4:areturn         
	}

*/

	FastStoreModelTransaction$Builder(odelList odellist, InternalAdapter internaladapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		models = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List models>
		processModelList = odellist;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #30  <Field FastStoreModelTransaction$ProcessModelList processModelList>
		internalAdapter = internaladapter;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #32  <Field InternalAdapter internalAdapter>
	//   13   25:return          
	}
}
