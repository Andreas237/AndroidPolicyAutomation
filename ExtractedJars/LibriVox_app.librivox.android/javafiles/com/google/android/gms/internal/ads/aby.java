// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abz

final class aby extends abz
	implements android.view.ViewTreeObserver.OnScrollChangedListener
{

	public aby(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void abz(View)>
		a = new WeakReference(((Object) (onscrollchangedlistener)));
	//    3    5:aload_0         
	//    4    6:new             #16  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #19  <Method void WeakReference(Object)>
	//    8   14:putfield        #21  <Field WeakReference a>
	//    9   17:return          
	}

	protected final void a(ViewTreeObserver viewtreeobserver)
	{
		viewtreeobserver.addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #29  <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    3    5:return          
	}

	protected final void b(ViewTreeObserver viewtreeobserver)
	{
		viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #33  <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    3    5:return          
	}

	public final void onScrollChanged()
	{
		android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = (android.view.ViewTreeObserver.OnScrollChangedListener)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WeakReference a>
	//    2    4:invokevirtual   #39  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class android.view.ViewTreeObserver$OnScrollChangedListener>
	//    4   10:astore_1        
		if(onscrollchangedlistener != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
		{
			onscrollchangedlistener.onScrollChanged();
	//    7   15:aload_1         
	//    8   16:invokeinterface #41  <Method void android.view.ViewTreeObserver$OnScrollChangedListener.onScrollChanged()>
			return;
	//    9   21:return          
		} else
		{
			((abz)this).b();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #43  <Method void abz.b()>
			return;
	//   12   26:return          
		}
	}

	private final WeakReference a;
}
