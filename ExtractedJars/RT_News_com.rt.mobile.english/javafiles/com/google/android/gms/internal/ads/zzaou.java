// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzaou
{

	public zzaou(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcwn = new WeakReference(((Object) (view)));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #18  <Method void WeakReference(Object)>
	//    7   13:putfield        #20  <Field WeakReference zzcwn>
	//    8   16:return          
	}

	private final ViewTreeObserver getViewTreeObserver()
	{
		Object obj = ((Object) ((View)zzcwn.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WeakReference zzcwn>
	//    2    4:invokevirtual   #27  <Method Object WeakReference.get()>
	//    3    7:checkcast       #29  <Class View>
	//    4   10:astore_1        
		if(obj == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		obj = ((Object) (((View) (obj)).getViewTreeObserver()));
	//    9   17:aload_1         
	//   10   18:invokevirtual   #31  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   11   21:astore_1        
		if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          37
		{
			if(!((ViewTreeObserver) (obj)).isAlive())
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #37  <Method boolean ViewTreeObserver.isAlive()>
	//*  16   30:ifne            35
				return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
			else
				return ((ViewTreeObserver) (obj));
	//   19   35:aload_1         
	//   20   36:areturn         
		} else
		{
			return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
		}
	}

	public final void attach()
	{
		ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method ViewTreeObserver getViewTreeObserver()>
	//    2    4:astore_1        
		if(viewtreeobserver != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			zza(viewtreeobserver);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #43  <Method void zza(ViewTreeObserver)>
	//    8   14:return          
	}

	public final void detach()
	{
		ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method ViewTreeObserver getViewTreeObserver()>
	//    2    4:astore_1        
		if(viewtreeobserver != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			zzb(viewtreeobserver);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #47  <Method void zzb(ViewTreeObserver)>
	//    8   14:return          
	}

	protected abstract void zza(ViewTreeObserver viewtreeobserver);

	protected abstract void zzb(ViewTreeObserver viewtreeobserver);

	private final WeakReference zzcwn;
}
