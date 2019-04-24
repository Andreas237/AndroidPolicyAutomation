// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			NoModificationModel, RetrievalAdapter

public abstract class BaseModelView extends NoModificationModel
{

	public BaseModelView()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void NoModificationModel()>
	//    2    4:return          
	}

	public volatile void delete()
	{
		super.delete();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NoModificationModel.delete()>
	//    2    4:return          
	}

	public volatile boolean exists()
	{
		return super.exists();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method boolean NoModificationModel.exists()>
	//    2    4:ireturn         
	}

	public volatile boolean exists(DatabaseWrapper databasewrapper)
	{
		return super.exists(databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method boolean NoModificationModel.exists(DatabaseWrapper)>
	//    3    5:ireturn         
	}

	public RetrievalAdapter getRetrievalAdapter()
	{
		if(adapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field RetrievalAdapter adapter>
	//*   2    4:ifnonnull       18
			adapter = ((RetrievalAdapter) (FlowManager.getModelViewAdapter(((Object)this).getClass())));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #31  <Method Class Object.getClass()>
	//    6   12:invokestatic    #37  <Method ModelViewAdapter FlowManager.getModelViewAdapter(Class)>
	//    7   15:putfield        #25  <Field RetrievalAdapter adapter>
		return adapter;
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field RetrievalAdapter adapter>
	//   10   22:areturn         
	}

	public volatile long insert()
	{
		return super.insert();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method long NoModificationModel.insert()>
	//    2    4:lreturn         
	}

	public volatile void load()
	{
		super.load();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void NoModificationModel.load()>
	//    2    4:return          
	}

	public volatile void load(DatabaseWrapper databasewrapper)
	{
		super.load(databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void NoModificationModel.load(DatabaseWrapper)>
	//    3    5:return          
	}

	public volatile void save()
	{
		super.save();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void NoModificationModel.save()>
	//    2    4:return          
	}

	public volatile void update()
	{
		super.update();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void NoModificationModel.update()>
	//    2    4:return          
	}

	private transient RetrievalAdapter adapter;
}
