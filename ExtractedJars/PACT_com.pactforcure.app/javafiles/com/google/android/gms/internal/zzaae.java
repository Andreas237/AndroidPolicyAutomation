// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzzw, zzaax, zzaap, zzzs

public class zzaae extends zzzw
{

	private zzaae(zzaax zzaax1)
	{
		super(zzaax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void zzzw(zzaax)>
	//    3    5:aload_0         
	//    4    6:new             #15  <Class zza>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void zza()>
	//    7   13:putfield        #20  <Field zza zzazH>
		zzaBs.zza("ConnectionlessLifecycleHelper", ((zzaaw) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field zzaax zzaBs>
	//   10   20:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #32  <Method void com.google.android.gms.internal.zzaax.zza(String, zzaaw)>
	//   13   28:return          
	}

	public static void zza(Activity activity, zzaap zzaap1, zzzs zzzs)
	{
		zzaax zzaax1 = zzs(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method zzaax zzs(Activity)>
	//    2    4:astore          4
		zzaae zzaae1 = (zzaae)zzaax1.zza("ConnectionlessLifecycleHelper", com/google/android/gms/internal/zzaae);
	//    3    6:aload           4
	//    4    8:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//    5   10:ldc1            #2   <Class zzaae>
	//    6   12:invokeinterface #41  <Method zzaaw com.google.android.gms.internal.zzaax.zza(String, Class)>
	//    7   17:checkcast       #2   <Class zzaae>
	//    8   20:astore_3        
		activity = ((Activity) (zzaae1));
	//    9   21:aload_3         
	//   10   22:astore_0        
		if(zzaae1 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       37
			activity = ((Activity) (new zzaae(zzaax1)));
	//   13   27:new             #2   <Class zzaae>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokespecial   #42  <Method void zzaae(zzaax)>
	//   17   36:astore_0        
		activity.zzaxK = zzaap1;
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:putfield        #44  <Field zzaap zzaxK>
		((zzaae) (activity)).zza(zzzs);
	//   21   42:aload_0         
	//   22   43:aload_2         
	//   23   44:invokespecial   #47  <Method void zza(zzzs)>
		zzaap1.zza(((zzaae) (activity)));
	//   24   47:aload_1         
	//   25   48:aload_0         
	//   26   49:invokevirtual   #52  <Method void com.google.android.gms.internal.zzaap.zza(zzaae)>
	//   27   52:return          
	}

	private void zza(zzzs zzzs)
	{
		zzac.zzb(((Object) (zzzs)), "ApiKey cannot be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #56  <String "ApiKey cannot be null">
	//    2    3:invokestatic    #62  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzazH.add(((Object) (zzzs)));
	//    4    7:aload_0         
	//    5    8:getfield        #20  <Field zza zzazH>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #66  <Method boolean zza.add(Object)>
	//    8   15:pop             
	//    9   16:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void zzzw.onStart()>
		if(!zzazH.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field zza zzazH>
	//*   4    8:invokevirtual   #74  <Method boolean zza.isEmpty()>
	//*   5   11:ifne            22
			zzaxK.zza(this);
	//    6   14:aload_0         
	//    7   15:getfield        #44  <Field zzaap zzaxK>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #52  <Method void com.google.android.gms.internal.zzaap.zza(zzaae)>
	//   10   22:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void zzzw.onStop()>
		zzaxK.zzb(this);
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field zzaap zzaxK>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #79  <Method void zzaap.zzb(zzaae)>
	//    6   12:return          
	}

	protected void zza(ConnectionResult connectionresult, int i)
	{
		zzaxK.zza(connectionresult, i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzaap zzaxK>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #82  <Method void com.google.android.gms.internal.zzaap.zza(ConnectionResult, int)>
	//    5    9:return          
	}

	protected void zzuW()
	{
		zzaxK.zzuW();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzaap zzaxK>
	//    2    4:invokevirtual   #85  <Method void zzaap.zzuW()>
	//    3    7:return          
	}

	zza zzvx()
	{
		return zzazH;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zza zzazH>
	//    2    4:areturn         
	}

	private zzaap zzaxK;
	private final zza zzazH = new zza();
}
