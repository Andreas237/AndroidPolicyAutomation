// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.arch.core.util.Function;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;

// Referenced classes of package androidx.work.impl.utils:
//			StatusRunnable

static final class StatusRunnable$4 extends StatusRunnable
{

	volatile Object runInternal()
	{
		return ((Object) (runInternal()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method List runInternal()>
	//    2    4:areturn         
	}

	List runInternal()
	{
		List list = val$workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(val$name);
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

	StatusRunnable$4(WorkManagerImpl workmanagerimpl, String s)
	{
		val$workManager = workmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field WorkManagerImpl val$workManager>
		val$name = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field String val$name>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void StatusRunnable()>
	//    8   14:return          
	}
}
