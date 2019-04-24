// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import co.touchlab.squeaky.db.SQLiteStatement;
import java.util.List;

// Referenced classes of package co.touchlab.squeaky.dao:
//			ModelDao

class ModelDao$2 extends ThreadLocal
{

	protected SQLiteStatement initialValue()
	{
		SQLiteStatement sqlitestatement = ModelDao.access$200(ModelDao.this);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ModelDao this$0>
	//    2    4:invokestatic    #23  <Method SQLiteStatement ModelDao.access$200(ModelDao)>
	//    3    7:astore_1        
		ModelDao.access$100(ModelDao.this).add(((Object) (sqlitestatement)));
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field ModelDao this$0>
	//    6   12:invokestatic    #27  <Method List ModelDao.access$100(ModelDao)>
	//    7   15:aload_1         
	//    8   16:invokeinterface #33  <Method boolean List.add(Object)>
	//    9   21:pop             
		return sqlitestatement;
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	protected volatile Object initialValue()
	{
		return ((Object) (initialValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method SQLiteStatement initialValue()>
	//    2    4:areturn         
	}

	final ModelDao this$0;

	ModelDao$2()
	{
		this$0 = ModelDao.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ModelDao this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void ThreadLocal()>
	//    5    9:return          
	}
}
