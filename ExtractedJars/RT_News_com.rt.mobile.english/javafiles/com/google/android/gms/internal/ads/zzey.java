// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgd, zzajh

public final class zzey
	implements zzgd
{

	public zzey(View view, zzajh zzajh)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field View mView>
		zzafn = zzajh;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field zzajh zzafn>
	//    8   14:return          
	}

	public final View zzgh()
	{
		return mView;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View mView>
	//    2    4:areturn         
	}

	public final boolean zzgi()
	{
		return zzafn == null || mView == null;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzajh zzafn>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field View mView>
	//    5   11:ifnonnull       17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public final zzgd zzgj()
	{
		return ((zzgd) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private final View mView;
	private final zzajh zzafn;
}
