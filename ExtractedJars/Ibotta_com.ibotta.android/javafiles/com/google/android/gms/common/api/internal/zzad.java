// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.util.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzk, LifecycleFragment, GoogleApiManager, zzh

public class zzad extends zzk
{

	private zzad(LifecycleFragment lifecyclefragment)
	{
		super(lifecyclefragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void zzk(LifecycleFragment)>
	//    3    5:aload_0         
	//    4    6:new             #15  <Class ArraySet>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void ArraySet()>
	//    7   13:putfield        #20  <Field ArraySet zzhb>
		mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", ((LifecycleCallback) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field LifecycleFragment mLifecycleFragment>
	//   10   20:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #32  <Method void LifecycleFragment.addCallback(String, LifecycleCallback)>
	//   13   28:return          
	}

	public static void zza(Activity activity, GoogleApiManager googleapimanager, zzh zzh)
	{
		LifecycleFragment lifecyclefragment = getFragment(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method LifecycleFragment getFragment(Activity)>
	//    2    4:astore          4
		zzad zzad1 = (zzad)lifecyclefragment.getCallbackOrNull("ConnectionlessLifecycleHelper", com/google/android/gms/common/api/internal/zzad);
	//    3    6:aload           4
	//    4    8:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//    5   10:ldc1            #2   <Class zzad>
	//    6   12:invokeinterface #43  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
	//    7   17:checkcast       #2   <Class zzad>
	//    8   20:astore_3        
		activity = ((Activity) (zzad1));
	//    9   21:aload_3         
	//   10   22:astore_0        
		if(zzad1 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       37
			activity = ((Activity) (new zzad(lifecyclefragment)));
	//   13   27:new             #2   <Class zzad>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokespecial   #44  <Method void zzad(LifecycleFragment)>
	//   17   36:astore_0        
		activity.zzcq = googleapimanager;
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:putfield        #46  <Field GoogleApiManager zzcq>
		Preconditions.checkNotNull(((Object) (zzh)), "ApiKey cannot be null");
	//   21   42:aload_2         
	//   22   43:ldc1            #48  <String "ApiKey cannot be null">
	//   23   45:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   24   48:pop             
		((zzad) (activity)).zzhb.add(((Object) (zzh)));
	//   25   49:aload_0         
	//   26   50:getfield        #20  <Field ArraySet zzhb>
	//   27   53:aload_2         
	//   28   54:invokevirtual   #58  <Method boolean ArraySet.add(Object)>
	//   29   57:pop             
		googleapimanager.zza(((zzad) (activity)));
	//   30   58:aload_1         
	//   31   59:aload_0         
	//   32   60:invokevirtual   #63  <Method void GoogleApiManager.zza(zzad)>
	//   33   63:return          
	}

	private final void zzan()
	{
		if(!zzhb.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ArraySet zzhb>
	//*   2    4:invokevirtual   #70  <Method boolean ArraySet.isEmpty()>
	//*   3    7:ifne            18
			zzcq.zza(this);
	//    4   10:aload_0         
	//    5   11:getfield        #46  <Field GoogleApiManager zzcq>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #63  <Method void GoogleApiManager.zza(zzad)>
	//    8   18:return          
	}

	public final void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zzk.onResume()>
		zzan();
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void zzan()>
	//    4    8:return          
	}

	public final void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void zzk.onStart()>
		zzan();
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void zzan()>
	//    4    8:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzk.onStop()>
		zzcq.zzb(this);
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field GoogleApiManager zzcq>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #84  <Method void GoogleApiManager.zzb(zzad)>
	//    6   12:return          
	}

	protected final void zza(ConnectionResult connectionresult, int i)
	{
		zzcq.zza(connectionresult, i);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field GoogleApiManager zzcq>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #87  <Method void GoogleApiManager.zza(ConnectionResult, int)>
	//    5    9:return          
	}

	final ArraySet zzam()
	{
		return zzhb;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArraySet zzhb>
	//    2    4:areturn         
	}

	protected final void zzr()
	{
		zzcq.zzr();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field GoogleApiManager zzcq>
	//    2    4:invokevirtual   #93  <Method void GoogleApiManager.zzr()>
	//    3    7:return          
	}

	private GoogleApiManager zzcq;
	private final ArraySet zzhb = new ArraySet();
}
