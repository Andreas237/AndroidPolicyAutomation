// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzri, zzp, zzrh

public final class zzrj
{

	private zzrj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzboz = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field Map zzboz>
	//    7   15:return          
	}

	zzrj(zzrh zzrh)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void zzrj()>
	//    2    4:return          
	}

	public final zzrj zzb(String s, zzp zzp)
	{
		zzboz.put(((Object) (s)), ((Object) (zzp)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map zzboz>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final zzrj zzm(zzp zzp)
	{
		zzbfs = zzp;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field zzp zzbfs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzri zzta()
	{
		return new zzri(zzboz, zzbfs, ((zzrh) (null)));
	//    0    0:new             #38  <Class zzri>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map zzboz>
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field zzp zzbfs>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #41  <Method void zzri(Map, zzp, zzrh)>
	//    8   16:areturn         
	}

	private zzp zzbfs;
	private final Map zzboz;
}
