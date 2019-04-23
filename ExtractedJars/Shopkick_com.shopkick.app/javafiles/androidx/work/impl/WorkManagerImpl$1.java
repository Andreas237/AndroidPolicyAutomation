// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import androidx.work.impl.utils.Preferences;
import androidx.work.impl.utils.futures.SettableFuture;

// Referenced classes of package androidx.work.impl:
//			WorkManagerImpl

class WorkManagerImpl$1
	implements Runnable
{

	public void run()
	{
		try
		{
			val$future.set(((Object) (Long.valueOf(val$preferences.getLastCancelAllTimeMillis()))));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SettableFuture val$future>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Preferences val$preferences>
	//    4    8:invokevirtual   #37  <Method long Preferences.getLastCancelAllTimeMillis()>
	//    5   11:invokestatic    #43  <Method Long Long.valueOf(long)>
	//    6   14:invokevirtual   #49  <Method boolean SettableFuture.set(Object)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			val$future.setException(throwable);
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field SettableFuture val$future>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #53  <Method boolean SettableFuture.setException(Throwable)>
	//   14   28:pop             
		}
	//   15   29:return          
	}

	final WorkManagerImpl this$0;
	final SettableFuture val$future;
	final Preferences val$preferences;

	WorkManagerImpl$1()
	{
		this$0 = final_workmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field WorkManagerImpl this$0>
		val$future = settablefuture;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field SettableFuture val$future>
		val$preferences = Preferences.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Preferences val$preferences>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
