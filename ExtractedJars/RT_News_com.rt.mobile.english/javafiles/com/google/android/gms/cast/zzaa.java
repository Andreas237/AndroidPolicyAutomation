// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.cast:
//			CastRemoteDisplayLocalService

final class zzaa
	implements OnCompleteListener
{

	zzaa(CastRemoteDisplayLocalService castremotedisplaylocalservice)
	{
		zzcg = castremotedisplaylocalservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field CastRemoteDisplayLocalService zzcg>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void onComplete(Task task)
	{
		if(!task.isSuccessful())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #26  <Method boolean Task.isSuccessful()>
	//*   2    4:ifne            60
		{
			CastRemoteDisplayLocalService.zza(zzcg, "Unable to stop the remote display, result unsuccessful");
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field CastRemoteDisplayLocalService zzcg>
	//    5   11:ldc1            #28  <String "Unable to stop the remote display, result unsuccessful">
	//    6   13:invokestatic    #34  <Method void CastRemoteDisplayLocalService.zza(CastRemoteDisplayLocalService, String)>
			if(CastRemoteDisplayLocalService.zzf(zzcg).get() != null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #13  <Field CastRemoteDisplayLocalService zzcg>
	//*   9   20:invokestatic    #38  <Method WeakReference CastRemoteDisplayLocalService.zzf(CastRemoteDisplayLocalService)>
	//*  10   23:invokevirtual   #44  <Method Object WeakReference.get()>
	//*  11   26:ifnull          69
				((CastRemoteDisplayLocalService.Callbacks)CastRemoteDisplayLocalService.zzf(zzcg).get()).onRemoteDisplaySessionError(new Status(2202));
	//   12   29:aload_0         
	//   13   30:getfield        #13  <Field CastRemoteDisplayLocalService zzcg>
	//   14   33:invokestatic    #38  <Method WeakReference CastRemoteDisplayLocalService.zzf(CastRemoteDisplayLocalService)>
	//   15   36:invokevirtual   #44  <Method Object WeakReference.get()>
	//   16   39:checkcast       #46  <Class CastRemoteDisplayLocalService$Callbacks>
	//   17   42:new             #48  <Class Status>
	//   18   45:dup             
	//   19   46:sipush          2202
	//   20   49:invokespecial   #51  <Method void Status(int)>
	//   21   52:invokeinterface #55  <Method void CastRemoteDisplayLocalService$Callbacks.onRemoteDisplaySessionError(Status)>
		} else
	//*  22   57:goto            69
		{
			CastRemoteDisplayLocalService.zza(zzcg, "remote display stopped");
	//   23   60:aload_0         
	//   24   61:getfield        #13  <Field CastRemoteDisplayLocalService zzcg>
	//   25   64:ldc1            #57  <String "remote display stopped">
	//   26   66:invokestatic    #34  <Method void CastRemoteDisplayLocalService.zza(CastRemoteDisplayLocalService, String)>
		}
		CastRemoteDisplayLocalService.zzb(zzcg, ((android.view.Display) (null)));
	//   27   69:aload_0         
	//   28   70:getfield        #13  <Field CastRemoteDisplayLocalService zzcg>
	//   29   73:aconst_null     
	//   30   74:invokestatic    #61  <Method android.view.Display CastRemoteDisplayLocalService.zzb(CastRemoteDisplayLocalService, android.view.Display)>
	//   31   77:pop             
	//   32   78:return          
	}

	private final CastRemoteDisplayLocalService zzcg;
}
