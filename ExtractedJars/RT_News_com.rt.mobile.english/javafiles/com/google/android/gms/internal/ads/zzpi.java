// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpf, zzaqw, zzacm

final class zzpi
	implements zzv
{

	zzpi(zzpf zzpf1, zzacm zzacm1)
	{
		zzbjj = zzpf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzpf zzbjj>
		zzbji = zzacm1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field zzacm zzbji>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(Object obj, Map map)
	{
		obj = ((Object) ((zzaqw)zzpf.zza(zzbjj).get()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzpf zzbjj>
	//    2    4:invokestatic    #28  <Method WeakReference zzpf.zza(zzpf)>
	//    3    7:invokevirtual   #34  <Method Object WeakReference.get()>
	//    4   10:checkcast       #36  <Class zzaqw>
	//    5   13:astore_1        
		if(obj == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       31
		{
			zzbji.zzb("/showOverlay", ((zzv) (this)));
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field zzacm zzbji>
	//   10   22:ldc1            #38  <String "/showOverlay">
	//   11   24:aload_0         
	//   12   25:invokeinterface #44  <Method void zzacm.zzb(String, zzv)>
			return;
	//   13   30:return          
		} else
		{
			((zzaqw) (obj)).getView().setVisibility(0);
	//   14   31:aload_1         
	//   15   32:invokeinterface #48  <Method View zzaqw.getView()>
	//   16   37:iconst_0        
	//   17   38:invokevirtual   #54  <Method void View.setVisibility(int)>
			return;
	//   18   41:return          
		}
	}

	private final zzacm zzbji;
	private final zzpf zzbjj;
}
