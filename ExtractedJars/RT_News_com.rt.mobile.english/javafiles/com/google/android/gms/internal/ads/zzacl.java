// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzace

final class zzacl
	implements android.view.ViewTreeObserver.OnScrollChangedListener
{

	zzacl(zzace zzace1, WeakReference weakreference)
	{
		zzcbi = zzace1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzace zzcbi>
		zzcbj = weakreference;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field WeakReference zzcbj>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void onScrollChanged()
	{
		zzace.zza(zzcbi, zzcbj, true);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzace zzcbi>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field WeakReference zzcbj>
	//    4    8:iconst_1        
	//    5    9:invokestatic    #27  <Method void zzace.zza(zzace, WeakReference, boolean)>
	//    6   12:return          
	}

	private final zzace zzcbi;
	private final WeakReference zzcbj;
}
