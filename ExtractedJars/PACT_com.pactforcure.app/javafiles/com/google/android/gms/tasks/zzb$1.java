// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			zzb, RuntimeExecutionException, Continuation, Task, 
//			zzh, TaskExecutors

class zzb$1
	implements Runnable
{

	public void run()
	{
		Object obj;
		try
		{
			obj = ((Object) ((Task)zzb.zza(zzbLw).then(zzbLu)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzb zzbLw>
	//    2    4:invokestatic    #34  <Method Continuation zzb.zza(zzb)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Task zzbLu>
	//    5   11:invokeinterface #40  <Method Object Continuation.then(Task)>
	//    6   16:checkcast       #42  <Class Task>
	//    7   19:astore_1        
		}
	//*   8   20:aload_1         
	//*   9   21:ifnonnull       95
	//*  10   24:aload_0         
	//*  11   25:getfield        #19  <Field zzb zzbLw>
	//*  12   28:new             #44  <Class NullPointerException>
	//*  13   31:dup             
	//*  14   32:ldc1            #46  <String "Continuation returned null">
	//*  15   34:invokespecial   #49  <Method void NullPointerException(String)>
	//*  16   37:invokevirtual   #53  <Method void zzb.onFailure(Exception)>
	//*  17   40:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  18   41:astore_1        
		{
			if(((RuntimeExecutionException) (obj)).getCause() instanceof Exception)
	//*  19   42:aload_1         
	//*  20   43:invokevirtual   #57  <Method Throwable RuntimeExecutionException.getCause()>
	//*  21   46:instanceof      #30  <Class Exception>
	//*  22   49:ifeq            70
			{
				zzb.zzb(zzbLw).setException((Exception)((RuntimeExecutionException) (obj)).getCause());
	//   23   52:aload_0         
	//   24   53:getfield        #19  <Field zzb zzbLw>
	//   25   56:invokestatic    #61  <Method zzh zzb.zzb(zzb)>
	//   26   59:aload_1         
	//   27   60:invokevirtual   #57  <Method Throwable RuntimeExecutionException.getCause()>
	//   28   63:checkcast       #30  <Class Exception>
	//   29   66:invokevirtual   #66  <Method void zzh.setException(Exception)>
				return;
	//   30   69:return          
			} else
			{
				zzb.zzb(zzbLw).setException(((Exception) (obj)));
	//   31   70:aload_0         
	//   32   71:getfield        #19  <Field zzb zzbLw>
	//   33   74:invokestatic    #61  <Method zzh zzb.zzb(zzb)>
	//   34   77:aload_1         
	//   35   78:invokevirtual   #66  <Method void zzh.setException(Exception)>
				return;
	//   36   81:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  37   82:astore_1        
		{
			zzb.zzb(zzbLw).setException(((Exception) (obj)));
	//   38   83:aload_0         
	//   39   84:getfield        #19  <Field zzb zzbLw>
	//   40   87:invokestatic    #61  <Method zzh zzb.zzb(zzb)>
	//   41   90:aload_1         
	//   42   91:invokevirtual   #66  <Method void zzh.setException(Exception)>
			return;
	//   43   94:return          
		}
		if(obj == null)
		{
			zzbLw.onFailure(((Exception) (new NullPointerException("Continuation returned null"))));
			return;
		} else
		{
			((Task) (obj)).addOnSuccessListener(TaskExecutors.zzbLG, ((OnSuccessListener) (zzbLw)));
	//   44   95:aload_1         
	//   45   96:getstatic       #72  <Field java.util.concurrent.Executor TaskExecutors.zzbLG>
	//   46   99:aload_0         
	//   47  100:getfield        #19  <Field zzb zzbLw>
	//   48  103:invokevirtual   #76  <Method Task Task.addOnSuccessListener(java.util.concurrent.Executor, OnSuccessListener)>
	//   49  106:pop             
			((Task) (obj)).addOnFailureListener(TaskExecutors.zzbLG, ((OnFailureListener) (zzbLw)));
	//   50  107:aload_1         
	//   51  108:getstatic       #72  <Field java.util.concurrent.Executor TaskExecutors.zzbLG>
	//   52  111:aload_0         
	//   53  112:getfield        #19  <Field zzb zzbLw>
	//   54  115:invokevirtual   #80  <Method Task Task.addOnFailureListener(java.util.concurrent.Executor, OnFailureListener)>
	//   55  118:pop             
			return;
	//   56  119:return          
		}
	}

	final Task zzbLu;
	final zzb zzbLw;

	zzb$1(zzb zzb1, Task task)
	{
		zzbLw = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzb zzbLw>
		zzbLu = task;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Task zzbLu>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
