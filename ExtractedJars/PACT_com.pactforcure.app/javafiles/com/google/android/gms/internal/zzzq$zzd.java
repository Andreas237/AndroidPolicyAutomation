// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.internal:
//			zzzq, zzaad, zzabn, zzabk

public static final class zzzq$zzd extends zzzq
{

	public void zza(zzaad zzaad1, boolean flag)
	{
		zzaad1.zza(zzayo, flag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field TaskCompletionSource zzayo>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #36  <Method void zzaad.zza(TaskCompletionSource, boolean)>
	//    5    9:return          
	}

	public void zza( )
		throws DeadObjectException
	{
		try
		{
			zzays.zza(((com.google.android.gms.common.api.Api.zzb) (.zzvr())), zzayo);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzabn zzays>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method com.google.android.gms.common.api.Api$zze zzaap$zza.zzvr()>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field TaskCompletionSource zzayo>
	//    6   12:invokevirtual   #53  <Method void zzabn.zza(com.google.android.gms.common.api.Api$zzb, TaskCompletionSource)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch( )
	//*   8   16:astore_1        
		{
			throw ;
	//    9   17:aload_1         
	//   10   18:athrow          
		}
		// Misplaced declaration of an exception variable
		catch( )
	//*  11   19:astore_1        
		{
			zzy(zzzq.zzb(((RemoteException) ())));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokestatic    #57  <Method Status zzzq.zzb(RemoteException)>
	//   15   25:invokevirtual   #61  <Method void zzy(Status)>
		}
	//   16   28:return          
	}

	public void zzy(Status status)
	{
		zzayo.trySetException(zzayt.zzz(status));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TaskCompletionSource zzayo>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field zzabk zzayt>
	//    4    8:aload_1         
	//    5    9:invokeinterface #69  <Method Exception zzabk.zzz(Status)>
	//    6   14:invokevirtual   #75  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//    7   17:pop             
	//    8   18:return          
	}

	private final TaskCompletionSource zzayo;
	private final zzabn zzays;
	private final zzabk zzayt;

	public zzzq$zzd(int i, zzabn zzabn1, TaskCompletionSource taskcompletionsource, zzabk zzabk1)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #19  <Method void zzzq(int)>
		zzayo = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field TaskCompletionSource zzayo>
		zzays = zzabn1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #23  <Field zzabn zzays>
		zzayt = zzabk1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field zzabk zzayt>
	//   12   21:return          
	}
}
