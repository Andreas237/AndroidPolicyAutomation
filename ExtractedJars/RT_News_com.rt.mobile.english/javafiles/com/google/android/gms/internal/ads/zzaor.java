// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaos, zzaou, zzaot

public final class zzaor
{

	public zzaor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static void zza(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
	{
		((zzaou) (new zzaos(view, ongloballayoutlistener))).attach();
	//    0    0:new             #14  <Class zzaos>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #16  <Method void zzaos(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    5    9:invokevirtual   #21  <Method void zzaou.attach()>
	//    6   12:return          
	}

	public static void zza(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
	{
		((zzaou) (new zzaot(view, onscrollchangedlistener))).attach();
	//    0    0:new             #24  <Class zzaot>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #26  <Method void zzaot(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    5    9:invokevirtual   #21  <Method void zzaou.attach()>
	//    6   12:return          
	}
}
