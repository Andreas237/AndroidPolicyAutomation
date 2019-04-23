// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqi, bpc, wd

public final class bpd
	implements bqi
{

	public bpd(View view, wd wd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = new WeakReference(((Object) (view)));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #19  <Method void WeakReference(Object)>
	//    7   13:putfield        #21  <Field WeakReference a>
		b = new WeakReference(((Object) (wd1)));
	//    8   16:aload_0         
	//    9   17:new             #16  <Class WeakReference>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:invokespecial   #19  <Method void WeakReference(Object)>
	//   13   25:putfield        #23  <Field WeakReference b>
	//   14   28:return          
	}

	public final View a()
	{
		return (View)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #31  <Class View>
	//    4   10:areturn         
	}

	public final boolean b()
	{
		return a.get() == null || b.get() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:ifnull          25
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field WeakReference b>
	//    6   14:invokevirtual   #29  <Method Object WeakReference.get()>
	//    7   17:ifnonnull       23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public final bqi c()
	{
		return ((bqi) (new bpc((View)a.get(), (wd)b.get())));
	//    0    0:new             #36  <Class bpc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field WeakReference a>
	//    4    8:invokevirtual   #29  <Method Object WeakReference.get()>
	//    5   11:checkcast       #31  <Class View>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field WeakReference b>
	//    8   18:invokevirtual   #29  <Method Object WeakReference.get()>
	//    9   21:checkcast       #38  <Class wd>
	//   10   24:invokespecial   #40  <Method void bpc(View, wd)>
	//   11   27:areturn         
	}

	private final WeakReference a;
	private final WeakReference b;
}
