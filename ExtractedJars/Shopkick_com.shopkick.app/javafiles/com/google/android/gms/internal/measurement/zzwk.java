// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwl, zzub, zzvo, zzte

interface zzwk
{

	public abstract int getTag();

	public abstract double readDouble()
		throws IOException;

	public abstract float readFloat()
		throws IOException;

	public abstract String readString()
		throws IOException;

	public abstract void readStringList(List list)
		throws IOException;

	public abstract Object zza(zzwl zzwl, zzub zzub)
		throws IOException;

	public abstract void zza(List list, zzwl zzwl, zzub zzub)
		throws IOException;

	public abstract void zza(Map map, zzvo zzvo, zzub zzub)
		throws IOException;

	public abstract Object zzb(zzwl zzwl, zzub zzub)
		throws IOException;

	public abstract void zzb(List list, zzwl zzwl, zzub zzub)
		throws IOException;

	public abstract void zzi(List list)
		throws IOException;

	public abstract void zzj(List list)
		throws IOException;

	public abstract void zzk(List list)
		throws IOException;

	public abstract void zzl(List list)
		throws IOException;

	public abstract void zzm(List list)
		throws IOException;

	public abstract void zzn(List list)
		throws IOException;

	public abstract void zzo(List list)
		throws IOException;

	public abstract void zzp(List list)
		throws IOException;

	public abstract void zzq(List list)
		throws IOException;

	public abstract void zzr(List list)
		throws IOException;

	public abstract void zzs(List list)
		throws IOException;

	public abstract void zzt(List list)
		throws IOException;

	public abstract void zzu(List list)
		throws IOException;

	public abstract long zzuk()
		throws IOException;

	public abstract long zzul()
		throws IOException;

	public abstract int zzum()
		throws IOException;

	public abstract long zzun()
		throws IOException;

	public abstract int zzuo()
		throws IOException;

	public abstract boolean zzup()
		throws IOException;

	public abstract String zzuq()
		throws IOException;

	public abstract zzte zzur()
		throws IOException;

	public abstract int zzus()
		throws IOException;

	public abstract int zzut()
		throws IOException;

	public abstract int zzuu()
		throws IOException;

	public abstract long zzuv()
		throws IOException;

	public abstract int zzuw()
		throws IOException;

	public abstract long zzux()
		throws IOException;

	public abstract void zzv(List list)
		throws IOException;

	public abstract int zzvh()
		throws IOException;

	public abstract boolean zzvi()
		throws IOException;

	public abstract void zzw(List list)
		throws IOException;

	public abstract void zzx(List list)
		throws IOException;
}
