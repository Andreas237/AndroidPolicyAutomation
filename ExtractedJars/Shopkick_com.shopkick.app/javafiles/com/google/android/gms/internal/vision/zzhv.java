// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhw, zzfk, zzgy, zzeo

interface zzhv
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

	public abstract Object zza(zzhw zzhw, zzfk zzfk)
		throws IOException;

	public abstract Object zza(Class class1, zzfk zzfk)
		throws IOException;

	public abstract void zza(List list)
		throws IOException;

	public abstract void zza(List list, zzhw zzhw, zzfk zzfk)
		throws IOException;

	public abstract void zza(Map map, zzgy zzgy, zzfk zzfk)
		throws IOException;

	public abstract Object zzb(Class class1, zzfk zzfk)
		throws IOException;

	public abstract void zzb(List list)
		throws IOException;

	public abstract void zzb(List list, zzhw zzhw, zzfk zzfk)
		throws IOException;

	public abstract Object zzc(zzhw zzhw, zzfk zzfk)
		throws IOException;

	public abstract void zzc(List list)
		throws IOException;

	public abstract int zzcn()
		throws IOException;

	public abstract boolean zzco()
		throws IOException;

	public abstract long zzcp()
		throws IOException;

	public abstract long zzcq()
		throws IOException;

	public abstract int zzcr()
		throws IOException;

	public abstract long zzcs()
		throws IOException;

	public abstract int zzct()
		throws IOException;

	public abstract boolean zzcu()
		throws IOException;

	public abstract String zzcv()
		throws IOException;

	public abstract zzeo zzcw()
		throws IOException;

	public abstract int zzcx()
		throws IOException;

	public abstract int zzcy()
		throws IOException;

	public abstract int zzcz()
		throws IOException;

	public abstract void zzd(List list)
		throws IOException;

	public abstract long zzda()
		throws IOException;

	public abstract int zzdb()
		throws IOException;

	public abstract long zzdc()
		throws IOException;

	public abstract void zze(List list)
		throws IOException;

	public abstract void zzf(List list)
		throws IOException;

	public abstract void zzg(List list)
		throws IOException;

	public abstract void zzh(List list)
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
}
