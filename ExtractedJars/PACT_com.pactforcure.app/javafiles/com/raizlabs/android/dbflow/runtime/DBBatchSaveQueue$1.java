// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.Model;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

// Referenced classes of package com.raizlabs.android.dbflow.runtime:
//			DBBatchSaveQueue

class DBBatchSaveQueue$1
	implements com.raizlabs.android.dbflow.structure.database.transaction.tion.ProcessModel
{

	public void processModel(Object obj)
	{
		if(obj instanceof Model)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class Model>
	//*   2    4:ifeq            17
			((Model)obj).save();
	//    3    7:aload_1         
	//    4    8:checkcast       #22  <Class Model>
	//    5   11:invokeinterface #25  <Method void Model.save()>
		else
	//*   6   16:return          
		if(obj != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          16
		{
			FlowManager.getModelAdapter(obj.getClass()).save(obj);
	//    9   21:aload_1         
	//   10   22:invokevirtual   #29  <Method Class Object.getClass()>
	//   11   25:invokestatic    #35  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #39  <Method void ModelAdapter.save(Object)>
			return;
	//   14   32:return          
		}
	}

	final DBBatchSaveQueue this$0;

	DBBatchSaveQueue$1()
	{
		this$0 = DBBatchSaveQueue.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DBBatchSaveQueue this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
