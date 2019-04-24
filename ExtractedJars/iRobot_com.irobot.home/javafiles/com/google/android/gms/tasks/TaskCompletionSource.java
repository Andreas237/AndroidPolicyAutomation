// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			zzu, zzs, CancellationToken, Task

public class TaskCompletionSource
{

	public TaskCompletionSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zza = new zzu();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class zzu>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void zzu()>
	//    6   12:putfield        #17  <Field zzu zza>
	//    7   15:return          
	}

	public TaskCompletionSource(CancellationToken cancellationtoken)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zza = new zzu();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class zzu>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void zzu()>
	//    6   12:putfield        #17  <Field zzu zza>
		cancellationtoken.onCanceledRequested(((OnTokenCanceledListener) (new zzs(this))));
	//    7   15:aload_1         
	//    8   16:new             #21  <Class zzs>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #24  <Method void zzs(TaskCompletionSource)>
	//   12   24:invokevirtual   #30  <Method CancellationToken CancellationToken.onCanceledRequested(OnTokenCanceledListener)>
	//   13   27:pop             
	//   14   28:return          
	}

	static zzu zza(TaskCompletionSource taskcompletionsource)
	{
		return taskcompletionsource.zza;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzu zza>
	//    2    4:areturn         
	}

	public Task getTask()
	{
		return ((Task) (zza));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzu zza>
	//    2    4:areturn         
	}

	public void setException(Exception exception)
	{
		zza.setException(exception);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzu zza>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method void zzu.setException(Exception)>
	//    4    8:return          
	}

	public void setResult(Object obj)
	{
		zza.setResult(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzu zza>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method void zzu.setResult(Object)>
	//    4    8:return          
	}

	public boolean trySetException(Exception exception)
	{
		return zza.trySetException(exception);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzu zza>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method boolean zzu.trySetException(Exception)>
	//    4    8:ireturn         
	}

	public boolean trySetResult(Object obj)
	{
		return zza.trySetResult(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzu zza>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method boolean zzu.trySetResult(Object)>
	//    4    8:ireturn         
	}

	private final zzu zza;
}
