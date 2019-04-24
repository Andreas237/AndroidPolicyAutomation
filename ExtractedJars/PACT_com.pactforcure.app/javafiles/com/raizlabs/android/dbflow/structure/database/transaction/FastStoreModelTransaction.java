// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.structure.InternalAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ITransaction

public class FastStoreModelTransaction
	implements ITransaction
{
	public static final class Builder
	{

		public Builder add(Object obj)
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

		public Builder addAll(Collection collection)
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

		public final transient Builder addAll(Object aobj[])
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
		private final ProcessModelList processModelList;


/*
		static ProcessModelList access$000(Builder builder)
		{
			return builder.processModelList;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field FastStoreModelTransaction$ProcessModelList processModelList>
		//    2    4:areturn         
		}

*/


/*
		static InternalAdapter access$100(Builder builder)
		{
			return builder.internalAdapter;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field InternalAdapter internalAdapter>
		//    2    4:areturn         
		}

*/

		Builder(ProcessModelList processmodellist, InternalAdapter internaladapter)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			models = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #25  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void ArrayList()>
		//    6   12:putfield        #28  <Field List models>
			processModelList = processmodellist;
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

	static interface ProcessModelList
	{

		public abstract void processModel(List list, InternalAdapter internaladapter, DatabaseWrapper databasewrapper);
	}


	FastStoreModelTransaction(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		models = builder.models;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #35  <Field List FastStoreModelTransaction$Builder.models>
	//    5    9:putfield        #36  <Field List models>
		processModelList = builder.processModelList;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #40  <Method FastStoreModelTransaction$ProcessModelList FastStoreModelTransaction$Builder.access$000(FastStoreModelTransaction$Builder)>
	//    9   17:putfield        #42  <Field FastStoreModelTransaction$ProcessModelList processModelList>
		internalAdapter = builder.internalAdapter;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #46  <Method InternalAdapter FastStoreModelTransaction$Builder.access$100(FastStoreModelTransaction$Builder)>
	//   13   25:putfield        #48  <Field InternalAdapter internalAdapter>
	//   14   28:return          
	}

	public static Builder insertBuilder(InternalAdapter internaladapter)
	{
		return new Builder(new ProcessModelList() {

			public void processModel(List list, InternalAdapter internaladapter1, DatabaseWrapper databasewrapper)
			{
				internaladapter1.insertAll(((Collection) (list)), databasewrapper);
			//    0    0:aload_2         
			//    1    1:aload_1         
			//    2    2:aload_3         
			//    3    3:invokeinterface #26  <Method void InternalAdapter.insertAll(Collection, DatabaseWrapper)>
			//    4    8:return          
			}

		}
, internaladapter);
	//    0    0:new             #15  <Class FastStoreModelTransaction$Builder>
	//    1    3:dup             
	//    2    4:new             #11  <Class FastStoreModelTransaction$2>
	//    3    7:dup             
	//    4    8:invokespecial   #55  <Method void FastStoreModelTransaction$2()>
	//    5   11:aload_0         
	//    6   12:invokespecial   #58  <Method void FastStoreModelTransaction$Builder(FastStoreModelTransaction$ProcessModelList, InternalAdapter)>
	//    7   15:areturn         
	}

	public static Builder saveBuilder(InternalAdapter internaladapter)
	{
		return new Builder(new ProcessModelList() {

			public void processModel(List list, InternalAdapter internaladapter1, DatabaseWrapper databasewrapper)
			{
				internaladapter1.saveAll(((Collection) (list)), databasewrapper);
			//    0    0:aload_2         
			//    1    1:aload_1         
			//    2    2:aload_3         
			//    3    3:invokeinterface #26  <Method void InternalAdapter.saveAll(Collection, DatabaseWrapper)>
			//    4    8:return          
			}

		}
, internaladapter);
	//    0    0:new             #15  <Class FastStoreModelTransaction$Builder>
	//    1    3:dup             
	//    2    4:new             #9   <Class FastStoreModelTransaction$1>
	//    3    7:dup             
	//    4    8:invokespecial   #62  <Method void FastStoreModelTransaction$1()>
	//    5   11:aload_0         
	//    6   12:invokespecial   #58  <Method void FastStoreModelTransaction$Builder(FastStoreModelTransaction$ProcessModelList, InternalAdapter)>
	//    7   15:areturn         
	}

	public static Builder updateBuilder(InternalAdapter internaladapter)
	{
		return new Builder(new ProcessModelList() {

			public void processModel(List list, InternalAdapter internaladapter1, DatabaseWrapper databasewrapper)
			{
				internaladapter1.updateAll(((Collection) (list)), databasewrapper);
			//    0    0:aload_2         
			//    1    1:aload_1         
			//    2    2:aload_3         
			//    3    3:invokeinterface #26  <Method void InternalAdapter.updateAll(Collection, DatabaseWrapper)>
			//    4    8:return          
			}

		}
, internaladapter);
	//    0    0:new             #15  <Class FastStoreModelTransaction$Builder>
	//    1    3:dup             
	//    2    4:new             #13  <Class FastStoreModelTransaction$3>
	//    3    7:dup             
	//    4    8:invokespecial   #64  <Method void FastStoreModelTransaction$3()>
	//    5   11:aload_0         
	//    6   12:invokespecial   #58  <Method void FastStoreModelTransaction$Builder(FastStoreModelTransaction$ProcessModelList, InternalAdapter)>
	//    7   15:areturn         
	}

	public void execute(DatabaseWrapper databasewrapper)
	{
		if(models != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field List models>
	//*   2    4:ifnull          25
			processModelList.processModel(models, internalAdapter, databasewrapper);
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field FastStoreModelTransaction$ProcessModelList processModelList>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field List models>
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field InternalAdapter internalAdapter>
	//    9   19:aload_1         
	//   10   20:invokeinterface #70  <Method void FastStoreModelTransaction$ProcessModelList.processModel(List, InternalAdapter, DatabaseWrapper)>
	//   11   25:return          
	}

	final InternalAdapter internalAdapter;
	final List models;
	final ProcessModelList processModelList;
}
