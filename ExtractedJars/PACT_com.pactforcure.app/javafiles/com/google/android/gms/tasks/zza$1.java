// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			zza, RuntimeExecutionException, Continuation, zzh, 
//			Task

class zza$1
	implements Runnable
{

	public void run()
	{
		Object obj;
		try
		{
			obj = zza.zza(zzbLv).then(zzbLu);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zza zzbLv>
	//    2    4:invokestatic    #34  <Method Continuation zza.zza(zza)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Task zzbLu>
	//    5   11:invokeinterface #40  <Method Object Continuation.then(Task)>
	//    6   16:astore_1        
		}
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field zza zzbLv>
	//*   9   21:invokestatic    #44  <Method zzh zza.zzb(zza)>
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #50  <Method void zzh.setResult(Object)>
	//*  12   28:return          
		catch(RuntimeExecutionException runtimeexecutionexception)
	//*  13   29:astore_1        
		{
			if(runtimeexecutionexception.getCause() instanceof Exception)
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #54  <Method Throwable RuntimeExecutionException.getCause()>
	//*  16   34:instanceof      #30  <Class Exception>
	//*  17   37:ifeq            58
			{
				zza.zzb(zzbLv).setException((Exception)runtimeexecutionexception.getCause());
	//   18   40:aload_0         
	//   19   41:getfield        #19  <Field zza zzbLv>
	//   20   44:invokestatic    #44  <Method zzh zza.zzb(zza)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #54  <Method Throwable RuntimeExecutionException.getCause()>
	//   23   51:checkcast       #30  <Class Exception>
	//   24   54:invokevirtual   #58  <Method void zzh.setException(Exception)>
				return;
	//   25   57:return          
			} else
			{
				zza.zzb(zzbLv).setException(((Exception) (runtimeexecutionexception)));
	//   26   58:aload_0         
	//   27   59:getfield        #19  <Field zza zzbLv>
	//   28   62:invokestatic    #44  <Method zzh zza.zzb(zza)>
	//   29   65:aload_1         
	//   30   66:invokevirtual   #58  <Method void zzh.setException(Exception)>
				return;
	//   31   69:return          
			}
		}
		catch(Exception exception)
	//*  32   70:astore_1        
		{
			zza.zzb(zzbLv).setException(exception);
	//   33   71:aload_0         
	//   34   72:getfield        #19  <Field zza zzbLv>
	//   35   75:invokestatic    #44  <Method zzh zza.zzb(zza)>
	//   36   78:aload_1         
	//   37   79:invokevirtual   #58  <Method void zzh.setException(Exception)>
			return;
	//   38   82:return          
		}
		zza.zzb(zzbLv).setResult(obj);
	}

	final Task zzbLu;
	final zza zzbLv;

	zza$1(zza zza1, Task task)
	{
		zzbLv = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zza zzbLv>
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
