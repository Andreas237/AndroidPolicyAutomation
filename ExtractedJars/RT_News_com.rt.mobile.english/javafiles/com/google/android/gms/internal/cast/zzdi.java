// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;


// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdm, zzdh

final class zzdi
	implements zzdm
{

	zzdi(zzdh zzdh1, zzdm zzdm1)
	{
		zzxl = zzdh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzdh zzxl>
		zzxk = zzdm1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzdm zzxk>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(long l, int i, Object obj)
	{
		if(i == 15)
	//*   0    0:iload_3         
	//*   1    1:bipush          15
	//*   2    3:icmpne          13
			zzdh.zza(zzxl);
	//    3    6:aload_0         
	//    4    7:getfield        #14  <Field zzdh zzxl>
	//    5   10:invokestatic    #27  <Method void zzdh.zza(zzdh)>
		if(zzxk != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #16  <Field zzdm zzxk>
	//*   8   17:ifnull          33
			zzxk.zza(l, i, obj);
	//    9   20:aload_0         
	//   10   21:getfield        #16  <Field zzdm zzxk>
	//   11   24:lload_1         
	//   12   25:iload_3         
	//   13   26:aload           4
	//   14   28:invokeinterface #29  <Method void zzdm.zza(long, int, Object)>
	//   15   33:return          
	}

	public final void zzb(long l)
	{
		if(zzxk != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzdm zzxk>
	//*   2    4:ifnull          17
			zzxk.zzb(l);
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field zzdm zzxk>
	//    5   11:lload_1         
	//    6   12:invokeinterface #33  <Method void zzdm.zzb(long)>
	//    7   17:return          
	}

	private final zzdm zzxk;
	private final zzdh zzxl;
}
