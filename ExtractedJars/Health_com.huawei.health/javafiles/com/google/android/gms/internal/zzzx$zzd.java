// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.internal:
//			zzzx, zzaal, zzabv, zzabs

public static final class zzzx$zzd extends zzzx
{

	public void zza(zzaal zzaal1, boolean flag)
	{
		zzaal1.zza(zzazE, flag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field TaskCompletionSource zzazE>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #36  <Method void zzaal.zza(TaskCompletionSource, boolean)>
	//    5    9:return          
	}

	public void zza( )
		throws DeadObjectException
	{
		try
		{
			zzazI.zza(((com.google.android.gms.common.api.Api.zzb) (.zzvU())), zzazE);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzabv zzazI>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method com.google.android.gms.common.api.Api$zze zzaax$zza.zzvU()>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field TaskCompletionSource zzazE>
	//    6   12:invokevirtual   #53  <Method void zzabv.zza(com.google.android.gms.common.api.Api$zzb, TaskCompletionSource)>
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
			zzz(zzzx.zzb(((RemoteException) ())));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokestatic    #57  <Method Status zzzx.zzb(RemoteException)>
	//   15   25:invokevirtual   #61  <Method void zzz(Status)>
		}
	//   16   28:return          
	}

	public void zzz(Status status)
	{
		zzazE.trySetException(zzazJ.zzA(status));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TaskCompletionSource zzazE>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field zzabs zzazJ>
	//    4    8:aload_1         
	//    5    9:invokeinterface #69  <Method Exception zzabs.zzA(Status)>
	//    6   14:invokevirtual   #75  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//    7   17:pop             
	//    8   18:return          
	}

	private final TaskCompletionSource zzazE;
	private final zzabv zzazI;
	private final zzabs zzazJ;

	public zzzx$zzd(int i, zzabv zzabv1, TaskCompletionSource taskcompletionsource, zzabs zzabs1)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #19  <Method void zzzx(int)>
		zzazE = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field TaskCompletionSource zzazE>
		zzazI = zzabv1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #23  <Field zzabv zzazI>
		zzazJ = zzabs1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field zzabs zzazJ>
	//   12   21:return          
	}
}
