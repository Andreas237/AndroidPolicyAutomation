// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			re, sm, sn, abq, 
//			rc, rp

public final class rh extends re
{

	public rh(Context context, abq abq, rc rc)
	{
		super(abq, rc);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #12  <Method void re(abq, rc)>
		a = context;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #14  <Field Context a>
	//    7   11:return          
	}

	public final void a()
	{
	//    0    0:return          
	}

	public final rp d()
	{
		Context context = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context a>
	//    2    4:astore_1        
		return ((rp) (sn.a(context, sm.a(context))));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #23  <Method sm sm.a(Context)>
	//    6   10:invokestatic    #28  <Method sn sn.a(Context, sm)>
	//    7   13:areturn         
	}

	private final Context a;
}
