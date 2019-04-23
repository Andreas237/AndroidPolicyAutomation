// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzdq, zzcg, zzby, zzdo

public static class zzcg$zzc extends zzcg$zza
	implements zzdq
{

	protected final void zzbf()
	{
		if(!zzju)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean zzju>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.zzbf();
	//    4    8:aload_0         
	//    5    9:invokespecial   #26  <Method void zzcg$zza.zzbf()>
			((zzcg$zzd)zzjt).zzjv = (zzby)((zzcg$zzd)zzjt).zzjv.clone();
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field zzcg zzjt>
	//    8   16:checkcast       #32  <Class zzcg$zzd>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field zzcg zzjt>
	//   11   23:checkcast       #32  <Class zzcg$zzd>
	//   12   26:getfield        #36  <Field zzby zzcg$zzd.zzjv>
	//   13   29:invokevirtual   #42  <Method Object zzby.clone()>
	//   14   32:checkcast       #38  <Class zzby>
	//   15   35:putfield        #36  <Field zzby zzcg$zzd.zzjv>
			return;
	//   16   38:return          
		}
	}

	public final zzcg zzbg()
	{
		return ((zzcg) ((zzcg$zzd)((zzcg$zza)this).zzbi()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method zzdo zzcg$zza.zzbi()>
	//    2    4:checkcast       #32  <Class zzcg$zzd>
	//    3    7:areturn         
	}

	public final zzdo zzbi()
	{
		zzcg zzcg1;
		if(zzju)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean zzju>
	//*   2    4:ifeq            17
		{
			zzcg1 = zzjt;
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field zzcg zzjt>
	//    5   11:astore_1        
		} else
	//*   6   12:aload_1         
	//*   7   13:checkcast       #32  <Class zzcg$zzd>
	//*   8   16:areturn         
		{
			((zzcg$zzd)zzjt).zzjv.zzv();
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field zzcg zzjt>
	//   11   21:checkcast       #32  <Class zzcg$zzd>
	//   12   24:getfield        #36  <Field zzby zzcg$zzd.zzjv>
	//   13   27:invokevirtual   #51  <Method void zzby.zzv()>
			zzcg1 = super.zzbg();
	//   14   30:aload_0         
	//   15   31:invokespecial   #53  <Method zzcg zzcg$zza.zzbg()>
	//   16   34:astore_1        
		}
		return ((zzdo) ((zzcg$zzd)zzcg1));
	//*  17   35:goto            12
	}

	protected zzcg$zzc(zzcg$zzd zzcg$zzd1)
	{
		super(((zzcg) (zzcg$zzd1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzcg$zza(zzcg)>
	//    3    5:return          
	}
}
