// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			Model, RetrievalAdapter

abstract class NoModificationModel
	implements Model
{
	static class InvalidSqlViewOperationException extends RuntimeException
	{

		InvalidSqlViewOperationException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
		//    3    5:return          
		}
	}


	NoModificationModel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public void delete()
	{
		throw new InvalidSqlViewOperationException((new StringBuilder()).append("View ").append(((Object)this).getClass().getName()).append(" is not deleteable").toString());
	//    0    0:new             #8   <Class NoModificationModel$InvalidSqlViewOperationException>
	//    1    3:dup             
	//    2    4:new             #17  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void StringBuilder()>
	//    5   11:ldc1            #20  <String "View ">
	//    6   13:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #28  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #34  <Method String Class.getName()>
	//   10   23:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #36  <String " is not deleteable">
	//   12   28:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #42  <Method void NoModificationModel$InvalidSqlViewOperationException(String)>
	//   15   37:athrow          
	}

	public boolean exists()
	{
		return getRetrievalAdapter().exists(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method RetrievalAdapter getRetrievalAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #53  <Method boolean RetrievalAdapter.exists(Object)>
	//    4    8:ireturn         
	}

	public boolean exists(DatabaseWrapper databasewrapper)
	{
		return getRetrievalAdapter().exists(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method RetrievalAdapter getRetrievalAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #57  <Method boolean RetrievalAdapter.exists(Object, DatabaseWrapper)>
	//    5    9:ireturn         
	}

	abstract RetrievalAdapter getRetrievalAdapter();

	public long insert()
	{
		throw new InvalidSqlViewOperationException((new StringBuilder()).append("View ").append(((Object)this).getClass().getName()).append(" is not insertable").toString());
	//    0    0:new             #8   <Class NoModificationModel$InvalidSqlViewOperationException>
	//    1    3:dup             
	//    2    4:new             #17  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void StringBuilder()>
	//    5   11:ldc1            #20  <String "View ">
	//    6   13:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #28  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #34  <Method String Class.getName()>
	//   10   23:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #61  <String " is not insertable">
	//   12   28:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #42  <Method void NoModificationModel$InvalidSqlViewOperationException(String)>
	//   15   37:athrow          
	}

	public void load()
	{
		getRetrievalAdapter().load(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method RetrievalAdapter getRetrievalAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #65  <Method void RetrievalAdapter.load(Object)>
	//    4    8:return          
	}

	public void load(DatabaseWrapper databasewrapper)
	{
		getRetrievalAdapter().load(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method RetrievalAdapter getRetrievalAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #69  <Method void RetrievalAdapter.load(Object, DatabaseWrapper)>
	//    5    9:return          
	}

	public void save()
	{
		throw new InvalidSqlViewOperationException((new StringBuilder()).append("View ").append(((Object)this).getClass().getName()).append(" is not saveable").toString());
	//    0    0:new             #8   <Class NoModificationModel$InvalidSqlViewOperationException>
	//    1    3:dup             
	//    2    4:new             #17  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void StringBuilder()>
	//    5   11:ldc1            #20  <String "View ">
	//    6   13:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #28  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #34  <Method String Class.getName()>
	//   10   23:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #72  <String " is not saveable">
	//   12   28:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #42  <Method void NoModificationModel$InvalidSqlViewOperationException(String)>
	//   15   37:athrow          
	}

	public void update()
	{
		throw new InvalidSqlViewOperationException((new StringBuilder()).append("View ").append(((Object)this).getClass().getName()).append(" is not updateable").toString());
	//    0    0:new             #8   <Class NoModificationModel$InvalidSqlViewOperationException>
	//    1    3:dup             
	//    2    4:new             #17  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void StringBuilder()>
	//    5   11:ldc1            #20  <String "View ">
	//    6   13:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #28  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #34  <Method String Class.getName()>
	//   10   23:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #75  <String " is not updateable">
	//   12   28:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #42  <Method void NoModificationModel$InvalidSqlViewOperationException(String)>
	//   15   37:athrow          
	}
}
