// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			LifecycleActivity, zzcc, zzbr, LifecycleFragment

public class LifecycleCallback
{

	protected LifecycleCallback(LifecycleFragment lifecyclefragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mLifecycleFragment = lifecyclefragment;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field LifecycleFragment mLifecycleFragment>
	//    5    9:return          
	}

	private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleactivity)
	{
		throw new IllegalStateException("Method not available in SDK.");
	//    0    0:new             #21  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "Method not available in SDK.">
	//    3    6:invokespecial   #26  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public static LifecycleFragment getFragment(Activity activity)
	{
		return getFragment(new LifecycleActivity(activity));
	//    0    0:new             #30  <Class LifecycleActivity>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void LifecycleActivity(Activity)>
	//    4    8:invokestatic    #35  <Method LifecycleFragment getFragment(LifecycleActivity)>
	//    5   11:areturn         
	}

	protected static LifecycleFragment getFragment(LifecycleActivity lifecycleactivity)
	{
		if(lifecycleactivity.zzbv())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #39  <Method boolean LifecycleActivity.zzbv()>
	//*   2    4:ifeq            15
			return ((LifecycleFragment) (zzcc.zza(lifecycleactivity.zzby())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method android.support.v4.app.FragmentActivity LifecycleActivity.zzby()>
	//    5   11:invokestatic    #49  <Method zzcc zzcc.zza(android.support.v4.app.FragmentActivity)>
	//    6   14:areturn         
		if(lifecycleactivity.zzbw())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #52  <Method boolean LifecycleActivity.zzbw()>
	//*   9   19:ifeq            30
			return ((LifecycleFragment) (zzbr.zzc(lifecycleactivity.zzbx())));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #56  <Method Activity LifecycleActivity.zzbx()>
	//   12   26:invokestatic    #62  <Method zzbr zzbr.zzc(Activity)>
	//   13   29:areturn         
		else
			throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
	//   14   30:new             #64  <Class IllegalArgumentException>
	//   15   33:dup             
	//   16   34:ldc1            #66  <String "Can't get fragment for unexpected activity.">
	//   17   36:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   18   39:athrow          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public final Activity getActivity()
	{
		return mLifecycleFragment.getLifecycleActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field LifecycleFragment mLifecycleFragment>
	//    2    4:invokeinterface #76  <Method Activity LifecycleFragment.getLifecycleActivity()>
	//    3    9:areturn         
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
	//    0    0:return          
	}

	public void onCreate(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onDestroy()
	{
	//    0    0:return          
	}

	public void onResume()
	{
	//    0    0:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onStart()
	{
	//    0    0:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	protected final LifecycleFragment mLifecycleFragment;
}
