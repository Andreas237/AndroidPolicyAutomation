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
			obj = ((Object) ((Task)zzb.zza(zzbNt).then(zzbNr)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzb zzbNt>
	//    2    4:invokestatic    #34  <Method Continuation zzb.zza(zzb)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Task zzbNr>
	//    5   11:invokeinterface #40  <Method Object Continuation.then(Task)>
	//    6   16:checkcast       #42  <Class Task>
	//    7   19:astore_1        
		}
	//*   8   20:goto            77
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   9   23:astore_1        
		{
			if(((RuntimeExecutionException) (obj)).getCause() instanceof Exception)
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #46  <Method Throwable RuntimeExecutionException.getCause()>
	//*  12   28:instanceof      #30  <Class Exception>
	//*  13   31:ifeq            52
			{
				zzb.zzb(zzbNt).setException((Exception)((RuntimeExecutionException) (obj)).getCause());
	//   14   34:aload_0         
	//   15   35:getfield        #19  <Field zzb zzbNt>
	//   16   38:invokestatic    #50  <Method zzh zzb.zzb(zzb)>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #46  <Method Throwable RuntimeExecutionException.getCause()>
	//   19   45:checkcast       #30  <Class Exception>
	//   20   48:invokevirtual   #56  <Method void zzh.setException(Exception)>
				return;
	//   21   51:return          
			} else
			{
				zzb.zzb(zzbNt).setException(((Exception) (obj)));
	//   22   52:aload_0         
	//   23   53:getfield        #19  <Field zzb zzbNt>
	//   24   56:invokestatic    #50  <Method zzh zzb.zzb(zzb)>
	//   25   59:aload_1         
	//   26   60:invokevirtual   #56  <Method void zzh.setException(Exception)>
				return;
	//   27   63:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  28   64:astore_1        
		{
			zzb.zzb(zzbNt).setException(((Exception) (obj)));
	//   29   65:aload_0         
	//   30   66:getfield        #19  <Field zzb zzbNt>
	//   31   69:invokestatic    #50  <Method zzh zzb.zzb(zzb)>
	//   32   72:aload_1         
	//   33   73:invokevirtual   #56  <Method void zzh.setException(Exception)>
			return;
	//   34   76:return          
		}
		if(obj == null)
	//*  35   77:aload_1         
	//*  36   78:ifnonnull       98
		{
			zzbNt.onFailure(((Exception) (new NullPointerException("Continuation returned null"))));
	//   37   81:aload_0         
	//   38   82:getfield        #19  <Field zzb zzbNt>
	//   39   85:new             #58  <Class NullPointerException>
	//   40   88:dup             
	//   41   89:ldc1            #60  <String "Continuation returned null">
	//   42   91:invokespecial   #63  <Method void NullPointerException(String)>
	//   43   94:invokevirtual   #66  <Method void zzb.onFailure(Exception)>
			return;
	//   44   97:return          
		} else
		{
			((Task) (obj)).addOnSuccessListener(TaskExecutors.zzbND, ((OnSuccessListener) (zzbNt)));
	//   45   98:aload_1         
	//   46   99:getstatic       #72  <Field java.util.concurrent.Executor TaskExecutors.zzbND>
	//   47  102:aload_0         
	//   48  103:getfield        #19  <Field zzb zzbNt>
	//   49  106:invokevirtual   #76  <Method Task Task.addOnSuccessListener(java.util.concurrent.Executor, OnSuccessListener)>
	//   50  109:pop             
			((Task) (obj)).addOnFailureListener(TaskExecutors.zzbND, ((OnFailureListener) (zzbNt)));
	//   51  110:aload_1         
	//   52  111:getstatic       #72  <Field java.util.concurrent.Executor TaskExecutors.zzbND>
	//   53  114:aload_0         
	//   54  115:getfield        #19  <Field zzb zzbNt>
	//   55  118:invokevirtual   #80  <Method Task Task.addOnFailureListener(java.util.concurrent.Executor, OnFailureListener)>
	//   56  121:pop             
			return;
	//   57  122:return          
		}
	}

	final Task zzbNr;
	final zzb zzbNt;

	zzb$1(zzb zzb1, Task task)
	{
		zzbNt = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzb zzbNt>
		zzbNr = task;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Task zzbNr>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
