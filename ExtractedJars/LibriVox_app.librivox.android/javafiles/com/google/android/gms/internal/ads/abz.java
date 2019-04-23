// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class abz
{

	public abz(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		a = new WeakReference(((Object) (view)));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void WeakReference(Object)>
	//    7   13:putfield        #19  <Field WeakReference a>
	//    8   16:return          
	}

	private final ViewTreeObserver c()
	{
		Object obj = ((Object) ((View)a.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WeakReference a>
	//    2    4:invokevirtual   #26  <Method Object WeakReference.get()>
	//    3    7:checkcast       #28  <Class View>
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

	public final void a()
	{
		ViewTreeObserver viewtreeobserver = c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method ViewTreeObserver c()>
	//    2    4:astore_1        
		if(viewtreeobserver != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			a(viewtreeobserver);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #42  <Method void a(ViewTreeObserver)>
	//    8   14:return          
	}

	protected abstract void a(ViewTreeObserver viewtreeobserver);

	public final void b()
	{
		ViewTreeObserver viewtreeobserver = c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method ViewTreeObserver c()>
	//    2    4:astore_1        
		if(viewtreeobserver != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			b(viewtreeobserver);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #45  <Method void b(ViewTreeObserver)>
	//    8   14:return          
	}

	protected abstract void b(ViewTreeObserver viewtreeobserver);

	private final WeakReference a;
}
