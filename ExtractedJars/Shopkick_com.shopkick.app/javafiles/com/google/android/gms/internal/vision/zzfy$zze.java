// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfr, zzfy, zzjd, zzgc, 
//			zzhg, zzhf, zzhm, zzji

static final class zzfy$zze
	implements zzfr
{

	public final int compareTo(Object obj)
	{
		obj = ((Object) ((zzfy$zze)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class zzfy$zze>
	//    2    4:astore_1        
		return number - ((zzfy$zze) (obj)).number;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field int number>
	//    5    9:aload_1         
	//    6   10:getfield        #30  <Field int number>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	public final zzhg zza(zzhg zzhg, zzhf zzhf)
	{
		return ((zzhg) (((zzfy$zza)zzhg).zza((zzfy)zzhf)));
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class zzfy$zza>
	//    2    4:aload_2         
	//    3    5:checkcast       #9   <Class zzfy>
	//    4    8:invokevirtual   #48  <Method zzfy$zza zzfy$zza.zza(zzfy)>
	//    5   11:areturn         
	}

	public final zzhm zza(zzhm zzhm, zzhm zzhm1)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #51  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final zzjd zzes()
	{
		return zzwr;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzjd zzwr>
	//    2    4:areturn         
	}

	public final zzji zzet()
	{
		return zzwr.zzho();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzjd zzwr>
	//    2    4:invokevirtual   #61  <Method zzji zzjd.zzho()>
	//    3    7:areturn         
	}

	public final boolean zzeu()
	{
		return zzws;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean zzws>
	//    2    4:ireturn         
	}

	public final boolean zzev()
	{
		return zzwt;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzwt>
	//    2    4:ireturn         
	}

	public final int zzr()
	{
		return number;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int number>
	//    2    4:ireturn         
	}

	final int number = 0xc0b2142;
	final zzgc zzwq = null;
	final zzjd zzwr;
	final boolean zzws = true;
	final boolean zzwt = false;

	zzfy$zze(zzgc zzgc, int i, zzjd zzjd1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field zzgc zzwq>
	//    5    9:aload_0         
	//    6   10:ldc1            #28  <Int 0xc0b2142>
	//    7   12:putfield        #30  <Field int number>
		zzwr = zzjd1;
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:putfield        #32  <Field zzjd zzwr>
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:putfield        #34  <Field boolean zzws>
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #36  <Field boolean zzwt>
	//   17   30:return          
	}
}
