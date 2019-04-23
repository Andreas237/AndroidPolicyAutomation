// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.aw;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abz, xo

final class abx extends abz
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

	public abx(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void abz(View)>
		a = new WeakReference(((Object) (ongloballayoutlistener)));
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
		viewtreeobserver.addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #29  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    3    5:return          
	}

	protected final void b(ViewTreeObserver viewtreeobserver)
	{
		aw.g().a(viewtreeobserver, ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:invokestatic    #36  <Method xo aw.g()>
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method void xo.a(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    4    8:return          
	}

	public final void onGlobalLayout()
	{
		android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = (android.view.ViewTreeObserver.OnGlobalLayoutListener)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WeakReference a>
	//    2    4:invokevirtual   #47  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class android.view.ViewTreeObserver$OnGlobalLayoutListener>
	//    4   10:astore_1        
		if(ongloballayoutlistener != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
		{
			ongloballayoutlistener.onGlobalLayout();
	//    7   15:aload_1         
	//    8   16:invokeinterface #49  <Method void android.view.ViewTreeObserver$OnGlobalLayoutListener.onGlobalLayout()>
			return;
	//    9   21:return          
		} else
		{
			((abz)this).b();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #51  <Method void abz.b()>
			return;
	//   12   26:return          
		}
	}

	private final WeakReference a;
}
