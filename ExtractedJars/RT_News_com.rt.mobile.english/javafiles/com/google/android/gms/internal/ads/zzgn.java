// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgm, zzgk

final class zzgn
	implements ValueCallback
{

	zzgn(zzgm zzgm1)
	{
		zzaip = zzgm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzgm zzaip>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void onReceiveValue(Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class String>
	//    2    4:astore_1        
		zzaip.zzaik.zza(zzaip.zzaim, zzaip.zzain, ((String) (obj)), zzaip.zzaio);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field zzgm zzaip>
	//    5    9:getfield        #27  <Field zzgk zzgm.zzaik>
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field zzgm zzaip>
	//    8   16:getfield        #31  <Field zzge zzgm.zzaim>
	//    9   19:aload_0         
	//   10   20:getfield        #13  <Field zzgm zzaip>
	//   11   23:getfield        #35  <Field android.webkit.WebView zzgm.zzain>
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #13  <Field zzgm zzaip>
	//   15   31:getfield        #39  <Field boolean zzgm.zzaio>
	//   16   34:invokevirtual   #45  <Method void zzgk.zza(zzge, android.webkit.WebView, String, boolean)>
	//   17   37:return          
	}

	private final zzgm zzaip;
}
