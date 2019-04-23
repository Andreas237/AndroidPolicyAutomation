// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhv, zzfk, zzjj, zzei

interface zzhw
{

	public abstract boolean equals(Object obj, Object obj1);

	public abstract int hashCode(Object obj);

	public abstract Object newInstance();

	public abstract void zza(Object obj, zzhv zzhv, zzfk zzfk)
		throws IOException;

	public abstract void zza(Object obj, zzjj zzjj)
		throws IOException;

	public abstract void zza(Object obj, byte abyte0[], int i, int j, zzei zzei)
		throws IOException;

	public abstract void zzc(Object obj, Object obj1);

	public abstract void zze(Object obj);

	public abstract int zzp(Object obj);

	public abstract boolean zzr(Object obj);
}
