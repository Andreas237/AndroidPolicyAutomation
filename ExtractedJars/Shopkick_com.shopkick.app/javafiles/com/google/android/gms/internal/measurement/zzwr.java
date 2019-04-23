// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwx, zzwq, zzwo, zzwp

final class zzwr extends zzwx
{

	private zzwr(zzwo zzwo)
	{
		zzcby = zzwo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzwo zzcby>
		super(zzwo, ((zzwp) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #14  <Method void zzwx(zzwo, zzwp)>
	//    7   11:return          
	}

	zzwr(zzwo zzwo, zzwp zzwp)
	{
		this(zzwo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void zzwr(zzwo)>
	//    3    5:return          
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new zzwq(zzcby, ((zzwp) (null)))));
	//    0    0:new             #21  <Class zzwq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #11  <Field zzwo zzcby>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #22  <Method void zzwq(zzwo, zzwp)>
	//    6   12:areturn         
	}

	private final zzwo zzcby;
}
