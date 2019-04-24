// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzaat

static class zzaat$zzb extends zzaaz$zza
{

	public void zzvE()
	{
		zzaat zzaat1 = (zzaat)zzaCc.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WeakReference zzaCc>
	//    2    4:invokevirtual   #28  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class zzaat>
	//    4   10:astore_1        
		if(zzaat1 == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzaat.zza(zzaat1);
	//    8   16:aload_1         
	//    9   17:invokestatic    #31  <Method void zzaat.zza(zzaat)>
			return;
	//   10   20:return          
		}
	}

	private WeakReference zzaCc;

	zzaat$zzb(zzaat zzaat1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzaaz$zza()>
		zzaCc = new WeakReference(((Object) (zzaat1)));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
	//    7   13:putfield        #22  <Field WeakReference zzaCc>
	//    8   16:return          
	}
}
