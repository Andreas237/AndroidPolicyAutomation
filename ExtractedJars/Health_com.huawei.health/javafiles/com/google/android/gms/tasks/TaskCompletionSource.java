// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			zzh, Task

public class TaskCompletionSource
{

	public TaskCompletionSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class zzh>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void zzh()>
	//    6   12:putfield        #17  <Field zzh zzbNC>
	//    7   15:return          
	}

	public Task getTask()
	{
		return ((Task) (zzbNC));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzh zzbNC>
	//    2    4:areturn         
	}

	public void setException(Exception exception)
	{
		zzbNC.setException(exception);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzh zzbNC>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method void zzh.setException(Exception)>
	//    4    8:return          
	}

	public void setResult(Object obj)
	{
		zzbNC.setResult(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzh zzbNC>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method void zzh.setResult(Object)>
	//    4    8:return          
	}

	public boolean trySetException(Exception exception)
	{
		return zzbNC.trySetException(exception);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzh zzbNC>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method boolean zzh.trySetException(Exception)>
	//    4    8:ireturn         
	}

	public boolean trySetResult(Object obj)
	{
		return zzbNC.trySetResult(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzh zzbNC>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method boolean zzh.trySetResult(Object)>
	//    4    8:ireturn         
	}

	private final zzh zzbNC = new zzh();
}
