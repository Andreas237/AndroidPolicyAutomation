// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbcs, zzbdj, zzbcu

final class zzbdi
	implements zzbcs
{

	zzbdi(zzbcu zzbcu, String s, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzdwl = zzbcu;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzbcu zzdwl>
		info = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String info>
		zzdxe = new zzbdj(((Object) (zzbcu)).getClass(), s, aobj);
	//    8   14:aload_0         
	//    9   15:new             #23  <Class zzbdj>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokevirtual   #27  <Method Class Object.getClass()>
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokespecial   #30  <Method void zzbdj(Class, String, Object[])>
	//   16   28:putfield        #32  <Field zzbdj zzdxe>
	//   17   31:return          
	}

	public final int getFieldCount()
	{
		return zzbdj.zzd(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #39  <Method int zzbdj.zzd(zzbdj)>
	//    3    7:ireturn         
	}

	public final int zzaeh()
	{
		if((zzbdj.zza(zzdxe) & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field zzbdj zzdxe>
	//*   2    4:invokestatic    #43  <Method int zzbdj.zza(zzbdj)>
	//*   3    7:iconst_1        
	//*   4    8:iand            
	//*   5    9:iconst_1        
	//*   6   10:icmpne          17
			return zzbbo.zze.zzdui;
	//    7   13:getstatic       #49  <Field int zzbbo$zze.zzdui>
	//    8   16:ireturn         
		else
			return zzbbo.zze.zzduj;
	//    9   17:getstatic       #52  <Field int zzbbo$zze.zzduj>
	//   10   20:ireturn         
	}

	public final boolean zzaei()
	{
		return (zzbdj.zza(zzdxe) & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #43  <Method int zzbdj.zza(zzbdj)>
	//    3    7:iconst_2        
	//    4    8:iand            
	//    5    9:iconst_2        
	//    6   10:icmpne          15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public final zzbcu zzaej()
	{
		return zzdwl;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzbcu zzdwl>
	//    2    4:areturn         
	}

	final zzbdj zzaeq()
	{
		return zzdxe;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:areturn         
	}

	public final int zzaer()
	{
		return zzbdj.zzb(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #62  <Method int zzbdj.zzb(zzbdj)>
	//    3    7:ireturn         
	}

	public final int zzaes()
	{
		return zzbdj.zzc(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #66  <Method int zzbdj.zzc(zzbdj)>
	//    3    7:ireturn         
	}

	public final int zzaet()
	{
		return zzbdj.zze(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #70  <Method int zzbdj.zze(zzbdj)>
	//    3    7:ireturn         
	}

	public final int zzaeu()
	{
		return zzbdj.zzf(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #74  <Method int zzbdj.zzf(zzbdj)>
	//    3    7:ireturn         
	}

	final int[] zzaev()
	{
		return zzbdj.zzg(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #80  <Method int[] zzbdj.zzg(zzbdj)>
	//    3    7:areturn         
	}

	public final int zzaew()
	{
		return zzbdj.zzh(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #84  <Method int zzbdj.zzh(zzbdj)>
	//    3    7:ireturn         
	}

	public final int zzaex()
	{
		return zzbdj.zzi(zzdxe);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbdj zzdxe>
	//    2    4:invokestatic    #88  <Method int zzbdj.zzi(zzbdj)>
	//    3    7:ireturn         
	}

	private final String info;
	private final zzbcu zzdwl;
	private final zzbdj zzdxe;
}
