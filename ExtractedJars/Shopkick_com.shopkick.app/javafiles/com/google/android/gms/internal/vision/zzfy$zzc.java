// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhh, zzfy, zzfp, zzhf

public static class zzfy$zzc extends zzfy$zza
	implements zzhh
{

	protected final void zzfc()
	{
		if(!zzwo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean zzwo>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.zzfc();
	//    4    8:aload_0         
	//    5    9:invokespecial   #26  <Method void zzfy$zza.zzfc()>
			((zzfy$zzd)zzwn).zzwp = (zzfp)((zzfy$zzd)zzwn).zzwp.clone();
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field zzfy zzwn>
	//    8   16:checkcast       #32  <Class zzfy$zzd>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field zzfy zzwn>
	//   11   23:checkcast       #32  <Class zzfy$zzd>
	//   12   26:getfield        #36  <Field zzfp zzfy$zzd.zzwp>
	//   13   29:invokevirtual   #42  <Method Object zzfp.clone()>
	//   14   32:checkcast       #38  <Class zzfp>
	//   15   35:putfield        #36  <Field zzfp zzfy$zzd.zzwp>
			return;
	//   16   38:return          
		}
	}

	public zzfy zzfd()
	{
		return ((zzfy) ((zzfy$zzd)((zzfy$zza)this).zzff()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method zzhf zzfy$zza.zzff()>
	//    2    4:checkcast       #32  <Class zzfy$zzd>
	//    3    7:areturn         
	}

	public zzhf zzff()
	{
		if(zzwo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean zzwo>
	//*   2    4:ifeq            15
		{
			return ((zzhf) ((zzfy$zzd)zzwn));
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field zzfy zzwn>
	//    5   11:checkcast       #32  <Class zzfy$zzd>
	//    6   14:areturn         
		} else
		{
			((zzfy$zzd)zzwn).zzwp.zzci();
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field zzfy zzwn>
	//    9   19:checkcast       #32  <Class zzfy$zzd>
	//   10   22:getfield        #36  <Field zzfp zzfy$zzd.zzwp>
	//   11   25:invokevirtual   #51  <Method void zzfp.zzci()>
			return ((zzhf) ((zzfy$zzd)super.zzfd()));
	//   12   28:aload_0         
	//   13   29:invokespecial   #53  <Method zzfy zzfy$zza.zzfd()>
	//   14   32:checkcast       #32  <Class zzfy$zzd>
	//   15   35:areturn         
		}
	}

	protected zzfy$zzc(zzfy$zzd zzfy$zzd1)
	{
		super(((zzfy) (zzfy$zzd1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzfy$zza(zzfy)>
	//    3    5:return          
	}
}
