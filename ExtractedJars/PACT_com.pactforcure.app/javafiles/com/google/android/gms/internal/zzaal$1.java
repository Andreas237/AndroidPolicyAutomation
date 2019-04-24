// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//			zzaal

class zzaal$1
	implements com.google.android.gms.common.internal.zzm$zza
{

	public boolean isConnected()
	{
		return zzaAz.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaal zzaAz>
	//    2    4:invokevirtual   #22  <Method boolean zzaal.isConnected()>
	//    3    7:ireturn         
	}

	public Bundle zzud()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	final zzaal zzaAz;

	zzaal$1(zzaal zzaal1)
	{
		zzaAz = zzaal1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzaal zzaAz>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
