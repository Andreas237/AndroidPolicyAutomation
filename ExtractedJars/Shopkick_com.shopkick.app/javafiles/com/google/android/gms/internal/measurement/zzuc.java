// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzub, zzvv, zzwk, zzuf, 
//			zzxd, zzte, zzxy

abstract class zzuc
{

	zzuc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	abstract Object zza(zzub zzub, zzvv zzvv, int i);

	abstract Object zza(zzwk zzwk, Object obj, zzub zzub, zzuf zzuf, Object obj1, zzxd zzxd)
		throws IOException;

	abstract void zza(zzte zzte, Object obj, zzub zzub, zzuf zzuf)
		throws IOException;

	abstract void zza(zzwk zzwk, Object obj, zzub zzub, zzuf zzuf)
		throws IOException;

	abstract void zza(zzxy zzxy, java.util.Map.Entry entry)
		throws IOException;

	abstract int zzb(java.util.Map.Entry entry);

	abstract boolean zze(zzvv zzvv);

	abstract zzuf zzw(Object obj);

	abstract zzuf zzx(Object obj);

	abstract void zzy(Object obj);
}
