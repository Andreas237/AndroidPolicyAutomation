// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			pf

final class po
	implements android.view.ViewTreeObserver.OnScrollChangedListener
{

	po(pf pf1, WeakReference weakreference)
	{
		b = pf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field pf b>
		a = weakreference;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field WeakReference a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void onScrollChanged()
	{
		pf.a(b, a, true);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field pf b>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field WeakReference a>
	//    4    8:iconst_1        
	//    5    9:invokestatic    #26  <Method void pf.a(pf, WeakReference, boolean)>
	//    6   12:return          
	}

	private final WeakReference a;
	private final pf b;
}
