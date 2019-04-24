// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.gms.dynamic:
//			zza, LifecycleDelegate

class zza$4
	implements a
{

	public int getState()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public void zzb(LifecycleDelegate lifecycledelegate)
	{
		zzaQj.removeAllViews();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field FrameLayout zzaQj>
	//    2    4:invokevirtual   #46  <Method void FrameLayout.removeAllViews()>
		zzaQj.addView(zza.zzb(zzaQh).onCreateView(zzaQk, zzaQl, zzxd));
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field FrameLayout zzaQj>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field zza zzaQh>
	//    7   15:invokestatic    #49  <Method LifecycleDelegate zza.zzb(zza)>
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field LayoutInflater zzaQk>
	//   10   22:aload_0         
	//   11   23:getfield        #31  <Field ViewGroup zzaQl>
	//   12   26:aload_0         
	//   13   27:getfield        #33  <Field Bundle zzxd>
	//   14   30:invokeinterface #52  <Method android.view.View LifecycleDelegate.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   15   35:invokevirtual   #56  <Method void FrameLayout.addView(android.view.View)>
	//   16   38:return          
	}

	final zza zzaQh;
	final FrameLayout zzaQj;
	final LayoutInflater zzaQk;
	final ViewGroup zzaQl;
	final Bundle zzxd;

	zza$4(zza zza1, FrameLayout framelayout, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		zzaQh = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field zza zzaQh>
		zzaQj = framelayout;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field FrameLayout zzaQj>
		zzaQk = layoutinflater;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field LayoutInflater zzaQk>
		zzaQl = viewgroup;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field ViewGroup zzaQl>
		zzxd = bundle;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field Bundle zzxd>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}
