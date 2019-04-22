// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzkc;

public final class Correlator
{

	public Correlator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzuu = new zzkc();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class zzkc>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void zzkc()>
	//    6   12:putfield        #17  <Field zzkc zzuu>
	//    7   15:return          
	}

	public final void reset()
	{
		zzuu.zzil();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzkc zzuu>
	//    2    4:invokevirtual   #22  <Method void zzkc.zzil()>
	//    3    7:return          
	}

	public final zzkc zzaz()
	{
		return zzuu;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzkc zzuu>
	//    2    4:areturn         
	}

	zzkc zzuu;
}
