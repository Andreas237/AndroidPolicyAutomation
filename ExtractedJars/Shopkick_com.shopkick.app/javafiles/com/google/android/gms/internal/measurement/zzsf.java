// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsd, zzse

final class zzsf
	implements zzsd
{

	zzsf(zzse zzse1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbrk = zzse1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzse zzbrk>
		zzbrl = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String zzbrl>
	//    8   14:return          
	}

	public final Object zzto()
	{
		return ((Object) (zzbrk.zzfp(zzbrl)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzse zzbrk>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field String zzbrl>
	//    4    8:invokevirtual   #28  <Method String zzse.zzfp(String)>
	//    5   11:areturn         
	}

	private final zzse zzbrk;
	private final String zzbrl;
}
