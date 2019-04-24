// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzzq, zzabf, zzabe, zzabr, 
//			zzaad

public static final class zzzq$zzc extends zzzq$zza
{

	public volatile void zza(zzaad zzaad, boolean flag)
	{
		super.zza(zzaad, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void zzzq$zza.zza(zzaad, boolean)>
	//    4    6:return          
	}

	public void zzb( )
		throws RemoteException
	{
		if(zzayq.zzwp() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field zzabe zzayq>
	//*   2    4:invokevirtual   #45  <Method zzaaz$zzb zzabe.zzwp()>
	//*   3    7:ifnull          42
			.zzwc().put(((Object) (zzayq.zzwp())), ((Object) (new zzabf(zzayq, zzayr))));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #51  <Method Map zzaap$zza.zzwc()>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field zzabe zzayq>
	//    8   18:invokevirtual   #45  <Method zzaaz$zzb zzabe.zzwp()>
	//    9   21:new             #20  <Class zzabf>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #23  <Field zzabe zzayq>
	//   13   29:aload_0         
	//   14   30:getfield        #26  <Field zzabr zzayr>
	//   15   33:invokespecial   #54  <Method void zzabf(zzabe, zzabr)>
	//   16   36:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   17   41:pop             
	//   18   42:return          
	}

	public volatile void zzy(Status status)
	{
		super.zzy(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void zzzq$zza.zzy(Status)>
	//    3    5:return          
	}

	public final zzabe zzayq;
	public final zzabr zzayr;

	public zzzq$zzc(zzabf zzabf1, TaskCompletionSource taskcompletionsource)
	{
		super(3, taskcompletionsource);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void zzzq$zza(int, TaskCompletionSource)>
		zzayq = zzabf1.zzayq;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #22  <Field zzabe zzabf.zzayq>
	//    7   11:putfield        #23  <Field zzabe zzayq>
		zzayr = zzabf1.zzayr;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #25  <Field zzabr zzabf.zzayr>
	//   11   19:putfield        #26  <Field zzabr zzayr>
	//   12   22:return          
	}
}
