// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			NoModificationModel, QueryModelAdapter, RetrievalAdapter

public class BaseQueryModel extends NoModificationModel
{

	public BaseQueryModel()
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

	public boolean exists()
	{
		throw new NoModificationModel.InvalidSqlViewOperationException((new StringBuilder()).append("Query ").append(((Object)this).getClass().getName()).append(" does not exist as a table.It's a convenient representation of a complex SQLite query.").toString());
	//    0    0:new             #18  <Class NoModificationModel$InvalidSqlViewOperationException>
	//    1    3:dup             
	//    2    4:new             #20  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #21  <Method void StringBuilder()>
	//    5   11:ldc1            #23  <String "Query ">
	//    6   13:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #39  <Method String Class.getName()>
	//   10   23:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #41  <String " does not exist as a table.It's a convenient representation of a complex SQLite query.">
	//   12   28:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #47  <Method void NoModificationModel$InvalidSqlViewOperationException(String)>
	//   15   37:athrow          
	}

	public boolean exists(DatabaseWrapper databasewrapper)
	{
		return exists();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method boolean exists()>
	//    2    4:ireturn         
	}

	RetrievalAdapter getRetrievalAdapter()
	{
		if(adapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field QueryModelAdapter adapter>
	//*   2    4:ifnonnull       18
			adapter = FlowManager.getQueryModelAdapter(((Object)this).getClass());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #33  <Method Class Object.getClass()>
	//    6   12:invokestatic    #60  <Method QueryModelAdapter FlowManager.getQueryModelAdapter(Class)>
	//    7   15:putfield        #54  <Field QueryModelAdapter adapter>
		return ((RetrievalAdapter) (adapter));
	//    8   18:aload_0         
	//    9   19:getfield        #54  <Field QueryModelAdapter adapter>
	//   10   22:areturn         
	}

	public volatile long insert()
	{
		return super.insert();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method long NoModificationModel.insert()>
	//    2    4:lreturn         
	}

	public volatile void load()
	{
		super.load();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void NoModificationModel.load()>
	//    2    4:return          
	}

	public volatile void load(DatabaseWrapper databasewrapper)
	{
		super.load(databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void NoModificationModel.load(DatabaseWrapper)>
	//    3    5:return          
	}

	public volatile void save()
	{
		super.save();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void NoModificationModel.save()>
	//    2    4:return          
	}

	public volatile void update()
	{
		super.update();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void NoModificationModel.update()>
	//    2    4:return          
	}

	private transient QueryModelAdapter adapter;
}
