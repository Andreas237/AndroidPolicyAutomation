// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzaae, zzabf, zzaax, zzzz

public class zzaam extends zzaae
{

	private zzaam(zzabf zzabf1)
	{
		super(zzabf1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void zzaae(zzabf)>
	//    3    5:aload_0         
	//    4    6:new             #15  <Class zza>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void zza()>
	//    7   13:putfield        #20  <Field zza zzaBh>
		zzaCR.zza("ConnectionlessLifecycleHelper", ((zzabe) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field zzabf zzaCR>
	//   10   20:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #32  <Method void com.google.android.gms.internal.zzabf.zza(String, zzabe)>
	//   13   28:return          
	}

	public static void zza(Activity activity, zzaax zzaax1, zzzz zzzz)
	{
		zzabf zzabf1 = zzs(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method zzabf zzs(Activity)>
	//    2    4:astore          4
		zzaam zzaam1 = (zzaam)zzabf1.zza("ConnectionlessLifecycleHelper", com/google/android/gms/internal/zzaam);
	//    3    6:aload           4
	//    4    8:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//    5   10:ldc1            #2   <Class zzaam>
	//    6   12:invokeinterface #41  <Method zzabe com.google.android.gms.internal.zzabf.zza(String, Class)>
	//    7   17:checkcast       #2   <Class zzaam>
	//    8   20:astore_3        
		activity = ((Activity) (zzaam1));
	//    9   21:aload_3         
	//   10   22:astore_0        
		if(zzaam1 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       37
			activity = ((Activity) (new zzaam(zzabf1)));
	//   13   27:new             #2   <Class zzaam>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokespecial   #42  <Method void zzaam(zzabf)>
	//   17   36:astore_0        
		activity.zzayX = zzaax1;
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:putfield        #44  <Field zzaax zzayX>
		((zzaam) (activity)).zza(zzzz);
	//   21   42:aload_0         
	//   22   43:aload_2         
	//   23   44:invokespecial   #47  <Method void zza(zzzz)>
		zzaax1.zza(((zzaam) (activity)));
	//   24   47:aload_1         
	//   25   48:aload_0         
	//   26   49:invokevirtual   #52  <Method void com.google.android.gms.internal.zzaax.zza(zzaam)>
	//   27   52:return          
	}

	private void zza(zzzz zzzz)
	{
		zzac.zzb(((Object) (zzzz)), "ApiKey cannot be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #56  <String "ApiKey cannot be null">
	//    2    3:invokestatic    #62  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzaBh.add(((Object) (zzzz)));
	//    4    7:aload_0         
	//    5    8:getfield        #20  <Field zza zzaBh>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #66  <Method boolean zza.add(Object)>
	//    8   15:pop             
	//    9   16:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void zzaae.onStart()>
		if(!zzaBh.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field zza zzaBh>
	//*   4    8:invokevirtual   #74  <Method boolean zza.isEmpty()>
	//*   5   11:ifne            22
			zzayX.zza(this);
	//    6   14:aload_0         
	//    7   15:getfield        #44  <Field zzaax zzayX>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #52  <Method void com.google.android.gms.internal.zzaax.zza(zzaam)>
	//   10   22:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void zzaae.onStop()>
		zzayX.zzb(this);
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field zzaax zzayX>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #79  <Method void zzaax.zzb(zzaam)>
	//    6   12:return          
	}

	protected void zza(ConnectionResult connectionresult, int i)
	{
		zzayX.zza(connectionresult, i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzaax zzayX>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #82  <Method void com.google.android.gms.internal.zzaax.zza(ConnectionResult, int)>
	//    5    9:return          
	}

	protected void zzvx()
	{
		zzayX.zzvx();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzaax zzayX>
	//    2    4:invokevirtual   #85  <Method void zzaax.zzvx()>
	//    3    7:return          
	}

	zza zzwb()
	{
		return zzaBh;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zza zzaBh>
	//    2    4:areturn         
	}

	private final zza zzaBh = new zza();
	private zzaax zzayX;
}
