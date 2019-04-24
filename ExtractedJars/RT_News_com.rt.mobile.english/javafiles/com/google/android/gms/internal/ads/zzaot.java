// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaou

final class zzaot extends zzaou
	implements android.view.ViewTreeObserver.OnScrollChangedListener
{

	public zzaot(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzaou(View)>
		zzcwm = new WeakReference(((Object) (onscrollchangedlistener)));
	//    3    5:aload_0         
	//    4    6:new             #17  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #20  <Method void WeakReference(Object)>
	//    8   14:putfield        #22  <Field WeakReference zzcwm>
	//    9   17:return          
	}

	public final void onScrollChanged()
	{
		android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = (android.view.ViewTreeObserver.OnScrollChangedListener)zzcwm.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WeakReference zzcwm>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class android.view.ViewTreeObserver$OnScrollChangedListener>
	//    4   10:astore_1        
		if(onscrollchangedlistener != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
		{
			onscrollchangedlistener.onScrollChanged();
	//    7   15:aload_1         
	//    8   16:invokeinterface #31  <Method void android.view.ViewTreeObserver$OnScrollChangedListener.onScrollChanged()>
			return;
	//    9   21:return          
		} else
		{
			((zzaou)this).detach();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #34  <Method void zzaou.detach()>
			return;
	//   12   26:return          
		}
	}

	protected final void zza(ViewTreeObserver viewtreeobserver)
	{
		viewtreeobserver.addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #42  <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    3    5:return          
	}

	protected final void zzb(ViewTreeObserver viewtreeobserver)
	{
		viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #46  <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    3    5:return          
	}

	private final WeakReference zzcwm;
}
