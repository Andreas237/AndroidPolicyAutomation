// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgd, zzoz

public final class zzex
	implements zzgd
{

	public zzex(zzoz zzoz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzafm = zzoz1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzoz zzafm>
	//    5    9:return          
	}

	public final View zzgh()
	{
		if(zzafm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field zzoz zzafm>
	//*   2    4:ifnull          17
			return zzafm.zzkr();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field zzoz zzafm>
	//    5   11:invokeinterface #23  <Method View zzoz.zzkr()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public final boolean zzgi()
	{
		return zzafm == null;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzoz zzafm>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final zzgd zzgj()
	{
		return ((zzgd) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private zzoz zzafm;
}
