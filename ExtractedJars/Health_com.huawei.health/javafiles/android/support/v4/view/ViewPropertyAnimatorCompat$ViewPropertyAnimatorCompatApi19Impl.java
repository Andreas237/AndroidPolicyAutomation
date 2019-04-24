// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompatKK, ViewPropertyAnimatorUpdateListener

static class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi19Impl extends ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi18Impl
{

	public void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
	{
		ViewPropertyAnimatorCompatKK.setUpdateListener(view, viewpropertyanimatorupdatelistener);
	//    0    0:aload_2         
	//    1    1:aload_3         
	//    2    2:invokestatic    #22  <Method void ViewPropertyAnimatorCompatKK.setUpdateListener(View, ViewPropertyAnimatorUpdateListener)>
	//    3    5:return          
	}

	ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi18Impl()>
	//    2    4:return          
	}
}
