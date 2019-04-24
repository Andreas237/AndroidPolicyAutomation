// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzzq, zzabf, zzabe, zzaad

public static final class zzzq$zze extends zzzq$zza
{

	public volatile void zza(zzaad zzaad, boolean flag)
	{
		super.zza(zzaad, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #25  <Method void com.google.android.gms.internal.zzzq$zza.zza(zzaad, boolean)>
	//    4    6:return          
	}

	public void zzb( )
		throws RemoteException
	{
		 = (() ((zzabf).zzwc().remove(((Object) (zzayu)))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method Map zzaap$zza.zzwc()>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field zzaaz$zzb zzayu>
	//    4    8:invokeinterface #42  <Method Object Map.remove(Object)>
	//    5   13:checkcast       #44  <Class zzabf>
	//    6   16:astore_1        
		if( != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          29
		{
			((zzabf) ()).zzayq.zzwq();
	//    9   21:aload_1         
	//   10   22:getfield        #48  <Field zzabe zzabf.zzayq>
	//   11   25:invokevirtual   #54  <Method void zzabe.zzwq()>
			return;
	//   12   28:return          
		} else
		{
			Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", ((Throwable) (new Exception())));
	//   13   29:ldc1            #56  <String "UnregisterListenerTask">
	//   14   31:ldc1            #58  <String "Received call to unregister a listener without a matching registration call.">
	//   15   33:new             #60  <Class Exception>
	//   16   36:dup             
	//   17   37:invokespecial   #62  <Method void Exception()>
	//   18   40:invokestatic    #68  <Method int Log.wtf(String, String, Throwable)>
	//   19   43:pop             
			zzayo.trySetException(((Exception) (new zza(Status.zzayj))));
	//   20   44:aload_0         
	//   21   45:getfield        #72  <Field TaskCompletionSource zzayo>
	//   22   48:new             #74  <Class zza>
	//   23   51:dup             
	//   24   52:getstatic       #80  <Field Status Status.zzayj>
	//   25   55:invokespecial   #83  <Method void zza(Status)>
	//   26   58:invokevirtual   #89  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//   27   61:pop             
			return;
	//   28   62:return          
		}
	}

	public volatile void zzy(Status status)
	{
		super.zzy(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void zzzq$zza.zzy(Status)>
	//    3    5:return          
	}

	public final  zzayu;

	public zzzq$zze( , TaskCompletionSource taskcompletionsource)
	{
		super(4, taskcompletionsource);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void zzzq$zza(int, TaskCompletionSource)>
		zzayu = ;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #17  <Field zzaaz$zzb zzayu>
	//    7   11:return          
	}
}
