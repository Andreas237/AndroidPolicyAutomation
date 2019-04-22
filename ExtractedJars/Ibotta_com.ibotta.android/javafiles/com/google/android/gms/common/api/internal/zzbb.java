// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzav

final class zzbb extends GooglePlayServicesUpdatedReceiver.Callback
{

	zzbb(zzav zzav1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void GooglePlayServicesUpdatedReceiver$Callback()>
		zziy = new WeakReference(((Object) (zzav1)));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void WeakReference(Object)>
	//    7   13:putfield        #19  <Field WeakReference zziy>
	//    8   16:return          
	}

	public final void zzv()
	{
		zzav zzav1 = (zzav)zziy.get();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WeakReference zziy>
	//    2    4:invokevirtual   #25  <Method Object WeakReference.get()>
	//    3    7:checkcast       #27  <Class zzav>
	//    4   10:astore_1        
		if(zzav1 == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzav.zza(zzav1);
	//    8   16:aload_1         
	//    9   17:invokestatic    #30  <Method void zzav.zza(zzav)>
			return;
	//   10   20:return          
		}
	}

	private WeakReference zziy;
}
