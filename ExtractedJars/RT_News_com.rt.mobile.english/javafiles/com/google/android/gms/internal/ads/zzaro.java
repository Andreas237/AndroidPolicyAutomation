// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzarp, zzarq, zzarr, zzaqw

public final class zzaro
{

	private zzaro(zzarr zzarr, zzarq zzarq)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzdem = zzarq;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #21  <Field zzarq zzdem>
		zzden = zzarr;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field zzarr zzden>
	//    8   14:return          
	}

	public static zzaro zzk(zzaqw zzaqw)
	{
		return new zzaro(((zzarr) (zzaqw)), ((zzarq) (new zzarp(zzaqw))));
	//    0    0:new             #2   <Class zzaro>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #30  <Class zzarp>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #33  <Method void zzarp(zzaqw)>
	//    7   13:invokespecial   #35  <Method void zzaro(zzarr, zzarq)>
	//    8   16:areturn         
	}

	private final zzarq zzdem;
	private final zzarr zzden;
}
