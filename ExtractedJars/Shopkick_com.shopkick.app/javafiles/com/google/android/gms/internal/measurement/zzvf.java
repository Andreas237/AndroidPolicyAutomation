// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvh, zzvi, zzvg

abstract class zzvf
{

	private zzvf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	zzvf(zzvg zzvg)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zzvf()>
	//    2    4:return          
	}

	static zzvf zzxd()
	{
		return zzcaa;
	//    0    0:getstatic       #17  <Field zzvf zzcaa>
	//    1    3:areturn         
	}

	static zzvf zzxe()
	{
		return zzcab;
	//    0    0:getstatic       #22  <Field zzvf zzcab>
	//    1    3:areturn         
	}

	abstract List zza(Object obj, long l);

	abstract void zza(Object obj, Object obj1, long l);

	abstract void zzb(Object obj, long l);

	private static final zzvf zzcaa = new zzvh(((zzvg) (null)));
	private static final zzvf zzcab = new zzvi(((zzvg) (null)));

	static 
	{
	//    0    0:new             #11  <Class zzvh>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #15  <Method void zzvh(zzvg)>
	//    4    8:putstatic       #17  <Field zzvf zzcaa>
	//    5   11:new             #19  <Class zzvi>
	//    6   14:dup             
	//    7   15:aconst_null     
	//    8   16:invokespecial   #20  <Method void zzvi(zzvg)>
	//    9   19:putstatic       #22  <Field zzvf zzcab>
	//*  10   22:return          
	}
}
