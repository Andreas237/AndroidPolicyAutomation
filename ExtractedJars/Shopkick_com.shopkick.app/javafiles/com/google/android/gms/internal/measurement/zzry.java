// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsd, zzrx

final class zzry
	implements zzsd
{

	zzry(zzrx zzrx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbrh = zzrx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzrx zzbrh>
	//    5    9:return          
	}

	public final Object zzto()
	{
		return ((Object) (zzbrh.zztn()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzrx zzbrh>
	//    2    4:invokevirtual   #24  <Method java.util.Map zzrx.zztn()>
	//    3    7:areturn         
	}

	private final zzrx zzbrh;
}
