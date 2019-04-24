// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaou, zzakq

final class zzaos extends zzaou
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

	public zzaos(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzaou(View)>
		zzcwm = new WeakReference(((Object) (ongloballayoutlistener)));
	//    3    5:aload_0         
	//    4    6:new             #17  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #20  <Method void WeakReference(Object)>
	//    8   14:putfield        #22  <Field WeakReference zzcwm>
	//    9   17:return          
	}

	public final void onGlobalLayout()
	{
		android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = (android.view.ViewTreeObserver.OnGlobalLayoutListener)zzcwm.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WeakReference zzcwm>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class android.view.ViewTreeObserver$OnGlobalLayoutListener>
	//    4   10:astore_1        
		if(ongloballayoutlistener != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
		{
			ongloballayoutlistener.onGlobalLayout();
	//    7   15:aload_1         
	//    8   16:invokeinterface #31  <Method void android.view.ViewTreeObserver$OnGlobalLayoutListener.onGlobalLayout()>
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
		viewtreeobserver.addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #42  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    3    5:return          
	}

	protected final void zzb(ViewTreeObserver viewtreeobserver)
	{
		zzbv.zzem().zza(viewtreeobserver, ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:invokestatic    #49  <Method zzakq zzbv.zzem()>
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:invokevirtual   #54  <Method void zzakq.zza(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    4    8:return          
	}

	private final WeakReference zzcwm;
}
