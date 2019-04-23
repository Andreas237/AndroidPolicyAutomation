// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.impl.WorkManagerImpl;
import java.util.UUID;

// Referenced classes of package androidx.work.impl.utils:
//			CancelWorkRunnable

static final class CancelWorkRunnable$1 extends CancelWorkRunnable
{

	void runInternal()
	{
		cancel(val$workManagerImpl, val$id.toString());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field UUID val$id>
	//    5    9:invokevirtual   #29  <Method String UUID.toString()>
	//    6   12:invokevirtual   #33  <Method void cancel(WorkManagerImpl, String)>
		reschedulePendingWorkers(val$workManagerImpl);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
	//   10   20:invokevirtual   #37  <Method void reschedulePendingWorkers(WorkManagerImpl)>
	//   11   23:return          
	}

	final UUID val$id;
	final WorkManagerImpl val$workManagerImpl;

	CancelWorkRunnable$1(WorkManagerImpl workmanagerimpl, UUID uuid)
	{
		val$workManagerImpl = workmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WorkManagerImpl val$workManagerImpl>
		val$id = uuid;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field UUID val$id>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void CancelWorkRunnable()>
	//    8   14:return          
	}
}
