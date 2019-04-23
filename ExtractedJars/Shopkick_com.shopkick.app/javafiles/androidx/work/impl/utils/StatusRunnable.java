// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.arch.core.util.Function;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

public abstract class StatusRunnable
	implements Runnable
{

	public StatusRunnable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method SettableFuture SettableFuture.create()>
	//    4    8:putfield        #34  <Field SettableFuture mFuture>
	//    5   11:return          
	}

	public static StatusRunnable forStringIds(WorkManagerImpl workmanagerimpl, List list)
	{
		return ((StatusRunnable) (new StatusRunnable(workmanagerimpl, list) {

			public volatile Object runInternal()
			{
				return ((Object) (runInternal()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #27  <Method List runInternal()>
			//    2    4:areturn         
			}

			public List runInternal()
			{
				List list1 = workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(ids);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field WorkManagerImpl val$workManager>
			//    2    4:invokevirtual   #33  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
			//    3    7:invokevirtual   #39  <Method WorkSpecDao WorkDatabase.workSpecDao()>
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field List val$ids>
			//    6   14:invokeinterface #45  <Method List WorkSpecDao.getWorkStatusPojoForIds(List)>
			//    7   19:astore_1        
				return (List)WorkSpec.WORK_INFO_MAPPER.apply(((Object) (list1)));
			//    8   20:getstatic       #51  <Field Function WorkSpec.WORK_INFO_MAPPER>
			//    9   23:aload_1         
			//   10   24:invokeinterface #57  <Method Object Function.apply(Object)>
			//   11   29:checkcast       #59  <Class List>
			//   12   32:areturn         
			}

			final List val$ids;
			final WorkManagerImpl val$workManager;

			
			{
				workManager = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WorkManagerImpl val$workManager>
				ids = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field List val$ids>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void StatusRunnable()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #9   <Class StatusRunnable$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #41  <Method void StatusRunnable$1(WorkManagerImpl, List)>
	//    5    9:areturn         
	}

	public static StatusRunnable forTag(WorkManagerImpl workmanagerimpl, String s)
	{
		return ((StatusRunnable) (new StatusRunnable(workmanagerimpl, s) {

			volatile Object runInternal()
			{
				return ((Object) (runInternal()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #27  <Method List runInternal()>
			//    2    4:areturn         
			}

			List runInternal()
			{
				List list = workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(tag);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field WorkManagerImpl val$workManager>
			//    2    4:invokevirtual   #33  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
			//    3    7:invokevirtual   #39  <Method WorkSpecDao WorkDatabase.workSpecDao()>
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field String val$tag>
			//    6   14:invokeinterface #45  <Method List WorkSpecDao.getWorkStatusPojoForTag(String)>
			//    7   19:astore_1        
				return (List)WorkSpec.WORK_INFO_MAPPER.apply(((Object) (list)));
			//    8   20:getstatic       #51  <Field Function WorkSpec.WORK_INFO_MAPPER>
			//    9   23:aload_1         
			//   10   24:invokeinterface #57  <Method Object Function.apply(Object)>
			//   11   29:checkcast       #59  <Class List>
			//   12   32:areturn         
			}

			final String val$tag;
			final WorkManagerImpl val$workManager;

			
			{
				workManager = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WorkManagerImpl val$workManager>
				tag = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field String val$tag>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void StatusRunnable()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #13  <Class StatusRunnable$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #49  <Method void StatusRunnable$3(WorkManagerImpl, String)>
	//    5    9:areturn         
	}

	public static StatusRunnable forUUID(WorkManagerImpl workmanagerimpl, UUID uuid)
	{
		return ((StatusRunnable) (new StatusRunnable(workmanagerimpl, uuid) {

			WorkInfo runInternal()
			{
				androidx.work.impl.model.WorkSpec.WorkInfoPojo workinfopojo = workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(id.toString());
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field WorkManagerImpl val$workManager>
			//    2    4:invokevirtual   #30  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
			//    3    7:invokevirtual   #36  <Method WorkSpecDao WorkDatabase.workSpecDao()>
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field UUID val$id>
			//    6   14:invokevirtual   #42  <Method String UUID.toString()>
			//    7   17:invokeinterface #48  <Method androidx.work.impl.model.WorkSpec$WorkInfoPojo WorkSpecDao.getWorkStatusPojoForId(String)>
			//    8   22:astore_1        
				if(workinfopojo != null)
			//*   9   23:aload_1         
			//*  10   24:ifnull          32
					return workinfopojo.toWorkInfo();
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

			
			{
				workManager = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WorkManagerImpl val$workManager>
				id = uuid;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field UUID val$id>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void StatusRunnable()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #11  <Class StatusRunnable$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #55  <Method void StatusRunnable$2(WorkManagerImpl, UUID)>
	//    5    9:areturn         
	}

	public static StatusRunnable forUniqueWork(WorkManagerImpl workmanagerimpl, String s)
	{
		return ((StatusRunnable) (new StatusRunnable(workmanagerimpl, s) {

			volatile Object runInternal()
			{
				return ((Object) (runInternal()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #27  <Method List runInternal()>
			//    2    4:areturn         
			}

			List runInternal()
			{
				List list = workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(name);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field WorkManagerImpl val$workManager>
			//    2    4:invokevirtual   #33  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
			//    3    7:invokevirtual   #39  <Method WorkSpecDao WorkDatabase.workSpecDao()>
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field String val$name>
			//    6   14:invokeinterface #45  <Method List WorkSpecDao.getWorkStatusPojoForName(String)>
			//    7   19:astore_1        
				return (List)WorkSpec.WORK_INFO_MAPPER.apply(((Object) (list)));
			//    8   20:getstatic       #51  <Field Function WorkSpec.WORK_INFO_MAPPER>
			//    9   23:aload_1         
			//   10   24:invokeinterface #57  <Method Object Function.apply(Object)>
			//   11   29:checkcast       #59  <Class List>
			//   12   32:areturn         
			}

			final String val$name;
			final WorkManagerImpl val$workManager;

			
			{
				workManager = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WorkManagerImpl val$workManager>
				name = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field String val$name>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void StatusRunnable()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #15  <Class StatusRunnable$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #58  <Method void StatusRunnable$4(WorkManagerImpl, String)>
	//    5    9:areturn         
	}

	public ListenableFuture getFuture()
	{
		return ((ListenableFuture) (mFuture));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field SettableFuture mFuture>
	//    2    4:areturn         
	}

	public void run()
	{
		try
		{
			Object obj = runInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method Object runInternal()>
	//    2    4:astore_1        
			mFuture.set(obj);
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field SettableFuture mFuture>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #72  <Method boolean SettableFuture.set(Object)>
	//    7   13:pop             
			return;
	//    8   14:return          
		}
		catch(Throwable throwable)
	//*   9   15:astore_1        
		{
			mFuture.setException(throwable);
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field SettableFuture mFuture>
	//   12   20:aload_1         
	//   13   21:invokevirtual   #76  <Method boolean SettableFuture.setException(Throwable)>
	//   14   24:pop             
		}
	//   15   25:return          
	}

	abstract Object runInternal();

	private final SettableFuture mFuture = SettableFuture.create();
}
