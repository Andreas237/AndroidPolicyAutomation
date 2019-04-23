// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqi, bh

public final class bpb
	implements bqi
{

	public bpb(bh bh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = bh1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field bh a>
	//    5    9:return          
	}

	public final View a()
	{
		bh bh1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bh a>
	//    2    4:astore_1        
		if(bh1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return bh1.o();
	//    5    9:aload_1         
	//    6   10:invokeinterface #22  <Method View bh.o()>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public final boolean b()
	{
		return a == null;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bh a>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final bqi c()
	{
		return ((bqi) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private bh a;
}
