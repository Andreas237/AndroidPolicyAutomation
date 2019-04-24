// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdy, zzbdr, zzbdp, zzbdq

final class zzbds extends zzbdy
{

	private zzbds(zzbdp zzbdp)
	{
		zzdyq = zzbdp;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzbdp zzdyq>
		super(zzbdp, ((zzbdq) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #14  <Method void zzbdy(zzbdp, zzbdq)>
	//    7   11:return          
	}

	zzbds(zzbdp zzbdp, zzbdq zzbdq)
	{
		this(zzbdp);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void zzbds(zzbdp)>
	//    3    5:return          
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new zzbdr(zzdyq, ((zzbdq) (null)))));
	//    0    0:new             #21  <Class zzbdr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #11  <Field zzbdp zzdyq>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #22  <Method void zzbdr(zzbdp, zzbdq)>
	//    6   12:areturn         
	}

	private final zzbdp zzdyq;
}
