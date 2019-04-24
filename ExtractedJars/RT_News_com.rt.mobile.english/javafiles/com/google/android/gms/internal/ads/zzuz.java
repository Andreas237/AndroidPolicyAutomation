// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzase, zzuv

final class zzuz
	implements zzase
{

	private zzuz(zzuv zzuv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbpl = zzuv1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzuv zzbpl>
	//    5    9:return          
	}

	static zzase zzb(zzuv zzuv1)
	{
		return ((zzase) (new zzuz(zzuv1)));
	//    0    0:new             #2   <Class zzuz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void zzuz(zzuv)>
	//    4    8:areturn         
	}

	public final void zzly()
	{
		zzbpl.zzlx();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzuv zzbpl>
	//    2    4:invokeinterface #26  <Method void zzuv.zzlx()>
	//    3    9:return          
	}

	private final zzuv zzbpl;
}
