// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzzx, zzabn, zzabm, zzabz, 
//			zzaal

public static final class zzzx$zzc extends zzzx$zza
{

	public volatile void zza(zzaal zzaal, boolean flag)
	{
		super.zza(zzaal, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void zzzx$zza.zza(zzaal, boolean)>
	//    4    6:return          
	}

	public void zzb( )
		throws RemoteException
	{
		if(zzazG.zzwW() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field zzabm zzazG>
	//*   2    4:invokevirtual   #45  <Method zzabh$zzb zzabm.zzwW()>
	//*   3    7:ifnull          42
			.zzwI().put(((Object) (zzazG.zzwW())), ((Object) (new zzabn(zzazG, zzazH))));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #51  <Method Map zzaax$zza.zzwI()>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field zzabm zzazG>
	//    8   18:invokevirtual   #45  <Method zzabh$zzb zzabm.zzwW()>
	//    9   21:new             #20  <Class zzabn>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #23  <Field zzabm zzazG>
	//   13   29:aload_0         
	//   14   30:getfield        #26  <Field zzabz zzazH>
	//   15   33:invokespecial   #54  <Method void zzabn(zzabm, zzabz)>
	//   16   36:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   17   41:pop             
	//   18   42:return          
	}

	public volatile void zzz(Status status)
	{
		super.zzz(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void zzzx$zza.zzz(Status)>
	//    3    5:return          
	}

	public final zzabm zzazG;
	public final zzabz zzazH;

	public zzzx$zzc(zzabn zzabn1, TaskCompletionSource taskcompletionsource)
	{
		super(3, taskcompletionsource);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void zzzx$zza(int, TaskCompletionSource)>
		zzazG = zzabn1.zzazG;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #22  <Field zzabm zzabn.zzazG>
	//    7   11:putfield        #23  <Field zzabm zzazG>
		zzazH = zzabn1.zzazH;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #25  <Field zzabz zzabn.zzazH>
	//   11   19:putfield        #26  <Field zzabz zzazH>
	//   12   22:return          
	}
}
