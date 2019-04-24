// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzaal

static class zzaal$zzb extends zzaar$zza
{

	public void zzvb()
	{
		zzaal zzaal1 = (zzaal)zzaAD.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WeakReference zzaAD>
	//    2    4:invokevirtual   #28  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class zzaal>
	//    4   10:astore_1        
		if(zzaal1 == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzaal.zza(zzaal1);
	//    8   16:aload_1         
	//    9   17:invokestatic    #31  <Method void zzaal.zza(zzaal)>
			return;
	//   10   20:return          
		}
	}

	private WeakReference zzaAD;

	zzaal$zzb(zzaal zzaal1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzaar$zza()>
		zzaAD = new WeakReference(((Object) (zzaal1)));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
	//    7   13:putfield        #22  <Field WeakReference zzaAD>
	//    8   16:return          
	}
}
