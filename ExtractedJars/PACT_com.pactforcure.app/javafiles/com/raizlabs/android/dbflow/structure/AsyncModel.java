// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.BaseAsyncObject;
import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;
import java.lang.ref.WeakReference;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			Model, ModelAdapter

public class AsyncModel extends BaseAsyncObject
	implements Model
{
	public static interface OnModelChangedListener
	{

		public abstract void onModelChanged(Object obj);
	}


	public AsyncModel(Object obj)
	{
		super(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method Class Object.getClass()>
	//    3    5:invokespecial   #41  <Method void BaseAsyncObject(Class)>
		model = obj;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #43  <Field Object model>
	//    7   13:return          
	}

	private ModelAdapter getModelAdapter()
	{
		if(modelAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field ModelAdapter modelAdapter>
	//*   2    4:ifnonnull       21
			modelAdapter = FlowManager.getModelAdapter(model.getClass());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field Object model>
	//    6   12:invokevirtual   #38  <Method Class Object.getClass()>
	//    7   15:invokestatic    #60  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//    8   18:putfield        #55  <Field ModelAdapter modelAdapter>
		return modelAdapter;
	//    9   21:aload_0         
	//   10   22:getfield        #55  <Field ModelAdapter modelAdapter>
	//   11   25:areturn         
	}

	public void delete()
	{
		executeTransaction(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().delete(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AsyncModel this$0>
			//    2    4:invokestatic    #27  <Method ModelAdapter AsyncModel.access$000(AsyncModel)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #31  <Method void ModelAdapter.delete(Object)>
			//    5   11:return          
			}

			final AsyncModel this$0;

			
			{
				this$0 = AsyncModel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AsyncModel this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)).add(model).build())));
	//    0    0:aload_0         
	//    1    1:new             #65  <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    2    4:dup             
	//    3    5:new             #11  <Class AsyncModel$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #68  <Method void AsyncModel$2(AsyncModel)>
	//    7   13:invokespecial   #71  <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field Object model>
	//   10   20:invokevirtual   #75  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   11   23:invokevirtual   #79  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   26:invokevirtual   #83  <Method void executeTransaction(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   29:return          
	}

	public boolean exists()
	{
		return getModelAdapter().exists(model);
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Object model>
	//    4    8:invokevirtual   #90  <Method boolean ModelAdapter.exists(Object)>
	//    5   11:ireturn         
	}

	public long insert()
	{
		executeTransaction(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().insert(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AsyncModel this$0>
			//    2    4:invokestatic    #28  <Method ModelAdapter AsyncModel.access$000(AsyncModel)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #33  <Method long ModelAdapter.insert(Object)>
			//    5   11:pop2            
			//    6   12:return          
			}

			final AsyncModel this$0;

			
			{
				this$0 = AsyncModel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AsyncModel this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
)).add(model).build())));
	//    0    0:aload_0         
	//    1    1:new             #65  <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    2    4:dup             
	//    3    5:new             #15  <Class AsyncModel$4>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #93  <Method void AsyncModel$4(AsyncModel)>
	//    7   13:invokespecial   #71  <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field Object model>
	//   10   20:invokevirtual   #75  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   11   23:invokevirtual   #79  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   26:invokevirtual   #83  <Method void executeTransaction(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
		return -1L;
	//   13   29:ldc2w           #94  <Long -1L>
	//   14   32:lreturn         
	}

	public void load()
	{
		executeTransaction(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().load(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AsyncModel this$0>
			//    2    4:invokestatic    #27  <Method ModelAdapter AsyncModel.access$000(AsyncModel)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #31  <Method void ModelAdapter.load(Object)>
			//    5   11:return          
			}

			final AsyncModel this$0;

			
			{
				this$0 = AsyncModel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AsyncModel this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)).add(model).build())));
	//    0    0:aload_0         
	//    1    1:new             #65  <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    2    4:dup             
	//    3    5:new             #17  <Class AsyncModel$5>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #97  <Method void AsyncModel$5(AsyncModel)>
	//    7   13:invokespecial   #71  <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field Object model>
	//   10   20:invokevirtual   #75  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   11   23:invokevirtual   #79  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   26:invokevirtual   #83  <Method void executeTransaction(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   29:return          
	}

	protected void onSuccess(Transaction transaction)
	{
		if(onModelChangedListener != null && onModelChangedListener.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field WeakReference onModelChangedListener>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field WeakReference onModelChangedListener>
	//*   5   11:invokevirtual   #107 <Method Object WeakReference.get()>
	//*   6   14:ifnull          36
			((OnModelChangedListener)onModelChangedListener.get()).onModelChanged(model);
	//    7   17:aload_0         
	//    8   18:getfield        #101 <Field WeakReference onModelChangedListener>
	//    9   21:invokevirtual   #107 <Method Object WeakReference.get()>
	//   10   24:checkcast       #19  <Class AsyncModel$OnModelChangedListener>
	//   11   27:aload_0         
	//   12   28:getfield        #43  <Field Object model>
	//   13   31:invokeinterface #110 <Method void AsyncModel$OnModelChangedListener.onModelChanged(Object)>
	//   14   36:return          
	}

	public void save()
	{
		executeTransaction(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().save(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AsyncModel this$0>
			//    2    4:invokestatic    #27  <Method ModelAdapter AsyncModel.access$000(AsyncModel)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #31  <Method void ModelAdapter.save(Object)>
			//    5   11:return          
			}

			final AsyncModel this$0;

			
			{
				this$0 = AsyncModel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AsyncModel this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)).add(model).build())));
	//    0    0:aload_0         
	//    1    1:new             #65  <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    2    4:dup             
	//    3    5:new             #9   <Class AsyncModel$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #112 <Method void AsyncModel$1(AsyncModel)>
	//    7   13:invokespecial   #71  <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field Object model>
	//   10   20:invokevirtual   #75  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   11   23:invokevirtual   #79  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   26:invokevirtual   #83  <Method void executeTransaction(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   29:return          
	}

	public void update()
	{
		executeTransaction(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().update(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AsyncModel this$0>
			//    2    4:invokestatic    #27  <Method ModelAdapter AsyncModel.access$000(AsyncModel)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #31  <Method void ModelAdapter.update(Object)>
			//    5   11:return          
			}

			final AsyncModel this$0;

			
			{
				this$0 = AsyncModel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AsyncModel this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)).add(model).build())));
	//    0    0:aload_0         
	//    1    1:new             #65  <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    2    4:dup             
	//    3    5:new             #13  <Class AsyncModel$3>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #114 <Method void AsyncModel$3(AsyncModel)>
	//    7   13:invokespecial   #71  <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field Object model>
	//   10   20:invokevirtual   #75  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   11   23:invokevirtual   #79  <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   26:invokevirtual   #83  <Method void executeTransaction(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   29:return          
	}

	public AsyncModel withListener(OnModelChangedListener onmodelchangedlistener)
	{
		onModelChangedListener = new WeakReference(((Object) (onmodelchangedlistener)));
	//    0    0:aload_0         
	//    1    1:new             #103 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #118 <Method void WeakReference(Object)>
	//    5    9:putfield        #101 <Field WeakReference onModelChangedListener>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	private final Object model;
	private ModelAdapter modelAdapter;
	private transient WeakReference onModelChangedListener;


/*
	static ModelAdapter access$000(AsyncModel asyncmodel)
	{
		return asyncmodel.getModelAdapter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method ModelAdapter getModelAdapter()>
	//    2    4:areturn         
	}

*/
}
