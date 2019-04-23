// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqi, wd

public final class bpc
	implements bqi
{

	public bpc(View view, wd wd)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field View a>
		b = wd;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field wd b>
	//    8   14:return          
	}

	public final View a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field View a>
	//    2    4:areturn         
	}

	public final boolean b()
	{
		return b == null || a == null;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field wd b>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field View a>
	//    5   11:ifnonnull       17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public final bqi c()
	{
		return ((bqi) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private final View a;
	private final wd b;
}
