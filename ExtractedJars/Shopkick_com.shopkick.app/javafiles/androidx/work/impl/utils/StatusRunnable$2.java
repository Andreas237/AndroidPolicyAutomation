// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;
import java.util.UUID;

// Referenced classes of package androidx.work.impl.utils:
//			StatusRunnable

static final class StatusRunnable$2 extends StatusRunnable
{

	WorkInfo runInternal()
	{
		androidx.work.impl.model.Pojo pojo = val$workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(val$id.toString());
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field WorkManagerImpl val$workManager>
	//    2    4:invokevirtual   #30  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:invokevirtual   #36  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field UUID val$id>
	//    6   14:invokevirtual   #42  <Method String UUID.toString()>
	//    7   17:invokeinterface #48  <Method androidx.work.impl.model.WorkSpec$WorkInfoPojo WorkSpecDao.getWorkStatusPojoForId(String)>
	//    8   22:astore_1        
		if(pojo != null)
	//*   9   23:aload_1         
	//*  10   24:ifnull          32
			return pojo.toWorkInfo();
	//   11   27:aload_1         
	//   12   28:invokevirtual   #53  <Method WorkInfo androidx.work.impl.model.WorkSpec$WorkInfoPojo.toWorkInfo()>
	//   13   31:areturn         
		else
			return null;
	//   14   32:aconst_null     
	//   15   33:areturn         
	}

	volatile Object runInternal()
	{
		return ((Object) (runInternal()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method WorkInfo runInternal()>
	//    2    4:areturn         
	}

	final UUID val$id;
	final WorkManagerImpl val$workManager;

	StatusRunnable$2(WorkManagerImpl workmanagerimpl, UUID uuid)
	{
		val$workManager = workmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field WorkManagerImpl val$workManager>
		val$id = uuid;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field UUID val$id>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void StatusRunnable()>
	//    8   14:return          
	}
}
