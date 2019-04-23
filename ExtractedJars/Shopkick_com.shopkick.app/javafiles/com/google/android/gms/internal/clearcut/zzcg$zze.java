// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzca, zzcg, zzfl, zzck, 
//			zzdp, zzdo, zzdv, zzfq

static final class zzcg$zze
	implements zzca
{

	public final int compareTo(Object obj)
	{
		obj = ((Object) ((zzcg$zze)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class zzcg$zze>
	//    2    4:astore_1        
		return number - ((zzcg$zze) (obj)).number;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field int number>
	//    5    9:aload_1         
	//    6   10:getfield        #30  <Field int number>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	public final zzdp zza(zzdp zzdp, zzdo zzdo)
	{
		return ((zzdp) (((zzcg$zza)zzdp).zza((zzcg)zzdo)));
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class zzcg$zza>
	//    2    4:aload_2         
	//    3    5:checkcast       #9   <Class zzcg>
	//    4    8:invokevirtual   #48  <Method zzcg$zza zzcg$zza.zza(zzcg)>
	//    5   11:areturn         
	}

	public final zzdv zza(zzdv zzdv, zzdv zzdv1)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #51  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final zzfl zzau()
	{
		return zzjx;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzfl zzjx>
	//    2    4:areturn         
	}

	public final zzfq zzav()
	{
		return zzjx.zzek();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzfl zzjx>
	//    2    4:invokevirtual   #61  <Method zzfq zzfl.zzek()>
	//    3    7:areturn         
	}

	public final boolean zzaw()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean zzax()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int zzc()
	{
		return number;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int number>
	//    2    4:ireturn         
	}

	final int number = 0x3f3fd17;
	private final zzck zzjw = null;
	final zzfl zzjx;
	final boolean zzjy = false;
	final boolean zzjz = false;

	zzcg$zze(zzck zzck, int i, zzfl zzfl1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field zzck zzjw>
	//    5    9:aload_0         
	//    6   10:ldc1            #28  <Int 0x3f3fd17>
	//    7   12:putfield        #30  <Field int number>
		zzjx = zzfl1;
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:putfield        #32  <Field zzfl zzjx>
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #34  <Field boolean zzjy>
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #36  <Field boolean zzjz>
	//   17   30:return          
	}
}
