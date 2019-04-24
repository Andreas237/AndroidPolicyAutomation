// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.internal:
//			zzzq, zzaad

private static abstract class zzzq$zza extends zzzq
{

	public void zza(zzaad zzaad, boolean flag)
	{
	//    0    0:return          
	}

	public final void zza( )
		throws DeadObjectException
	{
		try
		{
			zzb();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method void zzb(zzaap$zza)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch( )
	//*   4    6:astore_1        
		{
			zzy(zzzq.zzb(((RemoteException) ())));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokestatic    #32  <Method Status zzzq.zzb(RemoteException)>
	//    8   12:invokevirtual   #36  <Method void zzy(Status)>
			throw ;
	//    9   15:aload_1         
	//   10   16:athrow          
		}
		// Misplaced declaration of an exception variable
		catch( )
	//*  11   17:astore_1        
		{
			zzy(zzzq.zzb(((RemoteException) ())));
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokestatic    #32  <Method Status zzzq.zzb(RemoteException)>
	//   15   23:invokevirtual   #36  <Method void zzy(Status)>
		}
	//   16   26:return          
	}

	protected abstract void zzb( )
		throws RemoteException;

	public void zzy(Status status)
	{
		zzayo.trySetException(((Exception) (new zza(status))));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TaskCompletionSource zzayo>
	//    2    4:new             #40  <Class zza>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #42  <Method void zza(Status)>
	//    6   12:invokevirtual   #48  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected final TaskCompletionSource zzayo;

	public zzzq$zza(int i, TaskCompletionSource taskcompletionsource)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #13  <Method void zzzq(int)>
		zzayo = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field TaskCompletionSource zzayo>
	//    6   10:return          
	}
}
